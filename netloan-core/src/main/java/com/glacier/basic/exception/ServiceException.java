/*
 * @(#)ServiceException.java
 * @author zhenfei.zhang 
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.basic.exception;

/**
 * @ClassName: ServiceException
 * @Description: TODO(Service层公用的Exception.继承自RuntimeException,
 *               从由Spring管理事务的函数中抛出时会触发事务回滚.)
 * @author zhenfei.zhang
 * @email zhangzhenfei_email@163.com
 * @date 2012-12-28 下午2:14:13
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1401565756568803720L;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
