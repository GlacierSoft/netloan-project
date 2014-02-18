<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="credit_mgr_credit_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>会员信用级别名称：</td>
			<td>
				<input type="hidden" name="creditId" value="${creditData.creditId}" />
				<input name="creditName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="ParameterCredit.creditName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>信用级别开始积分：</td>
			<td><input name="creditBeginIntegral" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditBeginIntegral}" validType="customReg['^[0-9]*[1-9][0-9]*$','<fmt:message key="ParameterCredit.creditBeginIntegral.illegal"/>']"/></td>
		</tr>
		<tr>
			<td>信用级别结束积分：</td>
			<td><input name="creditEndIntegral" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditEndIntegral}" validType="customReg['^[0-9]*[1-9][0-9]*$','<fmt:message key="ParameterCredit.creditEndIntegral.illegal"/>']"/></td>
		</tr>
<%-- 		<tr>
	    	<td>级别图标:</td>
	    	<td><input id="credit_mgr_credit_form_creditPhoto" name="photo" type="file" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditPhoto}"/></td>
	    </tr> --%>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${creditData.remark}</textarea></td>
		</tr>
	</table>
</form>
