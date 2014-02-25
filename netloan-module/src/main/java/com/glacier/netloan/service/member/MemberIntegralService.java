/*
 * @(#)MemberIntegralService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.member;

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
import com.glacier.netloan.dao.member.MemberIntegralMapper;
import com.glacier.netloan.dto.query.member.MemberIntegralQueryDTO;
import com.glacier.netloan.entity.member.MemberIntegral;
import com.glacier.netloan.entity.member.MemberIntegralExample;
import com.glacier.netloan.entity.member.MemberIntegralExample.Criteria;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: MemberIntegralService 
 * @Description: TODO(会员积分记录业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberIntegralService {

	@Autowired
    private MemberIntegralMapper integralMapper;

	/**
	 * @Title: getIntegral
	 * @Description: TODO(根据会员积分记录Id获取会员积分记录信息) 
	 * @param @param memberIntegralId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getIntegral(String memberIntegralId) {
    	MemberIntegral memberIntegral = integralMapper.selectByPrimaryKey(memberIntegralId);
        return memberIntegral;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员积分记录信息) 
     * @param @param pintegralr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(MemberIntegralQueryDTO  memberIntegralQueryDTO, JqPager pintegralr) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberIntegralExample memberIntegralExample = new MemberIntegralExample();

        Criteria queryCriteria = memberIntegralExample.createCriteria();
        memberIntegralQueryDTO.setQueryCondition(queryCriteria);
        
        if (null != pintegralr.getPage() && null != pintegralr.getRows()) {// 设置排序信息
        	memberIntegralExample.setLimitStart((pintegralr.getPage() - 1) * pintegralr.getRows());
        	memberIntegralExample.setLimitEnd(pintegralr.getRows());
        }
        if (StringUtils.isNotBlank(pintegralr.getSort()) && StringUtils.isNotBlank(pintegralr.getOrder())) {// 设置排序信息
        	memberIntegralExample.setOrderByClause(pintegralr.getOrderBy("temp_member_integral_"));
        }
        List<MemberIntegral>  memberIntegrals = integralMapper.selectByExample(memberIntegralExample); // 查询所有会员积分列表
        int total = integralMapper.countByExample(memberIntegralExample); // 查询总页数
        returnResult.setRows(memberIntegrals);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addIntegral 
     * @Description: TODO(新增会员积分记录) 
     * @param @param integral
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "IntegralList_add")
    public Object addIntegral(MemberIntegral integral) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        integral.setMemberIntegralId(RandomGUID.getRandomGUID());
        integral.setCreater(pricipalUser.getUserId());
        integral.setCreateTime(new Date());
        integral.setUpdater(pricipalUser.getUserId());
        integral.setUpdateTime(new Date());
        count = integralMapper.insert(integral);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员积分信息记录已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员积分信息记录保存失败");
        }
        return returnResult;
    }
}
