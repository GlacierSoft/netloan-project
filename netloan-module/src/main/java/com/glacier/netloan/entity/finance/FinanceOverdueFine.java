package com.glacier.netloan.entity.finance;

import java.util.Date;

public class FinanceOverdueFine {
    private String overdueFineId;

    private String overdueFineSetId;

    private String overdueFineSetName;

    private String memberId;

    private String repayNotesDetailId;

    private Float overdueFineMoney;

    private Date shouldPayDate;

    private Date actualPayDate;

    private String auditState;

    private String auditor;

    private Date auditDate;

    private String auditRemark;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getOverdueFineId() {
        return overdueFineId;
    }

    public void setOverdueFineId(String overdueFineId) {
        this.overdueFineId = overdueFineId;
    }

    public String getOverdueFineSetId() {
        return overdueFineSetId;
    }

    public void setOverdueFineSetId(String overdueFineSetId) {
        this.overdueFineSetId = overdueFineSetId;
    }

    public String getOverdueFineSetName() {
        return overdueFineSetName;
    }

    public void setOverdueFineSetName(String overdueFineSetName) {
        this.overdueFineSetName = overdueFineSetName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getRepayNotesDetailId() {
        return repayNotesDetailId;
    }

    public void setRepayNotesDetailId(String repayNotesDetailId) {
        this.repayNotesDetailId = repayNotesDetailId;
    }

    public Float getOverdueFineMoney() {
        return overdueFineMoney;
    }

    public void setOverdueFineMoney(Float overdueFineMoney) {
        this.overdueFineMoney = overdueFineMoney;
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

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
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
        FinanceOverdueFine other = (FinanceOverdueFine) that;
        return (this.getOverdueFineId() == null ? other.getOverdueFineId() == null : this.getOverdueFineId().equals(other.getOverdueFineId()))
            && (this.getOverdueFineSetId() == null ? other.getOverdueFineSetId() == null : this.getOverdueFineSetId().equals(other.getOverdueFineSetId()))
            && (this.getOverdueFineSetName() == null ? other.getOverdueFineSetName() == null : this.getOverdueFineSetName().equals(other.getOverdueFineSetName()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getRepayNotesDetailId() == null ? other.getRepayNotesDetailId() == null : this.getRepayNotesDetailId().equals(other.getRepayNotesDetailId()))
            && (this.getOverdueFineMoney() == null ? other.getOverdueFineMoney() == null : this.getOverdueFineMoney().equals(other.getOverdueFineMoney()))
            && (this.getShouldPayDate() == null ? other.getShouldPayDate() == null : this.getShouldPayDate().equals(other.getShouldPayDate()))
            && (this.getActualPayDate() == null ? other.getActualPayDate() == null : this.getActualPayDate().equals(other.getActualPayDate()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
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
        result = prime * result + ((getOverdueFineId() == null) ? 0 : getOverdueFineId().hashCode());
        result = prime * result + ((getOverdueFineSetId() == null) ? 0 : getOverdueFineSetId().hashCode());
        result = prime * result + ((getOverdueFineSetName() == null) ? 0 : getOverdueFineSetName().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getRepayNotesDetailId() == null) ? 0 : getRepayNotesDetailId().hashCode());
        result = prime * result + ((getOverdueFineMoney() == null) ? 0 : getOverdueFineMoney().hashCode());
        result = prime * result + ((getShouldPayDate() == null) ? 0 : getShouldPayDate().hashCode());
        result = prime * result + ((getActualPayDate() == null) ? 0 : getActualPayDate().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}