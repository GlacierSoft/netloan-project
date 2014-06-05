package com.glacier.netloan.web.controller.account;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.netloan.service.account.AccountLoginService;


@Controller
@RequestMapping("/accountTender")
public class AccountTenderController extends AbstractController {
	
	   @Autowired
	    private AccountLoginService accountLoginService;
	
	     //逾期垫付罚款信息页
		 @RequestMapping(value="/index.htm")
		 public Object intoAccountLogin(HttpServletRequest request,HttpServletResponse response){
			ModelAndView mode=new ModelAndView("account_mgr/accountTender_mgr/accountTender");
		    return mode ;	
		}
}
