/*
 * @(#)ParameterAgeService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.basicdatas;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
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
    private ParameterAgeMapper ageMapper;

    public Object getAge(String ageId) {
        return ageMapper.selectByPrimaryKey(ageId);
    }
    
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
        List<ParameterAge>  parameterAges = ageMapper.selectByExample(parameterAgeExample); // 查询所有操作列表
        int total = ageMapper.countByExample(parameterAgeExample); // 查询总页数
        returnResult.setRows(parameterAges);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增会员别名")
    public Object addAge(ParameterAge age) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterAgeExample ageExample = new ParameterAgeExample();
        int count = 0;
        // 防止会员年龄别称名称重复
        ageExample.createCriteria().andAgeNameEqualTo(age.getAgeName());
        count = ageMapper.countByExample(ageExample);// 查找相同中文名称的会员年龄别称数量
        if (count > 0) {
            returnResult.setMsg("年龄别名重复，请重新填写!");
            return returnResult;
        }
        age.setAgeId(RandomGUID.getRandomGUID());
        age.setCreater(pricipalUser.getUserId());
        age.setCreateTime(new Date());
        count = ageMapper.insert(age);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + age.getAgeName() + "] 会员年龄别称信息已保存");
        } else {
            returnResult.setMsg("会员年龄别称信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改会员年龄别称")
    public Object editAge(ParameterAge age) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterAgeExample ageExample = new ParameterAgeExample();
        int count = 0;
        // 防止会员年龄别称名称重复
        ageExample.createCriteria().andAgeIdNotEqualTo(age.getAgeId()).andAgeNameEqualTo(age.getAgeName());
        count = ageMapper.countByExample(ageExample);// 查找相同中文名称的会员年龄别称数量
        if (count > 0) {
            returnResult.setMsg("会员年龄别称名称重复，请重新填写!");
            return returnResult;
        }
        count = ageMapper.updateByPrimaryKeySelective(age);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + age.getAgeName() + "] 会员年龄别称信息已保存");
        } else {
            returnResult.setMsg("会员年龄别称信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
}
