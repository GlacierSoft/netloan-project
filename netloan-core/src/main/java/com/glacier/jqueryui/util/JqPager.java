/*
 * @(#)JqPager.java
 * @author zhenfei.zhang 
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.jqueryui.util;

import com.glacier.basic.util.GlacierUitls;
import com.glacier.basic.util.IgnoreParam;

/**
 * @ClassName: JqPager
 * @Description: TODO(JQueryUI的分页请求对象)
 * @author zhenfei.zhang
 * @email zhangzhenfei_email@163.com
 * @date 2013-1-29 下午3:57:04
 */
public class JqPager implements IgnoreParam{

    /**
     * 分页的start
     */
    private Integer page;

    /**
     * 分页的llimit
     */
    private Integer rows;

    /**
     * 排序的field
     */
    private String sort;

    /**
     * DESC or ASC
     */
    private String order;
    
    public String getOrderBy(String prefix){
        return GlacierUitls.camelTounderline(prefix+this.getSort())+" "+this.getOrder(); 
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

}
