<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

    	<!-- NAVBAR START============================= -->
	    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	            <span class="sr-only">Toggle navigation</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <a class="navbar-brand" href="#">冰川网贷平台</a>
	        </div>
	        <div class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li class="active"><a href="${ctx}/index.htm">主页</a></li>
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
	            <li><a href="${ctx}/member/index.htm">个人中心</a></li>
	            <li><a href="#contact">联系我们</a></li>
	          </ul>
	          	<p class="navbar-text navbar-right">
	          	<c:choose>
				   <c:when test="${empty currentMember}">  
		         		<span>您好！| <a href="${ctx}/login.htm" class="navbar-link">登录</a> |</span>
		         		<span><a href="${ctx}/intoregister.htm" class="navbar-link">注册</a></span>
				   </c:when>
			   		<c:otherwise> 
				   		<span>您好！<a href="#" class="navbar-link">${currentMember.memberName}</a><span class="badge">42</span> |</span>
				   		<span><a href="${ctx}/member/index.htm" class="navbar-link">个人中心</a> |</span>
				   		<span><a href="${ctx}/logout.htm" class="navbar-link">退出</a></span>
				   </c:otherwise>
				</c:choose>
   				</p>
	        </div>
	      </div>
	    </nav>
	    <!-- NAVBAR END============================= -->