<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<form id="parameterBasic_mgr_parameterBasic_form" method="POST" modelAttribute=parameterBasic style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>基础参数名称：</td>
			<td>
				<c:if test="${parameterBasicData.basicId!=null}">
					<input type="hidden" name="basicId" value="${parameterBasicData.basicId}" />
					<input readonly="readonly" name="basicTitle" class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${parameterBasicData.basicTitle}" data-options="validType:'code',missingMessage:'请输入基础参数名称'"/>
				</c:if>
				<c:if test="${parameterBasicData.basicId==null}">
					<input name="basicTitle" class="easyui-validatebox spinner" style="width:268px;height: 16px;" required="true" value="${parameterBasicData.basicTitle}" data-options="validType:'code',missingMessage:'请输入基础参数名称'"/>
				</c:if>
			</td>
		</tr>
		<tr>
			<td>基础参数值：</td>
			<td><input class="easyui-numberspinner spinner" name="basicValue"  value="${parameterBasicData.basicValue}" style="width:268px;height: 18px;" required="true" value="${parameterBasicData.basicTitle}" data-options="min:0,max:9999,precision:3,missingMessage:'请输入基础参数值,只能输入整数及保留小数'"></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${parameterBasicData.remark}</textarea></td>
		</tr>
	</table>
	<span style="color: red;float: left;margin-top: 25px;margin-left: 90px;">* 基础参数值只能保留三位小数</span>
</form>
