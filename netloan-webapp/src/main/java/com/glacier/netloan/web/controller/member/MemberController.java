package com.glacier.netloan.web.controller.member;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.system.MemberQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.service.member.MemberService;

@Controller
@RequestMapping(value = "member")
public class MemberController extends AbstractController{

	@Autowired
	private MemberService memberService;
	
	// 进入会员列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("member_mgr/member_mgr/member");
        return mav;
    }
    
    // 进入会员Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoMemberFormPmember(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/member_mgr/member_form");
        if(StringUtils.isNotBlank(memberId)){
            mav.addObject("memberData", memberService.getMember(memberId));
            mav.addObject("memberWorkData", memberService.getMemberWork(memberId));
        }
        return mav;
    }
    
    // 进入会员Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberDetailPage(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/member_mgr/member_detail");
        if(StringUtils.isNotBlank(memberId)){
            mav.addObject("memberData", memberService.getMember(memberId));
            mav.addObject("memberWorkData", memberService.getMemberWork(memberId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(MemberQueryDTO memberQueryDTO, JqPager pmember) {
        return memberService.listAsGrid(memberQueryDTO,pmember);
    }
    
    // 增加会员
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addMember(@Valid Member member,@Valid MemberWork memberWork, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return memberService.addMemberandWorkandAuth(member, memberWork);
    }
    
    // 修改会员
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editMember(@Valid Member member,BindingResult bindingResult,@Valid MemberWork memberWork,BindingResult bindingResultWork) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        if (bindingResultWork.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResultWork);
        }
        return memberService.editMemberandWork(member, memberWork);
    }
    // 批量删除会员
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMember(@RequestParam List<String> memberIds,@RequestParam List<String> memberNames) {
    	return memberService.delMemberandWorkandAuth(memberIds, memberNames);
    }
}
