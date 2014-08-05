/*
 * @(#)memberStatisticsController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.member;

import javax.validation.Valid; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody; 
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.member.MemBerStatisticsQueryDTO;
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
      
    // 获取表格结构的所有会员财务统计数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listStatisticsAsGridByMenuId(JqPager pstatisticsr,MemBerStatisticsQueryDTO  memBerStatisticsQueryDTO) {
        return statisticsService.listAsGrid(pstatisticsr,memBerStatisticsQueryDTO);
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
