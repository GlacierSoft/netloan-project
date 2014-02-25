/*
 * @(#)memberApplyAmountController.java
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
import com.glacier.netloan.dto.query.member.MemberApplyAmountQueryDTO;
import com.glacier.netloan.entity.member.MemberApplyAmount;
import com.glacier.netloan.service.member.MemberApplyAmountService;

/** 
 * @ClassName: memberApplyAmountController 
 * @Description: TODO(会员申请额度的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/applyAmount")
public class MemberApplyAmountController extends AbstractController{

    @Autowired
    private MemberApplyAmountService applyAmountService;// 注入会员申请额度业务Bean
    
    // 进入会员申请额度列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPapplyAmount() {
        ModelAndView mav = new ModelAndView("member_mgr/applyAmount_mgr/applyAmount");
        return mav;
    }
    
    // 进入会员申请额度Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoApplyAmountFormPapplyAmount(String memberApplyAmountId) {
        ModelAndView mav = new ModelAndView("member_mgr/applyAmount_mgr/applyAmount_form");
        if(StringUtils.isNotBlank(memberApplyAmountId)){
            mav.addObject("applyAmountData", applyAmountService.getApplyAmount(memberApplyAmountId));
        }
        return mav;
    }
    
    // 进入会员申请额度Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoApplyAmountDetailPage(String applyAmountId) {
        ModelAndView mav = new ModelAndView("member_mgr/applyAmount_mgr/applyAmount_detail");
        if(StringUtils.isNotBlank(applyAmountId)){
            mav.addObject("applyAmountData", applyAmountService.getApplyAmount(applyAmountId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员申请额度数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listApplyAmountAsGridByMenuId(MemberApplyAmountQueryDTO memberEstateQueryDTO, JqPager papplyAmountr) {
        return applyAmountService.listAsGrid(memberEstateQueryDTO, papplyAmountr);
    }
    
    // 增加会员申请额度
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addApplyAmount(@Valid MemberApplyAmount applyAmount, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return applyAmountService.addApplyAmount(applyAmount);
    }
}
