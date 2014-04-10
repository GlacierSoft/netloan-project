package com.glacier.netloan.entity.borrow;

import java.util.Date;

public class ReceivablesNotes {
    private String receNotesId;

    private String tenderNotesId;

    private Float receivablesTotal;

    private Float shouldReceMoney;

    private Float alrReceMoney;

    private Float notReceMoney;

    private Float alrOverdueInterest;

    private String receState;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getReceNotesId() {
        return receNotesId;
    }

    public void setReceNotesId(String receNotesId) {
        this.receNotesId = receNotesId;
    }

    public String getTenderNotesId() {
        return tenderNotesId;
    }

    public void setTenderNotesId(String tenderNotesId) {
        this.tenderNotesId = tenderNotesId;
    }

    public Float getReceivablesTotal() {
        return receivablesTotal;
    }

    public void setReceivablesTotal(Float receivablesTotal) {
        this.receivablesTotal = receivablesTotal;
    }

    public Float getShouldReceMoney() {
        return shouldReceMoney;
    }

    public void setShouldReceMoney(Float shouldReceMoney) {
        this.shouldReceMoney = shouldReceMoney;
    }

    public Float getAlrReceMoney() {
        return alrReceMoney;
    }

    public void setAlrReceMoney(Float alrReceMoney) {
        this.alrReceMoney = alrReceMoney;
    }

    public Float getNotReceMoney() {
        return notReceMoney;
    }

    public void setNotReceMoney(Float notReceMoney) {
        this.notReceMoney = notReceMoney;
    }

    public Float getAlrOverdueInterest() {
        return alrOverdueInterest;
    }

    public void setAlrOverdueInterest(Float alrOverdueInterest) {
        this.alrOverdueInterest = alrOverdueInterest;
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
        ReceivablesNotes other = (ReceivablesNotes) that;
        return (this.getReceNotesId() == null ? other.getReceNotesId() == null : this.getReceNotesId().equals(other.getReceNotesId()))
            && (this.getTenderNotesId() == null ? other.getTenderNotesId() == null : this.getTenderNotesId().equals(other.getTenderNotesId()))
            && (this.getReceivablesTotal() == null ? other.getReceivablesTotal() == null : this.getReceivablesTotal().equals(other.getReceivablesTotal()))
            && (this.getShouldReceMoney() == null ? other.getShouldReceMoney() == null : this.getShouldReceMoney().equals(other.getShouldReceMoney()))
            && (this.getAlrReceMoney() == null ? other.getAlrReceMoney() == null : this.getAlrReceMoney().equals(other.getAlrReceMoney()))
            && (this.getNotReceMoney() == null ? other.getNotReceMoney() == null : this.getNotReceMoney().equals(other.getNotReceMoney()))
            && (this.getAlrOverdueInterest() == null ? other.getAlrOverdueInterest() == null : this.getAlrOverdueInterest().equals(other.getAlrOverdueInterest()))
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
        result = prime * result + ((getReceNotesId() == null) ? 0 : getReceNotesId().hashCode());
        result = prime * result + ((getTenderNotesId() == null) ? 0 : getTenderNotesId().hashCode());
        result = prime * result + ((getReceivablesTotal() == null) ? 0 : getReceivablesTotal().hashCode());
        result = prime * result + ((getShouldReceMoney() == null) ? 0 : getShouldReceMoney().hashCode());
        result = prime * result + ((getAlrReceMoney() == null) ? 0 : getAlrReceMoney().hashCode());
        result = prime * result + ((getNotReceMoney() == null) ? 0 : getNotReceMoney().hashCode());
        result = prime * result + ((getAlrOverdueInterest() == null) ? 0 : getAlrOverdueInterest().hashCode());
        result = prime * result + ((getReceState() == null) ? 0 : getReceState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}