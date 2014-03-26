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
			<h2>晋商贷借款 - 产品介绍</h2>
			
			<div class="col-md-3">
			 	<div class="panel panel-default" style="width: 284px;">       
			        <div class="lc_middle_items_top lc_blue">流转标</div>
			        <div class="lc_middle_items_middle ">
			          <div class="lc_middle_items_middle_top">
			            说明：债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。投资者对于流转标的购买份额最小为100元/份，流转期限由借款人确定,流转的周期不同，回报收益不同；通常流转期限越长，回报收益则越高。
			          </div>
			          <div class="lc_middle_items_middle_middle flow_detail">
			             <ul>
			               <li>收益稳定，预期年化收益15%-24%</li>
			               <li>【还款保障】流转标不存在逾期,（如流转周期为30天，投资在投资后720小时后系统自动还款），时间精确到分秒，到期系统自动还款，如借户资金不足，会成为负数，由公司与借款人结算，流转标即以公司自有资金为投资人担保，借款人均为公司极度紧密的业务合作伙伴，自动回购后，债权将转为本公司所有。</li>               
			             </ul>
			          </div>
			          <div class="flow_check_detail borrow_detail_more">
			           <a href="###">详情介绍&gt;&gt;</a>
			          </div>
			          <div class="lc_middle_items_middle_bot">
			            <a href="/flow_detail.html" class="bot">立即申请</a>
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