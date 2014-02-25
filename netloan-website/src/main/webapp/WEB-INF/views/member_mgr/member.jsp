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
	<jsp:include page="../inc.jsp"/>
  </head>

  
  
  
  <!-- NAVBAR ============================= -->
  <body>
    <div class="navbar-wrapper">
      <div class="container">
        <!-- Fixed navbar -->
	    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
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
		          <form class="navbar-form navbar-right" role="search">
				      <div class="form-group">
				      	<label for="username" class="sr-only">用户名</label>
				        <input type="text" class="form-control" placeholder="用户名">
				      </div>
				      <div class="form-group">
				      	<label for="password" class="sr-only">密码</label>
				        <input type="password" class="form-control" placeholder="密码">
				      </div>
				      <button type="submit" class="btn btn-info">登录</button>
			    </form>
	        </div>
	      </div>
	    </div>
      </div>
    </div>

	

    <!-- Marketing messaging and featurettes
    ================================================== -->
    <!-- Wrap the rest of the page in another container to center all the content. -->

    <div class="container">

      <!-- FOOTER -->
      <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>
        <p>&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
      </footer>

    </div><!-- /.container -->


    <script src="http://cdn.bootcss.com/holder/2.0/holder.min.js"></script>
  </body>
</html>

