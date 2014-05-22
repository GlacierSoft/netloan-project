package com.glacier.netloan.web.controller.borrow;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.glacier.core.controller.AbstractController;
import com.glacier.netloan.service.borrow.BankingStatisticsService;

/**
 * @ClassName: BankingStatisticsController 
 * @Description: TODO(理财统计控制器) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-21下午5:23:24
 */
@Controller
@RequestMapping(value = "/bankingStatistics")
public class BankingStatisticsController extends AbstractController{
	
	@Autowired
	private BankingStatisticsService bankingStatisticsService;// 注入关注借款业务Bean

	// 进入个人理财统计展示页面
    @RequestMapping(value = "/memberBankingStatistics.htm")
    private Object memberBankingStatistics(String memberId,HttpServletRequest request) {
        //查询个人理财统计
    	JSONObject obj = (JSONObject)bankingStatisticsService.getBankingStatistics(memberId);
    	request.setAttribute("MemberBankingStatistics", obj);
        return "member_mgr/memberBankingStatistics";
    }
    
}
