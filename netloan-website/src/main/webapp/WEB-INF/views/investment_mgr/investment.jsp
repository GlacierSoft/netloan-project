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
	    <div class="panel panel-default">
		  <div class="panel-heading">
		    <h3 class="panel-title">借款条件筛选</h3>
		  </div>
		  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
		     <form id="borrowingConditionsForm"  class=" form-horizontal" role="form"  method="post" >
		      <div class="form-group">
			    <label for="cardId" class="col-sm-1 control-label" >关键字</label>
			    <div class="col-sm-3">
			      <input type="text" class="form-control" id="cardId" name="cardId" value=""  placeholder="身份证"  >
			    </div>
			    <label for="cardId" class="col-sm-1 control-label" >还款方式</label>
			    <div class="col-sm-3">
			       <select  class="form-control col-sm-3" name="repaymentTypeId" id="repaymentTypeId">
					    <option value="">--请选择--</option>
					    <option value="1">等额本息</option>
					    <option value="2">按月付息，到期还本</option>
					    <option value="4">一次性还款</option>
					</select>
			    </div>
			    <label for="cardId" class="col-sm-1 control-label" >借款目的</label>
			    <div class="col-sm-3">
			       <select class="form-control col-sm-3" name="educational" id="educational" >
					  <option value="">--请选择--</option>
					    <option value="长期使用">长期使用</option>
					    <option value="资金周转">资金周转</option>
					    <option value="短期周转">短期周转</option>
					    <option value="创业借款">创业借款</option>
					    <option value="其他借款">其他借款</option>
					    <option value="普通借款">普通借款</option>
					    <option value="随便玩玩">随便玩玩</option>
					</select>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="cardId" class="col-sm-1 control-label" >金额范围</label>
			    <div class="col-sm-2">
			      <select class="form-control col-sm-2" name="educational" id="educational" >
					  <option value="">--请选择--</option>
					    <option value="50">50</option>
					    <option value="1000">1000</option>
					    <option value="5000">5000</option>
					    <option value="1万">1万</option>
					    <option value="5万">5万</option>
					    <option value="10万">10万</option>
					    <option value="20万">20万</option>
					    <option value="50万">50万</option>
					    <option value="100万">100万</option>
					    <option value="100万以上">100万以上</option>
					</select>
			    </div>
			    <span style="float: left;">至</span>
			    <div class="col-sm-2">
			     <select class="form-control col-sm-2" name="educational" id="educational" >
					  <option value="">--请选择--</option>
					    <option value="50">50</option>
					    <option value="1000">1000</option>
					    <option value="5000">5000</option>
					    <option value="1万">1万</option>
					    <option value="5万">5万</option>
					    <option value="10万">10万</option>
					    <option value="20万">20万</option>
					    <option value="50万">50万</option>
					    <option value="100万">100万</option>
					    <option value="100万以上">100万以上</option>
					</select>
			    </div>
			    <label for="cardId" class="col-sm-1 control-label" >期限</label>
			    <div class="col-sm-2">
			       <input type="text" class="form-control" id="cardId" name="cardId" value=""  placeholder="身份证"  >
			    </div>
			    <label for="cardId" class="col-sm-1 control-label" >奖励</label>
			    <div class="col-sm-2">
			       <select class="form-control col-sm-3" name="educational" id="educational" >
					  <option value="">--请选择--</option>
					    <option value="长期使用">按投标金额比例奖励</option>
					    <option value="资金周转">按固定金额分摊奖励</option>
					</select>
			    </div>
			  </div>
			   <div class="form-group">
			    <div class="col-sm-4"></div>
			    <div class="col-sm-4 text-center">
			      <button id="onlyPost" type="submit" class="btn btn-primary btn-lg btn-block">搜&nbsp;&nbsp;&nbsp;索</button>
			    </div>
			    <div class="col-sm-4"></div>
			  	</div>
		     </form>
		  </div>
		</div>
	    <div class="row">
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">借款列表</h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				      <div class="bs-example bs-example-tabs">
				      <ul id="myTab" class="nav nav-tabs">
				        <%-- <li class="active"><a href="${ctx}/investment/index.htm?&p=1" data-toggle="tab">全部借款</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=secondAuditor" data-toggle="tab">复审中的借款</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=repaymenting" data-toggle="tab">还款中的借款</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=completed" data-toggle="tab">已完成的借款</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=repaymenting" data-toggle="tab">逾期的黑名单</a></li> --%>
				        <li><a href="${ctx}/investment/index.htm?&p=1" class="btn btn-primary" role="button">全部借款</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=secondAuditor" class="btn btn-primary" role="button">复审中的借款</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=repaymenting" class="btn btn-primary" role="button">还款中的借款</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=completed" class="btn btn-primary" role="button">逾期的黑名单</a></li>
				        <li><a href="${ctx}/investment/index.htm?&p=1&loanState=repaymenting" class="btn btn-primary" role="button">已完成的借款</a></li>
				      </ul>
				      	<ul>
				       
				        </ul>
				      <div id="myTabContent" class="tab-content">
				        <div class="tab-pane fade in active" id="allBorrowing">
				        <br>
					        <table class="table" style="width:900px;padding: 10px;">
					        <c:if test="${empty borrowingDatas.rows}">
							<tr>
					            <td colspan="5"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty borrowingDatas.rows}">  	
							<c:forEach items="${borrowingDatas.rows}" var="borrowingLoan" varStatus="status">
					        	<tr>
					        	<td rowspan="4"><img src="${currentMember.memberPhoto}" style="width: 100px;height: 100px ;"/></td>
					        	<td colspan="4">${borrowingLoan.loanTitle }</td>
					        	</tr>
					        	<tr>
					        		<td>借款金额：${borrowingLoan.loanTotal }元</td>
					        		<td>利率：${borrowingLoan.loanApr }/ 年</td>
					        		<td>投标奖：0.00 元</td>
					        		<td>招标期限：${borrowingLoan.waitBidDeadlines } 个月</td>
					        		<td rowspan="3" style="text-align:center;vertical-align: middle;"><button id="onlyPost" type="submit" class="btn btn-primary btn-lg btn-block">${borrowingLoan.loanState }</button></td>
					        	</tr>
					        	<tr>
					        		<td>发布者：${borrowingLoan.memberDisplay } </td>
					        		<td>${borrowingLoan.loanPurposeId }</td>
					        		<td>已完成投标：10000 元</td>
					        		<td>投资完成：100.00%</td>
					        	</tr>
					        	<tr>
					        		<td>信用等级：3级</td>
					        		<td>按月分期还款</td>
					        		<td>投标的状态：还款中</td>
					        		<td>图片</td>
					        	</tr>
					        	</c:forEach>
					      		</c:if>	
					      		<c:if test="${!empty borrowingDatas.rows}">
					        	<tfoot>
						          <tr>
						            <th colspan="6">
						            	<div align="right">
										    <ul id='pageborrowingLoan'></ul>
										</div>
									</th>
						          </tr>
						        </tfoot>
						        </c:if>	  
					        </table>
				        </div>
				        <div class="tab-pane fade" id="profile">
				          <p>Food truck fixie locavore, accusamus mcsweeney's marfatown, tumblr butcher vero sint qui sapiente accusamus tattooed echo park.</p>
				        </div>
				      </div>
				    </div><!-- /example -->
				    
				  </div>
				</div>
	    	</div>
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
					          <a href="${ctx}/member/index.htm" class="btn btn-info" role="button">我的主页</a>
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
					    <div id="collapseTwo" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
							  <a href="#" class="btn btn-default" role="button">借款列表</a>
							  <a href="#" class="btn btn-default" role="button">还款管理</a>
							  <a href="#" class="btn btn-default" role="button">贷款统计</a>
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
	    	
	    </div>
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->
  </body>
  <script type="text/javascript">
	  <!-- 分页显示表格数据 开始 -->
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
					//console.log(vars);
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
			//获取p参数，也就是第几页,不是分页功能的代码，
			$.each($.getUrlVars(), function(i, item) {
				if(item=='p'){
					valp=$.getUrlVar(item);
					return false;
				}
			});
			//到这里结束，这部分不是分页代码
			return param;
		}
		
		var elementpageborrowingLoan = $('#pageborrowingLoan');
		
		//积分的设置分页的总页数
		var totalmessageNotice=${borrowingDatas.total}/10;
		if(parseInt(totalmessageNotice)==totalmessageNotice){
			var totalmessageNotice = parseInt(totalmessageNotice);
		}else {
			var totalmessageNotice = parseInt(totalmessageNotice)+1;
		}
		var messageNoticeOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${borrowingDatas.p},
		    numberOfPages: 10,
		    totalPages:totalmessageNotice,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/investment/index.htm?"+composeUrlParams()+"&p="+page;
		    	}
		}
		elementpageborrowingLoan.bootstrapPaginator(messageNoticeOptions);
		})
	<!-- 分页显示表格数据 结束 -->
  </script>
</html>
