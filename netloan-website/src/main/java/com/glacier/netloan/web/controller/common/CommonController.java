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

import java.io.IOException;

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
    private Object index(JqPager pager) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("announcementDatas", announcementService.listAsGrid(pager));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsGrid(pager));//主页加载新闻信息
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
    private Object mappingIndexPage(JqPager pager) {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("announcementDatas", announcementService.listAsGrid(pager));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsGrid(pager));//主页加载新闻信息
        // 进入首页初始化导航信息
        return mav;
    }

    @RequestMapping(value = "/login.htm")
    public Object postLogin() {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        return "login";
    }
    
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
    String username, Model model) {
        if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// 进入登录页面，默认把登录用户注销
        }
        model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, username);
        return "login";
    }
    
    /**
     * 生成验证码
     * @param request
     * @param response
     * @throws IOException
     */
/*    @RequestMapping(value = "/validateCode.htm")
    public void validateCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setHeader("Pragma","No-cache");  
        response.setHeader("Cache-Control","no-cache");  
        response.setDateHeader("Expires", 0);  
        String verifyCode = ValidateCode.generateTextCode(ValidateCode.TYPE_NUM_ONLY, 4, null);
        request.getSession().setAttribute("validateCode", verifyCode);
        response.setContentType("image/jpeg");
        BufferedImage bim = ValidateCode.generateImageCode(verifyCode, 90, 30, 3, true, Color.WHITE, Color.BLACK, null);
        ImageIO.write(bim, "JPEG", response.getOutputStream());
    }*/
    
//    @RequestMapping(value = "/logout.htm")
//    public String logout(){
//    	if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
//            SecurityUtils.getSubject().logout();// ，默认把登录用户注销
//        }
//    	return "index";
//    }
    
    @RequestMapping(value = "/logout.htm")
    public Object logout(JqPager pager){
    	ModelAndView mav = new ModelAndView("index");
    	if (null != SecurityUtils.getSubject() && null != SecurityUtils.getSubject().getSession()) {
            SecurityUtils.getSubject().logout();// ，默认把登录用户注销
        }
    	mav.addObject("announcementDatas", announcementService.listAsGrid(pager));//主页加载公告信息
        mav.addObject("newsDatas", newsService.listAsGrid(pager));//主页加载新闻信息
        // 进入首页初始化导航信息
        return mav;
    }
    
    @RequestMapping(value = "/aa.htm")
    public String aa(){
    	return "demoValidators";
    }
}
