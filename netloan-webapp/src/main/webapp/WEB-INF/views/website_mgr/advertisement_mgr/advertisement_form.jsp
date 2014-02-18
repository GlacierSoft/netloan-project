<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>广告主题：</td>
			<td>
				<input type="hidden" id="advertisement_mgr_advertisement_form_webAdvId" name="webAdvId" value="${advertisementData.webAdvId}" />
				<input id="advertisement_mgr_advertisement_form_webAdvTheme" name="webAdvTheme" class="easyui-validatebox spinner" style="width:268px" required="true" value="${advertisementData.webAdvTheme}"/>
			</td>
		</tr>
		<tr>
			<td>广告内容：</td>
			<td><input id="advertisement_mgr_advertisement_form_webAdvContent" name="webAdvContent" class="easyui-validatebox spinner" style="width:268px" required="true" value="${advertisementData.webAdvContent}"/></td>
		</tr>
		<tr>
			<td>广告状态：</td>
			<td><input id="advertisement_mgr_advertisement_form_webAdvStatus" name="webAdvStatus" required="true" value="${advertisementData.webAdvStatus}"/></td>
		</tr>
		<tr>
			<td>点击次数：</td>
			<td><input id="advertisement_mgr_advertisement_form_clicks" name="clicks" class="easyui-validatebox spinner" style="width:268px" required="true" value="${advertisementData.clicks}"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input id="advertisement_mgr_advertisement_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" required="true" value="${advertisementData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="advertisement_mgr_advertisement_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${advertisementData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	// 初始化广告状态下拉框
	$('#advertisement_mgr_advertisement_form_webAdvStatus').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.status
	});
</script>