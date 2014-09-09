/*
 * @(#)MessageEmailService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.email;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.mail.MessagingException;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.email.MessageEmailMapper;
import com.glacier.netloan.dao.email.MessageRecordMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.entity.email.MessageEmail;
import com.glacier.netloan.entity.email.MessageEmailExample;
import com.glacier.netloan.entity.email.MessageRecord;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.borrow.HtmlEmailPublic;
import com.glacier.netloan.service.member.MemberService;

/** 
 * @ClassName: MessageEmailService 
 * @Description: TODO(活动邮件业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MessageEmailService {

	@Autowired
    private MessageEmailMapper messageEmailMapper;

	@Autowired
    private MemberService memberService;
	
	@Autowired
    private MemberMapper memberMapper;
	
	@Autowired
	private HtmlEmailPublic htmlEmailPublic;
	
	@Autowired
	private MessageRecordMapper messageRecordMapper;
	
	/**
	 * @Title: getEmail 
	 * @Description: TODO(根据活动邮件Id获取活动邮件) 
	 * @param @param emailId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    @Transactional(readOnly = false)
    public Object getEmail(String emailId) {
    	MessageEmail messageEmail = messageEmailMapper.selectByPrimaryKey(emailId);
    	return messageEmail;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有活动邮件信息) 
     * @param @param pemail
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager pemail) {
        JqGridReturn returnResult = new JqGridReturn();
        MessageEmailExample messageEmailExample = new MessageEmailExample();
        if (null != pemail.getPage() && null != pemail.getRows()) {// 设置排序信息
        	messageEmailExample.setLimitStart((pemail.getPage() - 1) * pemail.getRows());
        	messageEmailExample.setLimitEnd(pemail.getRows());
        }
        if (StringUtils.isNotBlank(pemail.getSort()) && StringUtils.isNotBlank(pemail.getOrder())) {// 设置排序信息
        	messageEmailExample.setOrderByClause(pemail.getOrderBy("temp_message_email_"));
        }
        List<MessageEmail>  messageEmails = messageEmailMapper.selectByExample(messageEmailExample); // 查询所有广告列表
        int total = messageEmailMapper.countByExample(messageEmailExample); // 查询总页数
        returnResult.setRows(messageEmails);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @throws MessagingException 
     * @Title: sendMessage 
     * @Description: TODO(发送活动邮件) 
     * @param messageEmail
     * @param array
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object sendMessage(String[] array,MessageEmail messageEmail) throws MessagingException {
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	List<String> emailList = new ArrayList<String>();//构建接收邮箱List
    	messageEmail.setEmailId(RandomGUID.getRandomGUID());
    	int count=0;
    	if(messageEmail.getEmailType().equals("candidate")){//部分群发
    		for (int i = 0; i < array.length; i++) {
    			Member member = memberService.getMemberMsg(array[i]);
    			emailList.add(member.getEmail());
			}
    		//对MessageEmail赋值
        	messageEmail.setCreater(pricipalUser.getUserId());
        	messageEmail.setCreaterTime(new Date());
        	messageEmail.setSendTime(new Date());
        	count = messageEmailMapper.insertSelective(messageEmail);
        	if(count==1){
        		for (int i = 0; i < array.length; i++) {
        			Member member = memberService.getMemberMsg(array[i]);
        			MessageRecord messageRecord = new MessageRecord();//构建邮箱记录
        			messageRecord.setRecordId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageRecord.setRecordTitle(messageEmail.getEmailTitle());//设置标题
        			messageRecord.setRecordSend(pricipalUser.getUserId());//管理员
        			messageRecord.setRecordMemberid(member.getMemberId());//会员ID
        			messageRecord.setCreaterTime(new Date());//设置当前时间
        			messageRecord.setEmailId(messageEmail.getEmailId());//设置活动邮件ID
        			messageRecordMapper.insertSelective(messageRecord);//执行添加
        		}
        		htmlEmailPublic.setMsg(messageEmail.getEmailText());
        		htmlEmailPublic.setTitle(messageEmail.getEmailTitle());
        		htmlEmailPublic.setToMailsList(emailList);
        		Thread thread = new Thread(htmlEmailPublic);
        		thread.start();//启动线程
        		returnResult.setMsg("发送成功");
        		returnResult.setSuccess(true);
        	}
    	}else if(messageEmail.getEmailType().equals("mass")){//群发会员
    		List<Member> memberList = memberService.getMemberList();
    		for (Member member : memberList) {
    			emailList.add(member.getEmail());
			}
    		//对MessageEmail赋值
        	messageEmail.setCreater(pricipalUser.getUserId());
        	messageEmail.setCreaterTime(new Date());
        	messageEmail.setSendTime(new Date());
        	count = messageEmailMapper.insertSelective(messageEmail);
        	if(count==1){
        		for (Member member : memberList) {
        			MessageRecord messageRecord = new MessageRecord();//构建邮箱记录
        			messageRecord.setRecordId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageRecord.setRecordTitle(messageEmail.getEmailTitle());//设置标题
        			messageRecord.setRecordSend(pricipalUser.getUserId());//管理员
        			messageRecord.setRecordMemberid(member.getMemberId());//会员ID
        			messageRecord.setCreaterTime(new Date());//设置当前时间
        			messageRecord.setEmailId(messageEmail.getEmailId());//设置活动邮件ID
        			messageRecordMapper.insertSelective(messageRecord);//执行添加
        		}
        		htmlEmailPublic.setMsg(messageEmail.getEmailText());
        		htmlEmailPublic.setTitle(messageEmail.getEmailTitle());
        		htmlEmailPublic.setToMailsList(emailList);
        		Thread thread = new Thread(htmlEmailPublic);
        		thread.start();//启动线程
        		returnResult.setMsg("发送成功");
        		returnResult.setSuccess(true);
        	}
    	}else if(messageEmail.getEmailType().equals("Vip")){
    		MemberExample memberExample = new MemberExample();
    		memberExample.createCriteria().andTypeEqualTo("vip");
    		List<Member> memberList = memberMapper.selectByExample(memberExample);
    		for (Member member : memberList) {
    			emailList.add(member.getEmail());
			}
    		//对MessageEmail赋值
        	messageEmail.setCreater(pricipalUser.getUserId());
        	messageEmail.setCreaterTime(new Date());
        	messageEmail.setSendTime(new Date());
        	count = messageEmailMapper.insertSelective(messageEmail);
        	if(count==1){
        		for (Member member : memberList) {
        			MessageRecord messageRecord = new MessageRecord();//构建邮箱记录
        			messageRecord.setRecordId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageRecord.setRecordTitle(messageEmail.getEmailTitle());//设置标题
        			messageRecord.setRecordSend(pricipalUser.getUserId());//管理员
        			messageRecord.setRecordMemberid(member.getMemberId());//会员ID
        			messageRecord.setCreaterTime(new Date());//设置当前时间
        			messageRecord.setEmailId(messageEmail.getEmailId());//设置活动邮件ID
        			messageRecordMapper.insertSelective(messageRecord);//执行添加
        		}
        		htmlEmailPublic.setMsg(messageEmail.getEmailText());
        		htmlEmailPublic.setTitle(messageEmail.getEmailTitle());
        		htmlEmailPublic.setToMailsList(emailList);
        		Thread thread = new Thread(htmlEmailPublic);
        		thread.start();//启动线程
        		returnResult.setMsg("发送成功");
        		returnResult.setSuccess(true);
        	}
    	}else if(messageEmail.getEmailType().equals("general")){
    		MemberExample memberExample = new MemberExample();
    		memberExample.createCriteria().andTypeEqualTo("general");
    		List<Member> memberList = memberMapper.selectByExample(memberExample);
    		for (Member member : memberList) {
    			emailList.add(member.getEmail());
			}
    		//对MessageEmail赋值
        	messageEmail.setCreater(pricipalUser.getUserId());
        	messageEmail.setCreaterTime(new Date());
        	messageEmail.setSendTime(new Date());
        	count = messageEmailMapper.insertSelective(messageEmail);
        	if(count==1){
        		for (Member member : memberList) {
        			MessageRecord messageRecord = new MessageRecord();//构建邮箱记录
        			messageRecord.setRecordId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageRecord.setRecordTitle(messageEmail.getEmailTitle());//设置标题
        			messageRecord.setRecordSend(pricipalUser.getUserId());//管理员
        			messageRecord.setRecordMemberid(member.getMemberId());//会员ID
        			messageRecord.setCreaterTime(new Date());//设置当前时间
        			messageRecord.setEmailId(messageEmail.getEmailId());//设置活动邮件ID
        			messageRecordMapper.insertSelective(messageRecord);//执行添加
        		}
        		htmlEmailPublic.setMsg(messageEmail.getEmailText());
        		htmlEmailPublic.setTitle(messageEmail.getEmailTitle());
        		htmlEmailPublic.setToMailsList(emailList);
        		Thread thread = new Thread(htmlEmailPublic);
        		thread.start();//启动线程
        		returnResult.setMsg("发送成功");
        		returnResult.setSuccess(true);
        	}
    	}
        return returnResult;
    }
}
