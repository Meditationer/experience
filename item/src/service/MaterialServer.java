package service;

import dao.MaterielDao;
import factory.DaoFactory;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.List;

/**
 * @创建时间：2021/4/7
 * @描述 业务层处理，相当于ctroller 可以无需配置用注解的方式进行
 */
@WebServlet("/getMater")
public class MaterialServer extends HttpServlet {

    //通过持久层，拿到数据
    private MaterielDao materielDao= (MaterielDao)DaoFactory.getDao("MaterielDao");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求交给get处理
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List rs=null;//10条数据结果
        double totalPage =1;//总页数
        //设置响应头，告诉浏览器数据类型为json。utf-8
        resp.setContentType("application/json;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        //请求处理 中文乱码
        int page = 1;
        String ITEM_NO= req.getParameter("ITEM_NO");
        String GRAPHIC_NO =req.getParameter("GRAPHIC_NO");
        String MATERIAL_TYPE=req.getParameter("MATERIAL_TYPE");
        String DESCRIPTION=req.getParameter("DESCRIPTION");
        String SPECIFICATION1=req.getParameter("SPECIFICATION1");
        String organization = req.getParameter("organization");
        if (req.getParameter("page")!=null && !req.getParameter("page").equals(""))
            page=Integer.parseInt(req.getParameter("page"));
        //数据汇总
        try {
            int count = materielDao.getCount(ITEM_NO,GRAPHIC_NO,MATERIAL_TYPE,DESCRIPTION,SPECIFICATION1,organization);
            int st = (page-1)*15;
            int end = (page*15)>count?count:(page*15);
            rs = materielDao.getAll(ITEM_NO,GRAPHIC_NO,MATERIAL_TYPE,st,end,DESCRIPTION,SPECIFICATION1,organization);
            System.out.println("数据总量"+count);
            totalPage=Math.ceil((count*1.0)/15)==0?1:Math.ceil((count*1.0)/15);//总页数
        } catch (Exception e) {
            e.printStackTrace();
        }
        //传值 将输入值传回去显示
        req.setAttribute("ITEM_NO",ITEM_NO);
        req.setAttribute("GRAPHIC_NO",GRAPHIC_NO);
        req.setAttribute("MATERIAL_TYPE",MATERIAL_TYPE);
        req.setAttribute("DESCRIPTION",DESCRIPTION);
        req.setAttribute("SPECIFICATION1",SPECIFICATION1);
        req.setAttribute("organization", organization);//向前台传回列表的值
        req.setAttribute("materiel", rs);//向前台传回列表的值
        req.setAttribute("page",page);//当前页 默认为一
        req.setAttribute("totalPage", (int) totalPage);//总页数
        req.getRequestDispatcher("index.jsp").forward(req,resp);//请求转发
    }
}
