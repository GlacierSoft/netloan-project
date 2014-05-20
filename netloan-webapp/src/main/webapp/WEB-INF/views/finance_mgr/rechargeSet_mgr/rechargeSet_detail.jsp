<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>充值名称：</td>
			<td class="forminputtable">
				<input type="hidden"  name="financeRechargeSetId" value="${rechargeSetData.financeRechargeSetId}" />
				<input name="rechargeSetName" class="spinner" style="width:180px" value="${rechargeSetData.rechargeSetName}" readonly="readonly"/>
			</td>
			<td>充值类型：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_detail_rechargeType" name="rechargeType" value="${rechargeSetData.rechargeType}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>充值费率：</td>
			<td>
				<input name="rechargeRate" class="spinner" style="width:180px" value="${rechargeSetData.rechargeRate}" readonly="readonly"></input>
			</td>
			<td>有效会员：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_detail_memberType" name="memberType" value="${rechargeSetData.memberType}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>充值取值：</td>
			<td>
				<input name="value" class="spinner" style="width:180px" value="${rechargeSetData.value}" readonly="readonly"></input>
			</td>
			<td>取费方式：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_detail_feeWay" name="feeWay" value="${rechargeSetData.feeWay}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_detail_auditState" name="auditState" value="${rechargeSetData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input id="rechargeSet_mgr_rechargeSet_detail_auditRemark" name="auditRemark" value="${rechargeSetData.auditRemark}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:180px" value="${rechargeSetData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${rechargeSetData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${rechargeSetData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${rechargeSetData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${rechargeSetData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${rechargeSetData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px" readonly="readonly">${rechargeSetData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#rechargeSet_mgr_rechargeSet_detail_rechargeType').val(renderGridValue('${rechargeSetData.rechargeType}',fields.rechargeType));
	$('#rechargeSet_mgr_rechargeSet_detail_memberType').val(renderGridValue('${rechargeSetData.memberType}',fields.memberType));
	$('#rechargeSet_mgr_rechargeSet_detail_feeWay').val(renderGridValue('${rechargeSetData.feeWay}',fields.feeWay));
	$('#rechargeSet_mgr_rechargeSet_detail_auditState').val(renderGridValue('${rechargeSetData.auditState}',fields.auditState));
</script>