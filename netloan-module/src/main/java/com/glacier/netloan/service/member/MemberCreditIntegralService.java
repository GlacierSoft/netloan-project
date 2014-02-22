/*
 * @(#)MemberCreditIntegralService.java
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
import com.glacier.netloan.dao.member.MemberCreditIntegralMapper;
import com.glacier.netloan.entity.member.MemberCreditIntegral;
import com.glacier.netloan.entity.member.MemberCreditIntegralExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: MemberCreditIntegralService 
 * @Description: TODO(会员信用积分业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberCreditIntegralService {

	@Autowired
    private MemberCreditIntegralMapper creditIntegralMapper;

	/**
	 * @Title: getCreditIntegral
	 * @Description: TODO(根据会员信用积分Id获取会员信用积分信息) 
	 * @param @param memberCreditIntegralId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getCreditIntegral(String creditIntegralId) {
    	MemberCreditIntegral memberCreditIntegral = creditIntegralMapper.selectByPrimaryKey(creditIntegralId);
        return memberCreditIntegral;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信用积分信息) 
     * @param @param pcreditIntegralr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pcreditIntegralr) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberCreditIntegralExample memberCreditIntegralExample = new MemberCreditIntegralExample();

        if (null != pcreditIntegralr.getPage() && null != pcreditIntegralr.getRows()) {// 设置排序信息
        	memberCreditIntegralExample.setLimitStart((pcreditIntegralr.getPage() - 1) * pcreditIntegralr.getRows());
        	memberCreditIntegralExample.setLimitEnd(pcreditIntegralr.getRows());
        }
        if (StringUtils.isNotBlank(pcreditIntegralr.getSort()) && StringUtils.isNotBlank(pcreditIntegralr.getOrder())) {// 设置排序信息
        	memberCreditIntegralExample.setOrderByClause(pcreditIntegralr.getOrderBy("temp_member_credit_integral_"));
        }
        List<MemberCreditIntegral>  memberCreditIntegrals = creditIntegralMapper.selectByExample(memberCreditIntegralExample); // 查询所有会员积分列表
        int total = creditIntegralMapper.countByExample(memberCreditIntegralExample); // 查询总页数
        returnResult.setRows(memberCreditIntegrals);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addCreditIntegral 
     * @Description: TODO(新增会员信用积分) 
     * @param @param creditIntegral
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "CreditIntegralList_add")
    public Object addCreditIntegral(MemberCreditIntegral creditIntegral) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        creditIntegral.setCreditIntegralId(RandomGUID.getRandomGUID());
        creditIntegral.setCreater(pricipalUser.getUserId());
        creditIntegral.setCreateTime(new Date());
        creditIntegral.setUpdater(pricipalUser.getUserId());
        creditIntegral.setUpdateTime(new Date());
        count = creditIntegralMapper.insert(creditIntegral);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员积分信息记录已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员积分信息记录保存失败");
        }
        return returnResult;
    }
}
