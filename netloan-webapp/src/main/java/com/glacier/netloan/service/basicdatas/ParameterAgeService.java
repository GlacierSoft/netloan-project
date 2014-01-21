/*
 * @(#)ParameterAgeService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.basicdatas;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.basicdatas.ParameterAgeMapper;
import com.glacier.netloan.entity.basicdatas.ParameterAge;
import com.glacier.netloan.entity.basicdatas.ParameterAgeExample;
import com.glacier.netloan.entity.sysmgr.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: ParameterAgeService 
 * @Description: TODO(会员年龄别称业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterAgeService {

	@Autowired
    private ParameterAgeMapper parameterAgeMapper;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "浏览会员年龄别称")
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        ParameterAgeExample parameterAgeExample = new ParameterAgeExample();

        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterAgeExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterAgeExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterAgeExample.setOrderByClause(pager.getOrderBy("temp_parameter_age_"));
        }
        List<ParameterAge>  parameterAges = parameterAgeMapper.selectByExample(parameterAgeExample); // 查询所有操作列表
        int total = parameterAgeMapper.countByExample(parameterAgeExample); // 查询总页数
        returnResult.setRows(parameterAges);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

}
