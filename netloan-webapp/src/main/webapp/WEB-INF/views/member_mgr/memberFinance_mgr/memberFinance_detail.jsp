<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${memberFinanceData.memberId}" />
				<input class="spinner" style="width:168px"  value="${memberFinanceData.memberName}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>月均收入：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatNumber value='${memberFinanceData.aveIncome}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			<td>月均支出：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatNumber value='${memberFinanceData.aveExpenses}' pattern="#,#00.00元"/>" readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>是否购房：</td>
			<td><input id="memberFinance_mgr_memberFinance_detail_buyEstate" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>是否购车：</td>
			<td><input id="memberFinance_mgr_memberFinance_detail_buyCar" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>房产价值：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.estateValue}" readonly="readonly"/></td>
			<td>车辆价值：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.carValue}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>房产认证：</td>
			<td><input id="memberFinance_mgr_memberFinance_detail_estateAuth" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>车辆认证：</td>
			<td><input id="memberFinance_mgr_memberFinance_detail_carAuth" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>参股企业名称：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.companyName}" readonly="readonly"/></td>
			<td>参股企业出资额：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.companiesCapitalCon}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>第一联保人：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.firstUnited}" readonly="readonly"/></td>
			<td>第二联保人：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.secondUnited}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>第一联保人关系：</td>
			<td><input id="memberFinance_mgr_memberFinance_detail_firstUnitedContact" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>第二联保人关系：</td>
			<td><input id="memberFinance_mgr_memberFinance_detail_secondContact" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>第一联保人电话：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.firstUnitedPhone}" readonly="readonly"/></td>
			<td>第二联保人电话：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.secondPhone}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${memberFinanceData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${memberFinanceData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${memberFinanceData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>收入构成描述：</td>
			<td colspan="3"><textarea class="spinner" style="width:455px" readonly="readonly">${memberFinanceData.aveIncomeDes}</textarea></td>
		</tr>
		<tr>
			<td>支出构成描述：</td>
			<td colspan="3"><textarea class="spinner" style="width:455px" readonly="readonly">${memberFinanceData.ageExpensesDes}</textarea></td>
		</tr>
		<tr>
			<td>其他资产描述：</td>
			<td colspan="3"><textarea class="spinner" style="width:455px" readonly="readonly">${memberFinanceData.otherAssetsDescribed}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#memberFinance_mgr_memberFinance_detail_buyEstate').val(renderGridValue('${memberFinanceData.buyEstate}',fields.buyEstate));
	$('#memberFinance_mgr_memberFinance_detail_buyCar').val(renderGridValue('${memberFinanceData.buyCar}',fields.buyCar));
	$('#memberFinance_mgr_memberFinance_detail_estateAuth').val(renderGridValue('${memberFinanceData.estateAuth}',fields.auths));
	$('#memberFinance_mgr_memberFinance_detail_carAuth').val(renderGridValue('${memberFinanceData.carAuth}',fields.auths));
	$('#memberFinance_mgr_memberFinance_detail_firstUnitedContact').val(renderGridValue('${memberFinanceData.firstUnitedContact}',fields.contactRelation));
	$('#memberFinance_mgr_memberFinance_detail_secondContact').val(renderGridValue('${memberFinanceData.secondContact}',fields.contactRelation));
</script>
