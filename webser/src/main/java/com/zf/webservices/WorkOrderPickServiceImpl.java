package com.zf.webservices;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @����ʱ�䣺2021/7/1
 * @����
 */
public class WorkOrderPickServiceImpl implements WorkOrderPickService{
    @Override
    public String TestMethod(String jsonStr, String jsonArrayStr, String jsonArrayStr2) {
        JSONObject jsonObject = JSONObject.fromObject(jsonStr);
        JSONArray jsonArray = JSONArray.fromObject(jsonArrayStr);
        BaseBean base=new BaseBean();
        RecordSet rs=new RecordSet();
        WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[36];
        // region  ...WorkflowRequestTableField�ֶ�
        wrti[0] = new WorkflowRequestTableField();
        wrti[0].setFieldName("htbbh1");//ͬ��erp״̬
        wrti[0].setFieldValue(jsonObject.getString("tbERP"));
        wrti[0].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[0].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[1] = new WorkflowRequestTableField();
        wrti[1].setFieldName("htbbh1");//��������
        wrti[1].setFieldValue(jsonObject.getString("note1"));
        wrti[1].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[1].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[2] = new WorkflowRequestTableField();
        wrti[2].setFieldName("htbbh1");//�Ƿ��ǵ���
        wrti[2].setFieldValue(jsonObject.getString("sfbhdj"));
        wrti[2].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[2].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[3] = new WorkflowRequestTableField();
        wrti[3].setFieldName("htbbh1");//����
        wrti[3].setFieldValue(jsonObject.getString("CLASS_TYPE_ID"));
        wrti[3].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[3].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[4] = new WorkflowRequestTableField();
        wrti[4].setFieldName("htbbh1");//����
        wrti[4].setFieldValue(jsonObject.getString("CURRENCY"));
        wrti[4].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[4].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[5] = new WorkflowRequestTableField();
        wrti[5].setFieldName("htbbh1");//���̱��
        wrti[5].setFieldValue(jsonObject.getString("lcbh"));
        wrti[5].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[5].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[6] = new WorkflowRequestTableField();
        wrti[6].setFieldName("htbbh1");//���ݱ��
        wrti[6].setFieldValue(jsonObject.getString("BILLNO"));
        wrti[6].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[6].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[7] = new WorkflowRequestTableField();
        wrti[7].setFieldName("htbbh1");//״̬
        wrti[7].setFieldValue(jsonObject.getString("FLAG"));
        wrti[7].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[7].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[8] = new WorkflowRequestTableField();
        wrti[8].setFieldName("htbbh1");//�����˷ֲ�
        wrti[8].setFieldValue(jsonObject.getString("sqrfb"));
        wrti[8].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[8].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[9] = new WorkflowRequestTableField();
        wrti[9].setFieldName("htbbh1");//����ͷID
        wrti[9].setFieldValue(jsonObject.getString("HEADER_ID"));
        wrti[9].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[9].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[10] = new WorkflowRequestTableField();
        wrti[10].setFieldName("htbbh1");//��ĿID
        wrti[10].setFieldValue(jsonObject.getString("PROJECT_ID"));
        wrti[10].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[10].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[11] = new WorkflowRequestTableField();
        wrti[11].setFieldName("htbbh1");//�����˲���
        wrti[11].setFieldValue(jsonObject.getString("sqrbm"));
        wrti[11].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[11].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[12] = new WorkflowRequestTableField();
        wrti[12].setFieldName("htbbh1");//ҵ��ʵ��ID
        wrti[12].setFieldValue(jsonObject.getString("FOU"));
        wrti[12].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[12].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[13] = new WorkflowRequestTableField();
        wrti[13].setFieldName("htbbh1");//�����
        wrti[13].setFieldValue(jsonObject.getString("PROJECT_NUMBER"));
        wrti[13].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[13].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[14] = new WorkflowRequestTableField();
        wrti[14].setFieldName("htbbh1");// ҵ��ʵ��
        wrti[14].setFieldValue(jsonObject.getString("FOU_NAME"));
        wrti[14].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[14].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[15] = new WorkflowRequestTableField();
        wrti[15].setFieldName("htbbh1");//��Ŀ����
        wrti[15].setFieldValue(jsonObject.getString("PROJECT_NAME"));
        wrti[15].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[15].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[16] = new WorkflowRequestTableField();
        wrti[16].setFieldName("htbbh1");//�����֯
        wrti[16].setFieldValue(jsonObject.getString("FINV_NAME"));
        wrti[16].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[16].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[17] = new WorkflowRequestTableField();
        wrti[17].setFieldName("htbbh1");//����ID
        wrti[17].setFieldValue(jsonObject.getString("TASK_ID"));
        wrti[17].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[17].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[18] = new WorkflowRequestTableField();
        wrti[18].setFieldName("htbbh1");//�յ��ص�
        wrti[18].setFieldValue(jsonObject.getString("FDES_NAME"));
        wrti[18].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[18].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[19] = new WorkflowRequestTableField();
        wrti[19].setFieldName("htbbh1");//������(���ʲɹ�)
        wrti[19].setFieldValue(jsonObject.getString("TASK_NUMBER"));
        wrti[19].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[19].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[20] = new WorkflowRequestTableField();
        wrti[20].setFieldName("htbbh1");//�յ��ص�ID
        wrti[20].setFieldValue(jsonObject.getString("FDES"));
        wrti[20].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[20].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[21] = new WorkflowRequestTableField();
        wrti[21].setFieldName("htbbh1");//������
        wrti[21].setFieldValue(jsonObject.getString("CREATE_BY"));
        wrti[21].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[21].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[22] = new WorkflowRequestTableField();
        wrti[22].setFieldName("htbbh1");//������(��)
        wrti[22].setFieldValue(jsonObject.getString("REQUEST_BY_NAME"));
        wrti[22].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[22].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[23] = new WorkflowRequestTableField();
        wrti[23].setFieldName("htbbh1");//������Ա����
        wrti[23].setFieldValue(jsonObject.getString("REQUEST_BY"));
        wrti[23].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[23].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[24] = new WorkflowRequestTableField();
        wrti[24].setFieldName("htbbh1");//����ԭ��
        wrti[24].setFieldValue(jsonObject.getString("NOTE"));
        wrti[24].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[24].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[25] = new WorkflowRequestTableField();
        wrti[25].setFieldName("htbbh1");//��������
        wrti[25].setFieldValue(jsonObject.getString("TASK_NAME"));
        wrti[25].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[25].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[26] = new WorkflowRequestTableField();
        wrti[26].setFieldName("htbbh1");//�����֯ID
        wrti[26].setFieldValue(jsonObject.getString("FINV"));
        wrti[26].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[26].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[27] = new WorkflowRequestTableField();
        wrti[27].setFieldName("htbbh1");//�Ƿ���Ŀ����
        wrti[27].setFieldValue(jsonObject.getString("sfxmxq"));
        wrti[27].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[27].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[28] = new WorkflowRequestTableField();
        wrti[28].setFieldName("htbbh1");//����ʱ��
        wrti[28].setFieldValue(jsonObject.getString("sqsj"));
        wrti[28].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[28].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[29] = new WorkflowRequestTableField();
        wrti[29].setFieldName("htbbh1");//Ա����
        wrti[29].setFieldValue(jsonObject.getString("loganid"));
        wrti[29].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[29].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[30] = new WorkflowRequestTableField();
        wrti[30].setFieldName("htbbh1");//����
        wrti[30].setFieldValue(jsonObject.getString("loganname"));
        wrti[30].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[30].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[31] = new WorkflowRequestTableField();
        wrti[31].setFieldName("htbbh1");//��������(��)
        wrti[31].setFieldValue(jsonObject.getString("TASK_NAME2"));
        wrti[31].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[31].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[32] = new WorkflowRequestTableField();
        wrti[32].setFieldName("htbbh1");//����ID(��
        wrti[32].setFieldValue(jsonObject.getString("TASK_ID2"));
        wrti[32].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[32].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[33] = new WorkflowRequestTableField();
        wrti[33].setFieldName("htbbh1");//����
        wrti[33].setFieldValue(jsonObject.getString("lx"));
        wrti[33].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[33].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[34] = new WorkflowRequestTableField();
        wrti[34].setFieldName("htbbh1");//����ԭ��
        wrti[34].setFieldValue(jsonObject.getString("lyyy"));
        wrti[34].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[34].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[35] = new WorkflowRequestTableField();
        wrti[35].setFieldName("htbbh1");//�������
        wrti[35].setFieldValue(jsonObject.getString("xglc"));
        wrti[35].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[35].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[36] = new WorkflowRequestTableField();
        wrti[36].setFieldName("htbbh1");//��ظ���
        wrti[36].setFieldValue(jsonObject.getString("xgfj"));
        wrti[36].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[36].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[37] = new WorkflowRequestTableField();
        wrti[37].setFieldName("htbbh1");//�豸��Դ
        wrti[37].setFieldValue(jsonObject.getString("sbzy"));
        wrti[37].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[37].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[38] = new WorkflowRequestTableField();
        wrti[38].setFieldName("htbbh1");//������1
        wrti[38].setFieldValue(jsonObject.getString("bjh1"));
        wrti[38].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[38].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[39] = new WorkflowRequestTableField();
        wrti[39].setFieldName("htbbh1");//������(��)
        wrti[39].setFieldValue(jsonObject.getString("bjh"));
        wrti[39].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[39].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[40] = new WorkflowRequestTableField();
        wrti[40].setFieldName("htbbh1");//�����˻�
        wrti[40].setFieldValue(jsonObject.getString("llyh"));
        wrti[40].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[40].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[41] = new WorkflowRequestTableField();
        wrti[41].setFieldName("htbbh1");//���ò���
        wrti[41].setFieldValue(jsonObject.getString("lybm"));
        wrti[41].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[41].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[42] = new WorkflowRequestTableField();
        wrti[42].setFieldName("htbbh1");//������
        wrti[42].setFieldValue(jsonObject.getString("llr"));
        wrti[42].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[42].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[43] = new WorkflowRequestTableField();
        wrti[43].setFieldName("htbbh1");//������
        wrti[43].setFieldValue(jsonObject.getString("bjh2"));
        wrti[43].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[43].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[44] = new WorkflowRequestTableField();
        wrti[44].setFieldName("htbbh1");//����ͷID
        wrti[44].setFieldValue(jsonObject.getString("HEADER_ID"));
        wrti[44].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[44].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[45] = new WorkflowRequestTableField();
        wrti[45].setFieldName("htbbh1");//������ID
        wrti[45].setFieldValue(jsonObject.getString("LINE_ID"));
        wrti[45].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[45].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[46] = new WorkflowRequestTableField();
        wrti[46].setFieldName("htbbh1");//���ϱ��
        wrti[46].setFieldValue(jsonObject.getString("SEGMENT1"));
        wrti[46].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[46].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[47] = new WorkflowRequestTableField();
        wrti[47].setFieldName("htbbh1");//����ID(��)
        wrti[47].setFieldValue(jsonObject.getString("ITEM_ID"));
        wrti[47].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[47].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[48] = new WorkflowRequestTableField();
        wrti[48].setFieldName("htbbh1");//��������
        wrti[48].setFieldValue(jsonObject.getString("DESCRIPTION"));
        wrti[48].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[48].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[49] = new WorkflowRequestTableField();
        wrti[49].setFieldName("htbbh1");//����ͺ�(��)
        wrti[49].setFieldValue(jsonObject.getString("GUIGE"));
        wrti[49].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[49].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[50] = new WorkflowRequestTableField();
        wrti[50].setFieldName("htbbh1");//���Ź���(��)
        wrti[50].setFieldValue(jsonObject.getString("GUOBIAO"));
        wrti[50].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[50].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[51] = new WorkflowRequestTableField();
        wrti[51].setFieldName("htbbh1");//��λ(��)
        wrti[51].setFieldValue(jsonObject.getString("UOM_CODE"));
        wrti[51].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[51].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[52] = new WorkflowRequestTableField();
        wrti[52].setFieldName("htbbh1");//��������
        wrti[52].setFieldValue(jsonObject.getString("QUANTITY"));
        wrti[52].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[52].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[53] = new WorkflowRequestTableField();
        wrti[53].setFieldName("htbbh1");//��������
        wrti[53].setFieldValue(jsonObject.getString("NEED_DATE"));
        wrti[53].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[53].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[54] = new WorkflowRequestTableField();
        wrti[54].setFieldName("htbbh1");//״̬
        wrti[54].setFieldValue(jsonObject.getString("FLAG1"));
        wrti[54].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[54].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[55] = new WorkflowRequestTableField();
        wrti[55].setFieldName("htbbh1");//˵��
        wrti[55].setFieldValue(jsonObject.getString("note"));
        wrti[55].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[55].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[56] = new WorkflowRequestTableField();
        wrti[56].setFieldName("htbbh1");//��ʷƽ���۸�(��)
        wrti[56].setFieldValue(jsonObject.getString("item_cost"));
        wrti[56].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[56].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[57] = new WorkflowRequestTableField();
        wrti[57].setFieldName("htbbh1");//��������
        wrti[57].setFieldValue(jsonObject.getString("DESCRIPTION1"));
        wrti[57].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[57].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[58] = new WorkflowRequestTableField();
        wrti[58].setFieldName("htbbh1");//����ͺ�
        wrti[58].setFieldValue(jsonObject.getString("GUIGE1"));
        wrti[58].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[58].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[59] = new WorkflowRequestTableField();
        wrti[59].setFieldName("htbbh1");//���Ź���
        wrti[59].setFieldValue(jsonObject.getString("GUOBIAO1"));
        wrti[59].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[59].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[60] = new WorkflowRequestTableField();
        wrti[60].setFieldName("htbbh1");//��λ
        wrti[60].setFieldValue(jsonObject.getString("UOM_CODE1"));
        wrti[60].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[60].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[61] = new WorkflowRequestTableField();
        wrti[61].setFieldName("htbbh1");//��ʷƽ���۸�
        wrti[61].setFieldValue(jsonObject.getString("item_cost1"));
        wrti[61].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[61].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[62] = new WorkflowRequestTableField();
        wrti[62].setFieldName("htbbh1");//����ID
        wrti[62].setFieldValue(jsonObject.getString("ITEM_ID1"));
        wrti[62].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[62].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[63] = new WorkflowRequestTableField();
        wrti[63].setFieldName("htbbh1");//���ϱ��(��)
        wrti[63].setFieldValue(jsonObject.getString("wlbh"));
        wrti[63].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[63].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[64] = new WorkflowRequestTableField();
        wrti[64].setFieldName("htbbh1");//���ϲֿ�
        wrti[64].setFieldValue(jsonObject.getString("ck1"));
        wrti[64].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[64].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[65] = new WorkflowRequestTableField();
        wrti[65].setFieldName("htbbh1");//�ֿ����ID
        wrti[65].setFieldValue(jsonObject.getString("ckID"));
        wrti[65].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[65].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[66] = new WorkflowRequestTableField();
        wrti[66].setFieldName("htbbh1");//�ֿ����ID1
        wrti[66].setFieldValue(jsonObject.getString("ckID1"));
        wrti[66].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[66].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[67] = new WorkflowRequestTableField();
        wrti[67].setFieldName("htbbh1");//����
        wrti[67].setFieldValue(jsonObject.getString("cz"));
        wrti[67].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[67].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[68] = new WorkflowRequestTableField();
        wrti[68].setFieldName("htbbh1");//�豸��Դ
        wrti[68].setFieldValue(jsonObject.getString("sbzy"));
        wrti[68].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[68].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[69] = new WorkflowRequestTableField();
        wrti[69].setFieldName("htbbh1");//������
        wrti[69].setFieldValue(jsonObject.getString("xyl1"));
        wrti[69].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[69].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[70] = new WorkflowRequestTableField();
        wrti[70].setFieldName("htbbh1");//�Ƿ����豸��Դ
        wrti[70].setFieldValue(jsonObject.getString("sfssbzy"));
        wrti[70].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[70].setEdit(true);//�ֶ��Ƿ�ɱ༭

        wrti[71] = new WorkflowRequestTableField();
        wrti[71].setFieldName("htbbh1");//��ȡ����
        wrti[71].setFieldValue(jsonObject.getString("lqsl"));
        wrti[71].setView(true);//�ֶ��Ƿ�ɼ�
        wrti[71].setEdit(true);//�ֶ��Ƿ�ɱ༭
        // endregion
        WorkflowRequestTableRecord[] wrtri = new WorkflowRequestTableRecord[1];//���ֶ�ֻ��һ������
        wrtri[0] = new WorkflowRequestTableRecord();
        wrtri[0].setWorkflowRequestTableFields(wrti);
        return null;
    }
}
