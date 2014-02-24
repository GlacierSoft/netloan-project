package com.glacier.netloan.web.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.member.MemberAuthService;

@Controller
@RequestMapping(value = "memberAuth")
public class MemberAuthController {
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	// 进入会员认证列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("member_mgr/memberAuth_mgr/memberAuth");
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pmember) {
        return memberAuthService.listAsGrid(pmember);
    }
}
