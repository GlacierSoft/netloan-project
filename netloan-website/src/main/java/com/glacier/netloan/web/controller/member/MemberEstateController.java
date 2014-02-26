/*
 * @(#)memberEstateController.java
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
import com.glacier.netloan.entity.member.MemberEstate;
import com.glacier.netloan.service.member.MemberEstateService;

/** 
 * @ClassName: memberEstateController 
 * @Description: TODO(会员房产信息的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/estate")
public class MemberEstateController extends AbstractController{

    @Autowired
    private MemberEstateService estateService;// 注入会员房产信息业务Bean
    
    // 进入会员房产信息列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPestate() {
        ModelAndView mav = new ModelAndView("member_mgr/estate_mgr/estate");
        return mav;
    }
    
    // 进入会员房产信息Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoEstateFormPestate(String estateId) {
        ModelAndView mav = new ModelAndView("member_mgr/estate_mgr/estate_form");
        if(StringUtils.isNotBlank(estateId)){
            mav.addObject("estateData", estateService.getEstate(estateId));
        }
        return mav;
    }
    
    // 进入会员房产信息Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoEstateDetailPage(String estateId) {
        ModelAndView mav = new ModelAndView("member_mgr/estate_mgr/estate_detail");
        if(StringUtils.isNotBlank(estateId)){
            mav.addObject("estateData", estateService.getEstate(estateId));
        }
        return mav;
    }
    
    
    // 增加会员房产信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addEstate(@Valid MemberEstate estate, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return estateService.addEstate(estate);
    }
}
