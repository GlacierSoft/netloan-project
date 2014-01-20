<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<script type="text/javascript" charset="utf-8">

	var roleId = '${roleId}';//获取授权角色Id
	var panelArray = [];//当前菜单面板数组，用于注销面板
	
	//初始化导航
	$('#actionAuth_west_tree').tree({
		data : $.parseJSON('${allMenuTreeNodeData}'),
		smooth: true, //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
		lines : true,
		checkbox : true,
		onClick : function(node) {
			if (node.attributes.url) {//当存在URL的情况下，方可对该菜单的操作进行授权
				$('#save_actionAuth').linkbutton('enable');
                //发送请求获取该菜单下的面板和操作权限
				$.ajax({
					   type: "POST",
					   url: ctx + "/do/res/action/getPAAuthByCondition.json",
					   data: {roleId:roleId,menuId:node.id},
					   dataType:'json',
					   success: function(r){
						   if(panelArray.length >0){//注销面板内容，防止页面内存泄漏(主要体现在页面中使用到的easyui组件不会被清空)
							 //获取选择的权限以及权限范围
								$.each(panelArray, function(panelArray_i, panelArray_o){
									$('#'+panelArray_o+'').panel('destroy');
								});
								panelArray.length = 0;//清空数组
						   }
						   	$("#actionAuthPanel").empty();//点击菜单清空右侧面板
						   
						   	var authData = $.parseJSON(r);//ajax返回的字符串需要用jq工具转成object
							 
							var authRange = [{"id":"ALL","text":"[A]-全部"},{"id":"DEPC","text":"[DC]-本部门以及子部门"},{"id":"DEP","text":"[D]-本部门"},{"id":"SELF","text":"[S]-本人"}];//权限范围
							
							if(authData.length > 0){//存在面板，动态创建面板
								
								var actionAuthPanelStr = "<table cellpadding='3' style='width:300px;margin:0 auto;'><tr>";//拼接面板html字符串
								$.each(authData, function(authData_i, authData_o){
									panelArray.push(authData_o.panelEnName);
									actionAuthPanelStr += "<td><div id='"+authData_o.panelEnName+"' style='padding-top:5px;width:300px;height:450px;'><table class='gridtable' id='"+authData_o.panelEnName+"Table'><tr><th>操作</th><th>权限范围</th></tr></table></div></td>";
								});
								
								actionAuthPanelStr += "</tr><table>";
								$('#actionAuthPanel').append(actionAuthPanelStr);
								//初始化面板
								$.each(authData, function(authData_i, authData_o){
									$('#'+authData_o.panelEnName+'').panel({
										title:authData_o.panelCnName
									});
									//初始化面板内部表格
									$.each(authData_o.panelAuthData, function(i, n){
										var appendStr = '<tr><td nowrap><input panelName="'+authData_o.panelEnName+'" name="'+authData_o.panelEnName+'_'+n.action+'" type="checkbox" ';//表行与表格开始
										if(n.defaultAuth){//默认拥有权限控制用户不能勾选
											appendStr += 'onclick="return defaultAuthCheck(this);" isDefault="isDefault" ';
										}else{
											appendStr += 'onclick="return nonDefaultAuthCheck(this);" ';
										}
										if(n.ownAuth){//拥有的操作打勾
											appendStr += 'checked="checked" ';
										}
										if(n.hasAuthSet){//数据范围表格开始
											appendStr += 'hasAuthSet="hasAuthSet"/>'+n.actionName+'</td><td>';//表格结束
											appendStr += '<input id="'+authData_o.panelEnName+'_'+n.action+'_AuthSet" value="'+n.authSet+'"/>';
										}else{
											appendStr += '/>'+n.actionName+'</td><td>';//表格结束
										}
										appendStr += '</td></tr>';//表行结束
										$('#'+authData_o.panelEnName+'Table').append(appendStr);
									});
								});
								
								//初始化id以authSet结尾的combox
								$("input[id$='_AuthSet']").combobox({data:authRange,valueField:'id',textField:'text',editable:false});
								
							}
					   }
				});
			}
		}
	});
	
	//默认操作不允许用户取消勾选状态
	function defaultAuthCheck(checkbox){
		if(!$(checkbox).is(':checked')){//取消勾选的时候返回false
			return false;
		}else{
			var node = $('#actionAuth_west_tree').tree('getSelected');
			$('#actionAuth_west_tree').tree('check',node.target);
		}
	};
	
	//非默认操作点击必须勾选默认操作
	function nonDefaultAuthCheck(checkbox){
		if($(checkbox).is(':checked')){//勾选的时候查找该面板下的所有默认操作，并进行勾选
			var panelName = $(checkbox).attr('panelName');
			var node = $('#actionAuth_west_tree').tree('getSelected');
			$('#actionAuth_west_tree').tree('check',node.target);
			$.each($('#'+panelName+'').find("input[isDefault='isDefault']"), function(CB_i, CB_o){
				$(CB_o).attr('checked','checked');
			});
		}
	};
	
	//保存菜单权限
	$('#save_menuAuth').click(function(){
		var nodes = $('#actionAuth_west_tree').tree('getChecked', ['checked','indeterminate']);
		var menuIds = [];
		for(var i=0;i<nodes.length;i++){
			menuIds.push(nodes[i].id);
		}
		//发送远程请求保存当前权限设置
		$.ajax({
			   type: "POST",
			   url: ctx + "/do/role/saveRoleMenuAuths.json",
			   data: {roleId:roleId,menuIds:menuIds.join(',')},
			   dataType:'json',
			   success: function(r){
				   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
					   $.messager.show({
							title:'提示',
							msg:r.msg,
							timeout:3000,
							showType:'fade'
						});
				   }else{
						$.messager.show({//后台验证弹出错误提示信息框
							title:'错误提示',
							width:380,
							height:120,
							msg: '<span style="color:red">'+r.msg+'<span>',
							timeout:4500
						});
					}
			   }
		}); 
	});
	
	//保存操作权限
	$('#save_actionAuth').click(function(){
		var node = $('#actionAuth_west_tree').tree('getSelected');
		if(!node.checked){
		    $.messager.confirm("警告", "您保存本页操作由于没有点选菜单，是否自动勾选并提交到后台？", function (c){
		    	if(c){
		    		$('#actionAuth_west_tree').tree('check',node.target);
		    	}
		    });
		}
		var actions = '';//面板和操作组合的权限字符串
		$.each($('#actionAuthPanel').find("input:checked"), function(CB_i, CB_o){
			var cb_action = $(CB_o).attr('name');
			var cb_range = 'ALL';
			if($(CB_o).attr('hasAuthSet') == 'hasAuthSet'){
				cb_range = $('#'+cb_action+'_AuthSet').combobox('getValue');
			}
			actions += cb_action+":"+cb_range+",";
		});
		
		actions = actions.substring(0,actions.length-1);
		
		//发送远程请求保存当前权限设置
		$.ajax({
			   type: "POST",
			   url: ctx + "/do/role/saveRoleMenuActionAuths.json",
			   data: {roleId:roleId,menuId:node.id,actions:actions},
			   dataType:'json',
			   success: function(r){
				   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
					   $.messager.show({
							title:'提示',
							msg:r.msg,
							timeout:3000,
							showType:'fade'
						});
				   }else{
						$.messager.show({//后台验证弹出错误提示信息框
							title:'错误提示',
							width:380,
							height:120,
							msg: '<span style="color:red">'+r.msg+'<span>',
							timeout:4500
						});
					}
			   }
		}); 
	});
	
