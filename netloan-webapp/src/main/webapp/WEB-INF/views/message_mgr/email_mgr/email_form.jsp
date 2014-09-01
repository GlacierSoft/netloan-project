<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style type="text/css">
	#tabs td{
		padding: 10px;
	}
</style>
<form id="email_mgr_email_form" method="post">
	<div id="cc" class="easyui-layout" style="height:400px;">   
	   <!-- 显示选择联系人会员 -->
	   <div data-options="region:'east',iconCls:'icon-reload',title:'',split:true" style="width:170px;">
	   	 <a href="javascript:cancelTree();" style="float: left;" class="easyui-linkbutton" plain="true" icon="icon-cancel">取消</a>&nbsp;
    	 <a href="javascript:cancelTrees();" id="cancels" style="float: left;display:block;" class="easyui-linkbutton" plain="true" icon="icon-cancel">取消全部</a>  
	   	<ul id="candidateTree" style="float: left;" class="easyui-tree"></ul>
	   </div>   
	   <!-- 结束 显示选择联系人会员-->
	   <!-- 显示活跃会员 -->
	   <div data-options="region:'west',title:'活跃会员显示',split:true" style="width:150px;">
	   	<ul id="memberTreeGrid"></ul>  
	   </div>   
	   <!-- 结束活跃会员 -->
	   <!-- 邮件操作部分 -->
	   <div data-options="region:'center',title:'邮件操作'" style="padding:5px;background:#eee;padding: 20px;">
	   		<table id="tabs">
	   			<tr>
	   				<td><label>邮件标题：</label><input name="emailTitle" size="40"></td>
	   			</tr>
	   			<tr>
	   				<td><label>邮件类型：</label><input class="easyui-combobox" name="emailType" data-options="textField : 'label',panelHeight : 'auto',editable : false,data : fields.email"></td>
	   			</tr>
	   			<tr>
	   				<td>
	   					<textarea name="emailText" id="editor_id" name="content" style="width:400px;height:240px;">
	   						&lt;strong&gt;HTML内容&lt;/strong&gt;
	   					</textarea>
	   				</td>
	   			</tr>
	   		</table>
	   		<input type="hidden" id="arrys">
	   </div>  
	   <!-- 结束邮件部分 --> 
	</div>  
</form>
<script type="text/javascript">

	var arr = new Array();//构建一个存储ID的数组

	//删除选中的节点
	function cancelTree(){
		var children = $("#candidateTree").tree("getChildren");
		if(children!=""){
			var c = $("#candidateTree").tree("getSelected");
			$("#candidateTree").tree("remove",c.target);
			$(".tree-indent").remove();//删除class为indent的节点预防删除完后样式突出
			var nodeApped = $('#candidateTree').tree('getChildren');//获取删除过后所剩子节点
			var index = 0;
			arr = new Array();//初始化
			$.each(nodeApped,function(i,v){
				arr[index]=v.id; 
	        	index++;
			});
		}else{
			alert("请选择一个");
		}
	}
	
	//删除全部节点
	function cancelTrees(){
		var children = $("#candidateTree").tree("getChildren");
		if(children!=""){
			$.each(children,function(index,value){
				$("#candidateTree").tree("remove",value.target);
				arr = new Array();//初始化
			});
			$(".tree-indent").remove();//删除class为indent的节点预防删除完后样式突出
		}
	}
	
	$(function(){
		$('#memberTreeGrid').tree({    
		    url: ctx + '/do/email/list2.json' ,
		    onClick: function(node){
				var selected = $('#memberTreeGrid').tree('getSelected');//选中的节点
				var nodes=$('#candidateTree').tree('getChildren');//获取所有的子节点
				var isflash=true;
				//判断是否有重复的
				$.each(nodes,function(i,v){
					if(v.text==selected.text){
						isflash=false;
						return false;//停止循环
					}
				});
				//为true时进行追加
				if(isflash){
					$('#candidateTree').tree('append', {
						data: selected
					});
					var nodeApped = $('#candidateTree').tree('getChildren');//获取已追加的所有子节点
					var index = 0;
					$.each(nodeApped,function(i,v){
						arr[index]=v.id; 
			        	index++;
					});
				}
			}
		});
	});
	
	KindEditor.ready(function(K) {
		K.create('#editor_id', {
			themeType : 'qq',
			allowFileManager : true,
			uploadJson : '../resources/js/kindeditor/jsp/upload_json.jsp',
	        fileManagerJson : '../resources/js/kindeditor/jsp/file_manager_json.jsp',
			items : [
				'bold','italic','underline','fontname','fontsize','forecolor','hilitecolor','plug-align','plug-order','plug-indent','link','code','emoticons','flash','table','lineheight','fullscreen','image'
			]
		});
	});
</script>