package com.zf.action;

import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.general.StaticObj;
import weaver.general.Util;
import weaver.interfaces.datasource.DataSource;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * @����ʱ�䣺2021/7/1
 * @���� ���¹������� oaͬ����mes
 */
public class UpdateStatusPick implements Action{
    //basebeanͳһ����������json
    @Override
    public String execute(RequestInfo requestInfo) {
        BaseBean base=new BaseBean();
        RecordSet recordSet=new RecordSet();
        DataSource ds = (DataSource)StaticObj.getServiceByFullname(("datasource.ERP"),DataSource.class);
        Connection conn = null;
        recordSet.executeUpdate(sql,requestId);
        try {
            conn=ds.getConnection();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return SUCCESS;
    }
}
}
