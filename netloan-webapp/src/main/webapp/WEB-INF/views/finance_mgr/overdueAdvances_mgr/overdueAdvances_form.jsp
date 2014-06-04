<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>有效会员等级：</td>
			<td>
				<input type="hidden" id="overdueAdvances_mgr_overdueAdvances_form_overdueAdvancesId" name="overdueAdvancesId" value="${overdueAdvancesData.overdueAdvancesId}" />
				<input id="overdueAdvances_mgr_overdueAdvances_memberType" name="memberType" class="easyui-combobox" value="${overdueAdvancesData.memberType}" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.memberType"/>
			</td>
		</tr>
		<tr>
			<td>逾期终付百分比：</td>
			<td>
				 <input id="overdueAdvances_mgr_overdueAdvances_form_value" name="value" value="${overdueAdvancesData.value}"   class="easyui-numberbox"  style="width:298px" required="true" maxlength="50" />
			</td>
		</tr>
		<tr>
			<td>逾期管理备注：</td>
			<td><textarea name="remark" style="width:298px;" maxlength="255" class="spinner formta">${overdueAdvancesData.remark}</textarea></td>
		</tr>
	</table>
</form>
