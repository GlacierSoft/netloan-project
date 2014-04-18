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
	</style>
  </head>

  <body>
  <jsp:include page="../nav.jsp"/>
    <div class="container">
  	<div class="row">
    	
    	<div>
    		<h3>发布流转标</h3>
    		<p style="color:#F00">* 为必填项，所有资料均会严格保密。</p>
    		<h5>借款基本信息</h5>
    		<div>
    			<form id="enteringLiuZhuan" class="form-horizontal" role="form" method="post" >
		          <table>
		          	<tbody>
			          <tr>
			            <td class="col-md-6" align="right">
			            	<span style="color:#F00">*</span>借款标题：
			            </td>
			            <td class="col-md-6">
			            	<input id="memberId" name="memberId" type="hidden" value="${currentMember.memberId}" >
			            	<input id="loanCode" name="loanCode" type="text" class="inp280" maxlength="12" value=""/>
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
					    <td class="col-md-6"><span id="typeName" class="fred">流转标</span></td>
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
							    <option value="其他借款">其他借款</option>
							    <option value="普通借款">普通借款</option>
							    <option value="随便玩玩">随便玩玩</option>
							</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>借款期限：</td>
					    <td class="col-md-6">
						    <select name="loanDeadlinesId" id="loanDeadlinesId" class="sel_140">
							    <option value="">--请选择--</option>
							    <option value="1">1个月</option>
							    <option value="2">2个月</option>
							    <option value="3">3个月</option>
							    <option value="4">4个月</option>
							    <option value="5">5个月</option>
							    <option value="6">6个月</option>
							    <option value="7">7个月</option>
							    <option value="8">8个月</option>
							    <option value="9">9个月</option>
							    <option value="10">10个月</option>
							    <option value="11">11个月</option>
							    <option value="12">12个月</option>
							</select>
					    </td>
					  </tr>
					  <tr>
					     <td class="col-md-6"></td>
					     <td class="col-md-6">
					    	<input type="checkbox" name="isDayMarked" value="yes" id="isDayMarked"/>&nbsp;置为天标
					     </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>还款方式：</td>
					    <td class="col-md-6">
					    <select name="repaymentTypeId" id=""repaymentTypeId"" class="sel_140">
						    <option value="">--请选择--</option>
						    <option value="1">等额本息</option>
						    <option value="2">按月付息，到期还本</option>
						    <option value="4">一次性还款</option>
						</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>借款总额：</td>
					    <td class="col-md-6"><input type="text" id="loanTotal" name="loanTotal" class="inp280" value=""/></td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>年利率：</td>
					    <td class="col-md-6"><input type="text" name="loanApr" maxlength="5" value="" class="inp280" />%</td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>最低投标金额：</td>
					    <td class="col-md-6">
					    <select name="lowestBidMoney" id="lowestBidMoney" class="sel_140">
						    <option value="100">100</option>
						    <option value="200">200</option>
						    <option value="500">500</option>
						    <option value="1000">1000</option>
						</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right">最多投标金额：</td>
					    <td class="col-md-6">
					    <select name="largestBidMoney" id="largestBidMoney" class="sel_140">
						    <option value="">没有限制</option>
						    <option value="100">100</option>
						    <option value="200">200</option>
						    <option value="300">300</option>
						    <option value="500">500</option>
						    <option value="1000">1000</option>
						    <option value="5000">5000</option>
						    <option value="100000000000">100000000000</option>
						</select>
						</td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"><span style="color:#F00">*</span>筹标期限：</td>
					    <td class="col-md-6">
					    <select name="waitBidDeadlines" id="waitBidDeadlines" class="sel_140">
						    <option value="">--请选择--</option>
						    <option value="0">0天</option>
						    <option value="1">1天</option>
						    <option value="5">5天</option>
						    <option value="6">6天</option>
						</select>
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right">借款详情：</td>
					    <td class="col-md-6"><textarea name="loanDetail" class="txt420"></textarea></td>
					  </tr>
					  <!-- <tr>
					  	<td class="col-md-6" align="right">投标奖励</td>
					    <td class="col-md-6">
					    	<input type="radio" name="isBidReward" checked="checked" id="isBidReward" value="no" />
					      	不设置奖励
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right"></td>
					    <td class="col-md-6">
					      	<input type="radio" name="excitationType" id="radio_2" value="2" />
					     	 固定总额按投标比例分配奖励
					     	<input type="text" id="sum" name="paramMap.sum" value="" class="inp100x gray" disabled="disabled"/>
					      元
					    </td>
					  </tr>
					  <tr>
					  	<td class="col-md-6" align="right"></td>
					    <td class="col-md-6">
					     	<input type="radio" name="excitationType" id="radio_3" value="3" />
					      	借款总额百分比分配奖励
					      	<input type="text" id="sumRate" name="paramMap.sumRate" maxlength="20" value="" class="inp100x gray" disabled="disabled"/>
					      	%
					    </td>
					  </tr>
					  <tr>
					    <td class="col-md-6" align="right"> 验证码：</td>
					    <td class="col-md-6"><input type="text" class="inp100x" name="paramMap.code" id="code"/>
							 <img src="" title="点击更换验证码" style="cursor: pointer;"
							 	  id="codeNum" width="46" height="18" onclick="javascript:switchCode()" />
					    </td>
					  </tr> -->
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
    			loanCode:"required"
    		},
    		messages:{
    			loanCode:"XX不能为空"
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
		}
    </script>
  </body>
</html>