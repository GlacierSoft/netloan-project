<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员积分级别名称：</td>
			<td class="forminputtable" colspan="5"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="creditId" value="${integralData.integralId}" />
				<input class="spinner" style="width:150px"  value="${integralData.integralName}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>会员开始积分：</td>
			<td><input class="spinner" style="width:150px"  value="${integralData.integralBegin}" readonly="readonly"/></td>
			<td>会员结束积分：</td>
			<td colspan="3"><input class="spinner" style="width:150px"  value="${integralData.integralEnd}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建者：</td>
			<td><input class="spinner" style="width:150px" value="${integralData.creater}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:150px" value="<fmt:formatDate value="${integralData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:416px" readonly="readonly">${integralData.remark}</textarea></td>
		</tr>
	</table>
</form>

