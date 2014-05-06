/*
 * @(#)FinanceRechargeController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.finance;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.finance.FinanceRechargeService;

/** 
 * @ClassName: FinanceRechargeController 
 * @Description: TODO(会员充值记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/recharge")
public class FinanceRechargeController extends AbstractController{

    @Autowired
    private FinanceRechargeService financeRechargeService;// 注入会员充值记录业务Bean
    
    // 进入会员充值记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinanceRecharge() {
        ModelAndView mav = new ModelAndView("finance_mgr/recharge_mgr/recharge");
        return mav;
    }
    
    // 进入会员充值记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRechargeDetailPage(String financeRechargeId) {
        ModelAndView mav = new ModelAndView("finance_mgr/recharge_mgr/recharge_detail");
        if(StringUtils.isNotBlank(financeRechargeId)){
            mav.addObject("rechargeData", financeRechargeService.getRecharge(financeRechargeId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员充值记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listRechargeAsGridByMenuId(JqPager pfinanceRecharger) {
        return financeRechargeService.listAsGrid(pfinanceRecharger);
    }
    
    // 批量删除会员充值记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delRecharge(@RequestParam List<String> financeRechargeIds,@RequestParam List<String> rechargeNames) {
    	return financeRechargeService.delRecharge(financeRechargeIds, rechargeNames);
    }
}
