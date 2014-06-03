<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			 <td>罚款名称：</td>
			<td>
				<input type="hidden" id="overdueFineSet_mgr_overdueFineSet_form_overdueFineSetId" name="overdueFineSetId" value="${overdueFineSetData.overdueFineSetId}" />
				<input  name="overdueFineSetName" value="${overdueFineSetData.overdueFineSetName}" class="easyui-validatebox spinner"  style="width:298px" required="true" maxlength="50" />
			</td>
		</tr>
		<tr>
			<td>会员等级：</td>
			<td>
			    <input id="overdueFineSet_mgr_overdueFineSet_memberType" name="memberType" class="easyui-combobox" value="${overdueFineSetData.memberType}" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.memberType"/>
			</td>
		</tr>
		<tr>
			<td>缩减天数：</td>
			<td>
			    <input id="overdueFineSet_mgr_overdueFineSet_form_memberPrivilege" name="memberPrivilege" class="easyui-combobox" value="${overdueFineSetData.memberPrivilege}" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.yesOrNo" />
			</td>
		</tr>
		<tr>
			<td>天数设定：</td>
			<td>
			    <input id="overdueFineSet_mgr_overdueFineSet_form_value" name="value" value="${overdueFineSetData.value}" class="easyui-validatebox spinner"  style="width:298px" required="true" maxlength="50" />
			</td>
		</tr>
		<tr>
			<td>罚款金额：</td>
			<td><input id="overdueFineSet_mgr_overdueFineSet_form_money" name="money" value="${overdueFineSetData.money}" class="easyui-validatebox spinner"  style="width:298px" required="true" maxlength="50" /></td>
		</tr>
		<tr>
			<td>取费方式：</td>
			<td>
			     <input id="overdueFineSet_mgr_overdueFineSet_form_feeWay" name="feeWay" value="${overdueFineSetData.feeWay}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.feeWay"/>
			</td>
		</tr>
		<tr>
			<td>罚款备注：</td>
			<td><textarea name="remark" style="width:298px;" maxlength="255" class="spinner formta">${rechargeSetData.remark}</textarea></td>
		</tr>
	</table>
</form>


