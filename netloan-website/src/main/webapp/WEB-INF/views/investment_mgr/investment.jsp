<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%><!-- 引入jstl解析标签 -->
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %><!-- 引入自定义权限标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
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
		    padding-top: 100px;
		}
		
		
	</style>
  </head>
  <body>
  <jsp:include page="../nav_mgr/navInvestment.jsp"/>
	    <!-- CONTAINER START======================== -->
	    <div class="container">
	    <div class="panel panel-default">
		  <div class="panel-heading">
		    <h3 class="panel-title"><strong>借款条件筛选</strong></h3>
		  </div>
		  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
		     <form id="borrowingConditionsForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/investment/index.htm?&p=1" >
		      <div class="form-group">
			    <label for="loanTitle" class="col-sm-1 control-label" >关键字</label>
			    <div class="col-sm-3">
			      <input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${borrowingLoanQueryDTO.loanTitle}"  placeholder="借款标题"  />
			    </div>
			    <label for="cardId" class="col-sm-1 control-label" >还款方式</label>
			    <div class="col-sm-3">
			       <select  class="form-control col-sm-3" name="repaymentTypeId" id="repaymentTypeId">
					    <option value="">--请选择--</option>
					    <c:forEach items="${returnRepaymentType.rows}" var="repaymentType" varStatus="status">
							<option value="${repaymentType.repaymentTypeId}">${repaymentType.repaymentTypeName}</option>
						</c:forEach>
					</select>
			    </div>
			    <label for="loanPurposeId" class="col-sm-1 control-label" >借款目的</label>
			    <div class="col-sm-3">
			       <select class="form-control col-sm-3" name="loanPurposeId" id="loanPurposeId" >
					  <option value="">--请选择--</option>
					    <option value="长期使用">长期使用</option>
					    <option value="资金周转">资金周转</option>
					    <option value="短期周转">短期周转</option>
					    <option value="创业借款">创业借款</option>
					    <option value="其他借款">其他借款</option>
					    <option value="普通借款">普通借款</option>
					    <option value="随便玩玩">随便玩玩</option>
					</select>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="cardId" class="col-sm-1 control-label" >金额范围</label>
			    <div class="col-sm-2">
			      <select class="form-control col-sm-2"  name="loanTotalStart" id="loanTotalStart" onchange="loanTotalStartChecks(this.value);">
					  <option value="0">--请选择--</option>
				      <option value="50.0">50</option>
				      <option value="1000.0">1000</option>
				      <option value="5000.0">5000</option>
				      <option value="10000.0">1万</option>
				      <option value="50000.0">5万</option>
				      <option value="100000.0">10万</option>
				      <option value="200000.0">20万</option>
				      <option value="500000.0">50万</option>
				      <option value="1000000.0">100万</option>
				  </select>
			    </div>
			    <span style="float: left;margin-top: 8px;">至</span>
			    <div class="col-sm-2">
			     <select class="form-control col-sm-2" name="loanTotalEnd" id="loanTotalEnd" onchange="loanTotalEndChecks(this.value);" >
				    <option value="0">--请选择--</option>
				    <option value="1000.0">1000</option>
				    <option value="5000.0">5000</option>
				    <option value="10000.0">1万</option>
				    <option value="50000.0">5万</option>
				    <option value="100000.0">10万</option>
				    <option value="200000.0">20万</option>
				    <option value="500000.0">50万</option>
				    <option value="1000000.0">100万</option>
				 </select>
			    </div>
			    <label for="waitBidDeadlines" class="col-sm-1 control-label" >期限</label>
			    <div class="col-sm-2">
			       <input type="text" class="form-control" id="waitBidDeadlines" name="waitBidDeadlines" value="${borrowingLoanQueryDTO.waitBidDeadlines }" placeholder="筹标期限"  />
			    </div>
			    <label for="cardId" class="col-sm-1 control-label" >奖励</label>
			    <div class="col-sm-2">
			       <select class="form-control col-sm-3" name="reward" id="reward" >
					  <option value="0">--请选择--</option>
					    <option value="1">没有奖励</option>
					    <option value="2">按投标金额比例奖励</option>
					    <option value="3">按固定金额分摊奖励</option>
					</select>
			    </div>
			  </div>
			  <div class="form-group">
			     <label for="cardId" class="col-sm-3 control-label" >只显示</label>
			    <div class="col-sm-6 text-center">
			    <c:if test="${empty returnLoanTender.rows}">
					<tr>
			            <td colspan="5"><strong>暂无信息</strong></td>
			          </tr>
				</c:if>	  		
				<c:if test="${!empty returnLoanTender.rows}">  	
				<c:forEach items="${returnLoanTender.rows}" var="borrowingLoanTender" varStatus="status">
					<label class="checkbox-inline">
					<c:if test="${empty borrowingLoanQueryDTO.borrowTypes}">
						<input type="checkbox" id="inlineCheckbox1" name="borrowTypes" value="${borrowingLoanTender.loanTenderId}">
					</c:if>	  
					<c:if test="${!empty borrowingLoanQueryDTO.borrowTypes}">
						 <input type="checkbox" id="borrowType${status.index}" name="borrowTypes" value="${borrowingLoanTender.loanTenderId}">
				         <script type="text/javascript">
				         		var borrowTypes = $.parseJSON('${borrowTypes}');
				         		for(var i=0;i<borrowTypes.length;i++){
				         			if($('#borrowType'+${status.index}).val() == borrowTypes[i]){
				         				$('#borrowType'+${status.index}).prop("checked", true);
					             	}				         			
				         		}
				         </script>
					</c:if>	 
						<c:choose>
							   <c:when test="${borrowingLoanTender.loanrTenderName == '流转标'}">  
							   	${borrowingLoanTender.loanrTenderName} <img src="${ctx}/resources/images/borrow/liu.png" alt="liuzhuan">
							   </c:when>
							   <c:when test="${borrowingLoanTender.loanrTenderName == '信用标'}">  
							    ${borrowingLoanTender.loanrTenderName} <img src="${ctx}/resources/images/borrow/xin.png" alt="xinyong">
							   </c:when>
							   <c:when test="${borrowingLoanTender.loanrTenderName == '净值标'}">  
							   	${borrowingLoanTender.loanrTenderName} <img src="${ctx}/resources/images/borrow/jing.png" alt="jingzhi">
							   </c:when>
							   <c:when test="${borrowingLoanTender.loanrTenderName == '抵押标'}">  
							   	${borrowingLoanTender.loanrTenderName} <img src="${ctx}/resources/images/borrow/diya.png" alt="diya">
							   </c:when>
						</c:choose>
					</label>
				</c:forEach>
				</c:if>	
			    </div>
			    <div class="col-sm-3"></div>
			  </div>
			   <div class="form-group">
			    <div class="col-sm-3"></div>
			    <div class="col-sm-3 text-center"><button id="borrowingConditionsFormButton" type="submit" class="btn btn-primary btn-lg btn-block">搜&nbsp;&nbsp;索</button></div>
			    <div class="col-sm-3"><button id="borrowingConditionsFormButton" onclick="resetForm()" type="reset" class="btn btn-primary btn-lg btn-block">重&nbsp;&nbsp;置</button></div>
			    <div class="col-sm-3"></div>
			  	</div>
		     </form>
		  </div>
		</div>
	    <div class="row">
	    	<div class="col-md-9">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title"><strong>借款列表</strong></h3>
				  </div>
				  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
				    <div style="padding-top:10px;padding-bottom: 20px;">
					<a href="${ctx}/investment/index.htm?&p=1" class="btn btn-primary" role="button">全部借款</a></li>
					<a href="${ctx}/investment/index.htm?&p=1&loanState=tendering" class="btn btn-primary" role="button">招标中的借款</a>
				    <a href="${ctx}/investment/index.htm?&p=1&loanState=secondAuditor" class="btn btn-primary" role="button">满标的借款</a>
				    <a href="${ctx}/investment/index.htm?&p=1&loanState=repaymenting" class="btn btn-primary" role="button">还款中的借款</a>
				    <a href="${ctx}/investment/index.htm?&p=1&loanState=completed" class="btn btn-primary" role="button">已还完的借款</a>
				    <%-- <a href="${ctx}/investment/index.htm?&p=1&loanState=completed" class="btn btn-primary" role="button">逾期的黑名单</a> --%>
				    <div style="float: right;">
					    <span>排序：</span>
					    <c:choose>
						   <c:when test="${loanTotal == 'riseloanTotal'}">  
						   	<a id="pageloanTotal" data-toggle="tooltip" data-placement="top" title="升序" href="${ctx}/investment/index.htm?&p=1&pagetype=riseloanTotal" class="btn btn-info btn-sm" role="button">
						   	金额<img src="${ctx}/resources/images/borrow/page_up.jpg" alt="riseloanTotal"/></a>
						   </c:when>
					   		<c:otherwise> 
					   			<a id="pageloanTotal" data-toggle="tooltip" data-placement="top" title="降序" href="${ctx}/investment/index.htm?&p=1&pagetype=downloanTotal" class="btn btn-info btn-sm" role="button">
					   			金额<img src="${ctx}/resources/images/borrow/page_down.jpg" alt="downloanTotal"></a>
						   </c:otherwise>
						</c:choose>
					    <c:choose>
						   <c:when test="${credit == 'risecredit'}">  
						   	<a id="pagecredit" data-toggle="tooltip" data-placement="top" title="升序" href="${ctx}/investment/index.htm?&p=1&pagetype=risecredit" class="btn btn-info btn-sm" role="button">
						   	信用<img src="${ctx}/resources/images/borrow/page_up.jpg" alt="risecredit"></a>
						   </c:when>
					   		<c:otherwise> 
					   			<a id="pagecredit" data-toggle="tooltip" data-placement="top" title="降序" href="${ctx}/investment/index.htm?&p=1&pagetype=downcredit" class="btn btn-info btn-sm" role="button">
					   			信用<img src="${ctx}/resources/images/borrow/page_down.jpg" alt="downloanTotal"></a>
						   </c:otherwise>
						</c:choose>
						<c:choose>
						   <c:when test="${loanApr == 'riseloanApr'}">  
						   <a id="pageloanApr" data-toggle="tooltip" data-placement="top" title="升序" href="${ctx}/investment/index.htm?&p=1&pagetype=riseloanApr" class="btn btn-info btn-sm" role="button">
						   利率<img src="${ctx}/resources/images/borrow/page_up.jpg" alt="riseloanApr"></a>
						   </c:when>
					   		<c:otherwise> 
					   			<a id="pageloanApr" data-toggle="tooltip" data-placement="top" title="降序" href="${ctx}/investment/index.htm?&p=1&pagetype=downloanApr" class="btn btn-info btn-sm" role="button">
					   			利率<img src="${ctx}/resources/images/borrow/page_down.jpg" alt="downloanApr"></a>
						   </c:otherwise>
						</c:choose>
				    </div>
				  	</div>
				  	<table class="table" style="width:800px;padding: 10px;border: 0px solid red;">
			        <c:if test="${empty borrowingDatas.rows}">
					<tr>
			            <td colspan="5"><strong>暂无信息</strong></td>
			          </tr>
					</c:if>	  		
					<c:if test="${!empty borrowingDatas.rows}">  	
					<c:forEach items="${borrowingDatas.rows}" var="borrowingLoan" varStatus="status">
			        	<tr>
			        	<td rowspan="4" style="text-align:center;vertical-align: middle;border: 0px solid red;">
				        	<a href="${ctx}/investment/investmentdetail.htm?loanId=${borrowingLoan.loanId }&memberId=${borrowingLoan.memberId }&p=1">
				        	<img id="loanPicture"  src="${borrowingLoan.loanPicture}" style="width: 120px;height: 120px ;" />
				        	</a>
			        	</td>
			        	<td colspan="4" style="border:0px solid red;">
				        	<a href="#" onclick="doClicks('investment/investmentdetail.htm?&p=1','${borrowingLoan.memberId }','${borrowingLoan.loanId }');">
				        	${borrowingLoan.loanTitle }
				        	</a>
			        	<c:choose>
						   <c:when test="${borrowingLoan.loanTenderDisplay == '流转标'}">  
						   	<img src="${ctx}/resources/images/borrow/liu.png" alt="liuzhuan">
						   </c:when>
						   <c:when test="${borrowingLoan.loanTenderDisplay == '信用标'}">  
						   	<img src="${ctx}/resources/images/borrow/xin.png" alt="xinyong">
						   </c:when>
						   <c:when test="${borrowingLoan.loanTenderDisplay == '净值标'}">  
						   	<img src="${ctx}/resources/images/borrow/jing.png" alt="jingzhi">
						   </c:when>
						   <c:when test="${borrowingLoan.loanTenderDisplay == '抵押标'}">  
						   	<img src="${ctx}/resources/images/borrow/diya.png" alt="diya">
						   </c:when>
						</c:choose>
			        	</td>
			        	<td rowspan="4"style="text-align:center;vertical-align: middle;border: 0px solid black; ">
			        	<a href="#" onclick="doClick('${borrowingLoan.loanId }','${borrowingLoan.memberId }','1');">
			        		<button  id="borrowingLoan_loanState${status.index}"  type=button class="btn btn-primary btn-lg btn-block"></button>
			        	</a>
			        	<script type="text/javascript">
					       $('#borrowingLoan_loanState'+${status.index}).html(renderGridValue('${borrowingLoan.loanState }',fields.loanState));
					    </script>
			        	</td>
			        	</tr>
			        	<tr>
			        		<td>借款金额：
			        		<span class="text-danger"><fmt:formatNumber value="${borrowingLoan.loanTotal }" pattern="#,#00.00"/>元</span>
			        		</td>
			        		<td>利率：<fmt:formatNumber value="${borrowingLoan.loanApr * 100}" pattern="#,#00.00"/> %/年</td>
			        		<td>
			        			投标奖：
			        			<c:if test="${borrowingLoan.isBidReward == 'no'}">
			        				00.00
			        			</c:if>
			        			<c:if test="${borrowingLoan.isBidReward == 'yes'}">
				        			<c:if test="${borrowingLoan.fixedAppReward!=0}">
				        				<fmt:formatNumber value='${borrowingLoan.fixedAppReward}' pattern='#0.00'/>
				        			</c:if>
				        			<c:if test="${borrowingLoan.bidProReward!=0}">
				        				<fmt:formatNumber value='${borrowingLoan.bidProReward * borrowingLoan.loanTotal}' pattern='#0.00'/>
				        			</c:if>
			        			</c:if>
			        		</td>
			        		<td>招标期限：${borrowingLoan.waitBidDeadlines } 天</td>
			        	</tr>
			        	<tr>
			        		<td>发布者：${borrowingLoan.memberDisplay } </td>
			        		<td>${borrowingLoan.loanPurposeId }</td>
			        		<td>还需：<span id="stillNeed${status.index}"></span>
				        	<script type="text/javascript">
				        	if('${borrowingLoan.subTotal}' == '0.0'){
				        		$('#stillNeed'+${status.index}).html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrBidMoney}' pattern='#,#00.00'/>");
				        	}else{
				        		$('#stillNeed'+${status.index}).html("<fmt:formatNumber value='${borrowingLoan.loanTotal-borrowingLoan.alrSubSum*borrowingLoan.lowestSub}' pattern='#,#00.00'/>");

				        	}
				        	</script>	  
			        		 元</td>
			        		<td>投资完成：<span id="alrTenderPro${status.index}"><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/></span>%</td>
			        		<!-- <script type="text/javascript">
				        	$('#alrTenderPro'+${status.index}).html("<fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/>");
				        	</script> -->	
			        	</tr>
			        	<tr>
			        		<td>信用等级：<img id="creditPhotoDivImg"  src="${borrowingLoan.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
			        		<td>${borrowingLoan.repaymentTypeDisplay}</td>
			        		<td>投标的状态：<span id="borrowingLoan_loanState2${status.index}"></span>
			        		<script type="text/javascript">
					       		$('#borrowingLoan_loanState2'+${status.index}).html(renderGridValue('${borrowingLoan.loanState }',fields.loanState));
					    	</script>
			        		</td>
			        		<td>
			        		<div class="progress" style="border: 1px solid #DDDDDD;">
			        		<div id="progressBar${status.index}" class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="${borrowingLoan.alrTenderPro*100}" aria-valuemin="0" aria-valuemax="100" style="width: ${borrowingLoan.alrTenderPro*100}%;">
							</div>
							<!-- <script type="text/javascript">
				        	$('#progressBar'+${status.index}).prop("aria-valuenow", '${borrowingLoan.alrTenderPro*100}');
				        	$('#progressBar'+${status.index}).css({"width":"${borrowingLoan.alrTenderPro*100}"%});
				        	</script> -->
							</div>
			        		</td>
			        	</tr>
			        	</c:forEach>
			      		</c:if>	
			      		<c:if test="${!empty borrowingDatas.rows}">
			        	<tfoot>
				          <tr>
				            <th colspan="6">
				            	<div align="right">
								    <ul id='pageborrowingLoan'></ul>
								</div>
							</th>
				          </tr>
				        </tfoot>
				        </c:if>	  
			        </table>
				  </div>
				</div>
	    	</div>
	    	 <div class="col-md-3">
	    		<div class="panel-group" id="accordion">
					  <div class="panel panel-default">
					    <div class="panel-heading">
					      <h4 class="panel-title"><strong>借款标志说明</strong></h4>
					    </div>
				      <div class="panel-body">
					  	  <div class="row" >
					  		<div class="col-md-5"><span>净值借款:<img src="${ctx}/resources/images/borrow/jing.png" alt="jingzhi"></span></div>
					  		<div class="col-md-7"><span>信用借款:<img src="${ctx}/resources/images/borrow/xin.png" alt="xinyong"></span></div>
					  	  </div><br>
					  	  <div class="row" >
					  		<div class="col-md-5"><span>抵押借款:<img src="${ctx}/resources/images/borrow/diya.png" alt="diya"></span></div>
					  		<div class="col-md-7"><span>流转标:	<img src="${ctx}/resources/images/borrow/liu.png" alt="liuzhuan"></span></div>
					  	  </div><br>
					  	 <%--  <div class="row" >
					  		<div class="col-md-6"><span>实地考察:<img src="${ctx}/resources/images/borrow/shidi.png" alt="shidi"></span></div>
					  		<div class="col-md-6"><span>按天借款:<img src="${ctx}/resources/images/borrow/tianbiao.jpg" alt="tianbiao"></span></div>
					  	  </div><br> --%>
				      </div>
					  </div>
				</div>
				<!-- 收益计算器，它会自动漂浮到借款标志说明下面,开始标签 -->
		    	 <div style="margin-top: 20px;">
		    		<div class="panel-group" id="accordion">
						  <div class="panel panel-default">
						    <div class="panel-heading">
						      <h4 class="panel-title"><strong>收益计算器</strong></h4>
						    </div>
					      <div class="panel-body">
						      <form id="InvestmentCalculationsForm" class="form-horizontal" role="form"  method="post" >
							  	  <div class="form-group">
								    <label for="investmentMoney" class="col-sm-5 control-label">投资金额:</label>
								    <div class="col-sm-7">
								      <input type=text class="form-control" id="investmentMoney" name="investmentMoney" placeholder="投资金额" value="" required autofocus />
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="rate" class="col-sm-5 control-label">年利率:</label>
								    <div class="col-sm-5">
								      <input type="text" class="form-control" id="rate" name="rate" placeholder="年利率" value="" required />
								    </div>
								    <div class="col-sm-2" ><span style="float: left;text-align: left;">%</span></div>
								  </div>
								  <div class="form-group">
								    <label for="username" class="col-sm-5 control-label">投资期限:</label>
								    <div class="col-sm-5">
								      <input type=text class="form-control" id="loanDaadline" name="loanDaadline" placeholder="投资期限" value="" required autofocus />
								    </div>
								    <div class="col-sm-2" ><span style="float: left;text-align: left;">月</span></div>
								  </div>
								  <div class="form-group">
								    <label for="username" class="col-sm-5 control-label">还款方式:</label>
								    <div class="col-sm-7">
								      <%-- <input type=text class="form-control" id="username" name="username" placeholder="还款方式" value="${member.memberName}" required autofocus /> --%>
								      <select  class="form-control" name="repaymentTypeName" id="repaymentTypeName">
										    <c:forEach items="${returnRepaymentType.rows}" var="repaymentType" varStatus="status">
												<option value="${repaymentType.repaymentTypeName}">${repaymentType.repaymentTypeName}</option>
											</c:forEach>
										</select>
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="username" class="col-sm-5 control-label">投标奖励:</label>
								    <div class="col-sm-5">
								      <input type=text class="form-control" id="bidProReward" name="bidProReward" placeholder="0" value="0" />
								    </div>
								    <div class="col-sm-2" ><span style="float: left;text-align: left;">%</span></div>
								  </div>
								  <div class="form-group">
								    <label for="username" class="col-sm-5 control-label">加现金:</label>
								    <div class="col-sm-5">
								      <input type=text class="form-control" id="addCash" name="addCash" placeholder="0" value="0"  />
								    </div>
								    <div class="col-sm-2"><span style="float: left;text-align: left;">元</span></div>
								  </div>
								  <div class="form-group">
								    <div class="col-sm-12">
								      <button  id="login_submit" type="submit" class="btn btn-danger btn-lg btn-block">计算</button>
								    </div>
								  </div>
							</form>
							<div>
								<table id="InvestmentCalculationsTable" class="table" style="display: none;">
									<tr>
										<td>投标奖励:</td>
										<td id="tenderReward"></td>
									</tr>
									<tr>
										<td>年化收益:</td>
										<td id="AnnualizedRevenue"></td>
									</tr>
									<tr>
										<td>总计利息:</td>
										<td id="totalInterest"></td>
									</tr>
									<tr>
										<td>每月还款:</td>
										<td id="currentPayMoney"></td>
									</tr>
									<tr>
										<td>总共收益:</td>
										<td id="totalReceMoney"></td>
									</tr>
									<tr>
										<td>总计收益:</td>
										<td id="actualReceMoney"></td>
									</tr>
								</table>
							</div>
					      </div>
						  </div>
					</div>
		    	</div>
	    	<!-- 收益计算器，它会自动漂浮到借款标志说明下面,结束标签 -->
	    	</div>
	    	
	    </div>
	    
	    </div>
	    <!-- CONTAINER START======================== -->
	    <jsp:include page="../foot.jsp"/>
  </body>
  <script type="text/javascript">
	
  	function loanTotalStartChecks(v){
		var loanTotalEnd = document.getElementById("loanTotalEnd");//取出结束框
		var loanTotalEndIndex = loanTotalEnd.selectedIndex;//结束框选中项的下标
		var loanTotalEndValues = parseFloat(loanTotalEnd.options[loanTotalEndIndex].value);//取出结束框选中的值
		
		if(loanTotalEndValues!=0){
			if( v >= loanTotalEndValues ){
				alert("必须要选择高于"+loanTotalEndValues+"元查询!");
				$("#loanTotalStart").val(0);
			}
		}
		
	}
  
  
  	function loanTotalEndChecks(v){
		var loanTotalStart = document.getElementById("loanTotalStart");//取出开始框
		var loanTotalStartIndex = loanTotalStart.selectedIndex;//开始框选中项的下标
		var loanTotalStartValues = parseFloat(loanTotalStart.options[loanTotalStartIndex].value);//取出开始框选中的值
		
		if(loanTotalStartValues >= v){
			alert("必须要选择比"+loanTotalStartValues+"元高来做查询!");
			$("#loanTotalEnd").val(0);
		}
  	}
 
   	//构建表单
	function doClick(str,str_two,numb){
		// 创建Form  
	    var form = $('<form></form>');  
		// 设置属性  
	    form.attr('action', '<%=basePath%>investment/investmentdetail.htm');  
	    form.attr('method', 'post');  
	    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
	    form.attr('target', '_self');  
	    // 创建Input  
	    var my_input = $('<input type="text" name="loanId" />');  
	    my_input.attr('value', str);  
	    var my_input_two = $('<input type="text" name="memberId" />');  
	    my_input_two.attr('value', str_two); 
	    var my_input_three = $('<input type="text" name="p" />');  
	    my_input_three.attr('value', numb); 
	    // 附加到Form  
	    form.append(my_input); 
	    form.append(my_input_two); 
	    form.append(my_input_three); 
	    //表单的构建是否 完成
	    form.appendTo(document.body).submit();
	 }
  
  
	  //投资计算器
	  $("#InvestmentCalculationsForm").validate({
			rules:{
				investmentMoney:{
					required:true,
					number:true
				},
				rate:{
					required:true,
					number:true,
					min:1
				},
				loanDaadline:{
					required:true,
					digits:true,
					min:1
				},
				bidProReward:"number",
				addCash:"number"
			},
			messages:{
				investmentMoney:{
					required:"投资金额不能为空",
					number:"请输入正确的投资金额进行计算"
				},
				rate:{
					required:"年利率不能为空",
					number:"请输入正确的年利率",
					min:"年利率不能为0"
				},
				loanDaadline:{
					required:"投资期限不能为空",	
					digits:"请输入正确的投资期限",
					min:"投资期限至少为一个月"
				},
				bidProReward:"请输入正确的投资奖励",
				addCash:" 请输入正确的加现金"
			},
			submitHandler:function(){
				$.ajax({
					   type: "POST",
					   url: ctx+"/investment/InvestmentCalculationsForm.json",
					   dataType: "json",
					   data: $("#InvestmentCalculationsForm").serialize(),
	  			   	   success: function(r) {
							$("#InvestmentCalculationsTable").show();
							$("#tenderReward").html(FormatNumber(r.tenderReward,2)+"元");
							$("#AnnualizedRevenue").html(FormatNumber(r.AnnualizedRevenue,2)+"元"); 
							$("#totalInterest").html(FormatNumber(r.totalInterest,2)+"元");
							$("#currentPayMoney").html(FormatNumber(r.currentPayMoney,2)+"元");
							$("#totalReceMoney").html(FormatNumber(r.totalReceMoney,2)+"元");
							$("#actualReceMoney").html(FormatNumber(r.actualReceMoney,2)+"元<br/>(扣除10%管理费)");
							
	                  },
	                  error: function() {
	                      alert("提交出错！");
	                  }
					});
			} 
		});
  
  
  		/* 排序工具提示 */
  		$('#pageloanTotal').tooltip('hide');
  		$('#pagecredit').tooltip('hide');
  		$('#pageloanApr').tooltip('hide');
	  	if("${borrowingLoanQueryDTO.loanPurposeId }" != ''){
			$("#loanPurposeId").val("${borrowingLoanQueryDTO.loanPurposeId }");	
		}	
	  	if("${borrowingLoanQueryDTO.repaymentTypeId }" != ''){
			$("#repaymentTypeId").val("${borrowingLoanQueryDTO.repaymentTypeId }");	
		}
	  	if("${borrowingLoanQueryDTO.loanTotalStart }" != 0.0){
	  		$("#loanTotalStart").val("${borrowingLoanQueryDTO.loanTotalStart }");	
	  	}
	  	if("${borrowingLoanQueryDTO.loanTotalEnd }" != 0.0){
			$("#loanTotalEnd").val("${borrowingLoanQueryDTO.loanTotalEnd }");	
		}
	  	if("${borrowingLoanQueryDTO.reward }" != 0){
			$("#reward").val("${borrowingLoanQueryDTO.reward }");	
		}
	  	<!-- 分页显示表格数据 开始 -->
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
					//console.log(vars);
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
		 //获取p参数，也就是第几页,不是分页功能的代码，
		 $.each($.getUrlVars(), function(i, item) {
			 if(item=='p'){
				valp=$.getUrlVar(item);
				return false;
			 }
	 	 });
			//到这里结束，这部分不是分页代码
			return param;
		}
		
		var elementpageborrowingLoan = $('#pageborrowingLoan');
		
		//积分的设置分页的总页数
		var totalmessageNotice=${borrowingDatas.total}/10;
		if(parseInt(totalmessageNotice)==totalmessageNotice){
			var totalmessageNotice = parseInt(totalmessageNotice);
		}else {
			var totalmessageNotice = parseInt(totalmessageNotice)+1;
		}
		var messageNoticeOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${borrowingDatas.p},
		    numberOfPages: 10,
		    totalPages:totalmessageNotice,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/investment/index.htm?"+composeUrlParams()+"&p="+page;
		    	}
		}
		elementpageborrowingLoan.bootstrapPaginator(messageNoticeOptions);
		})
		<!-- 分页显示表格数据 结束 -->
		
		//编写FormatNumber方法，通过jquery格式化数据格式
		function FormatNumber(srcStr,nAfterDot){
			　　var srcStr,nAfterDot;
			　　var resultStr,nTen;
			　　srcStr = ""+srcStr+"";
			　　strLen = srcStr.length;
			　　dotPos = srcStr.indexOf(".",0);
			　　if (dotPos == -1){
			　　　　resultStr = srcStr+".";
			　　　　for (i=0;i<nAfterDot;i++){
			　　　　　　resultStr = resultStr+"0";
			　　　　}
			　　　　return resultStr;
			　　}
			　　else{
			　　　　if ((strLen - dotPos - 1) >= nAfterDot){
			　　　　　　nAfter = dotPos + nAfterDot + 1;
			　　　　　　nTen =1;
			　　　　　　for(j=0;j<nAfterDot;j++){
			　　　　　　　　nTen = nTen*10;
			　　　　　　}
			　　　　　　resultStr = Math.round(parseFloat(srcStr)*nTen)/nTen;
			　　　　　　return resultStr;
			　　　　}
			　　　　else{
			　　　　　　resultStr = srcStr;
			　　　　　　for (i=0;i<(nAfterDot - strLen + dotPos + 1);i++){
			　　　　　　　　resultStr = resultStr+"0";
			　　　　　　}
			　　　　　　return resultStr;
			　　　　}
			　　}
			};
			


			  //构建表单2
			function doClicks(url,str,loanid){
				// 创建Form  
				var form = $('<form></form>');  
				// 设置属性  
			    form.attr('action', '<%=basePath%>'+url);  
			    form.attr('method', 'post');  
			    // form的target属性决定form在哪个页面提交  (_self -> 当前页面 _blank -> 新页面)  
			    form.attr('target', '_self');  
			    // 创建Input  
			    var my_input = $('<input type="text" name="memberId" />');  
			    var my_input2 = $('<input type="text" name="loanId" />');  
			    
			    my_input.attr('value', str);  
			    my_input2.attr('value', loanid); 
			    
			    // 附加到Form  
			    form.append(my_input);  
			    form.append(my_input2)
			    //表单的构建是否 完成
			    form.appendTo(document.body).submit();
			 }
			//重置筛选条件
			function resetForm(){
				$("#loanTitle").attr("value","");
				$("#waitBidDeadlines").attr("value","");
			}
  </script>
</html>
