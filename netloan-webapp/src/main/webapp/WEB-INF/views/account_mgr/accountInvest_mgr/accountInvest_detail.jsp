<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>投资ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="tenderNotesId" value="${accountInvestData.investId}" />
				<input class="spinner" style="width:168px" value="${fn:substring(accountInvestData.investId,0,8) }....."  readonly="readonly" title="投标人ID:${accountInvestData.investId}"/>
			</td>
			<td>投资待收金额：</td>
			<td>
				<input name="sumUncollected" value="${accountInvestData.sumUncollected}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>投资奖励金额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestData.sumReward}" readonly="readonly"/></td>
			<td>借款人罚款金额：</td>
			<td>
				<input name="sumFine" value="${accountInvestData.sumFine}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>借款成功总额：</td>
			<td><input class="spinner" style="width:168px"  value="${accountInvestData.sumBorrow}" readonly="readonly"/></td>
			<td>借款管理费总额：</td>
			<td><input class="spinner" style="width:168px"  value="${accountInvestData.sumAdvfee}"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款利息总额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestData.sumInterest}" readonly="readonly"/></td>
		    <td>借款罚息总额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestData.sumInterestfee}"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${accountInvestData.creater}" readonly="readonly"/></td>
		     <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${accountInvestData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			 <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${accountInvestData.updater}" readonly="readonly"/></td>
		     <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${accountInvestData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
	</table>
</form>
	

