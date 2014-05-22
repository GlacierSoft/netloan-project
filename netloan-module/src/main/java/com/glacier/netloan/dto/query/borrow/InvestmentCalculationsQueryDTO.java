/*
 * @(#)BorrowingLoanQueryDTO.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.dto.query.borrow;



/** 
 * @ClassName: InvestmentCalculationsQueryDTO 
 * @Description: TODO(InvestmentCalculationsdto) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-22下午4:44:28
 */
public class InvestmentCalculationsQueryDTO{
    
    private float investmentMoney;
    
    private float rate;
    
    private float loanDaadline;
    
    private float bidProReward;
    
    private float addCash;
    
    private String repaymentTypeName;

	public String getRepaymentTypeName() {
		return repaymentTypeName;
	}

	public void setRepaymentTypeName(String repaymentTypeName) {
		this.repaymentTypeName = repaymentTypeName;
	}

	public float getInvestmentMoney() {
		return investmentMoney;
	}

	public void setInvestmentMoney(float investmentMoney) {
		this.investmentMoney = investmentMoney;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getLoanDaadline() {
		return loanDaadline;
	}

	public void setLoanDaadline(float loanDaadline) {
		this.loanDaadline = loanDaadline;
	}

	public float getBidProReward() {
		return bidProReward;
	}

	public void setBidProReward(float bidProReward) {
		this.bidProReward = bidProReward;
	}

	public float getAddCash() {
		return addCash;
	}

	public void setAddCash(float addCash) {
		this.addCash = addCash;
	}
    
    
}

