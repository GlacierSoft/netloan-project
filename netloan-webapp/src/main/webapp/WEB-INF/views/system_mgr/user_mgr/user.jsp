<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.system_mgr.user_mgr.user');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.system_mgr.user_mgr.user.param = {
			toolbarId : 'userDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化角色DataGrid
	glacier.system_mgr.user_mgr.user.userDataGrid = $('#userDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		//fitColumns:false,//自动填充行,出现滚动条
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/user/list.json',
		sortName: 'username',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'id',
		columns:[[
			{
				field:'id',
				title:'ID',
				checkbox:true
			},{
				field:'username',
				title:'用户名',
				width:120,
				sortable:true
			},{
				field:'userCnName',
				title:'真实名称',
				width:120,
				sortable:true
			},{
				field:'status',
				title:'状态',
				width:120
			},{
				field:'builtin',
				title:'是否内置',
				width:120,
				sortable:true
			},{
				field:'email',
				title:'电子邮箱',
				width:120,
				sortable:true
			},{
				field:'userImage',
				title:'头像路径',
				width:120,
				sortable:true
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			},{
				field:'lastLoginTime',
				title:'最后登录时间',
				sortable:true,
				width:120
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#userDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.user_mgr.user.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.user_mgr.user.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.user_mgr.user.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.user_mgr.user.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.system_mgr.user_mgr.user.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.system_mgr.user_mgr.user.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('unselectAll');
			$(this).datagrid('uncheckAll');
		}
	});
	
		/*
		新建/编辑 弹出框
		title:弹出框标题
		submitUrl：提交路径
		id:新增值为空字符串，编辑填写后台要获取的数据ID
	*/
	glacier.system_mgr.user_mgr.user.newDialog = function(title,submitUrl,id){
		var iconCls = 'icon-standard-pencil-add';
		if(id){
			iconCls='icon-standard-pencil-go';
		}
		$.easyui.showDialog({
			href : ctx + '/do/user/intoForm.htm?userId='+id,//从controller请求jsp页面进行渲染
			width : 450,
			height : 300,
			resizable: false,
			enableApplyButton : false,
			title : title,
			iconCls : iconCls,
			onSave : function(){
				$(this).find('form').form('submit', {
					url: ctx + submitUrl,
					success: function(r){
						$.messager.show(r.msg);
						if(r.success){
							glacier.system_mgr.user_mgr.user.userDataGrid.datagrid('reload');
							return true;
						}
						 
					}
				});
			}
		});
	};
	//点击增加按钮触发方法
	glacier.system_mgr.user_mgr.user.addUser = function(){
		glacier.system_mgr.user_mgr.user.newDialog('增加管理员信息','/do/user/add.json','');
	};
	//点击编辑按钮触发方法
	glacier.system_mgr.user_mgr.user.editUser = function(){
		var row = glacier.system_mgr.user_mgr.user.userDataGrid.datagrid("getSelected");
		glacier.system_mgr.user_mgr.user.newDialog('编辑【'+row.username+'】','/do/user/edit.json',row.userId);
	};

	//点击删除按钮触发方法
	glacier.system_mgr.user_mgr.user.delUser = function(){
		var row = glacier.system_mgr.user_mgr.user.userDataGrid.datagrid("getChecked");
		var userId = row[0].userId;
		if(userId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/user/del.json',
						   data: {userId:userId},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.system_mgr.user_mgr.user.userDataGrid.datagrid("uncheckAll");
								   glacier.system_mgr.user_mgr.user.userDataGrid.datagrid('reload');
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
	
</script>

<!-- 所有操作日志列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="userGridPanel" data-options="region:'center',border:true" >
		<table id="userDataGrid">
			<glacierui:toolbar panelEnName="UserList" toolbarId="userDataGrid_toolbar" menuEnName="user"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>