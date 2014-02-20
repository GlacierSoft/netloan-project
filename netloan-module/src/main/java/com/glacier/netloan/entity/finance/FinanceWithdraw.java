package com.glacier.netloan.entity.finance;

import java.util.Date;

public class FinanceWithdraw {
    private String financeWithdrawId;

    private String memberId;

    private String openingBank;

    private String subbranch;

    private String cardName;

    private String cardNumber;

    private Float withdrawAmount;

    private Float arriveMoney;

    private Float handlingCharge;

    private Float withdrawRate;

    private String status;

    private String auditor;

    private Date auditDate;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getFinanceWithdrawId() {
        return financeWithdrawId;
    }

    public void setFinanceWithdrawId(String financeWithdrawId) {
        this.financeWithdrawId = financeWithdrawId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getSubbranch() {
        return subbranch;
    }

    public void setSubbranch(String subbranch) {
        this.subbranch = subbranch;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Float getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(Float withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public Float getArriveMoney() {
        return arriveMoney;
    }

    public void setArriveMoney(Float arriveMoney) {
        this.arriveMoney = arriveMoney;
    }

    public Float getHandlingCharge() {
        return handlingCharge;
    }

    public void setHandlingCharge(Float handlingCharge) {
        this.handlingCharge = handlingCharge;
    }

    public Float getWithdrawRate() {
        return withdrawRate;
    }

    public void setWithdrawRate(Float withdrawRate) {
        this.withdrawRate = withdrawRate;
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
        FinanceWithdraw other = (FinanceWithdraw) that;
        return (this.getFinanceWithdrawId() == null ? other.getFinanceWithdrawId() == null : this.getFinanceWithdrawId().equals(other.getFinanceWithdrawId()))
            && (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getOpeningBank() == null ? other.getOpeningBank() == null : this.getOpeningBank().equals(other.getOpeningBank()))
            && (this.getSubbranch() == null ? other.getSubbranch() == null : this.getSubbranch().equals(other.getSubbranch()))
            && (this.getCardName() == null ? other.getCardName() == null : this.getCardName().equals(other.getCardName()))
            && (this.getCardNumber() == null ? other.getCardNumber() == null : this.getCardNumber().equals(other.getCardNumber()))
            && (this.getWithdrawAmount() == null ? other.getWithdrawAmount() == null : this.getWithdrawAmount().equals(other.getWithdrawAmount()))
            && (this.getArriveMoney() == null ? other.getArriveMoney() == null : this.getArriveMoney().equals(other.getArriveMoney()))
            && (this.getHandlingCharge() == null ? other.getHandlingCharge() == null : this.getHandlingCharge().equals(other.getHandlingCharge()))
            && (this.getWithdrawRate() == null ? other.getWithdrawRate() == null : this.getWithdrawRate().equals(other.getWithdrawRate()))
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
        result = prime * result + ((getFinanceWithdrawId() == null) ? 0 : getFinanceWithdrawId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getOpeningBank() == null) ? 0 : getOpeningBank().hashCode());
        result = prime * result + ((getSubbranch() == null) ? 0 : getSubbranch().hashCode());
        result = prime * result + ((getCardName() == null) ? 0 : getCardName().hashCode());
        result = prime * result + ((getCardNumber() == null) ? 0 : getCardNumber().hashCode());
        result = prime * result + ((getWithdrawAmount() == null) ? 0 : getWithdrawAmount().hashCode());
        result = prime * result + ((getArriveMoney() == null) ? 0 : getArriveMoney().hashCode());
        result = prime * result + ((getHandlingCharge() == null) ? 0 : getHandlingCharge().hashCode());
        result = prime * result + ((getWithdrawRate() == null) ? 0 : getWithdrawRate().hashCode());
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