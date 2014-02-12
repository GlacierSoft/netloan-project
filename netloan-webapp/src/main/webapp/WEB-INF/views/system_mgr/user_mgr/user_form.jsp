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
			<td>密码：</td>
			<td><input name="password" class="easyui-validatebox spinner" style="width:268px" required="true" value="${userData.password}"/></td>
		</tr>
		<tr>
			<td>电子邮箱：</td>
			<td><input name="email" class="easyui-validatebox spinner" style="width:268px" required="true" value="${userData.email}"/></td>
		</tr>
<!--  		<tr> -->
<!-- 	    	<td>头像:</td> -->
<%-- 	    	<td><input name="userImage" type="file" class="easyui-validatebox spinner" style="width:268px" required="true" value="${userData.userImage}"/></td> --%>
<!-- 	    </tr> -->
		<tr>
			<td>备注：</td>
			<td><textarea name="remark" style="width:268px;" maxlength="255" class="spinner formta">${userData.remark}</textarea></td>
		</tr>
	</table>
</form>
