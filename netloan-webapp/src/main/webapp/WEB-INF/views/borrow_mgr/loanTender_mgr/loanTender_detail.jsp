<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>标种类型名称：</td>
			<td>
				<input type="hidden" id="loanTender_mgr_loanTender_detail_loanTenderId" name="loanTenderId" value="${loanTenderData.loanTenderId}" />
				<input id="loanTender_mgr_loanTender_detail_loanrTenderName" name="loanrTenderName" style="width:198px" value="${loanTenderData.loanrTenderName}" class="spinner" readonly="readonly"/>
			</td>
			<td>状态：</td>
			<td>
				<input id="loanTender_mgr_loanTender_detail_state" class="spinner" style="height:18px;width:200px" readonly="readonly" />
			</td>
		</tr>
		<tr>
			<td>最大借款额度：</td>
			<td><input id="loanTender_mgr_loanTender_detail_lowestLoanAmount" name="lowestLoanAmount" class="spinner" style="width:198px" value="${loanTenderData.lowestLoanAmount}" readonly="readonly"/></td>
			<td>最大借款额度：</td>
			<td><input id="loanTender_mgr_loanTender_detail_largestLoanAmount" name="largestLoanAmount" class="spinner" style="width:198px" value="${loanTenderData.largestLoanAmount}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款金额倍数：</td>
			<td><input id="loanTender_mgr_loanTender_detail_loanMoneyMultiple" name="loanMoneyMultiple" class="spinner" style="width:198px" value="${loanTenderData.loanMoneyMultiple}" readonly="readonly"/></td>
			<td>最小年利率：</td>
			<td><input id="loanTender_mgr_loanTender_detail_lowestApr" name="lowestApr" class="spinner" style="width:198px" value="${loanTenderData.lowestApr}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>最大年利率：</td>
			<td><input id="loanTender_mgr_loanTender_detail_largestApr" name="largestApr" class="spinner" style="width:198px" value="${loanTenderData.largestApr}" readonly="readonly"/></td>
			<td>借款期限(月标)：</td>
			<td><input id="loanTender_mgr_loanTender_detail_loanDeadlinesMon" name="loanDeadlinesMon" class="spinner" style="width:198px" value="${loanTenderData.loanDeadlinesMon}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款期限(天标)：</td>
			<td><input id="loanTender_mgr_loanTender_detail_loanDeadlinesDay" name="loanDeadlinesDay" class="spinner" style="width:198px" value="${loanTenderData.loanDeadlinesDay}" readonly="readonly"/></td>
			<td>筹标期限：</td>
			<td><input id="loanTender_mgr_loanTender_detail_waitBidDeadlines" name="waitBidDeadlines" class="spinner" style="width:198px" value="${loanTenderData.waitBidDeadlines}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>最低投标金额：</td>
			<td><input id="loanTender_mgr_loanTender_detail_lowestBidMoney" name="lowestBidMoney" class="spinner" style="width:198px" value="${loanTenderData.lowestBidMoney}" readonly="readonly"/></td>
			<td>最高投标金额：</td>
			<td><input id="loanTender_mgr_loanTender_detail_largestBidMoney" name="largestBidMoney" class="spinner" style="width:198px" value="${loanTenderData.largestBidMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>是否有投标奖励：</td>
			<td><input id="loanTender_mgr_loanTender_detail_isBidReward" class="spinner" style="width:198px" readonly="readonly"/></td>
			<td>是否设置投标密码：</td>
			<td><input id="loanTender_mgr_loanTender_detail_isBidPwd" class="spinner" style="width:198px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>最低奖励比例：</td>
			<td><input id="loanTender_mgr_loanTender_detail_lowestRewardPro" name="lowestRewardPro" class="spinner" style="width:198px" value="${loanTenderData.lowestRewardPro}" readonly="readonly"/></td>
			<td>最高奖励比例：</td>
			<td><input id="loanTender_mgr_loanTender_detail_largestRewardPro" name="largestRewardPro" class="spinner" style="width:198px" value="${loanTenderData.largestRewardPro}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>最低奖励金额：</td>
			<td><input id="loanTender_mgr_loanTender_detail_lowestRewardMoney" name="lowestRewardMoney" class="spinner" style="width:198px" value="${loanTenderData.lowestRewardMoney}" readonly="readonly"/></td>
			<td>最高奖励金额：</td>
			<td><input id="loanTender_mgr_loanTender_detail_largestRewardMoney" name="largestRewardMoney" class="spinner" style="width:198px" value="${loanTenderData.largestRewardMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>Vip冻结保证金：</td>
			<td><input id="loanTender_mgr_loanTender_detail_vipFreezeBail" name="vipFreezeBail" class="spinner" style="width:198px" value="${loanTenderData.vipFreezeBail}" readonly="readonly"/></td>
			<td>普通会员冻结保证金：</td>
			<td><input id="loanTender_mgr_loanTender_detail_generalFreezeBail" name="generalFreezeBail" class="spinner" style="width:198px" value="${loanTenderData.generalFreezeBail}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>垫付逾期天数（月标）：</td>
			<td><input id="loanTender_mgr_loanTender_detail_advOverMonth" name="advOverMonth" class="spinner" style="width:198px" value="${loanTenderData.advOverMonth}" readonly="readonly"/></td>
			<td>垫付逾期天数（天标）：</td>
			<td><input id="loanTender_mgr_loanTender_detail_advOverDay" name="advOverDay" class="spinner" style="width:198px" value="${loanTenderData.advOverDay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款管理费(月)：</td>
			<td><input id="loanTender_mgr_loanTender_detail_loanManaFeeMonth" name="loanManaFeeMonth" class="spinner" style="width:198px" value="${loanTenderData.loanManaFeeMonth}" readonly="readonly"/></td>
			<td>借款管理费（天）：</td>
			<td><input id="loanTender_mgr_loanTender_detail_loanManaFeeDay" name="loanManaFeeDay" class="spinner" style="width:198px" value="${loanTenderData.loanManaFeeDay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>限定期数：</td>
			<td><input id="loanTender_mgr_loanTender_detail_limitedPeriods" name="limitedPeriods" class="spinner" style="width:198px" value="${loanTenderData.limitedPeriods}" readonly="readonly"/></td>
			<td>超出限定期数每月的借款费：</td>
			<td><input id="loanTender_mgr_loanTender_detail_overLimitedFee" name="overLimitedFee" class="spinner" style="width:198px" value="${loanTenderData.overLimitedFee}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>是否开启认购模式：</td>
			<td><input id="loanTender_mgr_loanTender_detail_subscriptionState" class="spinner" style="width:198px"/></td>
			<td>担保机构id：</td>
			<td><input id="loanTender_mgr_loanTender_detail_guaranteeAgencyId" name="guaranteeAgencyId" class="spinner" style="width:198px" value="${loanTenderData.guaranteeAgencyId}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>反担保方式id：</td>
			<td><input id="loanTender_mgr_loanTender_detail_antiGuaranteeId" name="antiGuaranteeId" class="spinner" style="width:198px" value="${loanTenderData.antiGuaranteeId}" readonly="readonly"/></td>
			<td>描述：</td>
			<td><input id="loanTender_mgr_loanTender_detail_remark" name="remark" class="spinner" style="width:198px" value="${loanTenderData.remark}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>描述：</td>
			<td colspan="3"><textarea id="loanTender_mgr_loanTender_detail_description" name="description" style="width:560px;" maxlength="255" class="spinner formta" readonly="readonly">${loanTenderData.description}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#loanTender_mgr_loanTender_detail_state').val(renderGridValue('${loanTenderData.state}',fields.state));
	$('#loanTender_mgr_loanTender_detail_isBidReward').val(renderGridValue('${loanTenderData.isBidReward}',fields.yesOrNo));
	$('#loanTender_mgr_loanTender_detail_isBidPwd').val(renderGridValue('${loanTenderData.isBidPwd}',fields.yesOrNo));
	$('#loanTender_mgr_loanTender_detail_subscriptionState').val(renderGridValue('${loanTenderData.subscriptionState}',fields.state));
</script>