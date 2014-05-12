package com.glacier.netloan.entity.basicdatas;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParameterBasic {
    private String basicId;

    private String basicTitle;

    private String basicValue;

    private String remark;

    /**
     * 自定义字段，显示创建人真实名字
     */
    private String createrDisplay;
    
    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date createTime;

    /**
     * 自定义字段，显示更新人的真实名字
     */
    private String updaterDisplay;
    
    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss") 
    private Date updateTime;

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

	public String getBasicId() {
        return basicId;
    }

    public void setBasicId(String basicId) {
        this.basicId = basicId;
    }

    public String getBasicTitle() {
        return basicTitle;
    }

    public void setBasicTitle(String basicTitle) {
        this.basicTitle = basicTitle;
    }

    public String getBasicValue() {
        return basicValue;
    }

    public void setBasicValue(String basicValue) {
        this.basicValue = basicValue;
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
        ParameterBasic other = (ParameterBasic) that;
        return (this.getBasicId() == null ? other.getBasicId() == null : this.getBasicId().equals(other.getBasicId()))
            && (this.getBasicTitle() == null ? other.getBasicTitle() == null : this.getBasicTitle().equals(other.getBasicTitle()))
            && (this.getBasicValue() == null ? other.getBasicValue() == null : this.getBasicValue().equals(other.getBasicValue()))
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
        result = prime * result + ((getBasicId() == null) ? 0 : getBasicId().hashCode());
        result = prime * result + ((getBasicTitle() == null) ? 0 : getBasicTitle().hashCode());
        result = prime * result + ((getBasicValue() == null) ? 0 : getBasicValue().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}