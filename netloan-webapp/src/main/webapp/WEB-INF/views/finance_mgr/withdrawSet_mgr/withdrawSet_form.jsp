<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>提现最小金额：</td>
			<td>
				<input type="hidden" id="withdrawSet_mgr_withdrawSet_form_financeWithdrawSetId" name="financeWithdrawSetId" value="${withdrawSetData.financeWithdrawSetId}" />
				<input data-options="min:100,missingMessage:'最小充值金额必须大于等于￥100'" id="withdrawSet_mgr_withdrawSet_form_withdrawSetMinimum" name="withdrawSetMinimum"  class="easyui-numberbox spinner" style="width:298px;height: 16px;" required="true" maxlength="50" value="${withdrawSetData.withdrawSetMinimum}"/>
			</td>
		</tr>
		<tr>
			<td>提现最高金额：</td>
			<td>
				<input id="withdrawSet_mgr_withdrawSet_form_withdrawSetMaximum" name="withdrawSetMaximum" value="${withdrawSetData.withdrawSetMaximum}" class="easyui-numberbox spinner" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.withdrawSetMaximum"/>
			</td>
		</tr>
		<tr>
			<td>有效会员等级：</td>
			<td>
			  
				<input id="withdrawSet_mgr_withdrawSet_form_memberType" name="memberType" value="全部会员" class="easyui-validatebox spinner" style="height:18px;width:300px" readonly="readonly" />
			</td>
		</tr>
		<tr>
			<td>提现费率：</td>
			<td>
				<input type="text" id="withdrawSet_mgr_withdrawSet_form_withdrawRate" name="withdrawRate" class="easyui-numberbox spinner" style="width:298px" value="${withdrawSetData.withdrawRate}" data-options="min:0,precision:4"></input>
			</td>
		</tr> 
		<tr>
			<td>提现取值：</td>
			<td>
				<input type="text" id="withdrawSet_mgr_withdrawSet_form_value" name="value" class="easyui-numberbox spinner" style="width:298px" value="${withdrawSetData.value}" data-options="min:0,precision:4"></input>
			</td>
		</tr>
		<tr>
			<td>收费方式：</td>
			<td>
				<input id="withdrawSet_mgr_withdrawSet_form_feeWay" name="feeWay" value="${withdrawSetData.feeWay}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.feeWay"/>
			</td>
		</tr>
		<tr>
			<td>提现备注：</td>
			<td><textarea name="remark" style="width:298px;" maxlength="255" class="spinner formta">${withdrawSetData.remark}</textarea></td>
		</tr>
	</table>
</form>
