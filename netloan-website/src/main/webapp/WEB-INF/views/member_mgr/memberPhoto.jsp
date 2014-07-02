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
 <jsp:include page="../nav_mgr/navMember.jsp"/>
       
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
					          <a href="${ctx}/financeMember/rechargeWithdraw.htm?p=1" class="btn btn-default" role="button">充值提现</a>
					          <a href="${ctx}/member/memberAuth.htm?&p=0" class="btn btn-default" role="button">平台认证</a>
					          <a href="${ctx}/messageNotice/intoMessageNotice.htm?&p=1" class="btn btn-default" role="button">站内信</a>
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">个人设置</a>
							  <a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-info" role="button">头像上传</a>
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
							  <a href="${ctx}/borrowingLoan/memberBorrow.htm?&p=1&loanState=firstAudit" class="btn btn-default" role="button">已发布的借款</a>
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
					    <div id="collapseThree" class="panel-collapse collapse">
					      <div class="panel-body">
					      	<div class="btn-group-vertical">
					      	  <a href="${ctx}/investment/memberTenderNotes.htm?&p=1&loanStates=sucessBorrow&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我的投标</a>
					      	  <a href="${ctx}/attentionBorrowing/memberAttentionBorrowing.htm?&p=1&memberId=${currentMember.memberId}" class="btn btn-default" role="button">我关注的借款</a>
					      	  <a href="${ctx}/bankingStatistics/memberBankingStatistics.htm?&memberId=${currentMember.memberId}" class="btn btn-default" role="button">投资统计</a>
					      </div>
					    </div>
					  </div>
					</div>
				</div>
	    	</div>
	    	<div class="col-md-10">
	    		<div class="panel panel-default">
				  <div class="panel-heading">
				    <h3 class="panel-title">头像设置</h3>
				  </div>
				  <div class="panel-body">
				     <div id="tabchangePhoto">
				       <br>
				        <form id="memberPhotoUploadForm"  class=" form-horizontal" role="form"  method="post" >
      					<input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
      					<%-- <input type="hidden" class="form-control" id="memberPhoto" name="memberPhoto" value="${currentMember.memberPhoto}" > --%>
				         <div class="form-group">
						    <label for="personalDes" class="col-sm-2 control-label">个人头像:</label>
						    <div class="col-sm-4" style="float: left;">
								<input class="ke-input-text" type="text" name="memberPhoto" id="url" value="${currentMember.memberPhoto}" readonly="readonly" />
								<input type="button" id="uploadButton" value="Upload"/>
						    </div> 
						    <div class="col-sm-6" id="memberPhotoDiv" style="border: 1px #DDDDDD;">
								<img id="memberPhotoDivImg"  src="${currentMember.memberPhoto}" style="width: 120px;height: 120px ;" />
							</div>
						</div>
						<div class="form-group">
						    <div class="col-sm-2"></div> 
						    <div class="col-sm-10">
								<button id="login_submit" type="submit" class="btn btn-primary">保  存</button>
						    </div> 
						</div> 
	   					</form>
				       </div>
				  </div>
				</div>
	    	</div>
	    </div>
	    <hr class="featurette-divider2">
	    
	    </div>
	    <!-- CONTAINER START======================== -->
	    <jsp:include page="../foot.jsp"/> 
  </body>
  	    <script type="text/javascript">
  //个人头像上传。
	    KindEditor.ready(function(K) {
				var uploadbutton = K.uploadbutton({
					button : K('#uploadButton')[0],
					fieldName : 'imgFile',
					//url : ctx+'/member/uploadFile.htm?dir=image',
					url : ctx+'/resources/js/kindeditor/jsp/upload_json.jsp?dir=image',
						//'../php/upload_json.php?dir=file'
					afterUpload : function(data) {
						if (data.error === 0) {
							var url = K.formatUrl(data.url, 'domain');
							K('#url').val(url);
							//K('#url').html(url);
							$("#memberPhotoDivImg").attr("src",url);
							//$("#memberPhotoDiv").html(url);
						} else {
							alert(data.message);
						}
					},
					afterError : function(str) {
						alert('自定义错误信息: ' + str);
					}
				});
				uploadbutton.fileBox.change(function(e) {
					uploadbutton.submit();
				});
			});
	    $('#memberPhotoUploadForm').submit(function() {
	    	$.ajax({
				   type: "POST",
				   url: ctx+"/perfectMemberPhoto.htm",
				   dataType: "json",
				   data: $('#memberPhotoUploadForm').serialize(),
				   success: function(data) {
		 			   if(data.success){
							successdialog(data);
						} 
					   
                 	},
                 	error: function() {
                     	alert("提交出错！");
                 	}
				});
	    	return false;
	    	});
			
	    function successdialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
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