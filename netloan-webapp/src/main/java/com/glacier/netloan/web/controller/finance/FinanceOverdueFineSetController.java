package com.glacier.netloan.web.controller.finance;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.finance.FinanceOverdueFineSet;
import com.glacier.netloan.service.finance.FinanceOverdueFineSetService;


@Controller
@RequestMapping("/overdueFineSet")

public class FinanceOverdueFineSetController extends AbstractController {
  
	  @Autowired
	  private  FinanceOverdueFineSetService  overOverdueFineSetServices;
	    
	    //进入逾期罚款表单页面
	    @RequestMapping(value = "/intoForm.htm")
	    private Object intoOverdueFindSetForm(String overdueFineSetId) {
	        ModelAndView mav = new ModelAndView("finance_mgr/overdueFineSet_mgr/overdueFineSet_form");
	        if(StringUtils.isNotBlank(overdueFineSetId)){
	            mav.addObject("overdueFineSetData", overOverdueFineSetServices.getFinanceOverdueFineSetId(overdueFineSetId));
	        }
	        return mav;
	    }
	 
	  
	  //添加逾期罚款信息
	  @RequestMapping(value = "/add.json", method = RequestMethod.POST)
	  @ResponseBody
	  private Object addOverdueFineSet(@Valid FinanceOverdueFineSet financeOverdueFindSet, BindingResult bindingResult) {
	        if (bindingResult.hasErrors()) {// 后台校验的错误信息
	        	 return returnErrorBindingResult(bindingResult);
	        }
	       return overOverdueFineSetServices.addOverdueFineSet(financeOverdueFindSet);
	  }
	    
	  
	//编辑逾期罚款信息
	  @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
	  @ResponseBody
	  private Object editOverdueFineSet(@Valid FinanceOverdueFineSet financeOverdueFineSet, BindingResult bindingResult) {
	        if (bindingResult.hasErrors()) {// 后台校验的错误信息
	            return returnErrorBindingResult(bindingResult);
	        }
	        return overOverdueFineSetServices.editOverdueFineSet(financeOverdueFineSet);
	    }
	  
	   //逾期罚款信息删除
	    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
	    @ResponseBody
	    public Object delOverdueFineSet(@RequestParam List<String> overdueFineSetIds) {
	    	return overOverdueFineSetServices.delOverdueFineSet(overdueFineSetIds);
	   }
	    
	    //逾期罚款信息审核
	    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object auditOverdueFineSet(@Valid FinanceOverdueFineSet financeOverdueFineSet, BindingResult bindingResult) {
	        if (bindingResult.hasErrors()) {// 后台校验的错误信息
	            return returnErrorBindingResult(bindingResult);
	        }
	        return overOverdueFineSetServices.auditOverdueFineSet(financeOverdueFineSet);
	    }
	    
	 
	 //逾期垫付罚款信息页
	@RequestMapping(value="/index.htm")
	public Object intoOverdueAdvances(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("finance_mgr/overdueFineSet_mgr/overdueFineSet");
	    return mode ;	
	}
	
	//获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
    	return overOverdueFineSetServices.listAsGrid(pservicer);
    }
    
    //逾期垫付罚款页
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoFinanceBankCardDetailPage(String overdueFineSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/overdueFineSet_mgr/overdueFineSet_detail");
        if(StringUtils.isNotBlank(overdueFineSetId)){
            mav.addObject("overdueFineSetData", overOverdueFineSetServices.getFinanceOverdueFineSetId(overdueFineSetId));
        }
        return mav;
    }
    
    
   // 进入会员充值设置audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditOverdueFineSet(String overdueFineSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/overdueFineSet_mgr/overdueFineSet_audit");
        if(StringUtils.isNotBlank(overdueFineSetId)){
            mav.addObject("overdueFineSetData", overOverdueFineSetServices.getFinanceOverdueFineSetId(overdueFineSetId));
        }
        return mav;
    }
	
  }
