package com.glacier.netloan.entity.member;

import java.util.Date;

public class ApplicationAmount {
    private String appAmountId;

    private String memberId;

    private String appType;

    private Float originalAmount;

    private Float appMoney;

    private String appExplanation;

    private String authorizedAmount;

    private String auditState;

    private String processExplanation;

    private Date appDate;

    private String auditorId;

    private Date auditDate;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getAppAmountId() {
        return appAmountId;
    }

    public void setAppAmountId(String appAmountId) {
        this.appAmountId = appAmountId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    public Float getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(Float originalAmount) {
        this.originalAmount = originalAmount;
    }

    public Float getAppMoney() {
        return appMoney;
    }

    public void setAppMoney(Float appMoney) {
        this.appMoney = appMoney;
    }

    public String getAppExplanation() {
        return appExplanation;
    }

    public void setAppExplanation(String appExplanation) {
        this.appExplanation = appExplanation;
    }

    public String getAuthorizedAmount() {
        return authorizedAmount;
    }

    public void setAuthorizedAmount(String authorizedAmount) {
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

    public Date getAppDate() {
        return appDate;
    }

    public void setAppDate(Date appDate) {
        this.appDate = appDate;
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
        ApplicationAmount other = (ApplicationAmount) that;
        return (this.getAppAmountId() == null ? other.getAppAmountId() == null : this.getAppAmountId().equals(other.getAppAmountId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getAppType() == null ? other.getAppType() == null : this.getAppType().equals(other.getAppType()))
            && (this.getOriginalAmount() == null ? other.getOriginalAmount() == null : this.getOriginalAmount().equals(other.getOriginalAmount()))
            && (this.getAppMoney() == null ? other.getAppMoney() == null : this.getAppMoney().equals(other.getAppMoney()))
            && (this.getAppExplanation() == null ? other.getAppExplanation() == null : this.getAppExplanation().equals(other.getAppExplanation()))
            && (this.getAuthorizedAmount() == null ? other.getAuthorizedAmount() == null : this.getAuthorizedAmount().equals(other.getAuthorizedAmount()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getProcessExplanation() == null ? other.getProcessExplanation() == null : this.getProcessExplanation().equals(other.getProcessExplanation()))
            && (this.getAppDate() == null ? other.getAppDate() == null : this.getAppDate().equals(other.getAppDate()))
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
        result = prime * result + ((getAppAmountId() == null) ? 0 : getAppAmountId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getAppType() == null) ? 0 : getAppType().hashCode());
        result = prime * result + ((getOriginalAmount() == null) ? 0 : getOriginalAmount().hashCode());
        result = prime * result + ((getAppMoney() == null) ? 0 : getAppMoney().hashCode());
        result = prime * result + ((getAppExplanation() == null) ? 0 : getAppExplanation().hashCode());
        result = prime * result + ((getAuthorizedAmount() == null) ? 0 : getAuthorizedAmount().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getProcessExplanation() == null) ? 0 : getProcessExplanation().hashCode());
        result = prime * result + ((getAppDate() == null) ? 0 : getAppDate().hashCode());
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