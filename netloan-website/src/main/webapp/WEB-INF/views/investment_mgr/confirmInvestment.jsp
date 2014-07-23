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
  <%
    response.setHeader("Cache-Control","no-store");
    response.setDateHeader("Expires", 0);
    response.setHeader("Pragma","no-cache"); 
  %>
  <jsp:include page="../nav_mgr/navInvestment.jsp"/>
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
			        		<td style="padding-left: 20px;"><span>冰川网贷信用等级：</span><img id="creditPhotoDivImg"  src="${borrowingMember.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
			        	</tr>
			        	<tr>
			        		<td style="padding-left: 20px;"><span>用 户 名：</span>${borrowingMember.memberName}</td>
			        	</tr>
			        	<tr>
			        		<td ><span>籍　 &nbsp;贯：</span>${borrowingMember.hometown}</td>
			        	</tr>
			   		</table>
       	  		</div>
       	  		<div class="col-md-6">
       	  			<table class="table" style="border: 1px solid #DDDDDD;">
			        	<tr>
			        		<td >借款标题：<span style="color: red;">${borrowingLoan.loanTitle}</span></td>
			        	</tr>
			        	<tr>
			        		<td >借款金额：<span style="color: red;">￥<fmt:formatNumber value="${borrowingLoan.loanTotal }" pattern="#,#00.00"/>元</span></td>
			        	</tr>
			        	<tr>
			        		<td >借款年利率：<span style="color: red;"><fmt:formatNumber value="${borrowingLoan.loanApr * 100}" pattern="#,#00.00"/>%</span></td>
			        	</tr>
			        	<tr>
			        		<td>已经完成：<span style="color: red;"><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/>%</span></td>
			        	</tr>
			        	<tr>
			        		<td>还需借款：<span style="color: red;">￥</span><span id="stillNeed" style="color: red;"> </span><span style="color: red;">元</span></td>
			        	<script type="text/javascript">
				        	if('${borrowingLoan.subTotal}' == '0.0'){
				        		$('#stillNeed').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrBidMoney}' pattern='#,#00.00'/>");
				        	}else{
				        		$('#stillNeed').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrSubSum*borrowingLoan.lowestSub}' pattern='#,#00.00'/>");
		
				        	}
				        </script>
			        	</tr>
			        	<tr>
			        		<td>借款期限：<span style="color: red;">${borrowingLoan.loanDeadlinesId }个月</span></td>
			        	</tr>
			        	<tr>
			        		<td>还款方式：<span style="color: red;">${borrowingLoan.repaymentTypeDisplay }</span></td>
			        	</tr>
			        	<tr>
			        		<td>交易类型：<span style="color: red;">线上交易</span></td>
			        	</tr>
			   		</table>
       	  		</div>
	       	  </div>
			  </div>
			  <div class="col-md-5" style="border: 1px solid #DDDDDD;">
			  <div style="margin-left: 20px;margin-top: 40px;">
	       	  	<div class="row">
	       	  		<div class="col-md-12">您的帐户总额：￥<span style="color: red;"><fmt:formatNumber value="${financeMember.amount }" pattern="#,#00.00"/></span>元
	       	  		&nbsp;<a href="${ctx}/financeMember/rechargeWithdraw.htm?p=1" class="navbar-link"><img src="${ctx}/resources/images/borrow/woyaochongzhi.png" alt="investment"></a></div>
	       	  	</div>
	       	  	<div class="row">
	       	  		<div class="col-md-12">您的可用余额：￥<span style="color: red;"><fmt:formatNumber value="${financeMember.usableMoney }" pattern="#,#00.00"/></span>元</div>
	       	  	</div>
	       	  	<br>
	       	  	<div class="row">
	       	  		<div class="col-md-12"><span>请填写并确认下面投标金额</span>
	       	  		&nbsp;<a href="${ctx}/member/memberDetail.htm" class="navbar-link">设置交易密码</a></div>
	       	  	</div>
	       	  	<c:choose>
					   <c:when test="${borrowingLoan.subTotal == '0.0'}">  
			       	  	<!--  -->
			       	  	<div class="row">
				       	  		<div class="col-md-12"><span>最低投标金额：<fmt:formatNumber value="${borrowingLoan.lowestBidMoney }" pattern="#,#00.00"/>元 
				       	  									最高投标金额：<fmt:formatNumber value="${borrowingLoan.largestBidMoney }" pattern="#,#00.00"/>元
				       	  									<br> 当前年利率: <fmt:formatNumber value="${borrowingLoan.loanApr * 100}" pattern="#,#00.00"/>% </span></div>
				       	  	</div>
				       	  	<br>
				       	  	<form id="investmentTenderMoneyForm" class="form-horizontal" role="form" action="${ctx}/investment/addInvestment.htm" method="post" onsubmit="return validaInvestmentTenderMoneyForm();">
					       	  	<div class="row">
						       	  	<div class="col-md-12">
									  	<div class="form-group">
									  		<label id="login_kaptcha_span" class="col-sm-3 control-label ">投标金额:</label>
											<div class="col-sm-7">
												<input id="loanId" name="loanId" type="hidden" value="${borrowingLoan.loanId }" />
						  						<input id="memberId" name="memberId" type="hidden" value="${currentMember.memberId }" />
												<input type="text" id="tenderMoney" name="tenderMoney" class="form-control" value="" required />
											</div>
											<div class="col-sm-2">元</div>
										</div>
						       	  	</div>
					       	  	</div>
					       	  	<div class="row">
					       	  		<div class="col-md-12">
					       	  			<span style="color: red;">注意：点击按钮表示您将确认投标金额并同意支付贷款</span>
					       	  		</div>
					       	  	</div>
					       	  	<br>
					       	  	<div class="row">
						       	  	<div class="col-sm-3"></div>
						       	  	<div class="col-md-6"><button  id="login_submit" type="submit" class="btn btn-primary btn-block" >确定投标</button></div>
						       	  	<div class="col-sm-3"></div>
					       	  	</div>
				       	  	</form>
					   </c:when>
					   <c:otherwise> 
				   			<div class="row">
			       	  		<div class="col-md-12"><span>最小认购金额：￥<fmt:formatNumber value="${borrowingLoan.lowestSub }" pattern="#,#00.00"/>元  当前年利率: <fmt:formatNumber value="${borrowingLoan.loanApr * 100}" pattern="#,#00.00"/>% </span></div>
				       	  	</div>
				       	  	<div class="row">
				       	  		<div class="col-md-12">认购总份数：${borrowingLoan.subTotal }份,还有：<span id="subLeave">${borrowingLoan.subTotal-borrowingLoan.alrSubSum }</span>份 </div>
				       	  	</div>
				       	  	<br>
				       	  	<div class="row">
					       	  	<div class="col-md-12">
					       	  	<form id="investmentSubSumForm" class="form-horizontal" role="form" action="${ctx}/investment/addInvestment.htm" method="post" onsubmit="return validaInvestmentSubSumForm();">
								  	<div class="form-group">
										<div class="col-sm-5">
											<input id="loanId" name="loanId" type="hidden" value="${borrowingLoan.loanId }" />
						  					<input id="memberId" name="memberId" type="hidden" value="${currentMember.memberId }" />
											<input type="text" id="subSum" name="subSum" class="form-control" value="1" required />
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
				       	  	<div class="col-md-12">您的可投标金额为：<span style="color: red;">￥<fmt:formatNumber value="${financeMember.usableMoney }" pattern="#,#00.00"/></span>&nbsp;元，最多可认购：<span id="maxSub" style="color: red;"></span>&nbsp;份</div>
				       	  	</div>
					   </c:otherwise>
				</c:choose>
	       	  	<br>
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
 	window.onload=function(){
 		var usableMoneyFloor=Math.floor("${financeMember.usableMoney}");//先去掉小数
 		var maxLowestSub=usableMoneyFloor/"${borrowingLoan.lowestSub }">"${borrowingLoan.subTotal }"?parseInt("${borrowingLoan.subTotal-borrowingLoan.alrSubSum }"):parseInt(usableMoneyFloor/"${borrowingLoan.lowestSub }");//再整除(运用三元表达式)
 	  	document.getElementById("maxSub").innerHTML=maxLowestSub;
 	}
 	
  	if('${borrowingLoan.subTotal}' == '0.0'){
		$('#stillNeed').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrBidMoney}' pattern='#,#00.00'/>");
	}else{
		$('#stillNeed').html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrSubSum*borrowingLoan.lowestSub}' pattern='#,#00.00'/>");

	}
	//表单验证
	validaInvestmentSubSumForm = function(){
		var $subSum = $('#subSum');
		var stillNeedSum = ${borrowingLoan.subTotal-borrowingLoan.alrSubSum };
		var r = /^[0-9]*[1-9][0-9]*$/ ;
		var num = $subSum.val()
		var numberAmount = ${borrowingLoan.lowestSub} * num;
		if(!r.test($subSum.val())){
			$subSum.focus();
			vipdialog("请输入正整数!");
			return false;
		}
		if($subSum.val() > stillNeedSum){
			$subSum.focus();
			vipdialog("投标份数超过本轮剩余投标份数");
			return false;
		}
		if(parseFloat(numberAmount) > parseFloat(${financeMember.usableMoney })){
			$subSum.focus();
			vipdialog("你的可用余额不足，请先充值");
			return false;
		}
		return true;
	};
	//表单验证
	validaInvestmentTenderMoneyForm = function(){
		var $tenderMoney = $('#tenderMoney');
		var stillNeed = 0;
		var largestBidMoney = ${borrowingLoan.largestBidMoney };
		if('${borrowingLoan.subTotal}' == '0.0'){
			stillNeed = ${borrowingLoan.loanTotal-borrowingLoan.alrBidMoney};
		}else{
			stillNeed = ${borrowingLoan.loanTotal-borrowingLoan.alrSubSum*borrowingLoan.lowestSub};
		}
		var r = /^[0-9]*[1-9][0-9]*$/ ;
		if(!r.test($tenderMoney.val())){
			$tenderMoney.focus();
			vipdialog("请输入正整数!");
			return false;
		}
		if($tenderMoney.val() > largestBidMoney){
			$tenderMoney.focus();
			vipdialog("投标金额超过最大投标金额");
			return false;
		}
		if($tenderMoney.val() > stillNeed){
			$tenderMoney.focus();
			vipdialog("投标金额超过本轮剩余投标金额");
			return false;
		}
		if($tenderMoney.val() > ${financeMember.usableMoney }){
			$tenderMoney.focus();
			vipdialog("你的可用余额不足，请先充值");
			return false;
		}
		return true;
	};
	function vipdialog(data){
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
