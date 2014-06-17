package com.glacier.netloan.entity.borrow;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ReceivablesNotesDetail {
    private String receNotesDetailId;

    private String receNotesId;

    /**
     * 自定义字段,收款人名称
     */
    private String memberDisplay;
    
    /**
     * 自定义字段,还款人名称
     */
    private String loanMemberDisplay;
    
    private String memberId;

    private Float alrReceMoney;

    private String numberPeriod;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date shouldReceDate;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date actualReceDate;

    private Float currentReceMoeny;

    private Float currentRecePrincipal;

    private Float currentReceInterest;

    private Float surplusPrincipal;

    private Float interestManaFee;

    private String isOverdue;

    private Float overdueInterest;

    private Float overdueDays;

    private Float income;
    
    private Float amount;

    private String receState;

    private String remark;
    
    /**
     * 自定义字段   创建人名称
     */
    private String createrDisplay;

    private String creater;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")    
    private Date createTime;

    /**
     * 自定义字段  更新人名称
     */
    private String updaterDisplay;
    
    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getLoanMemberDisplay() {
		return loanMemberDisplay;
	}

	public void setLoanMemberDisplay(String loanMemberDisplay) {
		this.loanMemberDisplay = loanMemberDisplay;
	}

	public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getUpdaterDisplay() {
		return updaterDisplay;
	}

	public void setUpdaterDisplay(String updaterDisplay) {
		this.updaterDisplay = updaterDisplay;
	}

	public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getReceNotesDetailId() {
        return receNotesDetailId;
    }

    public void setReceNotesDetailId(String receNotesDetailId) {
        this.receNotesDetailId = receNotesDetailId;
    }

    public String getReceNotesId() {
        return receNotesId;
    }

    public void setReceNotesId(String receNotesId) {
        this.receNotesId = receNotesId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Float getAlrReceMoney() {
        return alrReceMoney;
    }

    public void setAlrReceMoney(Float alrReceMoney) {
        this.alrReceMoney = alrReceMoney;
    }

    public String getNumberPeriod() {
        return numberPeriod;
    }

    public void setNumberPeriod(String numberPeriod) {
        this.numberPeriod = numberPeriod;
    }

    public Date getShouldReceDate() {
        return shouldReceDate;
    }

    public void setShouldReceDate(Date shouldReceDate) {
        this.shouldReceDate = shouldReceDate;
    }

    public Date getActualReceDate() {
        return actualReceDate;
    }

    public void setActualReceDate(Date actualReceDate) {
        this.actualReceDate = actualReceDate;
    }

    public Float getCurrentReceMoeny() {
        return currentReceMoeny;
    }

    public void setCurrentReceMoeny(Float currentReceMoeny) {
        this.currentReceMoeny = currentReceMoeny;
    }

    public Float getCurrentRecePrincipal() {
        return currentRecePrincipal;
    }

    public void setCurrentRecePrincipal(Float currentRecePrincipal) {
        this.currentRecePrincipal = currentRecePrincipal;
    }

    public Float getCurrentReceInterest() {
        return currentReceInterest;
    }

    public void setCurrentReceInterest(Float currentReceInterest) {
        this.currentReceInterest = currentReceInterest;
    }

    public Float getSurplusPrincipal() {
        return surplusPrincipal;
    }

    public void setSurplusPrincipal(Float surplusPrincipal) {
        this.surplusPrincipal = surplusPrincipal;
    }

    public Float getInterestManaFee() {
        return interestManaFee;
    }

    public void setInterestManaFee(Float interestManaFee) {
        this.interestManaFee = interestManaFee;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }

    public Float getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Float overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Float getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Float overdueDays) {
        this.overdueDays = overdueDays;
    }

    public Float getIncome() {
        return income;
    }

    public void setIncome(Float income) {
        this.income = income;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getReceState() {
        return receState;
    }

    public void setReceState(String receState) {
        this.receState = receState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ReceivablesNotesDetail other = (ReceivablesNotesDetail) that;
        return (this.getReceNotesDetailId() == null ? other.getReceNotesDetailId() == null : this.getReceNotesDetailId().equals(other.getReceNotesDetailId()))
            && (this.getReceNotesId() == null ? other.getReceNotesId() == null : this.getReceNotesId().equals(other.getReceNotesId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAlrReceMoney() == null ? other.getAlrReceMoney() == null : this.getAlrReceMoney().equals(other.getAlrReceMoney()))
            && (this.getNumberPeriod() == null ? other.getNumberPeriod() == null : this.getNumberPeriod().equals(other.getNumberPeriod()))
            && (this.getShouldReceDate() == null ? other.getShouldReceDate() == null : this.getShouldReceDate().equals(other.getShouldReceDate()))
            && (this.getActualReceDate() == null ? other.getActualReceDate() == null : this.getActualReceDate().equals(other.getActualReceDate()))
            && (this.getCurrentReceMoeny() == null ? other.getCurrentReceMoeny() == null : this.getCurrentReceMoeny().equals(other.getCurrentReceMoeny()))
            && (this.getCurrentRecePrincipal() == null ? other.getCurrentRecePrincipal() == null : this.getCurrentRecePrincipal().equals(other.getCurrentRecePrincipal()))
            && (this.getCurrentReceInterest() == null ? other.getCurrentReceInterest() == null : this.getCurrentReceInterest().equals(other.getCurrentReceInterest()))
            && (this.getSurplusPrincipal() == null ? other.getSurplusPrincipal() == null : this.getSurplusPrincipal().equals(other.getSurplusPrincipal()))
            && (this.getInterestManaFee() == null ? other.getInterestManaFee() == null : this.getInterestManaFee().equals(other.getInterestManaFee()))
            && (this.getIsOverdue() == null ? other.getIsOverdue() == null : this.getIsOverdue().equals(other.getIsOverdue()))
            && (this.getOverdueInterest() == null ? other.getOverdueInterest() == null : this.getOverdueInterest().equals(other.getOverdueInterest()))
            && (this.getOverdueDays() == null ? other.getOverdueDays() == null : this.getOverdueDays().equals(other.getOverdueDays()))
            && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
            && (this.getReceState() == null ? other.getReceState() == null : this.getReceState().equals(other.getReceState()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReceNotesDetailId() == null) ? 0 : getReceNotesDetailId().hashCode());
        result = prime * result + ((getReceNotesId() == null) ? 0 : getReceNotesId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAlrReceMoney() == null) ? 0 : getAlrReceMoney().hashCode());
        result = prime * result + ((getNumberPeriod() == null) ? 0 : getNumberPeriod().hashCode());
        result = prime * result + ((getShouldReceDate() == null) ? 0 : getShouldReceDate().hashCode());
        result = prime * result + ((getActualReceDate() == null) ? 0 : getActualReceDate().hashCode());
        result = prime * result + ((getCurrentReceMoeny() == null) ? 0 : getCurrentReceMoeny().hashCode());
        result = prime * result + ((getCurrentRecePrincipal() == null) ? 0 : getCurrentRecePrincipal().hashCode());
        result = prime * result + ((getCurrentReceInterest() == null) ? 0 : getCurrentReceInterest().hashCode());
        result = prime * result + ((getSurplusPrincipal() == null) ? 0 : getSurplusPrincipal().hashCode());
        result = prime * result + ((getInterestManaFee() == null) ? 0 : getInterestManaFee().hashCode());
        result = prime * result + ((getIsOverdue() == null) ? 0 : getIsOverdue().hashCode());
        result = prime * result + ((getOverdueInterest() == null) ? 0 : getOverdueInterest().hashCode());
        result = prime * result + ((getOverdueDays() == null) ? 0 : getOverdueDays().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getReceState() == null) ? 0 : getReceState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}