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
import com.glacier.netloan.entity.finance.FinanceOverdueAdvances;
import com.glacier.netloan.service.finance.FinanceOverdueAdvancesService;


@Controller
@RequestMapping(value="/overdueAdvances")
public class FinanceOverdueAdvancesController extends AbstractController {
	
	  @Autowired
	  private  FinanceOverdueAdvancesService  overdueAdvancesServices;
	
    //逾期垫付管理信息页
	@RequestMapping(value="/index.htm")
	public Object intoOverdueAdvances(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("finance_mgr/overdueAdvances_mgr/overdueAdvances");
	    return mode ;	
	}
	
	
	// 进入会员充值设置Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoOverdueAdvancesForm(String overdueAdvancesId) {
        ModelAndView mav = new ModelAndView("finance_mgr/overdueAdvances_mgr/overdueAdvances_form");
        if(StringUtils.isNotBlank(overdueAdvancesId)){
            mav.addObject("overdueAdvancesData", overdueAdvancesServices.getFinanceOverdueAdvances(overdueAdvancesId));
        }
        return mav;
    }
	
    //获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
    	return overdueAdvancesServices.listAsGrid(pservicer);
    }
    
    // 增加逾期管理信息
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addOverdueAdvances(@Valid FinanceOverdueAdvances financeOverdueAdvances, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return overdueAdvancesServices.addOverdueAdvances(financeOverdueAdvances);
    }
    
    
    //编辑逾期管理信息页
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editOverdueAdvances(@Valid FinanceOverdueAdvances financeOverdueAdvances, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return overdueAdvancesServices.editOverdueAdvances(financeOverdueAdvances);
    }
    
    // 逾期管理信息批量删除
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delOverdueAdvances(@RequestParam List<String> overdueAdvancesIds) {
    	return overdueAdvancesServices.delOverdueAdvances(overdueAdvancesIds);
    }
    
     
    // 进入会员充值设置audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditOverdueAdvances(String overdueAdvancesId) {
        ModelAndView mav = new ModelAndView("finance_mgr/overdueAdvances_mgr/overdueAdvances_audit");
        if(StringUtils.isNotBlank(overdueAdvancesId)){
            mav.addObject("overdueAdvancesData", overdueAdvancesServices.getFinanceOverdueAdvances(overdueAdvancesId));
        }
        return mav;
    }
    
    
    
    // 审核会员充值设置
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditOverdueAdvances(@Valid FinanceOverdueAdvances financeOverdueAdvances, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return overdueAdvancesServices.auditOverdueAdvances(financeOverdueAdvances);
    }
    
    
    //逾期垫付详情页
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoFinanceBankCardDetailPage(String overdueAdvancesId) {
        ModelAndView mav = new ModelAndView("finance_mgr/overdueAdvances_mgr/overdueAdvances_detail");
        if(StringUtils.isNotBlank(overdueAdvancesId)){
            mav.addObject("overdueAdvancesData", overdueAdvancesServices.getFinanceOverdueAdvances(overdueAdvancesId));
        }
        return mav;
    }
   
}
