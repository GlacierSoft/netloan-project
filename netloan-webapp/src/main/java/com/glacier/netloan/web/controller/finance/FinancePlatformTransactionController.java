/*
 * @(#)FinancePlatformTransactionController.java
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
import com.glacier.netloan.service.finance.FinancePlatformTransactionService;

/** 
 * @ClassName: FinancePlatformTransactionController 
 * @Description: TODO(平台资金记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/platformTransaction")
public class FinancePlatformTransactionController extends AbstractController{

    @Autowired
    private FinancePlatformTransactionService financePlatformTransactionService;// 注入平台资金记录业务Bean
    
    // 进入平台资金记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinancePlatformTransaction() {
        ModelAndView mav = new ModelAndView("finance_mgr/platformTransaction_mgr/platformTransaction");
        return mav;
    }
    
    // 进入平台资金记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoTransactionDetailPage(String transactionId) {
        ModelAndView mav = new ModelAndView("finance_mgr/platformTransaction_mgr/platformTransaction_detail");
        if(StringUtils.isNotBlank(transactionId)){
            mav.addObject("transactionData", financePlatformTransactionService.getTransaction(transactionId));
        }
        return mav;
    }
    
    // 获取表格结构的所有平台资金记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listTransactionAsGridByMenuId(JqPager pfinancePlatformTransactionr) {
        return financePlatformTransactionService.listAsGrid(pfinancePlatformTransactionr);
    }
    
    // 批量删除平台资金记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delTransaction(@RequestParam List<String> transactionIds,@RequestParam List<String> transactionCodes) {
    	return financePlatformTransactionService.delTransaction(transactionIds, transactionCodes);
    }
}
