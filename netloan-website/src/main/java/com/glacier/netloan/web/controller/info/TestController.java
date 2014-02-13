package com.glacier.netloan.web.controller.info;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/test")
public class TestController {

	@RequestMapping(value = "/index.htm")
	private Object index(){
		ModelAndView mav = new ModelAndView("info_mgr/info");
		return mav;
	}
}
