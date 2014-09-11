<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<style type="text/css">
	#tabs td{
		padding: 10px;
	}
</style>
<form id="note_mgr_note_form" method="post">
	<div id="cc" class="easyui-layout" style="height:420px;">   
	
	   <!-- 显示选择联系人会员 -->
	   <div id="east" data-options="region:'east',iconCls:'',title:'联系会员',split:true" style="width:160px;">
	   	 <div id="opacityTwo" style="position: absolute;width: 100%;height: 100%;background-color: gray;filter:alpha(Opacity=20); opacity: 0.2;z-index: 999;"></div>
	   	 
	   	<a href="javascript:cancelTree();" style="position: absolute;" class="easyui-linkbutton" plain="true" icon="icon-cancel">取消</a>&nbsp;
    	<a href="javascript:cancelTrees();" id="cancels" style="position: absolute;margin-left: 50px;" class="easyui-linkbutton" plain="true" icon="icon-cancel">取消全部</a>
	   	 
	   	 <ul id="candidateTree" style="position: absolute;margin-top: 10px;" class="easyui-tree"></ul>
	   </div>   
	   <!-- 结束 显示选择联系人会员-->
	   
	   <!-- 显示活跃会员 -->
	   <div id="west" data-options="region:'west',title:'活跃会员显示',split:true" style="width:180px;">
	   	 <!-- 进来就封屏 -->
		 <div id="opacityOne" style="position: absolute;width: 100%;height: 100%;background-color: gray;filter:alpha(Opacity=20); opacity: 0.2;z-index: 999;"></div>
		 <div data-options="region:'north',split:true" style="height:30px;padding-left:10px;position: absolute;border-bottom: 1px solid gray;">
			<form id="messageEmailSearchForm">
				<table>
					<tr>
						<td>用户名：</td>
						<td><input id="memberName" name="memberName" style="width: 40px;" class="spinner"/></td>
						<td>
							<a href="javascript:noteFind();" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true">查询</a>
						</td>
					</tr>
				</table>
			</form>
		 </div>
		 <ul id="memberTreeGrid" style="position: absolute;margin-top: 35px;"></ul>
		 <!-- 全部按钮 -->
		 <a href="javascript:allTree();" class="l-btn" style="width: 100%;height: 25px;bottom: 0px;position: absolute; right:0;text-align: center;line-height: 25px;color: white;"><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;全部选择</b></a>
	   </div>   
	   <!-- 结束活跃会员 -->
	   
	   <!-- 短信操作部分 -->
	   <div data-options="region:'center',title:'短信操作'" style="padding:5px;background:#eee;padding: 20px;">
	   	  
	   </div>  
	   
	   <div style="position:absolute;margin-left: 200px;margin-top: 40px;">
	    <table id="tabs" >
	   		 <tr>
	   			<td><label>短信标题：</label></td>
	   			<td><input class="easyui-validatebox spinner" name="noteTitle" id="noteTitle" size="53" required="true" style="height: 20px;width: 160px;"></td>
	   		 </tr>
	   		 <tr>
	   			<td><label>短信类型：</label></td>
	   			<td><input id="noteType" name="noteType"  class="easyui-combobox" style="width: 240px;" data-options="textField : 'label',panelHeight : 'auto',editable : false,data : fields.email,required:true"></td>
	   		 </tr>
	   		 <tr>
	   			<td><label>短信内容：</label></td>
	   			<td><textarea style="overflow:auto;border:1px;width:340px;height:80px;" id="editor_id" name="noteText"  required="true" class="easyui-validatebox spinner"></textarea></td>
	   		</tr>
	   		</table>
	   	</div>
	   <!-- 结束邮件部分 --> 
	   
	</div>  
