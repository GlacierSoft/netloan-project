<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>借款标题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loanReviewId" value="${repaymentNotesData.repayNotesId}" />
				<input class="spinner" style="width:168px"  value="${repaymentNotesData.loanTitle}" readonly="readonly"/></td>
			<td>还款人：</td>
			<td><input  class="spinner" style="width:168px"  value="${repaymentNotesData.memberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>还款总金额：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.repaymentTotal}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>应还本金：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.shouldPayPrincipal}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			 </tr>
		<tr>
			 <td>已还本金：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.alrPayPrincipal}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>未还本金：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.notPayPrincipal}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>应还利息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.shouldPayInterest}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>已还利息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.alrPayInterest}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		
		</tr>
		<tr>
				<td>未还利息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.notPayInterest}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
	
			<td>应还本息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.shouldPayMoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>已还本息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.alrPayMoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>未还本息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.notPayMoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>已还逾期罚息：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.alrOverdueInterest}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>已还逾期催收费：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${repaymentNotesData.alrOverdueUrge}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>还款状态：</td>
			<td><input id="detailtable_repayState"  class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px" value="${repaymentNotesData.remark}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createrDisplay" name="createrDisplay" class="spinner" style="width:168px" value="${repaymentNotesData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_createTime" name="createTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${repaymentNotesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		<tr>
			<td>最后更新人：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updaterDisplay" name="updaterDisplay" class="spinner" style="width:168px" value="${repaymentNotesData.updaterDisplay}" readonly="readonly"/></td>
			<td>最后更新时间：</td>
			<td><input id="borrowingLoan_mgr_borrowingLoan_detail_updateTime" name="updateTime" class="spinner" style="width:168px" value="<fmt:formatDate value="${repaymentNotesData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#detailtable_repayState').val(renderGridValue('${repaymentNotesData.repayState}',fields.repayState));
</script>