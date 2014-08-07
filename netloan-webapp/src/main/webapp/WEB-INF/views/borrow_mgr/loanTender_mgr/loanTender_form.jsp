<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:10px">
	<table class="formtable">
		<tr>
			<td style="width: 250px">标种类型名称：</td>
			<td>
				<input type="hidden" id="loanTender_mgr_loanTender_form_loanTenderId" name="loanTenderId" value="${loanTenderData.loanTenderId}" />
				<input id="loanTender_mgr_loanTender_form_loanrTenderName" name="loanrTenderName" style="width:198px" value="${loanTenderData.loanrTenderName}" class="easyui-validatebox spinner"  required="true"  validType="length[1,25]" invalidMessage="招聘管理主题必须在1到25个字符之间"/>
			</td>
			<td>状态：</td>
			<td>
				<input id="loanTender_mgr_loanTender_form_state" name="state" value="${loanTenderData.state}" class="easyui-combobox" style="height:18px;width:200px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.state"/>
			</td>
		</tr>
		<tr>
			<td>最小借款额度：</td>
			<td><input id="loanTender_mgr_loanTender_form_lowestLoanAmount" name="lowestLoanAmount" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.lowestLoanAmount}"/></td>
			<td>最大借款额度：</td>
			<td><input id="loanTender_mgr_loanTender_form_largestLoanAmount" name="largestLoanAmount" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.largestLoanAmount}"/></td>
		</tr>
		<tr>
			<td>借款金额倍数：</td>
			<td><input id="loanTender_mgr_loanTender_form_loanMoneyMultiple" name="loanMoneyMultiple" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.loanMoneyMultiple}"/></td>
			<td>最小年利率：</td>
			<td><input id="loanTender_mgr_loanTender_form_lowestApr" name="lowestApr" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.lowestApr}"/></td>
		</tr>
		<tr>
			<td>最大年利率：</td>
			<td><input id="loanTender_mgr_loanTender_form_largestApr" name="largestApr" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.largestApr}"/></td>
			<td>借款期限(月标)：</td>
			<td><input id="loanTender_mgr_loanTender_form_loanDeadlinesMon" name="loanDeadlinesMon" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.loanDeadlinesMon}"/></td>
		</tr>
		<tr>
			<td>借款期限(天标)：</td>
			<td><input id="loanTender_mgr_loanTender_form_loanDeadlinesDay" name="loanDeadlinesDay" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.loanDeadlinesDay}"/></td>
			<td>筹标期限：</td>
			<td><input id="loanTender_mgr_loanTender_form_waitBidDeadlines" name="waitBidDeadlines" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.waitBidDeadlines}"/></td>
		</tr>
		<tr>
			<td>最低投标金额：</td>
			<td><input id="loanTender_mgr_loanTender_form_lowestBidMoney" name="lowestBidMoney" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.lowestBidMoney}"/></td>
			<td>最高投标金额：</td>
			<td><input id="loanTender_mgr_loanTender_form_largestBidMoney" name="largestBidMoney" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.largestBidMoney}"/></td>
		</tr>
		<tr>
			<td>是否有投标奖励：</td>
			<td><input id="loanTender_mgr_loanTender_form_isBidReward" name="isBidReward" value="${loanTenderData.isBidReward}" class="easyui-combobox" style="height:18px;width:200px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.yesOrNo"/></td>
			<td>是否设置投标密码：</td>
			<td><input id="loanTender_mgr_loanTender_form_isBidPwd" name="isBidPwd" value="${loanTenderData.isBidPwd}" class="easyui-combobox" style="height:18px;width:200px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.yesOrNo"/></td>
		</tr>
		<tr>
			<td>最低奖励比例：</td>
			<td><input id="loanTender_mgr_loanTender_form_lowestRewardPro" name="lowestRewardPro" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.lowestRewardPro}"/></td>
			<td>最高奖励比例：</td>
			<td><input id="loanTender_mgr_loanTender_form_largestRewardPro" name="largestRewardPro" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.largestRewardPro}"/></td>
		</tr>
		<tr>
			<td>最低奖励金额：</td>
			<td><input id="loanTender_mgr_loanTender_form_lowestRewardMoney" name="lowestRewardMoney" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.lowestRewardMoney}"/></td>
			<td>最高奖励金额：</td>
			<td><input id="loanTender_mgr_loanTender_form_largestRewardMoney" name="largestRewardMoney" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.largestRewardMoney}"/></td>
		</tr>
		<tr>
			<td>Vip冻结保证金：</td>
			<td><input id="loanTender_mgr_loanTender_form_vipFreezeBail" name="vipFreezeBail" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.vipFreezeBail}"/></td>
			<td>普通会员冻结保证金：</td>
			<td><input id="loanTender_mgr_loanTender_form_generalFreezeBail" name="generalFreezeBail" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.generalFreezeBail}"/></td>
		</tr>
		<tr>
			<td>垫付逾期天数（月标）：</td>
			<td><input id="loanTender_mgr_loanTender_form_advOverMonth" name="advOverMonth" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.advOverMonth}"/></td>
			<td>垫付逾期天数（天标）：</td>
			<td><input id="loanTender_mgr_loanTender_form_advOverDay" name="advOverDay" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.advOverDay}"/></td>
		</tr>
		<tr>
			<td>借款管理费(月)：</td>
			<td><input id="loanTender_mgr_loanTender_form_loanManaFeeMonth" name="loanManaFeeMonth" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.loanManaFeeMonth}"/></td>
			<td>借款管理费（天）：</td>
			<td><input id="loanTender_mgr_loanTender_form_loanManaFeeDay" name="loanManaFeeDay" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.loanManaFeeDay}"/></td>
		</tr>
		<tr>
			<td>限定期数：</td>
			<td><input id="loanTender_mgr_loanTender_form_limitedPeriods" name="limitedPeriods" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.limitedPeriods}"/></td>
			<td>超出限定期数每月的借款费：</td>
			<td><input id="loanTender_mgr_loanTender_form_overLimitedFee" name="overLimitedFee" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.overLimitedFee}"/></td>
		</tr>
		<tr>
			<td>是否开启认购模式：</td>
			<td><input id="loanTender_mgr_loanTender_form_subscriptionState" name="subscriptionState" value="${loanTenderData.subscriptionState}" class="easyui-combobox" style="height:18px;width:200px" data-options="valueField:'value',textField : 'label',panelHeight : 'auto',editable : false,data : fields.state"/></td>
			<td>担保机构id：</td>
			<td><input id="loanTender_mgr_loanTender_form_guaranteeAgencyId" name="guaranteeAgencyId" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.guaranteeAgencyId}"/></td>
		</tr>
		<tr>
			<td>反担保方式id：</td>
			<td><input id="loanTender_mgr_loanTender_form_antiGuaranteeId" name="antiGuaranteeId" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.antiGuaranteeId}"/></td>
			<td>备注：</td>
			<td><input id="loanTender_mgr_loanTender_form_remark" name="remark" class="easyui-validatebox spinner" style="width:198px" value="${loanTenderData.remark}"/></td>
		</tr>
		<tr>
			<td>描述：</td>
			<td colspan="3"><textarea id="loanTender_mgr_loanTender_form_description" name="description" style="width:580px;" maxlength="255" class="spinner formta">${loanTenderData.description}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
