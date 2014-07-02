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
 <jsp:include page="../nav_mgr/navInvestment.jsp"/>
	    <!-- CONTAINER START======================== -->
	    <div class="container">
	    <div class="panel panel-default">
		  <div class="panel-heading">
		    <h3 class="panel-title"><strong>标的详情</strong></h3>
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
	       	  	<div>
	       	  	<h3 style="color: #696969;" ><strong>项目名称：${borrowingLoan.loanTitle}</strong>
	       	  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	       	  	<c:if test="${!empty currentMember.memberId}">
	       	  	<small id="attentionBorrowingClick"><a href="javascript:void(0);">关注此借款</a></small>
	       	  	</c:if>
	       	  	</h3>
	       	  	</div>
	       	  	<span>借款金额：</span><span style="color: red;font-size: 20px;"><fmt:formatNumber value="${borrowingLoan.loanTotal }" pattern="#,#00.00"/>元</span>
	       	  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	       	  	<span>借款目的：</span>${borrowingLoan.loanPurposeId }
	       	  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	       	  	<c:if test="${borrowingLoan.loanState == 'repaymenting' }">
				    <img src="${ctx}/resources/images/borrow/huankuanzhong.jpg" alt="investment">
	       	  	</c:if>
	       	  	<c:if test="${borrowingLoan.loanState == 'secondAuditor' }">
				    <img src="${ctx}/resources/images/borrow/fushenzhong.jpg" alt="investment">
	       	  	</c:if>
	       	  	<c:if test="${borrowingLoan.loanState == 'tendering' }">
		       	  	<a id="intoInvestment" href="${ctx}/investment/confirmInvestment.htm?loanId=${borrowingLoan.loanId }&memberId=${borrowingMember.memberId }&p=1">
				        <img src="${ctx}/resources/images/borrow/investment.jpg" alt="investment">
				    </a>
	       	  	</c:if>
	       	  	
	       	  	<div>
	       	  	<span>借款年利率：</span><fmt:formatNumber value="${borrowingLoan.loanApr}" pattern="#0.00%"/>（月利率：<fmt:formatNumber value="${borrowingLoan.loanApr/12}" pattern="#0.00%"/>）
	       	  	<!-- <script type="text/javascript">
	       	  		var monthLoanApr = "${borrowingLoan.loanApr }"/12;
	       	 		$("#monthLoanApr").html(monthLoanApr);
	       	  	</script> -->
	       	  	<span>借款期限：${borrowingLoan.loanDeadlinesId }个月</span>
	       	  	</div>
	       	  	<hr>
	       	  	<div class="row">
	       	  	<div class="col-md-3">还差：<span id="stillNeed"></span>元</div>
	       	  	<script type="text/javascript">
		        	if('${borrowingLoan.subTotal}' == '0.0'){
		        		$('#stillNeed').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrBidMoney}' pattern='#,#00.00'/>");
		        	}else{
		        		$('#stillNeed').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrSubSum*borrowingLoan.lowestSub}' pattern='#,#00.00'/>");

		        	}
		        </script>
	       	  	<div class="col-md-2" style="text-align:right;"><span>投标进度:</span></div>
		       	<div class="col-md-2" style="text-align:left;">
		       	  	<div class="progress" style="border: 1px solid red; width:100px;">
		        		<div id="progressBar" class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="<fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/>" aria-valuemin="0" aria-valuemax="100" style="  width: <fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/>%"></div>
		        		<!-- <div id="progressBar" class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%"></div>
		        		<script type="text/javascript">
				        	$('#progressBar').prop("aria-valuenow", '${borrowingLoan.alrTenderPro*100}');
				        	$('#progressBar').css({"width":"${borrowingLoan.alrTenderPro*100}%"});
				        </script> -->
					</div>
				</div>
				<div class="col-md-2" style="text-align:left;"><span><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/>%</span></div>
	       	  	</div>
	       	  	<div class="row">
	       	  	<div class="col-md-4"><span>还款方式：${borrowingLoan.repaymentTypeDisplay } </span></div>
	       	  	<div class="col-md-4"><span>投标奖励：无</span></div>
		       	<div class="col-md-4"><span>交易类型：线上交易</span></div>
	       	  	</div><br>
	       	  	<div class="row">
	       	  	<div class="col-md-4"><span>
	       	  	最小投标金额： 
	       	  	<c:if test="${empty borrowingLoan.lowestBidMoney }">没有限制</c:if>
	       	  	<c:if test="${!empty borrowingLoan.lowestBidMoney }"><fmt:formatNumber value="${borrowingLoan.lowestBidMoney }" pattern="#,#00.00"/>元</c:if>
	       	  	</span></div>
	       	  	<div class="col-md-4"><span>
	       	  	最大投标金额：  
	       	  	<c:if test="${empty borrowingLoan.largestBidMoney }">没有限制</c:if>
	       	  	<c:if test="${!empty borrowingLoan.largestBidMoney }"><fmt:formatNumber value="${borrowingLoan.largestBidMoney }" pattern="#,#00.00"/>元</c:if>
	       	  	</span></div>
		       	<div class="col-md-4"><span></span></div>
	       	  	</div><br>
	       	  	<div class="row">
	       	  	<div class="col-md-8">剩余时间：<span id="lxftime" endtime="">0天1小时59分9秒</span>
	       	  	<input id="shijian" type="hidden" value="1401445405000"/>
	       	  	</div>
	       	  	<div class="col-md-4"><span></span></div>
	       	  	</div><br>
	       	  	<div class="row">
	       	  	<div class="col-md-8"><span>总投标数：0 浏览量：9</span></div>
	       	  	<div class="col-md-4"><span></span></div>
	       	  	</div><br>
	       	  	<div class="row">
	       	  	<div class="col-md-8"><span style="color: red;">投标1000.0元,年利率：10.0%,期限1个月,可获得利息收益：￥8.33元</span></div>
	       	  	<div class="col-md-4"><span></span></div>
	       	  	</div><br>
			  </div>
			</div>
		    
		  </div>
		</div>
	    <div class="row">
	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title"><strong>相关信息</strong></h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				  	<div style="padding-left: 50px;">
					  	<div class="row" >
				       	  	<div class="col-md-3"><span style="color: red;">晓风网贷信用等级：
				       	  	<img id="creditPhotoDivImg"  src="${borrowingLoan.creditPhoto}" style="width: 34px;height: 24px ;" /></span></div>
				       	  	<div class="col-md-3"><span>晓风网贷信用额度：<fmt:formatNumber value="${borrowingMember.creditamount}" pattern="#,#00.00"/></span></div>
			       	  	</div><br>
			       	  	<div class="row" >
				       	  	<div class="col-md-12"><span>以下基本信息资料，经用户同意披露。其中红色字体的信息，为通过冰川贷审核的项目。</span></div>
			       	  	</div>
			       	  	<div class="row" >
				       	  	<div class="col-md-12">审核意见：<span id="memberAuth_infoAuth"></span></div>
				       	  	<script type="text/javascript">
				       		 	$('#memberAuth_infoAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.infoAuth}',fields.auths));
						    </script>
			       	  	</div><br>
			       	  	<div class="row" ><div class="col-md-12"><span><strong>基本信息</strong></span></div></div><br>
			       	  		<table class="table">
				       	  		<tr>
				       	  			<td>性别：<span id="borrowingMemberSex"></span></td>
				       	  			<script type="text/javascript">
						            	$('#borrowingMemberSex').html(renderGridValue('${borrowingMember.sex }',fields.sex));
						            </script>
				       	  			<td>年龄：${borrowingMember.memberAge }</td>
				       	  			<td>婚姻状况：<span id="maritalStatus"></span></td>
				       	  			<script type="text/javascript">
						            	$('#maritalStatus').html(renderGridValue('${borrowingMember.maritalStatus }',fields.maritalStatus));
						            </script>
				       	  			<td></td>
				       	  		</tr>
				       	  		<!-- <tr>
				       	  			<td>公司行业：金融、保险业</td>
				       	  			<td>公司规模：100-500人</td>
				       	  			<td>职位：经理</td>
				       	  			<td></td>
				       	  		</tr> -->
				       	  		<tr>
				       	  			<td>工龄：${borrowingMemberWork.workAge }年</td>
				       	  			<td>学历：${borrowingMember.educational }</td>
				       	  			<td></td>
				       	  			<td></td>
				       	  		</tr>
				       	  		<!-- <tr>
				       	  			<td>有无购房：无</td>
				       	  			<td>有无购车：有</td>
				       	  			<td></td>
				       	  			<td></td>
				       	  		</tr>
				       	  		<tr>
				       	  			<td>有无房贷：有</td>
				       	  			<td>有无车贷：有</td>
				       	  			<td></td>
				       	  			<td></td>
				       	  		</tr> -->
				       	  	</table>
			       	  	<div class="row" ><div class="col-md-12"><span><strong>晓风网贷借款记录</strong></span></div></div><br>
			       	  	<table class="table">
				       	  		<tr>
				       	  			<td>发布借款标的：1</td>
				       	  			<td>成功借款笔数：0</td>
				       	  			<td>还清笔数：0</td>
				       	  			<td>逾期次数：0</td>
				       	  			<td>严重逾期次数：0</td>
				       	  		</tr>
				       	  		<tr>
				       	  			<td>共借入：0</td>
				       	  			<td>待还金额：0.00</td>
				       	  			<td>逾期金额：0</td>
				       	  			<td>共借出：0.00</td>
				       	  			<td>待收金额：0.00</td>
				       	  		</tr>
				       	  	</table>
			       	  	<br>
		       	  	</div>
				  </div>
				</div>
	    	</div>
	    </div>
	    <div class="row">
	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title"><strong>审核记录</strong></h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				  	<blockquote>
					       	<h4>晓风网贷将以客观、公正的原则，最大程度地核实借入者信息的真实性，但不保证审核信息100%真实。如果借入者长期逾期，其提供的信息将被公布。</h4>
					</blockquote>
					<table class="table table-bordered" style="text-align:center;vertical-align: middle;">
					            <tr>
					              <td>项目</td>
					              <td>审核项目</td>
					              <td>状态</td>
					              <td>审核时间</td>
					            </tr> 
					            <tr>
					              <td rowspan="2" style="text-align:center;vertical-align: middle;">基本信息</td>
					              <td>${requestScope.memberAuthWithBLOBs.infoName}</td>
					              <td id="memberAuth_form_infoAuth"></td>
					              <td id="memberAuth_form_infoAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.infoTime}" type="both"/>
					              </td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.workName}</td>
					              <td id="memberAuth_form_workAuth"></td>
					              <td id="memberAuth_form_workAuth_creditIntegral">
								  <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.infoTime}" type="both"/>
								  </td>
					            </tr>
					            <tr>
					              <td rowspan="7" style="vertical-align: middle;">必要信用认证</td>
					              <td>${requestScope.memberAuthWithBLOBs.idCardName}</td>
					              <td id="memberAuth_form_idCardAuth"></td>
					              <td id="memberAuth_form_idCardAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.infoTime}" type="both"/>
					              </td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.emailName}</td>
					              <td id="memberAuth_form_emailAuth"></td>
					              <td id="memberAuth_form_emailAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.emailTime}" type="both"/>
					              </td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.mobileName}</td>
					              <td id="memberAuth_form_mobileAuth"></td>
					              <td id="memberAuth_form_mobileAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.mobileTime}" type="both"/>
					              </td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.creditName}</td>
					              <td id="memberAuth_form_creditAuth"></td>
					              <td id="memberAuth_form_creditAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.creditTime}" type="both"/>
					              </td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.companyName}</td>
					              <td id="memberAuth_form_companyAuth"></td>
					              <td id="memberAuth_form_companyAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.companyTime}" type="both"/>
					              </td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.realName}</td>
					              <td id="memberAuth_form_realNameAuth"></td>
					              <td id="memberAuth_form_realNameAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.realNameTime}" type="both"/>
					              </td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.vipName}</td>
					              <td id="memberAuth_form_vipAuth"></td>
					              <td id="memberAuth_form_vipAuth_creditIntegral">
					              <fmt:formatDate value="${requestScope.memberAuthWithBLOBs.vipTime}" type="both"/>
					              </td>
					            </tr>
					        </table>
				  </div>
				  </div>
				</div>
	    </div>
	    <div class="row">
	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title"><strong>还款详情</strong></h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				  	<blockquote>
					       	<h4>晓风网贷将以客观、公正的原则，最大程度地核实借入者信息的真实性，但不保证审核信息100%真实。如果借入者长期逾期，其提供的信息将被公布。</h4>
					</blockquote>
					<table class="table table-bordered" style="text-align:center;vertical-align: middle;">
			            <tr>
			              <td>序号</td>
			              <td>还款日期</td>
			              <td>已还本息</td>
			              <td>待还本息</td>
			              <td>已付罚息</td>
			              <td>待还罚息</td>
			              <td>状态</td>
			            </tr> 
			            <tr>
			              <td>1/1</td>
			              <td>2014-05-24</td>
			              <td>0.00</td>
			              <td>10083.33</td>
			              <td>0.00</td>
			              <td>0.00</td>
			              <td>未偿还</td>
			            </tr>
			        </table>
				  </div>
	    		</div>
	    	</div>
	    </div>
	    <div class="row">
	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title"><strong>借款描述</strong></h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				  	<div style="padding-left: 50px;">
				  		<div class="row" >
				  		<div class="col-md-12"><span><strong>我的借款描述：</strong></span></div>
				  		</div><br>
				  		<div class="row" >
				  		<div class="col-md-12"><span>${borrowingLoan.loanDetail }</span></div>
				  		</div><br>
				  	</div>
				  </div>
	    		</div>
	    	</div>
	    </div>
	    <div class="row">
	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title"><strong>留言板</strong></h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				  <table class="table" style="padding: 10px;">
			        <c:if test="${empty loanReviewDatas.rows}">
					<tr>
			            <td colspan="3"><strong>暂无信息</strong></td>
			          </tr>
					</c:if>	  		
					<c:if test="${!empty loanReviewDatas.rows}">  	
					<c:forEach items="${loanReviewDatas.rows}" var="loanReview" varStatus="status">
			        	<tr>
			        		<td style="text-align:center;vertical-align: middle;"><img src="${loanReview.memberPhoto}" style="width: 60px;height: 60px ;"/> </td>
			        		<td><span style="color: blue;">${loanReview.memberDisplay }</span>说：<br/>${loanReview.reviewContent }</td>
			        		<td align="right"><fmt:formatDate value="${loanReview.createTime}" type="both"/></td>
			        	</tr>
			        	</c:forEach>
			      		</c:if>	
			      		<c:if test="${!empty loanReviewDatas.rows}">
			        	<tfoot>
				          <tr>
				            <th colspan="3">
				            	<div align="right">
								    <ul id="pageLoanReview"></ul>
								</div>
							</th>
				          </tr>
				        </tfoot>
				        </c:if>	  
			        </table>
				  	<div style="padding-left: 20px;">
				  	<form id="loanReviewForm" class="form-horizontal" role="form" action="${ctx}/loanReview/addLoanReviewWebsite.htm" method="post" onsubmit="return validaForm();">
					  	<span>咨询或评论：(字数在1-120之间)</span>
					  	<br><br>
					  	<div class="row" >
					  		<input id="loanId" name="loanId" type="hidden" value="${borrowingLoan.loanId }" />
					  		<input id="memberId" name="memberId" type="hidden" value="${borrowingMember.memberId }" />
					  		<div class="col-md-12"><textarea id="reviewContent" name="reviewContent" rows="4" cols="150" required="required">${reviewContent}</textarea></div>
					  	</div><br>
					  	<div class="form-group">
							<label id="login_kaptcha_span" class="col-sm-1 control-label ">验证码</label>
							<div class="col-sm-2">
								<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control" placeholder="验证码" required />
							</div>
							<div class="col-sm-2">
								<img style="width:120px;height:32px;" class="img-responsive" id="login_kaptcha" src="${pageContext.request.contextPath}/resources/images/kaptcha.jpg" />
							</div>
							<div class="col-sm-2">
								 <button  id="login_submit" type="submit" class="btn btn-primary btn-block">提交</button>
							</div>
						</div>
					</form>
				  	</div>
				  </div>
	    		</div>
	    	</div>
	    </div>
	    <div class="row">
	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title"><strong>投资记录</strong></h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				  	<div style="padding-left: 20px;">
				  		<div class="row" style="text-align:center;vertical-align: middle;">
				  		<div class="col-md-4">目前总投标金额：<span style="color: red;"><fmt:formatNumber value="${borrowingLoan.loanTotal }" pattern="#,#00.00"/>元</span></div>
				  		<div class="col-md-3">剩余投标金额：<span id="stillNeed2" style="color: red;"></span><span style="color: red;">元</span></div>
				  		<script type="text/javascript">
				        	if('${borrowingLoan.subTotal}' == '0.0'){
				        		$('#stillNeed2').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrBidMoney}' pattern='#,#00.00'/>");
				        	}else{
				        		$('#stillNeed2').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrSubSum*borrowingLoan.lowestSub}' pattern='#,#00.00'/>");
		
				        	}
				        </script>
				  		<div class="col-md-5">剩余投标时间：<span style="color: red;"></span></div>
				  		</div><br>
				  		<div class="row" >
				  		<div class="col-md-12">
				  			<table class="table table-bordered table-striped" style="text-align:center;vertical-align: middle;">
				  				<tr>
				  					<td>投资人</td>
				  					<td>投资金额</td>
				  					<td>投资时间</td>
				  				</tr>
				  				<c:if test="${empty tenderNotesDatas.rows}">
									<tr>
							            <td colspan="3"><strong>暂无信息</strong></td>
							          </tr>
									</c:if>	  		
								<c:if test="${!empty tenderNotesDatas.rows}">  	
									<c:forEach items="${tenderNotesDatas.rows}" var="tenderNotes" varStatus="status">
							        	<tr>
							        		<td>${tenderNotes.memberDisplay }</td>
							        		<td><span id="investmentMoney${status.index}"></span>元</td>
							        		<script type="text/javascript">
									        	if('${tenderNotes.subSum}' == ''){
									        		$('#investmentMoney'+${status.index}).html("<fmt:formatNumber value='${tenderNotes.tenderMoney}' pattern='#,#00.00'/>");
									        	}else{
									        		$('#investmentMoney'+${status.index}).html("<fmt:formatNumber value='${tenderNotes.subSum*borrowingLoan.lowestSub}' pattern='#,#00.00'/>");
							
									        	}
									        </script>
							        		<td><fmt:formatDate value="${tenderNotes.createTime}" type="both"/></td>
							        	</tr>
							        </c:forEach>
							    </c:if>	
						      	<c:if test="${!empty tenderNotesDatas.rows}">
						        	<tfoot>
							          <tr>
							            <th colspan="3">
							            	<div align="right">
											    <ul id="pageTenderNotes"></ul>
											</div>
										</th>
							          </tr>
							        </tfoot>
							    </c:if>	  
				  			</table>
				  		</div>
				  		</div><br>
				  	</div>
				  </div>
	    		</div>
	    	</div>
	    </div>
	    
	   
	    </div>
	    <!-- CONTAINER START======================== -->
	     <jsp:include page="../foot.jsp"/>
  </body>
  <script type="text/javascript">
 // alert("borrowingLoan:  "+"<fmt:formatDate value='${borrowingMember.createTime}' pattern='yyyy/MM/dd HH:mm:ss'/>")
  //alert("aa  "+new Date("<fmt:formatDate value='${borrowingLoan.waitBidDeadlinesDate}' pattern='yyyy/MM/dd HH:mm:ss'/>").getTime());
  //js的倒计时
  function lxfEndtime(){
            //var endtime = new Date($("#lxftime").attr("endtime")).getTime();//取结束日期(毫秒值)
           
            var endtime = new Date("<fmt:formatDate value='${borrowingLoan.waitBidDeadlinesDate}' pattern='yyyy/MM/dd HH:mm:ss'/>").getTime();//取结束日期(毫秒值)
            //var endtime = new Date("2014/05/30 17:49:56").getTime();//取结束日期(毫秒值)
            //var endtime = new Date(2014,04,30,17,49,56).getTime();//取结束日期(毫秒值)
            var nowtime = new Date().getTime();        //今天的日期(毫秒值)
            var youtime = endtime-nowtime;//还有多久(毫秒值)
            var seconds = youtime/1000;
            var minutes = Math.floor(seconds/60);
            var hours = Math.floor(minutes/60);
            var days = Math.floor(hours/24);
            var CDay= days ;
            var CHour= hours % 24;
            var CMinute= minutes % 60;
            var CSecond= Math.floor(seconds%60);//"%"是取余运算，可以理解为60进一后取余数，然后只要余数。
            if(endtime<=nowtime){
            	$("#lxftime").html("已过期")//如果结束日期小于当前日期就提示过期啦
            }else{
            	$("#lxftime").html("<span>"+days+"</span><em>天</em><span>"+CHour+"</span><em>时</em><span>"+CMinute+"</span><em>分</em><span>"+CSecond+"</span><em>秒</em>");          //输出有天数的数据
            }
	setTimeout("lxfEndtime()",1000);
	};
	$(function(){
	  lxfEndtime();
	});
  
  /* 进行关注此借款操作 */
  $('#attentionBorrowingClick').click(function () {  
	  if("${borrowingLoan.memberId }" == "${currentMember.memberId}"){
	  		captchadialog("无效操作，不能关注自己发布的借款!");
				return false;
		}
	  $.ajax({
		   type: "POST",
		   url: ctx+"/attentionBorrowing/addAttentionBorrowing.json?&memberId=${currentMember.memberId}&loanId=${borrowingLoan.loanId }",
		   dataType: "json",
		   success: function(r) {
			   captchadialog(r.msg);
            },
            error: function() {
                //alert("查看收款记录明细出错！");
                captchadialog(r.msg);
            }
		});
   }); 
  /* 判断用户是否投自己发布的标 */
  $('#intoInvestment').click(function () {  
  	if("${borrowingLoan.memberId }" == "${currentMember.memberId}"){
  		captchadialog("无效操作，不能投自己发布的标!");
			return false;
		}
   }); 
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
	
	var element = $('#pageLoanReview');
	var elementTenderNotes = $('#pageTenderNotes');
	
	//设置分页的总页数
	var total=${loanReviewDatas.total}/5;
	if(parseInt(total)==total){
		var total = parseInt(total);
	}else {
		var total = parseInt(total)+1;
	}
	
	//设置分页的总页数
	var totalTenderNotes=${tenderNotesDatas.total}/5;
	if(parseInt(totalTenderNotes)==totalTenderNotes){
		var totalTenderNotes = parseInt(totalTenderNotes);
	}else {
		var totalTenderNotes = parseInt(totalTenderNotes)+1;
	}
	
	var options = {
	    bootstrapMajorVersion:3,
	    currentPage: ${loanReviewDatas.p},
	    numberOfPages: 5,
	    totalPages:total,
	    pageUrl: function(type, page, current){
	    	return "${ctx}/loanReview/loanReviewPage.htm?&p="+page+"&loanId=${borrowingLoan.loanId }&memberId=${borrowingMember.memberId }";
	    	//return "${ctx}/investment/investmentdetail.htm?"+composeUrlParams()+"&p="+page+"&loanId=${borrowingLoan.loanId }&memberId=${borrowingMember.memberId }";
	    	}
	}
	
	var optionsTenderNotes = {
		    bootstrapMajorVersion:3,
		    currentPage: ${tenderNotesDatas.p},
		    numberOfPages: 5,
		    totalPages:totalTenderNotes,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/investment/investmentdetail.htm?&p="+page+"&loanId=${borrowingLoan.loanId }&memberId=${borrowingMember.memberId }";
		    	}
		}
	
	element.bootstrapPaginator(options);
	elementTenderNotes.bootstrapPaginator(optionsTenderNotes);
	})
