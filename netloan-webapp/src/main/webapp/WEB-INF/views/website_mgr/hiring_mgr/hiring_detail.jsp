<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>招聘管理主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webHiringId" value="${hiringData.webHiringId}" />
				<input class="spinner" style="width:168px"  value="${hiringData.webHiringTheme}" readonly="readonly"/></td>
			<td>招聘管理内容：</td>
			<td><input class="spinner" style="width:168px" value="${hiringData.webHiringContent}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>招聘管理状态：</td>
			<td><input id="hiring_mgr_hiring_form_webHiringStatus" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>招聘管理序号：</td>
			<td><input class="spinner" style="width:168px"  value="${hiringData.webHiringNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${hiringData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${hiringData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px" value="${hiringData.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${hiringData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${hiringData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	var webHiringStatus = '${hiringData.webHiringStatus}';
	if(webHiringStatus == "enabled"){
		$('#hiring_mgr_hiring_form_webHiringStatus').val("启用");
	}else{
		$('#hiring_mgr_hiring_form_webHiringStatus').val("禁用");
	}  
</script>
