<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
	
		<tr>
			<td>借款标题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loanReviewId" value="${tenderNotesData.tenderNotesId}" />
				<input class="spinner" style="width:168px"  value="${tenderNotesData.loanTitle}" readonly="readonly"/></td>
			<td>借款人：</td>
			<td><input  class="spinner" style="width:168px"  value="${tenderNotesData.loanMemberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款状态：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
			  	<input class="spinner" id="borrowingLoan_mgr_borrowingLoan_detail_loanState" style="width:168px"  value="${tenderNotesData.loanState}" readonly="readonly"/></td>
			<td>借款总额：</td>
			<td><input  class="spinner" style="width:168px"  value="${tenderNotesData.loanTotal}" readonly="readonly"/></td>
		</tr>
		
		
		<tr>
			<td>最小认购单位：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
			  	<input class="spinner" style="width:168px"  value="${tenderNotesData.lowestSub}" readonly="readonly"/></td>
			<td>认购总份数：</td>
			<td><input  class="spinner" style="width:168px"  value="${tenderNotesData.subTotal}" readonly="readonly"/></td>
		</tr>
		
		
		
		
		
		
		
		
		<tr>
			<td>投标份数：</td>
			<td><input  class="spinner" style="width:168px"  value="${tenderNotesData.subSum}" readonly="readonly"/></td>
		    <td>投标人：</td>
			<td><input  class="spinner" style="width:168px"  value="${tenderNotesData.memberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>投标金额：</td>
			<td><input  class="spinner" style="width:168px"  value="<fmt:formatNumber value='${tenderNotesData.tenderMoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${tenderNotesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><input class="spinner" style="width:425px" value="${tenderNotesData.remark}" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
$('#borrowingLoan_mgr_borrowingLoan_detail_loanState').val(renderGridValue('${tenderNotesData.loanState}',fields.loanState));
</script>
