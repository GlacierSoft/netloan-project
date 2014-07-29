<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>投资待收金额：</td>
			<td>
				<input name="sumUncollected" value="<fmt:formatNumber value='${accountInvestData.sumUncollected}' pattern="#,#00.00元"/>" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>投资奖励金额：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatNumber value='${accountInvestData.sumReward}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款人罚款金额：</td>
			<td>
				<input name="sumFine" value="<fmt:formatNumber value='${accountInvestData.sumFine}' pattern="#,#00.00元"/>" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td>借款成功总额：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${accountInvestData.sumBorrow}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款管理费总额：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatNumber value='${accountInvestData.sumAdvfee}' pattern="#,#00.00元"/>"  readonly="readonly"/></td>
		     <td>借款利息总额：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatNumber value='${accountInvestData.sumInterest}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>借款罚息总额：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatNumber value='${accountInvestData.sumInterestfee}' pattern="#,#00.00元"/>"  readonly="readonly"/></td>
		    <td>创建人：</td>
			<td><input class="spinner" style="width:168px"   value="${accountInvestData.createrDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
		    <td>录入时间：</td>
			 <td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${accountInvestData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		     <td>更新人：</td>
			 <td><input class="spinner" style="width:168px"   value="${accountInvestData.updaterDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			 <td>更新时间：</td>
			 <td><input class="spinner" style="width:168px"  value="<fmt:formatDate value="${accountInvestData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
	</table>
</form>
	

