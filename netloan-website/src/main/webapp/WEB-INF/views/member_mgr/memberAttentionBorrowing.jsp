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
					    <div id="collapseOne" class="panel-collapse collapse">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
					          <a href="#" class="btn btn-default" role="button">充值提现</a>
					          <a href="${ctx}/member/memberAuth.htm?&p=0" class="btn btn-default" role="button">平台认证</a>
							  <a href="${ctx}/attentionBorrowing/intoMessageNotice.htm?&p=1" class="btn btn-default" role="button">站内信</a>
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
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1" class="btn btn-default" role="button">借款列表</a>
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
					    <div id="collapseThree" class="panel-collapse collapse in">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我的投标</a>
					      	  <a href="${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?&p=1&memberId=${currentMember.memberId}" class="btn btn-info" role="button">我关注的借款</a>
					      	  <a href="#" class="btn btn-default" role="button">投资统计</a>
					      	  <a href="#" class="btn btn-default" role="button">自动投标</a> 
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">我关注的借款</h3>
				  </div>
				  <div class="panel-body">
				  <div id="attentionBorrowingList">
					   <div class="panel panel-default">
						  <div class="panel-heading">
						    <h4 class="panel-title"><strong>条件筛选</strong></h3>
						  </div>
						  <div class="panel-body"><!-- style="text-align:center;vertical-align: middle;" -->
						     <form id="attentionBorrowingForm"  class=" form-horizontal" role="form"  method="post" action="${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?&p=1" >
						      <div class="form-group">
						        <label for="cardId" class="col-sm-2 control-label" >发布时间</label>
							    <div class="col-sm-4">
								    <div class="input-group date form_datetime" data-link-field="dtp_input1">
					                    <input id="loanDateCreateStartTime" name="loanDateCreateStartTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${attentionBorrowingQueryDTO.loanDateCreateStartTime}" type="both"/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
						      		<input type="hidden" id="dtp_input3" name="memberId" value="${currentMember.memberId}" />
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" style="text-align:center;vertical-align: middle;">到</label>
							    <div class="col-sm-4">
							    	<div class="input-group date form_datetime" data-link-field="dtp_input1">
					                    <input id="loanDateCreateEndTime" name="loanDateCreateEndTime" class="form-control" size="16" type="text" value="<fmt:formatDate value="${attentionBorrowingQueryDTO.loanDateCreateEndTime}" type="both"/>" readonly>
					                    <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>
										<span class="input-group-addon"><span class="glyphicon glyphicon-th"></span></span>
					                </div>
							    </div>
							    <label for="cardId" class="col-sm-1 control-label" ></label>
							  </div>
							   <div class="form-group">
							    <label for="loanTitle" class="col-sm-1 control-label" >标题</label>
							    <div class="col-sm-3"><input type="text" class="form-control" id="loanTitle" name="loanTitle" value="${attentionBorrowingQueryDTO.loanTitle}"  placeholder="借款标题"  /></div>
							    <div class="col-sm-3 text-center"><button id="sucessBorrowFormButton" type="submit" class="btn btn-primary btn-lg btn-block">查&nbsp;&nbsp;询</button></div>
							    <div class="col-sm-3">
							    <a id="attentionBorrowingFormButtonReset" href="javascript:void(0);" class="btn btn-primary btn-lg btn-block" data-options="" onclick="">重置条件</a>
							    </div>
							  	<div class="col-sm-2"></div>
							  	</div>
						     </form>
						  </div>
						</div>
					   <table id="attentionBorrowingTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td>标题</td>
				              <td>类型</td>
				              <td>还款方式</td>
				              <td>金额（元）</td>
				              <td>年利率</td>
				              <td>期限</td>
				              <td>发布时间</td>
				        	  <td>进度/剩余时间</td>
				              <td>信用等级</td>
				              <td>操作</td>
				            </tr>
				  		</thead>
				         	<tbody>
							<c:if test="${empty returnResultAttentionBorrowing.rows}">
							<tr>
					            <td colspan="10"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty returnResultAttentionBorrowing.rows}">  		
				            <c:forEach items="${returnResultAttentionBorrowing.rows}" var="attentionBorrowing" varStatus="status">
						      	<tr>
					              <td>
					              <a href="${ctx}/investment/investmentdetail.htm?loanId=${attentionBorrowing.loanId }&memberId=${attentionBorrowing.loanMemberId }&p=1">
					              ${attentionBorrowing.loanTitle}
					              </a>
					              </td>
					              <td>${attentionBorrowing.loanTenderDisplay}</td>
					              <td>${attentionBorrowing.repaymentTypeDisplay}</td>
					              <td><fmt:formatNumber value="${attentionBorrowing.loanTotal}" pattern="#,#00.00"/></td>
					              <td><fmt:formatNumber value="${attentionBorrowing.loanApr}" pattern="#0.00%"/></td>
					              <td>${attentionBorrowing.loanDeadlinesId}个月</td>
					              <td><fmt:formatDate value="${attentionBorrowing.loanDate}" type="both"/></td>
					              <td><fmt:formatNumber value='${attentionBorrowing.alrTenderPro}' pattern='#0.00%'/>/剩余时间</td>
								  <td><img id="creditPhotoDivImg"  src="${attentionBorrowing.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
								  <td><a href="${ctx}/attentionBorrowing/delAttentionBorrowing.json?&memberId=${currentMember.memberId}&attentionBorrowingId=${attentionBorrowing.attentionBorrowingId}">删除</a></td>
					            </tr>
					      	</c:forEach>
					      	</c:if>	<!-- <span id="alrTenderPro${status.index}"><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/></span>% -->
				            </tbody>
				            <c:if test="${!empty returnResultAttentionBorrowing.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="10">
					            	<div align="right">
									    <ul id='pageattentionBorrowing'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					       </c:if>	
				        </table>
				       </div>
				        
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->
	      
  </body>
  	<script type="text/javascript">
  	
  	//点击重置按钮，清空表单
  	$("#attentionBorrowingFormButtonReset").click(function(){
  		$("#loanTitle").val('');
  		$("#loanDateCreateStartTime").val('');
  		$("#loanDateCreateEndTime").val('');
  	});
  	
  	//bootstrap日期控件
  	$(".form_datetime").datetimepicker({
  		language:  'zh-CN',
        format: "yyyy-mm-dd",
        autoclose: true,
        todayBtn: true,
        todayHighlight: true,
        minView: 2,
        pickerPosition: "bottom-left"
    });
  	
  	
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
		
		var elementpageattentionBorrowing = $('#pageattentionBorrowing');

		//投标的设置分页的总页数
			var totalattentionBorrowing=${returnResultAttentionBorrowing.total}/10;
			if(parseInt(totalattentionBorrowing)==totalattentionBorrowing){
				var totalattentionBorrowing = parseInt(totalattentionBorrowing);
			}else {
				var totalattentionBorrowing = parseInt(totalattentionBorrowing)+1;
			}
			//关注借款的
			var attentionBorrowingOptions = {
			    bootstrapMajorVersion:3,
			    currentPage: ${returnResultAttentionBorrowing.p},
			    numberOfPages: 10,
			    totalPages:totalattentionBorrowing,
			    pageUrl: function(type, page, current){
			    	return "${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?"+composeUrlParams()+"&p="+page;
			    	}
			}
			
			//关注借款的
			elementpageattentionBorrowing.bootstrapPaginator(attentionBorrowingOptions);
		})
	<!-- 分页显示表格数据 结束 -->
	
		//警告对话框
		function promptdialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '警告',
					        body : '<div style="margin:10px;color:red;"><strong>'+data+'</strong></div>',
					        css : {
				                border : '1px solid #A0A0A0',
				                background : 'red'
				       	 	},
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
					                }
					        }
						});
			});
		}
		//信息提示对话框
		function messagedialog(data,url){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '信息提示',
					        body : '<div style="margin:10px;"><strong>'+data+'</strong></div>',
					        css : {
				                border : '1px solid #A0A0A0',
				                background : 'red'
				       	 	},
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
					                		window.location.href=url;
					                }
					        },
					        noBtn : {
					                name : '取消',
					                click : function(e) {
					                        dialog.remove();
					                }
				        }
						});
			});
		}
	</script>
</html>