package com.glacier.netloan.entity.finance;

import java.util.Date;

public class FinanceRecharge {
    private String financeRechargeId;

    private String memberId;

    private String financeRechargeSetId;

    private Float rechargeAmount;

    private Float handlingCharge;

    private Float rechargeRate;

    private Float arriveMoney;

    private String status;

    private String auditor;

    private Date auditDate;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getFinanceRechargeId() {
        return financeRechargeId;
    }

    public void setFinanceRechargeId(String financeRechargeId) {
        this.financeRechargeId = financeRechargeId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getFinanceRechargeSetId() {
        return financeRechargeSetId;
    }

    public void setFinanceRechargeSetId(String financeRechargeSetId) {
        this.financeRechargeSetId = financeRechargeSetId;
    }

    public Float getRechargeAmount() {
        return rechargeAmount;
    }

    public void setRechargeAmount(Float rechargeAmount) {
        this.rechargeAmount = rechargeAmount;
    }

    public Float getHandlingCharge() {
        return handlingCharge;
    }

    public void setHandlingCharge(Float handlingCharge) {
        this.handlingCharge = handlingCharge;
    }

    public Float getRechargeRate() {
        return rechargeRate;
    }

    public void setRechargeRate(Float rechargeRate) {
        this.rechargeRate = rechargeRate;
    }

    public Float getArriveMoney() {
        return arriveMoney;
    }

    public void setArriveMoney(Float arriveMoney) {
        this.arriveMoney = arriveMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        FinanceRecharge other = (FinanceRecharge) that;
        return (this.getFinanceRechargeId() == null ? other.getFinanceRechargeId() == null : this.getFinanceRechargeId().equals(other.getFinanceRechargeId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getFinanceRechargeSetId() == null ? other.getFinanceRechargeSetId() == null : this.getFinanceRechargeSetId().equals(other.getFinanceRechargeSetId()))
            && (this.getRechargeAmount() == null ? other.getRechargeAmount() == null : this.getRechargeAmount().equals(other.getRechargeAmount()))
            && (this.getHandlingCharge() == null ? other.getHandlingCharge() == null : this.getHandlingCharge().equals(other.getHandlingCharge()))
            && (this.getRechargeRate() == null ? other.getRechargeRate() == null : this.getRechargeRate().equals(other.getRechargeRate()))
            && (this.getArriveMoney() == null ? other.getArriveMoney() == null : this.getArriveMoney().equals(other.getArriveMoney()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
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
        result = prime * result + ((getFinanceRechargeId() == null) ? 0 : getFinanceRechargeId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getFinanceRechargeSetId() == null) ? 0 : getFinanceRechargeSetId().hashCode());
        result = prime * result + ((getRechargeAmount() == null) ? 0 : getRechargeAmount().hashCode());
        result = prime * result + ((getHandlingCharge() == null) ? 0 : getHandlingCharge().hashCode());
        result = prime * result + ((getRechargeRate() == null) ? 0 : getRechargeRate().hashCode());
        result = prime * result + ((getArriveMoney() == null) ? 0 : getArriveMoney().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}