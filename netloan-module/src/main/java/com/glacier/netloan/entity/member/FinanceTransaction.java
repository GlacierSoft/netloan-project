package com.glacier.netloan.entity.member;

import java.util.Date;

public class FinanceTransaction {
    private String transactionId;

    private String financeMemberId;

    private String memberName;

    private String transactionTarget;

    private String transactionType;

    private Float earningMoney;

    private Float expendMoney;

    private Float usableMoney;

    private Float frozenMoney;

    private Float collectingMoney;

    private Float refundMoney;

    private Float amount;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getFinanceMemberId() {
        return financeMemberId;
    }

    public void setFinanceMemberId(String financeMemberId) {
        this.financeMemberId = financeMemberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getTransactionTarget() {
        return transactionTarget;
    }

    public void setTransactionTarget(String transactionTarget) {
        this.transactionTarget = transactionTarget;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Float getEarningMoney() {
        return earningMoney;
    }

    public void setEarningMoney(Float earningMoney) {
        this.earningMoney = earningMoney;
    }

    public Float getExpendMoney() {
        return expendMoney;
    }

    public void setExpendMoney(Float expendMoney) {
        this.expendMoney = expendMoney;
    }

    public Float getUsableMoney() {
        return usableMoney;
    }

    public void setUsableMoney(Float usableMoney) {
        this.usableMoney = usableMoney;
    }

    public Float getFrozenMoney() {
        return frozenMoney;
    }

    public void setFrozenMoney(Float frozenMoney) {
        this.frozenMoney = frozenMoney;
    }

    public Float getCollectingMoney() {
        return collectingMoney;
    }

    public void setCollectingMoney(Float collectingMoney) {
        this.collectingMoney = collectingMoney;
    }

    public Float getRefundMoney() {
        return refundMoney;
    }

    public void setRefundMoney(Float refundMoney) {
        this.refundMoney = refundMoney;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
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
        FinanceTransaction other = (FinanceTransaction) that;
        return (this.getTransactionId() == null ? other.getTransactionId() == null : this.getTransactionId().equals(other.getTransactionId()))
            && (this.getFinanceMemberId() == null ? other.getFinanceMemberId() == null : this.getFinanceMemberId().equals(other.getFinanceMemberId()))
            && (this.getMemberName() == null ? other.getMemberName() == null : this.getMemberName().equals(other.getMemberName()))
            && (this.getTransactionTarget() == null ? other.getTransactionTarget() == null : this.getTransactionTarget().equals(other.getTransactionTarget()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getEarningMoney() == null ? other.getEarningMoney() == null : this.getEarningMoney().equals(other.getEarningMoney()))
            && (this.getExpendMoney() == null ? other.getExpendMoney() == null : this.getExpendMoney().equals(other.getExpendMoney()))
            && (this.getUsableMoney() == null ? other.getUsableMoney() == null : this.getUsableMoney().equals(other.getUsableMoney()))
            && (this.getFrozenMoney() == null ? other.getFrozenMoney() == null : this.getFrozenMoney().equals(other.getFrozenMoney()))
            && (this.getCollectingMoney() == null ? other.getCollectingMoney() == null : this.getCollectingMoney().equals(other.getCollectingMoney()))
            && (this.getRefundMoney() == null ? other.getRefundMoney() == null : this.getRefundMoney().equals(other.getRefundMoney()))
            && (this.getAmount() == null ? other.getAmount() == null : this.getAmount().equals(other.getAmount()))
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
        result = prime * result + ((getTransactionId() == null) ? 0 : getTransactionId().hashCode());
        result = prime * result + ((getFinanceMemberId() == null) ? 0 : getFinanceMemberId().hashCode());
        result = prime * result + ((getMemberName() == null) ? 0 : getMemberName().hashCode());
        result = prime * result + ((getTransactionTarget() == null) ? 0 : getTransactionTarget().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getEarningMoney() == null) ? 0 : getEarningMoney().hashCode());
        result = prime * result + ((getExpendMoney() == null) ? 0 : getExpendMoney().hashCode());
        result = prime * result + ((getUsableMoney() == null) ? 0 : getUsableMoney().hashCode());
        result = prime * result + ((getFrozenMoney() == null) ? 0 : getFrozenMoney().hashCode());
        result = prime * result + ((getCollectingMoney() == null) ? 0 : getCollectingMoney().hashCode());
        result = prime * result + ((getRefundMoney() == null) ? 0 : getRefundMoney().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}