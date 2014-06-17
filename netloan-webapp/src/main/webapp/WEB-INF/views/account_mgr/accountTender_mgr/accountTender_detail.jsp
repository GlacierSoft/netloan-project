<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>投标ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="tenderNotesId" value="${accountTenderData.tenderNotesId}" />
				<input class="spinner" style="width:168px" value="${fn:substring(accountTenderData.tenderNotesId,0,8) }....."  readonly="readonly" title="投标人ID:${accountTenderData.tenderNotesId}"/>
			</td>
			<td>投标用户：</td>
			<td>
				<input name="memberDisplay" value="${accountTenderData.memberDisplay}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>借款标题：</td>
			<td><input class="spinner" style="width:168px" value="${accountTenderData.loanTitle}" readonly="readonly"/></td>
			<td>借款用户：</td>
			<td>
				<input name="loanMemberDisplay" value="${accountTenderData.loanMemberDisplay}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>借款类型：</td>
			<td><input class="spinner" style="width:168px"  value="${accountTenderData.loanTenderDisplay}" readonly="readonly"/></td>
			<td>还款方式：</td>
			<td><input class="spinner" style="width:168px"  value="${accountTenderData.repaymentTypeDisplay}"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款状态：</td>
			<td><input id="account_mgr_tender_form_loanState" class="spinner" style="width:168px" value="${accountTenderData.loanState}" readonly="readonly"/></td>
		    <td>年利率：</td>
			<td><input class="spinner" style="width:168px" value="${accountTenderData.loanApr}"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款百分比：</td>
			<td><input class="spinner" style="width:168px"   value="${accountTenderData.alrTenderPro}" readonly="readonly"/></td>
		     <td>还款期限：</td>
			 <td><input class="spinner" style="width:168px"  value="${accountTenderData.loanDeadlinesId}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>认购单位(MIN)：</td>
			<td><input class="spinner" style="width:168px"   value="${accountTenderData.lowestSub}" readonly="readonly"/></td>
		     <td>认购总数：</td>
			 <td><input class="spinner" style="width:168px"  value="${accountTenderData.subTotal}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>发布时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate  value="${accountTenderData.loanDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"   readonly="readonly"/></td>
		     <td>会员积分：</td>
			 <td><input class="spinner" style="width:168px"  value="${accountTenderData.creditIntegral}" readonly="readonly"/></td>
		</tr>
		<tr>
			 <td>借款百分比：</td>
			 <td><input class="spinner" style="width:168px"   value="${accountTenderData.alrTenderPro}" readonly="readonly"/></td>
		     <td>投标总额：</td>
			 <td><input class="spinner" style="width:168px"  value="${accountTenderData.tenderMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${accountTenderDate.createrDisplay}"  title="创建人:${accountTenderData.createrDisplay}" readonly="readonly"/></td>
		     <td>创建时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate  value="${accountTenderData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px"   value="${accountTenderData.updaterDisplay}" readonly="readonly"/></td>
		     <td>更新人时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate  value="${accountTenderData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:420px" readonly="readonly">${accountTenderData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
    $('#account_mgr_tender_form_loanState').val(renderGridValue('${accountTenderData.loanState}',fields.loanState));
</script>
	