</form>
<script type="text/javascript">

    var arr = new Array();//构建一个存储ID的数组
	var option = "";
	//全部选择按钮功能
	function allTree(){
		var memberChildren = $("#memberTreeGrid").tree("getChildren");//获取活跃会员所有节点
		var contactChildren = $("#candidateTree").tree("getChildren");//获取联系会员所有节点
		if(contactChildren == ""){//判断联系会员的树节点是否为空,为空就全部加上
			console.info(contactChildren);
			$('#candidateTree').tree('append', {
				data: memberChildren
			});
		}else{//不为空进行循环判断是否有重复的，有重复就不用再次追加
			var appendChildren = $("#candidateTree").tree("getChildren");//获取已追加联系会员所有节点
			for(var i=0;i<memberChildren.length;i++){
				var isflash=true;
				//从活跃会员一个一个的跟联系人会员对比
				for(var j=0;j<appendChildren.length;j++){
					if(memberChildren[i].text == appendChildren[j].text){
						isflash = false;
						break;//相同的就跳出
					}
				}
				//为true时执行追加
				if(isflash){
					$('#candidateTree').tree('append', {
						data: memberChildren[i]
					});
				}
			}
			//循环完毕
		}
		//重新把所有节点的ID存到数组步骤
		var nodeApped = $('#candidateTree').tree('getChildren');//重新获取联系会员的所有节点节点
		var index = 0;
		arr = new Array();//初始化
		$.each(nodeApped,function(i,v){
			arr[index]=v.id; 
        	index++;
		});
	}
	
	//下拉项选中发生的操作功能
	//下拉项选中发生的操作功能
	$("#noteType").combobox({
		onSelect:function(record){
			if(record.value == "candidate"){//选择为candidate部分群发时进行以下方法
				$("#opacityOne").remove();//删除透明度,让用户能进行选择用户的操作
				$("#opacityTwo").remove();
				option = record.value;
			}else{//反之先删除再追加，预防增加多一层
				$("#opacityOne").remove();
				$("#opacityTwo").remove();
				var divOne="<div id='opacityOne' style='position: absolute;width: 100%;height: 100%;background-color: gray;filter:alpha(Opacity=20); opacity: 0.2;z-index: 999;'></div>";
				var divOTwo="<div id='opacityTwo' style='position: absolute;width: 100%;height: 100%;background-color: gray;filter:alpha(Opacity=20); opacity: 0.2;margin-top: -15px;z-index: 999;'></div>";
				$("#west").append(divOne);
				$("#east").append(divOTwo);
				var children = $("#candidateTree").tree("getChildren");//获取id为联系会员所有节点
				if(children != ""){//不为空就进行删除节点
					$.each(children,function(i,v){
						$("#candidateTree").tree("remove",v.target);
						$("#cancels .tree-indent").remove();//删除class为indent的节点预防删除完后样式突出
					});
				}
				option = record.value;
			}
		}
	});
	
	
	//删除选中的节点功能
	function cancelTree(){
		var children = $("#candidateTree").tree("getChildren");//获取所有节点
		if(children!=""){
			var c = $("#candidateTree").tree("getSelected");
			if(c!=null){
				$("#candidateTree").tree("remove",c.target);
				$("#cancels .tree-indent").remove();//删除class为indent的节点预防删除完后样式突出
				var nodeApped = $('#candidateTree').tree('getChildren');//获取删除过后所剩子节点
				var index = 0;
				arr = new Array();//初始化
				$.each(nodeApped,function(i,v){
					arr[index]=v.id; 
		        	index++;
				});
			}else{
				alert("至少选择一个联系会员");
			}
		}else{
			alert("至少选择一个联系会员");
		}
	}
	
	//删除全部节点功能
	function cancelTrees(){
		var children = $("#candidateTree").tree("getChildren");
		if(children!=""){
			$.each(children,function(index,value){
				$("#candidateTree").tree("remove",value.target);
				arr = new Array();//初始化
			});
			$("#cancels .tree-indent").remove();//删除class为indent的节点预防删除完后样式突出
		}
	}
	
	function noteFind(){
		var param = $("#memberName").val();
		console.info(param);
		$('#memberTreeGrid').tree({    
		    url: ctx + '/do/note/listAsTree.json?param='+param ,
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
	}
	
	$(function(){
		noteFind();
	});

</script>