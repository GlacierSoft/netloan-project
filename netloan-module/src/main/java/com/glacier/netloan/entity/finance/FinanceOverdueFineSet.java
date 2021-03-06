package com.glacier.netloan.entity.finance;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FinanceOverdueFineSet {
    private String overdueFineSetId;

    private String overdueFineSetName;

    private String memberType;

    private String memberPrivilege;

    private Float vipDays;

    private Float value;

    private String feeWay;

    /*
     * 自定义字段，显示审核人真实姓名
     * */
    private String auditorDisplay;
    
    private String createrDisplay;
    
    private String updaterDisplay;
    
    

	private String auditState;

    private String auditor;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date auditTime;

    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
	private Date auditDate;

    private String auditRemark;

    private Float money;

    private String remark;

    private String creater;

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

	@JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

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

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getMemberPrivilege() {
        return memberPrivilege;
    }

    public void setMemberPrivilege(String memberPrivilege) {
        this.memberPrivilege = memberPrivilege;
    }

    public Float getVipDays() {
        return vipDays;
    }

    public void setVipDays(Float vipDays) {
        this.vipDays = vipDays;
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

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
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

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
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
        FinanceOverdueFineSet other = (FinanceOverdueFineSet) that;
        return (this.getOverdueFineSetId() == null ? other.getOverdueFineSetId() == null : this.getOverdueFineSetId().equals(other.getOverdueFineSetId()))
            && (this.getOverdueFineSetName() == null ? other.getOverdueFineSetName() == null : this.getOverdueFineSetName().equals(other.getOverdueFineSetName()))
            && (this.getMemberType() == null ? other.getMemberType() == null : this.getMemberType().equals(other.getMemberType()))
            && (this.getMemberPrivilege() == null ? other.getMemberPrivilege() == null : this.getMemberPrivilege().equals(other.getMemberPrivilege()))
            && (this.getVipDays() == null ? other.getVipDays() == null : this.getVipDays().equals(other.getVipDays()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getFeeWay() == null ? other.getFeeWay() == null : this.getFeeWay().equals(other.getFeeWay()))
            && (this.getAuditState() == null ? other.getAuditState() == null : this.getAuditState().equals(other.getAuditState()))
            && (this.getAuditor() == null ? other.getAuditor() == null : this.getAuditor().equals(other.getAuditor()))
            && (this.getAuditDate() == null ? other.getAuditDate() == null : this.getAuditDate().equals(other.getAuditDate()))
            && (this.getAuditRemark() == null ? other.getAuditRemark() == null : this.getAuditRemark().equals(other.getAuditRemark()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
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
        result = prime * result + ((getOverdueFineSetId() == null) ? 0 : getOverdueFineSetId().hashCode());
        result = prime * result + ((getOverdueFineSetName() == null) ? 0 : getOverdueFineSetName().hashCode());
        result = prime * result + ((getMemberType() == null) ? 0 : getMemberType().hashCode());
        result = prime * result + ((getMemberPrivilege() == null) ? 0 : getMemberPrivilege().hashCode());
        result = prime * result + ((getVipDays() == null) ? 0 : getVipDays().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getFeeWay() == null) ? 0 : getFeeWay().hashCode());
        result = prime * result + ((getAuditState() == null) ? 0 : getAuditState().hashCode());
        result = prime * result + ((getAuditor() == null) ? 0 : getAuditor().hashCode());
        result = prime * result + ((getAuditDate() == null) ? 0 : getAuditDate().hashCode());
        result = prime * result + ((getAuditRemark() == null) ? 0 : getAuditRemark().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}