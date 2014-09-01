<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>邮件主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="emailId" value="${emailData.emailId}" />
				<input class="spinner" style="width:250px"  value="${emailData.emailTitle}" readonly="readonly"/>
			</td>
			<td>邮件类型：</td>
			<td><input id="advertisement_mgr_advertisement_detail_webAdvStatus" class="spinner" style="width:250px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>发送人：</td>
			<td><input class="spinner" style="width:250px" value="${emailData.creater}" readonly="readonly"/></td>
			<td>发送时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${emailData.sendTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>邮件内容：</td>
			<td colspan="3"><textarea id="advertisement_mgr_advertisement_detail_webAdvContent" name="webAdvContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${emailData.emailText}</textarea></td>
		</tr>

	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#advertisement_mgr_advertisement_detail_webAdvContent', {
			themeType : 'qq',
			items : [],
			minWidth : "600px",
			readonlyMode : true
		});
	});
</script>
<script type="text/javascript">
	$('#advertisement_mgr_advertisement_detail_webAdvStatus').val(renderGridValue('${emailData.emailType}',fields.email));
</script>