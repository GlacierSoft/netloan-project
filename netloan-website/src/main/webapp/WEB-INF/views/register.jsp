<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="inc.jsp"/>
	<!-- Custom styles for this template -->
    <link href="${ctx}/resources/css/signin.css" rel="stylesheet">
    <style type="text/css">
		body {
		    padding-top: 100px;
		}
	</style>
	<script type="text/javascript">
    
    function reloadValidateCode(){
        $("#validateCodeImg").attr("src","<%=basePath%>/validateCode.htm?data=" + new Date() + Math.floor(Math.random()*24));
    }
    
    </script>
  </head>

  <body>
  <jsp:include page="nav.jsp"/>
      <div class="container">
      	<div class="panel panel-primary">
		  <div class="panel-heading panel-title">会员注册</div>
		  <div class="panel-body">
      		<form id="registerForm" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/register.htm" method="post">
			  <div class="form-group">
			    <label for="email" class="col-sm-2 control-label">常用邮箱</label>
			    <div class="col-sm-6">
			      <input type="email" class="form-control" id="email" name="email" placeholder="常用邮箱" required autofocus />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="memberName" class="col-sm-2 control-label">用户名</label>
			    <div class="col-sm-6">
			      <input type="text" class="form-control" id="memberName" name="memberName" placeholder="用户名" required />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="memberPassword" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-6">
			      <input type="password" class="form-control" id="memberPassword" name="memberPassword" placeholder="密码" required />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="comfirPassword" class="col-sm-2 control-label">确认密码</label>
			    <div class="col-sm-6">
			      <input type="password" class="form-control" id="comfirPassword" placeholder="确认密码" required />
			    </div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-primary">免 费 注 册</button>
			    </div>
			  </div>
			</form>
			</div>
		</div>
		<jsp:include page="foot.jsp"/>
      </div>
  </body>
</html>

