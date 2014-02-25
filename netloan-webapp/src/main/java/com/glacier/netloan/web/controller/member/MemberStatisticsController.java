/*
 * @(#)memberStatisticsController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.member;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.service.member.MemberStatisticsService;

/** 
 * @ClassName: memberStatisticsController 
 * @Description: TODO(会员财务统计的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/memberStatistics")
public class MemberStatisticsController extends AbstractController{

    @Autowired
    private MemberStatisticsService statisticsService;// 注入会员财务统计业务Bean
    
    // 进入会员财务统计列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPstatistics() {
        ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics");
        return mav;
    }
    
    // 进入会员财务统计Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoStatisticsFormPstatistics(String statisticsId) {
        ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics_form");
        if(StringUtils.isNotBlank(statisticsId)){
            mav.addObject("statisticsData", statisticsService.getStatistics(statisticsId));
        }
        return mav;
    }
    
    // 进入会员财务统计Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoStatisticsDetailPage(String statisticsId) {
        ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics_detail");
        if(StringUtils.isNotBlank(statisticsId)){
            mav.addObject("statisticsData", statisticsService.getStatistics(statisticsId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员财务统计数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listStatisticsAsGridByMenuId(JqPager pstatisticsr) {
        return statisticsService.listAsGrid(pstatisticsr);
    }
    
    // 增加会员财务统计
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addStatistics(@Valid MemberStatistics statistics, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return statisticsService.addStatistics(statistics);
    }
}
