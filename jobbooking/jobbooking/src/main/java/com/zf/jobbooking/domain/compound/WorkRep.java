package com.zf.jobbooking.domain.compound;

/**
 * @创建时间：2021/12/15
 * @描述  生产报工复合
 */
public class WorkRep {
    //id
    private int ID;
    //班组
    private String WorkGroupId;
    //工票号id
    private String DispatchTaskId;
    //工票号/批次号
    private String BatchNo;
    //工单
    private String WorkOrderId;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWorkGroupId() {
        return WorkGroupId;
    }

    public void setWorkGroupId(String workGroupId) {
        WorkGroupId = workGroupId;
    }

    public String getDispatchTaskId() {
        return DispatchTaskId;
    }

    public void setDispatchTaskId(String dispatchTaskId) {
        DispatchTaskId = dispatchTaskId;
    }

    public String getBatchNo() {
        return BatchNo;
    }

    public void setBatchNo(String batchNo) {
        BatchNo = batchNo;
    }

    public String getWorkOrderId() {
        return WorkOrderId;
    }

    public void setWorkOrderId(String workOrderId) {
        WorkOrderId = workOrderId;
    }

    public String getProcessId() {
        return ProcessId;
    }

    public void setProcessId(String processId) {
        ProcessId = processId;
    }

    public String getResourceId() {
        return ResourceId;
    }

    public void setResourceId(String resourceId) {
        ResourceId = resourceId;
    }

    public String getTargetProcess() {
        return TargetProcess;
    }

    public void setTargetProcess(String targetProcess) {
        TargetProcess = targetProcess;
    }

    public double getPrincipalId() {
        return PrincipalId;
    }

    public void setPrincipalId(double principalId) {
        PrincipalId = principalId;
    }

    public String getHour() {
        return Hour;
    }

    public void setHour(String hour) {
        Hour = hour;
    }

    public String getFinishHour() {
        return FinishHour;
    }

    public void setFinishHour(String finishHour) {
        FinishHour = finishHour;
    }

    public String getReportQty() {
        return ReportQty;
    }

    public void setReportQty(String reportQty) {
        ReportQty = reportQty;
    }

    public String getUnInspectQty() {
        return UnInspectQty;
    }

    public void setUnInspectQty(String unInspectQty) {
        UnInspectQty = unInspectQty;
    }

    public String getReportTime() {
        return ReportTime;
    }

    public void setReportTime(String reportTime) {
        ReportTime = reportTime;
    }

    public String getMainTaskId() {
        return MainTaskId;
    }

    public void setMainTaskId(String mainTaskId) {
        MainTaskId = mainTaskId;
    }

    public String getReportMode() {
        return ReportMode;
    }

    public void setReportMode(String reportMode) {
        ReportMode = reportMode;
    }

    public String getIsReport() {
        return IsReport;
    }

    public void setIsReport(String isReport) {
        IsReport = isReport;
    }

    public String getErpResult() {
        return ErpResult;
    }

    public void setErpResult(String erpResult) {
        ErpResult = erpResult;
    }

    //工序
    private String ProcessId;
    //资源id
    private String ResourceId;
    //目标工序与名称
    private String TargetProcess;
    //报工人员
    private double PrincipalId;
    //实作工时
    private String Hour;
    //完工工时
    private String FinishHour;
    //报工数/完工数量
    private String ReportQty;
    //可检数量
    private String UnInspectQty;
    //报工时间
    private String ReportTime;
    //主报工任务单Id-DispatchTaskid
    private String MainTaskId;
    //主报工任务单Id
    private String ReportMode;
    //报工方式
    private String IsReport;
    //erp处理结果
    private String ErpResult;
}
