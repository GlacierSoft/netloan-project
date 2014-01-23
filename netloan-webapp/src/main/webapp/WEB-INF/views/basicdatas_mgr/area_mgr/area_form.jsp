<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="area_mgr_area_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>地区：</td>
			<td>
				<input id="area_mgr_area_form_areaId" type="hidden" name="areaId" value="${areaData.areaId}" />
				<input id="area_mgr_area_form_areaName" name="areaName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${areaData.areaName}"/>
			</td>
		</tr>
		<tr>
			<td>父级地区：</td>
			<td>
				<input id="area_mgr_area_form_areaPid" name="areaPid" class="easyui-validatebox spinner" style="width:268px" required="true" value="${areaData.areaPid}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td>
				<input id="area_mgr_area_form_areaNum" name="areaNum" class="easyui-validatebox spinner" style="width:268px" required="true" value="${areaData.areaNum}"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="area_mgr_area_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${areaData.remark}</textarea></td>
		</tr>
	</table>
</form>
