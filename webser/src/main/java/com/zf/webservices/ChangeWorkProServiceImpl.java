package com.zf.webservices;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.weaver.general.BaseBean;
import weaver.conn.RecordSet;
import weaver.workflow.webservices.*;

/**
 * @����ʱ�䣺2021/6/25
 * @���� oa�Ĵ��Ĳ���ebs�������ݸ�ʽΪjson
 */
public class ChangeWorkProServiceImpl implements ChangeWorkProService {
    @Override
    //fromObject����ֻ�������������  workflowbaseinfo��������
    public String TestMethod(String jsonStr, String jsonArrayStr) {
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        JSONArray jsonArray = JSONArray.fromObject(jsonArrayStr);
        BaseBean base=new BaseBean();
        base.writeLog("json����1"+jsonObject+"json����2"+jsonArray);//��΢�ģ�����Ӧ����д����־
        RecordSet rs=new RecordSet();
        WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[31];//�ֶ�
        // region ...�ֶ�

        // endregion
        return null
    }
}
