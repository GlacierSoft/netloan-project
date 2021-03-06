<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td align="left" colspan="4">
				逾期名称：
				<input id="overdueAdvances_mgr_overdueAdvances_detail_overdueAdvancesName" name="overdueAdvancesName" value="${overdueAdvancesData.overdueAdvancesName}" class="spinner" style="height:18px;width:405px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td align="left" colspan="4">
				会员等级：
				<input type="hidden" name="roleId" value="${overdueAdvancesData.overdueAdvancesId}" />
				<input type="hidden" class="spinner" style="width:168px" value="${fn:substring(overdueAdvancesData.overdueAdvancesId,0,8) }....."  readonly="readonly" title="${overdueAdvancesData.overdueAdvancesId}"/>
				<input id="overdueAdvances_mgr_overdueAdvances_detail_memberType" name="memberType" value="${overdueAdvancesData.memberType}" class="spinner" style="height:18px;width:405px" readonly="readonly"/>
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
			<td><input class="spinner" style="width:168px"  value="${overdueAdvancesData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate  value="${overdueAdvancesData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${overdueAdvancesData.createrDisplay}" readonly="readonly"/></td>
		    <td>创建时间：</td>
			<td><input class="spinner" style="width:180px"   value="<fmt:formatDate  value="${overdueAdvancesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueAdvancesData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:180px"  value="<fmt:formatDate  value="${overdueAdvancesData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:427px" readonly="readonly">${overdueAdvancesData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#overdueAdvances_mgr_overdueAdvances_detail_memberType').val(renderGridValue('${overdueAdvancesData.memberType}',fields.memberType));
    $('#overdueAdvances_mgr_overdueAdvancesdetail_auditState').val(renderGridValue('${overdueAdvancesData.auditState}',fields.auditState));
</script>
	

