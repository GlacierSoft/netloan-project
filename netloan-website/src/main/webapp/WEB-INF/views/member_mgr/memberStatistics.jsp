<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
					    <div id="collapseOne" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
					          <a href="#" class="btn btn-default" role="button">充值提现</a>
					          <a href="${ctx}/member/memberAuth.htm?&p=0" class="btn btn-default" role="button">平台认证</a>
							  <a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" class="btn btn-default" role="button">站内信</a>
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">个人设置</a>
							  <a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-default" role="button">头像上传</a>
							  <a href="${ctx}/member/memberEmail.htm" class="btn btn-default" role="button">邮箱设置</a>
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
					    <div id="collapseTwo" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1" class="btn btn-default" role="button">借款列表</a>
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting" class="btn btn-default" role="button">还款管理</a>
							  <a href="${ctx}/borrowingLoan/memberStatistics.htm?&memberId=${currentMember.memberId}" class="btn btn-info" role="button">贷款统计</a>
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
					      	  <a href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-info" role="button">我的投标</a>
					      	  <a href="${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?&p=1&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我关注的借款</a>
					      	  <a href="#" class="btn btn-default" role="button">投资统计</a>
					      	  <a href="#" class="btn btn-default" role="button">自动投标</a> 
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">会员中心 / 借款管理 / 借款统计</h3>
				  </div>
				  <div class="panel-body">
			          <div>
				          <table class="table table-bordered">
				          	<thead>
					          <tr>
					            <th colspan="9" style="text-align: center;" >还款统计</th>
					          </tr>
					        </thead>
				          	<tbody>
						          <tr>
						            <td>总借款额</td> 
						            <td>发布借款数</td>
						            <td>已还本息</td>
						            <td>成功借款数</td>
						            <td>借款总笔数统计</td>
						            <td>待还本息</td>
						            <td>正常还清笔数</td>
						            <td>提前还清笔数</td>
						            <td>未还清笔数</td>
						          </tr>
						          <tr>
						            <td>￥${memberStatisticsDate.totalBorrowings}</td>
						            <td>${memberStatisticsDate.borrowSuccess}</td>
						            <td>￥${memberStatisticsDate.alreadyTotal}</td>
						            <td>${memberStatisticsDate.borrowSuccess}</td>
						            <td>${memberStatisticsDate.totalBorrowings}</td>
						            <td>￥${memberStatisticsDate.waitAlsoTotal}</td>
						            <td>${memberStatisticsDate.totalBorrowings}</td>
						            <td>${memberStatisticsDate.totalBorrowings}</td>
						            <td>${memberStatisticsDate.totalBorrowings}</td>
						          </tr>
					      	</tbody>
					      </table>
					      <table class="table table-bordered">
				          	<thead>
					          <tr>
					            <th colspan="4" style="text-align: center;" >逾期统计</th>
					          </tr>
					        </thead>
				          	<tbody>
						          <tr>
						            <td>逾期本息</td> 
						            <td>逾期次数</td>
						            <td>逾期罚款</td>
						            <td>严重逾期次数</td>
						          </tr>
						          <tr>
						            <td>￥${memberStatisticsDate.alreadyTotal}</td>
						            <td>￥${memberStatisticsDate.totalBorrowings}</td>
						            <td>￥${memberStatisticsDate.totalBorrowings}</td>
						            <td>￥${memberStatisticsDate.totalBorrowings}</td>
						          </tr>
					      	</tbody>
					      </table>
				      </div>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->

  </body>
</html>