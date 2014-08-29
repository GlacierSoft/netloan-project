<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style type="text/css">
	#tabs td{
		padding: 10px;
	}
</style>
<form  method="post">
	<div id="cc" class="easyui-layout" style="height:400px;">   
	   <div data-options="region:'east',iconCls:'icon-reload',title:'',split:true" style="width:150px;">
	   </div>   
	   <div data-options="region:'west',title:'活跃会员显示',split:true" style="width:150px;">
	   	<ul id="tt" class="easyui-tree">   
		    <li>   
		        <span>Folder</span>   
		        <ul>   
		            <li>   
		                <span>File 2</span>   
		            </li>  
		        </ul>   
		    </li>  
		    <li>   
		        <span>Folder</span>   
		        <ul>   
		            <li>   
		                <span>File 2</span>   
		            </li>  
		        </ul>   
		    </li> 
		</ul>  

	   	
	   </div>   
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
	   					<textarea id="editor_id" name="content" style="width:400px;height:240px;">
	   						&lt;strong&gt;HTML内容&lt;/strong&gt;
	   					</textarea>
	   				</td>
	   			</tr>
	   		</table>
	   </div>   
	</div>  
</form>
<script type="text/javascript">
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