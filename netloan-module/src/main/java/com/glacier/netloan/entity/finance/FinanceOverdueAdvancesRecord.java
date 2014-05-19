package com.glacier.netloan.entity.finance;

import java.util.Date;

public class FinanceOverdueAdvancesRecord {
    private String advancesRecordId;

    private String overdueAdvancesId;

    private String platformTransactionId;

    private String memberId;

    private String repayNotesDetailId;

    private String memberType;

    private String advancesPercent;

    private String advancesMoney;

    private String auditState;

    private String auditor;

    private Date auditDate;

    private String auditRemark;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getAdvancesRecordId() {
        return advancesRecordId;
    }

    public void setAdvancesRecordId(String advancesRecordId) {
        this.advancesRecordId = advancesRecordId;
    }

    public String getOverdueAdvancesId() {
        return overdueAdvancesId;
    }

    public void setOverdueAdvancesId(String overdueAdvancesId) {
        this.overdueAdvancesId = overdueAdvancesId;
    }

    public String getPlatformTransactionId() {
        return platformTransactionId;
    }

    public void setPlatformTransactionId(String platformTransactionId) {
        this.platformTransactionId = platformTransactionId;
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

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getAdvancesPercent() {
        return advancesPercent;
    }

    public void setAdvancesPercent(String advancesPercent) {
        this.advancesPercent = advancesPercent;
    }

    public String getAdvancesMoney() {
        return advancesMoney;
    }

    public void setAdvancesMoney(String advancesMoney) {
        this.advancesMoney = advancesMoney;
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
        FinanceOverdueAdvancesRecord other = (FinanceOverdueAdvancesRecord) that;
        return (this.getAdvancesRecordId() == null ? other.getAdvancesRecordId() == null : this.getAdvancesRecordId().equals(other.getAdvancesRecordId()))
            && (this.getOverdueAdvancesId() == null ? other.getOverdueAdvancesId() == null : this.getOverdueAdvancesId().equals(other.getOverdueAdvancesId()))
            && (this.getPlatformTransactionId() == null ? other.getPlatformTransactionId() == null : this.getPlatformTransactionId().equals(other.getPlatformTransactionId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getRepayNotesDetailId() == null ? other.getRepayNotesDetailId() == null : this.getRepayNotesDetailId().equals(other.getRepayNotesDetailId()))
            && (this.getMemberType() == null ? other.getMemberType() == null : this.getMemberType().equals(other.getMemberType()))
            && (this.getAdvancesPercent() == null ? other.getAdvancesPercent() == null : this.getAdvancesPercent().equals(other.getAdvancesPercent()))
            && (this.getAdvancesMoney() == null ? other.getAdvancesMoney() == null : this.getAdvancesMoney().equals(other.getAdvancesMoney()))
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
        result = prime * result + ((getAdvancesRecordId() == null) ? 0 : getAdvancesRecordId().hashCode());
        result = prime * result + ((getOverdueAdvancesId() == null) ? 0 : getOverdueAdvancesId().hashCode());
        result = prime * result + ((getPlatformTransactionId() == null) ? 0 : getPlatformTransactionId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getRepayNotesDetailId() == null) ? 0 : getRepayNotesDetailId().hashCode());
        result = prime * result + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        result = prime * result + ((getAdvancesPercent() == null) ? 0 : getAdvancesPercent().hashCode());
        result = prime * result + ((getAdvancesMoney() == null) ? 0 : getAdvancesMoney().hashCode());
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