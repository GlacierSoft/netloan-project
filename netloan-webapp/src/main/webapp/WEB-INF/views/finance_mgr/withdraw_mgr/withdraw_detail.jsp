<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>流水号：</td>
			<td class="forminputtable">
				<input type="hidden"  name="financeWithdrawId" value="${withdrawData.financeWithdrawId}" />
				<input name="withdrawCode" class="spinner" style="width:180px" value="${withdrawData.withdrawCode}" readonly="readonly"/>
			</td>
			<td>会员名称：</td>
			<td>
				<input name="memberDisplay" class="spinner" style="width:180px" value="${withdrawData.memberDisplay}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>提现银行：</td>
			<td>
				<input name="openingBank" value="${withdrawData.openingBank}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>提现支行：</td>
			<td>
				<input name="subbranch" class="spinner" style="width:180px" value="${withdrawData.subbranch}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>银行卡姓名：</td>
			<td>
				<input name="cardName" value="${withdrawData.cardName}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>银行卡号：</td>
			<td>
				<input name="cardNumber" class="spinner" style="width:180px" value="${withdrawData.cardNumber}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>提现总金额：</td>
			<td colspan="3">
				<input name="withdrawAmount" class="spinner" style="width:445px" value="<fmt:formatNumber value='${withdrawData.withdrawAmount}' pattern="#,#00.00元"/>" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>手续费：</td>
			<td>
				<input name="handlingCharge" class="spinner" style="width:180px" value="<fmt:formatNumber value='${withdrawData.handlingCharge}' pattern="#,#00.00元"/>" readonly="readonly"></input>
			</td>
			<td>提现费率：</td>
			<td>
				<input name="withdrawRate" value="${withdrawData.withdrawRate}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>到帐金额：</td>
			<td>
				<input name="arriveMoney" class="spinner" style="width:180px" value="<fmt:formatNumber value='${withdrawData.arriveMoney}' pattern="#,#00.00元"/>" readonly="readonly"></input>
			</td>
			<td>提现状态：</td>
			<td>
				<input id="withdraw_mgr_withdraw_detail_auditState" name="auditState" value="${withdrawData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:180px" value="${withdrawData.auditorDisplay}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${withdrawData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${withdrawData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${withdrawData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${withdrawData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${withdrawData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3"><textarea class="spinner" style="width:445px" readonly="readonly">${withdrawData.auditRemark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#withdraw_mgr_withdraw_detail_auditState').val(renderGridValue('${withdrawData.auditState}',fields.auditState));
</script>