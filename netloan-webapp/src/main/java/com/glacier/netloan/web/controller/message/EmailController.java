/*
 * @(#)WebsiteAdvertisementController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.message;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.Tree;
import com.glacier.netloan.entity.email.MessageEmail;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.member.MemberService;
import com.glacier.netloan.service.message.MessageEmailService;

/** 
 * @ClassName: WebsiteAdvertisementController 
 * @Description: TODO(广告的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/email")
public class EmailController extends AbstractController{

	@Autowired
	private MessageEmailService messageEmailService; 
	
	@Autowired
	private MemberService memberService; 
	
    // 进入活动邮件列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPadvertisement() {
        ModelAndView mav = new ModelAndView("message_mgr/email_mgr/email");
        return mav;
    }
    
    // 获取表格结构的所有活动邮件数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listAdvertisementAsGridByMenuId(JqPager padvertisementr) {
        return messageEmailService.listAsGrid(padvertisementr);
    }
    
    // 进入活动邮件Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoAdvertisementDetailPage(String emailId) {
        ModelAndView mav = new ModelAndView("message_mgr/email_mgr/email_detail");
        if(StringUtils.isNotBlank(emailId)){
            mav.addObject("emailData", messageEmailService.getEmail(emailId));
        }
        return mav;
    }
    
    // 获取活动邮件数据
    @RequestMapping(value = "/list2.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listAdvertisementAsGrid(JqPager padvertisementr) {
        return memberService.listAsTree();
    }
    
    // 进入广告Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoAdvertisementFormPadvertisement(String webAdvId) {
        ModelAndView mav = new ModelAndView("message_mgr/email_mgr/email_form");
        if(StringUtils.isNotBlank(webAdvId)){
            mav.addObject("advertisementData", messageEmailService.getEmail(webAdvId));
        }
        return mav;
    }
    
    //发送活动邮件
    @RequestMapping(value = "/send.json", method = RequestMethod.POST)
    @ResponseBody
    private Object sendEmail(String[] arrys,MessageEmail email) throws MessagingException {
        return messageEmailService.sendMessage(arrys, email);
    }
    
}
