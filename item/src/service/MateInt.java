package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.MaterielDao;
import factory.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @创建时间：2021/4/26
 * @描述
 */
@WebServlet("/MateInt")
public class MateInt extends HttpServlet {
    //通过持久层，拿到数据
    private MaterielDao materielDao= (MaterielDao) DaoFactory.getDao("MaterielDao");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求交给get处理
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应头，告诉浏览器数据类型为json。utf-8
        resp.setContentType("application/json;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "https://www.aliwork.com");//前台发送的是预检查请求
        resp.setHeader("Access-Control-Allow-Credentials", "true");//允许前端带认证cookie
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type,X-Requested-With");// 提示OPTIONS预检时，后端需要设置的两个常用自定义头
        PrintWriter out = resp.getWriter();
        //请求处理 中文乱码
        String ITEM_NO= req.getParameter("ITEM_NO");
        String GRAPHIC_NO =req.getParameter("GRAPHIC_NO");
        String MATERIAL_TYPE=req.getParameter("MATERIAL_TYPE");
        String DESCRIPTION=req.getParameter("DESCRIPTION");
        String SPECIFICATION1=req.getParameter("SPECIFICATION1");
        String organization = req.getParameter("organization");
        List rs = null;//本地数据
        String rsJson="";//前端data
        String yidaData="";// //数据格式处理，处理后宜搭无需数据处理.约定
        //数据汇总
        try {
            rs = materielDao.getresult(ITEM_NO,GRAPHIC_NO,MATERIAL_TYPE,DESCRIPTION,SPECIFICATION1,organization);
            ObjectMapper mapper = new ObjectMapper();
            rsJson = mapper.writeValueAsString(rs);
        } catch (Exception e) {
            yidaData="{"+"\"success\": false,"+"\"error\": \"数据请求失败\""+"}";
            e.printStackTrace();
        }

        yidaData="{"+"\"success\": true,"+"\"content\":"+rsJson+",}";
        //传值 将输入值传回去显示
        req.setAttribute("materiel", yidaData);//向前台传回列表的值
        out.println(rsJson);
    }
}
