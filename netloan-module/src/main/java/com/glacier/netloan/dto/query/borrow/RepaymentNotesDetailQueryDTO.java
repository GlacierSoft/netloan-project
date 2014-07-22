/*
 * @(#)RepaymentNotesDetailQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.borrow;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.netloan.entity.borrow.RepaymentNotesDetailExample.Criteria;
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
 
/** 
 * @ClassName: RepaymentNotesDetailQueryDTO 
 * @Description: TODO(RepaymentNotesDetailQueryDTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-13下午4:49:45
 */
public class RepaymentNotesDetailQueryDTO extends RepaymentNotesDetail{
	
	private Date createStartTime;

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
    
    public void setQueryCondition(Criteria queryCriteria){

    	if(null != this.getMemberDisplay() && StringUtils.isNotBlank(this.getMemberDisplay())){//根据借款会员名称
	        queryCriteria.andMemberDisplayLike("%" + this.getMemberDisplay() + "%");
	    }
    	if(null != this.getRepayState() && StringUtils.isNotBlank(this.getRepayState())){//根据还款状态名称
	        queryCriteria.andRepayStateEqualTo(this.getRepayState());
	    }
    	if(null != this.getNumberPeriod()){//根据第几期
	        queryCriteria.andNumberPeriodEqualTo(this.getNumberPeriod());
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

