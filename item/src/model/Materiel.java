package model;

/**
 * @����ʱ�䣺2021/4/2
 * @���� bean
 */
public class Materiel {
    //���ϱ��
    private String ITEM_NO;
    //��������
    private String DESCRIPTION ;
    //ͼ��/��׼
    private String GRAPHIC_NO;
    //���
    private String SPECIFICATION1;
    //ָ��
    private String SPECIFICATION2;
    //����
    private String MATERIAL_TYPE;
    //���ܵȼ�
    private String PERFORMANCE_LV;
    //���洦��
    private String FACE_TYPE;
    //������
    private String MOQD_FLAG;
    //��λ
    private String UNIT;
    //�����ϱ���
    private String ORIGINAL_ITEM_NO;
    public String getITEM_NO() {
        return ITEM_NO;
    }

    public void setITEM_NO(String ITEM_NO) {
        this.ITEM_NO = ITEM_NO;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public void setGRAPHIC_NO(String GRAPHIC_NO) {
        this.GRAPHIC_NO = GRAPHIC_NO;
    }

    public void setSPECIFICATION1(String SPECIFICATION1) {
        this.SPECIFICATION1 = SPECIFICATION1;
    }

    public void setSPECIFICATION2(String SPECIFICATION2) {
        this.SPECIFICATION2 = SPECIFICATION2;
    }

    public void setMATERIAL_TYPE(String MATERIAL_TYPE) {
        this.MATERIAL_TYPE = MATERIAL_TYPE;
    }

    public void setPERFORMANCE_LV(String PERFORMANCE_LV) {
        this.PERFORMANCE_LV = PERFORMANCE_LV;
    }

    public void setFACE_TYPE(String FACE_TYPE) {
        this.FACE_TYPE = FACE_TYPE;
    }

    public void setMOQD_FLAG(String MOQD_FLAG) {
        this.MOQD_FLAG = MOQD_FLAG;
    }

    public void setUNIT(String UNIT) {
        this.UNIT = UNIT;
    }

    public void setORIGINAL_ITEM_NO(String ORIGINAL_ITEM_NO) {
        this.ORIGINAL_ITEM_NO = ORIGINAL_ITEM_NO;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public String getGRAPHIC_NO() {
        return GRAPHIC_NO;
    }

    public String getSPECIFICATION1() {
        return SPECIFICATION1;
    }

    public String getSPECIFICATION2() {
        return SPECIFICATION2;
    }

    public String getMATERIAL_TYPE() {
        return MATERIAL_TYPE;
    }

    public String getPERFORMANCE_LV() {
        return PERFORMANCE_LV;
    }

    public String getFACE_TYPE() {
        return FACE_TYPE;
    }

    public String getMOQD_FLAG() {
        return MOQD_FLAG;
    }

    public String getUNIT() {
        return UNIT;
    }

    public String getORIGINAL_ITEM_NO() {
        return ORIGINAL_ITEM_NO;
    }
}
