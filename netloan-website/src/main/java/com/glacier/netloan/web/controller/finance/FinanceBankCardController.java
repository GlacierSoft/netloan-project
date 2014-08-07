package com.glacier.netloan.web.controller.finance;

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
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.basicdatas.ParameterQuestionService;
import com.glacier.netloan.service.finance.FinanceBankCardService;
import com.glacier.netloan.service.member.MemberAuthService;
import com.glacier.netloan.service.member.MemberSecretSecurityService;

@Controller
@RequestMapping(value = "/bankCard")
public class FinanceBankCardController extends AbstractController {

	@Autowired
	private FinanceBankCardService bankCardService;
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	@Autowired
	private FinanceBankCardService financeBankCardService;
	
	@Autowired
	private ParameterQuestionService parameterQuestionService;
	
	@Autowired
	private MemberSecretSecurityService memberSecretSecurityService;
	
	@RequestMapping(value = "/addBankCard.htm")
	@ResponseBody
	public Object addBankCard(@Valid FinanceBankCard bankCard, BindingResult bindingResult){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		//bankCard.setMemberId(memberId);
		//JqReturnJson returnResult = (JqReturnJson) bankCardService.addFinanceBankCardWebsit(bankCard);
		
		return bankCardService.addFinanceBankCardWebsit(bankCard);
	}
	
	@RequestMapping(value = "del.htm")
	public Object del(String bankCardId,HttpServletRequest request,String addBankCard){
        /*Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs)memberAuthService.getMemberAuth(pricipalMember.getMemberId());
        //对于前台查询列表，设置pager的值
        JqPager pager = new JqPager();
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        //查询密保问题数据，放到rqquest.setAttribute中
		@SuppressWarnings("unchecked")
		List<ParameterQuestion> parameterQuestionResult = (List<ParameterQuestion>)parameterQuestionService.listAsGrid(pager);
        request.setAttribute("parameterQuestionResult", parameterQuestionResult);
        //查询银行卡列表
        JqGridReturn returnResult = (JqGridReturn) financeBankCardService.listAsGridWebsite(pricipalMember.getMemberId(), pager);
        @SuppressWarnings("unchecked")
		List<FinanceBankCard> bandCards =  (List<FinanceBankCard>) returnResult.getRows();
        request.setAttribute("memberBankCardDatas", bandCards);
        //判断会员基本信息认证和工作认证状态，让相对应的表单是否可编辑
        if((memberAuthWithBLOBs.getInfoAuth().equals("authstr") && memberAuthWithBLOBs.getWorkAuth().equals("authstr"))||
        		(memberAuthWithBLOBs.getInfoAuth().equals("pass") && memberAuthWithBLOBs.getWorkAuth().equals("pass"))){
        	request.setAttribute("infoAndWorAuthstr", "infoAndWorRealOnly");        	       	
        }else{
        	request.setAttribute("infoAndWorAuthstr", "infoAndWorEdit"); 
        }
        //判断是否是增加银行卡表单提交过来的，以addBankCard字符串作为标记。
        if(addBankCard != null){
        	request.setAttribute("addBankCard", "addBankCard");
        }*/
		//删除银行卡
        bankCardService.delFinanceBankCardWebsit(bankCardId);
        ModelAndView mav = new ModelAndView("member_mgr/memberDetail");
        JqPager pager = new JqPager();
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        //查询该会员是否已设置了密保信息，
        JqGridReturn SecretSecurityResult = (JqGridReturn)memberSecretSecurityService.listAsGridWebsite(pricipalMember.getMemberId(), pager);
        request.setAttribute("SecretSecurityResult", SecretSecurityResult);
        //查询银行卡列表
        JqGridReturn returnResult = (JqGridReturn) financeBankCardService.listAsGridWebsite(pricipalMember.getMemberId(), pager);
        @SuppressWarnings("unchecked")
		List<FinanceBankCard> bandCards =  (List<FinanceBankCard>) returnResult.getRows();//获取会员个人的银行卡数据
        request.setAttribute("memberBankCardDatas", bandCards);
        return mav;
	}
	/*@RequestMapping(value = "del.htm")
	@ResponseBody
	public Object del(String bankCardId){
		return bankCardService.delFinanceBankCardWebsit(bankCardId);
	}*/
}
