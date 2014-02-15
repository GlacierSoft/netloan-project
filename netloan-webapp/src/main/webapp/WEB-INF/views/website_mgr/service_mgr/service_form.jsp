<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript">
	// 初始化新闻状态下拉框
	$('#service_mgr_service_form_webServiceStatus').combobox({  
		valueField : 'optgroupValueCode',
		height:18,
		width:270,
		textField : 'optgroupValueName',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.webServiceStatus
	});
</script>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>客服名称：</td>
			<td>
				<input type="hidden" id="service_mgr_service_form_webServiceId" name="webServiceId" value="${serviceData.webServiceId}" />
				<input id="service_mgr_service_form_webServiceName" name="webServiceName" style="width:268px" value="${serviceData.webServiceName}" class="easyui-validatebox spinner"  required="true"  validType="customReg['^[\\u4E00-\\u9FA5\\uf900-\\ufa2d\\w]{2,16}$','<fmt:message key="Role.roleCnName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>客服qq：</td>
			<td><input id="service_mgr_service_form_webServiceQq" name="webServiceQq" class="easyui-validatebox spinner" style="width:268px" required="true" value="${serviceData.webServiceQq}"/></td>
		</tr>
		<tr>
			<td>客服状态：</td>
			<td><input id="service_mgr_service_form_webServiceStatus" name="webServiceStatus" required="true" value="${serviceData.webServiceStatus}"/></td>
		</tr>
		<tr>
			<td>客服序号：</td>
			<td><input id="service_mgr_service_form_webServiceNum" name="webServiceNum" class="easyui-validatebox spinner" style="width:268px" required="true" value="${serviceData.webServiceNum}"/></td>
		</tr>
<%-- 		<tr>
			<td>客服头像：</td>
			<td><input id="service_mgr_service_form_webServicePhoto" name="webServicePhoto" class="easyui-validatebox spinner" style="width:268px" required="true" value="${serviceData.webServicePhoto}"/></td>
		</tr> --%>
		<tr>
			<td>附件：</td>
			<td><input id="service_mgr_service_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" required="true" value="${serviceData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="service_mgr_service_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${serviceData.remark}</textarea></td>
		</tr>
	</table>
</form>
