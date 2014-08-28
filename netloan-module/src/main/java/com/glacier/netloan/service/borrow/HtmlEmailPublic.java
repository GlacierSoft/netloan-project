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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.netloan.dao.member.MemberMapper;

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class HtmlEmailPublic implements Runnable{
	
	@Autowired
	private MemberMapper memberMapper;
	
	private List<String> toMailsList;
	
	private String Msg;
	
	public void setToMailsList(List<String> toMailsList) {
		this.toMailsList = toMailsList;
	}

	public void setMsg(String msg) {
		Msg = msg;
	}

	/**
	 * 发送者的账号和密码内部类
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
       sa.getuserinfo("a920339213", "a5572985");
       java.util.Properties props = new java.util.Properties();
       props.put("mail.smtp.auth", "true");
       props.put("mail.smtp.host", "smtp.163.com");
       InternetAddress fromAddress = new InternetAddress("a920339213@163.com");//创建发送人地址
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
     * 线程调用发送邮箱功能
     * @param toMails 邮箱数组
     * @param Msg 邮箱消息
     */
	public void run() {
		HtmlEmailPublic email = new HtmlEmailPublic();
		try {
			email.sendMessage(toMailsList, "冰川网贷注册", Msg);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}










