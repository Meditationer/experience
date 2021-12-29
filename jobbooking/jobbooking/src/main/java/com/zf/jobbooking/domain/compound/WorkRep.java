package com.zf.jobbooking.domain.compound;

import lombok.Data;

/**
 * @创建时间：2021/12/15
 * @描述  生产报工复合
 */
@Data
public class WorkRep {
    //工单号
    private String WorkGroupId;
    //工序id
    private String DispatchTaskId;
    //工序id
    private String BatchNo;
    //工序id
    private String WorkOrderId;
    //工序id
    private String ProcessId;
    //工序id
    private String ResourceId;
    //工序id
    private String TargetProcess;
    //工序id
    private String PrincipalId;
    //工序id
    private String Hour;
    //工序id
    private String FinishHour;
    //工序id
    private String ReportQty;
    //工序id
    private String UnInspectQty;
    //工序id
    private String ReportTime;
    //工序id
    private String MainTaskId;
    //工序id
    private String ReportMode;
    //工序id
    private String IsReport;
    //工序id
    private String ErpResult;
}
