/*
 * @(#)MemberApplyAmountService.java
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
import com.glacier.netloan.dao.member.MemberApplyAmountMapper;
import com.glacier.netloan.entity.member.MemberApplyAmount;
import com.glacier.netloan.entity.member.MemberApplyAmountExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: MemberApplyAmountService 
 * @Description: TODO(会员申请额度业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberApplyAmountService {

	@Autowired
    private MemberApplyAmountMapper applyAmountMapper;

	/**
	 * @Title: getApplyAmount
	 * @Description: TODO(根据会员申请额度Id获取会员申请额度信息) 
	 * @param @param memberApplyAmountId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getApplyAmount(String applyAmountId) {
    	MemberApplyAmount memberApplyAmount = applyAmountMapper.selectByPrimaryKey(applyAmountId);
        return memberApplyAmount;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员申请额度信息) 
     * @param @param papplyAmountr
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager papplyAmountr) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberApplyAmountExample memberApplyAmountExample = new MemberApplyAmountExample();

        if (null != papplyAmountr.getPage() && null != papplyAmountr.getRows()) {// 设置排序信息
        	memberApplyAmountExample.setLimitStart((papplyAmountr.getPage() - 1) * papplyAmountr.getRows());
        	memberApplyAmountExample.setLimitEnd(papplyAmountr.getRows());
        }
        if (StringUtils.isNotBlank(papplyAmountr.getSort()) && StringUtils.isNotBlank(papplyAmountr.getOrder())) {// 设置排序信息
        	memberApplyAmountExample.setOrderByClause(papplyAmountr.getOrderBy("temp_member_applyAmount_"));
        }
        List<MemberApplyAmount>  memberApplyAmounts = applyAmountMapper.selectByExample(memberApplyAmountExample); // 查询所有会员积分列表
        int total = applyAmountMapper.countByExample(memberApplyAmountExample); // 查询总页数
        returnResult.setRows(memberApplyAmounts);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addApplyAmount 
     * @Description: TODO(新增会员申请额度) 
     * @param @param applyAmount
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "ApplyAmountList_add")
    public Object addApplyAmount(MemberApplyAmount applyAmount) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        applyAmount.setApplyAmountId(RandomGUID.getRandomGUID());
        applyAmount.setCreater(pricipalUser.getUserId());
        applyAmount.setCreateTime(new Date());
        applyAmount.setUpdater(pricipalUser.getUserId());
        applyAmount.setUpdateTime(new Date());
        count = applyAmountMapper.insert(applyAmount);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员积分信息记录已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员积分信息记录保存失败");
        }
        return returnResult;
    }
}
