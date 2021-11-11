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
 * @创建时间：2021/11/1
 * @描述 MES同步错误查询数据处理 Mes_synDao
 */
@WebServlet("/getMeserr")
public class Mes_synServer extends HttpServlet {
    List rs = null;//10条数据结果
    double totalPage = 1;//总页数
    //通过持久层，拿到数据
    private Mes_synDao mes_synDao = (Mes_synDao) DaoFactory.getDao("Mes_synDao");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //请求交给get处理
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置响应头，告诉浏览器数据类型为json。utf-8
        resp.setContentType("application/json;charset=utf-8");
        resp.setHeader("Access-Control-Allow-Origin", "*");
        //页面刚开始默认0 ，大于0，小于=0，就是没有
        int page = 0;
        String NO = req.getParameter("NO");
        String SEGMENT1 = req.getParameter("SEGMENT1");
        String WIP_ENTITY_NAME = req.getParameter("WIP_ENTITY_NAME");
        String datebeg = req.getParameter("beg");//开始和结束
        String dateend = req.getParameter("end");
        if (req.getParameter("page") != null && !req.getParameter("page").equals(""))
            page = Integer.parseInt(req.getParameter("page"));
        //数据汇总
        try {
            int count = mes_synDao.getCount(NO, SEGMENT1, WIP_ENTITY_NAME,datebeg,dateend);
            int st = (page - 1) * 15;
            int end = (page * 15) > count ? count : (page * 15);
            rs = mes_synDao.getAll(NO, SEGMENT1, WIP_ENTITY_NAME, st, end,datebeg,dateend);
            System.out.println("数据总量" + count);
            totalPage = Math.ceil((count * 1.0) / 15) == 0 ? 1 : Math.ceil((count * 1.0) / 15);//总页数
        } catch (Exception e) {
            e.printStackTrace();
        }
        //传值 将输入值传回去显示
        req.setAttribute("NO", NO);
        req.setAttribute("SEGMENT1", SEGMENT1);
        req.setAttribute("WIP_ENTITY_NAME", WIP_ENTITY_NAME);
        req.setAttribute("beg", datebeg);
        req.setAttribute("end", dateend);
        req.setAttribute("Messyn", rs);//向前台传回列表的值
        req.setAttribute("page", page);//当前页 默认为一
        req.setAttribute("totalPage", (int) totalPage);//总页数
        req.getRequestDispatcher("Mes_syn.jsp").forward(req, resp);//请求转发
    }
}
