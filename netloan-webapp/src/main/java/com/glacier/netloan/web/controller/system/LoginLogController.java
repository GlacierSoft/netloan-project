package com.glacier.netloan.web.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.system.LoginLogService;

@Controller
@RequestMapping(value = "/loginlog")
public class LoginLogController {
	
	@Autowired
	private LoginLogService loginLogService;
	
	// 进入登录日志列表展示页面
	@RequestMapping(value = "/index.htm")
	public Object intoIndexPage(){
		ModelAndView mav = new ModelAndView("system_mgr/loginlog_mgr/loginlog");
		return mav;
	}
	@RequestMapping(value = "/list.json" , method = RequestMethod.POST)
	@ResponseBody
	public Object listActionAsGridByMenuId(JqPager pager){
		return loginLogService.listAsGrid(pager); 
	}
	@RequestMapping(value = "/del.json" , method = RequestMethod.POST)
	@ResponseBody
	public Object delLoginLog(@RequestParam List<String> loginlogIds , @RequestParam List<String> loginUsers){
		return loginLogService.delLoginLog(loginlogIds, loginUsers);
	}
}
