/*
 * @(#)FinancePlatformController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.finance;

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
import com.glacier.netloan.dto.query.finance.FinFinancePlatformQueryDTO;
import com.glacier.netloan.entity.finance.FinancePlatform;
import com.glacier.netloan.service.finance.FinancePlatformService;

/** 
 * @ClassName: FinancePlatformController 
 * @Description: TODO(平台资金的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/financePlatform")
public class FinancePlatformController extends AbstractController{

    @Autowired
    private FinancePlatformService financePlatformService;// 注入平台资金记录业务Bean
    
    // 进入平台资金记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexFinancePlatform() {
        ModelAndView mav = new ModelAndView("finance_mgr/financePlatform_mgr/financePlatform");
        return mav;
    }
    
    // 进入平台资金记录Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoPlatformForm(String financePlatformId) {
        ModelAndView mav = new ModelAndView("finance_mgr/financePlatform_mgr/financePlatform_form");
        if(StringUtils.isNotBlank(financePlatformId)){
            mav.addObject("financePlatformData", financePlatformService.getPlatform(financePlatformId));
        }
        return mav;
    }
    
    // 进入平台资金记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoPlatformDetailPage(String financePlatformId) {
        ModelAndView mav = new ModelAndView("finance_mgr/financePlatform_mgr/financePlatform_detail");
        if(StringUtils.isNotBlank(financePlatformId)){
            mav.addObject("financePlatformData", financePlatformService.getPlatform(financePlatformId));
        }
        return mav;
    }
    
    // 进入平台资金audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditPlatform(String financePlatformId) {
        ModelAndView mav = new ModelAndView("finance_mgr/financePlatform_mgr/financePlatform_audit");
        if(StringUtils.isNotBlank(financePlatformId)){
            mav.addObject("financePlatformData", financePlatformService.getPlatform(financePlatformId));
        }
        return mav;
    }
    
    // 审核平台资金记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditPlatform(@Valid FinancePlatform financePlatform, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financePlatformService.auditPlatform(financePlatform);
    }
    
    // 获取表格结构的所有平台资金记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listPlatformAsGridByPlatformId(FinFinancePlatformQueryDTO financePlatformQueryDTO,JqPager pager) {
        return financePlatformService.listAsGrid(financePlatformQueryDTO,pager);
    }
    
    // 增加平台资金记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addFinancePlatform(@Valid FinancePlatform financePlatform, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financePlatformService.addPlatform(financePlatform);
    }
    
    // 修改平台资金记录
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editFinancePlatform(@Valid FinancePlatform financePlatform, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financePlatformService.editPlatform(financePlatform);
    }
    
    // 批量删除平台资金记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delPlatform(@RequestParam List<String> financePlatformIds,@RequestParam List<String> platformNames) {
    	return financePlatformService.delPlatform(financePlatformIds, platformNames);
    }
}
