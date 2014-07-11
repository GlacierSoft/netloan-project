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
	<jsp:include page="../inc.jsp"/>
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
  <jsp:include page="../nav_mgr/navLogin.jsp"/>
 	 <div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;">
      <div class="alert alert-danger fade in">
        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
        <h4 style="text-align:center;"></h4>
      </div> 
    </div>
    <div id="success_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;">
	      <div class="alert alert-success fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
     <div class="container">
      	<div class="panel panel-primary">
		  <div class="panel-heading panel-title">找回密码</div>
		  	<form id="getPasword" class="form-horizontal" role="form" action="${pageContext.request.contextPath}/getPasswrod.htm" method="post">
		       <div class="panel-body" style="height: 200px"><br><bt><br><bt>
      	        <div class="form-group" style="width: 1000px">
			    <label for="username" style="width: 250px;text-align: right;margin-top: 7px"  class="col-sm-2 control-label">请输入您注册时用的Email：</label>
			    <div class="col-sm-6" style="float: left;margin-left: 0px;text-align: left;">
			      <input style="margin-left:0px;width: 440px"  type=text class="form-control" id="useremal" name="useremal" placeholder="请输入您注册时用的Email"  required autofocus />
			      </div>  
			      <button  id="sub"  class="btn btn-primary btn-lg" style="height: 40px">发送</button>
			   </div>  
			</div></form>
		</div>
		 
      </div>
      <jsp:include page="../foot.jsp"/>
<script type="text/javascript">
$(function(){
	 
	
	//输入框得到焦点
	 $("#useremal").focus(function(){
		 $("#eml").remove();
		 $("#eml2").remove();
	 });
	//邮箱失去焦点前台验证
	 $("#useremal").blur(function(){ 
		 $("#eml").remove();
		 $("#eml2").remove();
		 var str=$(this).val();
		 var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((.[a-zA-Z0-9_-]{2,3}){1,2})$/;
	     var boo= reg.test(str);
	     if(str==""){
	     	 $(this).after("<label id='eml2' style='color: red'>*邮箱不能为空</label>");
			  return;
	     }
	    if(boo==false){
	    	 $(this).after("<label id='eml' style='color: red'>*邮箱格式不正确</label>");
	     }else{
	    	 $("#eml").remove();
	     }  
	 });  
	

		var emailStatus = '${emailStatus}';
		if(emailStatus!=""){
			$('#success_alert').fadeIn();
			$('#success_alert h4').html('邮箱不存在，请重新输入');
			setTimeout(function(){//延迟3秒隐藏
				$('#success_alert').fadeOut();
			},3000)
		}
/*  $("#sub").click(function(){
	 alert("---");
		var emal=$("#useremal").val();
		$.post("${pageContext.request.contextPath}/getPasswrod.htm",emal,function(resutText){
			alert(resulText);
		});
		alert(">>>");
  	});  */ 
	
	
});
</script>
  </body>
</html>

 