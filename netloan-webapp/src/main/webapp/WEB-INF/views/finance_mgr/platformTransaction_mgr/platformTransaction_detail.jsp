<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable">
				<input type="hidden"  name="transactionId" value="${transactionData.transactionId}" />
				<input name="memberDisplay" class="spinner" style="width:180px" value="${transactionData.memberDisplay}" readonly="readonly"/>
			</td>
			<td>交易对方：</td>
			<td>
				<input name="transactionTarget" class="spinner" style="width:180px" value="${transactionData.transactionTarget}" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>交易类型：</td>
			<td>
				<input name="transactionType" class="spinner" style="width:180px" value="${transactionData.transactionType}" readonly="readonly"></input>
			</td>
			<td>收入金额：</td>
			<td>
				<input name="earningMoney" class="spinner" style="width:180px" value="${transactionData.earningMoney}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>支出金额：</td>
			<td>
				<input name="expendMoney" class="spinner" style="width:180px" value="${transactionData.expendMoney}" readonly="readonly"></input>
			</td>
			<td>可用金额：</td>
			<td>
				<input name="usableMoney" class="spinner" style="width:180px" value="${transactionData.usableMoney}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>冻结金额：</td>
			<td>
				<input name="frozenMoney" class="spinner" style="width:180px" value="${transactionData.frozenMoney}" readonly="readonly"></input>
			</td>
			<td>代收金额：</td>
			<td>
				<input name="collectingMoney" class="spinner" style="width:180px" value="${transactionData.collectingMoney}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>待还金额：</td>
			<td>
				<input name="refundMoney" class="spinner" style="width:180px" value="${transactionData.refundMoney}" readonly="readonly"></input>
			</td>
			<td>总金额：</td>
			<td>
				<input name="amount" class="spinner" style="width:180px" value="${transactionData.amount}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${transactionData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${transactionData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${transactionData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${transactionData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:445px" readonly="readonly">${transactionData.remark}</textarea></td>
		</tr>
	</table>
</form>