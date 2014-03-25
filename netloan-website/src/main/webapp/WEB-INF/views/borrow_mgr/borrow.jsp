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
		    padding-top: 100px;
		}
	</style>
  </head>

  <body>
  <jsp:include page="../nav.jsp"/>
       
	    <div class="container">
	  	<div class="row">

	    	<div class="col-md-12">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">信用引导/ 借款流程</h3>
				  </div>
				  <div class="panel-body">
			          
			          
			          
			          
			          
			          <div class="detail-main">
			          
				    	<div class="borrow-title">
				        	晋商贷借款 - 产品介绍
				        </div>
				        
				        <div class="borrow-content clearfix">
				        
					      <div class="lc_middle_items">
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
					      
					      <div class="lc_middle_items">
					        <div class="lc_middle_items_top lc_green">抵押标</div>
					        <div class="lc_middle_items_middle lc_border_left">
					          <div class="lc_middle_items_middle_top">
					          说明：抵质押借款标显示 "抵"字标记，是经过线下严格核查借款人资产负债、抵押担保（矿资源房产、土地抵押等）、优质资产和股权等有价证券质押担保手续，然后通过平台发布借款需求，【晋商贷】对借贷方提供连带担保责任的业务品种，确保风险控制在最低水平。 </div>
					          <div class="lc_middle_items_middle_middle pledge_detail">
					             <ul>
					               <li>收益稳定，预期年化收益15%-24%</li>
					               <li>融资主体要求:<br />
					               为守信且经营稳健的小微企业和22至65周岁的个人；其中个人为具有完全民事行为能力人，具备中国国籍（不含港澳台居民），并在现居住地居住满6个月。</li>
					               <li>拥有足值资产或高质量债权、引入第三方担保、无不良信用记录、资金用途合法合规</li>
					             </ul>
					          </div>
					          <div class="pledge_check_detail borrow_detail_more">
					          <a href="###">详情介绍&gt;&gt;</a>
					          </div>
					          <div class="lc_middle_items_middle_bot">
					            <a href="/fast_detail.html" class="bot">立即申请</a>
					          </div>
					        </div>
					      </div>
					      
					      <div class="lc_middle_items">
					        <div class="lc_middle_items_top lc_yello">信用标</div>
					         <div class="lc_middle_items_middle lc_border_left">
					          <div class="lc_middle_items_middle_top">
					           说明：信用借款标显示"信"字标记，是一种免抵押、免担保、纯信用，最高授信为10万元的小额个人信用借款标,主要面向公务员、医生或教师等机关企事业单位的在编人员。如借款人到期还款出现困难，逾期第30~33天由网站风险金补偿，债权转让为晋商贷网站所有。 </div>
					          <div class="lc_middle_items_middle_middle credit_detail">
					             <ul>
					               <li>收益稳定，预期年化收益5%-24%</li>
					               <li>借款期限：1-12个月</li>
					               <li>有固定自有住房、有稳定工作<br />
					               信用良好，无严重逾期、无个人信用卡逾期不良记录。</li>
					               <li>拥有中国大陆二代身份证公民，年龄在18周岁以上。</li>
					               <li>现工作单位连续工作6个月以上，有稳定收入的经济来源。</li>               
					             </ul>
					          </div>
					          <div class="credit_check_detail borrow_detail_more">
					          <a href="###">详情介绍&gt;&gt;</a>
					    
					          </div>
					          <div class="lc_middle_items_middle_bot">
					            <a href="/xin_detail.html" class="bot">立即申请</a>
					          </div>
					        </div>
					      </div>
					      
					      <div class="lc_middle_items">
					        <div class="lc_middle_items_top lc_red">净值标</div>
					        <div class="lc_middle_items_middle">
					          <div class="lc_middle_items_middle_top">
					          说明：净值借款标显示"净"字标记，允许发布的最大金额为净资产，净资产小于20万不能发标。发布净值借款标用于临时周转，可以循环借款，但用户提现将受到限制。他是一种相对安全系数很高的借款标，因此利率方面可能比较低，用户可以借助此标放大自己的资金杠杆。 </div>
					          <div class="lc_middle_items_middle_middle net_worth_detail" style="left: -137px;">
					             <ul>
					               <li>预期年化收益5%-20%</li>
					               <li>发净值标的账户待收金额必须大于20万元。</li>
					               <li>在账户成功充值总额减去已成功提现总额大于20万元的情况下，本次净值标最大发标金额为净值借款倍率的3倍再减去净值标待还总额。</li>
					               <li>净值发标标题中含有“顶息、高息、提前还款”误导词汇，一律审核失败；</li>
					               <li>对净值借款入帐金额频繁反复提现后又充值行为的，视风控情况责令停止其净值借款标审核并限制永久净值借款发标；</li>
					             </ul>
					          </div>
					           <div class="net_worth_check_detail borrow_detail_more">
					          <a href="###">详情介绍&gt;&gt;</a>
					     
					          </div>
					          <div class="lc_middle_items_middle_bot">
					            <a href="/jinzhi_detail.html" class="bot">立即申请</a>
					          </div>
					        </div>
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