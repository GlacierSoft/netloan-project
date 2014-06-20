/*
 * @(#)BorrowingLoanQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.finance;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.finance.FinanceRechargeExample.Criteria;
import com.glacier.netloan.entity.finance.FinanceRecharge;



/**
 * @ClassName: FinBankCardQueryDTO
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-5-22 下午3:16:58
 */
public class FinRechargeQueryDTO extends FinanceRecharge{
	
    @JSONField(format="yyyy-MM-dd")
	private Date createStartTime;

    @JSONField(format="yyyy-MM-dd")
    private Date createEndTime;

    
	public Date getCreateStartTime() {
        return createStartTime;
    }

	public void setCreateStartTime(Date createStartTime) {
        this.createStartTime = createStartTime;
    }

    public Date getCreateEndTime() {
        return createEndTime;
    }

    public void setCreateEndTime(Date createEndTime) {
        this.createEndTime = createEndTime;
    }
    
    public void setQueryConditions(Criteria queryCriteria){

    	if(null != this.getMemberDisplay() && StringUtils.isNotBlank(this.getMemberDisplay())){//根据记录明细类型查找
	        queryCriteria.andMemberRealNamelike("%" + this.getMemberDisplay() + "%");
	    }
    	
    	if(null != this.getRechargeSetName() && StringUtils.isNotBlank(this.getRechargeSetName())){//根据记录明细类型查找
	        queryCriteria.andRechargeSetNamelike("%" + this.getRechargeSetName() + "%");
	    }
    	
    	if(null != this.getAuditState() && StringUtils.isNotBlank(this.getAuditState())){//审核状态
	        queryCriteria.andAuditStateEqualTo(this.getAuditState());
	    }
    	
	    if(null != createStartTime && null != createEndTime){//创建时间段查询
	           queryCriteria.andCreateTimeBetween(createStartTime, createEndTime); 
	    }else{
	    	if(null != createStartTime){
	    		queryCriteria.andCreateTimeGreaterThanOrEqualTo(createStartTime);
	    	}
	    	if(null != createEndTime){
	    		queryCriteria.andCreateTimeLessThanOrEqualTo(createEndTime);
	    	}
	    }
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }
}

