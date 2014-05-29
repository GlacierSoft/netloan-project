package com.glacier.netloan.web.controller.finance;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.finance.FinanceOverdueFineService;


@Controller
@RequestMapping("/overdueFine")
public class FinanceOverdueFineController {
  
	 
	 @Autowired
	 private  FinanceOverdueFineService  overOverdueFineServices;
	
    //逾期垫付管理信息页
	@RequestMapping(value="/index.htm")
	public Object intoOverdueFine(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("finance_mgr/overdueFine_mgr/overdueFine");
	    return mode ;	
	}
	
	//获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
    	return overOverdueFineServices.listAsGrid(pservicer);
    }
    
    //逾期垫付详情页
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoFinanceBankCardDetailPage(String overdueFineId) {
        ModelAndView mav = new ModelAndView("finance_mgr/overdueFine_mgr/overdueFine_detail");
        if(StringUtils.isNotBlank(overdueFineId)){
            mav.addObject("overdueFineData", overOverdueFineServices.getFinanceOverdueFineId(overdueFineId));
        }
        return mav;
    }
	
	
}
