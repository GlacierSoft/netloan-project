<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<style type="text/css">
		body {
		    padding-top: 100px;
		}
	</style>
  </head>

  
  
  
  <!-- NAVBAR ============================= -->
  <body>
        <!-- Fixed navbar -->
	    <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">冰川进销存平台</a>
	        </div>
	        <div class="navbar-collapse collapse">
		          <ul class="nav navbar-nav">
		            <li><a href="${ctx}/index.htm">主页</a></li>
		            <li class="dropdown">
		              <a href="#" class="dropdown-toggle" data-toggle="dropdown">我要投资<b class="caret"></b></a>
		              <ul class="dropdown-menu">
		                <li><a href="#">流转标</a></li>
		                <li><a href="#">净值标</a></li>
		                <li><a href="#">信用标</a></li>
		                <li><a href="#">抵押标</a></li>
		              </ul>
		            </li>
		            <li><a href="#contact">我要借款</a></li>
		            <li class="dropdown">
		              <a href="#" class="dropdown-toggle" data-toggle="dropdown">新手引导<b class="caret"></b></a>
		              <ul class="dropdown-menu">
		                <li><a href="#">借款流程</a></li>
		                <li><a href="#">投资流程</a></li>
		                <li><a href="#">风险保障</a></li>
		              </ul>
		            </li>
		            <li class="active"><a href="#contact">个人中心</a></li>
		            <li><a href="#contact">联系我们</a></li>
		          </ul>
		          <c:choose>
				   <c:when test="${currentUser.userId == ''}">  
		         		<form class="navbar-form navbar-right" role="search">
					      <div id="userrname_form_group" class="form-group">
					      	<label for="username" class="sr-only">用户名</label>
					        <input id="username" name="username" type="text" class="form-control" placeholder="用户名">
					      </div>
					      <div id="password_form_group" class="form-group">
					      	<label for="password" class="sr-only">密码</label>
					        <input id="password" name="password" type="password" class="form-control" placeholder="密码">
					      </div>
					      <a href="#" class="btn btn-success" role="button" onclick="memberLogin();">登录</a>
				   		</form>     
				   </c:when>
				   <c:otherwise> 
				   		<p class="navbar-text navbar-right">
				   			<span>您好！<a href="#" class="navbar-link">${currentUser.userCnName}</a><span class="badge">42</span></span>
				   			<span><a href="#" class="navbar-link">个人中心</a></span>
				   			<span><a href="#" class="navbar-link">退出</a></span>
				   		</p>
				   </c:otherwise>
				</c:choose>
	        </div>
	      </div>
	    </nav>
	    <div class="container">
	    <div class="row">
		    <div class="col-md-2">
	    		<div class="panel-group" id="accordion">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseOne">
					      	   信息中心
					        </a>
					      </h4>
					    </div>
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <button type="button" class="btn btn-info">我的主页</button>
							  <button type="button" class="btn btn-default">充值提现</button>
							  <button type="button" class="btn btn-default">平台认证</button>
							  <button type="button" class="btn btn-default">个人设置</button>
							  <button type="button" class="btn btn-default">邮箱设置</button>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
					         	 借款管理
					        </a>
					      </h4>
					    </div>
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <button type="button" class="btn btn-default">借款列表</button>
							  <button type="button" class="btn btn-default">还款管理</button>
							  <button type="button" class="btn btn-default">贷款统计</button>
							</div>
					      </div>
					    </div>
					  </div>
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title">
					        <a data-toggle="collapse" data-toggle="collapse" data-parent="#accordion" href="#collapseThree">
					    	      投资管理
					        </a>
					      </h4>
					    </div>
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					          <button type="button" class="btn btn-default">我的投标</button>
							  <button type="button" class="btn btn-default">我关注的借款</button>
							  <button type="button" class="btn btn-default">投资统计</button>
							  <button type="button" class="btn btn-default">自动投标</button>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">我的个人信息</h3>
				  </div>
				  <div class="panel-body">
				    Panel content
				  </div>
				</div>
	    	</div>
	    </div>
  </body>
</html>

<script>
function memberLogin(){
	var validate = true;
	var $username = $('#username');
	if($username.val() === ''){
		$('#userrname_form_group').addClass("has-error");
		$username.focus();
		validate = false;
	}
	var $password = $('#password');
	if($password.val() === ''){
		$('#password_form_group').addClass("has-error");
		$password.focus();
		validate =  false;
	}
	if(validate){//验证通过用户登录
		$.ajax({
			   type: "POST",
			   url: ctx + "/login.json",
			   data: {username:$username.val(),password:$password.val()},
			   dataType:'json',
			   success: function(r){
				   	//console.log(r);
			   }
		});
	}
};
</script>