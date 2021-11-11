package dao;

import model.Mes_syn;
import org.apache.commons.dbutils.QueryRunner;
import utils.BetterBeanListHandle;
import utils.JdbcTemplate;
import utils.JdbcUtils;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

/**
 * @创建时间：2021/11/1
 * @描述  MES同步错误
 */
public class Mes_synDao implements BaseDao {
    //显示数据
    public List getAll(String NO, String SEGMENT1, String WIP_ENTITY_NAME, int st, int end, String datebeg, String dateend) throws Exception {
        String sql = "select * FROM (select ROWNUM rn,cmd.CREATION_DATE,cmd.ERROR_TYPE,cmd.CREATE_DATE,cmd.PROCESS_DATE,cmd.NO,cmd.ERROR_COUNT,cmd.ERROR_MESSAGE,cmd.STATUS,cmd.SEGMENT1,cmd.WIP_ENTITY_NAME from cux_mes_data_error_v cmd where 1=1";
        if (NO != null && !NO.equals(""))
            sql += " and cmd.NO like"+"'%" + NO + "%'";
        if (SEGMENT1 != null && !SEGMENT1.equals(""))
            sql += " and cmd.SEGMENT1 like "+"'%" + SEGMENT1 + "%'";
        if (WIP_ENTITY_NAME != null && !WIP_ENTITY_NAME.equals(""))
            sql += " and cmd.WIP_ENTITY_NAME like "+"'%" + WIP_ENTITY_NAME + "%'";
        if (datebeg != null && !datebeg.equals(""))
            sql += " and cmd.CREATION_DATE >="+"'" + datebeg+ "'";
        if (dateend != null && !dateend.equals(""))
            sql += " and cmd.CREATION_DATE <="+"'" + dateend+ "'";
        sql += ") rs WHERE  rs.rn >" + st + " and rs.rn <= "+end;
    //自动打开关闭连接池
        List<Mes_syn> rs =JdbcUtils.qr.query(sql, new BetterBeanListHandle<Mes_syn>(Mes_syn.class));
       // System.out.println("查询语句"+sql);
        return rs;
    }
    //数据总量
    public int getCount(String NO, String SEGMENT1, String WIP_ENTITY_NAME,String datebeg,String dateend) throws Exception {
        String sql = "select count(1) from cux_mes_data_error_v cmd where 1=1";
        if (NO != null && !NO.equals(""))
            sql += " and cmd.NO like"+"'%" + NO + "%'";
        if (SEGMENT1 != null && !SEGMENT1.equals(""))
            sql += " and cmd.SEGMENT1 like "+"'%" + SEGMENT1 + "%'";
        if (WIP_ENTITY_NAME != null && !WIP_ENTITY_NAME.equals(""))
            sql += " and cmd.WIP_ENTITY_NAME like "+"'%" + WIP_ENTITY_NAME + "%'";
        if (datebeg != null && !datebeg.equals(""))
            sql += " and cmd.CREATION_DATE >="+"'" + datebeg+ "'";
        if (dateend != null && !dateend.equals(""))
            sql += " and cmd.CREATION_DATE <="+"'" + dateend+ "'";
        int rs=JdbcTemplate.queryCount(sql);
        return rs;
    }
    @Override
    public Object getById(Integer id) throws Exception {
        return null;
    }

    @Override
    public int deleteById(Integer id) throws Exception {
        return 0;
    }

    @Override
    public int insert(Object o) throws Exception {
        return 0;
    }

    @Override
    public int update(Object o) throws Exception {
        return 0;
    }
}
