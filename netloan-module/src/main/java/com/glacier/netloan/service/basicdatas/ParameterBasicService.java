/*
 * @(#)ParameterBasicService.java
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

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.basicdatas.ParameterBasicMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.basicdatas.ParameterBasic;
import com.glacier.netloan.entity.basicdatas.ParameterBasicExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/**
 * @ClassName: ParameterBasicService 
 * @Description: TODO(基础参数service) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-12下午4:25:48
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterBasicService {

	@Autowired
    private ParameterBasicMapper parameterBasicMapper;
	
	@Autowired
    private UserMapper userMapper;

	/**
	 * @Title: getParameterBasic 
	 * @Description: TODO(通过basicId获取基础参数信息) 
	 * @param  @param basicId
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
    public Object getParameterBasic(String basicId) {
        return parameterBasicMapper.selectByPrimaryKey(basicId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(以表格结构展示基础参数列表) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pager) {
    	
        JqGridReturn returnResult = new JqGridReturn();
        ParameterBasicExample parameterBasicExample = new ParameterBasicExample();
        
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterBasicExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterBasicExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterBasicExample.setOrderByClause(pager.getOrderBy("temp_parameter_basic_"));
        }
        List<ParameterBasic>  basicTitles = parameterBasicMapper.selectByExample(parameterBasicExample); // 查询所有基础参数列表
        int total = parameterBasicMapper.countByExample(parameterBasicExample); // 查询总页数
        returnResult.setRows(basicTitles);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addParameterBasic 
     * @Description: TODO(增加基础参数) 
     * @param @param parameterBasic
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ParameterBasicList_add")
    public Object addParameterBasic(ParameterBasic parameterBasic) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterBasicExample parameterBasicExample = new ParameterBasicExample();
        int count = 0;
        // 防止基础参数名称重复
        parameterBasicExample.createCriteria().andBasicTitleEqualTo(parameterBasic.getBasicTitle());
        count = parameterBasicMapper.countByExample(parameterBasicExample);// 查找相同名称的基础参数数量
        if (count > 0) {
            returnResult.setMsg("基础参数重复");
            return returnResult;
        }
        parameterBasic.setBasicId(RandomGUID.getRandomGUID());
        parameterBasic.setCreater(pricipalUser.getUserId());
        parameterBasic.setCreateTime(new Date());
        parameterBasic.setUpdater(pricipalUser.getUserId());
        parameterBasic.setUpdateTime(new Date());
        count = parameterBasicMapper.insert(parameterBasic);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterBasic.getBasicTitle() + "] 基础参数信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，基础参数信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editParameterBasic 
     * @Description: TODO(修改基础参数) 
     * @param @param parameterBasic
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ParameterBasicList_edit")
    public Object editParameterBasic(ParameterBasic parameterBasic) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterBasicExample parameterBasicExample = new ParameterBasicExample();
        int count = 0;
        // 防止基础参数名称重复
        parameterBasicExample.createCriteria().andBasicIdNotEqualTo(parameterBasic.getBasicId()).andBasicTitleEqualTo(parameterBasic.getBasicTitle());
        count = parameterBasicMapper.countByExample(parameterBasicExample);// 查找相同名称的基础参数数量
        if (count > 0) {
            returnResult.setMsg("基础参数名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        parameterBasic.setUpdater(pricipalUser.getUserId());
        parameterBasic.setUpdateTime(new Date());
        count = parameterBasicMapper.updateByPrimaryKeySelective(parameterBasic);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + parameterBasic.getBasicTitle() + "] 基础参数信息已变更");
        } else {
            returnResult.setMsg("发生未知错误，基础参数信息修改失败");
        }
        return returnResult;
    }

    /**
     * @Title: delParameterBasics 
     * @Description: TODO(删除基础参数) 
     * @param @param basicIds 基础参数Id
     * @param @param basicTitles 基础参数名字
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ParameterBasicList_del")
    public Object delParameterBasics(List<String> basicIds, List<String> basicTitles) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (basicIds.size() > 0) {
        	ParameterBasicExample parameterBasicExample = new ParameterBasicExample();
        	parameterBasicExample.createCriteria().andBasicIdIn(basicIds);
            count = parameterBasicMapper.deleteByExample(parameterBasicExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(basicTitles, ",") + " ]基础参数");
            } else {
                returnResult.setMsg("发生未知错误，基础参数信息删除失败");
            }
        }
        return returnResult;
    }
}
