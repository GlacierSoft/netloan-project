package com.glacier.netloan.web.filter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.glacier.basic.exception.IncorrectCaptchaException;
import com.glacier.basic.util.IpUtil;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.compent.realm.CaptchaUsernamePasswordToken;
import com.glacier.netloan.dto.query.member.MemberMessageNoticeQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.member.MemberCreditIntegralService;
import com.glacier.netloan.service.member.MemberMessageNoticeService;
import com.glacier.netloan.service.member.MemberService;

public class CaptchaFormAuthenticationFilter extends FormAuthenticationFilter {
	
    @Autowired
    private MemberMessageNoticeService memberMessageNoticeService;

    public static final String DEFAULT_CAPTCHA_PARAM = "captcha";

    private String captchaParam = DEFAULT_CAPTCHA_PARAM;
    
    @Autowired
    private MemberCreditIntegralService memberCreditIntegralService;
    
    @Autowired
    private MemberService memberService;

    public String getCaptchaParam() {
        return captchaParam;
    }

    protected String getCaptcha(ServletRequest request) {
        return WebUtils.getCleanParam(request, getCaptchaParam());
    }

    protected AuthenticationToken createToken(ServletRequest request, ServletResponse response) {
        String username = getUsername(request);
        String password = getPassword(request);
        String captcha = getCaptcha(request);
        boolean rememberMe = isRememberMe(request);
        String ip = IpUtil.getIpAddr((HttpServletRequest) request);
        String host = ip + IpUtil.getIpInfo(ip);
        char[] charPassword = null;

        if (StringUtils.isNotBlank(password)) {
            charPassword = password.toCharArray();
        }
        return new CaptchaUsernamePasswordToken(username, charPassword, rememberMe, host, captcha);
    }

    /**
     * 登录认证，失败会捕获相关异常信息
     */
    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
        CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) createToken(request, response);
        try {
            doCaptchaValidate( (HttpServletRequest)request,token);
            Subject subject = getSubject(request, response);
            subject.login(token);
            HttpSession session = ((HttpServletRequest) request).getSession(false);
            Member member = (Member) subject.getPrincipal();
            session.setAttribute("currentMember", member);
            session.setAttribute("currentMemberWork", memberService.getMemberWork(member.getMemberId()));
            int messageNoticCount = loginTotalMessageNotic(member.getMemberId());
            session.setAttribute("messageNoticCount", messageNoticCount);
            return onLoginSuccess(token, subject, request, response);
        } catch (AuthenticationException e) {
            return onLoginFailure(token, e, request, response);
        }
    }

    // 验证码校验
    protected void doCaptchaValidate(HttpServletRequest request, CaptchaUsernamePasswordToken token) {
        String captcha = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        if (StringUtils.isBlank(captcha) || !captcha.equalsIgnoreCase(token.getCaptcha())) {
            throw new IncorrectCaptchaException("验证码错误！");
        }
    }
    /**
     * @Title: loginTotalMessageNotic 
     * @Description: TODO(登录之后获取改会员的信息通知条数) 
     * @param  @return设定文件
     * @return int  返回类型
     * @throws 
     *
     */
    public int loginTotalMessageNotic(String memberId){
    	//设置查询DTO收信人的id
	     MemberMessageNoticeQueryDTO memberMessageNoticeQueryDTO = new MemberMessageNoticeQueryDTO();
	     memberMessageNoticeQueryDTO.setAddressee(memberId);
	     memberMessageNoticeQueryDTO.setLetterstatus("unread");
	     JqPager pager = new JqPager();
    	//获取信息通知列表
	     JqGridReturn returnResult = (JqGridReturn) memberMessageNoticeService.listAsGridWebsite(memberMessageNoticeQueryDTO, pager,1);
	     return returnResult.getTotal();
    }
}
