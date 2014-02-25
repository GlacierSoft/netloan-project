<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${statisticsData.applyAmountId}" />
				<input class="spinner" style="width:168px"  value="${statisticsData.memberId}" readonly="readonly"/>
			</td>
			<td>原来额度：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.originalAmount}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>原来额度：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.originalAmount}" readonly="readonly"/></td>
			<td>申请额度：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.applyMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>申请说明：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.applyExplanation}" readonly="readonly"/></td>
			<td>申请时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${statisticsData.applyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>授权额度：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.authorizedAmount}" readonly="readonly"/></td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${statisticsData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.auditorDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>处理说明：</td>
			<td colspan="3"><input class="spinner" style="width:416px" value="${statisticsData.processExplanation}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${statisticsData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${statisticsData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${statisticsData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${statisticsData.remark}</textarea></td>
		</tr>
	</table>
</form>
