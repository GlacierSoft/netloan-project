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
							  <a href="${ctx}/tenderNotes/intoMessageNotice.htm?&p=1" class="btn btn-default" role="button">站内信</a>
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
					      	  <a href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-info" role="button">我的投标</a>
					      	  <a href="#" class="btn btn-default" role="button">我关注的借款</a>
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
				    <h3 class="panel-title">系统消息</h3>
				  </div>
				  <div class="panel-body">
				  <div id="tenderNotesList">
				  <div style="padding-top:10px;padding-bottom: 20px;">
				  		<c:choose>
						   <c:when test="${buttonState == 'sucessBorrow'}">  
						   	<a id="sucessBorrow" href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-success" role="button">成功借出</a>
							<a id="tenderingBorrow" href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow&memberId=${currentMember.memberId}" class="btn btn-primary" role="button">招标中借款</a>
							<a id="receingBorrow" href="javascript:void(0);" class="btn btn-primary" role="button">回收中借款</a>
							<a href="${ctx}/tenderNotes/intoMessageNotice.htm?&p=1&letterstatus=unread" class="btn btn-primary" role="button">已回收借款</a>
							<a href="${ctx}/tenderNotes/intoMessageNotice.htm?&p=1&letterstatus=read" class="btn btn-primary" role="button">回账查询</a> 
						   </c:when>
						   <c:when test="${buttonState == 'tenderingBorrow'}">  
						   	<a id="sucessBorrow" href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-primary" role="button">成功借出</a>
							<a id="tenderingBorrow" href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=tenderingBorrow&memberId=${currentMember.memberId}" class="btn btn-success" role="button">招标中借款</a>
							<a id="receingBorrow" href="javascript:void(0);" class="btn btn-primary" role="button">回收中借款</a>
							<a href="${ctx}/tenderNotes/intoMessageNotice.htm?&p=1&letterstatus=unread" class="btn btn-primary" role="button">已回收借款</a>
							<a href="${ctx}/tenderNotes/intoMessageNotice.htm?&p=1&letterstatus=read" class="btn btn-primary" role="button">回账查询</a> 
						   </c:when>
						   <c:when test="${borrowingLoan.loanTenderDisplay == '净值标'}">  
						   	<img src="${ctx}/resources/images/borrow/jingzhi.jpg" alt="jingzhi">
						   </c:when>
						</c:choose>
				  </div>
				  	<table id="tenderNotesTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				  		<thead>
				  			<tr>
				              <td>借款人</td>
				              <td>标题</td>
				              <td>类型</td>
				              <td>还款方式</td>
				              <td>我的投标金额（元）</td>
				              <td>年利率</td>
				              <td>期限</td>
				              <td>发布时间</td>
				        <c:choose>
						   <c:when test="${buttonState == 'sucessBorrow'}">  
						   	  <td>信用等级</td>
				              <td>协议书</td>
						   </c:when>
						   <c:when test="${buttonState == 'tenderingBorrow'}">  
						   	  <td>进度/剩余时间</td>
				              <td>信用等级</td>
						   </c:when>
						</c:choose>
				            </tr>
				  		</thead>
				         	<tbody>
							<c:if test="${empty tenderNotesDatas.rows}">
							<tr>
					            <td colspan="10"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty tenderNotesDatas.rows}">  		
				            <c:forEach items="${tenderNotesDatas.rows}" var="tenderNotes" varStatus="status">
						      	<tr>
						      	  <td>${tenderNotes.loanMemberDisplay}</td>
					              <td>
					              <a href="${ctx}/investment/investmentdetail.htm?loanId=${tenderNotes.loanId }&memberId=${tenderNotes.loanMemberId }&p=1">
					              ${tenderNotes.loanTitle}
					              </a>
					              </td>
					              <td>${tenderNotes.loanTenderDisplay}</td>
					              <td>${tenderNotes.repaymentTypeDisplay}</td>
					              <c:choose>
									   <c:when test="${tenderNotes.subTotal == '0.0'}">  
									   	 	<td><fmt:formatNumber value="${tenderNotes.tenderMoney }" pattern="#,#00.00"/></td>
									   </c:when>
									   <c:when test="${tenderNotes.subTotal != '0.0'}">  
									   		<td><fmt:formatNumber value="${tenderNotes.lowestSub * tenderNotes.subSum }" pattern="#,#00.00"/></td>
									   </c:when>
								  </c:choose>
					              <td><fmt:formatNumber value="${tenderNotes.loanApr * 100}" pattern="#,#00.00"/>%</td>
					              <td>${tenderNotes.loanDeadlinesId}个月</td>
					              <td><fmt:formatDate value="${tenderNotes.loanDate}" type="both"/></td>
					              <c:choose>
									   <c:when test="${buttonState == 'sucessBorrow'}">  
									   	 <td><img id="creditPhotoDivImg"  src="${tenderNotes.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
					              		 <td></td>
									   </c:when>
									   <c:when test="${buttonState == 'tenderingBorrow'}">  
									      <td><fmt:formatNumber value='${tenderNotes.alrTenderPro*100}' pattern='#0.00'/>%</td>
									   	  <td><img id="creditPhotoDivImg"  src="${tenderNotes.creditPhoto}" style="width: 34px;height: 24px ;" /></td>
									   </c:when>
									</c:choose>
					            </tr>
					      	</c:forEach>
					      	</c:if>	<!-- <span id="alrTenderPro${status.index}"><fmt:formatNumber value='${borrowingLoan.alrTenderPro*100}' pattern='#0.00'/></span>% -->
				            </tbody>
				            <c:if test="${!empty tenderNotesDatas.rows}">  
				            <tfoot>
					          <tr>
					            <th colspan="10">
					            	<div align="right">
									    <ul id='pagetenderNotes'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
					       </c:if>	
				        </table><!-- display:block; -->
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
		
		var elementpagetenderNotes = $('#pagetenderNotes');
		
		//积分的设置分页的总页数
		var totaltenderNotes=${tenderNotesDatas.total}/10;
		if(parseInt(totaltenderNotes)==totaltenderNotes){
			var totaltenderNotes = parseInt(totaltenderNotes);
		}else {
			var totaltenderNotes = parseInt(totaltenderNotes)+1;
		}
		var tenderNotesOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${tenderNotesDatas.p},
		    numberOfPages: 10,
		    totalPages:totaltenderNotes,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/investment/memberTenderNotes.htm?"+composeUrlParams()+"&p="+page;
		    	}
		}
		elementpagetenderNotes.bootstrapPaginator(tenderNotesOptions);
		
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