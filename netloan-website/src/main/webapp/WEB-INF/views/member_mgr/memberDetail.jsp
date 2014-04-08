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
					          <a href="${ctx}/member/memberAuth.htm?&p=0" class="btn btn-default" role="button">平台认证</a>
							  <a href="${ctx}/member/memberDetail.htm" class="btn btn-info" role="button">个人设置</a>
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
				    <h3 class="panel-title">个人设置</h3>
				  </div>
				  <div class="panel-body">
				   <div class="bs-example bs-example-tabs">
				     <ul id="myTab" class="nav nav-tabs">
				       <li class="active"><a href="${ctx}/member/memberDetail.htm" class="btn " role="button">个人详细信息</a></li>
				       <li><a href="#tabUpdatePassword" data-toggle="tab">修改密码</a></li>
				       <li><a href="#tabchangeMobile" data-toggle="tab">更换手机</a></li>
				       <li><a href="#tabnotification" data-toggle="tab">通知设置</a></li>
				       <li><a href="#tabbankCard" data-toggle="tab">银行卡设置</a></li>
				     </ul>
				      <br>
				     <div id="myTabContent" class="tab-content">
				     
				       <div class="tab-pane fade in active" id="tabPersonalDetails">
				       		<form id="personalMessageForm"  class=" form-horizontal" role="form"  method="post" >
				       		<div class="bs-example bs-example-tabs">
						     <ul id="myTab" class="nav nav-tabs">
						       <li class="active"><a href="#tabPersonalBase" data-toggle="tab">基本信息</a></li>
						       <li><a href="#tabPersonalContact" data-toggle="tab">联系信息</a></li>
						       <li><a href="#tabPersonalWork" data-toggle="tab">工作信息</a></li>
						     </ul>
						     <div id="myTabContent" class="tab-content">
						       <div class="tab-pane fade in active" id="tabPersonalBase">
						       		 <br>
						        <blockquote>
							  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为借款人必填项。</p>
								</blockquote>
								  
							  		  <div class="form-group">
							  		  	<input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
									    <!-- 判断是按保存按钮还是保存并提交审核按钮 -->
									    <input type="hidden" class="form-control" id="postAuth" name="postAuth" value="">
									    <label for="memberRealName" class="col-sm-2 control-label">*真实姓名:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" id="memberRealName" name="memberRealName" value="${currentMember.memberRealName}"  placeholder="真实姓名" >
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="cardId" class="col-sm-2 control-label">*身份证:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" id="cardId" name="cardId" value="${currentMember.cardId}"  placeholder="身份证"  >
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="mobileNumber" class="col-sm-2 control-label">*手机号码:</label>
									    <div class="col-sm-4">
									      <input type="tel"  class="form-control" name="mobileNumber" id="mobileNumber" value="${currentMember.mobileNumber}"  placeholder="手机号码" >
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="sex" class="col-sm-2 control-label">性别:</label>
									  	<div class="col-sm-4">
									       <select class="form-control col-sm-6" name="sex" id="sex" >
											  <option value="man">男</option>
											  <option value="woman">女</option>
											  <option value="secret">保密</option>
											</select>
									    </div>
									    <label for="maritalStatus" class="col-sm-2 control-label">婚姻状况:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="maritalStatus" id="maritalStatus" >
											  <option value="single">单身</option>
											   <option value="married">已婚</option>
											  <option value="secret">保密</option>
											</select>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="educational" class="col-sm-2 control-label">最高学历:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="educational" id="educational" >
											  <option value="高中或以下">高中或以下</option>
											  <option value="大专">大专</option>
											  <option value="本科">本科</option>
											  <option value="研究生或以上">研究生或以上</option>
											  <option value="其他">其他</option>
											</select>
									    </div>
									    <label for="memberAge" class="col-sm-2 control-label">会员年龄:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="memberAge" id="memberAge" value="${currentMember.memberAge}" placeholder="会员年龄">
									    </div>
									  </div>
									  <div class="form-group">
									     <label for="hometown" class="validate[required] col-sm-2 control-label">籍贯:</label>
									    <div class="col-sm-4">
									      <input type="text" class=" form-control" name="hometown" id="hometown" value="${currentMember.hometown}"  placeholder="籍贯">
									    </div>
									    <label for="homePhone" class="col-sm-2 control-label">住宅电话:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="homePhone" id="homePhone" value="${currentMember.homePhone}"  placeholder="住宅电话">
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="liveAddress" class="col-sm-2 control-label">现居住地址:</label>
									    <div class="col-sm-10">
									      <input type="text" class="form-control" name="liveAddress" id="liveAddress" value="${currentMember.liveAddress}"  placeholder="现居住地址">
									    </div>
									  </div>
			 						  <div class="form-group">
									    <label for="personalDes" class="col-sm-2 control-label">个人描述:</label>
									    <div class="col-sm-10">
									      <textarea class="form-control" rows="3" name="personalDes" id="personalDes" >${currentMember.personalDes}</textarea>
									    </div>
									  </div>
									  <%-- <div class="form-group">
									    <label for="personalDes" class="col-sm-2 control-label">个人头像:</label>
									     <div class="col-sm-10" style="float: left;">
									      	<textarea id="currentMember_memberPhoto" name="memberPhoto" style="width:100px;height:100px;">
												${currentMember.memberPhoto}
											</textarea>
											<div style="float: left;padding-right: 20px;">
											<input class="ke-input-text" type="text" name="memberPhoto" id="url" value="${currentMember.memberPhoto}" readonly="readonly" />
											<input type="button" id="uploadButton" value="Upload" />
											</div>
											<div id="memberPhotoDiv" style="width: 120px;height: 120px ;float: left;border: 1px solid;">
											
											</div>
											<div class="upload">
												<input class="ke-input-text" type="text" id="url" value="" readonly="readonly" />
											 	<input type="button" id="uploadButton" value="Upload" />
											</div>
									    </div> 
									    
									  </div> --%>
						       </div>
						       <div class="tab-pane fade" id="tabPersonalContact">
						          <br>
						        <blockquote>
							  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为借款人必填项。</p>
								</blockquote>
						  				<div class="form-group">
									    <label for="firstContact" class="col-sm-2 control-label">第一联系人:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="firstContact" id="firstContact" value="${currentMember.firstContact}"  placeholder="第一联系人">
									    </div>
									     <label for="firstContactRelation" class="col-sm-2 control-label">第一联系人关系:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="firstContactRelation" id="firstContactRelation" >
											  <option value="family">家人</option>
											  <option value="friend">朋友</option>
											  <option value="business">合作伙伴</option>
											</select>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="firstContactPhone" class="col-sm-2 control-label">第一联系人手机:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="firstContactPhone" id="firstContactPhone"  value="${currentMember.firstContactPhone}" placeholder="第一联系人手机">
									    </div>
									    <label for="firstContactAddress" class="col-sm-2 control-label">第一联系人地址:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="firstContactAddress" id="firstContactAddress" value="${currentMember.firstContactAddress}"  placeholder="第一联系人地址">
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="secondContact" class="col-sm-2 control-label">第二联系人:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="secondContact" id="secondContact" value="${currentMember.secondContact}"  placeholder="第二联系人">
									    </div>
									    <label for="secondContactRelation" class="col-sm-2 control-label">第二联系人关系:</label>
									    <div class="col-sm-4">
									       <select class="form-control col-sm-6" name="secondContactRelation" id="secondContactRelation" >
											  <option value="family">家人</option>
											  <option value="friend">朋友</option>
											  <option value="business">合作伙伴</option>
											</select>
									    </div>
									  </div>
									  <div class="form-group">
									    <label for="secondContactPhone" class="col-sm-2 control-label">第二联系人手机:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="secondContactPhone" id="secondContactPhone" value="${currentMember.secondContactPhone}"  placeholder="第二联系人手机">
									    </div>
									    <label for="secondContactAddress" class="col-sm-2 control-label">第二联系人地址:</label>
									    <div class="col-sm-4">
									      <input type="text" class="form-control" name="secondContactAddress" id="secondContactAddress" value="${currentMember.secondContactAddress}"  placeholder="第二联系人地址">
									    </div>
									  </div>
						       </div>
						       <div class="tab-pane fade" id="tabPersonalWork">
						         <br>
						        <blockquote>
							  		<p class="text-primary">* 为必填项，所有资料均会严格保密。*成为借款人必填项。</p>
								</blockquote>
						  		  <div class="form-group">
								    <label for="unitName" class="col-sm-2 control-label">单位名称:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="unitName" name="unitName" value="${currentMemberWork.unitName}"  placeholder="单位名称">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="unitAdress" class="col-sm-2 control-label">单位地址:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="unitAdress" name="unitAdress" value="${currentMemberWork.unitAdress}"  placeholder="单位地址">
								    </div>
								    <label for="unitPhone" class="col-sm-2 control-label">单位电话:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="unitPhone" name="unitPhone" value="${currentMemberWork.unitPhone}"  placeholder="单位电话">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="workAge" class="col-sm-2 control-label">工作年限:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="workAge" name="workAge" value="${currentMemberWork.workAge}"  placeholder="工作年限">
								    </div>
								    <label for="salary" class="col-sm-2 control-label">年薪:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="salary" name="salary" value="${currentMemberWork.salary}"  placeholder="年薪">
								    </div>
								  </div>
								  <div class="form-group">
								    <label for="proofPerson" class="col-sm-2 control-label">证明人:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="proofPerson" name="proofPerson" value="${currentMemberWork.proofPerson}"  placeholder="证明人">
								    </div>
								    <label for="proofPhone" class="col-sm-2 control-label">证明人手机:</label>
								    <div class="col-sm-4">
								      <input type="text" class="form-control" id="proofPhone" name="proofPhone" value="${currentMemberWork.proofPhone}"  placeholder="证明人手机">
								    </div>
								  </div>
						       </div>
						     </div>
						   </div><!-- /example -->
						   <div class="form-group">
						    <div class="col-sm-2"></div>
						    <div class="col-sm-10">
						      <p class="text-warning">温馨提示:按保存并提交审核按钮之后，将不能再修改用户信息。</p>
						    </div>
						  </div>
						    <div class="form-group">
						    <div class="col-sm-offset-2 col-sm-10">
						      <button id="onlyPost" type="submit" class="btn btn-primary btn-lg">保  存</button>
						      <button id="postAuthBut" type="submit" class="btn btn-primary btn-lg">保存并提交审核</button>
						    </div>
						  	</div>
						   </form>  
				       </div>
				    
				       <div class="tab-pane fade" id="tabUpdatePassword">
				         <form id="updatememberPasswordForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">会员登录密码修改</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label">原密码:</label>
						    <div class="col-sm-9">
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						      <input type="text" class="form-control" id="oldPassword_form-group" name="oldPassword" placeholder="输入您现在的帐号密码"  />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberPassword" class="col-sm-3 control-label">新密码:</label>
						    <div class="col-sm-9">
						      <input type="password" class="form-control" id="memberPassword_form-group" name="memberPassword" placeholder="输入您的新密码"  />
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="comfirPassword" class="col-sm-3 control-label">确认新密码:</label>
						    <div class="col-sm-9">
						      <input type="password" class="form-control" id="comfirPassword_form-group" name="comfirPassword" placeholder="请再次输入您的新密码" />
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="updatememberPasswordForm_form-group" type="submit" class="btn btn-primary">提    交</button>
						    </div>
						  </div>
						</form>
				       </div>
				       <div class="tab-pane fade" id="tabchangeMobile">
				          <form id="updatePhoneForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">手机绑定</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label"></label>
						    <%-- <label for="memberName" class="col-sm-2 ">手机号码：${currentMember.mobileNumber}</label> --%>
						    <div class="col-sm-9">
						  	  手机号码：${currentMember.mobileNumber}
						    </div> 
						  </div>
						  <div class="form-group">
						    <label for="memberName" class="col-sm-3 control-label" style="color:red;">手机变更</label>
						    <div class="col-sm-9">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="mobileNumber" class="col-sm-3 control-label">手机号码:</label>
						    <div class="col-sm-6">
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						      <input type="text" class="form-control" id="mobileNumber_form-group" name="mobileNumber" placeholder="输入您要更改的手机号码"  />
						    </div>
						    <div class="col-sm-3">
						       <button id="updatePhoneForm_form-group" type="submit" class="btn btn-primary">发送手机验证码</button>
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="memberPassword" class="col-sm-3 control-label">验证码:</label>
						    <div class="col-sm-6">
						      <input type="password" class="form-control" id="memberPassword_form-group" name="memberPassword" placeholder="输入手机验证码"  />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="comfirPassword" class="col-sm-3 control-label">变更原因:</label>
						    <div class="col-sm-9">
						      <textarea class="form-control" rows="3" name="changeReason" id="changeReason" ></textarea>
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="updatePhoneForm_form-group" type="submit" class="btn btn-primary">手机变更</button>
						    </div>
						  </div>
						</form>
				       </div>
				       <div class="tab-pane fade" id="tabnotification">
				         <p>通知设置</p>
				       </div>
				       <div class="tab-pane fade" id="tabbankCard">
				         <form id="bankCardForm" class="form-horizontal" role="form" method="post" >
						  <div class="form-group">
						    <label for="memberName" class="col-sm-2 control-label" style="color:red;">提现银行</label>
						    <div class="col-sm-10">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="mobileNumber" class="col-sm-3 control-label">真实姓名:</label>
						    <div class="col-sm-9">
						    ${currentMember.memberRealName}
						      <input type="hidden" class="form-control" id="memberId" name="memberId" value="${currentMember.memberId}" >
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="openingBank" class="col-sm-3 control-label">开户行:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="openingBank_form-group" name="openingBank" placeholder="输入您的开户银行名称"  />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="subbranch" class="col-sm-3 control-label">支行:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="subbranch_form-group" name="subbranch" placeholder="输入您的开户支行"  />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						   <div class="form-group">
						    <label for="cardNumber" class="col-sm-3 control-label">卡号:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="cardNumber_form-group" name="cardNumber" placeholder="输入您的卡号"  />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <label for="cardName" class="col-sm-3 control-label">银行卡名称:</label>
						    <div class="col-sm-6">
						      <input type="text" class="form-control" id="cardName_form-group" name="cardName" placeholder="输入您的银行卡名称"  />
						    </div>
						     <div class="col-sm-3">
						    </div>
						  </div>
						  <div class="form-group">
						    <div class="col-sm-offset-3 col-sm-9">
						      <button id="bankCardForm_form-group" type="submit" class="btn btn-primary">提  交</button>
						    </div>
						  </div>
						</form>
						<blockquote style="margin-top:50px;">
						       	<h5 class="text-danger"><strong>银行卡列表：</strong></h5>
						</blockquote>
				         <table id="bankCardTable" class="table table-bordered" style="text-align:center;vertical-align: middle;">
				         	<tbody>
				            <tr>
				              <td><strong>真实姓名</strong></td>
				              <td><strong>开户行</strong></td>
				              <td><strong>支行</strong></td>
				              <td><strong>卡号</strong></td>
				              <td><strong>状态</strong></td>
				              <td><strong>操作</strong></td>
				            </tr>
				            <c:forEach items="${memberBankCardDatas}" var="bankCard" varStatus="indexStatus">
						      	<tr>
						      	  <td>${currentMember.memberRealName}</td>
					              <td>${bankCard.openingBank}</td>
					              <td>${bankCard.subbranch}</td>
					              <td>${bankCard.cardNumber}</td>
					              <td id="auditState${indexStatus.index}" class="auditState">
					              ${bankCard.status}
					              <script type="text/javascript">
					             $('#auditState'+${indexStatus.index}).html(renderGridValue('${bankCard.status}',fields.auditState));
					              </script>
					              </td>
					              <td>
					              <c:choose>
									   <c:when test="${bankCard.status == 'pass'}">  
						         		 <a href="#"><strong>申请变更</strong></a>
									   </c:when>
									   <c:when test="${bankCard.status == 'authstr' || bankCard.status == 'failure'}"> 
							         	<a id="bandCardCancel${indexStatus.index}" class="${bankCard.bankCardId}" href="#"><strong>取消</strong></a>
							         	<script type="text/javascript">
										    $("#bandCardCancel"+${indexStatus.index}).bind('click', function(){   
										    	var valCalss=$("#bandCardCancel"+${indexStatus.index}).attr("class");//这里获取class值
										    	$.ajax({
													   type: "GET",
													   url: ctx+"/bankCard/del.htm?bankCardId="+valCalss,
													   dataType: "json",
									 			   	 success: function(r) {
									 			   		deletedialog(r);
									                 },
									                 error: function() {
									                     alert("提交出错！");
									                 }
													});
										    });
										</script>
							         	<%-- <a href="${ctx}/member/memberPhotoInto.htm" class="btn btn-default" role="button"><strong>取消</strong></a> --%>
									   </c:when>
									</c:choose>
					              </td>
					            </tr>
					      	</c:forEach> 
				            </tbody>
				            <tfoot>
					          <tr>
					            <th colspan="6">
					            	<div align="right">
									    <ul id='pageBankCard'></ul>
									</div>
								</th>
					          </tr>
					        </tfoot>
				        </table>
				       </div>
				     </div>
				   </div><!-- /example -->
				  </div>
				</div>
	    	</div>
	    </div>
	    <jsp:include page="../foot.jsp"/>
	    </div>
	    <!-- CONTAINER START======================== -->
	    <script type="text/javascript">
	    <!-- 分页显示表格数据 -->
		/* $(function(){
			//获得浏览器参数
			$.extend({
				getUrlVars: function(){
					var vars = [], hash;
					var hashes = window.location.href.slice(window.location.href.indexOf('?') + 1).split('&');
					//alert("  aa   "+hashes);
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
			//alert("aa  "+param);
			return param;
		}
		var pageBankCard = $('#pageBankCard');
		//积分的设置分页的总页数
		var totalmemberIntegral=${memberIntegralDatas.total}/5;
		if(parseInt(totalmemberIntegral)==totalmemberIntegral){
			var totalmemberIntegral = parseInt(totalmemberIntegral);
		}else {
			var totalmemberIntegral = parseInt(totalmemberIntegral)+1;
		}
		
		var memberIntegralOptions = {
		    bootstrapMajorVersion:3,
		    currentPage: ${memberIntegralDatas.p},
		    numberOfPages: 5,
		    totalPages:totalmemberIntegral,
		    pageUrl: function(type, page, current){
		    	return "${ctx}/member/memberAuth.htm?"+composeUrlParams()+"&p="+page;
		    	}
		}
		pageBankCard.bootstrapPaginator(memberIntegralOptions); */
		
	  	//通过设置这个隐藏文本的值来判断是保存按钮还是保存并提交审核按钮。进行相应的操作。
	    $('#postAuthBut').bind('click', function(){    
	    	$("#postAuth").val("postAuth");
	        }); 
	  	//通过判断是待审核或已审核，将表单改为只读状态。
		 if('${requestScope.infoAndWorAuthstr}' == 'infoAndWorRealOnly'){
			$("form[id='personalMessageForm'] input,textarea[id='personalDes']").prop("readonly", true);
			$("form[id='personalMessageForm'] select,button[id='onlyPost'],button[id='postAuthBut']").prop("disabled", true);
			//$("button[id='postAuthBut']").prop("disabled", true);
		} 
      	$(function() {
			$(".alert").alert();
			
			//用jq将下列框的值初始化。
	 		$('#sex').val('${currentMember.sex}');
		    $('#maritalStatus').val('${currentMember.maritalStatus}');
	      	$('#educational').val('${currentMember.educational}');
	      	$('#firstContactRelation').val('${currentMember.firstContactRelation}');
	      	$('#secondContactRelation').val('${currentMember.secondContactRelation}');
			
	      	var perfectRegisterSuccess = '${perfectRegister.success}';
	      	var perfectRegisterMessage = '${perfectRegister.msg}';
	      	if(perfectRegisterSuccess){
	      		$('#success_alert').fadeIn();
				$('#success_alert h4').html(perfectRegisterMessage);
				setTimeout(function(){//延迟3秒隐藏
					$('#success_alert').fadeOut();
				},3000)
			}		
	      	
	      	
	      	$("#personalMessageForm").validate({
	    		rules:{
	    			memberRealName:"required",
	    			cardId:{
	    				required:true,
	    				isIdCardNo:true
	    			},
	    			mobileNumber:{
	    				required:true,
	    				isMobile:true
	    			},
	    			homePhone:"isPhone",
	    			memberAge:"digits",
	    			firstContactPhone:"isMobile",
	    			secondContactPhone:"isMobile",
	    			workAge:"number",
	    			salary:"number",
	    			proofPhone:"isMobile",
	    			unitName:{
	    				required:true,
	    				rangelength:[1,10]
	    			},
	    			unitPhone:"isPhone"
	    		},
	    		messages:{
	    			memberRealName:"真实姓名不能为空",
	    			cardId:{
	    				required:"身份证不能为空",
	    				
	    			},
	    			mobileNumber:{
	    				required:"手机号码不能为空",	
	    			},
	    			memberAge:"年龄只能为数字",
	    			workAge:"只能为数字",
	    			salary:"只能为数字",
	    			unitName:{
	    				required:"单位名称不能为空",
	    				rangelength:"单位名称长度为1-10个字符"
	    			}
	    		},
	    		submitHandler:function(){
	    			$.ajax({
	    				   type: "POST",
	    				   url: ctx+"/perfectRegister.htm",
	    				   dataType: "json",
	    				   data: $("#personalMessageForm").serialize(),
		    			   success: function(r) {
		    				   
		    				    /* $('#success_alert').fadeIn();
	    						$('#success_alert h4').html(r.msg);
	    						setTimeout(function(){//延迟3秒隐藏
	    							$('#success_alert').fadeOut();
	    						},3000) */
	    						successdialog(r);
	    						 if(r.obj == 'infoAndWorRealOnly'){
	    								$("form[id='personalMessageForm'] input,textarea[id='personalDes']").prop("readonly", true);
	    								$("form[id='personalMessageForm'] select,button[id='onlyPost'],button[id='postAuthBut']").prop("disabled", true);
	    							}
	    						 
		                    },
		                    error: function() {
		                        alert("提交出错！");
		                    }
	    				});
	    		} 
	    	});
	      	$("#bankCardForm").validate({
	    		rules:{
	    			openingBank:"required",
	    			subbranch:"required",
	    			cardNumber:{
	    				required:true,
	    				digits:true,
	    				isBankCardNum:true
	    			},
	    			cardName:"required"
	    		},
	    		messages:{
	    			openingBank:"开户行不能为空",
	    			subbranch:"支行不能为空",
	    			cardNumber:{
	    				required:"卡号不能为空",
	    				digits:"卡号必须为数字",
	    			},
	    			cardName:"银行卡名称不能为空"
	    		},
	    		submitHandler:function(){
	    			$.ajax({
	    				   type: "POST",
	    				   url: ctx+"/bankCard/addBankCard.htm",
	    				   dataType: "json",
	    				   data: $("#bankCardForm").serialize(),
		    			   success: function(r) {
	    						successdialog(r);
	    						if(r.success){
	    							$("form[id='bankCardForm'] input").val("");	
	    						}
		                    },
		                    error: function() {
		                        alert("提交出错！");
		                    }
	    				});
	    		} 
	    	});
	      	$("#updatememberPasswordForm").validate({
	      		rules:{
	    			oldPassword:{
	    				required:true,
	    				rangelength:[6,12]
	    			},
	    			memberPassword:{
	    				required:true,
	    				rangelength:[6,12]
	    			},
	    			comfirPassword:{
	    				required:true,
	    				rangelength:[6,12],
	    				equalTo:"#memberPassword_form-group"
	    			}
	    		},
	    		messages:{
	    			oldPassword:{
	    				required:"原密码不能为空",
	    				rangelength:"密码长度必须为为6-12位"
	    			},
	    			memberPassword:{
	    				required:"新密码不能为空",	
	    				rangelength:"密码长度必须为为6-12位"
	    			},
	    			comfirPassword:{
	    				required:"确认密码不能为空",
	    				rangelength:"密码长度必须为为6-12位",
	    				equalTo:"确认密码必须和新密码一致"
	    			}
	    		},
	    		submitHandler:function(){
	    			 $.ajax({
	    				   type: "POST",
	    				   url: ctx+"/member/updatememberPassword.htm",
	    				   dataType: "json",
	    				   data: $("#updatememberPasswordForm").serialize(),
		    			   success: function(r) {
		    				    
	    						if(r.success){
	    							$('#success_alert').fadeIn();
		    						$('#success_alert h4').html(r.msg);
		    						setTimeout(function(){//延迟3秒隐藏
		    							$('#success_alert').fadeOut();
		    						},3000)
		    						
		    						$("#oldPassword_form-group").val("");
		    						$("#memberPassword_form-group").val("");
		    						$("#comfirPassword_form-group").val("");
	    						}else{
	    							$('#danger_alert').fadeIn();
		    						$('#danger_alert h4').html(r.msg);
		    						setTimeout(function(){//延迟3秒隐藏
		    							$('#danger_alert').fadeOut();
		    						},3000)
	    						}
	    						
		                    },
		                    error: function() {
		                        alert("提交出错！");
		                    }
	    				}); 
	    		} 
	      	});
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
					        }/* ,
					        noBtn : {
					                name : '取消',
					                click : function(e) {
					                        dialog.remove();
					                }
					        } */
					        
						});
			});
		}
      	function deletedialog(data){
			KindEditor.ready(function(K) {
			var dialog = K.dialog({
					        width : 300,
					        title : '删除成功',
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
					        }/* ,
					        noBtn : {
					                name : '取消',
					                click : function(e) {
					                        dialog.remove();
					                }
					        } */
					        
						});
			});
		}
		</script>
		
		 <div id="success_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;"> 
	      <div class="alert alert-success fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
	    <div id="danger_alert" style="width:100%;position: absolute;top:0px;z-index:5000;display: none;"> 
	      <div class="alert alert-danger fade in">
	        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
	        <h4 style="text-align:center;"></h4>
	      </div> 
	    </div>
  </body>
</html>