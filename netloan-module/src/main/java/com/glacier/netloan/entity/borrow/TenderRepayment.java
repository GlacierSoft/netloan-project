package com.glacier.netloan.entity.borrow;

import java.util.Date;

public class TenderRepayment {
    private String tenderRepaymentId;

    private String repaymentTypeId;

    private String loanTenderId;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getTenderRepaymentId() {
        return tenderRepaymentId;
    }

    public void setTenderRepaymentId(String tenderRepaymentId) {
        this.tenderRepaymentId = tenderRepaymentId;
    }

    public String getRepaymentTypeId() {
        return repaymentTypeId;
    }

    public void setRepaymentTypeId(String repaymentTypeId) {
        this.repaymentTypeId = repaymentTypeId;
    }

    public String getLoanTenderId() {
        return loanTenderId;
    }

    public void setLoanTenderId(String loanTenderId) {
        this.loanTenderId = loanTenderId;
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
        TenderRepayment other = (TenderRepayment) that;
        return (this.getTenderRepaymentId() == null ? other.getTenderRepaymentId() == null : this.getTenderRepaymentId().equals(other.getTenderRepaymentId()))
            && (this.getRepaymentTypeId() == null ? other.getRepaymentTypeId() == null : this.getRepaymentTypeId().equals(other.getRepaymentTypeId()))
            && (this.getLoanTenderId() == null ? other.getLoanTenderId() == null : this.getLoanTenderId().equals(other.getLoanTenderId()))
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
        result = prime * result + ((getTenderRepaymentId() == null) ? 0 : getTenderRepaymentId().hashCode());
        result = prime * result + ((getRepaymentTypeId() == null) ? 0 : getRepaymentTypeId().hashCode());
        result = prime * result + ((getLoanTenderId() == null) ? 0 : getLoanTenderId().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}