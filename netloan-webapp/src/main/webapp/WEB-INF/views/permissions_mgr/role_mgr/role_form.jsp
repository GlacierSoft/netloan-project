<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="role_mgr_role_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>角色名称：</td>
			<td>
				<input id="role_mgr_role_form_roleId" type="hidden" name="roleId" value="${roleData.roleId}" />
				<input id="role_mgr_role_form_roleCnName" name="roleCnName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${roleData.roleCnName}"/>
			</td>
		</tr>
		<tr>
			<td>英文名称：</td>
			<td><input id="role_mgr_role_form_roleEnName" name="roleEnName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${roleData.roleEnName}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="role_mgr_role_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${roleData.remark}</textarea></td>
		</tr>
	</table>
</form>
