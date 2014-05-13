<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>第几期：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input class="spinner" style="width:168px"  value="${receivablesNotesDetailData.numberPeriod}" readonly="readonly"/></td>
			<td>还款人：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesDetailData.memberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>应还日期：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatDate value="${receivablesNotesDetailData.shouldPayDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>实还日期：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatDate value="${receivablesNotesDetailData.actualPayDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>应收本息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesDetailData.currentReceMoeny}" readonly="readonly"/></td>
			<td>应收本金：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesDetailData.currentRecePrincipal}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>应收利息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesDetailData.currentReceInterest}" readonly="readonly"/></td>
			<td>剩余本金：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${receivablesNotesDetailData.surplusPrincipal}' pattern='#,#00.00'/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>是否逾期：</td>
			<td><input id="detailtable_isOverdue" class="spinner" style="width:168px" value="${receivablesNotesDetailData.isOverdue}" readonly="readonly"/></td>
			<td>利息管理费：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesDetailData.interestManaFee}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>逾期罚息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesDetailData.overdueInterest}" readonly="readonly"/></td>
			<td>逾期天数：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesDetailData.overdueDays}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>收款状态：</td>
			<td><input id="detailtable_receState" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>收益：</td>
			<td><input class="spinner" style="width:168px" value="${receivablesNotesDetailData.income}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createrDisplay" name="createrDisplay" class="spinner" style="width:198px" value="${receivablesNotesDetailData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createTime" name="createTime" class="spinner" style="width:198px" value="<fmt:formatDate value="${receivablesNotesDetailData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		<tr>
			<td>最后更新人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updaterDisplay" name="updaterDisplay" class="spinner" style="width:198px" value="${receivablesNotesDetailData.updaterDisplay}" readonly="readonly"/></td>
			<td>最后更新时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updateTime" name="updateTime" class="spinner" style="width:198px" value="<fmt:formatDate value="${receivablesNotesDetailData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px" value="${receivablesNotesDetailData.remark}" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#detailtable_receState').val(renderGridValue('${receivablesNotesDetailData.receState}',fields.receDetailState));
	$('#detailtable_isOverdue').val(renderGridValue('${receivablesNotesDetailData.isOverdue}',fields.isOverdue));
</script>