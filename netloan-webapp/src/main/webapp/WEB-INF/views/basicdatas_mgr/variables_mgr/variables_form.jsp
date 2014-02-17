<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>参数说明：</td>
			<td>
				<input type="hidden" name="variablesId" value="${variablesData.variablesId}" />
				<input name="specification" class="easyui-validatebox spinner" style="width:268px" required="true" value="${variablesData.specification}"/>
			</td>
		</tr>
		<tr>
			<td>输入提示：</td>
			<td><input name="inputTip" class="easyui-validatebox spinner" style="width:268px" required="true" value="${variablesData.inputTip}"/></td>
		</tr>
		<tr>
			<td>参数值：</td>
			<td><input name="parameterValues" class="easyui-validatebox spinner" style="width:268px" required="true" value="${variablesData.parameterValues}"/></td>
		</tr>
		<tr>
			<td>变量名：</td>
			<td><input name="variableName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${variablesData.variableName}"/></td>
		</tr>
		<tr>
			<td>表单类型：</td>
			<td><input id="variables_mgr_variables_form_formType" name="formType" value="${variablesData.formType}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${variablesData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	// 初始化公告状态下拉框
	$('#variables_mgr_variables_form_formType').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.formType
	});
</script>