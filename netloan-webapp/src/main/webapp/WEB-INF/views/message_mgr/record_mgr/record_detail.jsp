<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>邮件主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="emailId" value="${recordData.recordId}" />
				<input class="spinner" style="width:250px"  value="${recordData.recordTitle}" readonly="readonly"/>
			</td>
			<td>收件人：</td>
			<td><input class="spinner" style="width:250px" value="${recordData.recordMemberDisplay}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>发送人：</td>
			<td><input class="spinner" style="width:250px" value="${recordData.recordSendDisplay}" readonly="readonly"/></td>
			<td>发送时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${recordData.createrTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>