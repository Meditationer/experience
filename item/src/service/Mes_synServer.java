package service;

import dao.Mes_synDao;
import factory.DaoFactory;
import sun.util.calendar.BaseCalendar;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.SimpleFormatter;

/**
 * @����ʱ�䣺2021/11/1
 * @���� MESͬ�������ѯ���ݴ��� Mes_synDao
 */
@WebServlet("/getMeserr")
public class Mes_synServer extends HttpServlet {
    List rs = null;//10�����ݽ��
    double totalPage = 1;//��ҳ��
    //ͨ���־ò㣬�õ�����
    private Mes_synDao mes_synDao = (Mes_synDao) DaoFactory.getDao("Mes_synDao");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //���󽻸�get����
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //������Ӧͷ�������������������Ϊjson��utf-8
        resp.setContentType("application/json;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        //ҳ��տ�ʼĬ��0 ������0��С��=0������û��
        int page = 0;
        String NO = req.getParameter("NO");
        String SEGMENT1 = req.getParameter("SEGMENT1");
        String WIP_ENTITY_NAME = req.getParameter("WIP_ENTITY_NAME");
        String datebeg = req.getParameter("beg");//��ʼ�ͽ���
        String dateend = req.getParameter("end");
        if (req.getParameter("page") != null && !req.getParameter("page").equals(""))
            page = Integer.parseInt(req.getParameter("page"));
        //���ݻ���
        try {
            int count = mes_synDao.getCount(NO, SEGMENT1, WIP_ENTITY_NAME,datebeg,dateend);
            int st = (page - 1) * 15;
            int end = (page * 15) > count ? count : (page * 15);
            rs = mes_synDao.getAll(NO, SEGMENT1, WIP_ENTITY_NAME, st, end,datebeg,dateend);
            System.out.println("��������" + count);
            totalPage = Math.ceil((count * 1.0) / 15) == 0 ? 1 : Math.ceil((count * 1.0) / 15);//��ҳ��
        } catch (Exception e) {
            e.printStackTrace();
        }
        //��ֵ ������ֵ����ȥ��ʾ
        req.setAttribute("NO", NO);
        req.setAttribute("SEGMENT1", SEGMENT1);
        req.setAttribute("WIP_ENTITY_NAME", WIP_ENTITY_NAME);
        req.setAttribute("beg", datebeg);
        req.setAttribute("end", dateend);
        req.setAttribute("Messyn", rs);//��ǰ̨�����б��ֵ
        req.setAttribute("page", page);//��ǰҳ Ĭ��Ϊһ
        req.setAttribute("totalPage", (int) totalPage);//��ҳ��
        req.getRequestDispatcher("Mes_syn.jsp").forward(req, resp);//����ת��
    }
}
