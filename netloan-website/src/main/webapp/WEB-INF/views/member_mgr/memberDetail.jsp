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

  
  
  
  
  <body>
  <jsp:include page="../nav.jsp"/>
       
	    <!-- CONTAINER START======================== -->
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
				     <table class="table">
			            <tr>
			              <td rowspan="4">头像</td>
			              <td>用户名：</td>
			              <td>${currentMember.memberRealName}</td>
			              <td>信用积分</td>
			              <td>123</td>
			            </tr>
			            <tr>
			              <td>注册时间：</td>
			              <td>${currentMember.registrationTime}</td>
			              <td>会员到期：</td>
			              <td>${currentMember.expireTime}</td>
			            </tr>
			            <tr>
			              <td>会员积分：</td>
			              <td>120</td>
			              <td>最后登录ip:</td>
			              <td>61.145.244.204</td>
			            </tr>
			            <tr>
			              <td>信用额度：</td>
			              <td>12000</td>
			              <td>个人统计:</td>
			              <td>61.145.244.204</td>
			            </tr>
			        </table>
				  </div>
				</div>
	    	</div>
	    </div>
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->
	      
  </body>
</html>