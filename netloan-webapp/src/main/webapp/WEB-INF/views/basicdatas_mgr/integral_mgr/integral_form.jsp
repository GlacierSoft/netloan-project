<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>会员积分级别名称：</td>
			<td>
				<input type="hidden" name="integralId" value="${integralData.integralId}" />
				<input name="integralName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${integralData.integralName}"/>
			</td>
		</tr>
		<tr>
			<td>积分级别开始积分：</td>
			<td><input name="integralBegin" class="easyui-validatebox spinner" style="width:268px" required="true" value="${integralData.integralBegin}"/></td>
		</tr>
		<tr>
			<td>积分级别结束积分：</td>
			<td><input name="integralEnd" class="easyui-validatebox spinner" style="width:268px" required="true" value="${integralData.integralEnd}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${integralData.remark}</textarea></td>
		</tr>
	</table>
</form>
