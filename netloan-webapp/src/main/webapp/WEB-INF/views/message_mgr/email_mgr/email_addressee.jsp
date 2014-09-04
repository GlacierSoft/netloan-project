<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table id="tabsAddress" border="0" cellpadding="0" cellspacing="0" style="width: 100%;text-align: center;">
		<c:forEach var="record" items="${recordDatas}" varStatus="idx">
			<c:if test="${idx.index%2==0 }">
				<tr>
			</c:if>
			<td style="border-bottom: 1px solid gray;padding: 5px;">${idx.index+1}、${record.recordMemberDisplay}(${record.recordMemberNameDisplay})</td>
			<c:if test="${(idx.index+1)%2==0}">
				</tr>
			</c:if>
		</c:forEach>
</table>
</center>
</body>
</html>