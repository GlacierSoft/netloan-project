package com.glacier.netloan.entity.borrow;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class RepaymentType {
    private String repaymentTypeId;

    private String repaymentTypeName;

    private String algorithmInfo;

    private String state;

    private String remark;

    private String creater;
    
    /**
     * 自定义字段，显示创建人真实名字
     */
    private String createrDisplay;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;
    
    /**
     * 自定义字段，显示更新人的真实名字
     */
    private String updaterDisplay;

    /**
     * 自定义字段，标种类型进行分配还款方式用到
     */
    private boolean checked;
    
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getRepaymentTypeId() {
        return repaymentTypeId;
    }

    public void setRepaymentTypeId(String repaymentTypeId) {
        this.repaymentTypeId = repaymentTypeId;
    }

    public String getRepaymentTypeName() {
        return repaymentTypeName;
    }

    public void setRepaymentTypeName(String repaymentTypeName) {
        this.repaymentTypeName = repaymentTypeName;
    }

    public String getAlgorithmInfo() {
        return algorithmInfo;
    }

    public void setAlgorithmInfo(String algorithmInfo) {
        this.algorithmInfo = algorithmInfo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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

	
	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
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
        RepaymentType other = (RepaymentType) that;
        return (this.getRepaymentTypeId() == null ? other.getRepaymentTypeId() == null : this.getRepaymentTypeId().equals(other.getRepaymentTypeId()))
            && (this.getRepaymentTypeName() == null ? other.getRepaymentTypeName() == null : this.getRepaymentTypeName().equals(other.getRepaymentTypeName()))
            && (this.getAlgorithmInfo() == null ? other.getAlgorithmInfo() == null : this.getAlgorithmInfo().equals(other.getAlgorithmInfo()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
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
        result = prime * result + ((getRepaymentTypeId() == null) ? 0 : getRepaymentTypeId().hashCode());
        result = prime * result + ((getRepaymentTypeName() == null) ? 0 : getRepaymentTypeName().hashCode());
        result = prime * result + ((getAlgorithmInfo() == null) ? 0 : getAlgorithmInfo().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}