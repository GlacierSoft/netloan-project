<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.LockedAccountException"%>
<%@ page import="com.glacier.basic.exception.IncorrectCaptchaException"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>

<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>冰川网贷平台</title>
   	<!-- 引入公用的js和样式库 -->
	<jsp:include page="../inc.jsp"/>
	<style type="text/css">
		body {
		    padding-top: 70px;
		}
	</style>
  </head>

  <body>
 <jsp:include page="../nav_mgr/navBorrow.jsp"/>
    <div class="container">
  	<div class="row">
    	
    	<div>
    		<h3>发布净值标</h3>
    		<p style="color:#F00">* 为必填项，所有资料均会严格保密。</p>
    		<div>
    			<form id="enteringJingZhi" name="enteringJingZhi" class="form-horizontal" role="form" method="post" >
		          <table  style="width: 950px;">
		          	<tbody>
			          <tr>
			            <td class="col-md-6" align="right">
			            	<span style="color:#F00">*</span>借款标题：
			            </td>
			            <td class="col-md-6">
			            	<input id="memberId" name="memberId" type="hidden" value="${currentMember.memberId}" >
			            	<input id="loanTitle" name="loanTitle" type="text" class="inp280" maxlength="20"/>
			            </td>
			          </tr>
					  <tr>
					  	<td class="col-md-6" align="right">借款图片:</td>
					    <td class="col-md-6">
							<input class="ke-input-text" type="hidden" name="loanPicture" id="url" value="${currentMember.memberPhoto}" readonly="readonly" />
							<img id="loanPictureImg"  src="${currentMember.memberPhoto}" style="width: 120px;height: 120px ;" />
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right">借款标的：</td>
					    <td class="col-md-6"> <input type="hidden" id="loanTenderId" name="loanTenderId" value="9788195653f335695256551b82fcbac6"/><span style="color:#F00">净值标</span></td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>借款目的：</td>
					    <td class="col-md-6">
						    <select name="loanPurposeId" id="loanPurposeId" class="sel_140">
							    <option value="">--请选择--</option>
							    <option value="长期使用">长期使用</option>
							    <option value="资金周转">资金周转</option>
							    <option value="短期周转">短期周转</option>
							    <option value="创业借款">创业借款</option>
							    <option value="买车借款">买车借款</option>
							    <option value="买房借款">买房借款</option>
							    <option value="普通借款">普通借款</option>
							    <option value="其他借款">其他借款</option>
							</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>借款期限：</td>
					    <td class="col-md-6">
					    	<select name="loanDeadlinesId" id="loanDeadlinesId" class="sel_140" onFocus="funLoanDeadlinesId()">
							</select>
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否置为天标：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isDayMarked" name="isDayMarked" checked="checked" value="yes" />是
					    	<input type="radio" id="isDayMarked" name="isDayMarked" value="no" />否
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">投标奖励：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isBidReward" name="isBidReward" checked="checked" value="no" onclick="displayIsBidReward()"/>
					      	不设置奖励
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right"></td>
					    <td class="col-md-6">
					      	<input type="radio" id="isBidReward" name="isBidReward" value="yes" onclick="displayIsBidReward()"/>
					     	按投标金额比例奖励
					     	<input type="text" id="bidProReward" name="bidProReward" class="inp100x gray" disabled="disabled" value="0"/>
					      %
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right"></td>
					    <td class="col-md-6">
					     	<input type="radio" id="isBidReward" name="isBidReward" value="yes" onclick="displayIsBidReward()"/>
					      	按固定金额分摊奖励
					      	<input type="text" id=fixedAppReward name="fixedAppReward" class="inp100x gray" disabled="disabled" value="0"/>
					      	元
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否设置投标密码：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isBidPwd" name="isBidPwd" checked="checked" value="no" onclick="displayIsBidPwd()"/>
					      	不设置密码
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right"></td>
					    <td class="col-md-6">
					    	<input type="radio" id="isBidPwd" name="isBidPwd" value="yes" onclick="displayIsBidPwd()"/>
					      	设置投标密码
					      	<input type="text" id="bidPwd" name="bidPwd" maxlength="20" class="inp100x gray" disabled="disabled"/>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>还款方式：</td>
					    <td class="col-md-6">
							<select name="repaymentTypeId" id="repaymentTypeId" class="sel_140"> 
					    		<c:forEach items="${loanTenderRepayDate}" var="loanTenderRepay">
					            	<option value="${loanTenderRepay.key}">${loanTenderRepay.value}</option>
					       		</c:forEach>
							</select> 
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>借款总额：</td>
					    <td class="col-md-6"><input type="text" id="loanTotal" name="loanTotal" class="inp280"/></td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>年利率：</td>
					    <td class="col-md-6"><input type="text" name="loanApr"  class="inp280" />%</td>
					  </tr>
					</tbody>
			      </table>
			      <div id="subscriptionStateClose">
			      	<table style="width: 950px;">
			      		<tbody>
			      		  <tr>
						    <td class="col-md-6" align="right"><span style="color:#F00">*</span>最低投标金额：</td>
						    <td class="col-md-6">
							    <select name="lowestBidMoney" id="lowestBidMoney" class="sel_140" onFocus="funLowestBidMoney()">
								</select>
						    </td>
						  </tr>
						  <tr>
						    <td class="col-md-6" align="right"><span style="color:#F00">*</span>最多投标金额：</td>
						    <td class="col-md-6">
								<select name="largestBidMoney" id="largestBidMoney" class="sel_140" onFocus="funLargestBidMoney()">
								</select>
							</td>
						  </tr>
			      		</tbody>
			      	</table>
			      </div>
			      <div id="subscriptionStateOpen">
			      	<table style="width: 950px;">
			      		<tbody>
			      		  <tr>
						    <td class="col-md-6" align="right"><span style="color:#F00">*</span>最小认购单位：</td>
						    <td class="col-md-6">
						    	<input type="text" name="lowestSub" class="inp280" />元
							</td>
						  </tr>
			      		</tbody>
			      	</table>
			      </div>
			      <table  style="width: 950px;">
		          	<tbody>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>筹标期限：</td>
					    <td class="col-md-6">
							<select name="waitBidDeadlines" id="waitBidDeadlines" class="sel_140" onFocus="funWaitBidDeadlines()">
							</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right">借款备注：</td>
					    <td class="col-md-6"><input type="text" name="remark" class="inp280" /></td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right">借款详情：</td>
					    <td class="col-md-6"><textarea name="loanDetail" class="txt420"></textarea></td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">验证码：</td>
					  	<td class="col-md-6">
							<div class="col-md-6" align="left" style="padding: 0px; width: 120px;">
								<input type="text" id="captcha" name="captcha" maxlength="4" class="form-control" placeholder="验证码"/>
							</div>
							<div class="col-md-6">
								<img style="width:120px;height:32px;" class="img-responsive" id="login_kaptcha" src="${ctx}/resources/images/kaptcha.jpg" />
							</div>
					  	</td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right"></td>
					    <td class="col-md-6">
						<button type="submit" class="btn btn-default">提交</button>
					    </td>
					  </tr>
			      	</tbody>
			      </table>
		  		</form>    
	    	</div>
    	</div>
    </div>
    <hr class="featurette-divider2">
    
    </div>
    <jsp:include page="../foot.jsp"/>
    <script type="text/javascript">
	    $("#enteringJingZhi").validate({
    		rules:{
    			loanCode:"required",
    			loanTitle:"required",
    			loanPurposeId:"required",
    			loanDeadlinesId:"required",
    			readyRecMoney:"required",
    			loanManagementFees:"required",
    			repaymentTypeId:"required",
    			loanTotal:"required",
    			loanApr:"required",
    			lowestBidMoney:"required",
    			largestBidMoney:"required",
    			lowestSub:"required",
    			subTotal:"required",
    			tenderSum:"required",
    			waitBidDeadlines:"required",
    			captcha:"required"
    		},
    		messages:{
    			loanCode:"借款编号不能为空",
    			loanTitle:"借款标题不能为空",
    			loanPurposeId:"借款目的不能为空",
    			loanDeadlinesId:"借款期限不能为空",
    			readyRecMoney:"待收金额设置不能为空",
    			loanManagementFees:"借款管理费不能为空",
    			repaymentTypeId:"还款方式不能为空",
    			loanTotal:"借款总额不能为空",
    			loanApr:"年利率不能为空",
    			lowestBidMoney:"最低投标金额不能为空",
    			largestBidMoney:"最高投标金额不能为空",
    			lowestSub:"最小认购单位(元)不能为空",
    			subTotal:"认购总份数不能为空",
    			tenderSum:"投标数量不能为空",
    			waitBidDeadlines:"筹标期限不能为空",
    			captcha:"验证码不能为空"
    		},
    		submitHandler:function(){
    			$.ajax({
    				   type: "POST",
    				   url: ctx+"/borrowingLoan/add.json",
    				   dataType: "json",
    				   data: $("#enteringJingZhi").serialize(),
	    			   success: function(r) {
	    				   successAddLiuZhuan(r);
	                    },
	                    error: function() {
	                        alert("提交出错！");
	                    }
    				});
    		} 
    	});
	    function successAddLiuZhuan(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 500,
					        title : '保存成功',
					        body : '<div style="margin:10px;"><strong>'+data.msg+'</strong></div>',
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
					                	if(data.success){
					                		window.location.href="${ctx}/investment/index.htm?&p=1";
					                	}else{
					                		dialog.remove();
					                	}
					                }
					        }
						});
			});
		};
		//是否设置奖励
		function displayIsBidReward(){
			var isBidReward = document.enteringJingZhi.isBidReward;
			var bidProReward = document.enteringJingZhi.bidProReward;
			var fixedAppReward = document.enteringJingZhi.fixedAppReward;
			if(isBidReward[0].checked){
				bidProReward.disabled = "disabled";
				fixedAppReward.disabled = "disabled";
			}
			if(isBidReward[1].checked){
					bidProReward.disabled = "";
					fixedAppReward.disabled = "disabled";
			}
			if(isBidReward[2].checked){
				bidProReward.disabled = "disabled";
				fixedAppReward.disabled = "";
			}

		};
		//是否设置密码
		function displayIsBidPwd(){
			var isBidPwd = document.enteringJingZhi.isBidPwd;
			var bidPwd = document.enteringJingZhi.bidPwd;
			for(var i=0;i<isBidPwd.length;i++){
				if(isBidPwd[i].checked){
					if(isBidPwd[i].value == "yes"){
						bidPwd.disabled = "";
					}
					else{
						bidPwd.disabled = "disabled";
					}
				}
		    }
		};
		//动态加载后台的最低投标金额值
		var lowestBidMoney="${loanTenderDate.lowestBidMoney}"; //这是一字符串 
		var lowestBidMoneys=lowestBidMoney.split(","); //字符分割 
		function funLowestBidMoney(){
		  for (var i=0;i < lowestBidMoneys.length; i++) {
		    document.enteringJingZhi.lowestBidMoney.options[i] = new Option(lowestBidMoneys[i]+"元",lowestBidMoneys[i]);
		  }
		};
		//动态加载后台的最高投标金额值
		var largestBidMoney="${loanTenderDate.largestBidMoney}"; //这是一字符串 
		var largestBidMoneys=largestBidMoney.split(","); //字符分割 
		function funLargestBidMoney(){
		  for (var i=0;i < largestBidMoneys.length; i++) {
		    document.enteringJingZhi.largestBidMoney.options[i] = new Option(largestBidMoneys[i]+"元",largestBidMoneys[i]);
		  }
		};
		//动态加载后台的借款期限值
		var loanDeadlinesId="${loanTenderDate.loanDeadlinesMon}"; //这是一字符串 
		var loanDeadlinesIds=loanDeadlinesId.split(","); //字符分割 
		function funLoanDeadlinesId(){
		  for (var i=0;i < loanDeadlinesIds.length; i++) {
		    document.enteringJingZhi.loanDeadlinesId.options[i] = new Option(loanDeadlinesIds[i]+"个月",loanDeadlinesIds[i]);
		  }
		};
		//动态加载后台的筹标期限值
		var waitBidDeadlines="${loanTenderDate.waitBidDeadlines}"; //这是一字符串 
		var waitBidDeadliness=waitBidDeadlines.split(","); //字符分割 
		function funWaitBidDeadlines(){
		  for (var i=0;i < waitBidDeadliness.length; i++) {
		    document.enteringJingZhi.waitBidDeadlines.options[i] = new Option(waitBidDeadliness[i]+"天",waitBidDeadliness[i]);
		  }
		};
		$(function() {
			//判断是否开启认购模式
	        //如果是开启认购模式，就必须填写“最少认购单位(元)”
			if ("${loanTenderDate.subscriptionState}"=="open") {
				$("#subscriptionStateClose").hide();
				$("#subscriptionStateOpen").show();
			}else {//如果是关闭认购模式，就必须填写“最低投标金额”和“*最多投标金额”
				$("#subscriptionStateClose").show();
				$("#subscriptionStateOpen").hide();
			}
			//验证码验证
			$('#login_kaptcha').click(function() {  
				$('#captcha').val('');
	        	$(this).hide().attr('src','${pageContext.request.contextPath}/resources/images/kaptcha.jpg?' + Math.floor(Math.random() * 100)).fadeIn();     
		    });
		});
	</script> 

  </body>
</html>