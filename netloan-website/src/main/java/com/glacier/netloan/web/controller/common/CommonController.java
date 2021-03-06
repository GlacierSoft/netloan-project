/**
 * @Title: CommonController.java 
 * @Package com.glacier.netloan.web.controller.common 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-13 下午3:29:07 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-13
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.web.controller.common;


import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.borrow.BorrowingLoanService;
import com.glacier.netloan.service.website.WebsiteAnnouncementService;
import com.glacier.netloan.service.website.WebsiteNewsService;

/**
 * @ClassName: CommonController
 * @Description: TODO(公用控制器)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-13 下午3:29:07
 */
@Controller
public class CommonController {

	@Autowired
	private WebsiteAnnouncementService announcementService;//注入公告业务类
	
	@Autowired
	private WebsiteNewsService newsService;//注入新闻业务类
	
	@Autowired
	private BorrowingLoanService borrowingLoanService;
    /**
     * 
     * @Title: index
     * @Description: TODO(默认访问控制器跳转至index.jsp)
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @RequestMapping(value = "/")
    private Object index(JqPager pager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String pagetype, String memberId) {
        ModelAndView mav = new ModelAndView("index");
        int p = 1;
        mav.addObject("borrowingDatas",  borrowingLoanService.listAsGridWebsite(pager, borrowingLoanQueryDTO, pagetype, p,  memberId));//主页加载借款信息
        mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, 1));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsWebsite(pager, 1));//主页加载新闻信息
        // 进入首页初始化导航信息
        return mav;
    }

    /**
     * 
     * @Title: mappingIndexPage
     * @Description: TODO(使用/index.htm一样可以访问主页)
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @RequestMapping(value = "/index.htm")
    private Object mappingIndexPage(JqPager pager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String pagetype, String memberId) {
        ModelAndView mav = new ModelAndView("index");
        int p = 1;
        mav.addObject("borrowingDatas",  borrowingLoanService.listAsGridWebsite(pager, borrowingLoanQueryDTO, pagetype, p,  memberId));//主页加载借款信息
        mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, 1));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsWebsite(pager, 1));//主页加载新闻信息
        // 进入首页初始化导航信息
        return mav;
    }
    /**
     * @Title: postLogin 
     * @Description: TODO(跳转到登录页面) 
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @RequestMapping(value = "/login.htm")
    public Object postLogin() {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        return "login";
    }
    
    /*@RequestMapping(value = "/MyRequestURI.htm")
    public Object MyRequestURI(HttpSession session,HttpServletRequest request){
    	
    	String MyRequestURI = (String) session.getAttribute("MyRequestURI");
    	ModelAndView mav = new ModelAndView(MyRequestURI);
    	System.out.println("MyRequestURI   :"+MyRequestURI);
    	String requestURI = WebUtils.getPathWithinApplication(WebUtils.toHttp(request));
    	System.out.println("requestURI   :"+requestURI);
    	String url = WebUtils.getSavedRequest(request).getRequestUrl();
    	System.out.println("url   :"+url);
    	String reurl = "/"+request.getContextPath();
    	//return "redirect:"+url; 
    	return "index";
    }*/
    
    /**
     * @Title: fail
     * @Description: TODO(该方法调用前会被Filter拦截，交给shiro验证，如果验证失败会调用该方法)
     * @param @param userName
     * @param @param model
     * @param @return 设定文件
     * @return String 返回类型
     * @throws
     */
    @RequestMapping(value = "/login.htm", method = RequestMethod.POST)
    public String fail(@RequestParam(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM)
    String username,String password, Model model,Member member,HttpServletRequest request) {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, username);
        member.setMemberName(username);
        member.setMemberPassword(password);
        request.setAttribute("member", member);
        return "login";
    }
    /**
     * @Title: logout 
     * @Description: TODO(退出系统) 
     * @param  @param pager
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @RequestMapping(value = "/logout.htm")
    public Object logout(JqPager pager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String pagetype, String memberId){
    	ModelAndView mav = new ModelAndView("index");
    	if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// ，默认把登录用户注销
        }
    	int p = 1;
        mav.addObject("borrowingDatas",  borrowingLoanService.listAsGridWebsite(pager, borrowingLoanQueryDTO, pagetype, p,memberId));//主页加载借款信息
        mav.addObject("announcementDatas", announcementService.listAsWebsite(pager, 1));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsWebsite(pager, 1));//主页加载新闻信息
        // 进入首页初始化导航信息
        return mav;
    }
}
