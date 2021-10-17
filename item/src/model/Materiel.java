package model;

/**
 * @创建时间：2021/4/2
 * @描述 bean
 */
public class Materiel {
    //物料编号
    private String ITEM_NO;
    //物料描述
    private String DESCRIPTION ;
    //图号/标准
    private String GRAPHIC_NO;
    //规格
    private String SPECIFICATION1;
    //指定
    private String SPECIFICATION2;
    //材质
    private String MATERIAL_TYPE;
    //性能等级
    private String PERFORMANCE_LV;
    //表面处理
    private String FACE_TYPE;
    //现有量
    private String MOQD_FLAG;
    //单位
    private String UNIT;
    //旧物料编码
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
