<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>方式名称：</td>
			<td>
				<input type="hidden" id="repaymentType_mgr_repaymentType_detail_repaymentTypeId" name="repaymentTypeId" value="${repaymentTypeData.repaymentTypeId}" />
				<input id="repaymentType_mgr_repaymentType_detail_repaymentTypeName" name="repaymentTypeName" style="width:168px" value="${repaymentTypeData.repaymentTypeName}" class="spinner" readonly="readonly"/>
			</td>
			<td>方式状态：</td>
			<td>
				<input id="repaymentType_mgr_repaymentType_detail_state" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${repaymentTypeData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${repaymentTypeData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${repaymentTypeData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${repaymentTypeData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>算法信息：</td>
			<td colspan="3"><textarea id="repaymentType_mgr_repaymentType_detail_algorithmInfo" name="algorithmInfo" style="width:405px;" maxlength="255" class="spinner formta" readonly="readonly">${repaymentTypeData.algorithmInfo}</textarea></td>
		</tr>
		<tr>
			<td>方式描述：</td>
			<td colspan="3"><textarea id="repaymentType_mgr_repaymentType_detail_remark" name="remark" style="width:405px;" maxlength="255" class="spinner formta" readonly="readonly">${repaymentTypeData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#repaymentType_mgr_repaymentType_detail_state').val(renderGridValue('${repaymentTypeData.state}',fields.state));
</script>