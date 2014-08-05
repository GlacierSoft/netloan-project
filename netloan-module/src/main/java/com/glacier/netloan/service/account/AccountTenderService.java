package com.glacier.netloan.service.account;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
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

	// 获取表当数据
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

	// 获取投资对象
	public Object getTenderNotes(String loanId) {
		TenderNotes tenderNotes = tenderNotesMapper.selectByPrimaryKey(loanId);
		return tenderNotes;
	}

	// 投资信息导出
	String[] excelHeader = { "投标用户", "用户积分", "认购份数", "借款名称", "借款用户", "年利率","还款期限", "借款完成百分比", "备注" };
	int[] excelHeaderWidth = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };

	// 导出Excel
	public HSSFWorkbook export(List<TenderNotes> list) {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("用户投标报表统计");
		HSSFRow row = sheet.createRow((int) 0);
		HSSFCellStyle style = wb.createCellStyle();
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);

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
			TenderNotes tenderNotes = list.get(i);
			row.createCell(0).setCellValue(tenderNotes.getMemberDisplay());// 投标用户
			row.createCell(1).setCellValue(tenderNotes.getCreditIntegral());// 用户积分
			row.createCell(2).setCellValue(tenderNotes.getSubTotal());// 认购份数
			row.createCell(3).setCellValue(tenderNotes.getLoanTitle());// 借款标题
			row.createCell(4).setCellValue(tenderNotes.getLoanMemberDisplay());// 借款用户
			row.createCell(5).setCellValue(tenderNotes.getLoanApr());// 年利率
			row.createCell(6).setCellValue(tenderNotes.getLoanDeadlinesId());// 还款期限
			row.createCell(7).setCellValue(tenderNotes.getAlrTenderPro());// 借款完成百分比
			row.createCell(8).setCellValue(tenderNotes.getRemark());// 备注
		}
		return wb;
	}
	
	
	   
}
