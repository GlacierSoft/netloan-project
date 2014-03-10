package com.glacier.netloan.web.controller.common;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.netloan.entity.member.Member;

@Controller
public class RegisterController extends AbstractController{

	@RequestMapping(value = "/intoregister.htm")
    public String intoregister(){
    	return "register";
    }
	@RequestMapping(value = "/register.htm",method = RequestMethod.POST)
	public Object register(@Valid Member member,BindingResult bindingResult,HttpSession session){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		ModelAndView mav = new ModelAndView("sendMailSuccess");
		
		// 创建一个临时用户注册ID
        String registerId = ""+Math.random() * Math.random();
		
        //邮件发送成功后，用户点在邮箱中点击这个链接回到注册网站。        
        String url = "http://localhost:8080/netloan-website//mailBack.htm?registerId=" + registerId;
        
        session.setAttribute(registerId, member.getMemberName());
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
			System.out.println("ddddddddd      "+member.getEmail());
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
	public Object mailBack(String registerId,HttpSession session){
		if(registerId == null){
			return "index";
		}
		String registerName = (String) session.getAttribute(registerId);
		 // 如果session设置的有限时间过期，则注册不成功，直接返回
        if(registerName == null || registerName.equals("")){ 
            return "index"; 
        } 						
        session.setAttribute("registerName", registerName);
		return "index";
	}
	
	@RequestMapping(value = "/sendMailSuccess.htm")
	public Object sendMailSuccess(){
		return "sendMailSuccess";
	}
}
