<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript">
	// 初始化新闻状态下拉框
	$('#news_mgr_news_form_webNewsStatus').combobox({  
		valueField : 'optgroupValueCode',
		height:18,
		width:270,
		textField : 'optgroupValueName',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.webNewsStatus
	});
</script>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>新闻主题：</td>
			<td>
				<input type="hidden" id="news_mgr_news_form_webNewsId" name="webNewsId" value="${newsData.webNewsId}" />
				<input id="news_mgr_news_form_webNewsTheme" name="webNewsTheme" class="easyui-validatebox spinner" style="width:268px" required="true" value="${newsData.webNewsTheme}"/>
			</td>
		</tr>
<!-- 		<tr> -->
<!-- 			<td>新闻内容：</td> -->
<%-- 			<td><input name="webNewsContent" class="easyui-validatebox spinner" style="width:268px" required="true" value="${newsData.webNewsContent}"/></td> --%>
<!-- 		</tr> -->
		<tr>
			<td>新闻状态：</td>
			<td><input id="news_mgr_news_form_webNewsStatus" name="webNewsStatus" value="${newsData.webNewsStatus}"/></td>
		</tr>
		<tr>
			<td>排序号：</td>
			<td><input id="news_mgr_news_form_webNewsNum" name="webNewsNum" class="easyui-validatebox spinner" style="width:268px" required="true" value="${newsData.webNewsNum}"/></td>
		</tr>
		<tr>
			<td>附件：</td>
			<td><input id="news_mgr_news_form_accessory" name="accessory" class="easyui-validatebox spinner" style="width:268px" required="true" value="${newsData.accessory}"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td>
			<textarea id="news_mgr_news_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${newsData.remark}</textarea>
			
<!-- 			<textarea id="webNewsContent" name="webNewsContent" style="width:700px;height:300px;">
			&lt;strong&gt;&lt;/strong&gt;
			</textarea> -->
			</td>
		</tr>
	</table>
</form>

<!-- <script>
       KindEditor.ready(function(K) {
               window.editor = K.create('#webNewsContent');
       });
</script> -->