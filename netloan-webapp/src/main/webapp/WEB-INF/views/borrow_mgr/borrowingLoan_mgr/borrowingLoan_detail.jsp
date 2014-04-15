<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>借款编号：</td>
			<td>
				<input type="hidden" id="borrowingLoan_mgr_borrowingLoan_detail_loanId" name="loanId" value="${borrowingLoanData.loanId}" />
				<input id="borrowingLoan_mgr_borrowingLoan_detail_loanCode" name="loanCode" class="spinner" style="width:198px" value="${borrowingLoanData.loanCode}" />
			</td>
			<td>借款人：</td>
			<td>
				<input id="borrowingLoan_mgr_borrowingLoan_detail_memberId" name="memberId" class="spinner" style="width:198px" value="${borrowingLoanData.memberId}"/>
			</td>
		</tr>
		<tr>
			<td>借款标题：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanTitle" name="loanTitle" class="spinner" style="width:198px" value="${borrowingLoanData.loanTitle}"/></td>
			<td>借款图片：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanPicture" name="loanPicture" class="spinner" style="width:198px" value="${borrowingLoanData.loanPicture}"/></td>
		</tr>
		<tr>
			<td>借款标的：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanTenderId" name="loanTenderId" class="spinner" style="width:198px" value="${borrowingLoanData.loanTenderId}"/></td>
			<td>借款目的：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanPurposeId" name="loanPurposeId" class="spinner" style="width:198px" value="${borrowingLoanData.loanPurposeId}"/></td>
		</tr>
		<tr>
			<td>借款期限：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanDeadlinesId" name="loanDeadlinesId" class="spinner" style="width:198px" value="${borrowingLoanData.loanDeadlinesId}"/></td>
			<td>流标原因：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_failedReason" name="failedReason" class="spinner" style="width:198px" value="${borrowingLoanData.failedReason}"/></td>
		</tr>
		<tr>
			<td>置为天标：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isDayMarked" name="isDayMarked" class="spinner" style="width:198px" value="${borrowingLoanData.isDayMarked}"/></td>
			<td>是否有投标奖励：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isBidReward" name="isBidReward" class="spinner" style="width:198px" value="${borrowingLoanData.isBidReward}"/></td>
		</tr>
		<tr>
			<td>按投标金额比例奖励：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_bidProReward" name="bidProReward" class="spinner" style="width:198px" value="${borrowingLoanData.bidProReward}"/></td>
			<td>按固定金额分摊奖励：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_fixedAppReward" name="fixedAppReward" class="spinner" style="width:198px" value="${borrowingLoanData.fixedAppReward}"/></td>
		</tr>
		<tr>
			<td>是否有投标待收限制：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isBidMarked" name="isBidMarked" class="spinner" style="width:198px" value="${borrowingLoanData.isBidMarked}"/></td>
			<td>待收金额设置：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_readyRecMoney" name="readyRecMoney" class="spinner" style="width:198px" value="${borrowingLoanData.readyRecMoney}"/></td>
		</tr>
		<tr>
			<td>是否设置投标密码：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isBidPwd" name="isBidPwd" class="spinner" style="width:198px" value="${borrowingLoanData.isBidPwd}"/></td>
			<td>投标密码：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_bidPwd" name="bidPwd" class="spinner" style="width:198px" value="${borrowingLoanData.bidPwd}"/></td>
		</tr>
		<tr>
			<td>借款管理费：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanManagementFees" name="loanManagementFees" class="spinner" style="width:198px" value="${borrowingLoanData.loanManagementFees}"/></td>
			<td>还款方式：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_repaymentTypeId" name="repaymentTypeId" class="spinner" style="width:198px" value="${borrowingLoanData.repaymentTypeId}"/></td>
		</tr>
		<tr>
			<td>借款总额：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanTotal" name="loanTotal" class="spinner" style="width:198px" value="${borrowingLoanData.loanTotal}"/></td>
			<td>年利率：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanApr" name="loanApr" class="spinner" style="width:198px" value="${borrowingLoanData.loanApr}"/></td>
		</tr>
		<tr>
			<td>最低投标金额：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_lowestBidMoney" name="lowestBidMoney" class="spinner" style="width:198px" value="${borrowingLoanData.lowestBidMoney}"/></td>
			<td>最高投标金额：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_largestBidMoney" name="largestBidMoney" class="spinner" style="width:198px" value="${borrowingLoanData.largestBidMoney}"/></td>
		</tr>
		<tr>
			<td>最小认购单位(元)：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_lowestSub" name="lowestSub" class="spinner" style="width:198px" value="${borrowingLoanData.lowestSub}"/></td>
			<td>认购总份数：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_subTotal" name="subTotal" class="spinner" style="width:198px" value="${borrowingLoanData.subTotal}"/></td>
		</tr>
	</table>
</form>