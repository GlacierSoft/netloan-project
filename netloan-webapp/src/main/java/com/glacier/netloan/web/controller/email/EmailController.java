/*
 * @(#)MessageEmailController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.email;
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
import com.glacier.netloan.entity.email.MessageEmail;
import com.glacier.netloan.service.email.MessageEmailService;
import com.glacier.netloan.service.member.MemberService;

/** 
 * @ClassName: MessageEmailController 
 * @Description: TODO(活动邮件的控制器) 
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
    private Object intoIndexPemail() {
        ModelAndView mav = new ModelAndView("message_mgr/email_mgr/email");
        return mav;
    }
    
    // 获取表格结构的所有活动邮件数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listEmailAsGridByMenuId(JqPager pemailr) {
        return messageEmailService.listAsGrid(pemailr);
    }
    
    // 进入活动邮件Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoEmailDetailPage(String emailId) {
        ModelAndView mav = new ModelAndView("message_mgr/email_mgr/email_detail");
        if(StringUtils.isNotBlank(emailId)){
            mav.addObject("emailData", messageEmailService.getEmail(emailId));
        }
        return mav;
    }
    
    // 获取活动邮件数据
    @RequestMapping(value = "/list2.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listEmailAsGrid(JqPager pemailr,String param) {
        return memberService.listAsTree(param);
    }
    
    // 进入活动邮件Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoEmailFormPemail(String webAdvId) {
        ModelAndView mav = new ModelAndView("message_mgr/email_mgr/email_form");
        if(StringUtils.isNotBlank(webAdvId)){
            mav.addObject("emailData", messageEmailService.getEmail(webAdvId));
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