/* $('#loanTender_mgr_loanTender_form_lowestLoanAmount').numberbox({
		required:true,
		min:0,
		max:99999999,
		precision:0,
		groupSeparator:',',
		missingMessage:'请填写最小借款额度'
	});
$('#loanTender_mgr_loanTender_form_largestLoanAmount').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写最大借款额度'
});
$('#loanTender_mgr_loanTender_form_loanMoneyMultiple').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写金额倍数'
});
$('#loanTender_mgr_loanTender_form_lowestApr').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:2,
	groupSeparator:',',
	missingMessage:'请填写最小年利率'
});
$('#loanTender_mgr_loanTender_form_largestApr').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:2,
	groupSeparator:',',
	missingMessage:'请填写最大年利率'
});
$('#loanTender_mgr_loanTender_form_loanDeadlinesMon').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写借款期限(月标),如:1,2,3,4,5,7,9'
});
$('#loanTender_mgr_loanTender_form_loanDeadlinesDay').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写借款期限(天标),如:1,2,3,4,5'
});
$('#loanTender_mgr_loanTender_form_waitBidDeadlines').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写筹标期限,如:1,2,3,4,5'
});
$('#loanTender_mgr_loanTender_form_lowestBidMoney').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写最低投标金额,如:100,200,500,1000,10000'
});
$('#loanTender_mgr_loanTender_form_largestBidMoney').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写最高投标金额,如:100,200,500,1000,10000'
});
$('#loanTender_mgr_loanTender_form_lowestRewardPro').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写最低奖励比例'
});

$('#loanTender_mgr_loanTender_form_largestRewardPro').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写最高奖励比例'
});
$('#loanTender_mgr_loanTender_form_lowestRewardMoney').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写最低奖励金额'
});
$('#loanTender_mgr_loanTender_form_largestRewardMoney').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写最高奖励金额'
});
$('#loanTender_mgr_loanTender_form_vipFreezeBail').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写vip冻结保证金'
});

$('#loanTender_mgr_loanTender_form_generalFreezeBail').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写普通会员冻结保证金'
});

$('#loanTender_mgr_loanTender_form_advOverMonth').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写垫付逾期天数（月标）'
});

$('#loanTender_mgr_loanTender_form_advOverDay').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写垫付逾期天数（天标）'
});
$('#loanTender_mgr_loanTender_form_loanManaFeeMonth').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写借款管理费(月)'
});
$('#loanTender_mgr_loanTender_form_loanManaFeeDay').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写借款管理费（天）'
});

$('#loanTender_mgr_loanTender_form_limitedPeriods').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写限定期数'
});

$('#loanTender_mgr_loanTender_form_overLimitedFee').numberbox({
	required:true,
	min:0,
	max:99999999,
	precision:0,
	groupSeparator:',',
	missingMessage:'请填写超出限定期数每月的借款费'
}); */

</script>