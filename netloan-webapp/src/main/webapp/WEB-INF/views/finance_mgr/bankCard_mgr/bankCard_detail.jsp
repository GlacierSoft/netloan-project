<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td> 
			<td class="forminputtable" colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${bankCardData.bankCardId}" />
				<input class="spinner" style="width:416px"  value="${bankCardData.memberRealName}" readonly="readonly"/>
			</td>
			
		</tr>
		<tr>
			<td>开户行：</td>
			<td><input class="spinner" style="width:168px" value="${bankCardData.openingBank}" readonly="readonly"/></td>
			<td>支行：</td>
			<td><input class="spinner" style="width:168px" value="${bankCardData.subbranch}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>银行卡名称：</td>
			<td><input class="spinner" style="width:168px"  value="${bankCardData.cardName}" readonly="readonly"/></td>
			<td>卡号：</td>
			<td><input class="spinner" style="width:168px" value="${bankCardData.cardNumber}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td><input id="bankCard_mgr_bankCard_audit_status" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>申请时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${bankCardData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px" value="${bankCardData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${bankCardData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3"><input class="spinner" style="width:416px" value="${bankCardData.remark}" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#bankCard_mgr_bankCard_audit_status').val(renderGridValue('${bankCardData.status}',fields.bankCardAuths));
</script>
