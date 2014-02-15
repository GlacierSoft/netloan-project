/*
 * @(#)ParameterOptgroupValueService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.basicdatas;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.JackJson;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.basicdatas.ParameterOptgroupMapper;
import com.glacier.netloan.dao.basicdatas.ParameterOptgroupValueMapper;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroup;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupExample;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValue;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValueExample;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValueExample.Criteria;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: ParameterOptgroupValueService 
 * @Description: TODO(下拉项值业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterOptgroupValueService {

	@Autowired
    private ParameterOptgroupValueMapper optgroupValueMapper;

	@Autowired
    private ParameterOptgroupMapper optgroupMapper;
	
	/**
     * @Title: loadEnableField 
     * @Description: TODO(查找可用下拉值，在grid显示下拉值) 
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object loadEnableField() {
    	ParameterOptgroupExample optgroupExample = new ParameterOptgroupExample();
    	optgroupExample.createCriteria().andOptgroupCodeIsNotNull();
    	List<ParameterOptgroup> listOptgroup = optgroupMapper.selectByExample(optgroupExample);
    	LinkedHashMap<String, List<ParameterOptgroupValue>> part = new LinkedHashMap<String, List<ParameterOptgroupValue>>();
        for (ParameterOptgroup optgroup : listOptgroup) {
        	ParameterOptgroupValueExample optgroupValueExample = new ParameterOptgroupValueExample();
        	optgroupValueExample.createCriteria().andStatusEqualTo("Enabled").andOptgroupIdEqualTo(optgroup.getOptgroupId());// 查询可用和下拉项关联的下拉项值
        	optgroupValueExample.setOrderByClause("optgroup_value_code desc,optgroup_value_num asc");// optgroup_value_code降序 optgroup_value_num 升序
        	List<ParameterOptgroupValue> list = optgroupValueMapper.selectByExample(optgroupValueExample);
        	for (ParameterOptgroupValue optgroupValue : list) {
        		String key = optgroup.getOptgroupCode();
                if (part.containsKey(key)) { // 如果包含这个field，就加入它的值
                    part.get(key).add(optgroupValue);
                } else { // 没有这个field，则新加入这个filed
                    List<ParameterOptgroupValue> optgroupValues = new ArrayList<ParameterOptgroupValue>();
                    optgroupValues.add(optgroupValue);
                    part.put(key, optgroupValues);
                }
        	}
        }
        Set<String> filterSet = new HashSet<String>();// 过滤不需要的属性，提高性能
        filterSet.add("optgroupValueId");
        filterSet.add("optgroupId");
        filterSet.add("status");
        filterSet.add("optgroupValueNum");
        filterSet.add("remark");
        filterSet.add("creater");
        filterSet.add("createTime");
        filterSet.add("updater");
        filterSet.add("updateTime");
        return JackJson.fromObjectToJson(part, "fieldFilter", filterSet);
    }
    
    /**
     * @Title: getOptgroupValue 
     * @Description: TODO(根据下拉值Id获取下拉值信息) 
     * @param @param optgroupValueId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getOptgroupValue(String optgroupValueId) {
        return optgroupValueMapper.selectByPrimaryKey(optgroupValueId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有下拉项值信息) 
     * @param @param optgroupId
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(String optgroupId, JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        if (StringUtils.isNotBlank(optgroupId)) {// 当下拉值对应的下拉项Id有意义的时候，才会进行数据库查询
        	ParameterOptgroupValueExample parameterOptgroupValueExample = new ParameterOptgroupValueExample();
            Criteria optgroupValueCriteria = parameterOptgroupValueExample.createCriteria();
            optgroupValueCriteria.andOptgroupIdEqualTo(optgroupId);
            if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            	parameterOptgroupValueExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            	parameterOptgroupValueExample.setLimitEnd(pager.getRows());
            }
            if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
            	parameterOptgroupValueExample.setOrderByClause(pager.getOrderBy("temp_parameter_optgroup_value_"));// 必须外键inner
                                                                                                               // join
                                                                                                               // temp_parameter
            }
            List<ParameterOptgroupValue> parameterOptgroupValues = optgroupValueMapper.selectByExample(parameterOptgroupValueExample); // 查询所有操作列表
            int total = optgroupValueMapper.countByExample(parameterOptgroupValueExample); // 查询总页数
            returnResult.setRows(parameterOptgroupValues);
            returnResult.setTotal(total);
        }
        return returnResult;// 返回ExtGrid表
    }
    
    /**
     * @Title: addOptgroupValue 
     * @Description: TODO(新增下拉项值) 
     * @param @param optgroupValue
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "OptgroupValueList_add")
    public Object addOptgroupValue(ParameterOptgroupValue optgroupValue) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterOptgroupValueExample optgroupValueExample = new ParameterOptgroupValueExample();
        int count = 0;
        // 防止下拉项值名称重复
        optgroupValueExample.createCriteria().andOptgroupIdEqualTo(optgroupValue.getOptgroupId()).andOptgroupValueNameEqualTo(optgroupValue.getOptgroupValueName());
        count = optgroupValueMapper.countByExample(optgroupValueExample);// 查找属于同一下拉项的相同名称的下拉值数量
        if (count > 0) {
            returnResult.setMsg("下拉值名称重复");
            return returnResult;
        }
        optgroupValue.setOptgroupValueId(RandomGUID.getRandomGUID());
        optgroupValue.setCreater(pricipalUser.getUserId());
        optgroupValue.setCreateTime(new Date());
        count = optgroupValueMapper.insert(optgroupValue);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroupValue.getOptgroupValueName() + "] 下拉项值信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，下拉项值信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editOptgroupValue 
     * @Description: TODO(修改下拉项值) 
     * @param @param optgroupValue
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "OptgroupValueList_edit")
    public Object editOptgroupValue(ParameterOptgroupValue optgroupValue) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterOptgroupValueExample optgroupValueExample = new ParameterOptgroupValueExample();
        int count = 0;
        // 防止下拉项值名称重复
        optgroupValueExample.createCriteria().andOptgroupValueIdNotEqualTo(optgroupValue.getOptgroupValueId()).andOptgroupIdEqualTo(optgroupValue.getOptgroupId()).andOptgroupValueNameEqualTo(optgroupValue.getOptgroupValueName());
        count = optgroupValueMapper.countByExample(optgroupValueExample);// 查找属于同一下拉项的相同名称的下拉值数量
        if (count > 0) {
            returnResult.setMsg("下拉值名称重复");
            return returnResult;
        }
        count = optgroupValueMapper.updateByPrimaryKeySelective(optgroupValue);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroupValue.getOptgroupValueName() + "] 下拉项值信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，下拉项值信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delOptgroupValue 
     * @Description: TODO(删除下拉值) 
     * @param @param optgroupValueIds
     * @param @param optgroupValueNames
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "OptgroupValueList_del")
    public Object delOptgroupValue(List<String> optgroupValueIds, List<String> optgroupValueNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (optgroupValueIds.size() > 0) {
        	ParameterOptgroupValueExample parameterOptgroupValueExample = new ParameterOptgroupValueExample();
        	parameterOptgroupValueExample.createCriteria().andOptgroupValueIdIn(optgroupValueIds);
            count = optgroupValueMapper.deleteByExample(parameterOptgroupValueExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(optgroupValueNames, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，下拉值信息删除失败");
            }
        }
        return returnResult;
    }
}
