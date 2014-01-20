/*
 * @(#)ExtGridReturn.java
 * @author zhenfei.zhang 
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.jqueryui.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * @ClassName: ExtGridReturn
 * @Description: TODO(JQuery Grid返回对象)
 * @author zhenfei.zhang
 * @email zhangzhenfei_email@163.com
 * @date 2013-1-6 上午10:29:16
 */
@SuppressWarnings("rawtypes")
public class JqGridReturn {
    /**
     * 总共条数
     */
    private int total = 0;

    /**
     * 内容数据
     */
    private List<?> rows = new ArrayList();

    /**
     * 脚表头数据
     */
    private List<?> footer = new ArrayList();

    public JqGridReturn() {
    }

    public JqGridReturn(int total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public JqGridReturn(int total, List<?> rows, List<?> footer) {
        this.total = total;
        this.rows = rows;
        this.footer = footer;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public List<?> getFooter() {
        return footer;
    }

    public void setFooter(List<?> footer) {
        this.footer = footer;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
