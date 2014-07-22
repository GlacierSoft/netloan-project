<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>借款标题:</td>
			<td colspan="3"><input  class="spinner" style="width:458px"  value="${receivablesNotesData.loanTitle}" readonly="readonly"/></td>
		 </tr>
		<tr>
			<td width="80px">收款总金额：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loanReviewId" value="${receivablesNotesData.receNotesId}" />
				<input class="spinner" style="width:168px"  value="${receivablesNotesData.receivablesTotal}" readonly="readonly"/></td>
			<td width="100px">收款人：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.memberDisplay}" readonly="readonly"/></td>
		</tr>
		
		<tr>
			<td>应收本金：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.shouldRecePrincipal}" readonly="readonly"/></td>
			<td>已收本金：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.alrRecePrincipal}" readonly="readonly"/></td>
		</tr>
		
		<tr>
			<td>未收本金：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.notRecePrincipal}" readonly="readonly"/></td>
			<td>应收利息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.shouldReceInterest}" readonly="readonly"/></td>
		</tr>
		
			<tr>
			<td>已收利息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.alrReceInterest}" readonly="readonly"/></td>
			<td>未收利息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.notReceInterest}" readonly="readonly"/></td>
		</tr>
		
		
		<tr>
			<td>应收本息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.shouldReceMoney}" readonly="readonly"/></td>
			<td>已收本息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.alrReceMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>未收本息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.notReceMoney}" readonly="readonly"/></td>
			<td>已收逾期罚息：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.alrOverdueInterest}" readonly="readonly"/></td>
		</tr>
			<tr>
			<td>利息管理费：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.interestManaFee}" readonly="readonly"/></td>
			<td>收益：</td>
			<td><input  class="spinner" style="width:168px"  value="${receivablesNotesData.income}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>收款状态：</td>
			<td><input id="detailtable_receState" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px" value="${receivablesNotesData.remark}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createrDisplay" name="createrDisplay" class="spinner" style="width:168px" value="${receivablesNotesData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createTime" name="createTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${receivablesNotesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		<tr>
			<td>最后更新人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updaterDisplay" name="updaterDisplay" class="spinner" style="width:168px" value="${receivablesNotesData.updaterDisplay}" readonly="readonly"/></td>
			<td>最后更新时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updateTime" name="updateTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${receivablesNotesData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#detailtable_receState').val(renderGridValue('${receivablesNotesData.receState}',fields.receState));
</script>