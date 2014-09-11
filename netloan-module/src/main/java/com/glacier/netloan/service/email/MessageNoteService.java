package com.glacier.netloan.service.email;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.note.MessageInfoMapper;
import com.glacier.netloan.dao.note.MessageNoteMapper;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberExample;
import com.glacier.netloan.entity.note.MessageInfo;
import com.glacier.netloan.entity.note.MessageInfoExample;
import com.glacier.netloan.entity.note.MessageNote;
import com.glacier.netloan.entity.note.MessageNoteExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.member.MemberService;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MessageNoteService {
  
	@Autowired
	private MessageNoteMapper messageNoteMapper;
	
	@Autowired
	private MessageInfoMapper messageInfoMapper;
	
	@Autowired
    private MemberService memberService;
	
	@Autowired
	private MemberMapper memberMapper;
	
    public Object listAsGrid(JqPager pemail) {
      JqGridReturn returnResult = new JqGridReturn();
      MessageNoteExample messageNoteExample = new MessageNoteExample();
      if (null != pemail.getPage() && null != pemail.getRows()) {// 设置排序信息
    	  messageNoteExample.setLimitStart((pemail.getPage() - 1) * pemail.getRows());
    	  messageNoteExample.setLimitEnd(pemail.getRows());
      	}
      	if (StringUtils.isNotBlank(pemail.getSort()) && StringUtils.isNotBlank(pemail.getOrder())) {// 设置排序信息
    	  messageNoteExample.setOrderByClause(pemail.getOrderBy("temp_message_note_"));
      	}
      	List<MessageNote>  messageNotes = messageNoteMapper.selectByExample(messageNoteExample); // 查询所有广告列表
     	int total = messageNoteMapper.countByExample(messageNoteExample); // 查询总页数
     	returnResult.setRows(messageNotes);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    
    @Transactional(readOnly = false)
    public Object getNote(String noteId) {
    	MessageNote messageNote = messageNoteMapper.selectByPrimaryKey(noteId);
    	return messageNote;
    }
    
    
    @Transactional(readOnly=false)
    public Object getInfoList(String notreId){
    	MessageInfoExample messageInfoExample = new MessageInfoExample();
    	messageInfoExample.createCriteria().andNoteIdEqualTo(notreId);
    	List<MessageInfo> messageInfoList = messageInfoMapper.selectByExample(messageInfoExample);
    	return messageInfoList;
   }
    
    @Transactional(readOnly = false)
    public Object sendMessage(String[] array,MessageNote messageNote){
    	Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	List<String> noteList = new ArrayList<String>();//构建接收邮箱List
    	messageNote.setNoteId(RandomGUID.getRandomGUID());
    	int count=0;
    	if(messageNote.getNoteType().equals("candidate")){//部分群发
    		for (int i = 0; i < array.length; i++) {
    			Member member = memberService.getMemberMsg(array[i]);
    			noteList.add(member.getMobileNumber());
			}
    		//对MessageEmail赋值
        	messageNote.setCreater(pricipalUser.getUserId());
        	messageNote.setCreaterTime(new Date());
        	messageNote.setNoteTime(new Date());
        	count = messageNoteMapper.insertSelective(messageNote);
        	if(count==1){
        		for (int i = 0; i < array.length; i++) {
        			Member member = memberService.getMemberMsg(array[i]);
        			MessageInfo messageInfo= new MessageInfo();//构建邮箱记录
        			messageInfo.setInfoId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageInfo.setInfoTitle(messageNote.getNoteTitle());//设置标题
        			messageInfo.setInfoSend(pricipalUser.getUserId());//管理员
        			messageInfo.setInfoMemberid(member.getMemberId());//会员ID
        			messageInfo.setCreaterTime(new Date());//设置当前时间
        			messageInfo.setNoteId(messageNote.getNoteId());//设置活动邮件ID
        			messageInfoMapper.insertSelective(messageInfo);//执行添加
        		}
        		
        	}
        	
           for(int i=0;i<noteList.size();i++){
        	   noteSend(messageNote.getNoteText(),noteList.get(i));
           }	
        	
          returnResult.setMsg("发送成功");
    	  returnResult.setSuccess(true);
        	
        }else if(messageNote.getNoteType().equals("mass")){//群发会员
    		List<Member> memberList = memberService.getMemberList();
    		for (Member member : memberList) {
    			noteList.add(member.getMobileNumber());
			}
    		//对MessageEmail赋值
        	messageNote.setCreater(pricipalUser.getUserId());
        	messageNote.setCreaterTime(new Date());
        	messageNote.setNoteTime(new Date());
        	count = messageNoteMapper.insertSelective(messageNote);
        	if(count==1){
        		for (Member member : memberList) {
        			MessageInfo messageInfo = new MessageInfo();//构建邮箱记录
        			messageInfo.setInfoId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageInfo.setInfoTitle(messageNote.getNoteTitle());//设置标题
        			messageInfo.setInfoSend(pricipalUser.getUserId());//管理员
        			messageInfo.setInfoMemberid(member.getMemberId());//会员ID
        			messageInfo.setCreaterTime(new Date());//设置当前时间
        			messageInfo.setNoteId(messageNote.getNoteId());//设置活动邮件ID
        			messageInfoMapper.insertSelective(messageInfo);//执行添加
        		}
        	}
        	
        	for(int i=0;i<noteList.size();i++){
         	   noteSend(messageNote.getNoteText(),noteList.get(i));
            }
        	
        	returnResult.setMsg("发送成功");
    		returnResult.setSuccess(true);
    		
    	}else if(messageNote.getNoteType().equals("Vip")){
    		MemberExample memberExample = new MemberExample();
    		memberExample.createCriteria().andTypeEqualTo("vip");
    		List<Member> memberList = memberMapper.selectByExample(memberExample);
    		for (Member member : memberList) {
    			noteList.add(member.getMobileNumber());
			}
    		//对MessageEmail赋值
        	messageNote.setCreater(pricipalUser.getUserId());
        	messageNote.setCreaterTime(new Date());
        	messageNote.setNoteTime(new Date());
        	count = messageNoteMapper.insertSelective(messageNote);
        	if(count==1){
        		for (Member member : memberList) {
        			MessageInfo messageInfo = new MessageInfo();//构建邮箱记录
        			messageInfo.setInfoId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageInfo.setInfoTitle(messageNote.getNoteTitle());//设置标题
        			messageInfo.setInfoSend(pricipalUser.getUserId());//管理员
        			messageInfo.setInfoMemberid(member.getMemberId());//会员ID
        			messageInfo.setCreaterTime(new Date());//设置当前时间
        			messageInfo.setNoteId(messageNote.getNoteId());//设置活动邮件ID
        			messageInfoMapper.insertSelective(messageInfo);//执行添加
        		}
        		
        	}
        	
        	for(int i=0;i<noteList.size();i++){
         	   noteSend(messageNote.getNoteText(),noteList.get(i));
            }
        	
        	returnResult.setMsg("发送成功");
    		returnResult.setSuccess(true);
    		
    	}else if(messageNote.getNoteType().equals("general")){
    		MemberExample memberExample = new MemberExample();
    		memberExample.createCriteria().andTypeEqualTo("vip");
    		List<Member> memberList = memberMapper.selectByExample(memberExample);
    		for (Member member : memberList) {
    			noteList.add(member.getMobileNumber());
			}
    		//对MessageEmail赋值
        	messageNote.setCreater(pricipalUser.getUserId());
        	messageNote.setCreaterTime(new Date());
        	messageNote.setNoteTime(new Date());
        	count = messageNoteMapper.insertSelective(messageNote);
        	if(count==1){
        		for (Member member : memberList) {
        			MessageInfo messageInfo = new MessageInfo();//构建邮箱记录
        			messageInfo.setInfoId(RandomGUID.getRandomGUID());//随即产生32位ID
        			messageInfo.setInfoTitle(messageNote.getNoteTitle());//设置标题
        			messageInfo.setInfoSend(pricipalUser.getUserId());//管理员
        			messageInfo.setInfoMemberid(member.getMemberId());//会员ID
        			messageInfo.setCreaterTime(new Date());//设置当前时间
        			messageInfo.setNoteId(messageNote.getNoteId());//设置活动邮件ID
        			messageInfoMapper.insertSelective(messageInfo);//执行添加
        		}
        	}
        	
        	for(int i=0;i<noteList.size();i++){
         	   noteSend(messageNote.getNoteText(),noteList.get(i));
            }
        	
        	returnResult.setMsg("发送成功");
    		returnResult.setSuccess(true);
    	}
		return returnResult;
     }
    
    //活动短信发送
    public static void noteSend(String str,String mobile){
    	 String postUrl = "http://106.ihuyi.cn/webservice/sms.php?method=Submit";
         String account = "cf_CatMiao";
      	 String password = "abc15270740750yz";
      	 String content = new String("冰川网贷："+str);
          try {
            URL url = new URL(postUrl);
      	 	HttpURLConnection connection = (HttpURLConnection) url.openConnection();
      	 	connection.setDoOutput(true);//允许连接提交信息
      	 	connection.setRequestMethod("POST");//网页提交方式“GET”、“POST”
      	 	connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
      	 	connection.setRequestProperty("Connection", "Keep-Alive");
      	 	StringBuffer sb = new StringBuffer();
      	 	sb.append("account="+account);
      	 	sb.append("&password="+password);
      	 	sb.append("&mobile="+mobile);
      	 	sb.append("&content="+content);
      	 	OutputStream os = connection.getOutputStream();
      	 	os.write(sb.toString().getBytes());
      	 	os.close();

      	 	String line, result = "";
      	 	BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
      	 	while ((line = in.readLine()) != null) {
      	 		result += line + "\n";
      	 	}
      	 	in.close();
      	 	System.out.println("result="+result);
      	 } catch (IOException e) {
      	 	e.printStackTrace(System.out);
      	 }  
    	
    } 
}
