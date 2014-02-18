<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>招聘管理主题：</td>
			<td>
				<input type="hidden" id="hiring_mgr_hiring_form_webHiringId" name="webHiringId" value="${hiringData.webHiringId}" />
				<input id="hiring_mgr_hiring_form_webHiringTheme" name="webHiringTheme" style="width:268px" value="${hiringData.webHiringTheme}" class="easyui-validatebox spinner"  required="true"  validType="customReg['^[\\u4E00-\\u9FA5\\uf900-\\ufa2d\\w]{2,16}$','<fmt:message key="WebsiteHiring.webHiringTheme.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>招聘管理内容：</td>
			<td><input id="hiring_mgr_hiring_form_webHiringContent" name="webHiringContent" class="easyui-validatebox spinner" style="width:268px" required="true" value="${hiringData.webHiringContent}"/></td>
		</tr>
		<tr>
			<td>招聘管理状态：</td>
			<td><input id="hiring_mgr_hiring_form_webHiringStatus" name="webHiringStatus" required="true" value="${hiringData.webHiringStatus}"/></td>
		</tr>
		<tr>
			<td>招聘管理序号：</td>
			<td><input id="hiring_mgr_hiring_form_webHiringNum" name="webHiringNum" class="easyui-validatebox spinner" style="width:268px" required="true" value="${hiringData.webHiringNum}" data-options="min:0,max:999,required:true,missingMessage:'请填写招聘管理序号'" value="10" style="width: 270px;height:18px;" min="1" max="99"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input id="hiring_mgr_hiring_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" required="true" value="${hiringData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="hiring_mgr_hiring_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${hiringData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	// 初始化新闻状态下拉框
	$('#hiring_mgr_hiring_form_webHiringStatus').combobox({  
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
