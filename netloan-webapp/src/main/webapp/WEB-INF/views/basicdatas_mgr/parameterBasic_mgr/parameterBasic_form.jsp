<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="parameterBasic_mgr_parameterBasic_form" method="POST" modelAttribute=parameterBasic style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>基础参数名称：</td>
			<td>
				<input type="hidden" name="basicId" value="${parameterBasicData.basicId}" />
				<input name="basicTitle" class="easyui-validatebox spinner" style="width:268px" required="true" value="${parameterBasicData.basicTitle}" data-options="validType:'code'"/>
			</td>
		</tr>
		<tr>
			<td>基础参数值：</td>
			<td><input name="basicValue" class="easyui-validatebox spinner" value="${parameterBasicData.basicValue}" style="width:268px" required="true" value="${parameterBasicData.basicTitle}" </td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${parameterBasicData.remark}</textarea></td>
		</tr>
	</table>
</form>
