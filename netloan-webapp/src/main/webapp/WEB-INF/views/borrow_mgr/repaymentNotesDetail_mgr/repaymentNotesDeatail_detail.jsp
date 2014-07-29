<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>还款标题:</td>
			<td colspan="3"><input  class="spinner" style="width:444px"  value="${repaymentNotesDetailData.loanTitle}" readonly="readonly"/></td>
			 
		<tr>
			<td>第几期：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loanReviewId" value="${repaymentNotesDetailData.repayNotesDetailId}" />
				<input class="spinner" style="width:168px"  value="${repaymentNotesDetailData.numberPeriod}" readonly="readonly"/></td>
			<td>还款人：</td>
			<td><input  class="spinner" style="width:168px"  value="${repaymentNotesDetailData.memberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>应还日期：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatDate value="${repaymentNotesDetailData.shouldPayDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>实还日期：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatDate value="${repaymentNotesDetailData.actualPayDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>应还本息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.currentPayMoeny}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>应还本金：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.currentPayPrincipal}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>应还利息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.currentPayInterest}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>实还本息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.actualPayMoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>总还款金额：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.alsoNeedMoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>逾期罚息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.overdueInterest}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>逾期催收费：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.overdueUrgeFee}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>逾期管理费：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesDetailData.overdueManaFee}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>逾期天数：</td>
			<td><input id="" value="${repaymentNotesDetailData.overdueDays}" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>是否逾期：</td>
			<td><input id="detailtable_isOverdue" class="spinner" style="width:168px" value="${repaymentNotesDetailData.isOverdue}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>还款状态：</td>
			<td><input id="detailtable_repayDetailState"  class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>是否网站代还：</td>
			<td><input id="detailtable_isAdvances"  class="spinner" style="width:168px" value="${repaymentNotesDetailData.isAdvances}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createrDisplay" name="createrDisplay" class="spinner" style="width:168px" value="${repaymentNotesDetailData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createTime" name="createTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${repaymentNotesDetailData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		<tr>
			<td>最后更新人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updaterDisplay" name="updaterDisplay" class="spinner" style="width:168px" value="${repaymentNotesDetailData.updaterDisplay}" readonly="readonly"/></td>
			<td>最后更新时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updateTime" name="updateTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${repaymentNotesDetailData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><input class="spinner" style="width:444px" value="${repaymentNotesDetailData.remark}" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#detailtable_repayDetailState').val(renderGridValue('${repaymentNotesDetailData.repayState}',fields.repayDetailState));
	$('#detailtable_isAdvances').val(renderGridValue('${repaymentNotesDetailData.isAdvances}',fields.isAdvances));
	$('#detailtable_isOverdue').val(renderGridValue('${repaymentNotesDetailData.isOverdue}',fields.isOverdue));
</script>