<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入jstl解析标签 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- 获取项目根path -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!-- 加入富文本编辑器kindeditor声明-->
<script type="text/javascript" charset="utf-8">
	   var ctx = '${ctx}';//项目访问路径
</script>

<!-- 引入网站标识icon -->
<link rel="shortcut icon" href="${ctx}/resources/images/favicon/favicon.ico"></link>
<link rel="icon" href="${ctx}/resources/images/favicon/favicon.ico"></link>

<!-- 引入bootstrap样式 -->
<link rel="stylesheet" href="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/css/bootstrap.min.css"></link>

<!-- 自定义主页样式 -->
<link rel="stylesheet" href="${ctx}/resources/css/index.css"></link>

 <!--[if lt IE 9]>
 	<link rel="stylesheet" href="${ctx}/resources/css/ie8.css"></link>
 </script><![endif]-->

 <!--[if lt IE 9]>
   <script src="http://cdn.bootcss.com/html5shiv/3.7.0/html5shiv.min.js"></script>
   <script src="http://cdn.bootcss.com/respond.js/1.3.0/respond.min.js"></script>
 <![endif]-->


<script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
<script src="${ctx}/resources/js/bootstrap-3.0.3-dist/dist/js/bootstrap.min.js"></script>

