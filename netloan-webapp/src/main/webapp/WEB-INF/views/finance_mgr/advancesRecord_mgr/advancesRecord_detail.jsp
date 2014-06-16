<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>逾期垫付记录ID：</td> 
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${advancesRecordData.advancesRecordId}" />
				<input class="spinner" style="width:168px"  value="${advancesRecordData.advancesRecordId}" readonly="readonly"/>
			</td>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.remark}" readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>逾期交易管理ID：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.overdueAdvancesId}" readonly="readonly"/></td>
			<td>平台交易明细ID：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.platformTransactionId}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>会员ID：</td>
			<td><input class="spinner" style="width:168px"  value="${advancesRecordData.memberId}" readonly="readonly"/></td>
			<td>还款记录明细ID：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.repayNotesDetailId}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>会员等级：</td>
			<td><input value="${advancesRecordData.memberType}" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>逾期终付百分比：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.advancesPercent}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>垫付金额：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.advancesMoney}" readonly="readonly"/></td>
			<td>审核状态：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.auditState}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.auditor}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${advancesRecordData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${advancesRecordData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>最后修改人：</td>
			<td><input class="spinner" style="width:168px" value="${advancesRecordData.updater}" readonly="readonly"/></td>
			<td>最后修改时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${advancesRecordData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		
		
	</table>
</form>
<script type="text/javascript">
	$('#bankCard_mgr_bankCard_audit_status').val(renderGridValue('${bankCardData.status}',fields.bankCardAuths));
</script>
