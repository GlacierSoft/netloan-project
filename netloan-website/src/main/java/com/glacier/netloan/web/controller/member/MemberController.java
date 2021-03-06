package com.glacier.netloan.web.controller.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSONArray;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dto.query.member.MemberMessageNoticeQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberCreditIntegral;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.service.basicdatas.ParameterQuestionService;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.borrow.TenderNotesService;
import com.glacier.netloan.service.finance.FinanceBankCardService;
import com.glacier.netloan.service.finance.FinanceMemberService;
import com.glacier.netloan.service.member.MemberApplyAmountService;
import com.glacier.netloan.service.member.MemberAuthService;
import com.glacier.netloan.service.member.MemberCreditIntegralService;
import com.glacier.netloan.service.member.MemberIntegralService;
import com.glacier.netloan.service.member.MemberMessageNoticeService;
import com.glacier.netloan.service.member.MemberSecretSecurityService;
import com.glacier.netloan.service.member.MemberService;
import com.glacier.netloan.service.member.MemberStatisticsService;

@Controller
@RequestMapping(value = "member")
public class MemberController extends AbstractController{

    @Autowired
    private BorrowingLoanService borrowingLoanService;
    
    @Autowired
    private TenderNotesService tenderNotesService;
    
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	@Autowired
	private MemberIntegralService memberIntegralService;
	
	@Autowired
	private MemberCreditIntegralService memberCreditIntegralService;
	
	@Autowired
	private MemberApplyAmountService memberApplyAmountService;
	
	@Autowired
	private FinanceBankCardService financeBankCardService;
	
	@Autowired
	private MemberMessageNoticeService memberMessageNoticeService;
	
	@Autowired
	private ParameterQuestionService parameterQuestionService;
	
	@Autowired
	private MemberSecretSecurityService memberSecretSecurityService;
	
	@Autowired
	private FinanceMemberService financeMemberService;
	
	@Autowired
	private MemberStatisticsService memberStatisticsService;
	
	// 进入会员个人主页展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexMember(HttpServletRequest request,HttpSession session) {
        ModelAndView mav = new ModelAndView("member_mgr/member");
        Subject pricipalSubject = SecurityUtils.getSubject();//获取当前认证用户
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        //重新获取当前登录用户信息，设置在session中
        Member member = (Member) memberService.getMember(pricipalMember.getMemberId());
        session.removeAttribute("currentMember");
        session.setAttribute("currentMember", member);
        float memberCreditTotal = member.getCreditIntegral();
        //获取全部信用积分的范围列表
    	@SuppressWarnings("unchecked")
		List<ParameterCredit>  parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
    	//调用totalIntegralAndPhoto方法， 通过会员信用总分，循环判断获取会员信用图标
        @SuppressWarnings("unchecked")
		Map<String,Object> map = totalIntegralAndPhoto(parameterCredits,memberCreditTotal);
    	request.setAttribute("totalCreditPhoto", map.get("totalCreditPhoto"));//将会员信用图片设置在request.setAttribute
    	//获取会员积分总数
    	request.setAttribute("totalIntegral", memberIntegralService.totalIntegral());//获取会员积分总分
    	//重新获取会员信息通知条数
    	loginTotalMessageNotic(member.getMemberId(),session);
    	
    	//查询该会员的借款条数和投资条数
    	mav.addObject("borrowingLoanNum", borrowingLoanService.getBorrowingLoanNumByMemberId(pricipalMember.getMemberId()));//查询该会员的借款记录条数
    	mav.addObject("tenderNotesNum", tenderNotesService.getTenderNotesNumByMemberId(pricipalMember.getMemberId()));//查询该会员的投资记录条数
    	
    	//查询该会员不同状态下的借款条数
        mav.addObject("borrowingLoanNumFirstAudit", borrowingLoanService.getBorrowingLoanNumByLoanStateAndMemberId("firstAudit", pricipalMember.getMemberId()));//查询初审中的借款记录条数
        mav.addObject("borrowingLoanNumSecondAuditor", borrowingLoanService.getBorrowingLoanNumByLoanStateAndMemberId("secondAuditors", pricipalMember.getMemberId()));//查询复审中的借款记录条数
        mav.addObject("borrowingLoanNumTendering", borrowingLoanService.getBorrowingLoanNumByLoanStateAndMemberId("tendering", pricipalMember.getMemberId()));//查询初审中的借款记录条数
        mav.addObject("borrowingLoanNumRepaymenting", borrowingLoanService.getBorrowingLoanNumByLoanStateAndMemberId("repaymenting", pricipalMember.getMemberId()));//查询复审中的借款记录条数
        mav.addObject("borrowingLoanNumCompleted", borrowingLoanService.getBorrowingLoanNumByLoanStateAndMemberId("completed", pricipalMember.getMemberId()));//查询初审中的借款记录条数
        
