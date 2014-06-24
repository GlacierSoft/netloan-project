/*
 * @(#)MemberStatisticsService.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.service.member;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.member.MemBerStatisticsQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.basicdatas.ParameterCreditExample;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.member.MemberStatistics; 
import com.glacier.netloan.entity.member.MemberStatisticsExample;
import com.glacier.netloan.entity.member.MemberStatisticsExample.Criteria;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;

/** 
 * @ClassName: MemberStatisticsService 
 * @Description: TODO(会员财务统计业务类) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:22:22  
 */
@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class MemberStatisticsService {

	@Autowired
    private MemberStatisticsMapper statisticsMapper;
	
	@Autowired
	private UserMapper userMapper;

	
	  public Object listMemberStatistics(){
		    MemberStatisticsExample memberStatisticsExample = new MemberStatisticsExample();
	    	JqPager pager = new JqPager();
	    	pager.setSort("createTime");
	    	pager.setOrder("DESC");
	    	memberStatisticsExample.setOrderByClause(pager.getOrderBy("temp_member_statistics_"));
	    	List<MemberStatistics>  memberStatisticss = statisticsMapper.selectByExample(memberStatisticsExample); // 查询所有会员积分列表
	    	return memberStatisticss;
	     }
	    
	/**
	 * @Title: getStatistics
	 * @Description: TODO(根据会员财务统计Id获取会员财务统计信息) 
	 * @param @param memberStatisticsId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getStatistics(String statisticsId) {
        return statisticsMapper.selectByPrimaryKey(statisticsId);
    }
    
    /**
     * @Title: getStatisticsByMember 
     * @Description: TODO(根据所属会员Id获得该会员财务统计信息) 
     * @param @param memberId
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object getStatisticsByMember(String memberId) {
        return statisticsMapper.selectByMemberId(memberId);
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员财务统计信息) 
     * @param @param jqPager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager,MemBerStatisticsQueryDTO memBerStatisticsQueryDTO) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberStatisticsExample memberStatisticsExample = new MemberStatisticsExample();
        
        Criteria queryCriteria = memberStatisticsExample.createCriteria();
        memBerStatisticsQueryDTO.setQueryCondition(queryCriteria);

        
        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberStatisticsExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberStatisticsExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberStatisticsExample.setOrderByClause(jqPager.getOrderBy("temp_member_statistics_"));
        }
        List<MemberStatistics>  memberStatisticss = statisticsMapper.selectByExample(memberStatisticsExample); // 查询所有会员积分列表
        int total = statisticsMapper.countByExample(memberStatisticsExample); // 查询总页数
        returnResult.setRows(memberStatisticss);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addStatistics 
     * @Description: TODO(新增会员财务统计) 
     * @param @param statistics
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    public Object addStatistics(MemberStatistics statistics) {
    	//通过admin来获取超级管理员信息
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        
        User pricipalUser = users.get(0);
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        statistics.setStatisticsId(RandomGUID.getRandomGUID());
        statistics.setCreater(pricipalUser.getUserId());
        statistics.setCreateTime(new Date());
        statistics.setUpdater(pricipalUser.getUserId());
        statistics.setUpdateTime(new Date());
        count = statisticsMapper.insert(statistics);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("申请额度信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，申请额度信息保存失败");
        }
        return returnResult;
    }
    

    String[] excelHeader = {"借款总额","累计亏盈","已还总额","待还总额","已收总额","待收总额","已还本金","待还本金","已还利息","待还利息","已收本金","代收本金","已收利息","待收利息","逾期罚款金额","逾期利息总额","借款管理费","借款利息总额","线下冲值奖励"};	      
    int[] excelHeaderWidth = {80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80, 80};  
    
    //借款信息导出
    public HSSFWorkbook export(List<MemberStatistics> list) {    
        HSSFWorkbook wb = new HSSFWorkbook();    
        HSSFSheet sheet = wb.createSheet("用户借款报表统计");    
        HSSFRow row = sheet.createRow((int) 0);    
        HSSFCellStyle style = wb.createCellStyle();    
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);   
        
        //时间转化
        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
    
        for (int i = 0; i < excelHeader.length; i++) {    
            HSSFCell cell = row.createCell(i);    
            cell.setCellValue(excelHeader[i]);    
            cell.setCellStyle(style);    
            sheet.autoSizeColumn(i);    
        } 
        // 设置列宽度（像素）  
        for (int i = 0; i < excelHeaderWidth.length; i++) {  
            sheet.setColumnWidth(i, 32 * excelHeaderWidth[i]);  
        }  
        for (int i = 0; i < list.size(); i++) { 
        	row = sheet.createRow(i + 1);   
        	MemberStatistics memberStatistics = list.get(i);    
	        row.createCell(0).setCellValue(memberStatistics.getTotalBorrowings());//借款总额
	        row.createCell(1).setCellValue(memberStatistics.getCumulativeLossProfit());//累计亏盈 
	        row.createCell(2).setCellValue(memberStatistics.getAlreadyTotal());//已还总额
	        row.createCell(3).setCellValue(memberStatistics.getWaitAlsoTotal());//待还总额
	        row.createCell(4).setCellValue(memberStatistics.getAlreadyIncomeTotal());//已收总额
	        row.createCell(5).setCellValue(memberStatistics.getWaitIncomeTotal());//待收总额
	        row.createCell(6).setCellValue(memberStatistics.getAlreadyPrincipal());//已还本金
	        row.createCell(7).setCellValue(memberStatistics.getWaitAlsoPrincipal());//待还本金
	        row.createCell(8).setCellValue(memberStatistics.getAlreadyInterest());//已还利息
	        row.createCell(9).setCellValue(memberStatistics.getWaitAlsoInterest());//待还利息
	        row.createCell(10).setCellValue(memberStatistics.getAlreadyIncomePrincipal());//已收本金
	        row.createCell(11).setCellValue(memberStatistics.getWaitIncomePrincipal());//代收本金
	        row.createCell(12).setCellValue(memberStatistics.getAlreadyIncomeInterest());//已收利息
	        row.createCell(13).setCellValue(memberStatistics.getWaitIncomePrincipal());//待收利息
	        row.createCell(14).setCellValue(memberStatistics.getOverdueFineAmount());//逾期罚款金额
	        row.createCell(15).setCellValue(memberStatistics.getOverdueInterestAmount());//逾期利息总额
	        row.createCell(16).setCellValue(memberStatistics.getLoanManagementAmount());//借款管理费
	        row.createCell(17).setCellValue(memberStatistics.getLoanInterestAmount());// 借款利息总额
	        row.createCell(18).setCellValue(memberStatistics.getUplineDeltaAwards());//线下冲值奖励
	     }    
        return wb;    
    }     
    
    
}
