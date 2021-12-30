package com.zf.jobbooking.service.compound;

import com.zf.jobbooking.domain.compound.WorkRep;
import com.zf.jobbooking.domain.dispatchTask.DispatchTask;

/**
 * @创建时间：2021/12/29
 * @描述  工单报工处理
 */
public class WorkRepServ {
    //扫码完成后的逻辑
    public void OnBarcodeChanged(WorkRep wr){
        if (!wr.getBatchNo().IsNotEmpty()) return;
        //根据工票号，查询工票数据
        DispatchTask dt=
    }
}
