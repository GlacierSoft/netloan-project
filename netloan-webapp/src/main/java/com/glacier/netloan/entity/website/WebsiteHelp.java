package com.glacier.netloan.entity.website;

import java.util.Date;

public class WebsiteHelp {
    private String webHelpId;

    private String webHelpTheme;

    private String webHelpType;

    private String webHelpStatus;

    private String accessory;

    private Integer webClaNum;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private String webHelpContent;

    public String getWebHelpId() {
        return webHelpId;
    }

    public void setWebHelpId(String webHelpId) {
        this.webHelpId = webHelpId;
    }

    public String getWebHelpTheme() {
        return webHelpTheme;
    }

    public void setWebHelpTheme(String webHelpTheme) {
        this.webHelpTheme = webHelpTheme;
    }

    public String getWebHelpType() {
        return webHelpType;
    }

    public void setWebHelpType(String webHelpType) {
        this.webHelpType = webHelpType;
    }

    public String getWebHelpStatus() {
        return webHelpStatus;
    }

    public void setWebHelpStatus(String webHelpStatus) {
        this.webHelpStatus = webHelpStatus;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getWebClaNum() {
        return webClaNum;
    }

    public void setWebClaNum(Integer webClaNum) {
        this.webClaNum = webClaNum;
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

    public String getWebHelpContent() {
        return webHelpContent;
    }

    public void setWebHelpContent(String webHelpContent) {
        this.webHelpContent = webHelpContent;
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
        WebsiteHelp other = (WebsiteHelp) that;
        return (this.getWebHelpId() == null ? other.getWebHelpId() == null : this.getWebHelpId().equals(other.getWebHelpId()))
            && (this.getWebHelpTheme() == null ? other.getWebHelpTheme() == null : this.getWebHelpTheme().equals(other.getWebHelpTheme()))
            && (this.getWebHelpType() == null ? other.getWebHelpType() == null : this.getWebHelpType().equals(other.getWebHelpType()))
            && (this.getWebHelpStatus() == null ? other.getWebHelpStatus() == null : this.getWebHelpStatus().equals(other.getWebHelpStatus()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getWebClaNum() == null ? other.getWebClaNum() == null : this.getWebClaNum().equals(other.getWebClaNum()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdater() == null ? other.getUpdater() == null : this.getUpdater().equals(other.getUpdater()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getWebHelpContent() == null ? other.getWebHelpContent() == null : this.getWebHelpContent().equals(other.getWebHelpContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWebHelpId() == null) ? 0 : getWebHelpId().hashCode());
        result = prime * result + ((getWebHelpTheme() == null) ? 0 : getWebHelpTheme().hashCode());
        result = prime * result + ((getWebHelpType() == null) ? 0 : getWebHelpType().hashCode());
        result = prime * result + ((getWebHelpStatus() == null) ? 0 : getWebHelpStatus().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getWebClaNum() == null) ? 0 : getWebClaNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getWebHelpContent() == null) ? 0 : getWebHelpContent().hashCode());
        return result;
    }
}