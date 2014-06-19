<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>充值类型名称：</td>
			<td>
				<input type="hidden" id="rechargeSet_mgr_rechargeSet_form_financeRechargeSetId" name="financeRechargeSetId" value="${rechargeSetData.financeRechargeSetId}" />
				<input data-options="missingMessage:'充值类型名称必须由1-20个中文字符组成'" id="rechargeSet_mgr_rechargeSet_form_rechargeSetName" name="rechargeSetName" class="easyui-validatebox spinner" style="width:298px" required="true" maxlength="50" value="${rechargeSetData.rechargeSetName}"/>
			</td>
		</tr>
		<tr>
			<td>有效会员等级：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_form_rechargeType" name="rechargeType" value="${rechargeSetData.rechargeType}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.rechargeType"/>
			</td>
		</tr>
		<tr>
			<td>充值类型费率：</td>
			<td>
				<input type="text" id="rechargeSet_mgr_rechargeSet_form_rechargeRate" name="rechargeRate" class="easyui-numberbox spinner" style="width:298px" value="${rechargeSetData.rechargeRate}" data-options="min:0,precision:2"></input>
			</td>
		</tr>
		<tr>
			<td>有效会员等级：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_form_memberType" name="memberType" value="${rechargeSetData.memberType}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.memberType"/>
			</td>
		</tr>
		<tr>
			<td>充值类型取值：</td>
			<td>
				<input type="text" id="rechargeSet_mgr_rechargeSet_form_value" name="value" class="easyui-numberbox spinner" style="width:298px" value="${rechargeSetData.value}" data-options="min:0,precision:2"></input>
			</td>
		</tr>
		<tr>
			<td>取费方式：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_form_feeWay" name="feeWay" value="${rechargeSetData.feeWay}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.feeWay"/>
			</td>
		</tr>
		<tr>
			<td>充值类型备注：</td>
			<td><textarea name="remark" style="width:298px;" maxlength="255" class="spinner formta">${rechargeSetData.remark}</textarea></td>
		</tr>
	</table>
</form>
