<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>公告主题：</td>
			<td>
				<input type="hidden" name="webAnnId" value="${announcementData.webAnnId}" />
				<input name="webAnnTheme" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.webAnnTheme}"/>
			</td>
		</tr>
		<tr>
			<td>公告内容：</td>
			<td><input name="webAnnContent" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.webAnnContent}"/></td>
		</tr>
		<tr>
			<td>公告状态：</td>
			<td><input name="webAnnStatus" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.webAnnStatus}"/></td>
		</tr>
		<tr>
			<td>点击次数：</td>
			<td><input name="clicks" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.clicks}"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input name="accessory" class="easyui-validatebox spinner" style="width:268px" required="true" value="${announcementData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${announcementData.remark}</textarea></td>
		</tr>
	</table>
</form>
