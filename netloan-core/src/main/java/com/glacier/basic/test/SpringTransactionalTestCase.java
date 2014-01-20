/*
 * @(#)SpringTransactionalTestCase.java
 * @author zhenfei.zhang 
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.basic.test;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;

/**
 * Spring的支持数据库访问, 事务控制和依赖注入的JUnit4 集成测试基类. 相比Spring原基类名字更短并保存了dataSource变量.
 * 
 * 子类需要定义applicationContext文件的位置, 如:
 * 
 * @ContextConfiguration(locations = { "/applicationContext.xml" })
 * 
 * @author calvin
 */
@ActiveProfiles("test")
public abstract class SpringTransactionalTestCase extends AbstractTransactionalJUnit4SpringContextTests {

    public Long timeStamp;

}
