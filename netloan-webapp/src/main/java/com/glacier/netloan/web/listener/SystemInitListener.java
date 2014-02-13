/*
 * @(#)SystemInitListener.java
 * @author zhenfei.zhang 
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;

import com.glacier.basic.util.SpringContextUtil;
import com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService;

/**
 * @ClassName: SystemInitListener
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author zhenfei.zhang
 * @email zhangzhenfei_email@163.com
 * @date 2013-1-5 下午2:22:58
 */
public class SystemInitListener implements ServletContextListener {

    private static final Logger logger = LoggerFactory.getLogger(SystemInitListener.class);

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute("fields");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            // 加载字段表内容到容器session
            logger.info("服务器开始读取系统默认配置");
            ParameterOptgroupValueService parameterOptgroupValueService = SpringContextUtil.getBean("parameterOptgroupValueService");
            sce.getServletContext().setAttribute("fields", parameterOptgroupValueService.loadEnableField());
        } catch (BeansException e) {
            logger.error("服务器读取系统默认配置出错");
            e.printStackTrace();
        }
        logger.info("服务器读取系统默认配置成功");
    }

}
