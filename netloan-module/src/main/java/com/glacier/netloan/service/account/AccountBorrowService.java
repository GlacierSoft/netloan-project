package com.glacier.netloan.service.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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

import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.borrow.BorrowingLoanMapper;
import com.glacier.netloan.dto.query.borrow.BorrowingLoanQueryDTO;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample;
import com.glacier.netloan.entity.borrow.BorrowingLoanExample.Criteria;

/**
 * @ClassName: AccountBorrowService
 * @Description: TODO(借款统计业务层) 
 * @author junjie.zheng
 * @email 1203807137@QQ.com
 * @date 2014-8-5上午8:57:51
 */

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class AccountBorrowService {
   
	@Autowired
    private BorrowingLoanMapper borrowingLoanMapper;
	
	/**
	  * @Title: listAsGrid 
	  * @Description: TODO(借款统计信息查询) 
	  * @param @param jqPager,borrowingLoanQueryDTO,loanState
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public Object listAsGrid(JqPager jqPager, BorrowingLoanQueryDTO borrowingLoanQueryDTO, String loanState) {
        
        JqGridReturn returnResult = new JqGridReturn();
        BorrowingLoanExample borrowingLoanExample = new BorrowingLoanExample();
        
        Criteria queryCriteria = borrowingLoanExample.createCriteria();
        borrowingLoanQueryDTO.setQueryCondition(queryCriteria);
        
        if (null != loanState && StringUtils.isNotBlank(loanState)) {
        	borrowingLoanExample.createCriteria().andLoanStateEqualTo(loanState);
        }

        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	borrowingLoanExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	borrowingLoanExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	borrowingLoanExample.setOrderByClause(jqPager.getOrderBy("temp_borrowing_loan_"));
        }
        List<BorrowingLoan>  borrowingLoans = borrowingLoanMapper.selectByExample(borrowingLoanExample); // 查询所有借款列表
        int total = borrowingLoanMapper.countByExample(borrowingLoanExample); // 查询总页数
        returnResult.setRows(borrowingLoans);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }   
	
	
	/**
	  * @Title: getBorrowingLoan 
	  * @Description: TODO(借款统计信息对象获取) 
	  * @param @param loanId
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public Object getBorrowingLoan(String loanId) {
    	BorrowingLoan borrowingLoan = borrowingLoanMapper.selectByPrimaryKey(loanId);
    	Calendar c = Calendar.getInstance();
    	if(borrowingLoan.getFirstAuditDate() != null){
    		c.setTime(borrowingLoan.getFirstAuditDate());//获取初审通过时间
    	    c.add(Calendar.DAY_OF_MONTH, Integer.valueOf(borrowingLoan.getWaitBidDeadlines()));//在初审通过时间，加上筹标期限
    	    c.set(Calendar.HOUR_OF_DAY, 23);//将当天小时设置到23时
			c.set(Calendar.MINUTE, 59);//将当天分钟设置到59分
			c.set(Calendar.SECOND, 59);//将当天秒数设置到59秒
    	    borrowingLoan.setWaitBidDeadlinesDate(c.getTime());
    	}
        return borrowingLoan;
    }
	
	/**
	  * @Title: export 
	  * @Description: TODO(借款统计信息导出) 
	  * @param @param list
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	  */
	
    public HSSFWorkbook export(List<BorrowingLoan> list) {  
    	String[] excelHeader = {"借款用户名","借款标题","借款金额","借款标的","借款时间","借款目的","借款期限"};	      
	    int[] excelHeaderWidth = {80, 80, 100, 100, 100,100,100};  
	    
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
            BorrowingLoan borrow = list.get(i);    
            row.createCell(0).setCellValue(borrow.getMemberDisplay());//借款用户名
            row.createCell(1).setCellValue(borrow.getLoanTitle());//借款标题
            row.createCell(2).setCellValue(borrow.getLoanTotal());//借款总额
            row.createCell(3).setCellValue(borrow.getLoanTenderDisplay());//借款标的
            row.createCell(4).setCellValue(sf.format(borrow.getLoanDate()));//借款时间
            row.createCell(5).setCellValue(borrow.getLoanPurposeId());//借款目的
            row.createCell(6).setCellValue(borrow.getLoanDeadlinesId());//借款期限
        }    
        return wb;    
    }     
	
}
