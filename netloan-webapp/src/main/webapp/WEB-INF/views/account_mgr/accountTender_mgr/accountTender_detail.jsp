<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>投标用户：</td>
			<td>
				<input name="memberDisplay" value="${accountTenderData.memberDisplay}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
		    <td>投标总额：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${accountTenderData.tenderMoney}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款标题：</td>
			<td><input class="spinner" style="width:168px" value="${accountTenderData.loanTitle}" readonly="readonly"/></td>
			<td>借款用户：</td>
			<td>
				<input name="loanMemberDisplay" value="${accountTenderData.loanMemberDisplay}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
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
			<td>会员积分：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${accountTenderData.creditIntegral}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>发布时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate  value="${accountTenderData.loanDate}" pattern="yyyy-MM-dd HH:mm:ss"/>"   readonly="readonly"/></td>
		</tr>
		<tr>
			 <td>借款百分比：</td>
			 <td><input class="spinner" style="width:168px"   value="${accountTenderData.alrTenderPro}" readonly="readonly"/></td>
		     <td>备注：</td>
			 <td ><input class="spinner" style="width:168px"   value="${accountTenderData.remark}" readonly="readonly"/></td>
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
	 </table>
</form>
<script type="text/javascript">
    $('#account_mgr_tender_form_loanState').val(renderGridValue('${accountTenderData.loanState}',fields.loanState));
</script>
	

