/*
 * @(#)MemberStatisticsService.java
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
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.member.MemberStatisticsExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.util.MethodLog;

/** 
 * @ClassName: MemberStatisticsService 
 * @Description: TODO(会员财务统计业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberStatisticsService {

	@Autowired
    private MemberStatisticsMapper statisticsMapper;

	/**
	 * @Title: getStatistics
	 * @Description: TODO(根据会员财务统计Id获取会员财务统计信息) 
	 * @param @param memberStatisticsId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getStatistics(String statisticsId) {
        return statisticsMapper.selectByPrimaryKey(statisticsId);
    }
    
    /**
     * @Title: getStatisticsByMember 
     * @Description: TODO(根据所属会员Id获得该会员财务统计信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getStatisticsByMember(String memberId) {
        return statisticsMapper.selectByMemberId(memberId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员财务统计信息) 
     * @param @param jqPager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberStatisticsExample memberStatisticsExample = new MemberStatisticsExample();

        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberStatisticsExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberStatisticsExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberStatisticsExample.setOrderByClause(jqPager.getOrderBy("temp_member_statistics_"));
        }
        List<MemberStatistics>  memberStatisticss = statisticsMapper.selectByExample(memberStatisticsExample); // 查询所有会员积分列表
        int total = statisticsMapper.countByExample(memberStatisticsExample); // 查询总页数
        returnResult.setRows(memberStatisticss);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addStatistics 
     * @Description: TODO(新增会员财务统计) 
     * @param @param statistics
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "StatisticsList_add")
    public Object addStatistics(MemberStatistics statistics) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        statistics.setStatisticsId(RandomGUID.getRandomGUID());
        statistics.setCreater(pricipalUser.getUserId());
        statistics.setCreateTime(new Date());
        statistics.setUpdater(pricipalUser.getUserId());
        statistics.setUpdateTime(new Date());
        count = statisticsMapper.insert(statistics);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("申请额度信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，申请额度信息保存失败");
        }
        return returnResult;
    }
}
