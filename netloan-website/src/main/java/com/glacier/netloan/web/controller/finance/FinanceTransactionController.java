/*
 * @(#)FinanceTransactionController.java
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
import com.glacier.netloan.dto.query.finance.FinTransactionsQueryDTO;
import com.glacier.netloan.service.finance.FinanceTransactionService;

/** 
 * @ClassName: FinanceTransactionController 
 * @Description: TODO(会员资金记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/transaction")
public class FinanceTransactionController extends AbstractController{

    @Autowired
    private FinanceTransactionService financeTransactionService;// 注入会员资金记录业务Bean
    
    // 进入会员资金记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinanceTransaction() {
        ModelAndView mav = new ModelAndView("finance_mgr/transaction_mgr/transaction");
        return mav;
    }
    
    // 进入会员资金记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoTransactionDetailPage(String transactionId) {
        ModelAndView mav = new ModelAndView("finance_mgr/transaction_mgr/transaction_detail");
        if(StringUtils.isNotBlank(transactionId)){
            mav.addObject("transactionData", financeTransactionService.getTransaction(transactionId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员资金记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listTransactionAsGridByMenuId(FinTransactionsQueryDTO transactionsQueryDTO,JqPager pfinanceTransactionr) {
        return financeTransactionService.listAsGrid(transactionsQueryDTO,pfinanceTransactionr);
    }
    
    // 批量删除会员资金记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delTransaction(@RequestParam List<String> transactionIds,@RequestParam List<String> transactionCodes) {
    	return financeTransactionService.delTransaction(transactionIds, transactionCodes);
    }
}
