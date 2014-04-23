/*
 * @(#)RepaymentTypeService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.borrow;

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
import com.glacier.netloan.dao.borrow.RepaymentTypeMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.entity.borrow.RepaymentType;
import com.glacier.netloan.entity.borrow.RepaymentTypeExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: RepaymentTypeService 
 * @Description: TODO(还款方式业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class RepaymentTypeService {

	@Autowired
    private RepaymentTypeMapper repaymentTypeMapper;

	@Autowired
    private UserMapper userMapper;
	
	/**
	 * @Title: getRepaymentType 
	 * @Description: TODO(根据还款方式Id获取还款方式信息) 
	 * @param @param webAdvId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getRepaymentType(String loanId) {
    	RepaymentType websiteRepaymentType = repaymentTypeMapper.selectByPrimaryKey(loanId);
        return websiteRepaymentType;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有还款方式信息) 
     * @param @param prepaymentTyper
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        RepaymentTypeExample repaymentTypeExample = new RepaymentTypeExample();

        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	repaymentTypeExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	repaymentTypeExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	repaymentTypeExample.setOrderByClause(jqPager.getOrderBy("temp_repayment_type_"));
        }
        List<RepaymentType>  repaymentTypes = repaymentTypeMapper.selectByExample(repaymentTypeExample); // 查询所有还款方式列表
        int total = repaymentTypeMapper.countByExample(repaymentTypeExample); // 查询总页数
        returnResult.setRows(repaymentTypes);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addRepaymentType 
     * @Description: TODO(新增还款方式) 
     * @param @param repaymentType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RepaymentTypeList_add")
    public Object addRepaymentType(RepaymentType repaymentType) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        RepaymentTypeExample repaymentTypeExample = new RepaymentTypeExample();
        int count = 0;
        // 防止还款方式主题重复
        repaymentTypeExample.createCriteria().andRepaymentTypeNameEqualTo(repaymentType.getRepaymentTypeName());
        count = repaymentTypeMapper.countByExample(repaymentTypeExample);// 查找相同名称的还款方式数量
        if (count > 0) {
            returnResult.setMsg("还款方式名称重复");
            return returnResult;
        }
        repaymentType.setRepaymentTypeId(RandomGUID.getRandomGUID());
        repaymentType.setCreater(pricipalUser.getUserId());
        repaymentType.setCreateTime(new Date());
        repaymentType.setUpdater(pricipalUser.getUserId());
        repaymentType.setUpdateTime(new Date());
        count = repaymentTypeMapper.insert(repaymentType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + repaymentType.getRepaymentTypeName() + "] 还款方式信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，还款方式信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editRepaymentType 
     * @Description: TODO(修改还款方式) 
     * @param @param repaymentType
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RepaymentTypeList_edit")
    public Object editRepaymentType(RepaymentType repaymentType) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        RepaymentTypeExample repaymentTypeExample = new RepaymentTypeExample();
        int count = 0;
        // 防止还款方式主题重复
        repaymentTypeExample.createCriteria().andRepaymentTypeIdNotEqualTo(repaymentType.getRepaymentTypeId()).andRepaymentTypeNameEqualTo(repaymentType.getRepaymentTypeName());
        count = repaymentTypeMapper.countByExample(repaymentTypeExample);// 查找相同名称的还款方式数量
        if (count > 0) {
            returnResult.setMsg("还款方式名称重复");
            return returnResult;
        }
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        repaymentType.setUpdater(pricipalUser.getUserId());
        repaymentType.setUpdateTime(new Date());
        count = repaymentTypeMapper.updateByPrimaryKeySelective(repaymentType);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + repaymentType.getRepaymentTypeName() + "] 还款方式信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，还款方式信息修改失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: delRepaymentType 
     * @Description: TODO(删除还款方式) 
     * @param @param webAdvIds
     * @param @param advThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "RepaymentTypeList_del")
    public Object delRepaymentType(List<String> repaymentTypeIds, List<String> repaymentTypeNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        if (repaymentTypeIds.size() > 0) {
        	RepaymentTypeExample repaymentTypeExample = new RepaymentTypeExample();
        	repaymentTypeExample.createCriteria().andRepaymentTypeIdIn(repaymentTypeIds);
            count = repaymentTypeMapper.deleteByExample(repaymentTypeExample);
            if (count > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(repaymentTypeNames, ",") + " ]还款方式");
            } else {
                returnResult.setMsg("发生未知错误，还款方式信息删除失败");
            }
        }
        return returnResult;
    }
}
