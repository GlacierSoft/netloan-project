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
				    <h3 class="panel-title">会员中心 / 借款管理 / 还款管理</h3>
				  </div>
				  <div class="panel-body">
				  			
			  		<div style="padding-top:10px;padding-bottom: 20px;">
				  		<c:choose>
						   <c:when test="${buttonState == 'repaymenting'}">  
						   	<a id="repaymenting" href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting" class="btn btn-success" role="button">正在还款的借款</a>
						   	<a id="completed" href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=completed" class="btn btn-primary" role="button">已还完的借款</a>
						   	<div class="panel panel-default">
							  <div class="panel-heading">
							    <h4 class="panel-title"><strong>条件筛选</strong></h3>
							  </div>
							  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
							     <form id="repaymentingBorrowForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting" >
							      <div class="form-group">
							      	
							        <label for="cardId" class="col-sm-2 control-label" >发布时间</label>
								    <div class="col-sm-4">
									    <div class="input-group date form_datetime" data-link-field="dtp_input1">
						                    <input id="createStartTime" name="createStartTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${borrowingLoanQueryDTO.createStartTime}" type="both"/>" readonly>
						                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
											<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
						                </div>
							      		<input type="hidden" id="dtp_input3" name="memberId" value="${currentMember.memberId}" />
								    </div>
								    <label for="cardId" class="col-sm-1 control-label" style="text-align:center;vertical-align: middle;">到</label>
								    <div class="col-sm-4">
								    	<div class="input-group date form_datetime" data-link-field="dtp_input1">
						                    <input id="createEndTime" name="createEndTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${borrowingLoanQueryDTO.createEndTime}" type="both"/>" readonly>
						                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
											<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
						                </div>
								    </div>
								    <label for="cardId" class="col-sm-1 control-label" ></label>
								  </div>
								   <div class="form-group">
								    <label for="loanTitle" class="col-sm-1 control-label" >标题</label>
								    <div class="col-sm-3"><input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${borrowingLoanQueryDTO.loanTitle}"  placeholder="借款标题"  /></div>
								    <div class="col-sm-3 text-center"><button id="repaymentingBorrowFormButton" type="submit" class="btn btn-primary btn-lg btn-block">查&nbsp;&nbsp;询</button></div>
								    <div class="col-sm-3">
								    <a id="repaymentingBorrowFormButtonReset" href="javascript:void(0);" class="btn btn-primary btn-lg btn-block" data-options="" onclick="">重置条件</a>
								    </div>
								  	<div class="col-sm-2"></div>
								  	</div>
							     </form>
							  </div>
						  	</div>
						  	<div>
					          <table class="table table-hover">
					          	<thead>
						          <tr>
						            <th>借款标题</th>
						            <th>借款类型</th>
						            <th>还款方式</th>
						            <th>借款金额</th>
						            <th>年利率</th>
						            <th>借款时间</th>
						            <th>偿还本息</th>
						            <th>已还本息</th>
						            <th>未还本息</th>
						            <th>操作</th>
						          </tr>
						        </thead>
					          	<tbody>
					          		<c:forEach items="${borrowingDatas.rows}" var="borrowingLoan" varStatus="status">
							          <tr>
							            <td>${borrowingLoan.loanTitle}</td>
							            <td>${borrowingLoan.loanTenderDisplay}</td>
							            <td>${borrowingLoan.repaymentTypeDisplay}</td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td>${borrowingLoan.loanApr}</td>
							            <td><fmt:formatDate value="${borrowingLoan.createTime}" type="date"/></td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td><a href="${ctx}/borrowingLoan/memberRepaymentDetail.htm?&loanId=${borrowingLoan.loanId}">还款明细</a></td>
							          </tr>
						      		</c:forEach>
						      	</tbody>
						      	<tfoot>
						          <tr>
						            <th colspan="10">
						            	<div align="right">
										    <ul id='pageBorrows'></ul>
										</div>
									</th>
						          </tr>
						        </tfoot>
						      </table>
					        </div>
						   </c:when>
						   <c:when test="${buttonState == 'completed'}">  
						    <a id="repaymenting" href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=repaymenting" class="btn btn-primary" role="button">正在还款的借款</a>
						   	<a id="completed" href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=completed" class="btn btn-success" role="button">已还完的借款</a>
						   	<div class="panel panel-default">
							  <div class="panel-heading">
							    <h4 class="panel-title"><strong>条件筛选</strong></h3>
							  </div>
							  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
							     <form id="completedBorrowForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=completed" >
							      <div class="form-group">
							      	
							        <label for="cardId" class="col-sm-2 control-label" >发布时间</label>
								    <div class="col-sm-4">
									    <div class="input-group date form_datetime" data-link-field="dtp_input1">
						                    <input id="createStartTime" name="createStartTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${borrowingLoanQueryDTO.createStartTime}" type="both"/>" readonly>
						                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
											<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
						                </div>
							      		<input type="hidden" id="dtp_input3" name="memberId" value="${currentMember.memberId}" />
								    </div>
								    <label for="cardId" class="col-sm-1 control-label" style="text-align:center;vertical-align: middle;">到</label>
								    <div class="col-sm-4">
								    	<div class="input-group date form_datetime" data-link-field="dtp_input1">
						                    <input id="createEndTime" name="createEndTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${borrowingLoanQueryDTO.createEndTime}" type="both"/>" readonly>
						                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
											<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
						                </div>
								    </div>
								    <label for="cardId" class="col-sm-1 control-label" ></label>
								  </div>
								   <div class="form-group">
								    <label for="loanTitle" class="col-sm-1 control-label" >标题</label>
								    <div class="col-sm-3"><input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${borrowingLoanQueryDTO.loanTitle}"  placeholder="借款标题"  /></div>
								    <div class="col-sm-3 text-center"><button id="completedBorrowFormButton" type="submit" class="btn btn-primary btn-lg btn-block">查&nbsp;&nbsp;询</button></div>
								    <div class="col-sm-3">
								    <a id="completedBorrowFormButtonReset" href="javascript:void(0);" class="btn btn-primary btn-lg btn-block" data-options="" onclick="">重置条件</a>
								    </div>
								  	<div class="col-sm-2"></div>
								  	</div>
							     </form>
							  </div>
						  	</div>
						  	<div>
					          <table class="table table-hover">
					          	<thead>
						          <tr>
						            <th>借款标题</th>
						            <th>借款类型</th>
						            <th>还款方式</th>
						            <th>借款金额</th>
						            <th>年利率</th>
						            <th>借款时间</th>
						            <th>偿还本息</th>
						            <th>已还本息</th>
						            <th>未还本息</th>
						            <th>借款状态</th>
						          </tr>
						        </thead>
					          	<tbody>
					          		<c:forEach items="${borrowingDatas.rows}" var="borrowingLoan" varStatus="status">
							          <tr>
							            <td>${borrowingLoan.loanTitle}</td>
							            <td>${borrowingLoan.loanTenderDisplay}</td>
							            <td>${borrowingLoan.repaymentTypeDisplay}</td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td>${borrowingLoan.loanApr}</td>
							            <td><fmt:formatDate value="${borrowingLoan.createTime}" type="date"/></td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td>${borrowingLoan.loanTotal}</td>
							            <td>
							            	<span id="borrowingLoan_loanState2${status.index}"></span>
							        		<script type="text/javascript">
									       		$('#borrowingLoan_loanState2'+${status.index}).html(renderGridValue('${borrowingLoan.loanState }',fields.loanState));
									    	</script>
						    			</td>
							          </tr>
						      		</c:forEach>
						      	</tbody>
						      	<tfoot>
						          <tr>
						            <th colspan="10">
						            	<div align="right">
										    <ul id='pageBorrows'></ul>
										</div>
									</th>
						          </tr>
						        </tfoot>
						      </table>
					        </div>
						   </c:when>
						</c:choose>
				  	</div>
				  
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

	//bootstrap日期控件
	$(".form_datetime").datetimepicker({
		language:  'zh-CN',
	    format: "yyyy-mm-dd",
	    autoclose: true,
	    todayBtn: true,
	    todayHighlight: true,
	    minView: 2,
	    pickerPosition: "bottom-left"
	});

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
	
	var element = $('#pageBorrows');
	
	//设置分页的总页数
	var total=${borrowingDatas.total}/10;
	if(parseInt(total)==total){
		var total = parseInt(total);
	}else {
		var total = parseInt(total)+1;
	}
	
	var options = {
	    bootstrapMajorVersion:3,
	    currentPage: ${borrowingDatas.p},
	    numberOfPages: 5,
	    totalPages:total,
	    pageUrl: function(type, page, current){
	    	return "${ctx}/borrowingLoan/memberBorrow.htm?"+composeUrlParams()+"&p="+page;
	    	}
	}
	
	element.bootstrapPaginator(options);
	})
</script>

  </body>
</html>