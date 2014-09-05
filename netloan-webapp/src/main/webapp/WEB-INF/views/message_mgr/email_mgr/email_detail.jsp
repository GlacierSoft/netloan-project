<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>邮件主题：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="emailId" value="${emailData.emailId}" />
				<input class="spinner" style="width:250px"  value="${emailData.emailTitle}" readonly="readonly"/>
			</td>
			<td>邮件类型：</td>
			<td><input id="advertisement_mgr_advertisement_detail_webAdvStatus" class="spinner" style="width:270px"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>发送人：</td>
			<td><input class="spinner" style="width:250px" value="${emailData.createrDisplay}" readonly="readonly"/></td>
			<td>发送时间：</td>
			<td><input class="spinner" style="width:270px" value="<fmt:formatDate value="${emailData.sendTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>邮件内容：</td>
			<td colspan="3"><textarea id="advertisement_mgr_advertisement_detail_webAdvContent" name="webAdvContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${emailData.emailText}</textarea></td>
		</tr>
		<tr>
			<td>收件人：</td>
			<td colspan="3">
				<a href="javascript:selectFind();" style="color: #404040;font-size: 12px;">查看收件人</a>
			</td>
		</tr>
	</table>
	
</form>
<script>

	//查看收件人功能
	function selectFind(){
		$.easyui.showDialog({
			title: "【${emailData.emailTitle}】的所有收件人姓名",
			href : ctx + '/do/email/addresseeDetail.htm?emailId=${emailData.emailId}',//从controller请求jsp页面进行渲染
			width : 320,
			height : 320,
			resizable: false,
			enableApplyButton : false,
			enableSaveButton : false
		});
	}

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