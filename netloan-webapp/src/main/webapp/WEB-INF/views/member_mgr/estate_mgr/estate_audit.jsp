<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${estateData.estateId}" />
				<input class="spinner" style="width:168px"  value="${estateData.memberRealName}" readonly="readonly"/>
			</td>
			<td>供款状况：</td>
			<td><input id="estate_mgr_estate_audit_ageExpenses" class="spinner" style="width:168px" readonly="readonly"/></td>
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
			<td>审核状态：</td>
			<td><input id="estate_mgr_estate_audit_auditState" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.auditorDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td><input class="spinner" style="width:168px" value="${estateData.auditRemark}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${estateData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
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
</div>
<script type="text/javascript"> 
	$('#estate_mgr_estate_audit_ageExpenses').val(renderGridValue('${estateData.ageExpenses}',fields.ageExpenses));
	$('#estate_mgr_estate_audit_auditState').val(renderGridValue('${estateData.auditState}',fields.auditState));
	//审核按钮初始化
	if(${estateData.auditState== 'pass'}){
		document.all("estate_mgr_estate_audit_auditState")[1].checked=true;
	}else if(${estateData.auditState== 'failure'}){
		document.all("estate_mgr_estate_audit_auditState")[2].checked=true;
	}else{
		document.all("estate_mgr_estate_audit_auditState")[0].checked=true;
	}
</script>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核结果：</td>
			<td><input type="hidden" id="estate_mgr_estate_audit_estateId" name="estateId" value="${estateData.estateId}" />
				<input id="estate_mgr_estate_audit_auditState" name="auditState" type="radio" value="authstr" /><span>审核中</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
				<input type="hidden" id="estate_mgr_estate_audit_memberRealName" name="memberRealName" value="${estateData.memberRealName}" />
				<input id="estate_mgr_estate_audit_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="estate_mgr_estate_audit_auditState" name="auditState" type="radio" value="failure" /><span>审核失败</span></td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3">
				<textarea name="auditRemark" class="spinner" style="height:50px;width:410px">${estateData.auditRemark}</textarea>
			</td>
		</tr>
	</table>
</form>
