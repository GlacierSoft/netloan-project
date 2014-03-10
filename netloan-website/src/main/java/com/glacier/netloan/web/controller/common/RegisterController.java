package com.glacier.netloan.web.controller.common;

import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
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

import com.glacier.basic.util.MyAuthenticator;
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
		System.out.println("注册post");
		/*if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }*/
		ModelAndView mav = new ModelAndView("sendMailSuccess");
		
		// 创建一个临时用户注册ID
        String registerId = "" + Math.random() * Math.random();
		
        //邮件发送成功后，用户点在邮箱中点击这个链接回到注册网站。        http://localhost:8080/netloan-website/index.htm
        String url = "http://localhost:8080/netloan-website//mailBack.htm?registerId=" + registerId;
        
        session.setAttribute(registerId, member.getMemberName());
        
        // 设置session的有效时间，为10分钟，10分钟内没有点击链接的话，注册将失败
        session.setMaxInactiveInterval(600); 
        System.out.println("111111111111111");
        // 设置邮箱的属性
        //Properties props = new Properties();
        // 若发送者的邮箱为其他服务器，例如163邮箱的话，就将下面服务器的值改为smtp.163.com
        //props.setProperty("mail.smtp.host", "smtp.163.com"); 
        //props.setProperty("mail.smtp.auth", "true"); 
        //props.setProperty("mail.smtp.port", "465");
        HtmlEmail email = new HtmlEmail();
		//email.setHostName("smtp.163.com");// QQ郵箱服務器
        email.setHostName("smtp.qq.com");// QQ郵箱服務器
		//email.setHostName("smtp.gmail.com");// QQ郵箱服務器
		email.setSmtpPort(465);
		//email.setAuthenticator(new DefaultAuthenticator("13798985542@163.com","13556470042"));
		email.setAuthenticator(new DefaultAuthenticator("804346249@qq.com","13556470042"));
		//email.setAuthenticator(new DefaultAuthenticator("yuzexu1@gmail.com","zx5304960"));
		//email.setTLS(true);
		//email.setSSL(true);
		try {
			//email.setFrom("13798985542@163.com", "13798985542@163.com", "UTF-8");
			email.setFrom("804346249@qq.com", "qq小泽", "UTF-8");
			//email.setFrom("yuzexu1@gmail.com", "yuzexu1@gmail.com", "UTF-8");
		} catch (EmailException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		email.setCharset("UTF-8");
        System.out.println("2222222222222222222222");

        
        // 设置验证值，发送者的邮箱要通过验证才可以发送邮件
        // 设置发送者的邮箱和密码，对其进行修改
        //String userName = "13798985542@163.com"; 
        //String password = "13556470042"; 
       // Authenticator authenticator = new MyAuthenticator(userName, password); 
        System.out.println("333333333333333333333");
        //javax.mail.Session mailSession = javax.mail.Session.getDefaultInstance(props,authenticator); 
        //mailSession.setDebug(true); 
        
        /*try{ 
        	System.out.println("444444444444444444444");
            Address from = new InternetAddress(userName); 
            Address to = new InternetAddress(member.getEmail()); 
             
            MimeMessage msg = new MimeMessage(mailSession); 
            msg.setFrom(from); 
            msg.setSubject("###网站注册"); 
            msg.setSentDate(new Date()); 
            msg.setContent("点击<a href='" + url + "'>" + url + "</a>完成注册！", "text/html;charset=utf-8"); 
            msg.setRecipient(RecipientType.TO, to);  
            Transport.send(msg); 

		} catch(MessagingException e){ 
		    e.printStackTrace(); 
		} */
        try {
			
			email.setSubject("冰川网贷注册");
			//email.setHtmlMsg("点击<a href='" + url + "'>" + url + "</a>完成注册！");
			email.setHtmlMsg("点击链接，完成注册！");
			System.out.println("       d        "+member.getEmail());
			if(member.getEmail() == null || (member.getEmail()).equals("")){
				email.addTo("804346249@qq.com");
			}
			//email.addTo(member.getEmail());
			//email.addTo("804346249@qq.com");
			//email.addTo("13798985542@163.com");
			email.addTo("1240033960@qq.com");
			email.send();
		} catch (EmailException e) {
			throw new RuntimeException(e);
		}
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaacaca");
		return mav;
	}
	
	@RequestMapping(value = "/mailBack.htm")
	public Object mailBack(String registerId,HttpSession session){
		if(registerId == null){
			return "index.htm";
		}
		String registerName = (String) session.getAttribute(registerId);
		 // 如果session设置的有限时间过期，则注册不成功，直接返回
        if(registerName == null || registerName.equals("")){ 
            return "index.htm"; 
        } 
        session.setAttribute("registerName", registerName);
		return "index.htm";
	}
	
	@RequestMapping(value = "/sendMailSuccess.htm")
	public Object sendMailSuccess(){
		return "sendMailSuccess.htm";
	}
}
