<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>客服头像：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webServiceId" value="${serviceData.webServiceId}" />
				<input class="spinner" style="width:168px"  value="${serviceData.webServicePhoto}" readonly="readonly"/></td>
			<td>客服序号：</td>
			<td><input class="spinner" style="width:168px" value="${serviceData.webServiceNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>客服名称：</td>
			<td><input class="spinner" style="width:168px"  value="${serviceData.webServiceName}" readonly="readonly"/></td>
			<td>客服qq：</td>
			<td><input class="spinner" style="width:168px"  value="${serviceData.webServiceQq}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>客服状态：</td>
			<td><input id="service_mgr_service_form_webServiceStatus" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>客服序号：</td>
			<td><input class="spinner" style="width:168px"  value="${serviceData.webServiceNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${serviceData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${serviceData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${serviceData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	var webServiceStatus = '${serviceData.webServiceStatus}';
	if(webServiceStatus == "enable"){
		$('#service_mgr_service_form_webServiceStatus').val("启用");
	}else{
		$('#service_mgr_service_form_webServiceStatus').val("禁用");
	}  
</script>
