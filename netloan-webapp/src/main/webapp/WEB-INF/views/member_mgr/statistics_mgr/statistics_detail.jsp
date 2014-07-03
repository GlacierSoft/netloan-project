<%@ page language="java" pageEncoding="UTF-8"
	contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding: 15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable">
				<!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  --> <input
				type="hidden" name="roleId" value="${statisticsData.statisticsId}" />
				<input class="spinner" style="width: 168px"
				value="${statisticsData.memberRealName}" readonly="readonly" />
			</td>
			<td>借款总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.totalBorrowings}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>累计亏盈：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.cumulativeLossProfit}" readonly="readonly" /></td>
			<td>已还总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.alreadyTotal}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>待还总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.waitAlsoTotal}" readonly="readonly" /></td>
			<td>借款成功次数：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.borrowSuccess}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>正常还款次数：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.normalRepayment}" readonly="readonly" /></td>
			<td>提前还款次数：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.advanceRepayment}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>逾期还款次数：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.lateRepayment}" readonly="readonly" /></td>
			<td>网站代还次数：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.websiteSubstitute}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>投标成功次数：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.successTender}" readonly="readonly" /></td>
			<td>续投奖励：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.continueAwards}" readonly="readonly" /></td>
			
		 </tr>
		<tr>
			<td>投资总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.investmentTotal}" readonly="readonly" /></td>
			<td>投标奖励：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.tenderAwards}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>已收总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.alreadyIncomeTotal}" readonly="readonly" /></td>
			<td>待收总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.waitIncomeTotal}" readonly="readonly" /></td>
		</tr>

		<tr>
			<td>已还本金：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.alreadyPrincipal}" readonly="readonly" /></td>
			<td>待还本金：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.waitAlsoPrincipal}" readonly="readonly" /></td>
		</tr>

		<tr>
			<td>已还利息：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.alreadyInterest}" readonly="readonly" /></td>
			<td>待还利息：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.waitAlsoInterest}" readonly="readonly" /></td>
		</tr>


		<tr>
			<td>已收本金：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.alreadyIncomePrincipal}" readonly="readonly" /></td>
			<td>待收本金：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.waitIncomePrincipal}" readonly="readonly" /></td>
		</tr>


		<tr>
			<td>已收利息：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.alreadyIncomeInterest}" readonly="readonly" /></td>
			<td>待收利息：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.waitIncomeInterest}" readonly="readonly" /></td>
		</tr>

		<tr>
			<td>逾期罚款金额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.overdueFineAmount}" readonly="readonly" /></td>
			<td>逾期利息总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.overdueInterestAmount}" readonly="readonly" /></td>
		</tr>


		<tr>
			<td>借款管理费：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.loanManagementAmount}" readonly="readonly" /></td>
			<td>借款利息总额：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.loanInterestAmount}" readonly="readonly" /></td>
		</tr>



		<tr>
			<td>推广奖励：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.promotionAwards}" readonly="readonly" /></td>
			<td>线下冲值奖励：</td>
			<td><input class="spinner" style="width: 168px"
				value="${statisticsData.uplineDeltaAwards}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>统计时间：</td>
			<td colspan="3"><input class="spinner" style="width: 444px"
				value="<fmt:formatDate value="${statisticsData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
				readonly="readonly" /></td>
		</tr>
	</table>
</form>
