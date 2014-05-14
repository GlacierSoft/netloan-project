package com.glacier.netloan.entity.finance;

import java.util.Date;

public class FinancePlatformTransaction {
    private String platformTransactionId;

    private String financePlatformId;

    private String transactionTarget;

    private String transactionType;

    private Float earningMoney;

    private Float expendMoney;

    private Float amount;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getPlatformTransactionId() {
        return platformTransactionId;
    }

    public void setPlatformTransactionId(String platformTransactionId) {
        this.platformTransactionId = platformTransactionId;
    }

    public String getFinancePlatformId() {
        return financePlatformId;
    }

    public void setFinancePlatformId(String financePlatformId) {
        this.financePlatformId = financePlatformId;
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
        FinancePlatformTransaction other = (FinancePlatformTransaction) that;
        return (this.getPlatformTransactionId() == null ? other.getPlatformTransactionId() == null : this.getPlatformTransactionId().equals(other.getPlatformTransactionId()))
            && (this.getFinancePlatformId() == null ? other.getFinancePlatformId() == null : this.getFinancePlatformId().equals(other.getFinancePlatformId()))
            && (this.getTransactionTarget() == null ? other.getTransactionTarget() == null : this.getTransactionTarget().equals(other.getTransactionTarget()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getEarningMoney() == null ? other.getEarningMoney() == null : this.getEarningMoney().equals(other.getEarningMoney()))
            && (this.getExpendMoney() == null ? other.getExpendMoney() == null : this.getExpendMoney().equals(other.getExpendMoney()))
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
        result = prime * result + ((getPlatformTransactionId() == null) ? 0 : getPlatformTransactionId().hashCode());
        result = prime * result + ((getFinancePlatformId() == null) ? 0 : getFinancePlatformId().hashCode());
        result = prime * result + ((getTransactionTarget() == null) ? 0 : getTransactionTarget().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getEarningMoney() == null) ? 0 : getEarningMoney().hashCode());
        result = prime * result + ((getExpendMoney() == null) ? 0 : getExpendMoney().hashCode());
        result = prime * result + ((getAmount() == null) ? 0 : getAmount().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}