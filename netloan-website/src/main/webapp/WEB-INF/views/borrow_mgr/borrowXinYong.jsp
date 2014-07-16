<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
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
		    padding-top: 70px;
		}
	</style>
  </head>

  <body>
 <jsp:include page="../nav_mgr/navBorrow.jsp"/>
    <div class="container">
  	<div class="row">
    	<div class="col-md-12">
			<h2 style="margin-bottom: 25px;">冰川贷借款 - 信用标详细介绍</h2>
			
			<div class="col-md-12">
			 	<div class="panel panel-default">       
			        <div class="lc_middle_items_top lc_blue"  style="width: 1108px;">信用标</div>
			        
			        
			        <div class="jk_mid fn_clear">
						<div class="jk_mid_con">
						      
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">申请条件</div>
					          <div class="jk_mid_con_k_con">
					            <p>18周岁以上的中国公民&nbsp;<br/>
					            	在现单位工作满6个月 	<br/>
					            	有固定自有住房、有稳定工作 <br/>
					            	信用良好，无严重逾期、无个人信用卡逾期不良记录<br/>
					            </p>
					            <%-- <div class="jk_mid_con_but"><a href="${ctx}/borrowingLoan/enteringXinYong.htm" class="sq_but">立即申请</a></div> --%>
					            <div class="jk_mid_con_but">
							        <form id="judgeBorrowxin" name="judgeBorrowxin" class="form-horizontal" role="form" method="post" >
							        	<input id="memberId" name="memberId" type="hidden" value="${currentMember.memberId}" >
							        	<button type="submit" class="btn sq_but" >立即申请</button>
							        </form>
						        </div>
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">借款方式</div>
					          <div class="jk_mid_con_k_con">
					             <p >借款额度：￥50,00&nbsp;-￥100,000<br />
								              借款年利率：1-24%&#160;<br />
								              借款期限：&nbsp;1-12个月<br />
								              审核时间：&nbsp;1-3个工作日<br />
								              还款方式：&nbsp;等额本息 </p>
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">费用说明</div>
					          <div class="jk_mid_con_k_con">
					            <p >成交服务费<br />
								          用户成功借款后按借款期限一次性从所得借款中直接扣除收取，1个月内统一收取借款金额的1%。从第2个月开始，每个月加收0.4%的手续费（年手续费合计为5.4%）。借款手续费不计息，不退还，在借款金额中直接扣除。作为成交服务费。<br/>
									信用借款标未补偿本金前借款人还款，本息按正常标准还款，另外逾期每天按千分之二收取罚息，投标人和晋商贷各收取千分之一。 <br />
									信用借款标补偿本金后借款人还款，本息按正常标准还款，另外逾期每天按千分之二收取罚息，本金利息及罚息全部为晋商贷收取。 <br />
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k">
					          <div class="jk_mid_con_k_title">必要申请材料</div>
					          <div class="jk_mid_con_k_con">
					             <p >身份证&#160; <br />
								              个人征信报告（可去当地人民银行打印）&#160; <br />
								              带公司公章的劳动合同或工作证明&#160; <br />
								              近3个月工资卡银行流水&#160; </p>
					          </div>
					        </div>
					        <%-- <div class="jk_mid_bot_but"><a href="${ctx}/borrowingLoan/enteringXinYong.htm" class="sq_but">立即申请</a></div> --%>
					        <div class="jk_mid_bot_but">
						        <form id="judgeBorrowxin2" name="judgeBorrowxin2" class="form-horizontal" role="form" method="post" >
						        	<input id="memberId" name="memberId" type="hidden" value="${currentMember.memberId}" >
						        	<button type="submit" class="btn sq_but" style="float: left;margin-left: 400px;" >立即申请</button>
						        	<a href="${ctx}/borrow.htm" class="btn sq_but" style="line-height: 30px;float: left;margin-left: 30px;">返回</a>
						        </form>
					        </div>
						</div>
					</div>					
				</div>
			</div>
			
    	</div>
    </div>
    <hr class="featurette-divider2">
    </div>
     <jsp:include page="../foot.jsp"/>
     <script type="text/javascript">
    	//判断该登录会员是否已经存在初审状态中的借款，上面提交按钮
	    $("#judgeBorrowxin").validate({
    		rules:{
    		},
    		messages:{
    		},
    		submitHandler:function(){
    			$.ajax({
   				   type: "POST",
   				   url: ctx+"/borrowingLoan/judgeBorrowingLoan.json",
   				   dataType: "json",
   				   data: $("#judgeBorrowxin").serialize(),
    			   success: function(r) {
    				   successAddLiuZhuan(r);
                    },
                    error: function() {
                        alert("提交出错！");
                    }
   				});
    		}
    	});
	  	//判断该登录会员是否已经存在初审状态中的借款,下面提交按钮
	    $("#judgeBorrowxin2").validate({
    		rules:{
    		},
    		messages:{
    		},
    		submitHandler:function(){
    			$.ajax({
   				   type: "POST",
   				   url: ctx+"/borrowingLoan/judgeBorrowingLoan.json",
   				   dataType: "json",
   				   data: $("#judgeBorrowxin2").serialize(),
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
	    	//如果不存在，则转到借款页面
	    	if(data.success){
        		window.location.href="${ctx}/borrowingLoan/enteringXinYong.htm?&memberId=${currentMember.memberId}";
        	}else{//如果存在，则提示错误信息
        		KindEditor.ready(function(K) {
    				var dialog = K.dialog({
    			        width : 500,
    			        body : '<div style="margin:10px;"><strong>'+"您还有未审核通过的借款，暂时还不能再次发布！"+'</strong></div>',
    			        closeBtn : {
    		                name : '关闭',
    		                click : function(e) {
   		                        dialog.remove();
    		                }
    		        	},
    			        yesBtn : {
    		                name : '关闭',
    		                click : function(e) {
    		                	dialog.remove();
    		                }
    			        }
    				});
    			});
          	}
	    }
	</script>
  </body>
</html>