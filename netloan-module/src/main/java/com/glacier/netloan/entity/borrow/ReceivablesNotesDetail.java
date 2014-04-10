package com.glacier.netloan.entity.borrow;

import java.util.Date;

public class ReceivablesNotesDetail {
    private String receNotesDetailId;

    private String receNotesId;

    private Float alrReceMoney;

    private String numberPeriod;

    private Date shouldPayDate;

    private Date actualPayDate;

    private Float currentReceMoeny;

    private Float currentRecePrincipal;

    private Float currentReceInterest;

    private Float surplusPrincipal;

    private Float interestManaFee;

    private String isOverdue;

    private Float overdueInterest;

    private Float alrPayMoney;

    private Float income;

    private String receState;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

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

    public Float getAlrPayMoney() {
        return alrPayMoney;
    }

    public void setAlrPayMoney(Float alrPayMoney) {
        this.alrPayMoney = alrPayMoney;
    }

    public Float getIncome() {
        return income;
    }

    public void setIncome(Float income) {
        this.income = income;
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
            && (this.getAlrReceMoney() == null ? other.getAlrReceMoney() == null : this.getAlrReceMoney().equals(other.getAlrReceMoney()))
            && (this.getNumberPeriod() == null ? other.getNumberPeriod() == null : this.getNumberPeriod().equals(other.getNumberPeriod()))
            && (this.getShouldPayDate() == null ? other.getShouldPayDate() == null : this.getShouldPayDate().equals(other.getShouldPayDate()))
            && (this.getActualPayDate() == null ? other.getActualPayDate() == null : this.getActualPayDate().equals(other.getActualPayDate()))
            && (this.getCurrentReceMoeny() == null ? other.getCurrentReceMoeny() == null : this.getCurrentReceMoeny().equals(other.getCurrentReceMoeny()))
            && (this.getCurrentRecePrincipal() == null ? other.getCurrentRecePrincipal() == null : this.getCurrentRecePrincipal().equals(other.getCurrentRecePrincipal()))
            && (this.getCurrentReceInterest() == null ? other.getCurrentReceInterest() == null : this.getCurrentReceInterest().equals(other.getCurrentReceInterest()))
            && (this.getSurplusPrincipal() == null ? other.getSurplusPrincipal() == null : this.getSurplusPrincipal().equals(other.getSurplusPrincipal()))
            && (this.getInterestManaFee() == null ? other.getInterestManaFee() == null : this.getInterestManaFee().equals(other.getInterestManaFee()))
            && (this.getIsOverdue() == null ? other.getIsOverdue() == null : this.getIsOverdue().equals(other.getIsOverdue()))
            && (this.getOverdueInterest() == null ? other.getOverdueInterest() == null : this.getOverdueInterest().equals(other.getOverdueInterest()))
            && (this.getAlrPayMoney() == null ? other.getAlrPayMoney() == null : this.getAlrPayMoney().equals(other.getAlrPayMoney()))
            && (this.getIncome() == null ? other.getIncome() == null : this.getIncome().equals(other.getIncome()))
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
        result = prime * result + ((getAlrReceMoney() == null) ? 0 : getAlrReceMoney().hashCode());
        result = prime * result + ((getNumberPeriod() == null) ? 0 : getNumberPeriod().hashCode());
        result = prime * result + ((getShouldPayDate() == null) ? 0 : getShouldPayDate().hashCode());
        result = prime * result + ((getActualPayDate() == null) ? 0 : getActualPayDate().hashCode());
        result = prime * result + ((getCurrentReceMoeny() == null) ? 0 : getCurrentReceMoeny().hashCode());
        result = prime * result + ((getCurrentRecePrincipal() == null) ? 0 : getCurrentRecePrincipal().hashCode());
        result = prime * result + ((getCurrentReceInterest() == null) ? 0 : getCurrentReceInterest().hashCode());
        result = prime * result + ((getSurplusPrincipal() == null) ? 0 : getSurplusPrincipal().hashCode());
        result = prime * result + ((getInterestManaFee() == null) ? 0 : getInterestManaFee().hashCode());
        result = prime * result + ((getIsOverdue() == null) ? 0 : getIsOverdue().hashCode());
        result = prime * result + ((getOverdueInterest() == null) ? 0 : getOverdueInterest().hashCode());
        result = prime * result + ((getAlrPayMoney() == null) ? 0 : getAlrPayMoney().hashCode());
        result = prime * result + ((getIncome() == null) ? 0 : getIncome().hashCode());
        result = prime * result + ((getReceState() == null) ? 0 : getReceState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}