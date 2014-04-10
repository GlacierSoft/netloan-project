package com.glacier.netloan.web.controller.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.member.MemberMessageNoticeQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.service.member.MemberMessageNoticeService;

/**
 * @ClassName: MemberMessageNoticeController 
 * @Description: TODO(消息通知的Controoler) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-9下午1:22:23
 */
@Controller
@RequestMapping(value = "/messageNotice")
public class MemberMessageNoticeController extends AbstractController{
	
	@Autowired
	private MemberMessageNoticeService memberMessageNoticeService;// 注入消息通知业务Bean
	
	/**
	 * @Title: intoMessageNotice 
	 * @Description: TODO(跳转到信息通知页面，同时加载列表) 
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value ="/intoMessageNotice.htm")
	private Object intoMessageNotice(JqPager pager,int p,HttpServletRequest request){
		 ModelAndView mav = new ModelAndView("member_mgr/memberMessageNotice");
		 
		 Subject pricipalSubject = SecurityUtils.getSubject();
	     Member pricipalMember = (Member) pricipalSubject.getPrincipal();
	     //设置查询DTO收信人的id
	     MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO = new MemberMessageNoticeQueryDTO();
	     memberMessageNoticeQueryDTO.setAddressee(pricipalMember.getMemberId());
	     
	     //获取信息通知列表
	     JqGridReturn returnResult = (JqGridReturn) memberMessageNoticeService.listAsGridWebsite(memberMessageNoticeQueryDTO, pager,p);
	     request.setAttribute("messageNoticeDatas", returnResult);
	     
	     return mav;
	}
	// 前台查看消息通知Detail信息页面
    @RequestMapping(value = "/messageNoticeDetail.json")
    @ResponseBody
    private Object messageNoticeDetail(String messageNoticeId) {
    	MemberMessageNotice memberMessageNotice = (MemberMessageNotice) memberMessageNoticeService.getMemberMessageNotice(messageNoticeId);
    	memberMessageNotice.setLetterstatus("read");
    	memberMessageNoticeService.editMessageNoticeWebsit(memberMessageNotice);
        return memberMessageNoticeService.getMemberMessageNotice(messageNoticeId);
    }
	// 进入消息通知列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmessageNotice() {
        ModelAndView mav = new ModelAndView("member_mgr/messageNotice_mgr/messageNotice");
        return mav;
    }
    
    // 进入消息通知Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoMessageNoticeForm(String messageNoticeId) {
        ModelAndView mav = new ModelAndView("member_mgr/messageNotice_mgr/messageNotice_form");
        if(StringUtils.isNotBlank(messageNoticeId)){
            mav.addObject("messageNoticeData", memberMessageNoticeService.getMemberMessageNotice(messageNoticeId));
        }
        return mav;
    }
    
    // 进入消息通知Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMessageNoticeDetailPage(String messageNoticeId) {
        ModelAndView mav = new ModelAndView("member_mgr/messageNotice_mgr/messageNotice_detail");
        if(StringUtils.isNotBlank(messageNoticeId)){
            mav.addObject("messageNoticeData", memberMessageNoticeService.getMemberMessageNotice(messageNoticeId));
        }
        return mav;
    }
    
 // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO,JqPager pservicer) {
        return memberMessageNoticeService.listAsGrid(memberMessageNoticeQueryDTO,pservicer);
    }
    
    // 增加消息通知
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addMemberMessageNotice(@Valid MemberMessageNotice messageNotice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return memberMessageNoticeService.addMemberMessageNotice(messageNotice);
    }
    
    // 修改消息通知
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editMemberMessageNotice(@Valid MemberMessageNotice messageNotice, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return memberMessageNoticeService.editMemberMessageNotice(messageNotice);
    }
    
    // 批量删除消息通知
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMemberMessageNotice(@RequestParam List<String> messageNoticeIds,@RequestParam List<String> titles) {
    	return memberMessageNoticeService.delMemberMessageNotice(messageNoticeIds, titles);
    }
}
