package com.glacier.netloan.service.account;

import java.text.SimpleDateFormat;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dao.borrow.TenderNotesMapper;
import com.glacier.netloan.dto.query.borrow.TenderNotesQueryDTO;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.borrow.TenderNotesExample;
import com.glacier.netloan.entity.borrow.TenderNotesExample.Criteria;

/**
 * @ClassName: AccountTenderService
 * @Description: TODO(投标统计业务层) 
 * @author junjie.zheng
 * @email 1203807137@QQ.com
 * @date 2014-8-5上午8:57:51
 */

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class AccountTenderService {
   
	@Autowired
	private TenderNotesMapper tenderNotesMapper;

	/**
	  * @Title: listAsGrid 
	  * @Description: TODO(投标统计信息查询) 
	  * @param @param jqPager, tenderNotesQueryDTO,loanState
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public Object listAsGrid(JqPager jqPager,TenderNotesQueryDTO tenderNotesQueryDTO, String loanState) {

		JqGridReturn returnResult = new JqGridReturn();
		TenderNotesExample tenderNotesExample = new TenderNotesExample();

		Criteria queryCriteria = tenderNotesExample.createCriteria();
		tenderNotesQueryDTO.setQueryCondition(queryCriteria);

		if (null != loanState && StringUtils.isNotBlank(loanState)) {
			tenderNotesExample.createCriteria().andLoanStateEqualTo(loanState);
		}

		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			tenderNotesExample.setLimitStart((jqPager.getPage() - 1)
					* jqPager.getRows());
			tenderNotesExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())
				&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			tenderNotesExample.setOrderByClause(jqPager
					.getOrderBy("temp_tender_notes_"));
		}
		List<TenderNotes> tenderNotes = tenderNotesMapper.selectByExample(tenderNotesExample); // 查询所有借款列表
		int total = tenderNotesMapper.countByExample(tenderNotesExample); // 查询总页数
		returnResult.setRows(tenderNotes);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	  * @Title: getTenderNotes 
	  * @Description: TODO(投标统计信息对象获取) 
	  * @param @param loanId
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public Object getTenderNotes(String loanId) {
		TenderNotes tenderNotes = tenderNotesMapper.selectByPrimaryKey(loanId);
		return tenderNotes;
	}

	/**
	  * @Title: export 
	  * @Description: TODO(投标统计信息导出) 
	  * @param @param list
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public HSSFWorkbook export(List<TenderNotes> list) {
		String[] excelHeader = { "投标用户", "用户积分(分)", "认购份数(份)", "借款标题", "借款用户", "投标状态" ,"创建人","创建时间","备注" };
		int[] excelHeaderWidth = { 100, 100, 100, 100, 100, 100, 100, 100,100 };
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("用户投标报表统计");
		HSSFRow row = sheet.createRow((int) 0);
		// 生成一个样式  
        HSSFCellStyle style = wb.createCellStyle();  
        //设置这些样式  
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
		//时间格式
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		//遍历投标信息
		for (int i = 0; i < list.size(); i++) {
			//获取列值
			TenderNotes tenderNotes = list.get(i);
			//创建列
			row = sheet.createRow(i + 1);
			HSSFRow row_two=sheet.createRow(i + 1);
			HSSFCell cell_Zero = row_two.createCell(0);
			HSSFCell cell_One = row_two.createCell(1);
			HSSFCell cell_Two = row_two.createCell(2);
			HSSFCell cell_Three = row_two.createCell(3);
			HSSFCell cell_Four = row_two.createCell(4);
			HSSFCell cell_Five = row_two.createCell(5);
			HSSFCell cell_Six = row_two.createCell(6);	
			HSSFCell cell_Seven = row_two.createCell(7);
			HSSFCell cell_Eight = row_two.createCell(8);
			String loanState=null;
			String remark=tenderNotes.getRemark(); 
			if(tenderNotes.getLoanState().equals("firstAudit"))
				loanState="初审中";
			else if(tenderNotes.getLoanState().equals("tendering"))
				loanState="招标中";
			else if(tenderNotes.getLoanState().equals("secondAuditor"))
				loanState="满标";
			else if(tenderNotes.getLoanState().equals("repaymenting"))
				loanState="还款中";
			else if(tenderNotes.getLoanState().equals("completed"))
				loanState="已还完";
			else if(tenderNotes.getLoanState().equals("bids"))
				loanState="流标";
			else 
				loanState="其他";
			if(remark==null)
                remark="无";
			cell_Zero.setCellValue(tenderNotes.getMemberDisplay());// 投标用户
			cell_One.setCellValue(tenderNotes.getCreditIntegral());// 用户积分
			cell_Two.setCellValue(tenderNotes.getSubTotal());// 认购份数
			cell_Three.setCellValue(tenderNotes.getLoanTitle());// 借款标题
			cell_Four.setCellValue(tenderNotes.getLoanMemberDisplay());// 借款用户
			cell_Five.setCellValue(loanState);// 借款状态
			cell_Six.setCellValue(tenderNotes.getCreaterDisplay());// 创建人
			cell_Seven.setCellValue(sf.format(tenderNotes.getCreateTime()));// 创建时间
			cell_Eight.setCellValue(remark);// 备注
			//列样式
            cell_Zero.setCellStyle(style2);
			cell_One.setCellStyle(style2);
            cell_Two.setCellStyle(style2);
			cell_Three.setCellStyle(style2);
			cell_Four.setCellStyle(style2);
			cell_Five.setCellStyle(style2);
			cell_Six.setCellStyle(style2);
			cell_Seven.setCellStyle(style2);
			cell_Eight.setCellStyle(style2);
			
		}
		return wb;
	}
}
