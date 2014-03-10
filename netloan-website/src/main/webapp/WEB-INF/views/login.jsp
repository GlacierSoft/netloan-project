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
     <%--  <div class="container">
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
								<input type="password" id="password" name="password" class="form-control input-lg"  placeholder="" value="zhangsan"/>
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
      </div> --%>
<%--       <div class="container">
		<div class="panel panel-primary">
		  <div class="panel-heading panel-title">会员登录</div>
		  <div class="panel-body">
		    <form id="loginForm" class="form-signin" role="form" action="${pageContext.request.contextPath}/login.htm" method="post">
				<input type="text" id="username" name="username" class="form-control" placeholder="用户名/邮箱/手机"  required autofocus  />
				<input type="password" id="password" name="password" class="form-control" placeholder="密码"  required  />
				<div class="input-group">
					<span id="login_kaptcha_span" class="input-group-addon">
						<div style="width:110px;height:32px;">
							<img class="img-responsive" id="login_kaptcha" src="${ctx}/resources/images/kaptcha.jpg" />
							<img  class="img-responsive" id="validateCodeImg" src="<%=basePath%>/validateCode.htm" />
						</div>
					</span>
					<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control input-lg">
					&nbsp;&nbsp;<a href="#" onclick="javascript:reloadValidateCode();">看不清？</a>
				</div>
				 <li>验证码：<input type="text" name="validateCode" />
				 &nbsp;&nbsp;<img id="validateCodeImg" src="<%=basePath%>/validateCode.htm" />
				 &nbsp;&nbsp;<a href="#" onclick="javascript:reloadValidateCode();">看不清？</a>
				 </li>
				 
		        <span><label class="resNow ">还没加入冰川网贷？<a href="${ctx}/register.htm" class="navbar-link">立即注册</a></label></span>
		        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
		   </form>
		  </div>
		</div>

    </div>  --%><!-- /container -->
     <div class="container">
      	<div class="panel panel-primary">
		  <div class="panel-heading panel-title">会员登录</div>
		  <div class="panel-body">
      		<form id="loginForm" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/login.htm" method="post">
			  <div class="form-group">
			    <label for="username" class="col-sm-2 control-label">用户名/邮箱/手机</label>
			    <div class="col-sm-6">
			      <input type=text class="form-control" id="username" name="username" placeholder="用户名/邮箱/手机" required autofocus />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="password" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-6">
			      <input type="password" class="form-control" id="password" name="password" placeholder="密码" required />
			    </div>
			  </div>
			 <li>验证码：<input type="text" name="validateCode" />
				 &nbsp;&nbsp;<img id="validateCodeImg" src="<%=basePath%>/validateCode.htm" />
				 &nbsp;&nbsp;<a href="#" onclick="javascript:reloadValidateCode();">看不清？</a>
				 </li>
			  <div class="form-group">
			    <label for="inputPassword" class="col-sm-5 control-label">还没加入冰川网贷？<a href="${ctx}/intoregister.htm" class="navbar-link">立即注册</a></label>
			    <div class="col-sm-2"></div>
			  </div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-primary btn-lg">登录</button>
			    </div>
			  </div>
			</form>
			</div>
		</div>
		 <jsp:include page="foot.jsp"/>
      </div>
     
  </body>
</html>

