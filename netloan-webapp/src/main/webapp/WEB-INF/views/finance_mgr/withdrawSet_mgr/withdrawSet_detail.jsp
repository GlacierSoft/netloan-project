<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>最小提现金额:</td> 
			<td class="forminputtable">
				<input type="hidden"  name="financeWithdrawSetId" value="${withdrawSetData.financeWithdrawSetId}" />
				<input name="withdrawSetMinimum" class="spinner" style="width:180px" value="<fmt:formatNumber value='${withdrawSetData.withdrawSetMinimum}' pattern="#,#00.00元"/>" readonly="readonly"/>
			</td>
			<td>最大提现金额:</td>
			<td>
				<input id="withdrawSet_mgr_withdrawSet_detail_withdrawType" name="withdrawSetMaximum" value="<fmt:formatNumber value='${withdrawSetData.withdrawSetMaximum}' pattern="#,#00.00元"/>" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>提现费率：</td>
			<td>
				<input name="withdrawRate" class="spinner" style="width:180px" value="${withdrawSetData.withdrawRate}" readonly="readonly"></input>
			</td>
			<td>有效会员：</td>
			<td>
				<input id="withdrawSet_mgr_withdrawSet_detail_memberType" name="memberType" value="${withdrawSetData.memberType}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>提现取值：</td>
			<td>
				<input name="value" class="spinner" style="width:180px" value="${withdrawSetData.value}" readonly="readonly"></input>
			</td>
			<td>收费方式：</td>
			<td>
				<input id="withdrawSet_mgr_withdrawSet_detail_feeWay" name="feeWay" value="${withdrawSetData.feeWay}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="withdrawSet_mgr_withdrawSet_detail_auditState" name="auditState" value="${withdrawSetData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input id="withdrawSet_mgr_withdrawSet_detail_auditRemark" name="auditRemark" value="${withdrawSetData.auditRemark}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:180px" value="${withdrawSetData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${withdrawSetData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${withdrawSetData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${withdrawSetData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${withdrawSetData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${withdrawSetData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px" readonly="readonly">${withdrawSetData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	 $('#withdrawSet_mgr_withdrawSet_detail_memberType').val(renderGridValue('${withdrawSetData.memberType}',fields.memberType));
	$('#withdrawSet_mgr_withdrawSet_detail_feeWay').val(renderGridValue('${withdrawSetData.feeWay}',fields.feeWay));
	$('#withdrawSet_mgr_withdrawSet_detail_auditState').val(renderGridValue('${withdrawSetData.auditState}',fields.auditState));
</script>