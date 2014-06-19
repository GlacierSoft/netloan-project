package com.glacier.netloan.web.controller.borrow;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.netloan.service.borrow.BankingStatisticsService;
import com.glacier.netloan.service.member.MemberStatisticsService;

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
	
	@Autowired
	private MemberStatisticsService memberStatisticsService;

	// 进入个人理财统计展示页面
    @RequestMapping(value = "/memberBankingStatistics.htm")
    private Object memberBankingStatistics(String memberId,HttpServletRequest request) {
        //查询个人理财统计,注释方法为泽徐所写
/*    	JSONObject obj = (JSONObject)bankingStatisticsService.getBankingStatistics(memberId);
    	request.setAttribute("MemberBankingStatistics", obj);
        return "member_mgr/memberBankingStatistics";*/
        
        //新的统计方法，直接读取会员统计表
        ModelAndView mav = new ModelAndView("member_mgr/memberBankingStatistics");
        mav.addObject("memberStatisticsDate",memberStatisticsService.getStatisticsByMember(memberId));
        return mav;
    }
    
}
