<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>流水号：</td>
			<td class="forminputtable">
				<input type="hidden"  name="financeRechargeId" value="${rechargeData.financeRechargeId}" />
				<input name="rechargeCode" class="spinner" style="width:180px" value="${rechargeData.rechargeCode}" readonly="readonly"/>
			</td>
			<td>会员名称：</td>
			<td>
				<input name="memberDisplay" class="spinner" style="width:180px" value="${rechargeData.memberDisplay}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>充值类型：</td>
			<td>
				<input name="rechargeSetName" value="${rechargeData.rechargeSetName}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>充值回执：</td>
			<td>
				<input name="rechargeReceipt" class="spinner" style="width:180px" value="${rechargeData.rechargeReceipt}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>充值金额：</td>
			<td>
				<input name="rechargeAmount" class="spinner" style="width:180px" value="${rechargeData.rechargeAmount}" readonly="readonly"></input>
			</td>	
			<td>手续费：</td>
			<td>
				<input name="handlingCharge" class="spinner" style="width:180px" value="${rechargeData.handlingCharge}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>充值费率：</td>
			<td>
				<input name="rechargeRate" value="${rechargeData.rechargeRate}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>到帐金额：</td>
			<td>
				<input name="arriveMoney" class="spinner" style="width:180px" value="${rechargeData.arriveMoney}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="recharge_mgr_recharge_audit_auditState" name="auditState" value="${rechargeData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" class="spinner" style="width:180px" value="${rechargeData.auditRemark}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:180px" value="${rechargeData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${rechargeData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${rechargeData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${rechargeData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${rechargeData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${rechargeData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>充值备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:455px" readonly="readonly">${rechargeData.remark}</textarea></td>
		</tr>
	</table>
</div>
<script type="text/javascript">
	$('#recharge_mgr_recharge_audit_auditState').val(renderGridValue('${rechargeData.auditState}',fields.auditState));
</script>
<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核充值记录：</td>
			<td><input type="hidden" id="rechargeSet_mgr_rechargeSet_audit_financeRechargeId" name="financeRechargeId" value="${rechargeData.financeRechargeId}" />
				<input type="hidden" id="rechargeSet_mgr_rechargeSet_audit_memberId" name="memberId" value="${rechargeData.memberId}"/>
				<input type="hidden" id="rechargeSet_mgr_rechargeSet_audit_rechargeCode" name="rechargeCode" value="${rechargeData.rechargeCode}"/>
				<input type="hidden" id="rechargeSet_mgr_rechargeSet_audit_arriveMoney" name="arriveMoney" value="${rechargeData.arriveMoney}">
				<input id="rechargeSet_mgr_rechargeSet_audit_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="rechargeSet_mgr_rechargeSet_audit_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span></td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3">
				<textarea name="auditRemark" class="spinner" style="height:50px;width:425px">${rechargeData.auditRemark}</textarea>
			</td>
		</tr>
	</table>
</form>