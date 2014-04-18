/*
 * @(#)BorrowingLoanQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.borrow;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample.Criteria;


/** 
 * @ClassName: BorrowingLoanQueryDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-4-18 下午4:45:25  
 */
public class BorrowingLoanQueryDTO extends BorrowingLoan{
	
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

    	if(null != this.getLoanCode() && StringUtils.isNotBlank(this.getLoanCode())){//根据借款编号查询
	        queryCriteria.andLoanCodeLike("%" + this.getLoanCode() + "%");
	    }
    	if(null != this.getLoanTitle() && StringUtils.isNotBlank(this.getLoanTitle())){//根据借款标题查询
	        queryCriteria.andLoanTitleLike("%" + this.getLoanTitle() + "%");
	    }
	   	if(null != this.getLoanState()){//根据借款状态查询
	        queryCriteria.andLoanStateEqualTo(this.getLoanState().toString());
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

