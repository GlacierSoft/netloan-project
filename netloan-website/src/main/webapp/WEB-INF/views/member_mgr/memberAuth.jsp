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
					          <a href="${ctx}/member/memberAuth.htm" class="btn btn-info" role="button">平台认证</a>
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-default" role="button">个人设置</a>
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
				    <h3 class="panel-title">冰川网贷认证</h3>
				  </div>
				  <div class="panel-body">
				   <div class="bs-example bs-example-tabs">
				     <ul id="myTab" class="nav nav-tabs">
				       <li class="active"><a href="#netLoanAuth" data-toggle="tab" class="btn " role="button">冰川网贷认证</a></li>
				       <li><a href="#uploasdData" data-toggle="tab">资料上传</a></li>
				       <li><a href="#memberIntegral" data-toggle="tab">会员积分记录</a></li>
				     </ul>
				      <br>
				     <div id="myTabContent" class="tab-content">
				       <div class="tab-pane fade in active" id="netLoanAuth">
				       		<table class="table table-bordered" style="text-align:center;margin:0 auto;">
				       			<tr>
					              <td colspan="8">信用等级及信用对应分数</td>
					            </tr> 
					            
					            <tr >
					              <td >等级</td>
					              <c:forEach var="parameterCredit" items="${requestScope.parameterCredits}" varStatus="status">
								  	<td> 
      								<c:out value="${parameterCredit.creditName}" escapeXml="false"/>
      								</td>
								  </c:forEach>
					              <!-- <td>AA</td>
					              <td>A</td>
					              <td>B</td>
					              <td>C</td>
					              <td>D</td>
					              <td>E</td>
					              <td>HR</td> -->
					            </tr>
					            <tr>
					              <td>分数</td>
					               <c:forEach var="parameterCredit" items="${requestScope.parameterCredits}" varStatus="status">
								  	<td> 
								  	<c:if test="${parameterCredit.creditBeginIntegral == 100}">
								  		100以上
								  	</c:if>
								  	<c:if test="${parameterCredit.creditBeginIntegral != 100 && parameterCredit.creditBeginIntegral != 0}">
								  		<c:out value="${parameterCredit.creditBeginIntegral}" escapeXml="false"/> -
      									<c:out value="${parameterCredit.creditEndIntegral}" escapeXml="false"/>
								  	</c:if>
      								<c:if test="${parameterCredit.creditBeginIntegral == 0}">
								  		30以下
								  	</c:if>
      								</td>
								  </c:forEach>
					            </tr>
					            <tr>
					              <td>标志</td>
					              <td>图标</td>
					              <td>图标</td>
					              <td>图标</td>
					              <td>图标</td>
					              <td>图标</td>
					              <td>图标</td>
					              <td>图标</td>
					            </tr>
					        </table>
					        <br>
					        <table class="table table-bordered" style="text-align:center;vertical-align: middle;">
				       			 <tr>
					              <td colspan="4">信用总分：50分（图标）</td>
					            </tr>
					            <tr>
					              <td>项目</td>
					              <td>项目</td>
					              <td>状态</td>
					              <td>信用分数</td>
					            </tr> 
					            <tr>
					              <td rowspan="2" style="text-align:center;vertical-align: middle;">基本信息</td>
					              <td>${requestScope.memberAuthWithBLOBs.infoName}</td>
					              <td id="memberAuth_infoAuth"></td>
					              <td>10</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.workName}</td>
					              <td id="memberAuth_form_workAuth"></td>
					              <td>10</td>
					            </tr>
					            <tr>
					              <td rowspan="7" style="vertical-align: middle;">必要信用认证</td>
					              <td>${requestScope.memberAuthWithBLOBs.idCardName}</td>
					              <td id="memberAuth_form_idCardAuth"></td>
					              <td>0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.emailName}</td>
					              <td id="memberAuth_form_emailAuth"></td>
					              <td>10</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.mobileName}</td>
					              <td id="memberAuth_form_mobileAuth"></td>
					              <td>0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.creditName}</td>
					              <td id="memberAuth_form_creditAuth"></td>
					              <td>0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.companyName}</td>
					              <td id="memberAuth_form_companyAuth"></td>
					              <td>0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.realName}</td>
					              <td id="memberAuth_form_realNameAuth"></td>
					              <td>0</td>
					            </tr>
					            <tr>
					              <td>${requestScope.memberAuthWithBLOBs.vipName}</td>
					              <td id="memberAuth_form_vipAuth"></td>
					              <td>0</td>
					            </tr>
					        </table>
				       </div>
				       <div class="tab-pane fade" id="uploasdData">
					        <p class="text-primary">温馨提示：晓风网贷对于用户上传的所有信息，都将进行加密处理。您可以在此放心上传个人材料，您的个人信用将不会被以任何形式外泄。</p>
					        <p class="text-danger">注：认证资料上传完毕后，等待后台进行审核。</p>
					       	<blockquote>
					       	<h4>必要信用认证</h4>
					       	</blockquote>
					       	<p class="text-primary">为了保证审核效率，确保贷款用户尽快通过审核，我们将优先为五项必要认证材料上传齐全的用户提供审核服务。五项必要认证 缺失的用户，无法得到贷款。</p>	
					  		<!-- Three columns of text below the carousel -->
					      <div class="row center-block">
					        <div class="col-lg-4 center-block">
					          <img src="${pageContext.request.contextPath}/resources/images/index/4.jpg" alt="Generic placeholder image">
					          <h2>身份认证</h2>
					          <div class="bs-example" style="padding-bottom:24px;">
							      <button class="btn btn-primary btn-lg"  data-backdrop="static" data-toggle="modal" data-target="#idCardAccessoryModal"  >
							        	点击上传
							      </button>
							    </div><!-- /example -->
					        </div><!-- /.col-lg-4 -->
					        <div class="col-lg-4 center-block">
					          <img src="${pageContext.request.contextPath}/resources/images/index/5.jpg"  alt="Generic placeholder image">
					          <h2>企业认证</h2>
					         <div class="bs-example" style="padding-bottom: 24px;">
							      <button class="btn btn-primary btn-lg" data-backdrop="static" data-toggle="modal" data-target="#myModal">
							        	点击上传
							      </button>
							    </div><!-- /example -->
					        </div><!-- /.col-lg-4 -->
					        <div class="col-lg-4 center-block">
					          <img src="${pageContext.request.contextPath}/resources/images/index/6.jpg"  alt="Generic placeholder image">
					          <h2>信用认证</h2>
					          <div class="bs-example" style="padding-bottom: 24px;">
							      <button class="btn btn-primary btn-lg" data-backdrop="static" data-toggle="modal" data-target="#creditAccessoryModal">
							        	点击上传
							      </button>
							    </div><!-- /example -->
					        </div><!-- /.col-lg-4 -->
					      </div><!-- /.row -->	 
				
					       <!-- sample modal content -->
						    <div id="idCardAccessoryModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="idCardAccessoryModalLabel" aria-hidden="true">
						      <div class="modal-dialog">
						        <div class="modal-content">
						           <form id="member_idCardAccessoryForm"  class=" form-horizontal" role="form"  method="post" >
							          <div class="modal-header">
							            <h4 class="modal-title" id="myModalLabel">会员认证</h4>
							          </div>
							          <div class="modal-body">
							            <h5>身份认证：</h5>
							            <p>您上传的身份证扫描件需和您绑定的身份证一致，否则将无法通过认证。</p>
							            <h5>认证说明：</h5>
							            <p>1、您上传的身份证扫描件需和您绑定的身份证一致，否则将无法通过认证。</p>
							            <p>2、本人近期生活照。</p>
							            <p>3、请确认您上传的资料是清晰的、未经修改的照片，每张照片最大限制为1M。</p>
							            <h4>文件上传</h4>
							            <textarea id="member_idCardAccessory" name="webHelpContent" style="width:500px;height:150px;">
											 ${memberAuthWithBLOBs.idCardAccessory}
										</textarea>
										<br>
							            <p class="text-danger"><strong>注意：</strong>冰川网贷是一个注重诚信的网络平台。如果我们发现您上传的资料系伪造或有人工修改痕迹，晓风网贷会将你加入系统黑名单，永久取消您在晓风网贷的借款资格。</p>
							          </div>
							          <div class="modal-footer">
							          	<button type="button" class="btn btn-primary" onclick="submitIdCardAccessoryForm();">保  存</button>
							            <button type="button" class="btn btn-default" data-dismiss="modal">关  闭</button>
							          </div>
									</form>
						        </div><!-- /.modal-content -->
						      </div><!-- /.modal-dialog -->
						    </div><!-- /.modal --> 		
						    <!-- sample modal content -->
						    <div id="#companyAccessoryModalModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="#companyAccessoryModalModalLabel" aria-hidden="true">
						      <div class="modal-dialog">
						        <div class="modal-content">
						          <div class="modal-header">
						            <h4 class="modal-title" id="myModalLabel">会员认证</h4>
						          </div>
						          <div class="modal-body">
						            <h4>企业认证：</h4>
						            <p>您的工作状况是冰川网贷评估您信用状况的主要依据。请您填写真实可靠的工作信息。</p>
									<hr>
						            <h5>认证说明：</h5>
						            <p>1、您上传的身份证扫描件需和您绑定的身份证一致，否则将无法通过认证。</p>
						            <p>2、本人近期生活照。</p>
						            <p>3、请确认您上传的资料是清晰的、未经修改的照片，每张照片最大限制为1M。</p>
						            <h4>文件上传</h4>
						            <textarea id="member_companyAccessory" name="webHelpContent" style="width:400px;height:200px;">
										 <img src="${memberAuthWithBLOBs.companyAccessory}"  alt="" /> 
									</textarea>
									<br>
						            <p class="text-danger"><strong>注意：</strong>冰川网贷是一个注重诚信的网络平台。如果我们发现您上传的资料系伪造或有人工修改痕迹，晓风网贷会将你加入系统黑名单，永久取消您在晓风网贷的借款资格。</p>
						          </div>
						          <div class="modal-footer">
						          	<button type="button" class="btn btn-primary" data-dismiss="modal">保  存</button>
						            <button type="button" class="btn btn-default" data-dismiss="modal">关  闭</button>
						          </div>
						
						        </div><!-- /.modal-content -->
						      </div><!-- /.modal-dialog -->
						    </div><!-- /.modal --> 		
						    <!-- sample modal content -->
						    <div id="creditAccessoryModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="creditAccessoryModalLabel" aria-hidden="true">
						      <div class="modal-dialog">
						        <div class="modal-content">
						          <div class="modal-header">
						            <h4 class="modal-title" id="myModalLabel">会员认证</h4>
						          </div>
						          <div class="modal-body">
						            <h4>身份认证：</h4>
						            <p>您上传的身份证扫描件需和您绑定的身份证一致，否则将无法通过认证。</p>
									<hr>
						            <h5>认证说明：</h5>
						            <p>1、您上传的身份证扫描件需和您绑定的身份证一致，否则将无法通过认证。</p>
						            <p>2、本人近期生活照。</p>
						            <p>3、请确认您上传的资料是清晰的、未经修改的照片，每张照片最大限制为1M。</p>
						            <h4>文件上传</h4>
						            <textarea id="member_creditAccessory" name="webHelpContent" style="width:500px;height:150px;">
										 <img src="${memberAuthWithBLOBs.creditAccessory}"  alt="" /> 
									</textarea>
									<br>
						            <p class="text-danger"><strong>注意：</strong>冰川网贷是一个注重诚信的网络平台。如果我们发现您上传的资料系伪造或有人工修改痕迹，晓风网贷会将你加入系统黑名单，永久取消您在晓风网贷的借款资格。</p>
						          </div>
						          <div class="modal-footer">
						          	<button type="button" class="btn btn-primary" data-dismiss="modal">保  存</button>
						            <button type="button" class="btn btn-default" data-dismiss="modal">关  闭</button>
						          </div>
						
						        </div><!-- /.modal-content -->
						      </div><!-- /.modal-dialog -->
						    </div><!-- /.modal --> 		
				       </div>
				       <div class="tab-pane fade" id="memberIntegral">
				         <p>更换手机</p>
				       </div>
				     </div>
				     </div>
				   </div><!-- /example -->
				    
				  </div>
			</div>
	    </div>
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->
	      
  </body>
	<script type="text/javascript">
	
		//下拉项emun的值
		 $('#memberAuth_infoAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.infoAuth}',fields.auths));
	 	$('#memberAuth_form_vipAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.vipAuth}',fields.auths));
	 	$('#memberAuth_form_emailAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.emailAuth}',fields.auths));
	 	$('#memberAuth_form_mobileAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.mobileAuth}',fields.auths));
		$('#memberAuth_form_creditAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.creditAuth}',fields.auths));
	 	$('#memberAuth_form_companyAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.companyAuth}',fields.auths));
		$('#memberAuth_form_realNameAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.realNameAuth}',fields.auths));
		$('#memberAuth_form_idCardAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.idCardAuth}',fields.auths));
		$('#memberAuth_form_workAuth').html(renderGridValue('${requestScope.memberAuthWithBLOBs.workAuth}',fields.auths));   
		
		//编辑器
		var editor;
		KindEditor.options.filterMode = false;
		KindEditor.ready(function(K) {
			editor = K.create('#member_idCardAccessory', {
				//themeType : 'qq',
				width : "500px",
				minWidth : "500px",
				height : "200px",
				minHeight : "200px",
				resizeType : 0,
				uploadJson : ctx+'/member/uploadFile.htm?whichAuth=idCardAuth',
				allowFileManager : true,
				allowImageRemote : false,
				items : ['image']
			});
		});
		function submitIdCardAccessoryForm()
		{
			$.ajax({
				type: "POST",
				url: ctx+'/member/idCardAccessoryForm.htm?whichAuth=idCardAuth',
				data: {"member_idCardAccessory":editor.html()},
				success: function(data)
				{
					alert("操作成功"+data);
					alert("msg  "+data.msg);
					alert("success  "+data.success);
					$('#idCardAccessoryModal').modal('hide');
					if(data.success)
					{
						//$("#contentView").html(data);
						//$("textarea[name=member_idCardAccessory]").val("");
						//editor.html("");
						alert("操作成功"+data.msg);
						
						//successdialog(data);
						
					}
				},
				error: function()
				{
					alert("操作失败");
				}
			});
		}
		KindEditor.ready(function(K) {
			K.create('#member_creditAccessory', {
				themeType : 'qq',
				uploadJson : ctx+'/member/uploadFile.htm?whichAuth=creditAuth',
				allowFileManager : true,
				allowImageRemote : false,
				items : ['image']
			});
		});
		KindEditor.ready(function(K) {
			K.create('#member_companyAccessory', {
				themeType : 'qq',
				uploadJson : ctx+'/member/uploadFile.htm?whichAuth=companyAuth',
				allowFileManager : true,
				allowImageRemote : false,
				items : ['image']
			});
		});
		function successdialog(data){
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
					                        //alert(this.value);
					                        //$('#idCardAccessoryModal').modal('hide')
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
		}
  	</script>
</html>