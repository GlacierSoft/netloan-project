/*
 * @(#)memberStatisticsController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.member;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.mail.Flags;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.ptg.MemErrPtg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.member.MemBerStatisticsQueryDTO;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.service.member.MemberStatisticsService;

/** 
 * @ClassName: memberStatisticsController 
 * @Description: TODO(会员财务统计的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/memberStatistics")
public class MemberStatisticsController extends AbstractController{

    @Autowired
    private MemberStatisticsService statisticsService;// 注入会员财务统计业务Bean
    
    // 进入会员财务统计列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPstatistics() {
        ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics");
        return mav;
    }
    
    // 进入会员财务统计Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoStatisticsFormPstatistics(String statisticsId) {
        ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics_form");
        if(StringUtils.isNotBlank(statisticsId)){
            mav.addObject("statisticsData", statisticsService.getStatistics(statisticsId));
        }
        return mav;
    }
    
    // 进入会员财务统计Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoStatisticsDetailPage(String statisticsId) {
        ModelAndView mav = new ModelAndView("member_mgr/statistics_mgr/statistics_detail");
        if(StringUtils.isNotBlank(statisticsId)){
            mav.addObject("statisticsData", statisticsService.getStatistics(statisticsId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员财务统计数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listStatisticsAsGridByMenuId(JqPager pstatisticsr,MemBerStatisticsQueryDTO memBerStatisticsQueryDTO,HttpSession session) {
    	JqGridReturn returnResult=(JqGridReturn)statisticsService.listAsGrid(pstatisticsr, memBerStatisticsQueryDTO);  
    	 if(returnResult!=null){
	        	List<MemberStatistics> MemberStatisticsDatalist=(List<MemberStatistics>)returnResult.getRows();
	        	session.setAttribute("MemberStatisticsDatalist", MemberStatisticsDatalist);
	       }
    	return returnResult;
    }
    
    // 增加会员财务统计
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addStatistics(@Valid MemberStatistics statistics, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return statisticsService.addStatistics(statistics);
    }
    
    
  //投资统计查询信息导出
    @RequestMapping(value="/exp.json")
    private void expCheckStatistics(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
        List<MemberStatistics> memberStatisticsDataList=( List<MemberStatistics>)session.getAttribute("MemberStatisticsDatalist");
        //System.out.println("我从Session中获取得对象值为:"+accountInvestDataList);
        System.out.println("memberStatisticsDataList长度为===============>"+memberStatisticsDataList.size());
        List<MemberStatistics> list=new ArrayList<MemberStatistics>();
        HSSFWorkbook wb=null;
        if(memberStatisticsDataList.size()>0&&memberStatisticsDataList!=null){
        	//System.out.println("已进入导出区域------------------->");
        	wb = statisticsService.export(memberStatisticsDataList);
        }else{
        	//System.out.println("数据为空,不进入导出区域-------------------->");
        	MemberStatistics memberStatisticsNull=new MemberStatistics();
        	memberStatisticsNull.setTotalBorrowings(new Float(0.00));
        	memberStatisticsNull.setCumulativeLossProfit(new Float(0.00));
        	memberStatisticsNull.setAlreadyTotal(new Float(0.00));
        	memberStatisticsNull.setWaitAlsoTotal(new Float(0.00));
        	memberStatisticsNull.setAlreadyIncomeTotal(new Float(0.00));
        	memberStatisticsNull.setWaitIncomeTotal(new Float(0.00));
        	memberStatisticsNull.setAlreadyPrincipal(new Float(0.00));
        	memberStatisticsNull.setWaitAlsoPrincipal(new Float(0.00));
        	memberStatisticsNull.setAlreadyInterest(new Float(0.00));
        	memberStatisticsNull.setWaitAlsoInterest(new Float(0.00));
        	memberStatisticsNull.setAlreadyIncomePrincipal(new Float(0.00));
        	memberStatisticsNull.setWaitIncomePrincipal(new Float(0.00));
        	memberStatisticsNull.setAlreadyIncomeInterest(new Float(0.00));
        	memberStatisticsNull.setWaitIncomeInterest(new Float(0.00));
        	memberStatisticsNull.setOverdueFineAmount(new Float(0.00));
        	memberStatisticsNull.setOverdueInterestAmount(new Float(0.00));
        	memberStatisticsNull.setLoanManagementAmount(new Float(0.00));
        	memberStatisticsNull.setLoanInterestAmount(new Float(0.00));
        	memberStatisticsNull.setNormalRepayment(0);
        	memberStatisticsNull.setAdvanceRepayment(0);
        	memberStatisticsNull.setLate(0);
        	memberStatisticsNull.setWebsiteSubstitute(0);
        	memberStatisticsNull.setInvestmentTotal(new Float(0.00));
        	memberStatisticsNull.setTenderAwards(new Float(0.00));
        	memberStatisticsNull.setPromotionAwards(new Float(0.00));
        	memberStatisticsNull.setBorrowSuccess(0);
        	memberStatisticsNull.setUplineDeltaAwards(new Float(0.00));
        	memberStatisticsNull.setContinueAwards(new Float(0.00));
        	
        	list.add(memberStatisticsNull);
        	wb = statisticsService.export(list);
        }
        response.setContentType("application/vnd.ms-excel"); 
        SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");//yyyy-MM-dd HH:mm:ss
        String str_one ="MemberStatistics_"+sf.format(new Date());//命名名称
        response.setHeader("Content-disposition", "attachment;filename="+str_one+".xls");    
        OutputStream ouputStream = response.getOutputStream();    
        wb.write(ouputStream);    
        ouputStream.flush();    
        ouputStream.close();  
    }
    
    
    
}
