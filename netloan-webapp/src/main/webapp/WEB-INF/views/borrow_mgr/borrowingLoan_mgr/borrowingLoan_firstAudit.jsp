<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div id="borrowingLoan_mgr_borrowingLoan_detail" style="padding:15px">
    <div title="进行初审" style="padding:15px">
    	<fieldset id="borrowingLoan_mgr_borrowingLoan_detail_proceedAudit" style="padding:10px;" class="spinner">
			<legend>进行初审</legend>  
			<form method="post" style="padding:15px">
				<table class="formtable">
					<tr>
						<td>初审审核状态：</td>
						<td><input type="hidden" id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanId" name="loanId" value="${borrowingLoanData.loanId}" />
							<input type="hidden" id="borrowingLoan_mgr_borrowingLoan_firstAudit_loanCode" name="loanCode" value="${borrowingLoanData.loanCode}"/>
							<input id="borrowingLoan_mgr_borrowingLoan_firstAudit_firstAuditState" name="firstAuditState" type="radio" value="firstSucess" /><span>初审通过</span>
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input id="borrowingLoan_mgr_borrowingLoan_firstAudit_firstAuditState" name="firstAuditState" type="radio" value="firstFailure"  checked="checked"/><span>初审失败</span></td>
					</tr>
					<tr>
						<td>初审处理意见：</td>
						<td colspan="3"><textarea id="borrowingLoan_mgr_borrowingLoan_firstAudit_firstAdvice" name="firstAdvice" style="width:512px;" maxlength="255" class="spinner formta">${borrowingLoanData.firstAdvice}</textarea></td>
					</tr>
					<tr>
						<td>初审站内信通知：</td>
						<td colspan="3"><textarea id="borrowingLoan_mgr_borrowingLoan_firstAudit_firstMesNotice" name="firstMesNotice" style="width:512px;" maxlength="255" class="spinner formta">${borrowingLoanData.firstMesNotice}</textarea></td>
					</tr>
				</table>
			</form>
		</fieldset>
    </div>
	<div title="基本信息" style="padding:15px">
		<fieldset id="borrowingLoan_mgr_borrowingLoan_detail_Basic" style="padding:10px;" class="spinner">
			<legend>基本信息</legend>  
			<table  class=detailtable>
				<tr>
					<td>借款编号：</td>
					<td>
						<input type="hidden" id="borrowingLoan_mgr_borrowingLoan_detail_loanId" name="loanId" value="${borrowingLoanData.loanId}" readonly="readonly"/>
						<input id="borrowingLoan_mgr_borrowingLoan_detail_loanCode" name="loanCode" class="spinner" style="width:198px" value="${borrowingLoanData.loanCode}" readonly="readonly"/>
					</td>
					<td>借款人：</td>
					<td>
						<input id="borrowingLoan_mgr_borrowingLoan_detail_memberDisplay" name="memberDisplay" class="spinner" style="width:198px" value="${borrowingLoanData.memberDisplay}" readonly="readonly"/>
					</td>
				</tr>
				<tr>
					<td>借款标题：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanTitle" name="loanTitle" class="spinner" style="width:198px" value="${borrowingLoanData.loanTitle}" readonly="readonly"/></td>
					<td>借款图片：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanPicture" name="loanPicture" class="spinner" style="width:198px" value="${borrowingLoanData.loanPicture}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>借款标的：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanTenderDisplay" name="loanTenderDisplay" class="spinner" style="width:198px" value="${borrowingLoanData.loanTenderDisplay}" readonly="readonly"/></td>
					<td>借款目的：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanPurposeId" name="loanPurposeId" class="spinner" style="width:198px" value="${borrowingLoanData.loanPurposeId}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>借款期限：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanDeadlinesId" name="loanDeadlinesId" class="spinner" style="width:198px" value="${borrowingLoanData.loanDeadlinesId}" readonly="readonly"/></td>
					<td>流标原因：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_failedReason" name="failedReason" class="spinner" style="width:198px" value="${borrowingLoanData.failedReason}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>置为天标：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isDayMarked" name="isDayMarked" class="spinner" style="width:198px" value="${borrowingLoanData.isDayMarked}" readonly="readonly"/></td>
					<td>是否有投标奖励：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isBidReward" name="isBidReward" class="spinner" style="width:198px" value="${borrowingLoanData.isBidReward}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>按投标金额比例奖励：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_bidProReward" name="bidProReward" class="spinner" style="width:198px" value="${borrowingLoanData.bidProReward}" readonly="readonly"/></td>
					<td>按固定金额分摊奖励：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_fixedAppReward" name="fixedAppReward" class="spinner" style="width:198px" value="${borrowingLoanData.fixedAppReward}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>是否有投标待收限制：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isBidMarked" name="isBidMarked" class="spinner" style="width:198px" value="${borrowingLoanData.isBidMarked}" readonly="readonly"/></td>
					<td>待收金额设置：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_readyRecMoney" name="readyRecMoney" class="spinner" style="width:198px" value="${borrowingLoanData.readyRecMoney}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>是否设置投标密码：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isBidPwd" name="isBidPwd" class="spinner" style="width:198px" value="${borrowingLoanData.isBidPwd}" readonly="readonly"/></td>
					<td>投标密码：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_bidPwd" name="bidPwd" class="spinner" style="width:198px" value="${borrowingLoanData.bidPwd}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>借款管理费：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanManagementFees" name="loanManagementFees" class="spinner" style="width:198px" value="${borrowingLoanData.loanManagementFees}" readonly="readonly"/></td>
					<td>还款方式：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_repaymentTypeId" name="repaymentTypeId" class="spinner" style="width:198px" value="${borrowingLoanData.repaymentTypeId}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>借款总额：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanTotal" name="loanTotal" class="spinner" style="width:198px" value="${borrowingLoanData.loanTotal}" readonly="readonly"/></td>
					<td>年利率：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanApr" name="loanApr" class="spinner" style="width:198px" value="${borrowingLoanData.loanApr}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>创建人：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createrDisplay" name="createrDisplay" class="spinner" style="width:198px" value="${borrowingLoanData.createrDisplay}" readonly="readonly"/></td>
					<td>创建时间：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createTime" name="createTime" class="spinner" style="width:198px" value="<fmt:formatDate value="${borrowingLoanData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
				<tr>
					<td>最后更新人：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updaterDisplay" name="updaterDisplay" class="spinner" style="width:198px" value="${borrowingLoanData.updaterDisplay}" readonly="readonly"/></td>
					<td>最后更新时间：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updateTime" name="updateTime" class="spinner" style="width:198px" value="<fmt:formatDate value="${borrowingLoanData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
				</tr>
			</table>
		</fieldset>
    </div>
    <div title="认购信息" style="padding:15px">
    	<fieldset id="borrowingLoan_mgr_borrowingLoan_detail_Tender" style="padding:10px;" class="spinner">
			<legend>认购信息</legend>  
			<table  class="detailtable">
				<tr>
					<td>最低投标金额：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_lowestBidMoney" name="lowestBidMoney" class="spinner" style="width:198px" value="${borrowingLoanData.lowestBidMoney}" readonly="readonly"/></td>
					<td>最高投标金额：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_largestBidMoney" name="largestBidMoney" class="spinner" style="width:198px" value="${borrowingLoanData.largestBidMoney}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>最小认购单位(元)：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_lowestSub" name="lowestSub" class="spinner" style="width:198px" value="${borrowingLoanData.lowestSub}" readonly="readonly"/></td>
					<td>认购总份数：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_subTotal" name="subTotal" class="spinner" style="width:198px" value="${borrowingLoanData.subTotal}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>已认购份数：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_alrSubSum" name="alrSubSum" class="spinner" style="width:198px" value="${borrowingLoanData.alrSubSum}" readonly="readonly"/></td>
					<td>已完成投标比例：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_alrTenderPro" name="alrTenderPro" class="spinner" style="width:198px" value="${borrowingLoanData.alrTenderPro}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>投标数量：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_tenderSum" name="tenderSum" class="spinner" style="width:198px" value="${borrowingLoanData.tenderSum}" readonly="readonly"/></td>
					<td>筹标期限：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_waitBidDeadlines" name="waitBidDeadlines" class="spinner" style="width:198px" value="${borrowingLoanData.waitBidDeadlines}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>借款详情：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanDetail" name="loanDetail" class="spinner" style="width:198px" value="${borrowingLoanData.loanDetail}" readonly="readonly"/></td>
					<td>是否公开帐户资金：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isAccountFunds" name="isAccountFunds" class="spinner" style="width:198px" value="${borrowingLoanData.isAccountFunds}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>是否公开借款资金：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isLoanFunds" name="isLoanFunds" class="spinner" style="width:198px" value="${borrowingLoanData.isLoanFunds}" readonly="readonly"/></td>
					<td>是否公开信用额度：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isCreditAmount" name="isCreditAmount" class="spinner" style="width:198px" value="${borrowingLoanData.isCreditAmount}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>是否公开投标资金：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isBidFunds" name="isBidFunds" class="spinner" style="width:198px" value="${borrowingLoanData.isBidFunds}" readonly="readonly"/></td>
					<td>是否允许自动投标：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isAutomaticBid" name="isAutomaticBid" class="spinner" style="width:198px" value="${borrowingLoanData.isAutomaticBid}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>是否设为推荐：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_isRecommend" name="isRecommend" class="spinner" style="width:198px" value="${borrowingLoanData.isRecommend}" readonly="readonly"/></td>
					<td>借款日期：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanDate" name="loanDate" class="spinner" style="width:198px" value="<fmt:formatDate value="${borrowingLoanData.loanDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>备注：</td>
					<td colspan="3"><input id="borrowingLoan_mgr_borrowingLoan_detail_remark" name="remark" class="spinner" style="width:512px" value="${borrowingLoanData.remark}" readonly="readonly"/></td>
				</tr>
			</table>
		</fieldset>
    </div>
    <div title="审核信息" style="padding:15px">
    	<fieldset id="borrowingLoan_mgr_borrowingLoan_detail_Audit" style="padding:10px;" class="spinner">
			<legend>审核信息</legend>  
			<table  class="detailtable">
				<tr>
					<td>借款状态：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_loanState" name="loanState" class="spinner" style="width:198px" value="${borrowingLoanData.loanState}" readonly="readonly"/></td>
					<td>初审审核状态：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_firstAuditState" name="firstAuditState" class="spinner" style="width:198px" value="${borrowingLoanData.firstAuditState}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>初审审核人：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_firstAuditorDisplay" name="firstAuditorDisplay" class="spinner" style="width:198px" value="${borrowingLoanData.firstAuditorDisplay}" readonly="readonly"/></td>
					<td>初审审核时间：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_firstAuditDate" name="firstAuditDate" class="spinner" style="width:198px" value="<fmt:formatDate value="${borrowingLoanData.firstAuditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>初审处理意见：</td>
					<td colspan="3"><input id="borrowingLoan_mgr_borrowingLoan_detail_firstAdvice" name="firstAdvice" class="spinner" style="width:512px" value="${borrowingLoanData.firstAdvice}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>初审站内信通知：</td>
					<td colspan="3"><input id="borrowingLoan_mgr_borrowingLoan_detail_firstMesNotice" name="firstMesNotice" class="spinner" style="width:512px" value="${borrowingLoanData.firstMesNotice}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>复审审核状态：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_secondAuditState" name="secondAuditState" class="spinner" style="width:198px" value="${borrowingLoanData.secondAuditState}" readonly="readonly"/></td>
					<td>复审审核人：</td>
					<td><input id="borrowingLoan_mgr_borrowingLoan_detail_secondAuditorDisplay" name="secondAuditorDisplay" class="spinner" style="width:198px" value="${borrowingLoanData.secondAuditorDisplay}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>复审审核时间：</td>
					<td colspan="3"><input id="borrowingLoan_mgr_borrowingLoan_detail_secondAuditDate" name="secondAuditDate" class="spinner" style="width:512px" value="<fmt:formatDate value="${borrowingLoanData.secondAuditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>复审处理意见：</td>
					<td colspan="3"><input id="borrowingLoan_mgr_borrowingLoan_detail_secondAdvice" name="secondAdvice" class="spinner" style="width:512px" value="${borrowingLoanData.secondAdvice}" readonly="readonly"/></td>
				</tr>
				<tr>
					<td>复审站内信通知：</td>
					<td colspan="3"><input id="borrowingLoan_mgr_borrowingLoan_detail_secondMesNotice" name="secondMesNotice" class="spinner" style="width:512px" value="${borrowingLoanData.secondMesNotice}" readonly="readonly"/></td>
				</tr>
			</table>
		</fieldset>
    </div>
 </div>  


<script type="text/javascript">
	$('#borrowingLoan_mgr_borrowingLoan_detail').tabs({
		border:false,
		border:true,
		onSelect:function(){
			$("div").remove(".validatebox-tip");//解决关闭窗体偶尔出现验证条bug
		}
	});
	$('#borrowingLoan_mgr_borrowingLoan_detail_failedReason').val(renderGridValue('${borrowingLoanData.failedReason}',fields.failedReason));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isDayMarked').val(renderGridValue('${borrowingLoanData.isDayMarked}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isBidReward').val(renderGridValue('${borrowingLoanData.isBidReward}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isBidMarked').val(renderGridValue('${borrowingLoanData.isBidMarked}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isBidPwd').val(renderGridValue('${borrowingLoanData.isBidPwd}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isAccountFunds').val(renderGridValue('${borrowingLoanData.isAccountFunds}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isLoanFunds').val(renderGridValue('${borrowingLoanData.isLoanFunds}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isCreditAmount').val(renderGridValue('${borrowingLoanData.isCreditAmount}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isBidFunds').val(renderGridValue('${borrowingLoanData.isBidFunds}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isAutomaticBid').val(renderGridValue('${borrowingLoanData.isAutomaticBid}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_isRecommend').val(renderGridValue('${borrowingLoanData.isRecommend}',fields.yesOrNo));
	$('#borrowingLoan_mgr_borrowingLoan_detail_loanState').val(renderGridValue('${borrowingLoanData.loanState}',fields.loanState));
	$('#borrowingLoan_mgr_borrowingLoan_detail_firstAuditState').val(renderGridValue('${borrowingLoanData.firstAuditState}',fields.firstAuditState));
	$('#borrowingLoan_mgr_borrowingLoan_detail_secondAuditState').val(renderGridValue('${borrowingLoanData.secondAuditState}',fields.secondAuditState));
</script>