</script>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'west',split:true" style="width:160px;overflow:hidden;">
		<div class="easyui-panel" data-options="fit:true,border:false">
			<div class="easyui-layout" data-options="fit:true,border:false">
				<div data-options="region:'south',border:false" style="height:35px;">
					<div class="toorbar_right">
                       <a id="save_menuAuth" class="easyui-linkbutton"  data-options="iconCls:'icon-save'">保存菜单权限</a>
                   </div>
				</div>
				<div data-options="region:'center',border:false">
					<ul id="actionAuth_west_tree"></ul>
				</div>
			</div>
		</div>
	</div>
	<div data-options="region:'center'" style="padding-top:5px;">
		<div class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'south',border:false" style="height:35px;">
				<div class="toorbar_right">
						<a id="save_actionAuth" class="easyui-linkbutton"  data-options="disabled:true,iconCls:'icon-save'">保存本页操作权限</a>
                 </div>
			</div>
			<div data-options="region:'north',border:false" style="height:30px;">
				<div class="tip_info">
					<div class="tip_text icon-tip">&nbsp;</div>
					<div>提示：更换菜单前，请先保存本页操作权限，否则您在本页面所做的变更不会被记录！</div>
				</div>
			</div>
			<div data-options="region:'center',border:false">
				<div id="actionAuthPanel"></div>
			</div>
		</div>
	</div>
</div>