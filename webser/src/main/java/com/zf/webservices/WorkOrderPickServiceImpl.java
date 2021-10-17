package com.zf.webservices;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @创建时间：2021/7/1
 * @描述
 */
public class WorkOrderPickServiceImpl implements WorkOrderPickService{
    @Override
    public String TestMethod(String jsonStr, String jsonArrayStr, String jsonArrayStr2) {
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        JSONArray jsonArray = JSONArray.fromObject(jsonArrayStr);
        BaseBean base=new BaseBean();
        RecordSet rs=new RecordSet();
        WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[36];
        // region  ...WorkflowRequestTableField字段
        wrti[0] = new WorkflowRequestTableField();
        wrti[0].setFieldName("htbbh1");//同步erp状态
        wrti[0].setFieldValue(jsonObject.getString("tbERP"));
        wrti[0].setView(true);//字段是否可见
        wrti[0].setEdit(true);//字段是否可编辑

        wrti[1] = new WorkflowRequestTableField();
        wrti[1].setFieldName("htbbh1");//申请理由
        wrti[1].setFieldValue(jsonObject.getString("note1"));
        wrti[1].setView(true);//字段是否可见
        wrti[1].setEdit(true);//字段是否可编辑

        wrti[2] = new WorkflowRequestTableField();
        wrti[2].setFieldName("htbbh1");//是否是刀具
        wrti[2].setFieldValue(jsonObject.getString("sfbhdj"));
        wrti[2].setView(true);//字段是否可见
        wrti[2].setEdit(true);//字段是否可编辑

        wrti[3] = new WorkflowRequestTableField();
        wrti[3].setFieldName("htbbh1");//类型
        wrti[3].setFieldValue(jsonObject.getString("CLASS_TYPE_ID"));
        wrti[3].setView(true);//字段是否可见
        wrti[3].setEdit(true);//字段是否可编辑

        wrti[4] = new WorkflowRequestTableField();
        wrti[4].setFieldName("htbbh1");//币种
        wrti[4].setFieldValue(jsonObject.getString("CURRENCY"));
        wrti[4].setView(true);//字段是否可见
        wrti[4].setEdit(true);//字段是否可编辑

        wrti[5] = new WorkflowRequestTableField();
        wrti[5].setFieldName("htbbh1");//流程编号
        wrti[5].setFieldValue(jsonObject.getString("lcbh"));
        wrti[5].setView(true);//字段是否可见
        wrti[5].setEdit(true);//字段是否可编辑

        wrti[6] = new WorkflowRequestTableField();
        wrti[6].setFieldName("htbbh1");//单据编号
        wrti[6].setFieldValue(jsonObject.getString("BILLNO"));
        wrti[6].setView(true);//字段是否可见
        wrti[6].setEdit(true);//字段是否可编辑

        wrti[7] = new WorkflowRequestTableField();
        wrti[7].setFieldName("htbbh1");//状态
        wrti[7].setFieldValue(jsonObject.getString("FLAG"));
        wrti[7].setView(true);//字段是否可见
        wrti[7].setEdit(true);//字段是否可编辑

        wrti[8] = new WorkflowRequestTableField();
        wrti[8].setFieldName("htbbh1");//申请人分部
        wrti[8].setFieldValue(jsonObject.getString("sqrfb"));
        wrti[8].setView(true);//字段是否可见
        wrti[8].setEdit(true);//字段是否可编辑

        wrti[9] = new WorkflowRequestTableField();
        wrti[9].setFieldName("htbbh1");//单据头ID
        wrti[9].setFieldValue(jsonObject.getString("HEADER_ID"));
        wrti[9].setView(true);//字段是否可见
        wrti[9].setEdit(true);//字段是否可编辑

        wrti[10] = new WorkflowRequestTableField();
        wrti[10].setFieldName("htbbh1");//项目ID
        wrti[10].setFieldValue(jsonObject.getString("PROJECT_ID"));
        wrti[10].setView(true);//字段是否可见
        wrti[10].setEdit(true);//字段是否可编辑

        wrti[11] = new WorkflowRequestTableField();
        wrti[11].setFieldName("htbbh1");//申请人部门
        wrti[11].setFieldValue(jsonObject.getString("sqrbm"));
        wrti[11].setView(true);//字段是否可见
        wrti[11].setEdit(true);//字段是否可编辑

        wrti[12] = new WorkflowRequestTableField();
        wrti[12].setFieldName("htbbh1");//业务实体ID
        wrti[12].setFieldValue(jsonObject.getString("FOU"));
        wrti[12].setView(true);//字段是否可见
        wrti[12].setEdit(true);//字段是否可编辑

        wrti[13] = new WorkflowRequestTableField();
        wrti[13].setFieldName("htbbh1");//制造号
        wrti[13].setFieldValue(jsonObject.getString("PROJECT_NUMBER"));
        wrti[13].setView(true);//字段是否可见
        wrti[13].setEdit(true);//字段是否可编辑

        wrti[14] = new WorkflowRequestTableField();
        wrti[14].setFieldName("htbbh1");// 业务实体
        wrti[14].setFieldValue(jsonObject.getString("FOU_NAME"));
        wrti[14].setView(true);//字段是否可见
        wrti[14].setEdit(true);//字段是否可编辑

        wrti[15] = new WorkflowRequestTableField();
        wrti[15].setFieldName("htbbh1");//项目名称
        wrti[15].setFieldValue(jsonObject.getString("PROJECT_NAME"));
        wrti[15].setView(true);//字段是否可见
        wrti[15].setEdit(true);//字段是否可编辑

        wrti[16] = new WorkflowRequestTableField();
        wrti[16].setFieldName("htbbh1");//库存组织
        wrti[16].setFieldValue(jsonObject.getString("FINV_NAME"));
        wrti[16].setView(true);//字段是否可见
        wrti[16].setEdit(true);//字段是否可编辑

        wrti[17] = new WorkflowRequestTableField();
        wrti[17].setFieldName("htbbh1");//部件ID
        wrti[17].setFieldValue(jsonObject.getString("TASK_ID"));
        wrti[17].setView(true);//字段是否可见
        wrti[17].setEdit(true);//字段是否可编辑

        wrti[18] = new WorkflowRequestTableField();
        wrti[18].setFieldName("htbbh1");//收单地点
        wrti[18].setFieldValue(jsonObject.getString("FDES_NAME"));
        wrti[18].setView(true);//字段是否可见
        wrti[18].setEdit(true);//字段是否可编辑

        wrti[19] = new WorkflowRequestTableField();
        wrti[19].setFieldName("htbbh1");//部件号(物资采购)
        wrti[19].setFieldValue(jsonObject.getString("TASK_NUMBER"));
        wrti[19].setView(true);//字段是否可见
        wrti[19].setEdit(true);//字段是否可编辑

        wrti[20] = new WorkflowRequestTableField();
        wrti[20].setFieldName("htbbh1");//收单地点ID
        wrti[20].setFieldValue(jsonObject.getString("FDES"));
        wrti[20].setView(true);//字段是否可见
        wrti[20].setEdit(true);//字段是否可编辑

        wrti[21] = new WorkflowRequestTableField();
        wrti[21].setFieldName("htbbh1");//申请人
        wrti[21].setFieldValue(jsonObject.getString("CREATE_BY"));
        wrti[21].setView(true);//字段是否可见
        wrti[21].setEdit(true);//字段是否可编辑

        wrti[22] = new WorkflowRequestTableField();
        wrti[22].setFieldName("htbbh1");//申请人(废)
        wrti[22].setFieldValue(jsonObject.getString("REQUEST_BY_NAME"));
        wrti[22].setView(true);//字段是否可见
        wrti[22].setEdit(true);//字段是否可编辑

        wrti[23] = new WorkflowRequestTableField();
        wrti[23].setFieldName("htbbh1");//创建人员工号
        wrti[23].setFieldValue(jsonObject.getString("REQUEST_BY"));
        wrti[23].setView(true);//字段是否可见
        wrti[23].setEdit(true);//字段是否可编辑

        wrti[24] = new WorkflowRequestTableField();
        wrti[24].setFieldName("htbbh1");//申请原因
        wrti[24].setFieldValue(jsonObject.getString("NOTE"));
        wrti[24].setView(true);//字段是否可见
        wrti[24].setEdit(true);//字段是否可编辑

        wrti[25] = new WorkflowRequestTableField();
        wrti[25].setFieldName("htbbh1");//部件名称
        wrti[25].setFieldValue(jsonObject.getString("TASK_NAME"));
        wrti[25].setView(true);//字段是否可见
        wrti[25].setEdit(true);//字段是否可编辑

        wrti[26] = new WorkflowRequestTableField();
        wrti[26].setFieldName("htbbh1");//库存组织ID
        wrti[26].setFieldValue(jsonObject.getString("FINV"));
        wrti[26].setView(true);//字段是否可见
        wrti[26].setEdit(true);//字段是否可编辑

        wrti[27] = new WorkflowRequestTableField();
        wrti[27].setFieldName("htbbh1");//是否项目需求
        wrti[27].setFieldValue(jsonObject.getString("sfxmxq"));
        wrti[27].setView(true);//字段是否可见
        wrti[27].setEdit(true);//字段是否可编辑

        wrti[28] = new WorkflowRequestTableField();
        wrti[28].setFieldName("htbbh1");//申请时间
        wrti[28].setFieldValue(jsonObject.getString("sqsj"));
        wrti[28].setView(true);//字段是否可见
        wrti[28].setEdit(true);//字段是否可编辑

        wrti[29] = new WorkflowRequestTableField();
        wrti[29].setFieldName("htbbh1");//员工号
        wrti[29].setFieldValue(jsonObject.getString("loganid"));
        wrti[29].setView(true);//字段是否可见
        wrti[29].setEdit(true);//字段是否可编辑

        wrti[30] = new WorkflowRequestTableField();
        wrti[30].setFieldName("htbbh1");//姓名
        wrti[30].setFieldValue(jsonObject.getString("loganname"));
        wrti[30].setView(true);//字段是否可见
        wrti[30].setEdit(true);//字段是否可编辑

        wrti[31] = new WorkflowRequestTableField();
        wrti[31].setFieldName("htbbh1");//部件名称(废)
        wrti[31].setFieldValue(jsonObject.getString("TASK_NAME2"));
        wrti[31].setView(true);//字段是否可见
        wrti[31].setEdit(true);//字段是否可编辑

        wrti[32] = new WorkflowRequestTableField();
        wrti[32].setFieldName("htbbh1");//部件ID(废
        wrti[32].setFieldValue(jsonObject.getString("TASK_ID2"));
        wrti[32].setView(true);//字段是否可见
        wrti[32].setEdit(true);//字段是否可编辑

        wrti[33] = new WorkflowRequestTableField();
        wrti[33].setFieldName("htbbh1");//类型
        wrti[33].setFieldValue(jsonObject.getString("lx"));
        wrti[33].setView(true);//字段是否可见
        wrti[33].setEdit(true);//字段是否可编辑

        wrti[34] = new WorkflowRequestTableField();
        wrti[34].setFieldName("htbbh1");//领用原因
        wrti[34].setFieldValue(jsonObject.getString("lyyy"));
        wrti[34].setView(true);//字段是否可见
        wrti[34].setEdit(true);//字段是否可编辑

        wrti[35] = new WorkflowRequestTableField();
        wrti[35].setFieldName("htbbh1");//相关流程
        wrti[35].setFieldValue(jsonObject.getString("xglc"));
        wrti[35].setView(true);//字段是否可见
        wrti[35].setEdit(true);//字段是否可编辑

        wrti[36] = new WorkflowRequestTableField();
        wrti[36].setFieldName("htbbh1");//相关附件
        wrti[36].setFieldValue(jsonObject.getString("xgfj"));
        wrti[36].setView(true);//字段是否可见
        wrti[36].setEdit(true);//字段是否可编辑

        wrti[37] = new WorkflowRequestTableField();
        wrti[37].setFieldName("htbbh1");//设备资源
        wrti[37].setFieldValue(jsonObject.getString("sbzy"));
        wrti[37].setView(true);//字段是否可见
        wrti[37].setEdit(true);//字段是否可编辑

        wrti[38] = new WorkflowRequestTableField();
        wrti[38].setFieldName("htbbh1");//部件号1
        wrti[38].setFieldValue(jsonObject.getString("bjh1"));
        wrti[38].setView(true);//字段是否可见
        wrti[38].setEdit(true);//字段是否可编辑

        wrti[39] = new WorkflowRequestTableField();
        wrti[39].setFieldName("htbbh1");//部件号(废)
        wrti[39].setFieldValue(jsonObject.getString("bjh"));
        wrti[39].setView(true);//字段是否可见
        wrti[39].setEdit(true);//字段是否可编辑

        wrti[40] = new WorkflowRequestTableField();
        wrti[40].setFieldName("htbbh1");//领料账户
        wrti[40].setFieldValue(jsonObject.getString("llyh"));
        wrti[40].setView(true);//字段是否可见
        wrti[40].setEdit(true);//字段是否可编辑

        wrti[41] = new WorkflowRequestTableField();
        wrti[41].setFieldName("htbbh1");//领用部门
        wrti[41].setFieldValue(jsonObject.getString("lybm"));
        wrti[41].setView(true);//字段是否可见
        wrti[41].setEdit(true);//字段是否可编辑

        wrti[42] = new WorkflowRequestTableField();
        wrti[42].setFieldName("htbbh1");//领料人
        wrti[42].setFieldValue(jsonObject.getString("llr"));
        wrti[42].setView(true);//字段是否可见
        wrti[42].setEdit(true);//字段是否可编辑

        wrti[43] = new WorkflowRequestTableField();
        wrti[43].setFieldName("htbbh1");//部件号
        wrti[43].setFieldValue(jsonObject.getString("bjh2"));
        wrti[43].setView(true);//字段是否可见
        wrti[43].setEdit(true);//字段是否可编辑

        wrti[44] = new WorkflowRequestTableField();
        wrti[44].setFieldName("htbbh1");//单据头ID
        wrti[44].setFieldValue(jsonObject.getString("HEADER_ID"));
        wrti[44].setView(true);//字段是否可见
        wrti[44].setEdit(true);//字段是否可编辑

        wrti[45] = new WorkflowRequestTableField();
        wrti[45].setFieldName("htbbh1");//单据行ID
        wrti[45].setFieldValue(jsonObject.getString("LINE_ID"));
        wrti[45].setView(true);//字段是否可见
        wrti[45].setEdit(true);//字段是否可编辑

        wrti[46] = new WorkflowRequestTableField();
        wrti[46].setFieldName("htbbh1");//物料编号
        wrti[46].setFieldValue(jsonObject.getString("SEGMENT1"));
        wrti[46].setView(true);//字段是否可见
        wrti[46].setEdit(true);//字段是否可编辑

        wrti[47] = new WorkflowRequestTableField();
        wrti[47].setFieldName("htbbh1");//物料ID(废)
        wrti[47].setFieldValue(jsonObject.getString("ITEM_ID"));
        wrti[47].setView(true);//字段是否可见
        wrti[47].setEdit(true);//字段是否可编辑

        wrti[48] = new WorkflowRequestTableField();
        wrti[48].setFieldName("htbbh1");//物料名称
        wrti[48].setFieldValue(jsonObject.getString("DESCRIPTION"));
        wrti[48].setView(true);//字段是否可见
        wrti[48].setEdit(true);//字段是否可编辑

        wrti[49] = new WorkflowRequestTableField();
        wrti[49].setFieldName("htbbh1");//规格型号(废)
        wrti[49].setFieldValue(jsonObject.getString("GUIGE"));
        wrti[49].setView(true);//字段是否可见
        wrti[49].setEdit(true);//字段是否可编辑

        wrti[50] = new WorkflowRequestTableField();
        wrti[50].setFieldName("htbbh1");//国号国标(废)
        wrti[50].setFieldValue(jsonObject.getString("GUOBIAO"));
        wrti[50].setView(true);//字段是否可见
        wrti[50].setEdit(true);//字段是否可编辑

        wrti[51] = new WorkflowRequestTableField();
        wrti[51].setFieldName("htbbh1");//单位(废)
        wrti[51].setFieldValue(jsonObject.getString("UOM_CODE"));
        wrti[51].setView(true);//字段是否可见
        wrti[51].setEdit(true);//字段是否可编辑

        wrti[52] = new WorkflowRequestTableField();
        wrti[52].setFieldName("htbbh1");//领料数量
        wrti[52].setFieldValue(jsonObject.getString("QUANTITY"));
        wrti[52].setView(true);//字段是否可见
        wrti[52].setEdit(true);//字段是否可编辑

        wrti[53] = new WorkflowRequestTableField();
        wrti[53].setFieldName("htbbh1");//需求日期
        wrti[53].setFieldValue(jsonObject.getString("NEED_DATE"));
        wrti[53].setView(true);//字段是否可见
        wrti[53].setEdit(true);//字段是否可编辑

        wrti[54] = new WorkflowRequestTableField();
        wrti[54].setFieldName("htbbh1");//状态
        wrti[54].setFieldValue(jsonObject.getString("FLAG1"));
        wrti[54].setView(true);//字段是否可见
        wrti[54].setEdit(true);//字段是否可编辑

        wrti[55] = new WorkflowRequestTableField();
        wrti[55].setFieldName("htbbh1");//说明
        wrti[55].setFieldValue(jsonObject.getString("note"));
        wrti[55].setView(true);//字段是否可见
        wrti[55].setEdit(true);//字段是否可编辑

        wrti[56] = new WorkflowRequestTableField();
        wrti[56].setFieldName("htbbh1");//历史平均价格(废)
        wrti[56].setFieldValue(jsonObject.getString("item_cost"));
        wrti[56].setView(true);//字段是否可见
        wrti[56].setEdit(true);//字段是否可编辑

        wrti[57] = new WorkflowRequestTableField();
        wrti[57].setFieldName("htbbh1");//物料名称
        wrti[57].setFieldValue(jsonObject.getString("DESCRIPTION1"));
        wrti[57].setView(true);//字段是否可见
        wrti[57].setEdit(true);//字段是否可编辑

        wrti[58] = new WorkflowRequestTableField();
        wrti[58].setFieldName("htbbh1");//规格型号
        wrti[58].setFieldValue(jsonObject.getString("GUIGE1"));
        wrti[58].setView(true);//字段是否可见
        wrti[58].setEdit(true);//字段是否可编辑

        wrti[59] = new WorkflowRequestTableField();
        wrti[59].setFieldName("htbbh1");//国号国标
        wrti[59].setFieldValue(jsonObject.getString("GUOBIAO1"));
        wrti[59].setView(true);//字段是否可见
        wrti[59].setEdit(true);//字段是否可编辑

        wrti[60] = new WorkflowRequestTableField();
        wrti[60].setFieldName("htbbh1");//单位
        wrti[60].setFieldValue(jsonObject.getString("UOM_CODE1"));
        wrti[60].setView(true);//字段是否可见
        wrti[60].setEdit(true);//字段是否可编辑

        wrti[61] = new WorkflowRequestTableField();
        wrti[61].setFieldName("htbbh1");//历史平均价格
        wrti[61].setFieldValue(jsonObject.getString("item_cost1"));
        wrti[61].setView(true);//字段是否可见
        wrti[61].setEdit(true);//字段是否可编辑

        wrti[62] = new WorkflowRequestTableField();
        wrti[62].setFieldName("htbbh1");//物料ID
        wrti[62].setFieldValue(jsonObject.getString("ITEM_ID1"));
        wrti[62].setView(true);//字段是否可见
        wrti[62].setEdit(true);//字段是否可编辑

        wrti[63] = new WorkflowRequestTableField();
        wrti[63].setFieldName("htbbh1");//物料编号(废)
        wrti[63].setFieldValue(jsonObject.getString("wlbh"));
        wrti[63].setView(true);//字段是否可见
        wrti[63].setEdit(true);//字段是否可编辑

        wrti[64] = new WorkflowRequestTableField();
        wrti[64].setFieldName("htbbh1");//领料仓库
        wrti[64].setFieldValue(jsonObject.getString("ck1"));
        wrti[64].setView(true);//字段是否可见
        wrti[64].setEdit(true);//字段是否可编辑

        wrti[65] = new WorkflowRequestTableField();
        wrti[65].setFieldName("htbbh1");//仓库代码ID
        wrti[65].setFieldValue(jsonObject.getString("ckID"));
        wrti[65].setView(true);//字段是否可见
        wrti[65].setEdit(true);//字段是否可编辑

        wrti[66] = new WorkflowRequestTableField();
        wrti[66].setFieldName("htbbh1");//仓库代码ID1
        wrti[66].setFieldValue(jsonObject.getString("ckID1"));
        wrti[66].setView(true);//字段是否可见
        wrti[66].setEdit(true);//字段是否可编辑

        wrti[67] = new WorkflowRequestTableField();
        wrti[67].setFieldName("htbbh1");//材质
        wrti[67].setFieldValue(jsonObject.getString("cz"));
        wrti[67].setView(true);//字段是否可见
        wrti[67].setEdit(true);//字段是否可编辑

        wrti[68] = new WorkflowRequestTableField();
        wrti[68].setFieldName("htbbh1");//设备资源
        wrti[68].setFieldValue(jsonObject.getString("sbzy"));
        wrti[68].setView(true);//字段是否可见
        wrti[68].setEdit(true);//字段是否可编辑

        wrti[69] = new WorkflowRequestTableField();
        wrti[69].setFieldName("htbbh1");//现有量
        wrti[69].setFieldValue(jsonObject.getString("xyl1"));
        wrti[69].setView(true);//字段是否可见
        wrti[69].setEdit(true);//字段是否可编辑

        wrti[70] = new WorkflowRequestTableField();
        wrti[70].setFieldName("htbbh1");//是否是设备资源
        wrti[70].setFieldValue(jsonObject.getString("sfssbzy"));
        wrti[70].setView(true);//字段是否可见
        wrti[70].setEdit(true);//字段是否可编辑

        wrti[71] = new WorkflowRequestTableField();
        wrti[71].setFieldName("htbbh1");//领取数量
        wrti[71].setFieldValue(jsonObject.getString("lqsl"));
        wrti[71].setView(true);//字段是否可见
        wrti[71].setEdit(true);//字段是否可编辑
        // endregion
        WorkflowRequestTableRecord[] wrtri = new WorkflowRequestTableRecord[1];//主字段只有一行数据
        wrtri[0] = new WorkflowRequestTableRecord();
        wrtri[0].setWorkflowRequestTableFields(wrti);
        return null;
    }
}
