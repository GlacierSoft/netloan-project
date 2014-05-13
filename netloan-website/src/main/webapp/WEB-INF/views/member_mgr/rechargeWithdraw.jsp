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
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
					          <a href="#" class="btn btn-info" role="button">充值提现</a>
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
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="#" class="btn btn-default" role="button">我的投标</a>
					      	  <a href="#" class="btn btn-default" role="button">我关注的借款</a>
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
				    <h3 class="panel-title">充值提现</h3>
				  </div>
				  <div class="panel-body">
				  
				  
				    <div class="bs-example bs-example-tabs">
				      <ul id="myTab" class="nav nav-tabs">
				        <li class="active"><a href="#finance" data-toggle="tab">资金记录</a></li>
				        <li><a href="#recharge" data-toggle="tab">充值</a></li>
				        <li><a href="#withdraw" data-toggle="tab">提现</a></li>
				      </ul>
				      <div id="myTabContent" class="tab-content">
				        <div class="tab-pane fade in active" id="finance">
				        
				        
				          <table class="table table-bordered">
				          	<tbody>
						          <tr>
						            <td>账号总额</td> 
						            <td>可用余额</td>
						            <td>冻结金额</td>
						          </tr>
						          <tr>
						            <td>￥${financeMemberData.amount}</td>
						            <td>￥${financeMemberData.usableMoney}</td>
						            <td>￥${financeMemberData.frozenMoney}</td>
						          </tr>
					      	</tbody>
					      </table>
					      <table class="table table-bordered">
				          	<thead>
					          <tr>
					            <th>交易类型</th>
					            <th>交易对方</th>
					            <th>收入金额</th>
					            <th>支出金额</th>
					            <th>可用余额</th>
					            <th>冻结余额</th>
					            <th>待收金额</th>
					            <th>总金额</th>
					            <th>交易时间</th>
					          </tr>
					        </thead>
				          	<tbody>
					          <c:forEach items="${financeTransactionDates.rows}" var="finTransaction">
						          <tr>
						            <td>${finTransaction.transactionType}</td>
						          	<td>${finTransaction.transactionTarget}</td>
						          	<td>${finTransaction.earningMoney}</td>
						          	<td>${finTransaction.expendMoney}</td>
						          	<td>${finTransaction.usableMoney}</td>
						          	<td>${finTransaction.frozenMoney}</td>
						          	<td>${finTransaction.collectingMoney}</td>
						          	<td>${finTransaction.amount}</td>
						          	<td><fmt:formatDate value="${finTransaction.createTime}" type="both"/></td>
						          </tr>
					      		</c:forEach>
					      	</tbody>
					      	<tfoot>
					          <tr>
					            <th colspan="9">
					            
					            	<div align="right">
									    <ul id='pagefinTransaction'></ul>
									</div>

								</th>
					          </tr>
					        </tfoot>
					      </table>
				        </div>
				        <div class="tab-pane fade" id="recharge">
				          <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore aesthetic magna delectus mollit. Keytar helvetica VHS salvia yr, vero magna velit sapiente labore stumptown. Vegan fanny pack odio cillum wes anderson 8-bit, sustainable jean shorts beard ut DIY ethical culpa terry richardson biodiesel. Art party scenester stumptown, tumblr butcher vero sint qui sapiente accusamus tattooed echo park.</p>
				        </div>
				        <div class="tab-pane fade" id="withdraw">
				          <p>Food truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk aliquip jean shorts ullamco ad vinyl cillum PBR. Homo nostrud organic, assumenda labore aesthetic magna delectus mollit. Keytar helvetica VHS salvia yr, vero magna velit sapiente labore stumptown. Vegan fanny pack odio cillum wes anderson 8-bit, sustainable jean shorts beard ut DIY ethical culpa terry richardson biodiesel. Art party scenester stumptown, tumblr butcher vero sint qui sapiente accusamus tattooed echo park.</p>
				        </div>
				      </div>
				    </div><!-- /example -->
				        
				        
				        
				        
				        
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
	
	var element = $('#pagefinTransaction');
	
	//设置分页的总页数
	var total=${financeTransactionDates.total}/5;
	if(parseInt(total)==total){
		var total = parseInt(total);
	}else {
		var total = parseInt(total)+1;
	}
	
	var options = {
	    bootstrapMajorVersion:3,
	    currentPage: ${financeTransactionDates.p},
	    numberOfPages: 5,
	    totalPages:total,
	    pageUrl: function(type, page, current){
	    	return "${ctx}/financeMember/rechargeWithdraw.htm?"+composeUrlParams()+"&p="+page;
	    }
	}
	
	element.bootstrapPaginator(options);
	})
</script>
 
  </body>
</html>