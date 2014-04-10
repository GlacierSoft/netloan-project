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
					    <div id="collapseOne" class="panel-collapse collapse in">
					      <div class="panel-body">
					        <div class="btn-group-vertical">
					          <a href="${ctx}/member/index.htm" class="btn btn-default" role="button">我的主页</a>
					          <a href="#" class="btn btn-default" role="button">充值提现</a>
					          <a href="${ctx}/member/memberAuth.htm?&p=0" class="btn btn-default" role="button">平台认证</a>
							  <a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" class="btn btn-info" role="button">站内信</a>
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
							  <a href="#" class="btn btn-default" role="button">借款列表</a>
							  <a href="#" class="btn btn-default" role="button">还款管理</a>
							  <a href="#" class="btn btn-default" role="button">贷款统计</a>
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
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="#" class="btn btn-default" role="button">我的投标</a>
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
				  <div id="messageNoticeList">
				  <div style="padding-top:10px;padding-bottom: 20px;">
				  	<a href="#" class="btn btn-default" role="button">删除</a>
					<a href="#" class="btn btn-default" role="button">标记为已读</a>
					<a href="#" class="btn btn-default" role="button">标记为未读</a>
					<a href="#" class="btn btn-default" role="button">未读信息</a>
				  </div>
				  	<table id="messageNoticeTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				         	<tbody>
				            <tr>
				              <td><input type="checkbox" value=""></td>
				              <td><strong>标记</strong></td>
				              <td><strong>发件人</strong></td>
				              <td><strong>标题</strong></td>
				              <td><strong>发送时间</strong></td>
				            </tr>
							<c:if test="${empty messageNoticeDatas.rows}">
							<tr>
					            <td colspan="5"><strong>暂无信息</strong></td>
					          </tr>
							</c:if>	  		
							<c:if test="${!empty messageNoticeDatas.rows}">  		
				            <c:forEach items="${messageNoticeDatas.rows}" var="messageNotice" varStatus="status">
						      	<tr>
						      	  	<td>
						      	  	<!-- <div class="checkbox">
									  <label>
									    <input type="checkbox" value="">
									  </label>
									</div> -->
									<input type="checkbox" value="">
									</td>	
					              <td id="messageNotice_letterstatus${status.index}">
					              <script type="text/javascript">
					             $('#messageNotice_letterstatus'+${status.index}).html(renderGridValue('${messageNotice.letterstatus}',fields.letterstatus));
					              </script>
					              </td>
					              <td>${messageNotice.senderDisplay}</td>
					              <td>
					              	<a id="messageNotice_tilte${status.index}" class="${messageNotice.messageNoticeId}" href="javascript:void(0);">${messageNotice.title}</a>
					              	<script type="text/javascript">
										    $("#messageNotice_tilte"+${status.index}).bind('click', function(){   
										    	var valCalss=$("#messageNotice_tilte"+${status.index}).attr("class");//这里获取class值，也就是获取messageNoticeId
										    	$.ajax({
													   type: "GET",
													   url: ctx+"/messageNotice/messageNoticeDetail.json?messageNoticeId="+valCalss,
													   dataType: "json",
									 			   	 success: function(r) {
									 			   		 $("#messageNoticeList").hide();
									 			   		 $("#sender").html(r.senderDisplay);
									 			   		 $("#addressee").html(r.addresseeDisplay);
									 			   		 $("#title").html(r.title);
									 			   		 $("#sendTime").html(r.sendtime);
									 			   		 $("#content").html(r.content);
									 			   		 $("#messageNoticeDetailTable").show();
									                 },
									                 error: function() {
									                     alert("查看详细出错！");
									                 }
													});
										    });
										</script>
					              </td>
					              <td><fmt:formatDate value="${messageNotice.sendtime}" type="both"/></td>
					            </tr>
					      	</c:forEach>
					      	</c:if>	
				            </tbody>
				            <tfoot>
					          <tr>
					            <th colspan="5">
					            	<div align="right">
									    <ul id='pagemessageNotice'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
				        </table><!-- display:block; -->
				       </div>
				        <table id="messageNoticeDetailTable" class="table table-condensed" style="display:block;margin-top:20px;text-align:center;vertical-align: middle;">
				        	<tr>
				              <td>发件人：</td>
				              <td><span id="sender"></span></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>收件人：</td>
				              <td id="addressee"></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>标题：</td>
				              <td id="title"></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>日期：</td>
				              <td id="sendTime"></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td>内容：</td>
				              <td id="content"></td>
				              <td></td>
				              <td></td>
				            </tr>
				            <tr>
				              <td> <a href="javascript:void(0);" class="btn btn-default" role="button" onclick="$('#messageNoticeList').show();$('#messageNoticeDetailTable').hide();">返回</a></td>
				              <td></td>
				              <td></td>
				              <td></td>
				            </tr>
				        </table>
				        
				  </div>
				</div>
	    	</div>
	    </div>
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->
	      
  </body>
  	<script type="text/javascript">
  <!-- 分页显示表格数据 -->
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
		
		var elementpagemessageNotice = $('#pagemessageNotice');
		
		//积分的设置分页的总页数
		var totalmessageNotice=${messageNoticeDatas.total}/10;
		if(parseInt(totalmessageNotice)==totalmessageNotice){
			var totalmessageNotice = parseInt(totalmessageNotice);
		}else {
			var totalmessageNotice = parseInt(totalmessageNotice)+1;
		}
		var messageNoticeOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${messageNoticeDatas.p},
		    numberOfPages: 10,
		    totalPages:totalmessageNotice,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/messageNotice/intoMessageNotice.htm?"+composeUrlParams()+"&p="+page;
		    	}
		}
		
		elementpagemessageNotice.bootstrapPaginator(messageNoticeOptions);
		})
	</script>
</html>