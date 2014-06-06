/*
 * @(#)BorrowingLoanQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.borrow;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
    
    private Date loanStartDate;
    
    private Date loanEndDate;
    
    private float loanTotalStart;
    
    private float loanTotalEnd;
    
    private int reward;
    
    private String[] borrowTypes;
    
    public int getReward() {
		return reward;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}

	public String[] getBorrowTypes() {
		return borrowTypes;
	}

	public void setBorrowTypes(String[] borrowTypes) {
		this.borrowTypes = borrowTypes;
	}

	public float getLoanTotalStart() {
		return loanTotalStart;
	}

	public void setLoanTotalStart(float loanTotalStart) {
		this.loanTotalStart = loanTotalStart;
	}

	public float getLoanTotalEnd() {
		return loanTotalEnd;
	}

	public void setLoanTotalEnd(float loanTotalEnd) {
		this.loanTotalEnd = loanTotalEnd;
	}

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
    
    public Date getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public Date getLoanEndDate() {
		return loanEndDate;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	public void setQueryCondition(Criteria queryCriteria){

    	if(null != this.getLoanCode() && StringUtils.isNotBlank(this.getLoanCode())){//根据借款编号查询
	        queryCriteria.andLoanCodeLike("%" + this.getLoanCode() + "%");
	    }
    	if(null != this.getLoanTitle() && StringUtils.isNotBlank(this.getLoanTitle())){//根据借款标题查询
	        queryCriteria.andLoanTitleLike("%" + this.getLoanTitle() + "%");
	    }
    	if(null != this.getMemberDisplay() && StringUtils.isNotBlank(this.getMemberDisplay())){//根据借款会员名称
	        queryCriteria.andMemberDisplayLike("%" + this.getMemberDisplay() + "%");
	    }
    	if(null != this.getLoanPurposeId() && StringUtils.isNotBlank(this.getLoanPurposeId())){//根据借款目的
	        queryCriteria.andLoanPurposeIdLike("%" + this.getLoanPurposeId() + "%");
	    }
	   	if(null != this.getLoanState()){//根据借款状态查询
	        queryCriteria.andLoanStateEqualTo(this.getLoanState().toString());
	   	}else{//如果loanstate为空，则查询招标中，还款中，已完成，这三种借款状态的借款
	   		List<String> loanStates = Arrays.asList("tendering","repaymenting","completed");
	   		queryCriteria.andLoanStateIn(loanStates);
	   	}
	   	if(null != this.getWaitBidDeadlines() && !"".equals(this.getWaitBidDeadlines().trim())){//根据筹标期限查询
	   		queryCriteria.andWaitBidDeadlinesEqualTo(this.getWaitBidDeadlines().trim());
	   	}
	   	if(null != this.getBorrowTypes()){//根据借款类型查询
	   		List<String> listBorrowTypes = Arrays.asList(borrowTypes);
	   		queryCriteria.andLoanTenderIdIn(listBorrowTypes);
	   	}
	   	if(null != this.getRepaymentTypeId() && !"".equals(this.getRepaymentTypeId().trim())){//根据还款方式查询
	   		queryCriteria.andRepaymentTypeIdEqualTo(this.getRepaymentTypeId());
	   	}
	   	if(reward != 0 ){
	   		if(reward == 1){
	   			queryCriteria.andIsBidRewardEqualTo("no");
	   		}else if(reward == 2){
	   			queryCriteria.andBidProRewardGreaterThan(0f);	
	   		}else if(reward == 3){
	   			queryCriteria.andFixedAppRewardGreaterThan(0f);
	   		}
	   	}
	   	if(0 != loanTotalStart && 0 != loanTotalEnd && 1000001.0 != loanTotalStart && 1000001.0 != loanTotalEnd){//借款金额查询
	           queryCriteria.andLoanTotalBetween(loanTotalStart, loanTotalEnd); 
	    }else{
	    	if(0 != loanTotalStart && 1000001.0 != loanTotalStart){
	    		queryCriteria.andLoanTotalGreaterThanOrEqualTo(loanTotalStart);
	    	}
	    	if(0 != loanTotalEnd && 1000001.0 != loanTotalEnd){
	    		queryCriteria.andLoanTotalLessThanOrEqualTo(loanTotalEnd);
	    	}
	    	if(loanTotalStart == 1000001.0 || loanTotalEnd == 1000001.0){
	    		queryCriteria.andLoanTotalGreaterThanOrEqualTo((float) 1000001.0);
	    	}
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
	    
	    if(null!=loanStartDate&&null!=loanEndDate){
	    	queryCriteria.andLoanDateBetween(loanStartDate, loanEndDate);
	    }else{
	    	if(null!=loanStartDate)
	    		  queryCriteria.andLoanDateGreaterThanOrEqualTo(loanStartDate);
	    	if(null!=loanEndDate)
	    		 queryCriteria.andLoanDateLessThanOrEqualTo(loanEndDate);
	    }
	    
    }
   
   @Override
   public String toString() {
       return ReflectionToStringBuilder.toString(this);
   }
}

