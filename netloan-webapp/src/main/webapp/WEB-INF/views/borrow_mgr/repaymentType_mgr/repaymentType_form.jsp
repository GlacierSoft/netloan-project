<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>方式名称：</td>
			<td>
				<input type="hidden" id="repaymentType_mgr_repaymentType_form_repaymentTypeId" name="repaymentTypeId" value="${repaymentTypeData.repaymentTypeId}" />
				<input id="repaymentType_mgr_repaymentType_form_repaymentTypeName" name="repaymentTypeName" style="width:298px" value="${repaymentTypeData.repaymentTypeName}" class="easyui-validatebox spinner"  required="true"  validType="length[1,25]" invalidMessage="招聘管理主题必须在1到25个字符之间"/>
			</td>
		</tr>
		<tr>
			<td>方式状态：</td>
			<td>
				<input id="repaymentType_mgr_repaymentType_form_state" name="state" value="${repaymentTypeData.state}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.state"/>
			</td>
		</tr>
		<tr>
			<td>算法信息：</td>
			<td><textarea id="repaymentType_mgr_repaymentType_form_algorithmInfo" name="algorithmInfo" style="width:298px;" maxlength="255" class="spinner formta">${repaymentTypeData.algorithmInfo}</textarea></td>
		</tr>
		<tr>
			<td>方式描述：</td>
			<td><textarea id="repaymentType_mgr_repaymentType_form_remark" name="remark" style="width:298px;" maxlength="255" class="spinner formta">${repaymentTypeData.remark}</textarea></td>
		</tr>
	</table>
</form>