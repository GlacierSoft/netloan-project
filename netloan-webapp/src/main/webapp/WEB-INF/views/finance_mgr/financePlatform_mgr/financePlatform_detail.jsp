<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable">
				<input type="hidden"  name="financePlatformId" value="${financePlatformData.financePlatformId}" />
				<input name="memberDisplay" class="spinner" style="width:180px" value="${financePlatformData.memberDisplay}" readonly="readonly"></input>
			</td>	
			<td>银行卡号：</td>
			<td>
				<input name="bankCardDisplay" class="spinner" style="width:180px" value="${financePlatformData.bankCardDisplay}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>可用余额：</td>
			<td>
				<input name="usableMoney" value="${financePlatformData.usableMoney}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>冻结金额：</td>
			<td>
				<input name="frozenMoney" value="${financePlatformData.frozenMoney}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>代收金额：</td>
			<td>
				<input name="collectingMoney" value="${financePlatformData.collectingMoney}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>待还金额：</td>
			<td>
				<input name="refundMoney" value="${financePlatformData.refundMoney}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>总金额：</td>
			<td>
				<input name="amount" value="${financePlatformData.amount}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>本月充值次数：</td>
			<td>
				<input name="rechargeMonthTimes" value="${financePlatformData.rechargeMonthTimes}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>充值总次数：</td>
			<td>
				<input name="rechargeTimes" value="${financePlatformData.rechargeTimes}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>充值总金额：</td>
			<td>
				<input name="rechargeMoney" value="${financePlatformData.rechargeMoney}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>本月提现次数：</td>
			<td>
				<input name="withdrawMonthTimes" value="${financePlatformData.withdrawMonthTimes}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>提现总次数：</td>
			<td>
				<input name="withdrawTimes" value="${financePlatformData.withdrawTimes}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>提现总金额：</td>
			<td>
				<input name="withdrawMoney" value="${financePlatformData.withdrawMoney}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>借款信用额度：</td>
			<td>
				<input name="borrowerCredit" value="${financePlatformData.borrowerCredit}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>可用信用额度：</td>
			<td>
				<input name="availableCredit" value="${financePlatformData.availableCredit}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${financePlatformData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${financePlatformData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:445px" readonly="readonly">${financePlatformData.remark}</textarea></td>
		</tr>
	</table>
</form>
