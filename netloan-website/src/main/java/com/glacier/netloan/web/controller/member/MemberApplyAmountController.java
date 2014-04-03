/*
 * @(#)memberApplyAmountController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberApplyAmount;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberCreditIntegral;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.service.member.MemberApplyAmountService;
import com.glacier.netloan.service.member.MemberAuthService;
import com.glacier.netloan.service.member.MemberCreditIntegralService;
import com.glacier.netloan.service.member.MemberIntegralService;

/** 
 * @ClassName: memberApplyAmountController 
 * @Description: TODO(会员申请额度的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/applyAmount")
public class MemberApplyAmountController extends AbstractController{

    @Autowired
    private MemberApplyAmountService applyAmountService;// 注入会员申请额度业务Bean
    
    @Autowired
    private MemberApplyAmountService memberApplyAmountService;
    
    @Autowired
    private ParameterCreditService parameterCreditService;
    
    @Autowired
    private MemberAuthService memberAuthService;
    
    @Autowired
    private MemberCreditIntegralService memberCreditIntegralService;
    
    @Autowired
    private MemberIntegralService memberIntegralService;
    
    
    // 增加会员申请额度
    @RequestMapping(value = "/add.htm", method = RequestMethod.POST)
    @ResponseBody
    private Object addApplyAmountReception(@Valid MemberApplyAmount applyAmount, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
        	return returnErrorBindingResult(bindingResult);
        }
        return applyAmountService.addApplyAmountReception(applyAmount);
    }
    @RequestMapping(value = "/applyAmountPage.htm")
    public Object intoMemberAuth(JqPager pager,int p,String pageType,HttpServletRequest request,HttpSession session){
    	ModelAndView mav = new ModelAndView("member_mgr/memberAuth");
    	Map<String,Object> integralMap = new HashMap<String,Object>();
    	Map<String,Object> applyAmountServiceMap = new HashMap<String,Object>();
    	//获取全部信用积分的范围列表
    	List<ParameterCredit>  parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
    	//通过获取member的Id，来得到改会员的所有信用积分
    	Member member = (Member)session.getAttribute("currentMember");
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());
    	List<MemberCreditIntegral>  memberCreditIntegrals = (List<MemberCreditIntegral>) memberCreditIntegralService.listByMemberId(member.getMemberId());
    	//通过该会员的所有信用积分和基础资料的信用积分得到，该会员的信用总分和图标
    	Map<String,Object> totalIntegralAndPhotoMap = new MemberController().totalIntegralAndPhoto(parameterCredits, memberCreditIntegrals);
    	//通过json来传递该会员的所有信用积分到前台
    	JSONArray jsonMemberCreditIntegrals = new JSONArray();  
    	jsonMemberCreditIntegrals.addAll(memberCreditIntegrals);
    	//通过request传递到前台。
    	request.setAttribute("parameterCredits", parameterCredits);
    	request.setAttribute("json", jsonMemberCreditIntegrals);
    	request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
    	request.setAttribute("memberCreditIntegrals", memberCreditIntegrals);
    	//获取信用总分和图标
    	request.setAttribute("totalIntegralCredit", totalIntegralAndPhotoMap.get("totalIntegralCredit"));
    	request.setAttribute("totalCreditPhoto", totalIntegralAndPhotoMap.get("totalCreditPhoto"));
    	
		//点击额度申请分页，也要默认把积分分页p=1,加进来，是为了得到他的会员积分总分
		integralMap = (Map<String, Object>) memberIntegralService.listAsWebsite(pager, 1);
		applyAmountServiceMap = (Map<String, Object>) memberApplyAmountService.listAsWebsite(pager, p);
		session.removeAttribute("memberApplyAmountDatas");
		session.setAttribute("memberApplyAmountDatas", applyAmountServiceMap.get("returnResult"));
		request.setAttribute("memberApplyAmountpage", "memberApplyAmountpage");
		//获取会员积分总分
		request.setAttribute("totalIntegral", integralMap.get("totalIntegral"));
    	return mav;
    }
}
