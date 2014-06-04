<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div method="post" style="padding:15px">
	<table class="detailtable">
	  <tr>
			<td>罚款名称：</td>
			<td>
				<input  name="overdueFineSetName" value="${overdueFineSetData.overdueFineSetName}" class="easyui-validatebox spinner"  style="width:180px" required="true" maxlength="50" />
			</td>
			<td>有效会员：</td>
			<td>
			    <input type="hidden"  name="overdueFineSetId" value="${overdueFineSetData.overdueFineSetId}" />
				<input id="overdueFineSet_mgr_overdueFineSet_detail_memberType" name="memberType" value="${overdueFineSetData.memberType}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>减少Vip天数：</td>
			<td><input class="spinner"  id="overdueFineSet_mgr_overdueFineSet_detail_memberPrivilege" name="memberPrivilege" style="width:180px" value="${overdueFineSetData.memberPrivilege}" readonly="readonly"/></td>
			<td>Vip天数设定：</td>
			<td><input class="spinner" name="vipDays" style="width:180px" value="${overdueFineSetData.vipDays}"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>取费方式：</td>
			<td>
				<input id="overdueFineSet_mgr_overdueFineSet_detail_feeWay" name="feeWay" value="${overdueFineSetData.feeWay}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>审核状态：</td>
			<td>
				<input id="overdueFineSet_mgr_overdueFineSet_detail_auditState" name="auditState" value="${overdueFineSetData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner"  name="auditor" style="width:180px" value="${overdueFineSetData.auditor}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" name="auditDate" style="width:180px" value="<fmt:formatDate value="${overdueFineSetData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" name="creater" style="width:180px" value="${overdueFineSetData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" name="createTime" style="width:180px" value="<fmt:formatDate value="${overdueFineSetData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" namme="updater" style="width:180px" value="${overdueFineSetData.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" name="updateTime" style="width:180px" value="<fmt:formatDate value="${overdueFineSetData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px" readonly="readonly" name="remark">${overdueFineSetData.remark}</textarea></td>
		</tr>
	</table>
</div>
<script type="text/javascript"> 
	$('#overdueFineSet_mgr_overdueFineSet_detail_memberType').val(renderGridValue('${overdueFineSetData.memberType}',fields.memberType));
	$('#overdueFineSet_mgr_overdueFineSet_detail_auditState').val(renderGridValue('${overdueFineSetData.auditState}',fields.auditState));
	$('#overdueFineSet_mgr_overdueFineSet_detail_feeWay').val(renderGridValue('${overdueFineSetData.feeWay}',fields.feeWay));
	$('#overdueFineSet_mgr_overdueFineSet_detail_memberPrivilege').val(renderGridValue('${overdueFineSetData.memberPrivilege}',fields.status));
</script>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核充值设置：</td>
			<td><input type="hidden" id="overdueFineSet_mgr_overdueFineSet_form_overdueFineSetId" name="overdueFineSetId" value="${overdueFineSetData.overdueFineSetId}" />
				<input id="overdueFineSet_mgr_overdueFineSet_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="overdueFineSet_mgr_overdueFineSet_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span></td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3">
				<textarea name="auditRemark" class="spinner" style="height:50px;width:435px">${overdueFineSetData.auditRemark}</textarea>
			</td>
		</tr>
	</table>
</form>
