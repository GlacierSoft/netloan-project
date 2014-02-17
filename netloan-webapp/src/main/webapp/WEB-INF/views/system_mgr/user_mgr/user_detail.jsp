<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>用户名：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="userId" value="${UserData.userId}" />
				<input class="spinner" style="width:168px"  value="${UserData.username}" readonly="readonly"/>
			</td>
			<td>真实名称：</td>
			<td><input class="spinner" style="width:168px" value="${UserData.userCnName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>状态：</td>
			<td><input id="user_mgr_user_form_status" class="spinner" style="width:168px"  value="${UserData.status}" readonly="readonly"/></td>
			<td>是否内置：</td>
			<td><input id="user_mgr_user_form_builtin" class="spinner" style="width:168px"  value="${UserData.builtin}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>电子邮箱：</td>
			<td><input value="${UserData.email}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>头像路径：</td>
			<td><input value="${UserData.userImage}" class="spinner" style="width:168px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>盐值：</td>
			<td><input value="${UserData.salt}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>最后登录IP：</td>
			<td><input value="${UserData.lastLoginIpAddress}" class="spinner" style="width:168px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>登录次数：</td>
			<td><input value="${UserData.loginCount}" class="spinner" style="width:168px"  readonly="readonly"/></td>
			<td>最后登录时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${UserData.lastLoginTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:168px" value="${UserData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${UserData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${UserData.remark}</textarea></td>
		</tr>
	</table>
</form>


<script type="text/javascript">
	var status = '${UserData.status}';
	var builtin = '${UserData.builtin}'
	if(status == "Enabled"){
		$('#user_mgr_user_form_status').val("启用");
	}else{
		$('#user_mgr_user_form_status').val("禁用");
	}  
	if(builtin == "builtin"){
		$('#user_mgr_user_form_builtin').val("内置");
	}else{
		$('#user_mgr_user_form_builtin').val("自定义");
	}
</script>
