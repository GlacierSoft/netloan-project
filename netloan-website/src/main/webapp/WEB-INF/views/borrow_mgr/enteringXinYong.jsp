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
		.inp280 {
		    border: 1px solid #CCCCCC;
		    height: 20px;
		    line-height: 20px;
		    width: 280px;
		}
		.sel_140 {
		    border: 1px solid #ADBCC7;
		    font-size: 12px;
		    height: 20px;
		    width: 140px;
		}
		.inp100x {
		    border: 1px solid #CCCCCC;
		    height: 20px;
		    line-height: 20px;
		    width: 100px;
		}
		.txt420{
		    border: 1px solid #CCCCCC;
		    height: 100px;
		    width: 280px;
		}
	</style>
  </head>

  <body>
  <jsp:include page="../nav.jsp"/>
    <div class="container">
  	<div class="row">
    	
    	<div>
    		<h3>发布信用标</h3>
    		<p style="color:#F00">* 为必填项，所有资料均会严格保密。</p>
    		<div>
    			<form id="enteringLiuZhuan" name="enteringLiuZhuan" class="form-horizontal" role="form" method="post" >
		          <table  style="width: 950px;">
		          	<tbody>
		          	  <tr>
			            <td class="col-md-6" align="right">
			            	<span style="color:#F00">*</span>借款编号：
			            </td>
			            <td class="col-md-6">
			            	<input id="memberId" name="memberId" type="hidden" value="${currentMember.memberId}" >
			            	<input id="loanCode" name="loanCode" type="text" class="inp280" maxlength="12"/>
			            </td>
			          </tr>
			          <tr>
			            <td class="col-md-6" align="right">
			            	<span style="color:#F00">*</span>借款标题：
			            </td>
			            <td class="col-md-6">
			            	<input id="loanTitle" name="loanTitle" type="text" class="inp280" maxlength="12"/>
			            </td>
			          </tr>
					  <tr>
					    <td class="col-md-6" align="right">
					    	<span style="color:#F00">*</span>借款图片：
					    </td>
					    <td class="col-md-6">
						    <input type="hidden" id="loanPicture" name="loanPicture" value="images/default-img.jpg"/>
					        <input type="radio" name="radio" id="r_1" checked="checked" value="1" />上传借款图片
					        <input type="radio" name="radio" id="r_2" value="2" />使用用户头像 
					        <input type="radio" name="radio" id="r_3" value="3" />使用系统头像
					        <input type="hidden" id="radioval" name="paramMap.radioval" value=""/>
					  	</td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right">借款标的：</td>
					    <td class="col-md-6"> <input type="hidden" id="loanTenderId" name="loanTenderId" value="2587bd0ecc859e35f2874f2aff0d4852"/>流转标</td>
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
						    <select name="loanDeadlinesId" id="loanDeadlinesId" class="sel_140">
							    <option value="">--请选择--</option>
							    <option value="1个月">1个月</option>
							    <option value="2个月">2个月</option>
							    <option value="3个月">3个月</option>
							    <option value="4个月">4个月</option>
							    <option value="5个月">5个月</option>
							    <option value="6个月">6个月</option>
							    <option value="7个月">7个月</option>
							    <option value="8个月">8个月</option>
							    <option value="9个月">9个月</option>
							    <option value="10个月">10个月</option>
							    <option value="11个月">11个月</option>
							    <option value="12个月">12个月</option>
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
					     	<input type="text" id="bidProReward" name="bidProReward" class="inp100x gray" disabled="disabled"/>
					      元
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right"></td>
					    <td class="col-md-6">
					     	<input type="radio" id="isBidReward" name="isBidReward" value="yes" onclick="displayIsBidReward()"/>
					      	按固定金额分摊奖励
					      	<input type="text" id=fixedAppReward name="fixedAppReward" class="inp100x gray" disabled="disabled"/>
					      	%
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否有投标待收限制：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isBidMarked" name="isBidMarked" checked="checked" value="yes" />是
					    	<input type="radio" id="isBidMarked" name="isBidMarked" value="no" />否
					    </td>
					  </tr>
					  <tr>
			            <td class="col-md-6" align="right">
			            	<span style="color:#F00">*</span>待收金额设置：
			            </td>
			            <td class="col-md-6">
			            	<input id="readyRecMoney" name="readyRecMoney" type="text" class="inp280" maxlength="12"/>
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
			            <td class="col-md-6" align="right">
			            	<span style="color:#F00">*</span>借款管理费：
			            </td>
			            <td class="col-md-6">
			            	<input id="loanManagementFees" name="loanManagementFees" type="text" class="inp280" maxlength="12"/>
			            </td>
			          </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>还款方式：</td>
					    <td class="col-md-6">
					    <select name="repaymentTypeId" id="repaymentTypeId" class="sel_140">
						    <option value="">--请选择--</option>
						    <option value="1">等额本息</option>
						    <option value="2">按月付息，到期还本</option>
						    <option value="4">一次性还款</option>
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
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>最低投标金额：</td>
					    <td class="col-md-6">
					    <select name="lowestBidMoney" id="lowestBidMoney" class="sel_140">
						    <option value="100">100</option>
						    <option value="200">200</option>
						    <option value="500">500</option>
						    <option value="800">800</option>
						    <option value="1000">1000</option>
						</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>最多投标金额：</td>
					    <td class="col-md-6">
					    <select name="largestBidMoney" id="largestBidMoney" class="sel_140">
						    <option value="">没有限制</option>
						    <option value="1000">1000</option>
						    <option value="5000">5000</option>
						    <option value="10000">10000</option>
						    <option value="20000">20000</option>
						    <option value="50000">50000</option>
						</select>
						</td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>最小认购单位(元)：</td>
					    <td class="col-md-6">
					    <select name="lowestSub" id="lowestSub" class="sel_140">
						    <option value="100">100</option>
						    <option value="200">200</option>
						    <option value="500">500</option>
						    <option value="1000">1000</option>
						</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>认购总份数：</td>
					    <td class="col-md-6"><input type="text" name="subTotal"  class="inp280" /></td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>投标数量：</td>
					    <td class="col-md-6"><input type="text" name="tenderSum"  class="inp280" /></td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>筹标期限：</td>
					    <td class="col-md-6">
					    <select name="waitBidDeadlines" id="waitBidDeadlines" class="sel_140">
						    <option value="">--请选择--</option>
						    <option value="0">0天</option>
						    <option value="1">1天</option>
						    <option value="2">2天</option>
						    <option value="3">3天</option>
						    <option value="4">4天</option>
						    <option value="5">5天</option>
						    <option value="6">6天</option>
						    <option value="7">7天</option>
						</select>
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否公开帐户资金：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isAccountFunds" name="isAccountFunds" checked="checked" value="yes" />是
					    	<input type="radio" id="isAccountFunds" name="isAccountFunds" value="no" />否
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否公开借款资金：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isLoanFunds" name="isLoanFunds" checked="checked" value="yes" />是
					    	<input type="radio" id="isLoanFunds" name="isLoanFunds" value="no" />否
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否公开信用额度：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isCreditAmount" name="isCreditAmount" checked="checked" value="yes" />是
					    	<input type="radio" id="isCreditAmount" name="isCreditAmount" value="no" />否
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否公开投标资金：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isBidFunds" name="isBidFunds" checked="checked" value="yes" />是
					    	<input type="radio" id="isBidFunds" name="isBidFunds" value="no" />否
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否允许自动投标：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isAutomaticBid" name="isAutomaticBid" checked="checked" value="yes" />是
					    	<input type="radio" id="isAutomaticBid" name="isAutomaticBid" value="no" />否
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right">是否设为推荐：</td>
					    <td class="col-md-6">
					    	<input type="radio" id="isRecommend" name="isRecommend" checked="checked" value="yes" />是
					    	<input type="radio" id="isRecommend" name="isRecommend" value="no" />否
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
    <jsp:include page="../foot.jsp"/>
    </div>
    <script type="text/javascript">
	    $("#enteringLiuZhuan").validate({
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
    			waitBidDeadlines:"required"
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
    			waitBidDeadlines:"筹标期限不能为空"
    		},
    		submitHandler:function(){
    			$.ajax({
    				   type: "POST",
    				   url: ctx+"/borrowingLoan/add.json",
    				   dataType: "json",
    				   data: $("#enteringLiuZhuan").serialize(),
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
					                		window.location.href="${ctx}/borrow.htm";
					                	}else{
					                		dialog.remove();
					                	}
					                }
					        }
						});
			});
		};
		function displayIsBidReward(){
			var isBidReward = document.enteringLiuZhuan.isBidReward;
			var bidProReward = document.enteringLiuZhuan.bidProReward;
			var fixedAppReward = document.enteringLiuZhuan.fixedAppReward;
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
		function displayIsBidPwd(){
			var isBidPwd = document.enteringLiuZhuan.isBidPwd;
			var bidPwd = document.enteringLiuZhuan.bidPwd;
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
    </script>
  </body>
</html>