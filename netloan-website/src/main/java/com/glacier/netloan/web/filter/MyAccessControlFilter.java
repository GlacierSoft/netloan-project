package com.glacier.netloan.web.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.web.filter.AccessControlFilter;

public class MyAccessControlFilter extends AccessControlFilter {

	@Override
	protected boolean isAccessAllowed(ServletRequest request,
			ServletResponse response, Object mappedValue) throws Exception {
		System.out.println("access allowed");
        return true;
		//return false;
	}

	@Override
	protected boolean onAccessDenied(ServletRequest request,
			ServletResponse response) throws Exception {
		 System.out.println("访问拒绝也不自己处理，继续拦截器链的执行");
	    return true;
		//return false;
	}

}
