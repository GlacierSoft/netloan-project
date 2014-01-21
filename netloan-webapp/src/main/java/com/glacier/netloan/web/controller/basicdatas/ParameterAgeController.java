/*
 * @(#)ParameterAgeController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.basicdatas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.basicdatas.ParameterAgeService;

/** 
 * @ClassName: ParameterAgeController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/age")
public class ParameterAgeController extends AbstractController{

    @Autowired
    private ParameterAgeService ageService;// 注入角色业务Bean
    
    // 进入角色列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPage() {
        ModelAndView mav = new ModelAndView("basicdatas_mgr/age_mgr/age");
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByAgeId(String ageId, JqPager pager) {
        return ageService.listAsGrid(pager);
    }
}
