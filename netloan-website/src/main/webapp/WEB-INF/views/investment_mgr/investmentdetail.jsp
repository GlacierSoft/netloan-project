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
		    <h3 class="panel-title">标的详情</h3>
		  </div>
		  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
		  	<div class="row">
			  <div class="col-md-3">
			   <table class="table" style="background:#ECF1EF;; vertical-align: middle;border: 1px solid #DDDDDD;">
			        	<tr>
			        		<td style="padding-left: 20px;"><img src="${borrowingMember.memberPhoto}" style="width: 100px;height: 100px ;"/></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>会员等级:</span><img id="creditPhotoDivImg"  src="${borrowingMember.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>用 户 名:</span>${borrowingMember.memberName}</td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>籍　　贯:</span>${borrowingMember.hometown}</td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>居住城市:</span>${borrowingMember.liveAddress}</td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>注册时间:</span><fmt:formatDate value="${borrowingMember.registrationTime}" type="both"/></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>最后登录:</span><fmt:formatDate value="${borrowingMember.lastLoginTime}" type="both"/></td>
			        	</tr>
			        </table>
			  </div>
			  <div class="col-md-9" >
	       	  	<h3 style="color: #696969;"><strong>项目名称：${borrowingLoan.loanTitle}</strong></h3>
	       	  	<span>借款金额：</span><fmt:formatNumber value="${borrowingLoan.loanTotal }" pattern="#,#00.00"/>元
	       	  	<span>借款目的：</span>${borrowingLoan.loanPurposeId }
	       	  	<img src="${ctx}/resources/images/borrow/investment.jpg" alt="investment">
			  </div>
			</div>
		     <form id="borrowingConditionsForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/investment/index.htm?&p=1" >
		      <div class="form-group">
			    <label for="loanTitle" class="col-sm-1 control-label" >关键字</label>
			    <div class="col-sm-3">
			      <input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${borrowingLoanQueryDTO.loanTitle}"  placeholder="借款标题"  />
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
			    <label for="loanPurposeId" class="col-sm-1 control-label" >借款目的</label>
			    <div class="col-sm-3">
			       <select class="form-control col-sm-3" name="loanPurposeId" id="loanPurposeId" >
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
			      <select class="form-control col-sm-2" name="loanTotalStart" id="loanTotalStart">
					  <option value="0">--请选择--</option>
					    <option value="50.0">50</option>
					    <option value="1000.0">1000</option>
					    <option value="5000.0">5000</option>
					    <option value="10000.0">1万</option>
					    <option value="50000.0">5万</option>
					    <option value="100000.0">10万</option>
					    <option value="200000.0">20万</option>
					    <option value="500000.0">50万</option>
					    <option value="1000000.0">100万</option>
					    <option value="1000001.0">100万以上</option>
					</select>
			    </div>
			    <span style="float: left;">至</span>
			    <div class="col-sm-2">
			     <select class="form-control col-sm-2" name="loanTotalEnd" id="loanTotalEnd" >
					    <option value="0">--请选择--</option>
					    <option value="50.0">50</option>
					    <option value="1000.0">1000</option>
					    <option value="5000.0">5000</option>
					    <option value="10000.0">1万</option>
					    <option value="50000.0">5万</option>
					    <option value="100000.0">10万</option>
					    <option value="200000.0">20万</option>
					    <option value="500000.0">50万</option>
					    <option value="1000000.0">100万</option>
					    <option value="1000001.0">100万以上</option>
					</select>
			    </div>
			    <label for="waitBidDeadlines" class="col-sm-1 control-label" >期限</label>
			    <div class="col-sm-2">
			       <input type="text" class="form-control" id="waitBidDeadlines" name="waitBidDeadlines" value="${borrowingLoanQueryDTO.waitBidDeadlines }" placeholder="筹标期限"  />
			    </div>
			    <label for="cardId" class="col-sm-1 control-label" >奖励</label>
			    <div class="col-sm-2">
			       <select class="form-control col-sm-3" name="educational" id="educational" >
					  <option value="">--请选择--</option>
					    <option value="按投标金额比例奖励">按投标金额比例奖励</option>
					    <option value="按固定金额分摊奖">按固定金额分摊奖励</option>
					</select>
			    </div>
			  </div>
			   <div class="form-group">
			    <div class="col-sm-3"></div>
			    <div class="col-sm-3 text-center"><button id="borrowingConditionsFormButton" type="submit" class="btn btn-primary btn-lg btn-block">搜&nbsp;&nbsp;索</button></div>
			    <div class="col-sm-3"><button id="borrowingConditionsFormButton" type="reset" class="btn btn-primary btn-lg btn-block">重&nbsp;&nbsp;置</button></div>
			    <div class="col-sm-3"></div>
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
				    <div style="padding-top:10px;padding-bottom: 20px;">
					<a href="${ctx}/investment/index.htm?&p=1" class="btn btn-primary" role="button">全部借款</a></li>
				    <a href="${ctx}/investment/index.htm?&p=1&loanState=secondAuditor" class="btn btn-primary" role="button">复审中的借款</a>
				    <a href="${ctx}/investment/index.htm?&p=1&loanState=repaymenting" class="btn btn-primary" role="button">还款中的借款</a>
				    <a href="${ctx}/investment/index.htm?&p=1&loanState=completed" class="btn btn-primary" role="button">已完成的借款</a>
				    <a href="${ctx}/investment/index.htm?&p=1&loanState=completed" class="btn btn-primary" role="button">逾期的黑名单</a>
				    <div style="float: right;">
					    <span>排序：</span>
					    <a id="pageloanTotal" href="${ctx}/investment/index.htm?&p=1&pagetype=loanTotal" class="btn btn-info btn-sm" role="button">金额</a>
					    <a id="pagecredit" href="${ctx}/investment/index.htm?&p=1&pagetype=credit" class="btn btn-info btn-sm" role="button">信用</a>
					    <a id="pageloanApr" href="${ctx}/investment/index.htm?&p=1&pagetype=loanApr" class="btn btn-info btn-sm" role="button">利率</a>
				    </div>
				  	</div>
				  	<table class="table" style="width:900px;padding: 10px;">
			        <c:if test="${empty borrowingDatas.rows}">
					<tr>
			            <td colspan="5"><strong>暂无信息</strong></td>
			          </tr>
					</c:if>	  		
					<c:if test="${!empty borrowingDatas.rows}">  	
					<c:forEach items="${borrowingDatas.rows}" var="borrowingLoan" varStatus="status">
			        	<tr>
			        	<td rowspan="4" style="text-align:center;vertical-align: middle;"><img src="${borrowingLoan.loanPicture}" style="width: 100px;height: 100px ;"/></td>
			        	<td colspan="4">${borrowingLoan.loanTitle }</td>
			        	<td rowspan="4"style="text-align:center;vertical-align: middle;">
			        	<button  id="borrowingLoan_loanState${status.index}"  type=button class="btn btn-primary btn-lg btn-block"></button>
			        	<script type="text/javascript">
					       $('#borrowingLoan_loanState'+${status.index}).html(renderGridValue('${borrowingLoan.loanState }',fields.loanState));
					    </script>
			        	</td>
			        	</tr>
			        	<tr>
			        		<td>借款金额：${borrowingLoan.loanTotal }元</td>
			        		<td>利率：${borrowingLoan.loanApr }%/ 年</td>
			        		<td>投标奖：0.00 元</td>
			        		<td>招标期限：${borrowingLoan.waitBidDeadlines } 个月</td>
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
			        		<td>投标的状态：<span id="borrowingLoan_loanState2${status.index}"></span>
			        		<script type="text/javascript">
					       		$('#borrowingLoan_loanState2'+${status.index}).html(renderGridValue('${borrowingLoan.loanState }',fields.loanState));
					    	</script>
			        		</td>
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
  if("${borrowingLoanQueryDTO.loanPurposeId }" != ''){
		$("#loanPurposeId").val("${borrowingLoanQueryDTO.loanPurposeId }");	
	}	
  if("${borrowingLoanQueryDTO.loanTotalStart }" != 0.0){
  		$("#loanTotalStart").val("${borrowingLoanQueryDTO.loanTotalStart }");	
  	}
  	if("${borrowingLoanQueryDTO.loanTotalEnd }" != 0.0){
		$("#loanTotalEnd").val("${borrowingLoanQueryDTO.loanTotalEnd }");	
	}
  	/*  $("#pageloanTotal").toggle(
  		  function () {
  		    $(this).prop("href","${ctx}/investment/index.htm?&p=1&pagetype=riseloanTotal");
  		  },
  		  function () {
  			$(this).prop("href","${ctx}/investment/index.htm?&p=1&pagetype=dowloanTotal");
  		  }
  		);  */
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
