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
					          <a href="${ctx}/member/index.htm" class="btn btn-info" role="button">我的主页</a>
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
					      	  <a href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我的投标</a>
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
				    <h3 class="panel-title">我的个人信息</h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				     <table class="table" >
			            <tr><!-- style="width:100px;heigth:100px" -->
			              <td rowspan="5" >
			              <div style=" text-align:center;vertical-align: middle;">
			              <img src="${currentMember.memberPhoto}" style="width: 120px;height: 120px ;"/>
			              <a href="${ctx}/member/memberPhotoInto.htm" role="button"><p style="padding:10px;">更换头像</p></a>
			              </div>
			              </td>
			              <td>用户名：</td>
			              <td>${currentMember.memberRealName}</td>
			              <td>信用积分</td>
			              <td><img id="creditPhotoDivImg"  src="${requestScope.totalCreditPhoto}" style="width: 34px;height: 24px ;" /></td>
			            </tr>
			            <tr>
			              <td>注册时间：</td>
			              <td><fmt:formatDate value="${currentMember.registrationTime}" type="both"/></td>
			              <td>会员到期：</td>
			              <td><fmt:formatDate value="${currentMember.expireTime}" type="both"/></td>
			            </tr>
			            <tr>
			              <td>会员积分：</td>
			              <td>${requestScope.totalIntegral}</td>
			              <td>最后登录ip:</td>
			              <td>${currentMember.lastLoginIpAddress}</td>
			            </tr>
			            <tr>
			              <td>信用额度：</td>
			              <td>${currentMember.creditamount}</td>
			              <td></td>
			              <td></td>
			            </tr>
			             <tr>
			              <td>个人统计:</td>
			              <td>61.145.244.204</td>
			              <td></td>
			              <td></td>
			            </tr>
			        </table>
			        <div style="border: 1px solid #DDDDDD;">
			        <div class="row" style="padding:10px;">
					  <div class="col-md-2 text-right"><img alt="" src="${ctx}/resources/images/member/wenxintisi.jpg"><span class="text-danger"><strong>温馨提示：</strong></span></div>
					  <div class="col-md-2"><span>未读站内信<a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" class="navbar-link"><span class="badge">${messageNoticCount}</span></a>封</span></div>
					  <div class="col-md-2"><span>等待审核借款<a href="#" class="navbar-link"><span class="badge">0</span></a>个</span></div>
					  <div class="col-md-2"><span>本月待还款<a href="#" class="navbar-link"><span class="badge">0</span></a>个</span></div>
					  <div class="col-md-4"><span>本月待收款<a href="#" class="navbar-link"><span class="badge">0</span></a>个</span></div>
					</div>
					<div class="row" style="padding:10px;">
					  <div class="col-md-2"></div>
					  <div class="col-md-2"><span>逾期待还款<a href="#" class="navbar-link"><span class="badge">0</span></a>个</span></div>
					  <div class="col-md-2"><span>上传资料<a href="#" class="navbar-link"><span class="badge">1</span></a></span></div>
					  <div class="col-md-2"></div>
					  <div class="col-md-4"></div>
					</div>
			        </div>
			        <div style="margin:40px;text-align:center;vertical-align: middle;">
			        <table style="width:800px;padding: 10px;">
			        	<tr style="padding: 10px;">
			        		<td><img alt="" src="${ctx}/resources/images/member/chongzhi.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/daichu.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/zhaiquanzhuanrang.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/huankuan.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/daishoukuan.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/zijinliushui.jpg"></td>
			        		<td><img alt="" src="${ctx}/resources/images/member/jiekuan.jpg"></td>
			        	</tr>
			        	<tr style="height:40px;margin: 10px;">
			        		<td><a href="#" class="navbar-link"><span>我要借款</span></a></td>
			        		<td><a href="#" class="navbar-link"><span>我要贷出</span></a></td>
			        		<td><a href="#" class="navbar-link"><span>债权转让</span></a></td>
			        		<td><a href="#" class="navbar-link"><span>我要还款</span></a></td>
			        		<td><a href="#" class="navbar-link"><span>待收款</span></a></td>
			        		<td><a href="#" class="navbar-link"><span>资金流水</span></a></td>
			        		<td><a href="#" class="navbar-link"><span>我要借款</span></a></td>
			        	</tr>
			        </table>
			        </div>
			        <blockquote>
					       	<h5 class="text-danger"><strong>账户详情：</strong></h5>
					</blockquote>
					<table class="table table-bordered" style="padding: 10px;">
						<tr>
			        		<td colspan="3"><span><strong>账户总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>账户总额：￥0.00</span></td>
			        		<td><span>可用余额：￥0.00</span></td>
			        		<td><span>冻结金额：￥0.00</span></td>
			        	</tr>
			        	<tr>
			        		<td><span>总收益：￥0.00</span></td>
			        		<td><span>利息收益：￥0.00</span></td>
			        		<td><span>其他收益：￥0.00</span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>投资总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>已收总额：￥0.00</span></td>
			        		<td><span>已收本金：￥0.00</span></td>
			        		<td><span>已收利息：￥0.00</span></td>
			        	</tr>
			        	<tr>
			        		<td><span>待收总额：￥0.00</span></td>
			        		<td><span>待收本金：￥0.00</span></td>
			        		<td><span>待收利息：￥0.00</span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>借款总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>已还总额：￥0.00</span></td>
			        		<td><span>已还本金：￥0.00</span></td>
			        		<td><span>已还利息：￥0.00</span></td>
			        	</tr>
			        	<tr>
			        		<td><span>待还总额：￥0.00</span></td>
			        		<td><span>待还本金：￥0.00</span></td>
			        		<td><span>待还利息：￥0.00</span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>额度总汇：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>借款总额度：￥500.00</span></td>
			        		<td><span>可用额度：￥500.00</span></td>
			        		<td><span></span></td>
			        	</tr>
			        	<tr>
			        		<td colspan="3"><span><strong>最近还款：</strong></span></td>
			        	</tr>
			        	<tr >
			        		<td><span>最近还款日：</span></td>
			        		<td><span>最近还款金额：</span></td>
			        		<td><span></span></td>
			        	</tr>
			        </table>
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