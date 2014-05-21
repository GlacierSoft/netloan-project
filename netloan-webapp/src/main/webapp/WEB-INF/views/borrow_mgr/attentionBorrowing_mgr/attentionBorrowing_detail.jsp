<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>借款标题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loanReviewId" value="${attentionBorrowingData.attentionBorrowingId}" />
				<input class="spinner" style="width:168px"  value="${attentionBorrowingData.loanTitle}" readonly="readonly"/></td>
			<td>借款款人：</td>
			<td><input  class="spinner" style="width:168px"  value="${attentionBorrowingData.loanMemberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>关注人名称：</td>
			<td><input  class="spinner" style="width:168px"  value="${attentionBorrowingData.memberDisplay}" readonly="readonly"/></td>
			<td>标的类型名称：</td>
			<td><input  class="spinner" style="width:168px"  value="${attentionBorrowingData.loanTenderDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>还款方式：</td>
			<td><input  class="spinner" style="width:168px"  value="${attentionBorrowingData.repaymentTypeDisplay}" readonly="readonly"/></td>
			<td>借款金额：</td>
			<td><input  class="spinner" style="width:168px"  value="${attentionBorrowingData.loanTotal}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>年利率：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${attentionBorrowingData.loanApr}' pattern='#0.00%'/>" readonly="readonly"/></td>
			<td>借款期限：</td>
			<td><input  class="spinner" style="width:168px"  value="${attentionBorrowingData.loanDeadlinesId}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createrDisplay" name="createrDisplay" class="spinner" style="width:198px" value="${attentionBorrowingData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createTime" name="createTime" class="spinner" style="width:198px" value="<fmt:formatDate value="${attentionBorrowingData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		<tr>
			<td>最后更新人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updaterDisplay" name="updaterDisplay" class="spinner" style="width:198px" value="${attentionBorrowingData.updaterDisplay}" readonly="readonly"/></td>
			<td>最后更新时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updateTime" name="updateTime" class="spinner" style="width:198px" value="<fmt:formatDate value="${attentionBorrowingData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px" value="${attentionBorrowingData.remark}" readonly="readonly"/></td>
		</tr>
	</table>
</form>
