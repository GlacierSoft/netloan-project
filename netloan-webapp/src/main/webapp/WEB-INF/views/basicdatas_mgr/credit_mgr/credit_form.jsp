<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="credit_mgr_credit_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>信用级别名称：</td>
			<td>
				<input type="hidden" name="creditId" value="${creditData.creditId}" />
				<input name="creditName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditData.creditName}" validType="customReg['^[\u0391-\uFFE5]{2,10}$','<fmt:message key="ParameterCredit.creditName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>开始积分：</td>
			<td><input name="creditBeginIntegral" class="easyui-numberspinner spinner" value="${creditData.creditBeginIntegral}" data-options="min:0,max:9999,required:true,missingMessage:'请选择信用级别开始积分'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>结束积分：</td>
			<td><input name="creditEndIntegral" class="easyui-numberspinner spinner" value="${creditData.creditEndIntegral}" data-options="min:0,max:9999,required:true,missingMessage:'请选择信用级别结束积分'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>排序：</td>
			<td><input name="creditNum" class="easyui-numberspinner spinner" value="${creditData.creditNum}" data-options="min:0,max:999,missingMessage:'请输入信用级别排序'" style="width: 270px;height:18px;" min="1" max="99"/></td>
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

<script type="text/javascript">
/* 	var webNavStatus = '${websiteNavData.webNavStatus}';
	if(webNavStatus == "enabled"){
		$('#nav_mgr_nav_form_webNavStatus').val("启用");
	}else{
		$('#nav_mgr_nav_form_webNavStatus').val("禁用");
	}   */
</script>