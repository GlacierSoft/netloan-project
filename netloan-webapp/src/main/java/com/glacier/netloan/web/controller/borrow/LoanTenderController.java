/*
 * @(#)LoanTenderController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.borrow;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.borrow.LoanTender;
import com.glacier.netloan.service.borrow.LoanTenderService;

/** 
 * @ClassName: LoanTenderController 
 * @Description: TODO(标种类型的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/loanTender")
public class LoanTenderController extends AbstractController{

    @Autowired
    private LoanTenderService loanTenderService;// 注入标种类型业务Bean
    
    // 进入标种类型列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPloanTender() {
        ModelAndView mav = new ModelAndView("borrow_mgr/loanTender_mgr/loanTender");
        return mav;
    }
    
    // 进入标种类型Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoLoanTenderFormPloanTender(String loanTenderId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/loanTender_mgr/loanTender_form");
        if(StringUtils.isNotBlank(loanTenderId)){
            mav.addObject("loanTenderData", loanTenderService.getLoanTender(loanTenderId));
        }
        return mav;
    }
    
    // 进入标种类型Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoLoanTenderDetailPage(String loanTenderId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/loanTender_mgr/loanTender_detail");
        if(StringUtils.isNotBlank(loanTenderId)){
            mav.addObject("loanTenderData", loanTenderService.getLoanTender(loanTenderId));
        }
        return mav;
    }
    
    // 获取表格结构的所有标种类型数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listLoanTenderAsGridByMenuId(JqPager jqPager) {
        return loanTenderService.listAsGrid(jqPager);
    }
    
    // 增加标种类型
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addLoanTender(@Valid LoanTender loanTender, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return loanTenderService.addLoanTender(loanTender);
    }
    
    // 修改标种类型
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editLoanTender(@Valid LoanTender loanTender, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return loanTenderService.editLoanTender(loanTender);
    }
    
    // 批量删除标种类型
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delLoanTender(@RequestParam List<String> loanTenderIds,@RequestParam List<String> loanrTenderNames) {
    	return loanTenderService.delLoanTender(loanTenderIds, loanrTenderNames);
    }
}
