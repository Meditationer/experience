package com.zf.jobbooking.domain.dispatchTask;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * @创建时间：2021/12/29
 * @描述
 */
public class DispatchTask {
    //id
    private int ID;
    //班组id
    private String Work_Group_Id;
    //任务单号  工票号
    private String No;
    //关联工单
    private String WorkOrderId;
    //关联工序
    private String ProcessId;
    //关联资源
    private String ResourceId;
    //用户id
    private String EmployeeId;
    //实作工时
    private String ActualHour;
    //完工工时 无对应
    private String FinishHour;
    //工票数量 无对应
    private String FinishQty;
    //原工票号
    private String OriginalNo;
    //打印次数
    private int PrintCount;
    //工票数量
    private BigDecimal DispatchQty;
    //已派工数量
    private BigDecimal  SendQty;
    //已报工数量
    private BigDecimal  ReportQty;
    //检验数量
    private BigDecimal  OkQty;
    //不合格数量
    private BigDecimal NgQty;
    //关闭原因
    private String  CloseReason;
    //计划开始时间
    private Date  PlanBeginTime;
    //计划完成时间
    private Date Plan_End_Time;
    //任务单状态
    private int Task_Status;
    //关联关系
    private int ASSOCIATED;
    //关联工单
    private String ASSOCIATED_WORK_ORDER;
}
