package com.glacier.netloan.service.borrow;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.netloan.entity.member.Member;

@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class HtmlEmailPublic {
	/**
	 * 封装好的公共发送邮箱方法
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
}










