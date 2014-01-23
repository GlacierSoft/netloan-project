<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>角色名称：</td>
			<td>
				<input type="hidden" name="roleId" value="${roleData.roleId}" />
				<input name="roleCnName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${roleData.roleCnName}"/>
			</td>
		</tr>
		<tr>
			<td>英文名称：</td>
			<td><input name="roleEnName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${roleData.roleEnName}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${roleData.remark}</textarea></td>
		</tr>
	</table>
</form>

