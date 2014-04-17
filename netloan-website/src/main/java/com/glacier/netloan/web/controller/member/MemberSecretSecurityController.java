/*
 * @(#)memberSecretSecurityController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.member;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.entity.basicdatas.ParameterQuestion;
import com.glacier.netloan.entity.member.MemberSecretSecurity;
import com.glacier.netloan.service.member.MemberSecretSecurityService;

/**
 * @ClassName: MemberSecretSecurityController 
 * @Description: TODO(前台密保管理的Controller) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-16下午4:15:29
 */
@Controller
@RequestMapping(value = "/secretSecurity")
public class MemberSecretSecurityController extends AbstractController{

    @Autowired
    private MemberSecretSecurityService secretSecurityService;// 注入会员密保业务Bean
    // 进入会员密保列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPsecretSecurity() {
        ModelAndView mav = new ModelAndView("member_mgr/secretSecurity_mgr/secretSecurity");
        return mav;
    }
    
    // 进入会员密保Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoSecretSecurityDetailPage(String secretSecurityId) {
        ModelAndView mav = new ModelAndView("member_mgr/secretSecurity_mgr/secretSecurity_detail");
        if(StringUtils.isNotBlank(secretSecurityId)){
            mav.addObject("secretSecurityData", secretSecurityService.getSecretSecurity(secretSecurityId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员密保数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listSecretSecurityAsGridByMenuId(JqPager secretSecurity) {
        return secretSecurityService.listAsGrid(secretSecurity);
    }
    @RequestMapping(value ="/addSecretSecurity.json")
    @ResponseBody
    private Object addSecretSecurityWebsite(String memberId,String questions1,String questions2,String questions3,String answers1,String answers2,String answers3){
    	//插入三条密保信息
    	MemberSecretSecurity secretSecurity = new MemberSecretSecurity();
    	secretSecurity.setMemberId(memberId);
    	secretSecurity.setAnswer(answers1);
    	secretSecurity.setQuestionId(questions1);
    	secretSecurityService.addSecretSecurity(secretSecurity);
    	secretSecurity.setAnswer(answers2);
    	secretSecurity.setQuestionId(questions2);
    	secretSecurityService.addSecretSecurity(secretSecurity);
    	secretSecurity.setAnswer(answers3);
    	secretSecurity.setQuestionId(questions3);
    	JqReturnJson returnResult = (JqReturnJson)secretSecurityService.addSecretSecurity(secretSecurity);
    	return returnResult;
    }
    
   
}
