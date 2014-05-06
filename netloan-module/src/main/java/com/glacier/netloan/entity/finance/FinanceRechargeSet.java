package com.glacier.netloan.entity.finance;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceRechargeSet {
    private String financeRechargeSetId;

    private String rechargeSetName;

    private Float rechargeRate;

    private String memberType;

    private Float value;

    private String feeWay;

    private String auditState;
    
    private String auditor;

    /**
     * 自定义字段，显示审核人真实姓名
     */
    private String auditorDisplay;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditDate;

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

    public String getFinanceRechargeSetId() {
        return financeRechargeSetId;
    }

    public void setFinanceRechargeSetId(String financeRechargeSetId) {
        this.financeRechargeSetId = financeRechargeSetId;
    }

    public String getRechargeSetName() {
        return rechargeSetName;
    }

    public void setRechargeSetName(String rechargeSetName) {
        this.rechargeSetName = rechargeSetName;
    }

    public Float getRechargeRate() {
        return rechargeRate;
    }

    public void setRechargeRate(Float rechargeRate) {
        this.rechargeRate = rechargeRate;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public String getFeeWay() {
        return feeWay;
    }

    public void setFeeWay(String feeWay) {
        this.feeWay = feeWay;
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
        FinanceRechargeSet other = (FinanceRechargeSet) that;
        return (this.getFinanceRechargeSetId() == null ? other.getFinanceRechargeSetId() == null : this.getFinanceRechargeSetId().equals(other.getFinanceRechargeSetId()))
            && (this.getRechargeSetName() == null ? other.getRechargeSetName() == null : this.getRechargeSetName().equals(other.getRechargeSetName()))
            && (this.getRechargeRate() == null ? other.getRechargeRate() == null : this.getRechargeRate().equals(other.getRechargeRate()))
            && (this.getMemberType() == null ? other.getMemberType() == null : this.getMemberType().equals(other.getMemberType()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getFeeWay() == null ? other.getFeeWay() == null : this.getFeeWay().equals(other.getFeeWay()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
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
        result = prime * result + ((getFinanceRechargeSetId() == null) ? 0 : getFinanceRechargeSetId().hashCode());
        result = prime * result + ((getRechargeSetName() == null) ? 0 : getRechargeSetName().hashCode());
        result = prime * result + ((getRechargeRate() == null) ? 0 : getRechargeRate().hashCode());
        result = prime * result + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getFeeWay() == null) ? 0 : getFeeWay().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
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