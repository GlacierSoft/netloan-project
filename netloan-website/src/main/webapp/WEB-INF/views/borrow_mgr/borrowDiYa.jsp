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
  <jsp:include page="../nav.jsp"/>
    <div class="container">
  	<div class="row">
    	<div class="col-md-12">
			<h2 style="margin-bottom: 25px;">冰川贷借款 - 抵押标详细介绍</h2>
			
			<div class="col-md-12">
			 	<div class="panel panel-default">       
			        <div class="lc_middle_items_top lc_blue"  style="width: 1108px;">抵押标</div>
			        
			        
			        <div class="jk_mid fn_clear">
						<div class="jk_mid_con">
						      
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">申请条件</div>
					          <div class="jk_mid_con_k_con">
					            <p >22-65周岁的中国公民&nbsp;&nbsp;<br />
					              	在现居住地居住满6个月<br />
					            </p>
					            <div class="jk_mid_con_but"><a href="/borrow/loan.html?type=flow" class="sq_but">立即申请</a></div>
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">借款方式</div>
					          <div class="jk_mid_con_k_con">
					            <p >借款额度：50,000&nbsp;-200,000<br />
					              借款年利率：&nbsp;10%-24%&#160;<br />
					              借款期限：&nbsp;1、2、3、6、9、12个月<br />
					              审核时间：&nbsp;1-3个工作日<br />
					            还款方式：&nbsp;等额本息，按月付息</p>
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">费用说明</div>
					          <div class="jk_mid_con_k_con">
					            <p >成交服务费<br />
					              用户成功借款后按借款期限一次性从所得借款中直接扣除收取，1个月内统一收取借款金额的1%。从第2个月开始，每个月加收0.4%的手续费（年手续费合计为5.4%）。借款手续费不计息，不退还，在借款金额中直接扣除。作为成交服务费。 </p>
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k">
					          <div class="jk_mid_con_k_title">必要申请材料</div>
					          <div class="jk_mid_con_k_con">
					            <p >身份证&#160;  <br />
							              个人征信报告（可去当地人民银行打印）&#160;  <br />
							              经营证明:<br />
							     a）注册满6个月的营业执照 <br />
							     b）经营场地租赁合同＋90天内的租金发票或水电单据<br />
							            可体现经营情况的近6个月常用银行卡流水（对公账户或个人账户）</p>
					          </div>
					        </div>
					        
					        <div class="jk_mid_bot_but"><a href="/borrow/loan.html?type=flow" class="sq_but">立即申请</a></div>
					        
						</div>
					</div>					
			        
			        
				</div>
			</div>
			
    	</div>
    </div>
    <hr class="featurette-divider2">
    <jsp:include page="../foot.jsp"/>
    </div>
  </body>
</html>