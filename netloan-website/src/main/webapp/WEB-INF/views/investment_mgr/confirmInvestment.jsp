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
		    <h3 class="panel-title"><strong>确定投标</strong></h3>
		  </div>
		  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;border: 1px solid #DDDDDD;" -->
		  	<div class="row">
			  <div class="col-md-7">
			  <div class="row" >
       	  		<div class="col-md-6">
       	  			<table class="table" style="text-align:center;vertical-align: middle;border: 1px solid #DDDDDD;">
			        	<tr>
			        		<td style="padding-left: 20px;"><img src="${borrowingMember.memberPhoto}" style="width: 100px;height: 100px ;"/></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>冰川网贷信用等级:</span><img id="creditPhotoDivImg"  src="${borrowingMember.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>用 户 名:</span>${borrowingMember.memberName}</td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>籍　　贯:</span>${borrowingMember.hometown}</td>
			        	</tr>
			   		</table>
       	  		</div>
       	  		<div class="col-md-6">
       	  			<table class="table" style="border: 1px solid #DDDDDD;">
			        	<tr>
			        		<td style="padding-left: 20px;">借款标题：<span style="color: red;">${borrowingLoan.loanTitle}</span></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;">借款金额：<span style="color: red;"><fmt:formatNumber value="${borrowingLoan.loanTotal }" pattern="#,#00.00"/>元</span></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;">借款年利率：<span style="color: red;"><fmt:formatNumber value="${borrowingLoan.loanApr }" pattern="#,#00.00"/>%</span></td>
			        	</tr>
			        	<tr>
			        		<td>已经完成：<span style="color: red;"> 0%</span></td>
			        	</tr>
			        	<tr>
			        		<td>还需借款: <span style="color: red;">￥100,000.00</span></td>
			        	</tr>
			        	<tr>
			        		<td>借款期限: <span style="color: red;">${borrowingLoan.waitBidDeadlines }个月</span></td>
			        	</tr>
			        	<tr>
			        		<td>还款方式: <span style="color: red;">${borrowingLoan.repaymentTypeDisplay }</span></td>
			        	</tr>
			        	<tr>
			        		<td>交易类型: <span style="color: red;">线上交易</span></td>
			        	</tr>
			   		</table>
       	  		</div>
	       	  </div>
			  </div>
			  <div class="col-md-5" style="border: 1px solid #DDDDDD;">
			  <div style="margin-left: 20px;margin-top: 40px;">
	       	  	<div class="row">
	       	  		<div class="col-md-12">您的帐户总额：<span style="color: red;">1379570.16 </span>元
	       	  		&nbsp; <img src="${ctx}/resources/images/borrow/woyaochongzhi.png" alt="investment"></div>
	       	  	</div>
	       	  	<div class="row">
	       	  		<div class="col-md-12">您的可用余额：<span style="color: red;">1364370.16 </span>元</div>
	       	  	</div>
	       	  	<br>
	       	  	<div class="row">
	       	  		<div class="col-md-12"><span>请填写并确认下面投标金额</span>
	       	  		&nbsp;<a href="#">设置交易密码</a></div>
	       	  	</div>
	       	  	<div class="row">
	       	  		<div class="col-md-12"><span>最小认购金额：<fmt:formatNumber value="${borrowingLoan.lowestSub }" pattern="#,#00.00"/>元  当前年利率: <fmt:formatNumber value="${borrowingLoan.loanApr }" pattern="#,#00.00"/>% </span></div>
	       	  	</div>
	       	  	<div class="row">
	       	  		<div class="col-md-12">认购总份数：${borrowingLoan.subTotal }份,还有：<span id="subLeave"></span>份 </div>
	       	  		<script type="text/javascript">
	       	  			$("#subLeave").html(${borrowingLoan.subTotal }-${borrowingLoan.alrSubSum });
	       	  		</script>
	       	  	</div>
	       	  	<br>
	       	  	<div class="row">
		       	  	<div class="col-md-12">
		       	  	<form id="loanReviewForm" class="form-horizontal" role="form" action="${ctx}/loanReview/addLoanReviewWebsite.htm" method="post" onsubmit="return validaForm();">
					  	<div class="form-group">
							<div class="col-sm-5">
								<input type="text" id="captcha" name="captcha" class="form-control" value="1" required />
							</div>
							<div class="col-sm-1">份</div>
							<div class="col-sm-4"><!-- style="background-image: url('${ctx}/resources/images/borrow/rengou.gif');" -->
								 <button  id="login_submit" type="submit" class="btn btn-primary btn-block" >认购</button>
							</div>
							<div class="col-sm-2"></div>
						</div>
					</form>
		       	  	</div>
	       	  	</div>
	       	  	<div class="row">
	       	  	<div class="col-md-12">您的可投标金额为：<span style="color: red;">￥100,000.00</span>元，最多可认购：<span style="color: red;">10000份 </span></div>
	       	  	</div>
	       	  	<br>
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
  
 
  </script>
</html>