        //查询该会员不同状态下的认证条数
        mav.addObject("authNumNoapply", memberAuthService.getAuthNumByStateAndMemberId("noapply", pricipalMember.getMemberId()));//查询会员未申请的认证数
        mav.addObject("authNumAuthstr", memberAuthService.getAuthNumByStateAndMemberId("authstr", pricipalMember.getMemberId()));//查询会员审核中的认证数
        mav.addObject("authNumPass", memberAuthService.getAuthNumByStateAndMemberId("pass", pricipalMember.getMemberId()));//查询会员审核成功的认证数
        mav.addObject("authNumFailure", memberAuthService.getAuthNumByStateAndMemberId("failure", pricipalMember.getMemberId()));//查询会员申请失败的认证数
        
        //查询该会员的会员资金记录和会员统计记录
        mav.addObject("financeMemberData", financeMemberService.getFinanceMemberByMemberId(pricipalMember.getMemberId()));//查询该会员的会员资金记录信息
        mav.addObject("memberStatisticsData", memberStatisticsService.getStatisticsByMember(pricipalMember.getMemberId()));//查询该会员的会员统计记录信息
        return mav;
    }
    /**
     * @Title: loginTotalMessageNotic 
     * @Description: TODO(重新获取改会员的信息通知条数) 
     * @param  @param memberId
     * @param  @return设定文件
     * @throws 
     *
     */
    public void loginTotalMessageNotic(String memberId,HttpSession session){
    	//设置查询DTO收信人的id
	     MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO = new MemberMessageNoticeQueryDTO();
	     memberMessageNoticeQueryDTO.setAddressee(memberId);
	     memberMessageNoticeQueryDTO.setLetterstatus("unread");
	     JqPager pager = new JqPager();
    	//获取信息通知列表
	     JqGridReturn returnResult = (JqGridReturn) memberMessageNoticeService.listAsGridWebsite(memberMessageNoticeQueryDTO, pager,1);
	     int messageNoticCount = returnResult.getTotal();
	     session.removeAttribute("messageNoticCount");
	     session.setAttribute("messageNoticCount", messageNoticCount);
    }
    
    //判断该登录会员是否已经完善资料
  	@RequestMapping(value = "/judgeCheckMember.json", method = RequestMethod.POST)
  	@ResponseBody
  	public Object judgeBorrowingLoan(@RequestParam String memberId){
          return memberService.checkMemberDatum(memberId);
  	}
    
    //转到头像上传页面。
  	@RequestMapping(value = "/memberPhotoInto.htm")
  	public Object memberPhotoInto(){
  		return "member_mgr/memberPhoto";
  	}
    
    // 进入会员个人详细信息展示页面
    @RequestMapping(value = "/memberDetail.htm")
    private Object intoMemberDetail(HttpServletRequest request,String addBankCard,String updateSecretSecurity) {
        ModelAndView mav = new ModelAndView("member_mgr/memberDetail");
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs)memberAuthService.getMemberAuth(pricipalMember.getMemberId());
        //对于前台查询列表，设置pager的值
        JqPager pager = new JqPager();
        pager.setSort("createTime");// 定义排序字段
        pager.setOrder("DESC");// 升序还是降序
        //查询密保问题数据，放到rqquest.setAttribute中
        JqGridReturn parameterQuestionResult = (JqGridReturn) parameterQuestionService.listAsGrid(pager);
        request.setAttribute("parameterQuestionResult", parameterQuestionResult);
        //查询该会员是否已设置了密保信息，
        JqGridReturn SecretSecurityResult = (JqGridReturn)memberSecretSecurityService.listAsGridWebsite(pricipalMember.getMemberId(), pager);
        request.setAttribute("SecretSecurityResult", SecretSecurityResult);
        //查询银行卡列表
        JqGridReturn returnResult = (JqGridReturn) financeBankCardService.listAsGridWebsite(pricipalMember.getMemberId(), pager);
        @SuppressWarnings("unchecked")
		List<FinanceBankCard> bandCards =  (List<FinanceBankCard>) returnResult.getRows();//获取会员个人的银行卡数据
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
        	request.setAttribute("addBankCard", addBankCard);
        }
        //判断是否是修改密保设置提交过来的，以updateSecretSecurity字符串作为标记。
        if(updateSecretSecurity != null){
        	request.setAttribute("updateSecretSecurity", updateSecretSecurity);
        }
        return mav;
    }
    
    // 进入会员验证邮箱展示页面
    @RequestMapping(value = "/memberEmail.htm")
    private Object intoMemberEmail() {
        ModelAndView mav = new ModelAndView("member_mgr/memberEmail");
        return mav;
    }
    
    //判断修改密码
    @RequestMapping(value = "/updatememberPassword.htm", method = RequestMethod.POST)
    @ResponseBody
    private Object updatememberPassword(Member member,String oldPassword,String memberPassword,HttpSession session){
    	member.setMemberPassword(oldPassword);//将旧密码添加到member对象中
    	JqReturnJson updatememberPassword = (JqReturnJson) memberService.isequalsPassword(member,oldPassword,memberPassword);//调用server层方法，修改密码
    	Member loginMember = (Member) memberService.getMember(member.getMemberId());//重新获取member对象
    	session.removeAttribute("currentMember");//移除旧的member的session
		session.setAttribute("currentMember",loginMember);//将新获取的member对象放在session中
    	return updatememberPassword;
    }
    
    //判断修改交易密码
    @RequestMapping(value = "/updatebusinessPassword.htm", method = RequestMethod.POST)
    @ResponseBody
    private Object updatebusinessPassword(Member member,String oldPassword,String memberPassword,HttpSession session){
    	member.setTradersPassword(oldPassword);//将旧密码添加到member对象中
    	JqReturnJson updatebusinessPassword = (JqReturnJson) memberService.isequalsbusinessPassword(member,oldPassword,memberPassword);//调用server层方法，修改密码
    	Member loginMember = (Member) memberService.getMember(member.getMemberId());//重新获取member对象
    	session.removeAttribute("currentMember");//移除旧的member的session
		session.setAttribute("currentMember",loginMember);//将新获取的member对象放在session中
    	return updatebusinessPassword;
    }
    
    
    
    
    
    //进行会员平台认证页面
    /**
     * @Title: intoMemberAuth 
     * @Description: TODO(进行会员平台认证页面) 
     * @param  @param pager
     * @param  @param p
     * @param  @param request
     * @param  @param session
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     * 和MemberApplyAmountController的addApplyAmountReception关联
     */
    @SuppressWarnings("unchecked")
	@RequestMapping(value = "/memberAuth.htm")
    public Object intoMemberAuth(JqPager pager,int p,HttpServletRequest request,HttpSession session){
    	ModelAndView mav = new ModelAndView("member_mgr/memberAuth");
    	Map<String,Object> integralMap = new HashMap<String,Object>();
    	Map<String,Object> applyAmountServiceMap = new HashMap<String,Object>();
    	//获取全部信用积分的范围列表
    	List<ParameterCredit>  parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
    	//通过获取member的Id，来得到该会员的所有信用积分
    	Member memberOld = (Member)session.getAttribute("currentMember");
    	Member member = (Member) memberService.getMember(memberOld.getMemberId());//重新获取member对象，设置到session中
        session.removeAttribute("currentMember");
        session.setAttribute("currentMember", member);
        //获取改会员 的认证数据
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());
    	List<MemberCreditIntegral>  memberCreditIntegrals = (List<MemberCreditIntegral>) memberCreditIntegralService.listByMemberId(member.getMemberId());
    	//通过该会员的所有信用积分和基础资料的信用积分得到，该会员的信用总分的图标
    	Map<String,Object> totalIntegralAndPhotoMap = totalIntegralAndPhoto(parameterCredits, member.getCreditIntegral());
    	//通过json来传递该会员的所有信用积分到前台
    	JSONArray jsonMemberCreditIntegrals = new JSONArray();  
    	jsonMemberCreditIntegrals.addAll(memberCreditIntegrals);
    	//通过request传递到前台。
    	request.setAttribute("parameterCredits", parameterCredits);
    	request.setAttribute("json", jsonMemberCreditIntegrals);
    	request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
    	request.setAttribute("memberCreditIntegrals", memberCreditIntegrals);
    	request.setAttribute("totalCreditPhoto", totalIntegralAndPhotoMap.get("totalCreditPhoto"));
    	//第一次访问该页面，p默认为0
    	if(p == 0 ){
    		//获取会员积分和申请额度分页列表。
    		integralMap = (Map<String, Object>) memberIntegralService.listAsWebsite(pager, 1);
    		applyAmountServiceMap = (Map<String, Object>) memberApplyAmountService.listAsWebsite(pager, 1);
    		session.setAttribute("memberIntegralDatas", integralMap.get("returnResult"));
    		session.setAttribute("memberApplyAmountDatas", applyAmountServiceMap.get("returnResult"));
    	}else{
			integralMap = (Map<String, Object>) memberIntegralService.listAsWebsite(pager, p);
			session.removeAttribute("memberIntegralDatas");
			session.setAttribute("memberIntegralDatas", integralMap.get("returnResult"));
			request.setAttribute("memberIntegraldo", "memberIntegraldo");
    	}
    	//获取会员积分总分
		request.setAttribute("totalIntegral", integralMap.get("totalIntegral"));
    	return mav;
    }
    
    //通过会员信用总分，循环判断获取会员信用图标
    @SuppressWarnings("rawtypes")
	public Map totalIntegralAndPhoto(List<ParameterCredit> parameterCredits,float memberCreditTotal){
    	String totalCreditPhoto = null;
    	Map<String,Object> map = new HashMap<String, Object>();
    	for(ParameterCredit parameterCredit : parameterCredits){
    		if(memberCreditTotal >= parameterCredit.getCreditBeginIntegral() && memberCreditTotal < parameterCredit.getCreditEndIntegral()){
    			totalCreditPhoto = parameterCredit.getCreditPhoto();
    			break;
    		}
    	}
    	map.put("totalCreditPhoto", totalCreditPhoto);
    	return map;
    }
    
    /**
     * @Title: memberAccessoryForm 
     * @Description: TODO(查看会员认证附件资料) 
     * @param  @param member_Accessory
     * @param  @param request
     * @param  @param session
     * @param  @param whichAuth
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
	@RequestMapping(value = "/memberAccessoryForm.htm")
	@ResponseBody
	private Object memberAccessoryForm(String member_Accessory,HttpServletRequest request,HttpSession session,String whichAuth){
		Member member = (Member)session.getAttribute("currentMember");
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());
    	if(whichAuth.equals("idCardAuth")){
    		memberAuthWithBLOBs.setIdCardAccessory(member_Accessory);
    		if("".equals(member_Accessory)||member_Accessory == null){
    			memberAuthWithBLOBs.setIdCardAuth("noapply");
    		}else{
    			memberAuthWithBLOBs.setIdCardAuth("authstr");
    		}
		 }else if(whichAuth.equals("creditAuth")){
			 memberAuthWithBLOBs.setCreditAccessory(member_Accessory);
			 if("".equals(member_Accessory)||member_Accessory == null){
	    			memberAuthWithBLOBs.setCreditAuth("noapply");
	    		}else{
	    			 memberAuthWithBLOBs.setCreditAuth("authstr");
	    		}
		 }else if(whichAuth.equals("companyAuth")){
			 memberAuthWithBLOBs.setCompanyAccessory(member_Accessory);
			 if("".equals(member_Accessory)||member_Accessory == null){
	    			memberAuthWithBLOBs.setCompanyAuth("noapply");
	    		}else{
	    			memberAuthWithBLOBs.setCompanyAuth("authstr");
	    		}
		 }
		request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
		return memberAuthService.editMemberAuthReception(memberAuthWithBLOBs);
	}
	
	/**
	 * @Title: applicationVIP 
	 * @Description: TODO(申请VIP会员) 
	 * @param  @param memberId
	 * @param  @param request
	 * @param  @return设定文件
	 * @return Object  返回类型
	 * @throws 
	 *
	 */
	@RequestMapping(value = "/applicationVIP.json")
	@ResponseBody
	private Object applicationVIP(String memberId,HttpServletRequest request){
		JqReturnJson jqReturnJson = (JqReturnJson)memberService.applicationVIP(memberId);
		MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(memberId);
    	request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
    	jqReturnJson.setObj(memberAuthWithBLOBs);
		return jqReturnJson;
	}
	
	

    
}
