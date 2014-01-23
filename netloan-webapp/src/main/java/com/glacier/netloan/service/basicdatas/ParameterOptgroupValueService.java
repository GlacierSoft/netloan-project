/*
 * @(#)ParameterOptgroupValueService.java
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
import com.glacier.netloan.dao.basicdatas.ParameterOptgroupValueMapper;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValue;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValueExample;
import com.glacier.netloan.entity.basicdatas.ParameterOptgroupValueExample.Criteria;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: ParameterOptgroupValueService 
 * @Description: TODO(会员年龄别称业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class ParameterOptgroupValueService {

	@Autowired
    private ParameterOptgroupValueMapper optgroupValueMapper;

    public Object getOptgroupValue(String optgroupValueId) {
        return optgroupValueMapper.selectByPrimaryKey(optgroupValueId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员年龄别称信息) 
     * @param @param poptgroupValuer
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
//    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
//    @MethodLog(opera = "浏览会员年龄别称")
//    public Object listAsGrid(JqPager pager) {
//
//        JqGridReturn returnResult = new JqGridReturn();
//        ParameterOptgroupValueExample parameterOptgroupValueExample = new ParameterOptgroupValueExample();
//
//        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
//        	parameterOptgroupValueExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
//        	parameterOptgroupValueExample.setLimitEnd(pager.getRows());
//        }
//        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
//        	parameterOptgroupValueExample.setOrderByClause(pager.getOrderBy("temp_parameter_optgroupValue_"));
//        }
//        List<ParameterOptgroupValue>  parameterOptgroupValues = optgroupValueMapper.selectByExample(parameterOptgroupValueExample); // 查询所有会员年龄别称列表
//        int total = optgroupValueMapper.countByExample(parameterOptgroupValueExample); // 查询总页数
//        returnResult.setRows(parameterOptgroupValues);
//        returnResult.setTotal(total);
//        return returnResult;// 返回ExtGrid表
//    }

    public Object listAsGrid(String optgroupId, JqPager pager) {
        JqGridReturn returnResult = new JqGridReturn();
        if (StringUtils.isNotBlank(optgroupId)) {// 当菜单对应的menuId有意义的时候，才会进行数据库查询
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
                                                                                                               // t_panel
                                                                                                               // temp_panel
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
     * @Description: TODO(新增会员年龄别称) 
     * @param @param optgroupValue
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增会员年龄别称")
    public Object addOptgroupValue(ParameterOptgroupValue optgroupValue) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterOptgroupValueExample optgroupValueExample = new ParameterOptgroupValueExample();
        int count = 0;
        // 防止会员年龄别称名称重复
        optgroupValueExample.createCriteria().andOptgroupValueNameEqualTo(optgroupValue.getOptgroupValueName());
        count = optgroupValueMapper.countByExample(optgroupValueExample);// 查找相同中文名称的会员年龄别称数量
        if (count > 0) {
            returnResult.setMsg("会员年龄别称重复，请重新填写!");
            return returnResult;
        }
        optgroupValue.setOptgroupValueId(RandomGUID.getRandomGUID());
        optgroupValue.setCreater(pricipalUser.getUserId());
        optgroupValue.setCreateTime(new Date());
        count = optgroupValueMapper.insert(optgroupValue);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroupValue.getOptgroupValueName() + "] 会员年龄别称信息已保存");
        } else {
            returnResult.setMsg("会员年龄别称信息保存失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: editOptgroupValue 
     * @Description: TODO(修改会员年龄别称) 
     * @param @param optgroupValue
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改会员年龄别称")
    public Object editOptgroupValue(ParameterOptgroupValue optgroupValue) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        ParameterOptgroupValueExample optgroupValueExample = new ParameterOptgroupValueExample();
        int count = 0;
        // 防止会员年龄别称名称重复
        optgroupValueExample.createCriteria().andOptgroupValueIdNotEqualTo(optgroupValue.getOptgroupValueId()).andOptgroupValueNameEqualTo(optgroupValue.getOptgroupValueName());
        count = optgroupValueMapper.countByExample(optgroupValueExample);// 查找相同中文名称的会员年龄别称数量
        if (count > 0) {
            returnResult.setMsg("会员年龄别称名称重复，请重新填写!");
            return returnResult;
        }
        count = optgroupValueMapper.updateByPrimaryKeySelective(optgroupValue);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroupValue.getOptgroupValueName() + "] 会员年龄别称信息已修改");
        } else {
            returnResult.setMsg("会员年龄别称信息修改失败，请联系管理员!");
        }
        return returnResult;
    }
    
    /**
     * @Title: delOptgroupValue 
     * @Description: TODO(删除会员年龄别称) 
     * @param @param optgroupValueId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "删除会员年龄别称")
    public Object delOptgroupValue(String optgroupValueId) {
    	ParameterOptgroupValue optgroupValue= optgroupValueMapper.selectByPrimaryKey(optgroupValueId);
        int result = optgroupValueMapper.deleteByPrimaryKey(optgroupValueId);//根据会员年龄别称Id，进行删除会员年龄别称
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        if (result == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + optgroupValue.getOptgroupValueName() + "] 会员年龄别称信息已删除");
        } else {
            returnResult.setMsg("会员年龄别称信息删除失败，请联系管理员!");
        }
		return returnResult;
     }
}
