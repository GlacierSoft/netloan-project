package com.glacier.netloan.entity.sysmgr;

import java.util.Date;

public class OperaLog {
    private String operalogId;

    private String actionId;

    private String userId;

    private String operaDesc;

    private String operaId;

    private Date operaTime;

    public String getOperalogId() {
        return operalogId;
    }

    public void setOperalogId(String operalogId) {
        this.operalogId = operalogId;
    }

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperaDesc() {
        return operaDesc;
    }

    public void setOperaDesc(String operaDesc) {
        this.operaDesc = operaDesc;
    }

    public String getOperaId() {
        return operaId;
    }

    public void setOperaId(String operaId) {
        this.operaId = operaId;
    }

    public Date getOperaTime() {
        return operaTime;
    }

    public void setOperaTime(Date operaTime) {
        this.operaTime = operaTime;
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
        OperaLog other = (OperaLog) that;
        return (this.getOperalogId() == null ? other.getOperalogId() == null : this.getOperalogId().equals(other.getOperalogId()))
            && (this.getActionId() == null ? other.getActionId() == null : this.getActionId().equals(other.getActionId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOperaDesc() == null ? other.getOperaDesc() == null : this.getOperaDesc().equals(other.getOperaDesc()))
            && (this.getOperaId() == null ? other.getOperaId() == null : this.getOperaId().equals(other.getOperaId()))
            && (this.getOperaTime() == null ? other.getOperaTime() == null : this.getOperaTime().equals(other.getOperaTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperalogId() == null) ? 0 : getOperalogId().hashCode());
        result = prime * result + ((getActionId() == null) ? 0 : getActionId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOperaDesc() == null) ? 0 : getOperaDesc().hashCode());
        result = prime * result + ((getOperaId() == null) ? 0 : getOperaId().hashCode());
        result = prime * result + ((getOperaTime() == null) ? 0 : getOperaTime().hashCode());
        return result;
    }
}