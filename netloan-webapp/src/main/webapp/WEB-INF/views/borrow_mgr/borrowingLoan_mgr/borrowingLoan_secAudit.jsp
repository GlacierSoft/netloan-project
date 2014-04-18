<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div style="padding:15px">
<table class=detailtable>
	<tr>
		<td>借款编号：</td>
		<td>
			<input type="hidden" id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanId" name="loanId" value="${borrowingLoanData.loanId}" />
			<input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanCode" name="loanCode" class="spinner" style="width:198px" value="${borrowingLoanData.loanCode}" readonly="readonly"/>
		</td>
		<td>借款人：</td>
		<td>
			<input id="borrowingLoan_mgr_borrowingLoan_firstAudit_memberId" name="memberId" class="spinner" style="width:198px" value="${borrowingLoanData.memberId}" readonly="readonly"/>
		</td>
	</tr>
	<tr>
		<td>借款标题：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanTitle" name="loanTitle" class="spinner" style="width:198px" value="${borrowingLoanData.loanTitle}" readonly="readonly"/></td>
		<td>借款图片：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanPicture" name="loanPicture" class="spinner" style="width:198px" value="${borrowingLoanData.loanPicture}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>借款标的：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanTenderId" name="loanTenderId" class="spinner" style="width:198px" value="${borrowingLoanData.loanTenderId}" readonly="readonly"/></td>
		<td>借款目的：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanPurposeId" name="loanPurposeId" class="spinner" style="width:198px" value="${borrowingLoanData.loanPurposeId}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>借款期限：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanDeadlinesId" name="loanDeadlinesId" class="spinner" style="width:198px" value="${borrowingLoanData.loanDeadlinesId}" readonly="readonly"/></td>
		<td>流标原因：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_failedReason" name="failedReason" class="spinner" style="width:198px" value="${borrowingLoanData.failedReason}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>置为天标：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_isDayMarked" name="isDayMarked" class="spinner" style="width:198px" value="${borrowingLoanData.isDayMarked}" readonly="readonly"/></td>
		<td>是否有投标奖励：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_isBidReward" name="isBidReward" class="spinner" style="width:198px" value="${borrowingLoanData.isBidReward}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>按投标金额比例奖励：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_bidProReward" name="bidProReward" class="spinner" style="width:198px" value="${borrowingLoanData.bidProReward}" readonly="readonly"/></td>
		<td>按固定金额分摊奖励：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_fixedAppReward" name="fixedAppReward" class="spinner" style="width:198px" value="${borrowingLoanData.fixedAppReward}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>是否有投标待收限制：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_isBidMarked" name="isBidMarked" class="spinner" style="width:198px" value="${borrowingLoanData.isBidMarked}" readonly="readonly"/></td>
		<td>待收金额设置：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_readyRecMoney" name="readyRecMoney" class="spinner" style="width:198px" value="${borrowingLoanData.readyRecMoney}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>是否设置投标密码：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_isBidPwd" name="isBidPwd" class="spinner" style="width:198px" value="${borrowingLoanData.isBidPwd}" readonly="readonly"/></td>
		<td>投标密码：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_bidPwd" name="bidPwd" class="spinner" style="width:198px" value="${borrowingLoanData.bidPwd}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>借款管理费：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanManagementFees" name="loanManagementFees" class="spinner" style="width:198px" value="${borrowingLoanData.loanManagementFees}" readonly="readonly"/></td>
		<td>还款方式：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_repaymentTypeId" name="repaymentTypeId" class="spinner" style="width:198px" value="${borrowingLoanData.repaymentTypeId}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>借款总额：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanTotal" name="loanTotal" class="spinner" style="width:198px" value="${borrowingLoanData.loanTotal}" readonly="readonly"/></td>
		<td>年利率：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanApr" name="loanApr" class="spinner" style="width:198px" value="${borrowingLoanData.loanApr}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>最低投标金额：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_lowestBidMoney" name="lowestBidMoney" class="spinner" style="width:198px" value="${borrowingLoanData.lowestBidMoney}" readonly="readonly"/></td>
		<td>最高投标金额：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_largestBidMoney" name="largestBidMoney" class="spinner" style="width:198px" value="${borrowingLoanData.largestBidMoney}" readonly="readonly"/></td>
	</tr>
	<tr>
		<td>最小认购单位(元)：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_lowestSub" name="lowestSub" class="spinner" style="width:198px" value="${borrowingLoanData.lowestSub}" readonly="readonly"/></td>
		<td>认购总份数：</td>
		<td><input id="borrowingLoan_mgr_borrowingLoan_firstAudit_subTotal" name="subTotal" class="spinner" style="width:198px" value="${borrowingLoanData.subTotal}" readonly="readonly"/></td>
	</tr>
</table>
</div>
<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>复审审核状态：</td>
			<td><input type="hidden" id="borrowingLoan_mgr_borrowingLoan_secondAudit_loanId" name="loanId" value="${borrowingLoanData.loanId}" />
				<input type="hidden" id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanCode" name="loanCode" value="${borrowingLoanData.loanCode}"/>
				<input id="borrowingLoan_mgr_borrowingLoan_secondAudit_secondAuditState" name="secondAuditState" type="radio" value="secondSucess" /><span>复审通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="borrowingLoan_mgr_borrowingLoan_secondAudit_secondAuditState" name="secondAuditState" type="radio" value="secondFailure"  checked="checked"/><span>复审失败</span></td>
		</tr>
		<tr>
			<td>复审站内信通知：</td>
			<td><textarea id="borrowingLoan_mgr_borrowingLoan_secondAudit_secondMesNotice" name="secondMesNotice" style="width:198px;" maxlength="255" class="spinner formta">${borrowingLoanData.secondMesNotice}</textarea></td>
			<td>复审处理意见：</td>
			<td><textarea id="borrowingLoan_mgr_borrowingLoan_secondAudit_secondAdvice" name="secondAdvice" style="width:198px;" maxlength="255" class="spinner formta">${borrowingLoanData.secondAdvice}</textarea></td>
		</tr>
	</table>
</form>