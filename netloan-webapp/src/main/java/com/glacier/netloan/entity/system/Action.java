package com.glacier.netloan.entity.system;

import com.glacier.netloan.entity.system.util.ActionDisabled;
import com.glacier.netloan.entity.system.util.ActionType;

public class Action {
    private String actionId;

    private String menuId;

    private String panelId;

    private String actionCnName;

    private String actionEnName;

    private String iconCls;

    private ActionType type;

    private ActionDisabled disabled;

    private String method;

    private Integer orderNum;

    private String remark;

    /**
     * 自定义显示字段：菜单英文名称
     */
    private String menuEnName;

    /**
     * 自定义显示字段：面板中文名称
     */
    private String panelCnName;

    /**
     * 自定义显示字段：面板英文名称
     */
    private String panelEnName;

    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getPanelId() {
        return panelId;
    }

    public void setPanelId(String panelId) {
        this.panelId = panelId;
    }

    public String getActionCnName() {
        return actionCnName;
    }

    public void setActionCnName(String actionCnName) {
        this.actionCnName = actionCnName;
    }

    public String getActionEnName() {
        return actionEnName;
    }

    public void setActionEnName(String actionEnName) {
        this.actionEnName = actionEnName;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public ActionType getType() {
        return type;
    }

    public void setType(ActionType type) {
        this.type = type;
    }

    public ActionDisabled getDisabled() {
        return disabled;
    }

    public void setDisabled(ActionDisabled disabled) {
        this.disabled = disabled;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMenuEnName() {
        return menuEnName;
    }

    public void setMenuEnName(String menuEnName) {
        this.menuEnName = menuEnName;
    }

    public String getPanelCnName() {
        return panelCnName;
    }

    public void setPanelCnName(String panelCnName) {
        this.panelCnName = panelCnName;
    }

    public String getPanelEnName() {
        return panelEnName;
    }

    public void setPanelEnName(String panelEnName) {
        this.panelEnName = panelEnName;
    }

}