<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${applyAmountData.applyAmountId}" />
				<input class="spinner" style="width:168px"  value="${applyAmountData.memberRealName}" readonly="readonly"/>
			</td>
			<td>申请类型：</td>
			<td><input id="applyAmount_mgr_applyAmount_detail_applyType" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>原来额度：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.originalAmount}" readonly="readonly"/></td>
			<td>申请额度：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.applyMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>申请说明：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.applyExplanation}" readonly="readonly"/></td>
			<td>申请时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${applyAmountData.applyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>授权额度：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.authorizedAmount}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${applyAmountData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td><input id="applyAmount_mgr_applyAmount_detail_auditState" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.auditorDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>处理说明：</td>
			<td colspan="3"><input class="spinner" style="width:416px" value="${applyAmountData.processExplanation}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${applyAmountData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${applyAmountData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${applyAmountData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#applyAmount_mgr_applyAmount_detail_applyType').val(renderGridValue('${applyAmountData.applyType}',fields.applyType));
</script>
<script type="text/javascript">
	$('#applyAmount_mgr_applyAmount_detail_auditState').val(renderGridValue('${applyAmountData.auditState}',fields.auditState));
</script>
