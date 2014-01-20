<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.permissions_mgr.role_mgr.role');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//角色选中
	glacier.permissions_mgr.role_mgr.role.roleAlwaySelect = function(){
		$('#role_btn_RolePanel_edit').linkbutton('enable');//编辑
		$('#role_btn_RolePanel_auth').linkbutton('enable');//角色授权
		$('#role_btn_RolePanel_actionAuth').linkbutton('enable');//角色授权
	};
	
	//角色未选中
	glacier.permissions_mgr.role_mgr.role.roleAlwayUnSelect = function(){
		$('#role_btn_RolePanel_edit').linkbutton('disable');//编辑
		$('#role_btn_RolePanel_auth').linkbutton('disable');//角色授权
		$('#role_btn_RolePanel_actionAuth').linkbutton('disable');//角色授权
	};
	
	//角色勾选
	glacier.permissions_mgr.role_mgr.role.roleAlwayCheck = function(){
		var rows = glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid("getChecked");
		if(rows.length > 0){//如果勾选的列大于0，则激活删除按钮
			$('#role_btn_RolePanel_del').linkbutton('enable');//删除
		}
	};
	
	//角色取消勾选
	glacier.permissions_mgr.role_mgr.role.roleAlwayUnCheck = function(){
		var rows = glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid("getChecked");
		if(rows.length > 0){//如果勾选的列大于0，则激活删除按钮
			$('#role_btn_RolePanel_del').linkbutton('enable');//删除
		}else{
			$('#role_btn_RolePanel_del').linkbutton('disable');//删除
		}
	};
	
	
	//初始化角色DataGrid
	glacier.permissions_mgr.role_mgr.role.roleDataGrid = $('#roleDataGrid').datagrid({
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
		idField:'id',
		columns:[[
			{
				field:'id',
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
				title:'是否内置角色',
				width:80
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
			glacier.permissions_mgr.role_mgr.role.roleAlwayCheck();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			glacier.permissions_mgr.role_mgr.role.roleAlwayCheck();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			glacier.permissions_mgr.role_mgr.role.roleAlwayUnCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			glacier.permissions_mgr.role_mgr.role.roleAlwayUnCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			glacier.permissions_mgr.role_mgr.role.roleAlwaySelect();
		},
		onUnselectAll:function(rows){
			glacier.permissions_mgr.role_mgr.role.roleAlwayUnSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('unselectAll');
			$(this).datagrid('uncheckAll');
		}
	});
	
	
	glacier.permissions_mgr.role_mgr.role.newDialog = function(title,roleId,url,loadType){
		$.easyui.showDialog({
			href : ctx + '/do/role/intoForm.htm?roleId='+roleId,//从controller请求jsp页面进行渲染
			width : 385,
			height : 250,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			title : title,
			buttons : [ 
			 {
				text : '保存',
				iconCls : 'icon-save',
				handler : function(dia) {
						$('#role_mgr_role_form').form('submit', {
							url: ctx + url,
							success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid('reload');
								    dia.dialog("close"); 
								}
								 
							}
						});
					}
			}]
		});
	};
	//点击增加按钮触发方法
	glacier.permissions_mgr.role_mgr.role.addRole = function(){
		glacier.permissions_mgr.role_mgr.role.newDialog('增加角色','','/do/role/add.json','load');
	};
	//点击编辑按钮触发方法
	glacier.permissions_mgr.role_mgr.role.editRole = function(){
		var row = glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid("getSelected");
		glacier.permissions_mgr.role_mgr.role.newDialog('编辑角色',row.roleId,'/do/role/edit.json','reload');
	};
	//点击删除按钮触发方法
	glacier.permissions_mgr.role_mgr.role.delRole = function(){
		var row = glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid("getChecked");
		var roleId = row[0].id;
		if(roleId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/role/del.html',
						   data: {roleId:roleId},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid("uncheckAll");
								   glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid('reload');
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
	glacier.permissions_mgr.role_mgr.role.showMenuAndActionWin = function(){//点击角色授权，根据角色id显示该角色拥有的资源和操作
		var row = glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid("getChecked");
		var roleId = row[0].roleId;
			//初始化资源和操作的treegrid
			glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid = $('#menuAndActions').treegrid({
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
						var node = glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('getSelected');
						if (node) {
							glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('expandAll', node.cid);
						} else {
							glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('expandAll');
						}
					}
				}, '-', {
					text : '折叠',
					iconCls : 'icon-undo',
					handler : function() {
						var node = glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('getSelected');
						if (node) {
							glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('collapseAll', node.cid);
						} else {
							glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('collapseAll');
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
			glacier.permissions_mgr.role_mgr.role.menuAndActionWin = $('#menuAndActionWin').dialog({ 
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
						glacier.permissions_mgr.role_mgr.role.submitMenuAndAction(roleId);
					}
				},{
					text:'关闭',
					iconCls:"icon-undo",
					handler:function(){
						glacier.permissions_mgr.role_mgr.role.menuAndActionWin.dialog('close');
					}
				}]
			});
	};
	//点击操作复选框触发事件
	glacier.permissions_mgr.role_mgr.role.actionsClick = function (input) {
		glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('checkRow',input.id.split("_")[0]);
	};
	//保存分配操作权限
	glacier.permissions_mgr.role_mgr.role.submitMenuAndAction = function (roleId){
		//此处有一个bug,用easyui自带的getChecked获取选择行偶尔会出现bug，只好使用jquery选择器获取menuIds
		//console.log(glacier.permissions_mgr.role_mgr.role.menuAndActionsDataGrid.treegrid('getChecked'));
		var menuIds = [];
		var menuInputs = glacier.permissions_mgr.role_mgr.role.menuAndActionWin.find("input[name='id']:checked");
		for(var i=0;i<menuInputs.length;i++){
			menuIds.push(menuInputs[i].value);
		}
	 	//获取勾选的操作复选框
		var menuActions = [];
		var actionInputs = glacier.permissions_mgr.role_mgr.role.menuAndActionWin.find("input[name='actionCB']:checked");
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
					   glacier.permissions_mgr.role_mgr.role.menuAndActionWin.dialog('close');
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
	glacier.permissions_mgr.role_mgr.role.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid('load',obj);
	};
	
	//操作授权
	glacier.permissions_mgr.role_mgr.role.actionAuth = function(){
		//获取要授权的角色Id
		var row = glacier.permissions_mgr.role_mgr.role.roleDataGrid.datagrid("getSelected");
		$.easyui.showDialog({
			href : ctx + '/do/role/actionAuth.htm?roleId='+row.roleId,//从controller请求jsp页面进行渲染
			width :792,
			height : 600,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			enableCloseButton : false,
			title : ' ['+row.roleCnName+'] -> (权限维护)'
		});
	};
</script>

<!-- 所有角色列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="roleGridPanel" data-options="region:'center',border:true" >
		<table id="roleDataGrid">
			<glacierui:toolbar panelEnName="RolePanel" toolbarId="roleDataGrid_toolbar" menuEnName="rolemgr"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>
<!-- 自定义角色授权窗口 -->
<div id="menuAndActionWin">
	<table id="menuAndActions"></table>
</div>