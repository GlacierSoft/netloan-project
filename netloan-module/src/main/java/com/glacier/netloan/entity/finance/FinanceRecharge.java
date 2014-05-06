package com.glacier.netloan.entity.finance;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceRecharge {
    private String financeRechargeId;

    private String memberId;

    /**
     * 自定义字段，显示充值会员真实姓名
     */
    private String memberDisplay;
    
    private String financeRechargeSetId;
    
    /**
     * 自定义字段，显示充值类型名称
     */
    private String rechargeSetName;

    private String rechargeCode;

    private Float rechargeAmount;

    private Float handlingCharge;

    private Float rechargeRate;

    private Float arriveMoney;

    private String auditState;

    private String auditor;
    
    /**
     * 自定义字段，显示审核人真实姓名
     */
    private String auditorDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditDate;

    private String auditRemark;

    private String remark;

    private String creater;
    
    /**
     * 自定义字段，显示创建人真实姓名
     */
    private String createrDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;
    
    /**
     * 自定义字段，显示更新人真实姓名
     */
    private String updaterDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
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

    public String getRechargeCode() {
        return rechargeCode;
    }

    public void setRechargeCode(String rechargeCode) {
        this.rechargeCode = rechargeCode;
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

    public String getMemberDisplay() {
		return memberDisplay;
	}

	public void setMemberDisplay(String memberDisplay) {
		this.memberDisplay = memberDisplay;
	}

	public String getRechargeSetName() {
		return rechargeSetName;
	}

	public void setRechargeSetName(String rechargeSetName) {
		this.rechargeSetName = rechargeSetName;
	}

	public String getAuditorDisplay() {
		return auditorDisplay;
	}

	public void setAuditorDisplay(String auditorDisplay) {
		this.auditorDisplay = auditorDisplay;
	}

	public String getCreaterDisplay() {
		return createrDisplay;
	}

	public void setCreaterDisplay(String createrDisplay) {
		this.createrDisplay = createrDisplay;
	}

	public String getUpdaterDisplay() {
		return updaterDisplay;
	}

	public void setUpdaterDisplay(String updaterDisplay) {
		this.updaterDisplay = updaterDisplay;
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
            && (this.getRechargeCode() == null ? other.getRechargeCode() == null : this.getRechargeCode().equals(other.getRechargeCode()))
            && (this.getRechargeAmount() == null ? other.getRechargeAmount() == null : this.getRechargeAmount().equals(other.getRechargeAmount()))
            && (this.getHandlingCharge() == null ? other.getHandlingCharge() == null : this.getHandlingCharge().equals(other.getHandlingCharge()))
            && (this.getRechargeRate() == null ? other.getRechargeRate() == null : this.getRechargeRate().equals(other.getRechargeRate()))
            && (this.getArriveMoney() == null ? other.getArriveMoney() == null : this.getArriveMoney().equals(other.getArriveMoney()))
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
        result = prime * result + ((getFinanceRechargeId() == null) ? 0 : getFinanceRechargeId().hashCode());
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getFinanceRechargeSetId() == null) ? 0 : getFinanceRechargeSetId().hashCode());
        result = prime * result + ((getRechargeCode() == null) ? 0 : getRechargeCode().hashCode());
        result = prime * result + ((getRechargeAmount() == null) ? 0 : getRechargeAmount().hashCode());
        result = prime * result + ((getHandlingCharge() == null) ? 0 : getHandlingCharge().hashCode());
        result = prime * result + ((getRechargeRate() == null) ? 0 : getRechargeRate().hashCode());
        result = prime * result + ((getArriveMoney() == null) ? 0 : getArriveMoney().hashCode());
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