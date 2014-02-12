package com.glacier.netloan.entity.website;

import java.util.Date;

public class WebsiteLink {
    private String webLinkId;

    private String webLinkName;

    private String webLinkUrl;

    private String webLinkPhoto;

    private String webLinkStatus;

    private String accessory;

    private Integer webLinkNum;

    private String remark;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    public String getWebLinkId() {
        return webLinkId;
    }

    public void setWebLinkId(String webLinkId) {
        this.webLinkId = webLinkId;
    }

    public String getWebLinkName() {
        return webLinkName;
    }

    public void setWebLinkName(String webLinkName) {
        this.webLinkName = webLinkName;
    }

    public String getWebLinkUrl() {
        return webLinkUrl;
    }

    public void setWebLinkUrl(String webLinkUrl) {
        this.webLinkUrl = webLinkUrl;
    }

    public String getWebLinkPhoto() {
        return webLinkPhoto;
    }

    public void setWebLinkPhoto(String webLinkPhoto) {
        this.webLinkPhoto = webLinkPhoto;
    }

    public String getWebLinkStatus() {
        return webLinkStatus;
    }

    public void setWebLinkStatus(String webLinkStatus) {
        this.webLinkStatus = webLinkStatus;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public Integer getWebLinkNum() {
        return webLinkNum;
    }

    public void setWebLinkNum(Integer webLinkNum) {
        this.webLinkNum = webLinkNum;
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
        WebsiteLink other = (WebsiteLink) that;
        return (this.getWebLinkId() == null ? other.getWebLinkId() == null : this.getWebLinkId().equals(other.getWebLinkId()))
            && (this.getWebLinkName() == null ? other.getWebLinkName() == null : this.getWebLinkName().equals(other.getWebLinkName()))
            && (this.getWebLinkUrl() == null ? other.getWebLinkUrl() == null : this.getWebLinkUrl().equals(other.getWebLinkUrl()))
            && (this.getWebLinkPhoto() == null ? other.getWebLinkPhoto() == null : this.getWebLinkPhoto().equals(other.getWebLinkPhoto()))
            && (this.getWebLinkStatus() == null ? other.getWebLinkStatus() == null : this.getWebLinkStatus().equals(other.getWebLinkStatus()))
            && (this.getAccessory() == null ? other.getAccessory() == null : this.getAccessory().equals(other.getAccessory()))
            && (this.getWebLinkNum() == null ? other.getWebLinkNum() == null : this.getWebLinkNum().equals(other.getWebLinkNum()))
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
        result = prime * result + ((getWebLinkId() == null) ? 0 : getWebLinkId().hashCode());
        result = prime * result + ((getWebLinkName() == null) ? 0 : getWebLinkName().hashCode());
        result = prime * result + ((getWebLinkUrl() == null) ? 0 : getWebLinkUrl().hashCode());
        result = prime * result + ((getWebLinkPhoto() == null) ? 0 : getWebLinkPhoto().hashCode());
        result = prime * result + ((getWebLinkStatus() == null) ? 0 : getWebLinkStatus().hashCode());
        result = prime * result + ((getAccessory() == null) ? 0 : getAccessory().hashCode());
        result = prime * result + ((getWebLinkNum() == null) ? 0 : getWebLinkNum().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdater() == null) ? 0 : getUpdater().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}