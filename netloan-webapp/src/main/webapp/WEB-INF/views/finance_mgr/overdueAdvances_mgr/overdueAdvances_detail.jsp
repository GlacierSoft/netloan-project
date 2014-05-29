<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>逾期垫付管理ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${overdueAdvancesData.overdueAdvancesId}" />
				<input class="spinner" style="width:168px"  value="${overdueAdvancesData.overdueAdvancesId}" readonly="readonly"/>
			</td>
			<td>会员等级：</td>
			<td><input class="spinner" style="width:168px" value="${overdueAdvancesData.memberType}" readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>逾期垫付终付百分比：</td>
			<td><input class="spinner" style="width:168px" value="${overdueAdvancesData.feeway}" readonly="readonly"/></td>
			<td>审核状态：</td>
			<td><input class="spinner" style="width:168px" value="${overdueAdvancesData.auditState}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueAdvancesData.auditor}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate  value="${overdueAdvancesData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><input value="${overdueAdvancesData.auditRemark}" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${overdueAdvancesData.creater}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>登入时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueAdvancesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>最后修改人：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueAdvancesData.updater}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>最后修改时间：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatDate  value="${overdueAdvancesData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#bankCard_mgr_bankCard_audit_status').val(renderGridValue('${bankCardData.status}',fields.bankCardAuths));
</script>
