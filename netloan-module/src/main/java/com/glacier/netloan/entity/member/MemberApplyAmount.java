package com.glacier.netloan.entity.member;

import java.util.Date;

public class MemberApplyAmount {
    private String applyAmountId;

    private String memberId;

    private String applyType;

    private Float originalAmount;

    private Float applyMoney;

    private String applyExplanation;

    private Float authorizedAmount;

    private String auditState;

    private String processExplanation;

    private Date applyDate;

    private String auditorId;

    private Date auditDate;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getApplyAmountId() {
        return applyAmountId;
    }

    public void setApplyAmountId(String applyAmountId) {
        this.applyAmountId = applyAmountId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public Float getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Float originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Float getApplyMoney() {
        return applyMoney;
    }

    public void setApplyMoney(Float applyMoney) {
        this.applyMoney = applyMoney;
    }

    public String getApplyExplanation() {
        return applyExplanation;
    }

    public void setApplyExplanation(String applyExplanation) {
        this.applyExplanation = applyExplanation;
    }

    public Float getAuthorizedAmount() {
        return authorizedAmount;
    }

    public void setAuthorizedAmount(Float authorizedAmount) {
        this.authorizedAmount = authorizedAmount;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getProcessExplanation() {
        return processExplanation;
    }

    public void setProcessExplanation(String processExplanation) {
        this.processExplanation = processExplanation;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId;
    }

    public Date getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
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
        MemberApplyAmount other = (MemberApplyAmount) that;
        return (this.getApplyAmountId() == null ? other.getApplyAmountId() == null : this.getApplyAmountId().equals(other.getApplyAmountId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getApplyType() == null ? other.getApplyType() == null : this.getApplyType().equals(other.getApplyType()))
            && (this.getOriginalAmount() == null ? other.getOriginalAmount() == null : this.getOriginalAmount().equals(other.getOriginalAmount()))
            && (this.getApplyMoney() == null ? other.getApplyMoney() == null : this.getApplyMoney().equals(other.getApplyMoney()))
            && (this.getApplyExplanation() == null ? other.getApplyExplanation() == null : this.getApplyExplanation().equals(other.getApplyExplanation()))
            && (this.getAuthorizedAmount() == null ? other.getAuthorizedAmount() == null : this.getAuthorizedAmount().equals(other.getAuthorizedAmount()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getProcessExplanation() == null ? other.getProcessExplanation() == null : this.getProcessExplanation().equals(other.getProcessExplanation()))
            && (this.getApplyDate() == null ? other.getApplyDate() == null : this.getApplyDate().equals(other.getApplyDate()))
            && (this.getAuditorId() == null ? other.getAuditorId() == null : this.getAuditorId().equals(other.getAuditorId()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
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
        result = prime * result + ((getApplyAmountId() == null) ? 0 : getApplyAmountId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getApplyType() == null) ? 0 : getApplyType().hashCode());
        result = prime * result + ((getOriginalAmount() == null) ? 0 : getOriginalAmount().hashCode());
        result = prime * result + ((getApplyMoney() == null) ? 0 : getApplyMoney().hashCode());
        result = prime * result + ((getApplyExplanation() == null) ? 0 : getApplyExplanation().hashCode());
        result = prime * result + ((getAuthorizedAmount() == null) ? 0 : getAuthorizedAmount().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getProcessExplanation() == null) ? 0 : getProcessExplanation().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        result = prime * result + ((getAuditorId() == null) ? 0 : getAuditorId().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}