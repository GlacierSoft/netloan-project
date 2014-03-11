package com.glacier.netloan.web.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.member.MemberService;

@Controller
public class RegisterController extends AbstractController{
	
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/intoregister.htm")
    public String intoregister(){
    	return "register";
    }
	@RequestMapping(value = "/register.htm",method = RequestMethod.POST)
	public Object register(@Valid Member member,BindingResult bindingResult,String captcha,HttpServletRequest request, HttpSession session){
		String isCaptcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		if (StringUtils.isBlank(captcha) || !isCaptcha.equalsIgnoreCase(captcha)) {
            //throw new IncorrectCaptchaException("验证码错误！");
        	request.setAttribute("errorCaptcha", "errorCaptcha");//通过设置errorCaptcha的 值，来判断验证码是否正确。
        	request.setAttribute("member", member);
        	return "register";
        }
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		//判断用户名是否重复
		 JqReturnJson returnisUsernameRepeat = (JqReturnJson) memberService.isUsernameRepeat(member);
		if(!returnisUsernameRepeat.isSuccess()){
			request.setAttribute("usernameRepeat", "usernameRepeat");//通过设置usernameRepeat的 值，来判断用户名是否重复。
			request.setAttribute("member", member);
			return "register";
		}
		//判断用户名是否重复isEmailRepeat
		 JqReturnJson returnisEmailRepeat = (JqReturnJson) memberService.isEmailRepeat(member);
		if(!returnisEmailRepeat.isSuccess()){
			request.setAttribute("emailRepeat", "emailRepeat");//通过设置emailRepeat的 值，来判断邮箱是否重复。
			request.setAttribute("member", member);
			return "register";
		}
		
		ModelAndView mav = new ModelAndView("sendMailSuccess");
		
		// 创建一个临时用户注册ID
        String registerId = ""+Math.random() * Math.random();
		
        //邮件发送成功后，用户点在邮箱中点击这个链接回到注册网站。        
        String url = "http://localhost:8080/netloan-website//mailBack.htm?registerId=" + registerId;
        
        session.setAttribute(registerId, member.getMemberName());
        session.setAttribute("memberSimple", member);
        // 设置session的有效时间，为10分钟，10分钟内没有点击链接的话，注册将失败
        session.setMaxInactiveInterval(600); 
      
        //基于org.apache.commons.mail,封装好的mail，发邮件流程比较简单，比原生态mail简单。
        HtmlEmail email = new HtmlEmail();

        email.setHostName("smtp.qq.com");// QQ郵箱服務器
		//email.setHostName("smtp.163.com");// 163郵箱服務器
		//email.setHostName("smtp.gmail.com");// gmail郵箱服務器
		email.setSmtpPort(465);//设置端口号
		
		email.setAuthenticator(new DefaultAuthenticator("1240033960@qq.com","zx5304960"));
		//email.setAuthenticator(new DefaultAuthenticator("13798985542@163.com","13556470042"));
		//email.setAuthenticator(new DefaultAuthenticator("yuzexu1@gmail.com","zx5304960"));
		
		email.setTLS(true);//tls要设置为true,没有设置会报错。
		email.setSSL(true);//ssl要设置为true,没有设置会报错。
		try {
			email.setFrom("1240033960@qq.com", "冰川网贷管理员", "UTF-8");
			//email.setFrom("13798985542@163.com", "13798985542@163.com", "UTF-8");
			//email.setFrom("yuzexu1@gmail.com", "yuzexu1@gmail.com", "UTF-8");
		} catch (EmailException e1) {
			e1.printStackTrace();
		}
		email.setCharset("UTF-8");//没有设置会乱码。
        
        try {
			email.setSubject("冰川网贷注册");//设置邮件名称
			email.setHtmlMsg("点击<a href='" + url + "'>" + url + "</a>完成注册！");//设置邮件内容
			email.addTo(member.getEmail());//给会员发邮件
			//email.addTo("804346249@qq.com");
			//email.addTo("13798985542@163.com");
			//email.addTo("1240033960@qq.com");
			email.send();//邮件发送
		} catch (EmailException e) {
			throw new RuntimeException(e);
		}
		return mav;
	}
	
	@RequestMapping(value = "/mailBack.htm")
	public Object mailBack(String registerId,HttpServletRequest request,HttpSession session){
		if(registerId == null){
			return "index";
		}
		String registerName = (String) session.getAttribute(registerId);
		 // 如果session设置的有限时间过期，则注册不成功，直接返回
        if(registerName == null || registerName.equals("")){ 
            return "index"; 
        } 						
        session.setAttribute("registerName", registerName);
        JqReturnJson returnResult = (JqReturnJson) memberService.addMemberReception((Member) session.getAttribute("memberSimple"));
        request.setAttribute("returnResult", returnResult);
        session.setAttribute("currentMember", returnResult.getObj());
        if(!returnResult.isSuccess()){
        	return "index";
        }
		return "member_mgr/member";
	}
	
	@RequestMapping(value = "/sendMailSuccess.htm")
	public Object sendMailSuccess(){
		return "sendMailSuccess";
	}
	//转到“关于我们”页面
	@RequestMapping(value = "/aboutUs.htm")
	public Object aboutUs(){
		return "about_mgr/aboutUs";
	}
	//转到“招纳贤士”页面
	@RequestMapping(value = "/hiring.htm")
	public Object hiring(){
		return "about_mgr/hiring";
	}
	//转到“联系我们”页面
	@RequestMapping(value = "/contactUs.htm")
	public Object contactUs(){
		return "about_mgr/contactUs";
	}
}
