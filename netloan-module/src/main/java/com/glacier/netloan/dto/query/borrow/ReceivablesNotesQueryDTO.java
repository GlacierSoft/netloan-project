/*
 * @(#)ReceivablesNotesQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.borrow;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.netloan.entity.borrow.ReceivablesNotes;
import com.glacier.netloan.entity.borrow.ReceivablesNotesExample.Criteria;


/** 
 * @ClassName: ReceivablesNotesQueryDTO 
 * @Description: TODO(ReceivablesNotesQueryDTO) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-13下午4:50:06
 */
public class ReceivablesNotesQueryDTO extends ReceivablesNotes{
	
	private Date createStartTime;

    private Date createEndTime;
    
    private Date loanDateCreateStartTime;
    
    private Date loanDateCreateEndTime;
    
	public Date getCreateStartTime() {
        return createStartTime;
    }

    public Date getLoanDateCreateStartTime() {
		return loanDateCreateStartTime;
	}

	public void setLoanDateCreateStartTime(Date loanDateCreateStartTime) {
		this.loanDateCreateStartTime = loanDateCreateStartTime;
	}

	public Date getLoanDateCreateEndTime() {
		return loanDateCreateEndTime;
	}

	public void setLoanDateCreateEndTime(Date loanDateCreateEndTime) {
		this.loanDateCreateEndTime = loanDateCreateEndTime;
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

    	if(null != this.getLoanTitle() && StringUtils.isNotBlank(this.getLoanTitle())){//根据借款标题名称
	        queryCriteria.andLoanTitleLike("%" + this.getLoanTitle() + "%");
	    }
    	
    	if(null != this.getMemberDisplay() && StringUtils.isNotBlank(this.getMemberDisplay())){//根据借款会员名称
	        queryCriteria.andMemberDisplayLike("%" + this.getMemberDisplay() + "%");
	    }
    	if(null != this.getReceState() && StringUtils.isNotBlank(this.getReceState())){//根据还款状态名称
	        queryCriteria.andReceStateEqualTo(this.getReceState());
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
	    if(null != loanDateCreateStartTime && null != loanDateCreateEndTime){//前台创建时间段查询
	           queryCriteria.andLoanDateBetween(loanDateCreateStartTime, loanDateCreateEndTime); 
	    }else{
	    	if(null != loanDateCreateStartTime){
	    		queryCriteria.andLoanDateGreaterThanOrEqualTo(loanDateCreateStartTime);
	    	}
	    	if(null != loanDateCreateEndTime){
	    		queryCriteria.andLoanDateLessThanOrEqualTo(loanDateCreateEndTime);
	    	}
	    }
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }
}

