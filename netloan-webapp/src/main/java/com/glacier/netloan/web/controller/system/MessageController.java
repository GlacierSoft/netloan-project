 package com.glacier.netloan.web.controller.system;

import java.util.ArrayList;
import java.util.List; 
import javax.servlet.http.HttpSession;
import javax.validation.Valid;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView; 
import com.glacier.core.controller.AbstractController; 
import com.glacier.jqueryui.util.JqPager; 
import com.glacier.netloan.entity.system.Message;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.system.MessageService;  

/***
 * 
 * @ClassName:  MessageController
 * @Description: TODO(短消息Controller)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-9-3  下午3:25:32
 */

@Controller
@Scope("prototype")
@RequestMapping("/message")
public class MessageController extends AbstractController { 
	
    @Autowired
    private MessageService messageService;

     //点击我的消息
    @RequestMapping(value = "/received.htm",method = RequestMethod.GET)
    public Object receivedMsg() {  //kindEdt
   	    ModelAndView mav = new ModelAndView("message_mgr/myMessage_mgr/myMessage");  
   	    List<User> lis=new ArrayList<User>();
   	    lis=messageService.selectUser(); 
   	    if(lis.size()!=0){
   	    	mav.addObject("userList",lis); //读取用户列表
   	    } 
		return mav; 
    } 
     
     // 获取短信息
    @RequestMapping(value = "/all.json", method = RequestMethod.POST)
    @ResponseBody
    public Object all(JqPager pager, String sendOrReceive, String readStatus) {   
    	// 根据参数不同返回不同的短消息记录，包括（发送的、接收已读的、接收未读的）
    	return messageService.selectMessagesByPrincipal(pager, sendOrReceive, readStatus);
     }
	
     //短消息发送
    @RequestMapping(value="/addSave.json",method = RequestMethod.POST)
    @ResponseBody
    public Object addSave(@Valid  Message newMessage, BindingResult bindingResult, @RequestParam 
		List<String> recipientIds, HttpSession session) {   
	    //发送信息，成功与否，提示信息直接到前台msg显示
	    return messageService.createMessageSelective(newMessage, recipientIds);
 
    }

     //删除短消息
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delAnn(@RequestParam List<String> messageIds,String sendOrReceive) { 
    	return messageService.deleteMessage(messageIds,sendOrReceive);
    }
     
     //刷新是否有未读短消息的提示
    @RequestMapping(value = "/prompt.json", method = RequestMethod.POST)
    @ResponseBody
    public Object prompt() {
        return messageService.selectUnreadMessage() ;
    }
    
     //点击消息进行查看
    @RequestMapping(value = "/myMsg.json", method = RequestMethod.POST)
    @ResponseBody
    public Object myinfo( String messageId, String sendOrReceive) {
        return messageService.getMessage(messageId, sendOrReceive);
    } 
}
