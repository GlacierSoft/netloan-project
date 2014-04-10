package com.glacier.netloan.entity.borrow;

import java.util.Date;

public class TenderNotes {
    private String tenderNotesId;

    private String loanId;

    private String memberId;

    private Float subSum;

    private Float tenderMoney;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getTenderNotesId() {
        return tenderNotesId;
    }

    public void setTenderNotesId(String tenderNotesId) {
        this.tenderNotesId = tenderNotesId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public Float getSubSum() {
        return subSum;
    }

    public void setSubSum(Float subSum) {
        this.subSum = subSum;
    }

    public Float getTenderMoney() {
        return tenderMoney;
    }

    public void setTenderMoney(Float tenderMoney) {
        this.tenderMoney = tenderMoney;
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
        TenderNotes other = (TenderNotes) that;
        return (this.getTenderNotesId() == null ? other.getTenderNotesId() == null : this.getTenderNotesId().equals(other.getTenderNotesId()))
            && (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getSubSum() == null ? other.getSubSum() == null : this.getSubSum().equals(other.getSubSum()))
            && (this.getTenderMoney() == null ? other.getTenderMoney() == null : this.getTenderMoney().equals(other.getTenderMoney()))
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
        result = prime * result + ((getTenderNotesId() == null) ? 0 : getTenderNotesId().hashCode());
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getSubSum() == null) ? 0 : getSubSum().hashCode());
        result = prime * result + ((getTenderMoney() == null) ? 0 : getTenderMoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}