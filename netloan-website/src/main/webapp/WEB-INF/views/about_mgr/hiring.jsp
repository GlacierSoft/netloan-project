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
		ol, ul {
		    list-style: none outside none;
		    margin: 0;
    		padding: 0;
		}
	</style>
  </head>

  <body>
  <jsp:include page="../nav.jsp"/>
       
	    <div class="container">
	  	<div class="row">
		    <div class="col-md-2">
			    <div class="panel-group" id="accordion">
			  		<div class="bs-example">
				      <ul class="nav nav-pills nav-stacked" style="max-width: 300px;">
				        <li><a href="${ctx}/aboutUs.htm">公司简介</a></li>
				        <li class="active"><a href="${ctx}/hiring/hiring.htm">招纳贤士</a></li>
				        <li><a href="${ctx}/contactUs.htm">联系我们</a></li>
				      </ul>
			  		</div>
			  	</div>
	  		</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">关于我们 / 招纳贤士</h3>
				  </div>
				  <div class="panel-body">
			          <h2>招贤纳士</h2>
			          <div>
			           <p>我们是一支在互联网和金融领域非常优秀的团队！我们有梦有理想，我们积极乐观，脚踏实地，充满激情！如果你也和我们一样，那么欢迎你加入我们的团队！</p>
			           <p></p>
			          </div>
			          
			          <h3  style="padding-top: 20px;">招聘职位</h3>
				      <div>
				          <table class="table table-hover">
					        <tbody>
					          <tr>
					            <td>招聘投资/理财主管2名 </td>
					            <td>2014-02-27</td>
					          </tr>
					          <tr>
					            <td>招聘信贷经理/信贷助理/信贷秘书2名  </td>
					            <td>2014-02-27</td>
					          </tr>
					          <tr>
					            <td>招聘投资/理财顾问10名  </td>
					            <td>2014-02-27</td>
					          </tr>
					          <tr>
					            <td>招聘金融信贷专员5名 </td>
					            <td>2014-02-27</td>
					          </tr>
					          <tr>
					            <td>招聘系统开发/维护10名  </td>
					            <td>2014-02-27</td>
					          </tr>
					      	</tbody>
					      	<tfoot>
					          <tr>
					            <th colspan="2"><h4 align="center"><a  href="#" >查看更多招聘信息>></a></h4></th>
					          </tr>
					        </tfoot>
					      </table>
				      </div>
				      
			          <div>
				          <table class="table table-hover">
				          	<c:forEach items="${hiringDatas.rows}" var="hiring" >
					        <tbody>
					          <tr>
					            <td style="width: 600px;">${hiring.webHiringTheme}</td>
					            <td>${hiring.createTime}</td>
					          </tr>
					      	</tbody>
					      	</c:forEach>
					      	<tfoot>
					          <tr>
					            <th colspan="2"><h4 align="center"><a  href="#" >查看更多招聘信息>></a></h4></th>
					          </tr>
					        </tfoot>
					      </table>
				      </div>
				                
			          <div>
			            <h3>我们会为你提供</h3>
			            <ul>
			              <li>在全新的互联网金融行业里开启个人事业的机会</li>
			              <li>富有竞争力的薪酬待遇</li>
			              <li>轻松惬意的工作氛围和充满活力的团队文化</li>
			              <li>完善的培训体系和更多的晋升机会</li>
			            </ul>
			          </div>
			          <div>
			            <p>请发送您的简历至<a href="mailto:hr@renrendai.com" target="_blank">hr@renrendai.com</a>，标题请注明所申请职位。</p>
			          </div>
			          
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    <jsp:include page="../foot.jsp"/>
	    </div>
  </body>
</html>