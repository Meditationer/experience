package model;

import utils.Column;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @����ʱ�䣺2021/11/1
 * @����
 */
public class Mes_syn {
    //��������
    @Column("ERROR_TYPE")
    private String ERROR_TYPE;
    //����ʱ��
    @Column("CREATE_DATE")
    private Date CREATE_DATE;
    //��������
    @Column("PROCESS_DATE")
    private Date PROCESS_DATE;
    //����/�����
    @Column("NO")
    private String NO;
    //�������
    @Column("ERROR_COUNT")
    private BigDecimal ERROR_COUNT;
    //����ԭ��
    @Column("ERROR_MESSAGE")
    private String ERROR_MESSAGE;
    //״̬
    @Column("STATUS")
    private String STATUS;
    //���Ϻ�
    @Column("SEGMENT1")
    private String SEGMENT1;
    //������
    @Column("WIP_ENTITY_NAME")
    private String WIP_ENTITY_NAME;
    @Column("CREATION_DATE")
    private String CREATION_DATE;

    public String getCREATION_DATE() {
        return CREATION_DATE;
    }

    public void setCREATION_DATE(String CREATION_DATE) {
        this.CREATION_DATE = CREATION_DATE;
    }


    private String beg;
    private String end;

    public String getBeg() {
        return beg;
    }

    public void setBeg(String beg) {
        this.beg = beg;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getERROR_TYPE() {
        return ERROR_TYPE;
    }

    public void setERROR_TYPE(String ERROR_TYPE) {
        this.ERROR_TYPE = ERROR_TYPE;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public Date getPROCESS_DATE() {
        return PROCESS_DATE;
    }

    public void setPROCESS_DATE(Date PROCESS_DATE) {
        this.PROCESS_DATE = PROCESS_DATE;
    }

    public String getNO() {
        return NO;
    }

    public void setNO(String NO) {
        this.NO = NO;
    }

    public BigDecimal getERROR_COUNT() {
        return ERROR_COUNT;
    }

    public void setERROR_COUNT(BigDecimal ERROR_COUNT) {
        this.ERROR_COUNT = ERROR_COUNT;
    }

    public String getERROR_MESSAGE() {
        return ERROR_MESSAGE;
    }

    public void setERROR_MESSAGE(String ERROR_MESSAGE) {
        this.ERROR_MESSAGE = ERROR_MESSAGE;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public String getSEGMENT1() {
        return SEGMENT1;
    }

    public void setSEGMENT1(String SEGMENT1) {
        this.SEGMENT1 = SEGMENT1;
    }

    public String getWIP_ENTITY_NAME() {
        return WIP_ENTITY_NAME;
    }

    public void setWIP_ENTITY_NAME(String WIP_ENTITY_NAME) {
        this.WIP_ENTITY_NAME = WIP_ENTITY_NAME;
    }
}
