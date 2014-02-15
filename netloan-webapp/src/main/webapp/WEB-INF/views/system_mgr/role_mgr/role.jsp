<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.system_mgr.role_mgr.role');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.system_mgr.role_mgr.role.param = {
			toolbarId : 'roleDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				auth:{flag:'auth',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化角色DataGrid
	glacier.system_mgr.role_mgr.role.roleDataGrid = $('#roleDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/role/list.json',
		sortName: 'roleEnName',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'roleId',
		columns:[[
			{
				field:'roleId',
				title:'ID',
				checkbox:true
			},{
				field:'roleCnName',
				title:'角色名',
				width:120,
				sortable:true
			},{
				field:'roleEnName',
				title:'角色英文名',
				width:120,
				sortable:true
			},{
				field:'builtin',
				title:'是否内置',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.builtin);
				}
			},{
				field:'createTime',
				title:'录入时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#roleDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.role_mgr.role.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.role_mgr.role.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.role_mgr.role.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.role_mgr.role.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.system_mgr.role_mgr.role.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.system_mgr.role_mgr.role.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.roleCnName,
				href : ctx + '/do/role/intoDetail.htm?roleId='+rowData.roleId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 250,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	/*
		新建/编辑 弹出框
		title:弹出框标题
		submitUrl：提交路径
		id:新增值为空字符串，编辑填写后台要获取的数据ID
	*/
	glacier.system_mgr.role_mgr.role.newDialog = function(title,submitUrl,id){
		var iconCls = 'icon-standard-pencil-add';
		if(id){
			iconCls='icon-standard-pencil-go';
		}
		$.easyui.showDialog({
			href : ctx + '/do/role/intoForm.htm?roleId='+id,//从controller请求jsp页面进行渲染
			width : 385,
			height : 250,
			resizable: false,
			enableApplyButton : false,
			title : title,
			iconCls : iconCls,
			onSave : function(){
				$(this).find('form').form('submit', {
					url: ctx + submitUrl,
					success: function(r){
						if(r.success){
							$.messager.show({//后台验证弹出错误提示信息框
								title:'操作成功',
								width:380,
								height:120,
								msg: '<span style="color:red">'+r.msg+'<span>',
								timeout:4500
							});
							glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid('reload');
						}else{
							$.messager.show({//后台验证弹出错误提示信息框
								title:'操作失败',
								icon:'error',
								width:380,
								height:120,
								msg: '<span style="color:red">'+r.msg+'<span>',
								timeout:4500
							});
						}
						 
					}
				});
			}
		});
	};
	//点击增加按钮触发方法
	glacier.system_mgr.role_mgr.role.addRole = function(){
		glacier.system_mgr.role_mgr.role.newDialog(' 增加角色','/do/role/add.json','');
	};
	//点击编辑按钮触发方法
	glacier.system_mgr.role_mgr.role.editRole = function(){
		var row = glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid("getSelected");
		glacier.system_mgr.role_mgr.role.newDialog(' 编辑【'+row.roleCnName+'】','/do/role/edit.json',row.roleId);
	};
	//点击删除按钮触发方法
	glacier.system_mgr.role_mgr.role.delRole = function(){
		var rows = glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid("getChecked");
		var roleIds = [];//删除的id标识
		var roleCnNames = [];//日志记录引用名称
		for(var i=0;i<rows.length;i++){
			roleIds.push(rows[i].roleId);
			roleCnNames.push(rows[i].roleCnName);
		}
		if(roleIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/role/del.json',
						   data: {roleIds:roleIds.join(','),roleCnNames:roleCnNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid('reload');
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
				}
			});
		}
	};
	//授权显示窗口
	glacier.system_mgr.role_mgr.role.showMenuAndActionWin = function(){//点击角色授权，根据角色id显示该角色拥有的资源和操作
		var row = glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid("getChecked");
		var roleId = row[0].roleId;
			//初始化资源和操作的treegrid
			glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid = $('#menuAndActions').treegrid({
				url:ctx +'/do/res/menu/getAuthMenuAndActionsByRoleId.json',//请求的URL
				idField : 'id',
				treeField : 'menuName',//定义树节点字段
				smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持
				checkbox:true,
				singleSelect:true,
				checkOnSelect:false,
				selectOnCheck:false,
				nowrap:false,
				queryParams:{roleId:roleId},//当请求远程数据时，发送的额外参数
				fit : true,//控件自动resize占满窗口大小
				fitColumns : false,//使冻结列生效
				border : false,//是否存在边框
				frozenColumns : [ [ {
					title : 'id',
					field : 'id',
					checkbox:true
				},{
					field : 'menuName',
					title : '菜单',
					width : 150
				}] ],
				columns : [ [ 
							{
								field : 'actions',
								title : '操作',
								width : 400
							}  
				        ] ],
				toolbar : [ {
					text : '展开',
					iconCls : 'icon-redo',
					handler : function() {
						var node = glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('getSelected');
						if (node) {
							glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('expandAll', node.cid);
						} else {
							glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('expandAll');
						}
					}
				}, '-', {
					text : '折叠',
					iconCls : 'icon-undo',
					handler : function() {
						var node = glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('getSelected');
						if (node) {
							glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('collapseAll', node.cid);
						} else {
							glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('collapseAll');
						}
					}
				}],
				onUncheck:function(rowData){//取消勾选触发事件：取消操作中以id开头的input复选框=当前行
					var inputs = $("#menuAndActionWin input[id^='"+rowData.id+"']:checked");
					for(var i=0;i<inputs.length;i++){
						inputs[i].checked = false;
					}
				},
				onUncheckAll:function(rows){//取消勾选触发事件：取消操作中所有勾选的input复选框
					var inputs = $("#menuAndActionWin input[name='actionCB']:checked");
					for(var i=0;i<inputs.length;i++){
						inputs[i].checked = false;
					}
				}
			});
			//显示菜单和操作窗口
			glacier.system_mgr.role_mgr.role.menuAndActionWin = $('#menuAndActionWin').dialog({ 
				title:'角色授权',
			    width:650,  
			    height:430,
			    resizable:true,
			    //fit:true,
			    modal:true,
			    minimizable:true,
			    maximizable:true,
			    buttons:[{
					text:'保存',
					iconCls:"icon-save",
					handler:function(){
						glacier.system_mgr.role_mgr.role.submitMenuAndAction(roleId);
					}
				},{
					text:'关闭',
					iconCls:"icon-undo",
					handler:function(){
						glacier.system_mgr.role_mgr.role.menuAndActionWin.dialog('close');
					}
				}]
			});
	};
	//点击操作复选框触发事件
	glacier.system_mgr.role_mgr.role.actionsClick = function (input) {
		glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('checkRow',input.id.split("_")[0]);
	};
	//保存分配操作权限
	glacier.system_mgr.role_mgr.role.submitMenuAndAction = function (roleId){
		//此处有一个bug,用easyui自带的getChecked获取选择行偶尔会出现bug，只好使用jquery选择器获取menuIds
		//console.log(glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('getChecked'));
		var menuIds = [];
		var menuInputs = glacier.system_mgr.role_mgr.role.menuAndActionWin.find("input[name='id']:checked");
		for(var i=0;i<menuInputs.length;i++){
			menuIds.push(menuInputs[i].value);
		}
	 	//获取勾选的操作复选框
		var menuActions = [];
		var actionInputs = glacier.system_mgr.role_mgr.role.menuAndActionWin.find("input[name='actionCB']:checked");
		for(var i=0;i<actionInputs.length;i++){
			menuActions.push(actionInputs[i].id);
		}
		//发送远程请求保存当前权限设置
		$.ajax({
			   type: "POST",
			   url: ctx + "/menu/saveRoleMenus.html",
			   data: {roleId:roleId,menuIds:menuIds.join(','),menuActions:menuActions.join(',')},
			   dataType:'json',
			   success: function(r){
				   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
					   $.messager.show({
							title:'提示',
							msg:r.msg,
							timeout:3000,
							showType:'slide'
						});
					   glacier.system_mgr.role_mgr.role.menuAndActionWin.dialog('close');
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
	};
	//角色资料模糊查询
	glacier.system_mgr.role_mgr.role.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid('load',obj);
	};
	
	//操作授权
	glacier.system_mgr.role_mgr.role.actionAuth = function(){
		var roleId = glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid("getSelected").roleId;
			//初始化资源和操作的treegrid
			glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid = $('#menuAndActions').treegrid({
				url:ctx+'/do/auth/getAuthsByRoleId.json',
				queryParams:{roleId:roleId},
				idField : 'id',//定义了关键字段来标识一个树节点
				treeField : 'menuName',//定义树节点字段
				smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
				enableHeaderClickMenu: false,//启用表头菜单
		        enableHeaderContextMenu: true,//启用表头右键菜单
		        enableRowContextMenu: false,//启用表行右键菜单
		        singleSelect:true,
				checkOnSelect:false,
				selectOnCheck:false,
				nowrap:false,
				fit : true,//控件自动resize占满窗口大小
				fitColumns : true,//使冻结列生效
				border : false,//是否存在边框
				frozenColumns : [ [ {
					title : 'menuId',
					field : 'id',
					checkbox:true
				},{
					field : 'menuName',
					title : '菜单',
					width:120
				}] ],
				columns : [ [ 
							{
								field : 'actions',
								title : '操作',
								width:450
							}  
				        ] ],
				onUncheck:function(rowData){//取消勾选触发事件：取消操作中以id开头的input复选框=当前行
					$.each($("#menuAndActionWin input[id^='"+rowData.id+"']"), function(){
						this.checked = false;
					});
				},
				onUncheckAll:function(rows){//取消勾选触发事件：取消操作中所有勾选的input复选框
					$.each($("#menuAndActionWin input[name='actionCB']:checked"), function(){
						this.checked = false;
					});
				},
				onCheck:function(rowData){//取消勾选触发事件：取消操作中以id开头的input复选框=当前行
					$.each($("#menuAndActionWin input[id^='"+rowData.id+"']"), function(){
						this.checked = true;
					});
				},
				onCheckAll:function(rows){//取消勾选触发事件：取消操作中所有勾选的input复选框
					$.each($("#menuAndActionWin input[name='actionCB']"), function(){
						this.checked = true;
					});
				}
			});
			//显示菜单和操作窗口
			glacier.system_mgr.role_mgr.role.menuAndActionWin = $('#menuAndActionWin').dialog({ 
				title:'角色授权',
			    width:960,  
			    height:480,
			    resizable:true,
			    modal:true,
			    maximizable:true,
			    iconCls:'',
			    buttons:[{
					text:'保存',
					iconCls:'icon-save',
					handler:function(){
						glacier.system_mgr.role_mgr.role.submitMenuAndAction(roleId);
					}
				}]
			});
	};
	
	//保存分配操作权限
	glacier.system_mgr.role_mgr.role.submitMenuAndAction = function (roleId){
		//此处有一个bug,用easyui自带的getChecked获取选择行偶尔会出现bug，只好使用jquery选择器获取menuIds
		//console.log(glacier.system_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('getChecked'));
		var menuIds = [];
		$.each(glacier.system_mgr.role_mgr.role.menuAndActionWin.find("input[name='id']:checked"), function(){
			menuIds.push(this.value);
		});
	 	//获取勾选的操作复选框
		var authActions = [];
		$.each(glacier.system_mgr.role_mgr.role.menuAndActionWin.find("input[name='actionCB']:checked"), function(){
			authActions.push(this.id);
		});
		//发送远程请求保存当前权限设置
		$.ajax({
			   type: "POST",
			   url: ctx + "/do/auth/saveMenuActions.json",
			   data: {roleId:roleId,menuIds:menuIds.join(','),authActions:authActions.join(',')},
			   dataType:'json',
			   success: function(r){
				   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
					   $.messager.show({
							title:'提示',
							msg:r.msg,
							timeout:3000,
							showType:'slide'
						});
					   glacier.system_mgr.role_mgr.role.menuAndActionWin.dialog('close');
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
	};
</script>

<!-- 所有角色列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="roleGridPanel" data-options="region:'center'" >
		<table id="roleDataGrid">
			<glacierui:toolbar panelEnName="RoleList" toolbarId="roleDataGrid_toolbar" menuEnName="role"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;">
		<form id="roleSearchForm">
			<table>
				<tr>
					<td>角色名：</td>
					<td><input name="roleCnName" style="width: 80px;" class="spinner"/></td>
					<td>角色英文名：</td>
					<td><input name="roleEnName" style="width: 80px;" class="spinner"/></td>
					<td>是否内置：</td>
					<td>
						<select name="builtin" class="easyui-combobox" data-options="panelHeight:'auto',editable:false,height:18">
							<option value="builtin">内置</option>
							<option value="custom">自定义</option>
						</select>
					</td>
					<td>创建时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid('load',glacier.serializeObject($('#roleSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#roleSearchForm input').val('');glacier.system_mgr.role_mgr.role.roleDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
<!-- 自定义角色授权窗口 -->
<div id="menuAndActionWin">
	<table id="menuAndActions"></table>
</div>