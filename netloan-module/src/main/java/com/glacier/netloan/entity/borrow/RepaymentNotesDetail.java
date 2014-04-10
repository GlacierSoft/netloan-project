package com.glacier.netloan.entity.borrow;

import java.util.Date;

public class RepaymentNotesDetail {
    private String repayNotesDetailId;

    private String repayNotesId;

    private Float numberPeriod;

    private Date shouldPayDate;

    private Date actualPayDate;

    private Float currentPayMoeny;

    private Float currentPayPrincipal;

    private Float currentPayInterest;

    private Float actualPayMoney;

    private Float alsoNeedMoney;

    private Float overdueInterest;

    private Float overdueUrgeFee;

    private Float overdueManaFee;

    private Date overdueDays;

    private String isOverdue;

    private String isAdvances;

    private String repayState;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getRepayNotesDetailId() {
        return repayNotesDetailId;
    }

    public void setRepayNotesDetailId(String repayNotesDetailId) {
        this.repayNotesDetailId = repayNotesDetailId;
    }

    public String getRepayNotesId() {
        return repayNotesId;
    }

    public void setRepayNotesId(String repayNotesId) {
        this.repayNotesId = repayNotesId;
    }

    public Float getNumberPeriod() {
        return numberPeriod;
    }

    public void setNumberPeriod(Float numberPeriod) {
        this.numberPeriod = numberPeriod;
    }

    public Date getShouldPayDate() {
        return shouldPayDate;
    }

    public void setShouldPayDate(Date shouldPayDate) {
        this.shouldPayDate = shouldPayDate;
    }

    public Date getActualPayDate() {
        return actualPayDate;
    }

    public void setActualPayDate(Date actualPayDate) {
        this.actualPayDate = actualPayDate;
    }

    public Float getCurrentPayMoeny() {
        return currentPayMoeny;
    }

    public void setCurrentPayMoeny(Float currentPayMoeny) {
        this.currentPayMoeny = currentPayMoeny;
    }

    public Float getCurrentPayPrincipal() {
        return currentPayPrincipal;
    }

    public void setCurrentPayPrincipal(Float currentPayPrincipal) {
        this.currentPayPrincipal = currentPayPrincipal;
    }

    public Float getCurrentPayInterest() {
        return currentPayInterest;
    }

    public void setCurrentPayInterest(Float currentPayInterest) {
        this.currentPayInterest = currentPayInterest;
    }

    public Float getActualPayMoney() {
        return actualPayMoney;
    }

    public void setActualPayMoney(Float actualPayMoney) {
        this.actualPayMoney = actualPayMoney;
    }

    public Float getAlsoNeedMoney() {
        return alsoNeedMoney;
    }

    public void setAlsoNeedMoney(Float alsoNeedMoney) {
        this.alsoNeedMoney = alsoNeedMoney;
    }

    public Float getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(Float overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Float getOverdueUrgeFee() {
        return overdueUrgeFee;
    }

    public void setOverdueUrgeFee(Float overdueUrgeFee) {
        this.overdueUrgeFee = overdueUrgeFee;
    }

    public Float getOverdueManaFee() {
        return overdueManaFee;
    }

    public void setOverdueManaFee(Float overdueManaFee) {
        this.overdueManaFee = overdueManaFee;
    }

    public Date getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Date overdueDays) {
        this.overdueDays = overdueDays;
    }

    public String getIsOverdue() {
        return isOverdue;
    }

    public void setIsOverdue(String isOverdue) {
        this.isOverdue = isOverdue;
    }

    public String getIsAdvances() {
        return isAdvances;
    }

    public void setIsAdvances(String isAdvances) {
        this.isAdvances = isAdvances;
    }

    public String getRepayState() {
        return repayState;
    }

