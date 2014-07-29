<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td> 
			<td class="forminputtable">
				<input type="hidden"  name="financeMemberId" value="${financeMemberData.financeMemberId}" />
				<input name="memberDisplay" class="spinner" style="width:180px" value="${financeMemberData.memberDisplay}" readonly="readonly"></input>
			</td>	
			<td>可用余额：</td>
			<td>
				<input name="usableMoney" value="<fmt:formatNumber value='${financeMemberData.usableMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>冻结金额：</td>
			<td>
				<input name="frozenMoney" value="<fmt:formatNumber value='${financeMemberData.frozenMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
			<td>代收金额：</td>
			<td>
				<input name="collectingMoney" value="<fmt:formatNumber value='${financeMemberData.collectingMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>待还金额：</td>
			<td>
				<input name="refundMoney" value="<fmt:formatNumber value='${financeMemberData.refundMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
			<td>总金额：</td>
			<td>
				<input name="amount" value="<fmt:formatNumber value='${financeMemberData.amount}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>本月充值次数：</td>
			<td>
				<input name="rechargeMonthTimes" value="${financeMemberData.rechargeMonthTimes}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
			<td>充值总次数：</td>
			<td>
				<input name="rechargeTimes" value="${financeMemberData.rechargeTimes}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>充值总金额：</td>
			<td>
				<input name="rechargeMoney" value="<fmt:formatNumber value='${financeMemberData.rechargeMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
			<td>本月提现次数：</td>
			<td>
				<input name="withdrawMonthTimes" value="${financeMemberData.withdrawMonthTimes}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>提现总次数：</td>
			<td>
				<input name="withdrawTimes" value="${financeMemberData.withdrawTimes}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
			<td>提现总金额：</td>
			<td>
				<input name="withdrawMoney" value="<fmt:formatNumber value='${financeMemberData.withdrawMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
		</tr> 
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${financeMemberData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financeMemberData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${financeMemberData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financeMemberData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:465px" readonly="readonly">${financeMemberData.remark}</textarea></td>
		</tr>
	</table>
</form>
