package com.glacier.netloan.web.controller.finance;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.service.finance.FinanceBankCardService;
import com.glacier.netloan.service.member.MemberAuthService;

@Controller
@RequestMapping(value = "/bankCard")
public class FinanceBankCardController extends AbstractController {

	@Autowired
	private FinanceBankCardService bankCardService;
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	@Autowired
	private FinanceBankCardService financeBankCardService;
	
	@RequestMapping(value = "/addBankCard.htm")
	@ResponseBody
	public Object addBankCard(@Valid FinanceBankCard bankCard, BindingResult bindingResult, String memberId){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		bankCard.setMemberId(memberId);
		//JqReturnJson returnResult = (JqReturnJson) bankCardService.addFinanceBankCardWebsit(bankCard);
		
		return bankCardService.addFinanceBankCardWebsit(bankCard);
	}
	@RequestMapping(value = "del.htm")
	public Object del(String bankCardId,HttpServletRequest request,String addBankCard){
		
		 //删除银行卡
        bankCardService.delFinanceBankCardWebsit(bankCardId);
		
		ModelAndView mav = new ModelAndView("member_mgr/memberDetail");
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs)memberAuthService.getMemberAuth(pricipalMember.getMemberId());
        
        JqPager pager = new JqPager();
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        JqGridReturn returnResult = (JqGridReturn) financeBankCardService.listAsGrid(pager);
        List<FinanceBankCard> bandCards =  (List<FinanceBankCard>) returnResult.getRows();
        request.setAttribute("memberBankCardDatas", bandCards);
        
        if((memberAuthWithBLOBs.getInfoAuth().equals("noapply") && memberAuthWithBLOBs.getWorkAuth().equals("noapply"))||
        		(memberAuthWithBLOBs.getInfoAuth().equals("failure") && memberAuthWithBLOBs.getWorkAuth().equals("failure"))){
        	request.setAttribute("infoAndWorAuthstr", "infoAndWorEdit");        	
        }else{
        	request.setAttribute("infoAndWorAuthstr", "infoAndWorRealOnly");
        }
        if(addBankCard != null){
        	request.setAttribute("addBankCard", "addBankCard");
        }
       
        return mav;
	}
	/*@RequestMapping(value = "del.htm")
	@ResponseBody
	public Object del(String bankCardId){
		return bankCardService.delFinanceBankCardWebsit(bankCardId);
	}*/
}
