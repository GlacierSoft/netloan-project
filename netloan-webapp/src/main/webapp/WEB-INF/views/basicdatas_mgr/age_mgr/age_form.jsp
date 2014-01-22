<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="age_mgr_age_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>年龄别称：</td>
			<td>
				<input id="age_mgr_age_form_ageId" type="hidden" name="ageId" value="${ageData.ageId}" />
				<input id="age_mgr_age_form_ageName" name="ageName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${ageData.ageName}"/>
			</td>
		</tr>
		<tr>
			<td>开始年龄：</td>
			<td><input id="age_mgr_age_form_ageBegin" name="ageBegin" class="easyui-validatebox spinner" style="width:268px" required="true" value="${ageData.ageBegin}"/></td>
		</tr>
		<tr>
			<td>结束年龄：</td>
			<td><input id="age_mgr_age_form_ageEnd" name="ageEnd" class="easyui-validatebox spinner" style="width:268px" required="true" value="${ageData.ageEnd}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="age_mgr_age_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${ageData.remark}</textarea></td>
		</tr>
	</table>
</form>
