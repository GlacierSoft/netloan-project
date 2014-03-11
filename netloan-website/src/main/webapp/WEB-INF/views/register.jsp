<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
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

   <div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;">
      <div class="alert alert-danger fade in">
        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
        <h4 style="text-align:center;"></h4>
      </div> 
    </div>
      <div class="container">
      	<div class="panel panel-primary">
		  <div class="panel-heading panel-title">会员注册</div>
		  <div class="panel-body">
      		<form id="registerForm" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/register.htm" method="post" onsubmit="return validaForm();">
			  <div class="form-group">
			    <label for="email" class="col-sm-2 control-label">常用邮箱</label>
			    <div class="col-sm-6">
			      <input type="email" class="form-control" id="email_form-control" name="email" placeholder="常用邮箱" required autofocus value="${member.email}"  />
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="memberName" class="col-sm-2 control-label">用户名</label>
			    <div class="col-sm-6">
			      <input type="text" class="form-control" id="memberName_form-control" name="memberName" placeholder="用户名" required  value="${member.memberName}"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="memberPassword" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-6">
			      <input type="password" class="form-control" id="memberPassword_form-control" name="memberPassword" placeholder="密码" required value="${member.memberPassword}"/>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="comfirPassword" class="col-sm-2 control-label">确认密码</label>
			    <div class="col-sm-6">
			      <input type="password" class="form-control" id="comfirPassword_form-control" placeholder="确认密码" required value="${member.memberPassword}"/>
			    </div>
			  </div>
		  	<div class="form-group">
				<label id="login_kaptcha_span" class="col-sm-2 control-label ">验证码</label>
				<div class="col-sm-2">
					<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control" placeholder="验证码" required />
				</div>
				<div class="col-sm-2">
					<img style="width:120px;height:32px;" class="img-responsive" id="login_kaptcha" src="${ctx}/resources/images/kaptcha.jpg" />
				</div>
			</div>
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button id="register_form-group" type="submit" class="btn btn-primary">免 费 注 册</button>
			    </div>
			  </div>
			</form>
			</div>
		</div>
		<jsp:include page="foot.jsp"/>
      </div>
      	<script type="text/javascript">
			$(function() {
				$(".alert").alert();
				
				$('#login_kaptcha').click(function() {  
					$('#captcha').val('');
		        	$(this).hide().attr('src','${pageContext.request.contextPath}/resources/images/kaptcha.jpg?' + Math.floor(Math.random() * 100)).fadeIn();     
			    });
				
				//表单验证
				validaForm = function(){
					var $memberPassword = $('#memberPassword_form-control');
					var $comfirPassword = $('#comfirPassword_form-control');
					if($memberPassword.val().length < 6){
						$memberPassword.addClass("has-error");
						$memberPassword.focus();
						
						$('#danger_alert').fadeIn();
						$('#danger_alert h4').html('密码不能小于6位！');
						setTimeout(function(){//延迟3秒隐藏
							$('#danger_alert').fadeOut();
						},3000)
						return false;
					}
					if(($memberPassword.val()) !== ($comfirPassword.val())){
						$memberPassword.addClass("has-error");
						$memberPassword.focus();
						
						$('#danger_alert').fadeIn();
						$('#danger_alert h4').html('密码输入不一致，请重新输入！');
						setTimeout(function(){//延迟3秒隐藏
							$('#danger_alert').fadeOut();
						},3000)
						return false;
					}
					
					var $captcha = $('#captcha');
					if($captcha.val().length < 4){
						$('#captcha_form_group').addClass("has-error");
						$captcha.focus();
						
						$('#danger_alert').fadeIn();
						$('#danger_alert h4').html('验证码不能小于4位！');
						setTimeout(function(){//延迟3秒隐藏
							$('#danger_alert').fadeOut();
						},3000)
						return false;
					}
					
					$('#register_form-group').attr('disabled', 'disabled').html('注册中...');
					return true;
				};
				
				//$("#loginForm").submit();//自动登录，方便测试，后期删除
			});
		</script>
		<script type="text/javascript">
			var errorCaptcha = '${errorCaptcha}';
			var usernameRepeat = '${usernameRepeat}';
			if(errorCaptcha != ""){
				$('#danger_alert').fadeIn();
				$('#danger_alert h4').html('验证码错误，请重新输入！');
		 	  	$('#captcha_form_group').addClass("has-error");
		 	  	$('#captcha').focus();
			}
			if(usernameRepeat != ""){
				$('#danger_alert').fadeIn();
				$('#danger_alert h4').html('用户名重复，请重新输入！');
		 	  	$('#memberName_form-control').addClass("has-error");
		 	  	$('#memberName_form-control').focus();
			}
			setTimeout(function(){//延迟3秒隐藏
				$('#danger_alert').fadeOut();
			},3000)
		</script>
  </body>
</html>

