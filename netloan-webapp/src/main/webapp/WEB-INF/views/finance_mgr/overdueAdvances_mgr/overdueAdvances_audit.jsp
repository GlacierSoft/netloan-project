<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div method="post" style="padding:15px">
	<table class="detailtable">
	  <tr>
			<td>有效会员：</td>
			<td>
			   <input type="hidden"  name="overdueAdvancesId" value="${overdueAdvancesData.overdueAdvancesId}" />
			   <input id="overdueAdvances_mgr_overdueAdvances_detail_memberType" name="memberType" value="${overdueAdvancesData.memberType}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>终付百分比：</td>
			<td>
				<input name="value" class="spinner" style="width:180px" value="${overdueAdvancesData.value}" readonly="readonly"></input>
			</td>
		</tr>
	   <tr>
			<td>审核状态：</td>
			<td>
				<input id="overdueAdvances_mgr_overdueAdvances_detail_auditState" name="auditState" value="${overdueAdvancesData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input id="overdueAdvances_mgr_overdueAdvances_detail_auditRemark" name="auditRemark" value="${overdueAdvancesData.auditRemark}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner"  name="auditor" style="width:180px" value="${overdueAdvancesData.auditor}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" name="auditDate" style="width:180px" value="<fmt:formatDate value="${overdueAdvancesData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" name="creater" style="width:180px" value="${overdueAdvancesData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" name="createTime" style="width:180px" value="<fmt:formatDate value="${overdueAdvancesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" namme="updater" style="width:180px" value="${overdueAdvancesData.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" name="updateTime" style="width:180px" value="<fmt:formatDate value="${overdueAdvancesData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px" readonly="readonly" name="remark">${overdueAdvancesData.remark}</textarea></td>
		</tr>
	</table>
</div>
<script type="text/javascript">
	$('#overdueAdvances_mgr_overdueAdvances_detail_memberType').val(renderGridValue('${overdueAdvancesData.memberType}',fields.memberType));
	$('#overdueAdvances_mgr_overdueAdvances_detail_auditState').val(renderGridValue('${overdueAdvancesData.auditState}',fields.auditState));
</script>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核充值设置：</td>
			<td><input type="hidden" id="overdueAdvances_mgr_overdueAdvances_form_overdueAdvancesId" name="overdueAdvancesId" value="${overdueAdvancesData.overdueAdvancesId}" />
				<input id="overdueAdvances_mgr_overdueAdvances_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="overdueAdvances_mgr_overdueAdvances_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span></td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3">
				<textarea name="auditRemark" class="spinner" style="height:50px;width:415px">${overdueAdvancesData.auditRemark}</textarea>
			</td>
		</tr>
	</table>
</form>
