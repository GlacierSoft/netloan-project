package com.glacier.netloan.service.borrow;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.member.Member;

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class HtmlEmailPublic {
	
	@Autowired
	private MemberMapper memberMapper;
	
	/**
	 * 封装好的公共发送邮箱方法--第一种
	 * @param member
	 * @param msg
	 */
	public void goEmail(Member member,String msg){
		// 基于org.apache.commons.mail,封装好的mail，发邮件流程比较简单，比原生态mail简单。
		HtmlEmail email = new HtmlEmail();
		email.setHostName("smtp.qq.com");// QQ郵箱服務器
		email.setSmtpPort(465);// 设置端口号
        email.setAuthenticator(new DefaultAuthenticator("1240033960@qq.com", "zx5304960"));// 用1240033960@qq.com这个邮箱发送验证邮件的
        email.setTLS(true);// tls要设置为true,没有设置会报错。
        email.setSSL(true);// ssl要设置为true,没有设置会报错。
        try {
			email.setFrom("1240033960@qq.com", "冰川网贷管理员", "UTF-8");
			email.setSubject("冰川网贷注册");// 设置邮件名称
	        email.setHtmlMsg(msg);// 设置邮件内容
	        email.setCharset("UTF-8");// 没有设置会乱码。
	        email.addTo(member.getEmail());// 给会员发邮件
	        email.send();// 邮件发送
		} catch (EmailException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 返回发送者的账号和密码--以下为第二种
	 * @author Administrator
	 *
	 */
	static class SmtpAuth extends javax.mail.Authenticator {
	       private String user, password;
	 
	       public void getuserinfo(String getuser, String getpassword) {
	           user = getuser;
	           password = getpassword;
	       }
	 
	       protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
	           return new javax.mail.PasswordAuthentication(user, password);
	       }
	}
 
 
	/**
     * 功能：群发功能,把所有的目的邮箱作为一个数组参数传入
     * create date:2014-8-27
     * author:WT
     * @param toMails 目的邮箱数组
     * @param subject 消息标题
     * @param messageText 消息内容
     * @throws MessagingException
     */
    public void sendMessage(List<String> toMails, String subject, String messageText) throws MessagingException {
       SmtpAuth sa = new SmtpAuth();
       sa.getuserinfo("1240033960", "zx5304960");
       java.util.Properties props = new java.util.Properties();
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.host", "smtp.qq.com");
       InternetAddress fromAddress = new InternetAddress("1240033960@qq.com");//创建发送人地址
       InternetAddress[] toAddresss = new InternetAddress[toMails.size()];//创建邮件发送者地址 
       for(int len=0;len<toMails.size();len++){
           toAddresss[len] = new InternetAddress(toMails.get(len));
       }
       Session mailSession = Session.getDefaultInstance(props, sa);// 根据邮件会话属性和密码验证器构造一个发送邮件的session 
       MimeMessage testMessage = new MimeMessage(mailSession);//根据session创建一个邮件消息
       testMessage.setFrom(fromAddress);//设置邮件消息的发送者  
       testMessage.addRecipients(javax.mail.Message.RecipientType.TO, toAddresss);//设置收件人的地址（为数组类型）
       testMessage.setSentDate(new java.util.Date());//设置当前时间
       testMessage.setSubject(subject);//设置邮件消息的主题
       testMessage.setText(messageText);//设置邮件内容
       Multipart mainPart = new MimeMultipart();//MimeMultipart类是一个容器类，包含MimeBodyPart类型的对象  
       MimeBodyPart messageBodyPart = new MimeBodyPart();//创建一个包含HTML内容的MimeBodyPart  
       //设置HTML内容  
       messageBodyPart.setContent(messageText,"text/html; charset=utf-8");
       mainPart.addBodyPart(messageBodyPart); 
       testMessage.setContent(mainPart);
       Transport.send(testMessage);//发送邮件
    }
    
    /**
     * 调用发送邮箱功能
     * @param toMails 邮箱数组
     * @param Msg 邮箱消息
     */
    public void sendEmail(List<String> toMails,String Msg){
    	HtmlEmailPublic email = new HtmlEmailPublic();
		try {
			email.sendMessage(toMails, "冰川网贷注册", Msg);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
    }
}










