<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript">
	// 初始化新闻状态下拉框
	$('#announcement_mgr_announcement_form_webAnnStatus').combobox({  
		valueField : 'optgroupValueCode',
		height:18,
		width:270,
		textField : 'optgroupValueName',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.status
	});
</script>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>公告主题：</td>
			<td>
				<input type="hidden" id="announcement_mgr_announcement_form_webAnnId" name="webAnnId" value="${announcementData.webAnnId}" />
				<input id="announcement_mgr_announcement_form_webAnnTheme" name="webAnnTheme" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.webAnnTheme}"/>
			</td>
		</tr>
		<tr>
			<td>公告内容：</td>
			<td><input id="announcement_mgr_announcement_form_webAnnContent" name="webAnnContent" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.webAnnContent}"/></td>
		</tr>
		<tr>
			<td>公告状态：</td>
			<td><input id="announcement_mgr_announcement_form_webAnnStatus" name="webAnnStatus" required="true" value="${announcementData.webAnnStatus}"/></td>
		</tr>
		<tr>
			<td>点击次数：</td>
			<td><input id="announcement_mgr_announcement_form_clicks" name="clicks" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.clicks}"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input id="announcement_mgr_announcement_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="announcement_mgr_announcement_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${announcementData.remark}</textarea></td>
		</tr>
	</table>
</form>
