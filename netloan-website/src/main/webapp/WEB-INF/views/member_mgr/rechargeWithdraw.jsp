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
		.rechargeFontSize {padding: 15px 19px 15px 19px; font-size: 12px; line-height: 24px; color: #878787; }
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
					          <a href="${ctx}/financeMember/rechargeWithdraw.htm?p=1" class="btn btn-info" role="button">充值提现</a>
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
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=firstAudit" class="btn btn-default" role="button">已发布的借款</a>
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
					      <div class="panel panel-default">
							  <div class="panel-body" style="padding-bottom: 0px; padding-top: 10px; padding-left: 25px;"><!-- style="text-align:center;vertical-align: middle;" -->
							     <form id="financeTransactionSearch"  class="form-horizontal" role="form"  method="post" action="${ctx}/financeMember/rechargeWithdraw.htm?p=1" >
								   <div class="form-group">
								    <div>
								      	<input type="hidden" id="dtp_input3" name="memberId" value="${currentMember.memberId}" />
								      	查询时间 起始时间：<input id="createStartTime" name="createStartTime" type="text" class="inp140" value="<fmt:formatDate value="${finTransactionQueryDTO.createStartTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({maxDate:'#F{$dp.$D(\'createEndTime\')||\'%y-%M-%d\'}'})"/>
								      	结束时间：<input id="createEndTime" name="createEndTime" type="text" class="inp140" value="<fmt:formatDate value="${finTransactionQueryDTO.createEndTime}" type="date"/>" onclick="WdatePicker({dateFmt:'yyyy-MM-dd',readOnly:'readOnly'})" onFocus="WdatePicker({minDate:'#F{$dp.$D(\'createStartTime\')}',maxDate:'%y-%M-%d'})"/>
									 	交易类型：<input type="text" class="inp100x" id="transactionType" name="transactionType" value="${finTransactionQueryDTO.transactionType}"/>
								    	<button id="financeTransactionSubmit" type="submit" class="cxbtn">查&nbsp;&nbsp;询</button>
								    </div>
								   </div>
							     </form>
							  </div>
						  </div>
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
					          <c:forEach items="${financeTransactionDatas.rows}" var="finTransaction">
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
				            <div class="rechargeFontSize">
				            	温馨提示:凡是在冰川网贷充值未投标的用户，15天以内提现收取本金0.5%，15天以后提现免费 冰川网贷禁止信用卡套现、虚假交易等行为,一经发现将予以处罚,包括但不限于：限制收款、冻结账户、永久停止服务,并有可能影响相关信用记录。
				            </div>
				            <form id="financeRecharge" name="financeRecharge" class="form-horizontal" role="form" method="post" >
					        	<table class="table table-bordered">
						          	<tbody>
								          <tr>
								            <td align="right" class="col-md-4">真实姓名:</td> 
								            <td>
								            	${currentMember.memberRealName}
								            	<input type="hidden" id="memberId" name="memberId" value="${currentMember.memberId}" >
								            </td>
								          </tr>
								          <tr>
								            <td align="right">账号：</td>
								            <td>${currentMember.memberName}</td>
								          </tr>
								          <tr>
								            <td align="right">充值金额：</td>
								            <td><input id="rechargeAmount" name="rechargeAmount" type="text" class="inp100x" />元</td>
								          </tr>
								          <tr>
								            <td align="right">充值类型：</td>
								            <td>
								            	<table>
									            	<c:forEach items="${financeRechargeSetDatas.rows}" var="financeRechargeSet">
									            		<tr>
									            			<td><input name="financeRechargeSetId" type="radio" value="${financeRechargeSet.financeRechargeSetId}"/></td>
									            			<td>${financeRechargeSet.rechargeSetName}</td>
									            		</tr>
									            	</c:forEach>
									            </table>
								            </td>
								          </tr>
								          <tr>
							            	<td align="right">充值回执：</td>
							            	<td>
							            		<input type="text" id="rechargeReceipt" name="rechargeReceipt" maxlength="50" class="inp200x"/>
							            	</td>
							              </tr>
								          <tr>
								            <td align="right">
								            	<button type="submit" class="btn btn-default">提交</button>
								            </td>
								            <td>
								            	<button type="reset" class="btn btn-default">重置</button>
								            </td>
								          </tr>
							      	</tbody>
							    </table>
						    </form>
						    <br>
						    <div class="rechargeFontSize">
						    	国付宝简介:国付宝信息科技有限公司（以下简称“国付宝”）是商务部中国国际电子商务中心（以下简称“CIECC”）与海航商业控股有限公司（以下简称“海航商业”）合资成立，针对政府及企业的需求和电子商务的发展，精心打造的国有背景的，引入社会诚信体系的独立第三方电子支付平台，也是“金关工程”的重要组成部分。国付宝信息科技有限公司成立于2011年1月25日，由商务部中国国际电子商务中心与海航商业控股有限公司合作成立，主要经营第三方支付业务。公司注册资本14285.72万元，主要经营第三方支付业务，互联网支付及移动电话支付（全国）。
						    </div>
				        </div>
				        <div class="tab-pane fade" id="withdraw">
				        	<div class="rechargeFontSize">
					        	<p>凡是在冰川网贷充值未投标的用户，15天以内提现收取本金0.5%，15天以后提现免费</p>
								<p>注：1、请输入您要取出金额,我们将在1至3个工作日(国家节假日除外)之内将钱转入您网站上填写的银行账号。<p> 
								<p>2、如你急需要把钱转到你的账号或者24小时之内网站未将钱转入到你的银行账号,请联系客服中心。 <p>
								<p>3、确保您的银行账号的姓名和您的网站上的真实姓名一致。 <p>
								<p>4、在钱打到您账号时会发一封站内信通知你。 <p>
								<p>5、每笔提现金额至少为100元以上（备注：如101、632等）<p>
								<p>6、每笔提现金额最高不能超过50000元。 <p>
								<p>7、您目前能提取的最高额度是1354539.92元。<p>
						    </div>
						    <form id="financeWithdraw" name="financeWithdraw" class="form-horizontal" role="form" method="post" >
							    <table class="table table-bordered">
						          	<tbody>
								          <tr>
								            <td>真实姓名</td> 
								            <td>${currentMember.memberRealName}</td>
								          </tr>
								          <tr>
								            <td>账号：</td>
								            <td>${currentMember.memberName}</td>
								          </tr>
								          <tr>
								            <td>账户余额</td> 
								            <td>${financeMemberData.amount}</td>
								          </tr>
								          <tr>
								            <td>可用余额：</td>
								            <td>${financeMemberData.usableMoney}</td>
								          </tr>
								          <tr>
								            <td>冻结总额：</td>
								            <td>${financeMemberData.frozenMoney}</td>
								          </tr>
								          <tr>
								            <td>提现金额：</td>
								            <td><input id="withdrawAmount" name="withdrawAmount" type="text" class="inp100x" />元
								            <input type="hidden" id="memberId" name="memberId" value="${currentMember.memberId}" ></td>
								          </tr>
								          <tr>
								            <td>银行卡：</td>
								            <td>
									            <select name="bankCardId" id="bankCardId" class="inp100x"> 
										    		<c:forEach items="${financeBankCardDatas}" var="financeBankCard">
										            	<option value="${financeBankCard.key}">${financeBankCard.value}</option>
										       		</c:forEach>
												</select> 
												<a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">银行卡设置</a>
								            </td>
								          </tr>
								          <tr>
								            <td>交易密码：</td>
								            <td><input type="password" id="tradersPassword" name="tradersPassword" maxlength="50" class="inp100x"/></td>
								          </tr>
								          <tr>
								            <td>验证码：</td>
								            <td><input  type="text" class="inp100x" />&nbsp;<button type="submit" class="btn btn-default">发送手机验证码</button>&nbsp;<span style="color:#F00"> * 演示站点不发送短信</span></td>
								          </tr>
								          <tr>
								            <td colspan="2" align="center">
								            	<button type="submit" class="btn btn-default">提交</button>
								            	<button type="reset" class="btn btn-default">重置</button>
								            </td>
								          </tr>
							      	</tbody>
							    </table>
							</form>
						    <div class="rechargeFontSize">
						    	* 温馨提示：禁止信用卡套现
						    </div>
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
		var total=${financeTransactionDatas.total}/5;
		if(parseInt(total)==total){
			var total = parseInt(total);
		}else {
			var total = parseInt(total)+1;
		}
		
		var options = {
		    bootstrapMajorVersion:3,
		    currentPage: ${financeTransactionDatas.p},
		    numberOfPages: 5,
		    totalPages:total,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/financeMember/rechargeWithdraw.htm?"+composeUrlParams()+"&p="+page;
		    }
		}
	
		element.bootstrapPaginator(options);
	})
	
	
    $("#financeRecharge").validate({
   		rules:{
   			rechargeAmount:"required",
   			financeRechargeSetId:"required"
   		},
   		messages:{
   			rechargeAmount:"必须填写充值金额",
   			financeRechargeSetId:"必须选择一种充值类型"
   		},
   		submitHandler:function(){
   			$.ajax({
   				   type: "POST",
   				   url: ctx+"/recharge/add.json",
   				   dataType: "json",
   				   data: $("#financeRecharge").serialize(),
    			   success: function(r) {
    				   successAddRecharge(r);
                    },
                    error: function() {
                        alert("提交出错！");
                    }
   				});
   		} 
   	});
	$("#financeWithdraw").validate({
   		rules:{
   			withdrawAmount:"required",
   			tradersPassword:"required"
   		},
   		messages:{
   			withdrawAmount:"必须填写提现金额",
   			tradersPassword:"必须填写交易密码"
   		},
   		submitHandler:function(){
   			$.ajax({
   				   type: "POST",
   				   url: ctx+"/withdraw/add.json",
   				   dataType: "json",
   				   data: $("#financeWithdraw").serialize(),
    			   success: function(r) {
    				   successAddRecharge(r);
                    },
                    error: function() {
                        alert("提交出错！");
                    }
   				});
   		} 
   	});
    function successAddRecharge(data){
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
				                		window.location.href="${ctx}/financeMember/rechargeWithdraw.htm?p=1";
				                	}else{
				                		dialog.remove();
				                	}
				                }
				        }
					});
		});
	};

</script>
 
  </body>
</html>