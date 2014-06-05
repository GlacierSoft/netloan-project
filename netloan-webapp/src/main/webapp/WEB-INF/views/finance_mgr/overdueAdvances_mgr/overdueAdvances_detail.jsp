<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>管理ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${overdueAdvancesData.overdueAdvancesId}" />
				<input class="spinner" style="width:168px" value="${fn:substring(overdueAdvancesData.overdueAdvancesId,0,8) }....."  readonly="readonly" title="${overdueAdvancesData.overdueAdvancesId}"/>
			</td>
			<td>有效会员：</td>
			<td>
				<input id="overdueAdvances_mgr_overdueAdvances_detail_memberType" name="memberType" value="${overdueAdvancesData.memberType}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>百分比：</td>
			<td><input class="spinner" style="width:168px" value="${overdueAdvancesData.value}" readonly="readonly"/></td>
			<td>审核状态：</td>
			<td>
				<input id="overdueAdvances_mgr_overdueAdvancesdetail_auditState" name="auditState" value="${overdueAdvancesData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueAdvancesData.auditor}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate  value="${overdueAdvancesData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${overdueAdvancesData.creater}" readonly="readonly"/></td>
		    <td>录入时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueAdvancesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueAdvancesData.updater}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate  value="${overdueAdvancesData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:420px" readonly="readonly">${overdueAdvancesData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#overdueAdvances_mgr_overdueAdvances_detail_memberType').val(renderGridValue('${overdueAdvancesData.memberType}',fields.memberType));
    $('#overdueAdvances_mgr_overdueAdvancesdetail_auditState').val(renderGridValue('${overdueAdvancesData.auditState}',fields.auditState));
</script>
	
</script>
