<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>新闻主题：</td>
			<td class="forminputtable" colspan="3"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="webNewsId" value="${newsData.webNewsId}" />
				<input class="spinner" style="width:585px"  value="${newsData.webNewsTheme}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>新闻状态：</td>
			<td><input class="spinner" style="width:250px"  value="${newsData.webNewsStatus}" readonly="readonly"/></td>
			<td>新闻排序：</td>
			<td><input class="spinner" style="width:250px"  value="${newsData.webNewsNum}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:250px" value="${newsData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:250px" value="<fmt:formatDate value="${newsData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:250px" value="${newsData.updater}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:250px" value="<fmt:formatDate value="${newsData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>新闻内容：</td>
			<td colspan="3"><textarea id="news_mgr_news_detail_webNewsContent" name="webNewsContent" class="spinner" style="width:600px;height:280px;" readonly="readonly">${newsData.webNewsContent}</textarea></td>
		</tr>

	</table>
</form>
<script>
	KindEditor.ready(function(Detail) {
		Detail.create('#news_mgr_news_detail_webNewsContent', {
			themeType : 'qq',
			items : []
		});
	});
</script>