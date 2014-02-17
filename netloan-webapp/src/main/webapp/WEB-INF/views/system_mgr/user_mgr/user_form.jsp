<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<form id="user_mgr_user_form" method="POST" style="padding:15px" >
	<table class="formtable">
		<tr>
			<td>用户名称：</td>
			<td>
				<input type="hidden" name="userId" value="${userData.userId}" />
				<input name="username" class="easyui-validatebox spinner" style="width:268px" required="true" value="${userData.username}"/>
			</td>
		</tr>
		<tr>
			<td>真实姓名：</td>
			<td><input name="userCnName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${userData.userCnName}"/></td>
		</tr>
		<tr>
			<td>用户状态：</td>
			<td><input id="user_mgr_user_form_status" name="status" class="easyui-validatebox spinner" style="width:268px" required="true" value="${userData.status}"/></td>
		</tr>
		<tr>
			<td>电子邮箱：</td>
			<td><input name="email" class="easyui-validatebox spinner" style="width:268px" required="true" value="${userData.email}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${userData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	// 初始化管理员状态
	$('#user_mgr_user_form_status').combobox({  
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