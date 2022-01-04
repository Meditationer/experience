package com.zf.jobbooking.domain.compound;

/**
 * @创建时间：2021/12/15
 * @描述  生产报工复合
 */
public class WorkRep {
    //id
    private int ID;
    //班组
    private String Work_Group_Id;
    //工票号id
    private String Dispatch_Task_Id;
    //工票号/批次号
    private String Batch_No;
    //工单
    private String Work_Order_Id;
    //工序
    private String Process_Id;
    //资源id
    private String Resource_Id;
    //目标工序与名称
    private String Target_Process;
    //报工人员
    private double Principal_Id;
    //实作工时
    private String Hour;
    //完工工时
    private String Finish_Hour;
    //报工数/完工数量
    private String Report_Qty;
    //可检数量
    private String UnInspect_Qty;
    //报工时间
    private String Report_Time;
    //主报工任务单Id-DispatchTaskid
    private String Main_Task_Id;
    //主报工任务单Id
    private String Report_Mode;
    //报工方式
    private String Is_Report;
    //erp处理结果
    private String Erp_Result;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWork_Group_Id() {
        return Work_Group_Id;
    }

    public void setWork_Group_Id(String work_Group_Id) {
        Work_Group_Id = work_Group_Id;
    }

    public String getDispatch_Task_Id() {
        return Dispatch_Task_Id;
    }

    public void setDispatch_Task_Id(String dispatch_Task_Id) {
        Dispatch_Task_Id = dispatch_Task_Id;
    }

    public String getBatch_No() {
        return Batch_No;
    }

    public void setBatch_No(String batch_No) {
        Batch_No = batch_No;
    }

    public String getWork_Order_Id() {
        return Work_Order_Id;
    }

    public void setWork_Order_Id(String work_Order_Id) {
        Work_Order_Id = work_Order_Id;
    }

    public String getProcess_Id() {
        return Process_Id;
    }

    public void setProcess_Id(String process_Id) {
        Process_Id = process_Id;
    }

    public String getResource_Id() {
        return Resource_Id;
    }

    public void setResource_Id(String resource_Id) {
        Resource_Id = resource_Id;
    }

    public String getTarget_Process() {
        return Target_Process;
    }

    public void setTarget_Process(String target_Process) {
        Target_Process = target_Process;
    }

    public double getPrincipal_Id() {
        return Principal_Id;
    }

    public void setPrincipal_Id(double principal_Id) {
        Principal_Id = principal_Id;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public String getFinish_Hour() {
        return Finish_Hour;
    }

    public void setFinish_Hour(String finish_Hour) {
        Finish_Hour = finish_Hour;
    }

    public String getReport_Qty() {
        return Report_Qty;
    }

    public void setReport_Qty(String report_Qty) {
        Report_Qty = report_Qty;
    }

    public String getUnInspect_Qty() {
        return UnInspect_Qty;
    }

    public void setUnInspect_Qty(String unInspect_Qty) {
        UnInspect_Qty = unInspect_Qty;
    }

    public String getReport_Time() {
        return Report_Time;
    }

    public void setReport_Time(String report_Time) {
        Report_Time = report_Time;
    }

    public String getMain_Task_Id() {
        return Main_Task_Id;
    }

    public void setMain_Task_Id(String main_Task_Id) {
        Main_Task_Id = main_Task_Id;
    }

    public String getReport_Mode() {
        return Report_Mode;
    }

    public void setReport_Mode(String report_Mode) {
        Report_Mode = report_Mode;
    }

    public String getIs_Report() {
        return Is_Report;
    }

    public void setIs_Report(String is_Report) {
        Is_Report = is_Report;
    }

    public String getErp_Result() {
        return Erp_Result;
    }

    public void setErp_Result(String erp_Result) {
        Erp_Result = erp_Result;
    }
}
