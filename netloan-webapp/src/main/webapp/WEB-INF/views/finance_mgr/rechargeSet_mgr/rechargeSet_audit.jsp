<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>充值类型名称：</td>
			<td class="forminputtable">
				<input name="rechargeSetName" class="spinner" style="width:300px" value="${rechargeSetData.rechargeSetName}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>充值类型费率：</td>
			<td>
				<input name="rechargeRate" class="spinner" style="width:300px" value="${rechargeSetData.rechargeRate}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>有效会员等级：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_detail_memberType" name="memberType" value="${rechargeSetData.memberType}" class="spinner" style="height:18px;width:300px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>充值类型取值：</td>
			<td>
				<input name="value" class="spinner" style="width:300px" value="${rechargeSetData.value}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>取费方式：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_detail_feeWay" name="feeWay" value="${rechargeSetData.feeWay}" class="spinner" style="height:18px;width:300px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:300px" value="${rechargeSetData.createrDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:300px" value="<fmt:formatDate value="${rechargeSetData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:300px" value="${rechargeSetData.updaterDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:300px" value="<fmt:formatDate value="${rechargeSetData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:300px" readonly="readonly">${rechargeSetData.remark}</textarea></td>
		</tr>
	</table>
</div>
<script type="text/javascript">
	$('#rechargeSet_mgr_rechargeSet_detail_memberType').val(renderGridValue('${rechargeSetData.memberType}',fields.memberType));
	$('#rechargeSet_mgr_rechargeSet_detail_feeWay').val(renderGridValue('${rechargeSetData.feeWay}',fields.feeWay));
</script>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核充值设置：</td>
			<td><input type="hidden" id="rechargeSet_mgr_rechargeSet_form_financeRechargeSetId" name="financeRechargeSetId" value="${rechargeSetData.financeRechargeSetId}" />
				<input type="hidden" id="rechargeSet_mgr_rechargeSet_form_rechargeSetName" name="rechargeSetName" value="${rechargeSetData.rechargeSetName}"/>
				<input id="rechargeSet_mgr_rechargeSet_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="rechargeSet_mgr_rechargeSet_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span></td>
		</tr>
	</table>
</form>
