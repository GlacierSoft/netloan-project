package com.glacier.netloan.entity.borrow;

import java.util.Date;

public class OverdueNotes {
    private String overdueNotesId;

    private String repayNotesDetailId;

    private String overdueResult;

    private String nameRemark;

    private String remark;

    private String creater;

    private Date createTime;

    public String getOverdueNotesId() {
        return overdueNotesId;
    }

    public void setOverdueNotesId(String overdueNotesId) {
        this.overdueNotesId = overdueNotesId;
    }

    public String getRepayNotesDetailId() {
        return repayNotesDetailId;
    }

    public void setRepayNotesDetailId(String repayNotesDetailId) {
        this.repayNotesDetailId = repayNotesDetailId;
    }

    public String getOverdueResult() {
        return overdueResult;
    }

    public void setOverdueResult(String overdueResult) {
        this.overdueResult = overdueResult;
    }

    public String getNameRemark() {
        return nameRemark;
    }

    public void setNameRemark(String nameRemark) {
        this.nameRemark = nameRemark;
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
        OverdueNotes other = (OverdueNotes) that;
        return (this.getOverdueNotesId() == null ? other.getOverdueNotesId() == null : this.getOverdueNotesId().equals(other.getOverdueNotesId()))
            && (this.getRepayNotesDetailId() == null ? other.getRepayNotesDetailId() == null : this.getRepayNotesDetailId().equals(other.getRepayNotesDetailId()))
            && (this.getOverdueResult() == null ? other.getOverdueResult() == null : this.getOverdueResult().equals(other.getOverdueResult()))
            && (this.getNameRemark() == null ? other.getNameRemark() == null : this.getNameRemark().equals(other.getNameRemark()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOverdueNotesId() == null) ? 0 : getOverdueNotesId().hashCode());
        result = prime * result + ((getRepayNotesDetailId() == null) ? 0 : getRepayNotesDetailId().hashCode());
        result = prime * result + ((getOverdueResult() == null) ? 0 : getOverdueResult().hashCode());
        result = prime * result + ((getNameRemark() == null) ? 0 : getNameRemark().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}