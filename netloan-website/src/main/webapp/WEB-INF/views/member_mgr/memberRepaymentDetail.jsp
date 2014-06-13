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
					          <a href="${ctx}/financeMember/rechargeWithdraw.htm?p=1" class="btn btn-default" role="button">充值提现</a>
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
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=firstAudit" class="btn btn-default" role="button">已发布的借款</a>
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting" class="btn btn-info" role="button">还款管理</a>
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
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我的投标</a>
					      	  <a href="${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?&p=1&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我关注的借款</a>
					      	  <a href="${ctx}/bankingStatistics/memberBankingStatistics.htm?&memberId=${currentMember.memberId}" class="btn btn-default" role="button">投资统计</a>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">会员中心 / 借款管理 / 还款明细管理</h3>
				  </div>
				  <div class="panel-body">

			  		  <table class="table table-bordered">
			          	<thead>
				          <tr>
				            <th colspan="4">还款明细</th>
				          </tr>
				        </thead>
			          	<tbody>
				          <tr>
				            <td>标题：</td>
				            <td>${borrowingLoan.loanTitle}</td>
				            <td>借款金额：</td>
				            <td>${borrowingLoan.loanTotal}</td>
				          </tr>
				          <tr>
				            <td>借款利率：</td>
				            <td>${borrowingLoan.loanApr}</td>
				            <td>借款期限：</td>
				            <td>${borrowingLoan.loanDeadlinesId}</td>
				          </tr>
				          <tr>
				            <td>还款方式：</td>
				            <td>${borrowingLoan.repaymentTypeDisplay}</td>
				            <td>借款时间：</td>
				            <td><fmt:formatDate value="${borrowingLoan.loanDate}" type="date"/></td>
				          </tr>
				      	</tbody>
				      </table>
			  		
	  				  <table class="table table-bordered">
			          	<thead>
				          <tr>
				            <th>计划还款日期</th>
				            <th>计划还款本息</th>
				            <th>实还日期</th>
				            <th>逾期天数</th>
				            <th>实还本息</th>
				            <th>逾期罚息</th>
				            <th>总还款金额</th>
				            <th>状态</th>
				            <th>操作</th>
				          </tr>
				        </thead>
			          	<tbody>
			          		<c:forEach items="${repaymentNotesDetailsDatas.rows}" var="repaymentNotesDetails" varStatus="status">
					          <tr>
					            <td><fmt:formatDate value="${repaymentNotesDetails.shouldPayDate}" type="date"/></td>
					            <td>${repaymentNotesDetails.currentPayMoeny}</td>
					            <td><fmt:formatDate value="${repaymentNotesDetails.actualPayDate}" type="date"/></td>
					            <td>${repaymentNotesDetails.overdueDays}</td>
					            <td>${repaymentNotesDetails.actualPayMoney}</td>
					            <td>${repaymentNotesDetails.overdueInterest}</td>
					            <td>${repaymentNotesDetails.actualPayMoney}</td>
					            <td><span id="repaymentNotesDetails_repayState${status.index}"></span>
						        		<script type="text/javascript">
								       		$('#repaymentNotesDetails_repayState'+${status.index}).html(renderGridValue('${repaymentNotesDetails.repayState}',fields.repayDetailState));
								    	</script>
								</td>
					            <td><a href="${ctx}/repaymentNotesDetail/conductRepayment.htm?&loanId=${borrowingLoan.loanId}&memberId=${currentMember.memberId}&repayNotesDetailId=${repaymentNotesDetails.repayNotesDetailId}">还款</a></td>
					          </tr>
				      		</c:forEach>
				      	</tbody>
				      	<tfoot>
				          <tr>
				            <th colspan="9">
				            	<div align="right">
									<ul id='pageRepaymentNotesDetails'></ul>
								</div>
							</th>
				          </tr>
				        </tfoot>
				      </table>
				  
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->

<!-- 分页显示表格数据 -->
<script type="text/javascript">


	$(function(){
		//获得浏览器参数
		$.extend({
			getUrlVars: function(){
				var vars = [], hash;
				var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
				for(var i = 0; i < hashes.length; i++){
					hash = hashes[i].split('=');
					vars.push(hash[0]);
					vars[hash[0]] = hash[1];
				}
				return vars;
			},
			getUrlVar: function(name){
				return $.getUrlVars()[name];
			}
		});
	
	//封装浏览器参数
	var composeUrlParams=function(){
		var param='';
		$.each($.getUrlVars(), function(i, item) {
			if(item!='p'){
				var val=$.getUrlVar(item);
				if(val) param += "&" + item+"="+val;
			}
		});
		return param;
	}
	
	var element = $('#pageRepaymentNotesDetails');
	
	//设置分页的总页数
	var total=${repaymentNotesDetailsDatas.total}/10;
	if(parseInt(total)==total){
		var total = parseInt(total);
	}else {
		var total = parseInt(total)+1;
	}
	
	var options = {
	    bootstrapMajorVersion:3,
	    currentPage: ${repaymentNotesDetailsDatas.p},
	    numberOfPages: 5,
	    totalPages:total,
	    pageUrl: function(type, page, current){
	    	return "${ctx}/borrowingLoan/memberRepaymentDetail.htm?"+composeUrlParams()+"&p="+page;
	    	}
	}
	
	element.bootstrapPaginator(options);
	})
</script>

  </body>
</html>