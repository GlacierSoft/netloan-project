<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			 <td>罚款名称：</td>
			<td>
				<input type="hidden" id="overdueFineSet_mgr_overdueFineSet_form_overdueFineSetId" name="overdueFineSetId" value="${overdueFineSetData.overdueFineSetId}" />
				<input  name="overdueFineSetName" value="${overdueFineSetData.overdueFineSetName}" class="easyui-validatebox spinner"  style="width:298px" required="true" maxlength="50"/>
			</td>
		</tr>
		<tr>
			<td>会员等级：</td>
			<td>
			    <input id="overdueFineSet_mgr_overdueFineSet_memberType" name="memberType" class="easyui-combobox" value="${overdueFineSetData.memberType}" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.memberType"/>
			</td>
		</tr>
		
		<c:if test="${overdueFineSetData.overdueFineSetId!=null}">
			<tr>
				<td>罚款金额：</td>
				<td><input id="overdueFineSet_mgr_overdueFineSet_form_money" name="money" value="${overdueFineSetData.money}" class="easyui-numberbox spinner"  style="width:298px"  maxlength="50" min="0" max="100"  required="required" /></td>
			</tr>
		</c:if>
		
		<c:if test="${ empty overdueFineSetData.overdueFineSetId}">
			<tr>
				<td>罚款金额：</td>
				<td><input id="overdueFineSet_mgr_overdueFineSet_form_money" name="money" value="0" class="easyui-numberbox spinner"  style="width:298px"  maxlength="50" min="0" max="100"  required="required" /></td>
			</tr>
		</c:if>
		
		<tr>
			<td>取费方式：</td>
			<td>
			     <input id="overdueFineSet_mgr_overdueFineSet_form_feeWay" name="feeWay" value="${overdueFineSetData.feeWay}" class="easyui-combobox" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.feeWay"/>
			</td>
		</tr>
		<tr>
				<td>缩减天数：</td>
				<td>
				    <input id="overdueFineSet_mgr_overdueFineSet_form_memberPrivilege" name="memberPrivilege" class="easyui-combobox" value="${overdueFineSetData.memberPrivilege}" style="height:18px;width:300px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,required:true,data : fields.status"/>
				</td>
			</tr>
		<tr>
		
		<c:if test="${overdueFineSetData.memberPrivilege!='enable' }">
			 <tr id="overdueFineSet_mgr_overdueFineSet_form_tr" style="display:none;" >
				<td>天数设定：</td>
				<td>
				    <input id="overdueFineSet_mgr_overdueFineSet_form_vipDays" name="vipDays" value="0" class="easyui-numberbox"  style="width:298px;" min="0" max="100"  required="true" maxlength="50" />
				</td>
			</tr>
		</c:if>
		
		<c:if test="${overdueFineSetData.memberPrivilege=='enable' }">
			 <tr id="overdueFineSet_mgr_overdueFineSet_form_tr" style="display:'';" >
				<td>天数设定：</td>
				<td>
				    <input id="overdueFineSet_mgr_overdueFineSet_form_vipDays"  name="vipDays" value="${overdueFineSetData.vipDays}" class="easyui-numberbox"  style="width:298px" required="true" maxlength="50" min="0"  max="100" />
				</td>
			</tr>
		</c:if>
		
		<tr>
		    <td>罚款备注：</td>
			<td><textarea name="remark" style="width:298px;" maxlength="255">${rechargeSetData.remark}</textarea></td>
		</tr>
		 
	</table>
</form>
<script>

$('#overdueFineSet_mgr_overdueFineSet_form_memberPrivilege').combobox({
    onSelect: function(param){
      if(param.value=="enable"){
    	  $("#overdueFineSet_mgr_overdueFineSet_form_tr").css({"display":''});  
	  }else {
		  $("#overdueFineSet_mgr_overdueFineSet_form_tr").css({"display":'none'});
        }
	}
 });
</script>


