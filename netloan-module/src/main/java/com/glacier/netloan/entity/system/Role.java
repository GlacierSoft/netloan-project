package com.glacier.netloan.entity.system;

import java.util.Date;

import javax.validation.constraints.Pattern;

import com.alibaba.fastjson.annotation.JSONField;
import com.glacier.netloan.entity.system.util.CommonBuiltin;

public class Role {
    /**
     * 角色主键ID
     */
    private String roleId;

    /**
     * 角色英文名 字母组成，长度为2-25
     */
    @Pattern(regexp = "^[A-Z_]{2,16}$", message = "{Role.roleEnName.illegal}")
    private String roleEnName;

    /**
     * 角色名
     */
    @Pattern(regexp = "^[\\u4E00-\\u9FA5\\uf900-\\ufa2d\\w]{2,16}$", message = "{Role.roleCnName.illegal}")
    private String roleCnName;

    private CommonBuiltin builtin;

    private String remark;

    private String creater;

    /**
     * 自定义字段：创建者显示字段
     */
    private String createrDisplay;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleEnName() {
        return roleEnName;
    }

    public void setRoleEnName(String roleEnName) {
        this.roleEnName = roleEnName;
    }

    public String getRoleCnName() {
        return roleCnName;
    }

    public void setRoleCnName(String roleCnName) {
        this.roleCnName = roleCnName;
    }

    public CommonBuiltin getBuiltin() {
        return builtin;
    }

    public void setBuiltin(CommonBuiltin builtin) {
        this.builtin = builtin;
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

    public String getCreaterDisplay() {
        return createrDisplay;
    }

    public void setCreaterDisplay(String createrDisplay) {
        this.createrDisplay = createrDisplay;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        Role other = (Role) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
                && (this.getRoleEnName() == null ? other.getRoleEnName() == null : this.getRoleEnName().equals(other.getRoleEnName()))
                && (this.getRoleCnName() == null ? other.getRoleCnName() == null : this.getRoleCnName().equals(other.getRoleCnName()))
                && (this.getBuiltin() == null ? other.getBuiltin() == null : this.getBuiltin().equals(other.getBuiltin()))
                && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
                && (this.getCreater() == null ? other.getCreater() == null : this.getCreater().equals(other.getCreater()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getRoleEnName() == null) ? 0 : getRoleEnName().hashCode());
        result = prime * result + ((getRoleCnName() == null) ? 0 : getRoleCnName().hashCode());
        result = prime * result + ((getBuiltin() == null) ? 0 : getBuiltin().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreater() == null) ? 0 : getCreater().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}