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
			<h2 style="margin-bottom: 25px;">冰川贷借款 - 产品介绍</h2>
			
			<div class="col-md-3">
			 	<div class="panel panel-default" style="width: 284px;">       
			        <div class="lc_middle_items_top lc_blue">流转标</div>
			        <div class="lc_middle_items_middle ">
			          <div class="lc_middle_items_middle_top">
			            说明：债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。投资者对于流转标的购买份额最小为100元/份，流转期限由借款人确定,流转的周期不同，回报收益不同；通常流转期限越长，回报收益则越高。
			          </div>
			          <div class="borrow_detail_more">
			           <a href="${ctx}/borrowLiuZhuan.htm">详情介绍&gt;&gt;</a>
			          </div>
			          <div class="lc_middle_items_middle_bot">
			            <a href="${ctx}/borrowLiuZhuan.htm" class="bot">立即申请</a>
			          </div>
			        </div>
				</div>
			</div>
			
			<div class="col-md-3">
			 	<div class="panel panel-default" style="width: 284px;">       
			        <div class="lc_middle_items_top lc_green">抵押标</div>
			        <div class="lc_middle_items_middle ">
			          <div class="lc_middle_items_middle_top">
			            说明：抵质押借款标显示 "抵"字标记，是经过线下严格核查借款人资产负债、抵押担保（矿资源房产、土地抵押等）、优质资产和股权等有价证券质押担保手续，然后通过平台发布借款需求，【晋商贷】对借贷方提供连带担保责任的业务品种，确保风险控制在最低水平。 
			          </div>
			          <div class="borrow_detail_more">
			           <a href="${ctx}/borrowDiYa.htm">详情介绍&gt;&gt;</a>
			          </div>
			          <div class="lc_middle_items_middle_bot">
			            <a href="${ctx}/borrowDiYa.htm" class="bot">立即申请</a>
			          </div>
			        </div>
				</div>
			</div>
			
			<div class="col-md-3">
			 	<div class="panel panel-default" style="width: 284px;">       
			        <div class="lc_middle_items_top lc_yello">信用标</div>
			        <div class="lc_middle_items_middle ">
			          <div class="lc_middle_items_middle_top">
			           说明：信用借款标显示"信"字标记，是一种免抵押、免担保、纯信用，最高授信为10万元的小额个人信用借款标,主要面向公务员、医生或教师等机关企事业单位的在编人员。如借款人到期还款出现困难，逾期第30~33天由网站风险金补偿，债权转让为晋商贷网站所有。
			          </div>
			          <div class="borrow_detail_more">
			           <a href="${ctx}/borrowXinYong.htm">详情介绍&gt;&gt;</a>
			          </div>
			          <div class="lc_middle_items_middle_bot">
			            <a href="${ctx}/borrowXinYong.htm" class="bot">立即申请</a>
			          </div>
			        </div>
				</div>
			</div>
			
			<div class="col-md-3">
			 	<div class="panel panel-default" style="width: 284px;">       
			        <div class="lc_middle_items_top lc_red">净值标</div>
			        <div class="lc_middle_items_middle ">
			          <div class="lc_middle_items_middle_top">
			            说明：净值借款标显示"净"字标记，允许发布的最大金额为净资产，净资产小于20万不能发标。发布净值借款标用于临时周转，可以循环借款，但用户提现将受到限制。他是一种相对安全系数很高的借款标，因此利率方面可能比较低，用户可以借助此标放大自己的资金杠杆。
			          </div>
			          <div class="borrow_detail_more">
			           <a href="${ctx}/borrowJingZhi.htm">详情介绍&gt;&gt;</a>
			          </div>
			          <div class="lc_middle_items_middle_bot">
			            <a href="${ctx}/borrowJingZhi.htm" class="bot">立即申请</a>
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