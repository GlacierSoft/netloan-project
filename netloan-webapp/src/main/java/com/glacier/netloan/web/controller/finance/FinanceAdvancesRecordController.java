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
import com.glacier.netloan.dto.query.finance.FinOverdueAdvancesRecordQueryDTO;
import com.glacier.netloan.service.finance.FinancesAdvancesRecord;

/**
 * @ClassName: FinanceAdvancesRecordController 
 * @Description: TODO(逾期垫付管理controller) 
 * @author JunJieZheng
 * @email 804346249@QQ.com
 * @date 2014-4-4下午3:47:32
 */

@Controller
@RequestMapping(value="/advancesRecord")
public class FinanceAdvancesRecordController {
        
	//注入Service 
	@Autowired
	private FinancesAdvancesRecord  advancesRecordServices;
	
	
	//俞期垫付信息页
	@RequestMapping(value="/index.htm")
	public Object intoAdvancesRecord(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("finance_mgr/advancesRecord_mgr/advancesRecord");
	    return mode ;	
	}
	
	//获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(FinOverdueAdvancesRecordQueryDTO overdueAdvancesRecordQueryDTO,JqPager pservicer) {
    	return advancesRecordServices.listAsGrid(overdueAdvancesRecordQueryDTO,pservicer);
    }
    
    //逾期垫付详情页
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoFinanceBankCardDetailPage(String advancesRecordId) {
        ModelAndView mav = new ModelAndView("finance_mgr/advancesRecord_mgr/advancesRecord_detail");
        if(StringUtils.isNotBlank(advancesRecordId)){
            mav.addObject("advancesRecordData", advancesRecordServices.getFinanceAdvancesRecord(advancesRecordId));
        }
        return mav;
    } 
	
}
