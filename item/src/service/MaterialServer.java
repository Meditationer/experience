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
 * @����ʱ�䣺2021/4/7
 * @���� ҵ��㴦���൱��ctroller ��������������ע��ķ�ʽ����
 */
@WebServlet("/getMater")
public class MaterialServer extends HttpServlet {

    //ͨ���־ò㣬�õ�����
    private MaterielDao materielDao= (MaterielDao)DaoFactory.getDao("MaterielDao");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //���󽻸�get����
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List rs=null;//10�����ݽ��
        double totalPage =1;//��ҳ��
        //������Ӧͷ�������������������Ϊjson��utf-8
        resp.setContentType("application/json;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        //������ ��������
        int page = 1;
        String ITEM_NO= req.getParameter("ITEM_NO");
        String GRAPHIC_NO =req.getParameter("GRAPHIC_NO");
        String MATERIAL_TYPE=req.getParameter("MATERIAL_TYPE");
        String DESCRIPTION=req.getParameter("DESCRIPTION");
        String SPECIFICATION1=req.getParameter("SPECIFICATION1");
        String organization = req.getParameter("organization");
        if (req.getParameter("page")!=null && !req.getParameter("page").equals(""))
            page=Integer.parseInt(req.getParameter("page"));
        //���ݻ���
        try {
            int count = materielDao.getCount(ITEM_NO,GRAPHIC_NO,MATERIAL_TYPE,DESCRIPTION,SPECIFICATION1,organization);
            int st = (page-1)*15;
            int end = (page*15)>count?count:(page*15);
            rs = materielDao.getAll(ITEM_NO,GRAPHIC_NO,MATERIAL_TYPE,st,end,DESCRIPTION,SPECIFICATION1,organization);
            System.out.println("��������"+count);
            totalPage=Math.ceil((count*1.0)/15)==0?1:Math.ceil((count*1.0)/15);//��ҳ��
        } catch (Exception e) {
            e.printStackTrace();
        }
        //��ֵ ������ֵ����ȥ��ʾ
        req.setAttribute("ITEM_NO",ITEM_NO);
        req.setAttribute("GRAPHIC_NO",GRAPHIC_NO);
        req.setAttribute("MATERIAL_TYPE",MATERIAL_TYPE);
        req.setAttribute("DESCRIPTION",DESCRIPTION);
        req.setAttribute("SPECIFICATION1",SPECIFICATION1);
        req.setAttribute("organization", organization);//��ǰ̨�����б��ֵ
        req.setAttribute("materiel", rs);//��ǰ̨�����б��ֵ
        req.setAttribute("page",page);//��ǰҳ Ĭ��Ϊһ
        req.setAttribute("totalPage", (int) totalPage);//��ҳ��
        req.getRequestDispatcher("index.jsp").forward(req,resp);//����ת��
    }
}
