<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="member_mgr_memberAuth_form" method="post" style="padding:15px">
	<table id="memberAuthDetailDataGrid" class="detailtable" data-options="fit:true" >
		<thead>   
	        <tr>   
	            <th style="width: 190px;">认证名称：</th>   
	            <th style="width: 190px;">状态：</th>   
	            <th style="width: 190px;">操作：</th>   
	        </tr>   
	    </thead> 
	    <tbody>
			<tr>
				<td><input id="member_mgr_memberAuth_form_infoName" name="infoName" class="spinner" style="width:168px" value="${memberAuthData.infoName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_infoAuth" name="infoAuth" class="spinner" style="width:168px" value="${memberAuthData.infoAuth}" readonly="readonly"/></td>
				<td><a id="infoAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_vipName" name="vipName" class="spinner" style="width:168px" value="${memberAuthData.vipName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_vipAuth" name="vipAuth" class="spinner" style="width:168px" value="${memberAuthData.vipAuth}" readonly="readonly"/></td>
				<td><a id="vipAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_emailName" name="emailName" class="spinner" style="width:168px" value="${memberAuthData.emailName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_emailAuth" name="emailAuth" class="spinner" style="width:168px" value="${memberAuthData.emailAuth}" readonly="readonly"/></td>
				<td><a id="emailAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_mobileName" name="mobileName" class="spinner" style="width:168px" value="${memberAuthData.mobileName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_mobileAuth" name="mobileAuth" class="spinner" style="width:168px" value="${memberAuthData.mobileAuth}" readonly="readonly"/></td>
				<td><a id="mobileAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_creditName" name="creditName" class="spinner" style="width:168px" value="${memberAuthData.creditName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_creditAuth" name="creditAuth" class="spinner" style="width:168px" value="${memberAuthData.creditAuth}" readonly="readonly"/></td>
				<td><a id="creditAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_companyName" name="companyName" class="spinner" style="width:168px" value="${memberAuthData.companyName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_companyAuth" name="companyAuth" class="spinner" style="width:168px" value="${memberAuthData.companyAuth}" readonly="readonly"/></td>
				<td><a id="companyAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_realName" name="realName" class="spinner" style="width:168px" value="${memberAuthData.realName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_realNameAuth" name="realNameAuth" class="spinner" style="width:168px" value="${memberAuthData.realNameAuth}" readonly="readonly"/></td>
				<td><a id="realNameAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_idCardName" name="idCardName" class="spinner" style="width:168px" value="${memberAuthData.idCardName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_idCardAuth" name="idCardAuth" class="spinner" style="width:168px" value="${memberAuthData.idCardAuth}" readonly="readonly"/></td>
				<td><a id="idCardAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
			<tr>
				<td><input id="member_mgr_memberAuth_form_workName" name="workName" class="spinner" style="width:168px" value="${memberAuthData.workName}" readonly="readonly"/></td>
				<td><input id="member_mgr_memberAuth_form_workAuth" name="workAuth" class="spinner" style="width:168px" value="${memberAuthData.workAuth}" readonly="readonly"/></td>
				<td><a id="workAuthbtn" href="#" class="easyui-linkbutton" data-options="">审核</a></td>
			</tr>
		</tbody>
	</table>
</form>

<script type="text/javascript">
	//下拉项emun的值
	$('#member_mgr_memberAuth_form_infoAuth').val(renderGridValue('${memberAuthData.infoAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_vipAuth').val(renderGridValue('${memberAuthData.vipAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_emailAuth').val(renderGridValue('${memberAuthData.emailAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_mobileAuth').val(renderGridValue('${memberAuthData.mobileAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_creditAuth').val(renderGridValue('${memberAuthData.creditAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_companyAuth').val(renderGridValue('${memberAuthData.companyAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_realNameAuth').val(renderGridValue('${memberAuthData.realNameAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_idCardAuth').val(renderGridValue('${memberAuthData.idCardAuth}',fields.auths));
	$('#member_mgr_memberAuth_form_workAuth').val(renderGridValue('${memberAuthData.workAuth}',fields.auths));  
	
	
    $('#infoAuthbtn').bind('click', function(){    
    /* 	if('${memberAuthData.memberName}' != 'authstr'){
    		
    	} */
    	 glacier.basicAddOrEditDialog({
 			title : '${memberAuthData.memberName}'+"基本信息认证",
 			width : 600,
			height : 300,
 			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.infoName}',
 			submitUrl : ctx + '/do/memberAuth/edit.json',
 			successFun : function (){
 				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
 				$('#memberAuthShow').dialog('destroy');//关闭窗体
 			}
 		});
    }); 
    $('#vipAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"会员vip认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.vipName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
    $('#emailAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"邮箱认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.emailName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
    $('#mobileAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"手机认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.mobileName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
    $('#creditAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"信用认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.creditName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
    $('#companyAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"企业认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.companyName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
    $('#realNameAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"实名认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.realName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
    $('#idCardAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"身份证认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.idCardName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
    $('#workAuthbtn').bind('click', function(){    
   	 glacier.basicAddOrEditDialog({
			title : '${memberAuthData.memberName}'+"工作认证",
			width : 730,
			height : 510,
			queryUrl : ctx + '/do/memberAuth/intoAuthDetail.htm?memberId='+'${memberAuthData.memberId}'+'&auth='+'${memberAuthData.workName}',
			submitUrl : ctx + '/do/memberAuth/edit.json',
			successFun : function (){
				glacier.member_mgr.memberAuth_mgr.memberAuth.memberAuthDataGrid.datagrid('reload');
				$('#memberAuthShow').dialog('destroy');//关闭窗体
			}
		});
   }); 
</script>
