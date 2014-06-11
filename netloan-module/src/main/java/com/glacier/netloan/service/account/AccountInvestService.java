package com.glacier.netloan.service.account;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.account.AccountInvestMapper;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.account.AccountInvest;
import com.glacier.netloan.entity.account.AccountInvestExample;
import com.glacier.netloan.entity.account.AccountInvestExample.Criteria;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.basicdatas.ParameterCreditExample;
import com.glacier.netloan.entity.finance.FinanceOverdueAdvances;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberStatistics;
import com.glacier.netloan.entity.member.MemberStatisticsExample;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.member.MemberStatisticsService;




@Service
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public class AccountInvestService {
    
	 @Autowired
	 private AccountInvestMapper accountInvestMapper;
	 
	 @Autowired
	 private MemberStatisticsService statisticsService; 
	
	 //会员投资信息统计
	 public Object listAsGrid(JqPager jqPager){
		    
		    List<MemberStatistics> list=(List<MemberStatistics>) statisticsService.listMemberStatistics();   
		 
		    List<AccountInvest> accountInvestBefore=(List<AccountInvest>) new AccountInvestService().listAccountInvest_two();
		 
            float sum_uncollected=0;//投资成功待收金额
	        float sum_reward=0;//投资奖励金额
	        float sum_fine=0; //借款人逾期罚款金额
	        float sum_borrow=0;//借款成功总额
	        float sum_advfee=0;//借款管理费总额
	        float sum_interest=0;//借款利息总额
	        float sum_interestfee=0;//借款逾期罚息总额
	        
	        //时间转化
	        SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
	     
	         for(int i=0;i<accountInvestBefore.size();i++){
	        	//今日投资统计数据更新
	        	if((sf.format(accountInvestBefore.get(i).getCreateTime())).compareTo(sf.format(new Date()))==0){
	        	    for (int j = 0; j < list.size(); j++) {
	        	    	sum_uncollected+=list.get(j).getWaitAlsoTotal();
	        	    	sum_reward+=list.get(j).getTenderAwards();
	        	    	sum_borrow+=list.get(j).getBorrowSuccess();
	        	     }
	        	   
	        	    //投资统计数据更新
	        		AccountInvest accountInvest_detail=accountInvestBefore.get(i);
	        		accountInvest_detail.setSumUncollected(sum_uncollected);
	        		accountInvest_detail.setSumReward(sum_reward);
	        		accountInvest_detail.setSumBorrow(sum_borrow);
	        		
	        		//投资统计对象更新
	        		accountInvestMapper.updateByPrimaryKeySelective(accountInvest_detail);
	        	 }else{
	        		
	        		 //插入投资统计数据
	        	  }
	         }
	        
		    
	        //更新数据查询
	        JqGridReturn returnResult = new JqGridReturn();
	        AccountInvestExample accountInvestExample = new AccountInvestExample();;
	        
            if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
	        	accountInvestExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
	        	accountInvestExample.setLimitEnd(jqPager.getRows());
	        }
	        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
	        	accountInvestExample.setOrderByClause(jqPager.getOrderBy("temp_account_invest_"));
	        }
	        
	        List<AccountInvest>  accountInvest = accountInvestMapper.selectByExample(accountInvestExample); // 查询所有投资信息
	        
	        int total = accountInvestMapper.countByExample(accountInvestExample); // 查询总页数
	        
	        returnResult.setRows(accountInvest);
	        returnResult.setTotal(total);
	        return returnResult;// 返回ExtGrid表
	   }
	 
       
	   //投资信息详情
	   public Object getAccountInvest(String investId) {
	    	AccountInvest accountInvest= accountInvestMapper.selectByPrimaryKey(investId);
	        return accountInvest;
	    }
	   
      
	  String[] excelHeader = {"投资统计ID","投资成功待收金额","投资奖励金额","借款人逾期罚金金额","借款成功总额","借款管理费总额","借款利息总额","","借款逾期罚息总额","创建人","创建时间","更新人","更新时间"};	      
	  int[] excelHeaderWidth = {200, 200, 200,200, 200,200,200,200,200,200,200,200};   
	 
	  //投资信息导出
	  public HSSFWorkbook export(List<AccountInvest> list) {    
	        HSSFWorkbook wb = new HSSFWorkbook();    
	        HSSFSheet sheet = wb.createSheet("投资信息报表统计");    
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
	            AccountInvest accountInvest= list.get(i);    
	            row.createCell(0).setCellValue(accountInvest.getInvestId());    
	            row.createCell(1).setCellValue(accountInvest.getSumUncollected());
	            row.createCell(2).setCellValue(accountInvest.getSumReward());
	            row.createCell(3).setCellValue(accountInvest.getSumFine());
	            row.createCell(4).setCellValue(accountInvest.getSumBorrow());
	            row.createCell(5).setCellValue(accountInvest.getSumAdvfee());
	            row.createCell(6).setCellValue(accountInvest.getSumInterest());
	            row.createCell(7).setCellValue(accountInvest.getSumInterestfee());
	            row.createCell(8).setCellValue(accountInvest.getCreater());
	            row.createCell(9).setCellValue(sf.format(accountInvest.getCreateTime()));
	            row.createCell(10).setCellValue(accountInvest.getUpdater());
	            row.createCell(11).setCellValue(sf.format(accountInvest.getUpdateTime()));
	        }    
	        return wb;    
	    }   
	  
	  public Object listAccountInvest_two(){
	    	AccountInvestExample accountInvestExample_two= new AccountInvestExample();
	    	JqPager pager_two = new JqPager();
	    	pager_two.setSort("createTime");
	    	pager_two.setOrder("DESC");
	    	accountInvestExample_two.setOrderByClause(pager_two.getOrderBy("temp_account_invest_"));
	    	List<AccountInvest>  parameterCredits = accountInvestMapper.selectByExample(accountInvestExample_two); // 查询所有操作列表
	        return parameterCredits;
	    }

} 
