<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${estateData.estateId}" />
				<input class="spinner" style="width:168px"  value="${estateData.memberRealName}" readonly="readonly"/>
			</td>
			<td>供款状况：</td>
			<td><input id="estate_mgr_estate_detail_ageExpenses" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>建筑面积：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.area}" readonly="readonly"/></td>
			<td>建筑月份：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${estateData.yearBuilt}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>房产地址：</td>
			<td colspan="3"><input class="spinner" style="width:416px" value="${estateData.address}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>所有权一：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.firstOwner}" readonly="readonly"/></td>
			<td>所有权二：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.secondOwner}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>贷款年限：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${estateData.loanPeriod}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>每月供款：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.monthContributions}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>尚欠余额：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.outstandBalances}" readonly="readonly"/></td>
			<td>按揭银行：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.mortgageBank}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${estateData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${estateData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#estate_mgr_estate_detail_ageExpenses').val(renderGridValue('${estateData.ageExpenses}',fields.ageExpenses));
</script>
