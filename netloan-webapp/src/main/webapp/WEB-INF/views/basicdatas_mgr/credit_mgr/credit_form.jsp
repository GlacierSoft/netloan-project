<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="credit_mgr_credit_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>会员信用级别名称：</td>
			<td>
				<input id="credit_mgr_credit_form_creditId" type="hidden" name="creditId" value="${creditData.creditId}" />
				<input id="credit_mgr_credit_form_creditName" name="creditName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditName}"/>
			</td>
		</tr>
		<tr>
			<td>信用级别开始积分：</td>
			<td><input id="credit_mgr_credit_form_creditBeginIntegral" name="creditBeginIntegral" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditBeginIntegral}"/></td>
		</tr>
		<tr>
			<td>信用级别结束积分：</td>
			<td><input id="credit_mgr_credit_form_creditEndIntegral" name="creditEndIntegral" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditEndIntegral}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="credit_mgr_credit_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${creditData.remark}</textarea></td>
		</tr>
	</table>
</form>