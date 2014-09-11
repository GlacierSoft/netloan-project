package com.glacier.netloan.web.controller.email;

import javax.mail.MessagingException;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.email.MessageEmail;
import com.glacier.netloan.entity.note.MessageNote;
import com.glacier.netloan.service.email.MessageNoteService;
import com.glacier.netloan.service.member.MemberService;


/** 
 * @ClassName: MessageEmailController 
 * @Description: TODO(活动邮件的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */

@Controller
@RequestMapping(value="/note")
public class NoteController {
    
	@Autowired
	private MessageNoteService messageNoteService;
	
	@Autowired
	private MemberService memberService;  
	
	// 进入活动邮件列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexNote() {
        ModelAndView mav = new ModelAndView("message_mgr/note_mgr/note");
        return mav;
    }
    
    // 获取表格结构的所有活动邮件数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listNoteAsGridByMenuId(JqPager pemailr) {
        return messageNoteService.listAsGrid(pemailr);
    }
    
    // 进入活动邮件Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoNoteDetailPage(String noteId) {
        ModelAndView mav = new ModelAndView("message_mgr/note_mgr/note_detail");
        if(StringUtils.isNotBlank(noteId)){
            mav.addObject("noteData", messageNoteService.getNote(noteId));
        }
        return mav;
    }
    
    // 进入活动短信Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoNoteFormPemail() {
    	ModelAndView mav = new ModelAndView("message_mgr/note_mgr/note_form");
        return mav;
    }
    
    // 进入活动邮件Detail信息页面
    @RequestMapping(value = "/addresseeDetail.htm")
    private Object addresseeDetail(String noteId) {
        ModelAndView mav = new ModelAndView("message_mgr/note_mgr/note_addressee");
        if(StringUtils.isNotBlank(noteId)){
            mav.addObject("infoDatas", messageNoteService.getInfoList(noteId));
        }
        return mav;
   }
    
   //获取全部会员
    @RequestMapping(value = "/listAsTree.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listNoteAsGrid(JqPager pemailr,String param) {
        return memberService.listAsTree(param);
    }
    
    //发送活动短信
    @RequestMapping(value = "/send.json", method = RequestMethod.POST)
    @ResponseBody
    private Object sendEmail(String[] arrys,MessageNote note,String textare) throws MessagingException {
        return messageNoteService.sendMessage(arrys, note);
    }
    
    
    
}
