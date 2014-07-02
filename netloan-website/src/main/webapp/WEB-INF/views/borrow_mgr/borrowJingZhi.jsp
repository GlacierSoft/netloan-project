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
			<h2 style="margin-bottom: 25px;">冰川贷借款 - 净值标详细介绍</h2>
			
			<div class="col-md-12">
			 	<div class="panel panel-default">       
			        <div class="lc_middle_items_top lc_blue"  style="width: 1108px;">净值标</div>
			        
			        
			        <div class="jk_mid fn_clear">
						<div class="jk_mid_con">
						      
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">申请条件</div>
					          <div class="jk_mid_con_k_con">
					             <p >20-55周岁的中国公民<br />
								            发净值标的账户待收金额必须大于20万元
								 </p>
					            <div class="jk_mid_con_but"><a href="${ctx}/borrowingLoan/enteringJingZhi.htm" class="sq_but">立即申请</a></div>
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">借款方式</div>
					          <div class="jk_mid_con_k_con">
					            <p >借款额度：账户待收金额必须大于20万元 <br />
							      	借款年利率：&nbsp;1%-20%&#160;<br />
							                    借款期限：&nbsp;1个月<br />
							                    审核时间：&nbsp;1-3个工作日<br />
							                    还款方式：&nbsp;等额本息，每月还款 </p>
					          </div>
					        </div>
					        
					        <div class="jk_mid_con_k jk_mid_con_k_border">
					          <div class="jk_mid_con_k_title">费用说明</div>
					          <div class="jk_mid_con_k_con">
					            <p >成交服务费<br />
              						按借款期限收取成交管理费，每月0.1%（暂定，后期如有调整以最新调整费用为准）</p>
					          </div>
					        </div>
					        
					        <div class="jk_mid_bot_but"><a href="${ctx}/borrowingLoan/enteringJingZhi.htm" class="sq_but">立即申请</a></div>
					        
						</div>
					</div>					
			        
			        
				</div>
			</div>
			
    	</div>
    </div>
    <hr class="featurette-divider2">
    </div>
    <jsp:include page="../foot.jsp"/>
  </body>
</html>