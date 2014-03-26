<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="creditType_mgr_creditType_form" method="POST" modelAttribute="parameterCredit" style="padding:15px" enctype="multipart/form-data">
	<table class="formtable">
		<tr>
			<td>信用积分类型名称：</td>
			<td>
				<input type="hidden" name="creditTypeId" value="${creditTypeData.creditTypeId}" />
				<input name="creditType" class="easyui-validatebox spinner" style="width:268px" required="true" value="${creditTypeData.creditType}" data-options="validType:'code'"/>
			</td>
		</tr>
		<tr>
			<td>积分：</td>
			<td><input name="changeValue" class="easyui-numberspinner spinner" value="${creditTypeData.changeValue}" data-options="min:0,max:9999,required:true,missingMessage:'请填写信用积分'" style="width: 270px;height:18px;"/></td>
		</tr>
		<tr>
			<td>改变类型：</td>
			<td><input id="changeType" name="changeType" value="${creditTypeData.changeType}" /></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${creditTypeData.remark}</textarea></td>
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
	//初始化下拉框
	$('#changeType').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.changeType
	});
</script>