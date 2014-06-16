<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		 <tr>
			<td>罚款记录ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${overdueFineData.overdueFineId}" />
				<input class="spinner" style="width:168px"  value="${overdueFineData.overdueFineId}" readonly="readonly"/>
			</td>
			<td>罚款设置ID：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineData.overdueFineSetId}" readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>罚款名称：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineData.overdueFineSetName}" readonly="readonly"/></td>
			<td>会员ID：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineData.memberId}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>罚款明细ID：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueFineData.repayNotesDetailId}" readonly="readonly"/></td>
			<td>罚款金额：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueFineData.overdueFineMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>应还款日期：</td>
			<td><input value="<fmt:formatDate  value="${overdueFineData.shouldPayDate}"  pattern="yyyy-MM-dd HH:mm:ss"/>" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>实还款日期：</td>
			<td><input value="<fmt:formatDate  value="${overdueFineData.actualPayDate}"  pattern="yyyy-MM-dd HH:mm:ss"/>" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineData.auditState}"  readonly="readonly"/></td>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineData.auditor}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueFineData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineData.remark}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineData.creater}"  readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px"    value="<fmt:formatDate  value="${overdueFineData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueFineData.updater}"  readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatDate  value="${overdueFineData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
	    <tr>
			<td>备注说明：</td>
			<td colspan="3"><textarea class="spinner" style="width:420px" readonly="readonly">${overdueFineData.remark}</textarea></td>
		</tr>
	   
		
	</table>
</form>

