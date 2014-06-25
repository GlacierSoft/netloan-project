package com.glacier.netloan.web.controller.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.basic.util.IpUtil;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.entity.finance.FinanceMember;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.member.MemberAuthService;
import com.glacier.netloan.service.member.MemberService;
import com.glacier.netloan.service.member.MemberStatisticsService;

@Controller
public class RegisterController extends AbstractController{
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	@Autowired
	private FinanceMemberService financeMemberService;
	
	@Autowired
	private MemberStatisticsService memberStatisticsService;
	
	/**
	 * @Title: intoregister 
	 * @Description: TODO(前台注册转向页面) 
	 * @param  @return设定文件
	 * @return String  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/intoregister.htm")
    public String intoregister(HttpSession session){
		session.removeAttribute("currentMember");
		if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入注册页面，默认把登录用户注销
        }
    	return "register";
    }
	/**
	 * @Title: register 
	 * @Description: TODO(前台注册功能) 
	 * @param  @param member
	 * @param  @param bindingResult
	 * @param  @param captcha
	 * @param  @param request
	 * @param  @param session
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/register.htm",method = RequestMethod.POST)
	public Object register(@Valid Member member,BindingResult bindingResult,String captcha,HttpServletRequest request, HttpSession session){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		String isCaptcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
		if (StringUtils.isBlank(captcha) || !isCaptcha.equalsIgnoreCase(captcha)) {
            //throw new IncorrectCaptchaException("验证码错误！");
        	request.setAttribute("errorCaptcha", "errorCaptcha");//通过设置errorCaptcha的 值，来判断验证码是否正确。
        	request.setAttribute("member", member);
        	return "register";
        }
		session.setAttribute("isCaptcha", isCaptcha);
		
		//判断用户名是否重复
		 JqReturnJson returnisUsernameRepeat = (JqReturnJson) memberService.isUsernameRepeat(member);
		if(!returnisUsernameRepeat.isSuccess()){
			request.setAttribute("usernameRepeat", "usernameRepeat");//通过设置usernameRepeat的 值，来判断用户名是否重复。
			request.setAttribute("member", member);
			return "register";
		}
		//判断邮箱是否重复isEmailRepeat
		 JqReturnJson returnisEmailRepeat = (JqReturnJson) memberService.isEmailRepeat(member);
		if(!returnisEmailRepeat.isSuccess()){
			request.setAttribute("emailRepeat", "emailRepeat");//通过设置emailRepeat的 值，来判断邮箱是否重复。
			request.setAttribute("member", member);
			return "register";
		}
		
		ModelAndView mav = new ModelAndView("sendMailSuccess");
		
		// 创建一个临时用户注册ID
        String registerId = ""+Math.random() * Math.random();
        /** 
         * 得到web系统url路径的方法 
         * */  
        //得到web的url路径：http://localhost:8080/ssh1/  
        String path = request.getContextPath();  
        String basePath = request.getScheme()+"://"+request.getServerName()+  
        ":"+request.getServerPort()+path+"/";  
        //邮件发送成功后，用户点在邮箱中点击这个链接回到注册网站。
        //http://localhost:8080/netloan-website//mailBack.htm?registerId=" + registerId;
        String url = basePath+"mailBack.htm?registerId=" + registerId;
        //将验证邮箱链接后面的registerId存到session中
        session.setAttribute(registerId, member.getMemberName());
        session.setAttribute("memberSimple", member);
        // 设置session的有效时间，为10分钟，10分钟内没有点击链接的话，注册将失败
        session.setMaxInactiveInterval(600); 
        //基于org.apache.commons.mail,封装好的mail，发邮件流程比较简单，比原生态mail简单。
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.qq.com");// QQ郵箱服務器
		//email.setHostName("smtp.163.com");// 163郵箱服務器
		//email.setHostName("smtp.gmail.com");// gmail郵箱服務器
		email.setSmtpPort(465);//设置端口号
		email.setAuthenticator(new DefaultAuthenticator("1240033960@qq.com","zx5304960"));//用1240033960@qq.com这个邮箱发送验证邮件的
		email.setTLS(true);//tls要设置为true,没有设置会报错。
		email.setSSL(true);//ssl要设置为true,没有设置会报错。
		try {
			email.setFrom("1240033960@qq.com", "冰川网贷管理员", "UTF-8");
			//email.setFrom("13798985542@163.com", "13798985542@163.com", "UTF-8");
			//email.setFrom("yuzexu1@gmail.com", "yuzexu1@gmail.com", "UTF-8");
		} catch (EmailException e1) {
			e1.printStackTrace();
		}
		email.setCharset("UTF-8");//没有设置会乱码。
        try {
			email.setSubject("冰川网贷注册");//设置邮件名称
			email.setHtmlMsg("点击<a href='" + url + "'>" + url + "</a>完成注册！");//设置邮件内容
			email.addTo(member.getEmail());//给会员发邮件
			//email.addTo("804346249@qq.com");
			email.send();//邮件发送
		} catch (EmailException e) {
			throw new RuntimeException(e);
		}
		return mav;
	}
	/**
	 * @Title: mailBack 
	 * @Description: TODO(点击邮件验证，转向页面。) 
	 * @param  @param registerId
	 * @param  @param request
	 * @param  @param session
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/mailBack.htm")
	public Object mailBack(String registerId,HttpServletRequest request,HttpSession session){
		if(registerId == null){
			return "index";
		}
		String registerName = (String) session.getAttribute(registerId);
		 // 如果session设置的有限时间过期，则注册不成功，直接返回
        if(registerName == null || registerName.equals("")){ 
            return "index"; 
        } 						
        session.setAttribute("registerName", registerName);
        Member member = (Member) session.getAttribute("memberSimple");
        //获取最后登录ip地址
        String ip = IpUtil.getIpAddr((HttpServletRequest) request);
        String host = ip + IpUtil.getIpInfo(ip);
        member.setLastLoginIpAddress(host);
        //注册时，生成会员信息，会员资金记录，会员统计记录
        JqReturnJson returnResult = (JqReturnJson) memberService.addMemberReception(member);//注册会员，调用添加会员方法
        //生成会员资金记录
        FinanceMember financeMember = new FinanceMember();
        Member memberNew = (Member) returnResult.getObj();
        financeMember.setMemberId(memberNew.getMemberId());//设置会员id
        financeMember.setUsableMoney(0f);//设置可用金额为0
        financeMember.setFrozenMoney(0f);//设置冻结金额为0
        financeMember.setCollectingMoney(0f);//设置待收金额为0
        financeMember.setRefundMoney(0f);//设置待还金额为0
        financeMember.setAmount(0f);//设置总金额为0
        financeMember.setRechargeMoney(0f);//设置充值总金额为0
        financeMember.setRechargeMonthTimes(0f);//设置本月充值次数
        financeMember.setRechargeTimes(0f);//设置充值总次数
        financeMember.setWithdrawMoney(0f);//设置提现总金额
        financeMember.setWithdrawMonthTimes(0f);//设置本月提现总次数
        financeMember.setWithdrawTimes(0f);//设置提现总次数
        financeMember.setBorrowerCredit(0f);//设置借款信用额度
        financeMember.setAvailableCredit(0f);//设置可用信用额度
        financeMemberService.addMember(financeMember);//调用添加会员资金方法，添加会员资金
        //生会员统计记录
        MemberStatistics memberStatistics = new MemberStatistics();
        memberStatistics.setMemberId(memberNew.getMemberId());//设置会员id
        memberStatistics.setTotalBorrowings(0f);//设置借款总额
        memberStatistics.setCumulativeLossProfit(0f);//设置累计亏盈
        memberStatistics.setAlreadyTotal(0f);//设置已还总额
        memberStatistics.setWaitAlsoTotal(0f);//待还总额 
        memberStatistics.setAlreadyPrincipal(0f);//已还本金
        memberStatistics.setWaitAlsoPrincipal(0f);//待还本金
        memberStatistics.setAlreadyInterest(0f);//已还利息
        memberStatistics.setWaitAlsoInterest(0f);//待还利息
        memberStatistics.setAlreadyIncomePrincipal(0f);//已收本金
        memberStatistics.setWaitIncomePrincipal(0f);//代收本金
        memberStatistics.setAlreadyIncomeInterest(0f);//已收利息
        memberStatistics.setWaitIncomeInterest(0f);//代收利息
        memberStatistics.setOverdueFineAmount(0f);//逾期罚款金额
        memberStatistics.setOverdueInterestAmount(0f);//逾期利息总额
        memberStatistics.setLoanManagementAmount(0f);//借款管理费
        memberStatistics.setLoanInterestAmount(0f);//借款利息总额 
        memberStatistics.setBorrowSuccess(0);//借款成功次数
        memberStatistics.setNormalRepayment(0);//正常还款次数
        memberStatistics.setAdvanceRepayment(0);//提前还款次数
        memberStatistics.setLateRepayment(0);//逾期还款次数
        memberStatistics.setLate(0);//迟还次数
        memberStatistics.setWebsiteSubstitute(0);//网站待还次数
        memberStatistics.setInvestmentTotal(0f);//投资总额
        memberStatistics.setTenderAwards(0f);//投标奖励
        memberStatistics.setAlreadyIncomeTotal(0f);//已收总额
        memberStatistics.setWaitIncomeTotal(0f);//待收总额
        memberStatistics.setPromotionAwards(0f);//推广奖励
        memberStatistics.setUplineDeltaAwards(0f);//线下冲值奖励
        memberStatistics.setContinueAwards(0f);//续投奖励
        memberStatisticsService.addStatistics(memberStatistics);//调用添加会员统计记录方法，添加会员统计记录
        request.setAttribute("returnResult", returnResult);
        if(!returnResult.isSuccess()){
        	return "index";
        }
		return "login";
	}
	/**
	 * @Title: sendMailSuccess 
	 * @Description: TODO(邮件发送成功，转向页面) 
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/sendMailSuccess.htm")
	public Object sendMailSuccess(){
		return "sendMailSuccess";
	}
	/**
	 * @Title: perfectRegister 
	 * @Description: TODO(前台完善用户信息) 
	 * @param  @param member
	 * @param  @param memberWork
	 * @param  @param session
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/perfectRegister.htm", method = RequestMethod.POST)
	@ResponseBody
	public Object perfectRegister(@Valid Member member,BindingResult bindingResult,@Valid MemberWork memberWork,BindingResult bindingResultWork,
			HttpServletRequest request,HttpSession session,String postAuth){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        if (bindingResultWork.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResultWork);
        }
        //前台完善会员基本信息和工作信息
		JqReturnJson perfectRegister = (JqReturnJson) memberService.editMemberReception(member,memberWork,postAuth);
		Member loginMember = (Member) memberService.getMember(member.getMemberId());
		MemberWork loginMemberWork = (MemberWork) memberService.getMemberWork(member.getMemberId());
		session.removeAttribute("currentMember");
		session.removeAttribute("currentMemberWork");
		session.setAttribute("currentMember",loginMember);
        session.setAttribute("currentMemberWork",loginMemberWork);
        request.setAttribute("perfectRegister", perfectRegister);
        //判断是否是按保存并提交审核按钮，重新获取会员的认证状态
        MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs)memberAuthService.getMemberAuth(member.getMemberId());
        //只有会员基本信息认证和工作认证，没有申请或审核失败，就可以进行修改。
        if((memberAuthWithBLOBs.getInfoAuth().equals("noapply") || memberAuthWithBLOBs.getWorkAuth().equals("noapply"))||
        		(memberAuthWithBLOBs.getInfoAuth().equals("failure") || memberAuthWithBLOBs.getWorkAuth().equals("failure"))){
        	//不做任何操作
        }else{
        	perfectRegister.setObj("infoAndWorRealOnly");
        }
		return perfectRegister;
	}
	/**
	 * @Title: perfectMemberPhoto 
	 * @Description: TODO(前台会员更改头像) 
	 * @param  @param member
	 * @param  @param session
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/perfectMemberPhoto.htm", method = RequestMethod.POST)
	@ResponseBody
	public Object perfectMemberPhoto(@Valid Member member,HttpSession session){
		JqReturnJson perfectRegister = (JqReturnJson) memberService.editMemberPhotoReception(member);
		Member loginMember = (Member) memberService.getMember(member.getMemberId());
		session.removeAttribute("currentMember");
		session.setAttribute("currentMember",loginMember);
		return perfectRegister;
	}
	//转到“关于我们”页面
	@RequestMapping(value = "/aboutUs.htm")
	public Object aboutUs(){
		return "about_mgr/aboutUs";
	}
	//转到“招纳贤士”页面
	@RequestMapping(value = "/hiring.htm")
	public Object hiring(){
		return "about_mgr/hiring";
	}
	//转到“联系我们”页面
	@RequestMapping(value = "/contactUs.htm")
	public Object contactUs(){
		return "about_mgr/contactUs";
	}
	//转到“新手引导、借款流程”页面
	@RequestMapping(value = "/borrowingProcess.htm")
	public Object borrowingProcess(){
		return "newbie_mgr/borrowingProcess";
	}
	//转到“投资流程”页面
	@RequestMapping(value = "/investmentProcess.htm")
	public Object investmentProcess(){
		return "newbie_mgr/investmentProcess";
	}
	//转到“风险保障”页面
	@RequestMapping(value = "/riskGuarantee.htm")
	public Object riskGuarantee(){
		return "newbie_mgr/riskGuarantee";
	}
	//转到“我要借款”页面
	@RequestMapping(value = "/borrow.htm")
	public Object borrow(){
		return "borrow_mgr/borrow";
	}
	//转到“流转标详细”页面
	@RequestMapping(value = "/borrowLiuZhuan.htm")
	public Object borrowLiuZhuan(){
		return "borrow_mgr/borrowLiuZhuan";
	}
	//转到“抵押标详细”页面
	@RequestMapping(value = "/borrowDiYa.htm")
	public Object borrowDiYa(){
		return "borrow_mgr/borrowDiYa";
	}
	//转到“信用标详细”页面
	@RequestMapping(value = "/borrowXinYong.htm")
	public Object borrowXinYong(){
		return "borrow_mgr/borrowXinYong";
	}
	//转到“净值标详细”页面
	@RequestMapping(value = "/borrowJingZhi.htm")
	public Object borrowJingZhi(){
		return "borrow_mgr/borrowJingZhi";
	}
}