<!-- 分页显示表格数据 结束 -->
  
	//更换验证码的值
	$('#login_kaptcha').click(function() {  
		$('#captcha').val('');
       	$(this).hide().attr('src','${pageContext.request.contextPath}/resources/images/kaptcha.jpg?' + Math.floor(Math.random() * 100)).fadeIn();     
    });
  
  
	//下拉项emun的值
	if("${requestScope.memberAuthWithBLOBs.infoAuth}" == 'pass'){
		$('#memberAuth_form_infoAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_infoAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.infoAuth}',fields.auths));	
	}
	if("${requestScope.memberAuthWithBLOBs.vipAuth}" == 'pass'){
		$('#memberAuth_form_vipAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_vipAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.vipAuth}',fields.auths));
	}
	if("${requestScope.memberAuthWithBLOBs.emailAuth}" == 'pass'){
		$('#memberAuth_form_emailAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_emailAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.emailAuth}',fields.auths));
	}
	if("${requestScope.memberAuthWithBLOBs.mobileAuth}" == 'pass'){
		$('#memberAuth_form_mobileAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_mobileAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.mobileAuth}',fields.auths));
	}
	if("${requestScope.memberAuthWithBLOBs.companyAuth}" == 'pass'){
		$('#memberAuth_form_companyAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_companyAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.companyAuth}',fields.auths));	
	}
	if("${requestScope.memberAuthWithBLOBs.creditAuth}" == 'pass'){
		$('#memberAuth_form_creditAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_creditAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.creditAuth}',fields.auths));	
	}
	if("${requestScope.memberAuthWithBLOBs.realNameAuth}" == 'pass'){
		$('#memberAuth_form_realNameAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_realNameAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.realNameAuth}',fields.auths));
	}
	if("${requestScope.memberAuthWithBLOBs.idCardAuth}" == 'pass'){
		$('#memberAuth_form_idCardAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_idCardAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.idCardAuth}',fields.auths));
	}
	if("${requestScope.memberAuthWithBLOBs.workAuth}" == 'pass'){
		$('#memberAuth_form_workAuth').html('<img src="${ctx}/resources/images/borrow/auth_pass.jpg" alt="auth_pass">');
	}else{
		$('#memberAuth_form_workAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.workAuth}',fields.auths));   
	}
	
	//表单验证
	validaForm = function(){
		var $reviewContent = $('#reviewContent');
		if($reviewContent.val() === ''){
			$reviewContent.focus();
			return false;
		}
		var $captcha = $('#captcha');
		if($captcha.val().length < 4){
			
			$captcha.focus();
			return false;
		}
		
		//$('#login_submit').attr('disabled', 'disabled').html('登录中...');
		return true;
	};
	var errorCaptcha = "${errorCaptcha}";
	if(errorCaptcha != ''){
		captchadialog(errorCaptcha);
	}
	function captchadialog(data){
		KindEditor.ready(function(K) {
		var dialog = K.dialog({
				        width : 300,
				        title : '信息提示',
				        body : '<div style="margin:10px;"><strong>'+data+'</strong></div>',
				        closeBtn : {
				                name : '关闭',
				                click : function(e) {
				                        dialog.remove();
				                }
				        },
				        yesBtn : {
				                name : '确定',
				                click : function(e) {
				                		dialog.remove();
				                }
				        },
					});
		});
	}
  </script>
</html>
