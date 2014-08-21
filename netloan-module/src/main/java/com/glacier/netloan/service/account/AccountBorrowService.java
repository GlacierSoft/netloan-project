package com.glacier.netloan.service.account;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
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
    	String[] excelHeader = {"借款用户名","借款标题","借款金额(元)","借款标的","借款时间","借款目的","借款期限","借款状态"};	      
	    int[] excelHeaderWidth = {80, 80, 100, 100, 100,100,100,100};  
	    
        HSSFWorkbook wb = new HSSFWorkbook();    
        HSSFSheet sheet = wb.createSheet("用户借款报表统计");    
        HSSFRow row = sheet.createRow((int) 0);    
        //生成一个样式  
        HSSFCellStyle style = wb.createCellStyle();  
        // 设置这些样式  
        style.setFillForegroundColor(HSSFColor.LIGHT_YELLOW.index);  
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        // 生成另一个字体  
        HSSFFont font= wb.createFont();  
        font.setBoldweight(HSSFFont.BOLDWEIGHT_NORMAL);  
        // 把字体应用到当前的样式  
        style.setFont(font); 
        HSSFCellStyle style2 = wb.createCellStyle();  
        style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style2.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style2.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        style2.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);  
        
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
        	//获取列值    
            BorrowingLoan borrow = list.get(i);    
            //创建列
			HSSFRow row_two=sheet.createRow(i + 1);
			HSSFCell cell_Zero = row_two.createCell(0);
			HSSFCell cell_One = row_two.createCell(1);
			HSSFCell cell_Two = row_two.createCell(2);
			HSSFCell cell_Three = row_two.createCell(3);
			HSSFCell cell_Four = row_two.createCell(4);
			HSSFCell cell_Five = row_two.createCell(5);
			HSSFCell cell_Six = row_two.createCell(6);	
			HSSFCell cell_Seven=row_two.createCell(7);
			
			//格式转化
			String value_two=(float)(Math.round(borrow.getLoanTotal()/100)*100)+""; 
			
			//借款状态判断
			String loanState=null;
			if(borrow.getLoanState().equals("firstAudit"))
				loanState="初审中";
			else if(borrow.getLoanState().equals("tendering"))
				loanState="招标中";
			else if(borrow.getLoanState().equals("secondAuditor"))
				loanState="满标";
			else if(borrow.getLoanState().equals("repaymenting"))
				loanState="还款中";
			else if(borrow.getLoanState().equals("completed"))
				loanState="已还完";
			else if(borrow.getLoanState().equals("bids"))
				loanState="流标";
			else 
				loanState="其他";
			
			cell_Zero.setCellValue(borrow.getMemberDisplay());//借款用户名
			cell_One.setCellValue(borrow.getLoanTitle());//借款标题
			cell_Two.setCellValue(value_two);//借款总额
			cell_Three.setCellValue(borrow.getLoanTenderDisplay());//借款标的
			cell_Four.setCellValue(sf.format(borrow.getLoanDate()));//借款时间
			cell_Five.setCellValue(borrow.getLoanPurposeId());//借款目的
			cell_Six.setCellValue(borrow.getLoanDeadlinesId());//借款期限
			cell_Seven.setCellValue(loanState);//借款目的
			
			//列样式
            cell_Zero.setCellStyle(style2);
			cell_One.setCellStyle(style2);
            cell_Two.setCellStyle(style2);
			cell_Three.setCellStyle(style2);
			cell_Four.setCellStyle(style2);
			cell_Five.setCellStyle(style2);
			cell_Six.setCellStyle(style2);
			cell_Seven.setCellStyle(style2);
		 }    
        return wb;    
    }     
	
}
