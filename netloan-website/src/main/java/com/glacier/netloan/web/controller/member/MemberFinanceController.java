package com.glacier.netloan.web.controller.member;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.member.MemberFinanceQueryDTO;
import com.glacier.netloan.service.member.MemberFinanceService;

@Controller
@RequestMapping(value = "memberFinance")
public class MemberFinanceController {
	
	@Autowired
	private MemberFinanceService memberFinanceService;
	
	// 进入会员财务记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmemberFinance() {
        ModelAndView mav = new ModelAndView("member_mgr/memberFinance_mgr/memberFinance");
        return mav;
    }
    
    // 进入会员财务记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberFinanceDetailPage(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/memberFinance_mgr/memberFinance_detail");
        if(StringUtils.isNotBlank(memberId)){
            mav.addObject("memberFinanceData", memberFinanceService.getMemberFinance(memberId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员财务记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listMemberFinanceAsGridByMenuId(MemberFinanceQueryDTO memberFinanceQueryDTO, JqPager pmemberFinancer) {
        return memberFinanceService.listAsGrid(memberFinanceQueryDTO,pmemberFinancer);
    }
    

}
