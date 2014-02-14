package com.glacier.netloan.entity.basicdatas;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class ParameterOptgroup {
    private String optgroupId;

    private String optgroupPid;

    private String optgroupCode;

    private String optgroupName;

    private String optgroupIcon;

    private String optgroupUrl;

    private Integer optgroupNum;

    private String remark;

    private String creater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String updater;

    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    public String getOptgroupId() {
        return optgroupId;
    }

    public void setOptgroupId(String optgroupId) {
        this.optgroupId = optgroupId;
    }

    public String getOptgroupPid() {
        return optgroupPid;
    }

    public void setOptgroupPid(String optgroupPid) {
        this.optgroupPid = optgroupPid;
    }

    public String getOptgroupCode() {
        return optgroupCode;
    }

    public void setOptgroupCode(String optgroupCode) {
        this.optgroupCode = optgroupCode;
    }

    public String getOptgroupName() {
        return optgroupName;
    }

    public void setOptgroupName(String optgroupName) {
        this.optgroupName = optgroupName;
    }

    public String getOptgroupIcon() {
        return optgroupIcon;
    }

    public void setOptgroupIcon(String optgroupIcon) {
        this.optgroupIcon = optgroupIcon;
    }

    public String getOptgroupUrl() {
        return optgroupUrl;
    }

    public void setOptgroupUrl(String optgroupUrl) {
        this.optgroupUrl = optgroupUrl;
    }

    public Integer getOptgroupNum() {
        return optgroupNum;
    }

    public void setOptgroupNum(Integer optgroupNum) {
        this.optgroupNum = optgroupNum;
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
        ParameterOptgroup other = (ParameterOptgroup) that;
        return (this.getOptgroupId() == null ? other.getOptgroupId() == null : this.getOptgroupId().equals(other.getOptgroupId()))
            && (this.getOptgroupPid() == null ? other.getOptgroupPid() == null : this.getOptgroupPid().equals(other.getOptgroupPid()))
            && (this.getOptgroupCode() == null ? other.getOptgroupCode() == null : this.getOptgroupCode().equals(other.getOptgroupCode()))
            && (this.getOptgroupName() == null ? other.getOptgroupName() == null : this.getOptgroupName().equals(other.getOptgroupName()))
            && (this.getOptgroupIcon() == null ? other.getOptgroupIcon() == null : this.getOptgroupIcon().equals(other.getOptgroupIcon()))
            && (this.getOptgroupUrl() == null ? other.getOptgroupUrl() == null : this.getOptgroupUrl().equals(other.getOptgroupUrl()))
            && (this.getOptgroupNum() == null ? other.getOptgroupNum() == null : this.getOptgroupNum().equals(other.getOptgroupNum()))
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
        result = prime * result + ((getOptgroupId() == null) ? 0 : getOptgroupId().hashCode());
        result = prime * result + ((getOptgroupPid() == null) ? 0 : getOptgroupPid().hashCode());
        result = prime * result + ((getOptgroupCode() == null) ? 0 : getOptgroupCode().hashCode());
        result = prime * result + ((getOptgroupName() == null) ? 0 : getOptgroupName().hashCode());
        result = prime * result + ((getOptgroupIcon() == null) ? 0 : getOptgroupIcon().hashCode());
        result = prime * result + ((getOptgroupUrl() == null) ? 0 : getOptgroupUrl().hashCode());
        result = prime * result + ((getOptgroupNum() == null) ? 0 : getOptgroupNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}