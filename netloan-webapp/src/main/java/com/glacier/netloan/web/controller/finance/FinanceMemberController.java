/*
 * @(#)FinanceMemberController.java
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
import com.glacier.netloan.dto.query.finance.FinFinanceMemberQueryDTO;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.service.finance.FinanceMemberService;

/** 
 * @ClassName: FinanceMemberController 
 * @Description: TODO(会员资金记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/financeMember")
public class FinanceMemberController extends AbstractController{

    @Autowired
    private FinanceMemberService financeMemberService;// 注入会员资金记录业务Bean
    
    // 进入会员资金记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinanceMember() {
        ModelAndView mav = new ModelAndView("finance_mgr/financeMember_mgr/financeMember");
        return mav;
    }
    
    // 进入会员资金记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberDetailPage(String financeMemberId) {
        ModelAndView mav = new ModelAndView("finance_mgr/financeMember_mgr/financeMember_detail");
        if(StringUtils.isNotBlank(financeMemberId)){
            mav.addObject("financeMemberData", financeMemberService.getFinanceMember(financeMemberId));
        }
        return mav;
    }
    
    // 进入会员资金audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditMember(String financeMemberId) {
        ModelAndView mav = new ModelAndView("finance_mgr/financeMember_mgr/financeMember_audit");
        if(StringUtils.isNotBlank(financeMemberId)){
            mav.addObject("financeMemberData", financeMemberService.getFinanceMember(financeMemberId));
        }
        return mav;
    }
    
    // 审核会员资金记录
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditMember(@Valid FinanceMember financeMember, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeMemberService.auditMember(financeMember);
    }
    
    // 获取表格结构的所有会员资金记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listMemberAsGridByMenuId(FinFinanceMemberQueryDTO financeMemberQueryDTO,JqPager pager) {
        return financeMemberService.listAsGrid(financeMemberQueryDTO,pager);
    }
    
    // 批量删除会员资金记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMember(@RequestParam List<String> financeMemberIds,@RequestParam List<String> memberCodes) {
    	return financeMemberService.delMember(financeMemberIds, memberCodes);
    }
}
