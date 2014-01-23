/*
 * @(#)ParameterOptgroupService.java
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
import com.glacier.netloan.dao.basicdatas.ParameterOptgroupMapper;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroup;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: ParameterOptgroupService 
 * @Description: TODO(下拉项业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterOptgroupService {

	@Autowired
    private ParameterOptgroupMapper optgroupMapper;

    public Object getOptgroup(String optgroupId) {
        return optgroupMapper.selectByPrimaryKey(optgroupId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有下拉项信息) 
     * @param @param poptgroupr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "浏览下拉项")
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        ParameterOptgroupExample parameterOptgroupExample = new ParameterOptgroupExample();

        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
        	parameterOptgroupExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
        	parameterOptgroupExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
        	parameterOptgroupExample.setOrderByClause(pager.getOrderBy("temp_parameter_optgroup_"));
        }
        List<ParameterOptgroup>  parameterOptgroups = optgroupMapper.selectByExample(parameterOptgroupExample); // 查询所有下拉项列表
        int total = optgroupMapper.countByExample(parameterOptgroupExample); // 查询总页数
        returnResult.setRows(parameterOptgroups);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    public Object listAsTree() {
        List<ParameterOptgroup> optgroupList = optgroupMapper.selectByExample(new ParameterOptgroupExample());
        return optgroupList;
    }

    
    /**
     * @Title: addOptgroup 
     * @Description: TODO(新增下拉项) 
     * @param @param optgroup
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增下拉项")
    public Object addOptgroup(ParameterOptgroup optgroup) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterOptgroupExample optgroupExample = new ParameterOptgroupExample();
        int count = 0;
        // 防止下拉项名称重复
        optgroupExample.createCriteria().andOptgroupNameEqualTo(optgroup.getOptgroupName());
        count = optgroupMapper.countByExample(optgroupExample);// 查找相同中文名称的下拉项数量
        if (count > 0) {
            returnResult.setMsg("下拉项重复，请重新填写!");
            return returnResult;
        }
        optgroup.setOptgroupId(RandomGUID.getRandomGUID());
        optgroup.setCreater(pricipalUser.getUserId());
        optgroup.setCreateTime(new Date());
        count = optgroupMapper.insert(optgroup);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroup.getOptgroupName() + "] 下拉项信息已保存");
        } else {
            returnResult.setMsg("下拉项信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: editOptgroup 
     * @Description: TODO(修改下拉项) 
     * @param @param optgroup
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改下拉项")
    public Object editOptgroup(ParameterOptgroup optgroup) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterOptgroupExample optgroupExample = new ParameterOptgroupExample();
        int count = 0;
        // 防止下拉项名称重复
        optgroupExample.createCriteria().andOptgroupIdNotEqualTo(optgroup.getOptgroupId()).andOptgroupNameEqualTo(optgroup.getOptgroupName());
        count = optgroupMapper.countByExample(optgroupExample);// 查找相同中文名称的下拉项数量
        if (count > 0) {
            returnResult.setMsg("下拉项名称重复，请重新填写!");
            return returnResult;
        }
        count = optgroupMapper.updateByPrimaryKeySelective(optgroup);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroup.getOptgroupName() + "] 下拉项信息已修改");
        } else {
            returnResult.setMsg("下拉项信息修改失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: delOptgroup 
     * @Description: TODO(删除下拉项) 
     * @param @param optgroupId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "删除下拉项")
    public Object delOptgroup(String optgroupId) {
    	ParameterOptgroup optgroup= optgroupMapper.selectByPrimaryKey(optgroupId);
        int result = optgroupMapper.deleteByPrimaryKey(optgroupId);//根据下拉项Id，进行删除下拉项
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if (result == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroup.getOptgroupName() + "] 下拉项信息已删除");
        } else {
            returnResult.setMsg("下拉项信息删除失败，请联系管理员!");
        }
		return returnResult;
     }
}
