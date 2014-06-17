<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>借款标题：</td>
			<td ><!-- class="forminputtable"当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="loanReviewId" value="${reviewData.loanReviewId}" />
				<input class="spinner" style="width:168px"  value="${reviewData.loanTitle}" readonly="readonly"/></td>
		
		<td>&nbsp;留言人:</td>
			<td><input  class="spinner" style="width:168px"  value="${reviewData.memberDisplay}" readonly="readonly"/></td>
		
		</tr>
		<tr>
			<td>评论内容：</td>
			<td><input  class="spinner" style="width:168px"  value="${reviewData.reviewContent}" readonly="readonly"/></td>
			<td>&nbsp;创建时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${reviewData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><input class="spinner" style="width:408px" value="${reviewData.remark}" readonly="readonly"/></td>
		</tr>
	</table>
</form>
