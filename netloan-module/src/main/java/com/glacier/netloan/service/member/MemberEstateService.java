/*
 * @(#)MemberEstateService.java
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
import com.glacier.netloan.dao.member.MemberEstateMapper;
import com.glacier.netloan.entity.member.MemberEstate;
import com.glacier.netloan.entity.member.MemberEstateExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: MemberEstateService 
 * @Description: TODO(会员房产信息业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberEstateService {

	@Autowired
    private MemberEstateMapper estateMapper;

	/**
	 * @Title: getEstate
	 * @Description: TODO(根据会员房产信息Id获取会员房产信息信息) 
	 * @param @param memberEstateId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getEstate(String estateId) {
    	MemberEstate memberEstate = estateMapper.selectByPrimaryKey(estateId);
        return memberEstate;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员房产信息信息) 
     * @param @param pestater
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pestater) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberEstateExample memberEstateExample = new MemberEstateExample();

        if (null != pestater.getPage() && null != pestater.getRows()) {// 设置排序信息
        	memberEstateExample.setLimitStart((pestater.getPage() - 1) * pestater.getRows());
        	memberEstateExample.setLimitEnd(pestater.getRows());
        }
        if (StringUtils.isNotBlank(pestater.getSort()) && StringUtils.isNotBlank(pestater.getOrder())) {// 设置排序信息
        	memberEstateExample.setOrderByClause(pestater.getOrderBy("temp_member_estate_"));
        }
        List<MemberEstate>  memberEstates = estateMapper.selectByExample(memberEstateExample); // 查询所有会员积分列表
        int total = estateMapper.countByExample(memberEstateExample); // 查询总页数
        returnResult.setRows(memberEstates);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addEstate 
     * @Description: TODO(新增会员房产信息) 
     * @param @param estate
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "EstateList_add")
    public Object addEstate(MemberEstate estate) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        estate.setEstateId(RandomGUID.getRandomGUID());
        estate.setCreater(pricipalUser.getUserId());
        estate.setCreateTime(new Date());
        estate.setUpdater(pricipalUser.getUserId());
        estate.setUpdateTime(new Date());
        count = estateMapper.insert(estate);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员积分信息记录已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员积分信息记录保存失败");
        }
        return returnResult;
    }
}
