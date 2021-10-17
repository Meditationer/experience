package dao;

import model.Materiel;
import utils.BeanHandler;
import utils.JdbcTemplate;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 * @����ʱ�䣺2021/4/7
 * @���� ���ϱ����ݿ�������־ò�
 */
public class MaterielDao implements BaseDao {
    public List getAll(String ITEM_NO,String GRAPHIC_NO,String MATERIAL_TYPE,int st,int end,String DESCRIPTION,String SPECIFICATION1,String organization) throws Exception {
        //������ѭ����ƴ�� object...params
        String sql = "SELECT * FROM (SELECT rs.*, ROWNUM as rn FROM (SELECT * FROM cux_items_YD_v WHERE 1=1 ";
        //sqlƴ�� ǰ�����Ĺ��ˣ�����""ֵ���е�ֵַ
        sql += " and organization ="+"'"+organization+"'";
        if (ITEM_NO != null && !ITEM_NO.equals(""))
            sql += " and ITEM_NO like "+"'%" + ITEM_NO + "%'";
        if (GRAPHIC_NO != null && !GRAPHIC_NO.equals(""))
            sql += " and GRAPHIC_NO like "+"'%" + GRAPHIC_NO + "%'";
        if (MATERIAL_TYPE != null && !MATERIAL_TYPE.equals(""))
            sql += " and MATERIAL_TYPE like "+"'%" + MATERIAL_TYPE + "%'";
        if (DESCRIPTION != null && !DESCRIPTION.equals(""))
            sql += " and DESCRIPTION like "+"'%" + DESCRIPTION + "%'";
        if (SPECIFICATION1 != null && !SPECIFICATION1.equals(""))
            sql += " and SPECIFICATION1 like "+"'%" + SPECIFICATION1 + "%'";
        sql += " ) rs WHERE ROWNUM <= "+end+")"+"WHERE rn> "+st;
        List rs=JdbcTemplate.queryList(sql);
        System.out.println("��ѯ���"+sql);
        return rs;
    }
    public List getresult(String ITEM_NO,String GRAPHIC_NO,String MATERIAL_TYPE,String DESCRIPTION,String SPECIFICATION1,String organization) throws Exception {
        //������ѭ����ƴ�� object...params
        String sql = "SELECT * FROM cux_items_YD_v WHERE 1=1 ";
        //sqlƴ�� ǰ�����Ĺ��ˣ�����""ֵ���е�ֵַ
        sql += " and organization ="+"'"+organization+"'";
        if (ITEM_NO != null && !ITEM_NO.equals(""))
            sql += " and ITEM_NO like "+"'%" + ITEM_NO + "%'";
        if (GRAPHIC_NO != null && !GRAPHIC_NO.equals(""))
            sql += " and GRAPHIC_NO like "+"'%" + GRAPHIC_NO + "%'";
        if (MATERIAL_TYPE != null && !MATERIAL_TYPE.equals(""))
            sql += " and MATERIAL_TYPE like "+"'%" + MATERIAL_TYPE + "%'";
        if (DESCRIPTION != null && !DESCRIPTION.equals(""))
            sql += " and DESCRIPTION like "+"'%" + DESCRIPTION + "%'";
        if (SPECIFICATION1 != null && !SPECIFICATION1.equals(""))
            sql += " and SPECIFICATION1 like "+"'%" + SPECIFICATION1 + "%'";
        List rs=JdbcTemplate.queryList(sql);
        System.out.println("��ѯ���"+sql);
        return rs;
    }
    public int getCount(String ITEM_NO,String GRAPHIC_NO,String MATERIAL_TYPE,String DESCRIPTION,String SPECIFICATION1,String organization) throws Exception {
        String sql = "select count(1) from cux_items_YD_v WHERE 1=1";
        sql += " and organization = "+"'"+organization+"'";
        if (ITEM_NO != null && !ITEM_NO.equals(""))
            sql += " and ITEM_NO like "+"'%" + ITEM_NO + "%'";
        if (GRAPHIC_NO != null && !GRAPHIC_NO.equals(""))
            sql += " and GRAPHIC_NO like "+"'%" + GRAPHIC_NO + "%'";
        if (MATERIAL_TYPE != null && !MATERIAL_TYPE.equals(""))
            sql += " and MATERIAL_TYPE like "+"'%" + MATERIAL_TYPE + "%'";
        if (DESCRIPTION != null && !DESCRIPTION.equals(""))
            sql += " and DESCRIPTION like "+"'%" + DESCRIPTION + "%'";
        if (SPECIFICATION1 != null && !SPECIFICATION1.equals(""))
            sql += " and SPECIFICATION1 like "+"'%" + SPECIFICATION1 + "%'";
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
