<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="inc.jsp"/>
  </head>

  <body>
      <div class="container">
      		<div class="row">
				<div class="col-md-12">
					<form id="loginForm" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/login.htm" method="post">
						<div id="userrname_form_group" class="form-group">
							<label for="username" class="control-label col-xs-3 hidden-sm hidden-xs">用户名</label>
							<div class="col-md-9 col-xs-12">
								<input type="text" id="username" name="username" class="form-control input-lg"  placeholder="用户名/邮箱/手机" value="zhangsan" />
							</div>
						</div>
						<div id="password_form_group" class="form-group">
							<label for="password" class="control-label col-xs-3 hidden-sm hidden-xs">密码</label>
							<div class="col-md-9 col-xs-12">
								<input type="password" id="password" name="password" class="form-control input-lg"  placeholder="密码" value="zhangsan"/>
							</div>
						</div>
						<div id="captcha_form_group" class="form-group">
							<label for="submit" class="control-label col-xs-3 hidden-sm hidden-xs"></label>
							<div class="col-md-3 col-xs-12" style="float: right">
								<button id="login_submit" class="btn btn-primary btn-lg btn-block">登录</button>
							</div>
						</div>
					</form>
				</div>
			</div>
      </div>
  </body>
</html>

