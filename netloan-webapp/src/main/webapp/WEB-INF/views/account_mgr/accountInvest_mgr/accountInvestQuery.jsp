<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib  prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>


<form method="post" style="padding:15px">
	<table class="detailtable">
	<c:if test="${accountInvestQueryData!=null}">
		<tr>
			<td>投资成功待收金额:</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input class="spinner" style="width:168px" value="${accountInvestQueryData.sumUncollected}" readonly="readonly" />
			</td>
			<td>投资奖励金额：</td>
			<td>
				<input class="spinner" style="width:168px" value="${accountInvestQueryData.sumReward}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>借款人逾期罚款金额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestQueryData.sumFine}" readonly="readonly" /></td>
			<td>用户邀请好友金额：</td>
			<td>
				<input name="sumFine" class="spinner" style="height:18px;width:168px"  value="0.00" readonly="readonly" />
			</td>
		</tr>
		<tr>
			<td>借款成功总额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestQueryData.sumBorrow}" readonly="readonly" /></td>
			<td>借款管理费总额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestQueryData.sumAdvfee}" readonly="readonly" /></td>
		</tr>
		<tr>
			<td>借款利息总额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestQueryData.sumInterest}" readonly="readonly"  /></td>
		    <td>借款罚息总额：</td>
			<td><input class="spinner" style="width:168px" value="${accountInvestQueryData.sumInterestfee}" readonly="readonly" /></td>
		</tr>
	</c:if>
	<c:if test="${accountInvestQueryData==null}">
	   <tr>
			<td>投资成功待收金额:</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input class="spinner" style="width:168px" value="0.00" readonly="readonly" />
			</td>
			<td>投资奖励金额：</td>
			<td>
				<input class="spinner" style="width:168px" value="0.00" readonly="readonly" />
			</td>
		</tr>
		<tr>
			<td>借款人逾期罚款金额：</td>
			<td><input class="spinner" style="width:168px" value="0.00" readonly="readonly" /></td>
			<td>用户邀请好友金额：</td>
			<td>
				<input name="sumFine" class="spinner" style="height:18px;width:168px" value="0.00" readonly="readonly" />
			</td>
		</tr>
		<tr>
			<td>借款成功总额：</td>
			<td><input class="spinner" style="width:168px" value="0.00" readonly="readonly" /></td>
			<td>借款管理费总额：</td>
			<td><input class="spinner" style="width:168px" value="0.00" readonly="readonly"  /></td>
		</tr>
		<tr>
			<td>借款利息总额：</td>
			<td><input class="spinner" style="width:168px" value="0.00" readonly="readonly"  /></td>
		    <td>借款罚息总额：</td>
			<td><input class="spinner" style="width:168px" value="0.00" readonly="readonly" /></td>
		</tr>
	</c:if>
	</table>
</form>
