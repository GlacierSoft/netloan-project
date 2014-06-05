package com.glacier.netloan.web.controller.account;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.service.account.AccountLoginService;
import com.glacier.netloan.service.member.MemberService;




@Controller
@RequestMapping("/accountLogin")
public class AccountLoginController extends AbstractController {
      
	@Autowired
	private AccountLoginService accountLoginService;
	  
	//逾期垫付罚款信息页
	 @RequestMapping(value="/index.htm")
	 public Object intoAccountLogin(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("account_mgr/accountLogin_mgr/accountLogin");
	    return mode ;	
	}
	 
	   // 进入会员Detail信息页面
	    @RequestMapping(value = "/intoDetail.htm")
	    private Object intoAccountLoginDetailPage(String memberId) {
	        ModelAndView mav = new ModelAndView("account_mgr/accountLogin_mgr/accountLogin_detail");
	        if(StringUtils.isNotBlank(memberId)){
	            mav.addObject("memberData", accountLoginService.getMember(memberId));
	            mav.addObject("memberWorkData", accountLoginService.getMemberWork(memberId));
	        }
	        return mav;
	    }
	    
	     // 获取表格结构的所有菜单数据
	    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object listActionAsGridByMenuId(JqPager jqPager, MemberQueryDTO memberQueryDTO, String q) {
	        return accountLoginService.listAsGrid(jqPager, memberQueryDTO, q);
	    }
	    
}	    
	    
	    
	    
	    
