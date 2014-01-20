/*
 * @(#)JqReturnJson.java
 * @author zhenfei.zhang 
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.jqueryui.util;

/**
 * @ClassName: JqReturnJson
 * @Description: TODO(JqueryUI 结果返回对象)
 * @author zhenfei.zhang
 * @email zhangzhenfei_email@163.com
 * @date 2013-2-1 上午9:17:35
 */
public class JqReturnJson {

    private boolean success = false;// 是否成功

    private String msg = "";// 提示信息

    private Object obj = null;// 其他信息

    public JqReturnJson() {
    }

    /**
     * 默认success为false
     */
    public JqReturnJson(String msg) {
        this.msg = msg;
    }

    public JqReturnJson(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public JqReturnJson(boolean success, String msg, Object obj) {
        this.success = success;
        this.msg = msg;
        this.obj = obj;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
