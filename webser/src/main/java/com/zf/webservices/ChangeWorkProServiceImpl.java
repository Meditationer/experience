package com.zf.webservices;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.weaver.general.BaseBean;
import weaver.conn.RecordSet;
import weaver.workflow.webservices.*;

/**
 * @创建时间：2021/6/25
 * @描述 oa的串改并，ebs传入数据格式为json
 */
public class ChangeWorkProServiceImpl implements ChangeWorkProService {
    @Override
    //fromObject方法只有上面这个包有  workflowbaseinfo流程类型
    public String TestMethod(String jsonStr, String jsonArrayStr) {
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        JSONArray jsonArray = JSONArray.fromObject(jsonArrayStr);
        BaseBean base=new BaseBean();
        base.writeLog("json参数1"+jsonObject+"json参数2"+jsonArray);//泛微的，功能应该是写入日志
        RecordSet rs=new RecordSet();
        WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[31];//字段
        // region ...字段

        // endregion
        return null
    }
}
