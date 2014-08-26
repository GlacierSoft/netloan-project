package com.glacier.netloan.service.account;


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
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberWorkMapper;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberExample;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.entity.member.MemberExample.Criteria;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
/**
 * @ClassName: AccountLoginService
 * @Description: TODO(登录统计业务层) 
 * @author junjie.zheng
 * @email 1203807137@QQ.com
 * @date 2014-8-5上午8:57:51
 */

@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class AccountLoginService {
	 
	@Autowired
	private MemberMapper memberMapper;

	@Autowired
	private MemberWorkMapper memberWorkMapper;

	@Autowired
	private ParameterCreditService parameterCreditService;

	/**
	  * @Title: listAsGrid 
	  * @Description: TODO(登录统计信息查询) 
	  * @param @param jqPager,memberQueryDTO,q
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public Object listAsGrid(JqPager jqPager, MemberQueryDTO memberQueryDTO,String q) {
        JqGridReturn returnResult = new JqGridReturn();
		MemberExample memberExample = new MemberExample();
		
        Criteria queryCriteria = memberExample.createCriteria();
		memberQueryDTO.setQueryCondition(queryCriteria, q);

		if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
			memberExample.setLimitStart((jqPager.getPage() - 1)* jqPager.getRows());
			memberExample.setLimitEnd(jqPager.getRows());
		}
		if (StringUtils.isNotBlank(jqPager.getSort())&& StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
			memberExample.setOrderByClause(jqPager.getOrderBy("temp_member_"));
		}
		List<Member> members = memberMapper.selectByExample(memberExample); // 查询所有会员列表
		int total = memberMapper.countByExample(memberExample); // 查询总页数
		returnResult.setRows(members);
		returnResult.setTotal(total);
		return returnResult;// 返回ExtGrid表
	}

	/**
	  * @Title: getMemberWork 
	  * @Description: TODO(登录统计信息对象获取) 
	  * @param @param memberId
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public Object getMemberWork(String memberId) {
		MemberWork memberWork = memberWorkMapper.selectByPrimaryKey(memberId);
		return memberWork;
	}

	/**
	  * @Title: getMember 
	  * @Description: TODO(登录统计信息对象获取) 
	  * @param @param memberId
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	public Object getMember(String memberId) {
		Member member = memberMapper.selectByPrimaryKey(memberId);
        // 查询基础信用积分的所有数据
		@SuppressWarnings("unchecked")
		List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
        // 通过嵌套for循环，将会员的信用图标加到会员对象中去
		for (ParameterCredit parameterCredit : parameterCredits) {
			if (member.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral()&& member.getCreditIntegral() < parameterCredit.getCreditEndIntegral()) {
				member.setCreditPhoto(parameterCredit.getCreditPhoto());
				break;
			}
		}
		return member;
	}

    /**
	  * @Title: export 
	  * @Description: TODO(登录统计信息导出EXCEL) 
	  * @param @param list
	  * @param @return    设定文件 
	  * @return Object    返回类型 
	  * @throws
	 */
	
	public HSSFWorkbook export(List<Member> list) {
		
		//定义导出变量
		String[] excelHeader = { "会员名称", "真实姓名", "身份证号", "居住地址", "联系方式", "电子邮件","用户等级", "信用积分", "最后登陆IP", "登入次数" };
		int[] excelHeaderWidth = { 100, 100, 200, 100, 200,200, 100, 100,200, 100 };
		
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("用户登录报表统计");
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
		
		//遍历信息
		for (int i = 0; i < list.size(); i++) {
			//获取列值
			Member member = list.get(i);
			//创建列
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
			HSSFCell cell_Nine=row_two.createCell(9);
			
			//格式过滤
			String type_info=null;
			if(member.getType().equals("general")){
				type_info="普通会员";
			}else if(member.getType().equals("vip")){
				  type_info="Vip会员";
			}else{
				  type_info="全部会员";
			}
			
			cell_Zero.setCellValue(member.getMemberName());
			cell_One.setCellValue(member.getMemberRealName());
			cell_Two.setCellValue(member.getCardId());
			cell_Three.setCellValue(member.getLiveAddress());
			cell_Four.setCellValue(member.getMobileNumber());
			cell_Five.setCellValue(member.getEmail());
			cell_Six.setCellValue(type_info);
			cell_Seven.setCellValue(member.getCreditIntegral());
			cell_Eight.setCellValue(member.getLastLoginIpAddress());
			cell_Nine.setCellValue(member.getLoginCount());
			
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
			cell_Nine.setCellStyle(style2);
			
		}
		return wb;
	}
	   
}