    public void setRepayState(String repayState) {
        this.repayState = repayState;
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
        RepaymentNotesDetail other = (RepaymentNotesDetail) that;
        return (this.getRepayNotesDetailId() == null ? other.getRepayNotesDetailId() == null : this.getRepayNotesDetailId().equals(other.getRepayNotesDetailId()))
            && (this.getRepayNotesId() == null ? other.getRepayNotesId() == null : this.getRepayNotesId().equals(other.getRepayNotesId()))
            && (this.getNumberPeriod() == null ? other.getNumberPeriod() == null : this.getNumberPeriod().equals(other.getNumberPeriod()))
            && (this.getShouldPayDate() == null ? other.getShouldPayDate() == null : this.getShouldPayDate().equals(other.getShouldPayDate()))
            && (this.getActualPayDate() == null ? other.getActualPayDate() == null : this.getActualPayDate().equals(other.getActualPayDate()))
            && (this.getCurrentPayMoeny() == null ? other.getCurrentPayMoeny() == null : this.getCurrentPayMoeny().equals(other.getCurrentPayMoeny()))
            && (this.getCurrentPayPrincipal() == null ? other.getCurrentPayPrincipal() == null : this.getCurrentPayPrincipal().equals(other.getCurrentPayPrincipal()))
            && (this.getCurrentPayInterest() == null ? other.getCurrentPayInterest() == null : this.getCurrentPayInterest().equals(other.getCurrentPayInterest()))
            && (this.getActualPayMoney() == null ? other.getActualPayMoney() == null : this.getActualPayMoney().equals(other.getActualPayMoney()))
            && (this.getAlsoNeedMoney() == null ? other.getAlsoNeedMoney() == null : this.getAlsoNeedMoney().equals(other.getAlsoNeedMoney()))
            && (this.getOverdueInterest() == null ? other.getOverdueInterest() == null : this.getOverdueInterest().equals(other.getOverdueInterest()))
            && (this.getOverdueUrgeFee() == null ? other.getOverdueUrgeFee() == null : this.getOverdueUrgeFee().equals(other.getOverdueUrgeFee()))
            && (this.getOverdueManaFee() == null ? other.getOverdueManaFee() == null : this.getOverdueManaFee().equals(other.getOverdueManaFee()))
            && (this.getOverdueDays() == null ? other.getOverdueDays() == null : this.getOverdueDays().equals(other.getOverdueDays()))
            && (this.getIsOverdue() == null ? other.getIsOverdue() == null : this.getIsOverdue().equals(other.getIsOverdue()))
            && (this.getIsAdvances() == null ? other.getIsAdvances() == null : this.getIsAdvances().equals(other.getIsAdvances()))
            && (this.getRepayState() == null ? other.getRepayState() == null : this.getRepayState().equals(other.getRepayState()))
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
        result = prime * result + ((getRepayNotesDetailId() == null) ? 0 : getRepayNotesDetailId().hashCode());
        result = prime * result + ((getRepayNotesId() == null) ? 0 : getRepayNotesId().hashCode());
        result = prime * result + ((getNumberPeriod() == null) ? 0 : getNumberPeriod().hashCode());
        result = prime * result + ((getShouldPayDate() == null) ? 0 : getShouldPayDate().hashCode());
        result = prime * result + ((getActualPayDate() == null) ? 0 : getActualPayDate().hashCode());
        result = prime * result + ((getCurrentPayMoeny() == null) ? 0 : getCurrentPayMoeny().hashCode());
        result = prime * result + ((getCurrentPayPrincipal() == null) ? 0 : getCurrentPayPrincipal().hashCode());
        result = prime * result + ((getCurrentPayInterest() == null) ? 0 : getCurrentPayInterest().hashCode());
        result = prime * result + ((getActualPayMoney() == null) ? 0 : getActualPayMoney().hashCode());
        result = prime * result + ((getAlsoNeedMoney() == null) ? 0 : getAlsoNeedMoney().hashCode());
        result = prime * result + ((getOverdueInterest() == null) ? 0 : getOverdueInterest().hashCode());
        result = prime * result + ((getOverdueUrgeFee() == null) ? 0 : getOverdueUrgeFee().hashCode());
        result = prime * result + ((getOverdueManaFee() == null) ? 0 : getOverdueManaFee().hashCode());
        result = prime * result + ((getOverdueDays() == null) ? 0 : getOverdueDays().hashCode());
        result = prime * result + ((getIsOverdue() == null) ? 0 : getIsOverdue().hashCode());
        result = prime * result + ((getIsAdvances() == null) ? 0 : getIsAdvances().hashCode());
        result = prime * result + ((getRepayState() == null) ? 0 : getRepayState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}