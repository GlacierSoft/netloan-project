/*
 * @(#)AbstractDTO.java
 *
 * @author zhenfei.zhang 
 *
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.core.dto;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 
 * @ClassName: AbstractDTO
 * 
 * @Description: TODO(通用的DTO的抽象父类，toString方法)
 * 
 * @author zhenfei.zhang
 * 
 * @email zhangzhenfei_email@163.com
 * 
 * @date 2012-6-20 上午9:06:41
 * 
 * 
 */
public abstract class AbstractDTO {

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
