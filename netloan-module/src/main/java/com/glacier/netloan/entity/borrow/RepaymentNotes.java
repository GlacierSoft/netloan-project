package com.glacier.netloan.entity.borrow;

import java.util.Date;

public class RepaymentNotes {
    private String repayNotesId;

    private String loanId;

    private Float repaymentTotal;

    private Float shouldPayMoney;

    private Float alrPayMoney;

    private Float notPayMoney;

    private Float alrOverdueInterest;

    private Float alrOverdueUrge;

    private Float alrOverdueMana;

    private String repayState;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getRepayNotesId() {
        return repayNotesId;
    }

    public void setRepayNotesId(String repayNotesId) {
        this.repayNotesId = repayNotesId;
    }

    public String getLoanId() {
        return loanId;
    }

    public void setLoanId(String loanId) {
        this.loanId = loanId;
    }

    public Float getRepaymentTotal() {
        return repaymentTotal;
    }

    public void setRepaymentTotal(Float repaymentTotal) {
        this.repaymentTotal = repaymentTotal;
    }

    public Float getShouldPayMoney() {
        return shouldPayMoney;
    }

    public void setShouldPayMoney(Float shouldPayMoney) {
        this.shouldPayMoney = shouldPayMoney;
    }

    public Float getAlrPayMoney() {
        return alrPayMoney;
    }

    public void setAlrPayMoney(Float alrPayMoney) {
        this.alrPayMoney = alrPayMoney;
    }

    public Float getNotPayMoney() {
        return notPayMoney;
    }

    public void setNotPayMoney(Float notPayMoney) {
        this.notPayMoney = notPayMoney;
    }

    public Float getAlrOverdueInterest() {
        return alrOverdueInterest;
    }

    public void setAlrOverdueInterest(Float alrOverdueInterest) {
        this.alrOverdueInterest = alrOverdueInterest;
    }

    public Float getAlrOverdueUrge() {
        return alrOverdueUrge;
    }

    public void setAlrOverdueUrge(Float alrOverdueUrge) {
        this.alrOverdueUrge = alrOverdueUrge;
    }

    public Float getAlrOverdueMana() {
        return alrOverdueMana;
    }

    public void setAlrOverdueMana(Float alrOverdueMana) {
        this.alrOverdueMana = alrOverdueMana;
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
        RepaymentNotes other = (RepaymentNotes) that;
        return (this.getRepayNotesId() == null ? other.getRepayNotesId() == null : this.getRepayNotesId().equals(other.getRepayNotesId()))
            && (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getRepaymentTotal() == null ? other.getRepaymentTotal() == null : this.getRepaymentTotal().equals(other.getRepaymentTotal()))
            && (this.getShouldPayMoney() == null ? other.getShouldPayMoney() == null : this.getShouldPayMoney().equals(other.getShouldPayMoney()))
            && (this.getAlrPayMoney() == null ? other.getAlrPayMoney() == null : this.getAlrPayMoney().equals(other.getAlrPayMoney()))
            && (this.getNotPayMoney() == null ? other.getNotPayMoney() == null : this.getNotPayMoney().equals(other.getNotPayMoney()))
            && (this.getAlrOverdueInterest() == null ? other.getAlrOverdueInterest() == null : this.getAlrOverdueInterest().equals(other.getAlrOverdueInterest()))
            && (this.getAlrOverdueUrge() == null ? other.getAlrOverdueUrge() == null : this.getAlrOverdueUrge().equals(other.getAlrOverdueUrge()))
            && (this.getAlrOverdueMana() == null ? other.getAlrOverdueMana() == null : this.getAlrOverdueMana().equals(other.getAlrOverdueMana()))
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
        result = prime * result + ((getRepayNotesId() == null) ? 0 : getRepayNotesId().hashCode());
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getRepaymentTotal() == null) ? 0 : getRepaymentTotal().hashCode());
        result = prime * result + ((getShouldPayMoney() == null) ? 0 : getShouldPayMoney().hashCode());
        result = prime * result + ((getAlrPayMoney() == null) ? 0 : getAlrPayMoney().hashCode());
        result = prime * result + ((getNotPayMoney() == null) ? 0 : getNotPayMoney().hashCode());
        result = prime * result + ((getAlrOverdueInterest() == null) ? 0 : getAlrOverdueInterest().hashCode());
        result = prime * result + ((getAlrOverdueUrge() == null) ? 0 : getAlrOverdueUrge().hashCode());
        result = prime * result + ((getAlrOverdueMana() == null) ? 0 : getAlrOverdueMana().hashCode());
        result = prime * result + ((getRepayState() == null) ? 0 : getRepayState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}