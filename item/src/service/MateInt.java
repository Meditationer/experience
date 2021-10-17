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
 * @����ʱ�䣺2021/4/26
 * @����
 */
@WebServlet("/MateInt")
public class MateInt extends HttpServlet {
    //ͨ���־ò㣬�õ�����
    private MaterielDao materielDao= (MaterielDao) DaoFactory.getDao("MaterielDao");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //���󽻸�get����
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //������Ӧͷ�������������������Ϊjson��utf-8
        resp.setContentType("application/json;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "https://www.aliwork.com");//ǰ̨���͵���Ԥ�������
        resp.setHeader("Access-Control-Allow-Credentials", "true");//����ǰ�˴���֤cookie
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type,X-Requested-With");// ��ʾOPTIONSԤ��ʱ�������Ҫ���õ����������Զ���ͷ
        PrintWriter out = resp.getWriter();
        //������ ��������
        String ITEM_NO= req.getParameter("ITEM_NO");
        String GRAPHIC_NO =req.getParameter("GRAPHIC_NO");
        String MATERIAL_TYPE=req.getParameter("MATERIAL_TYPE");
        String DESCRIPTION=req.getParameter("DESCRIPTION");
        String SPECIFICATION1=req.getParameter("SPECIFICATION1");
        String organization = req.getParameter("organization");
        List rs = null;//��������
        String rsJson="";//ǰ��data
        String yidaData="";// //���ݸ�ʽ����������˴��������ݴ���.Լ��
        //���ݻ���
        try {
            rs = materielDao.getresult(ITEM_NO,GRAPHIC_NO,MATERIAL_TYPE,DESCRIPTION,SPECIFICATION1,organization);
            ObjectMapper mapper = new ObjectMapper();
            rsJson = mapper.writeValueAsString(rs);
        } catch (Exception e) {
            yidaData="{"+"\"success\": false,"+"\"error\": \"��������ʧ��\""+"}";
            e.printStackTrace();
        }

        yidaData="{"+"\"success\": true,"+"\"content\":"+rsJson+",}";
        //��ֵ ������ֵ����ȥ��ʾ
        req.setAttribute("materiel", yidaData);//��ǰ̨�����б��ֵ
        out.println(rsJson);
    }
}
