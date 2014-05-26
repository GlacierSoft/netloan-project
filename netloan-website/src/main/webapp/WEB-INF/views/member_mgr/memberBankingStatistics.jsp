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
							  <a href="${ctx}/attentionBorrowing/intoMessageNotice.htm?&p=1" class="btn btn-default" role="button">站内信</a>
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
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1" class="btn btn-default" role="button">借款列表</a>
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting" class="btn btn-default" role="button">还款管理</a>
							  <a href="${ctx}/borrowingLoan/memberStatistics.htm?&memberId=${currentMember.memberId}" class="btn btn-default" role="button">贷款统计</a>
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
					    <div id="collapseThree" class="panel-collapse collapse in">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我的投标</a>
					      	  <a href="${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?&p=1&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我关注的借款</a>
					      	  <a href="${ctx}/bankingStatistics/memberBankingStatistics.htm?&memberId=${currentMember.memberId}" class="btn btn-info" role="button">投资统计</a>
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
				    <h3 class="panel-title">投资统计</h3>
				  </div>
				  <div class="panel-body">
					  <div id="attentionBorrowingList">
					  <table id="attentionBorrowingTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td colspan="3">回报统计</td>
				            </tr>
				  		</thead>
				         	<tbody>
								<tr>
									<td>已赚利息</td>
				              		<td>奖励收入总额</td>
				              		<td>已赚逾期罚息</td>
								</tr>
								<tr>
									<td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.alrReceInterest}" pattern="#,#00.00元"/></td>
				              		<td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.alrReceInterest}" pattern="#,#00.00元"/></td>
				              		<td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.alrOverdueInterest}" pattern="#,#00.00元"/></td>
								</tr>
				            </tbody>
				        </table>
						 <table id="attentionBorrowingTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td colspan="6">个人理财统计</td>
				            </tr>
				  		</thead>
				         	<tbody>
								<tr>
									<td>总借出金额</td>
				              		<td>总借出笔数</td>
				              		<td>已回收本息</td>
				              		<td>已回收笔数</td>
				              		<td>待回收本息</td>
				              		<td>待回收笔数</td>
								</tr>
								<tr>
									<td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.totalBorrowMoney}" pattern="#,#00.00元"/></td>
				              		<%-- <td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.totalBorrowNum}" pattern="#,#00.00"/></td> --%>
				              		<td>${requestScope.MemberBankingStatistics.totalBorrowNum}</td>
				              		<td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.alrReceMoney}" pattern="#,#00.00元"/></td>
				              		<%-- <td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.alrReceNum}" pattern="#,#00.00"/></td> --%>
				              		<td>${requestScope.MemberBankingStatistics.alrReceNum}</td>
				              		<td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.nextAll}" pattern="#,#00.00元"/></td>
				              		<%-- <td><fmt:formatNumber value="${requestScope.MemberBankingStatistics.nextReceNum}" pattern="#,#00.00"/></td> --%>
				              		<td>${requestScope.MemberBankingStatistics.nextReceNum}</td>
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
  	<script type="text/javascript">
  
	</script>
</html>