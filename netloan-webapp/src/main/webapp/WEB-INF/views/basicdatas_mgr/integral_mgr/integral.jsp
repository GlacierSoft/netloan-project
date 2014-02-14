<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.integral_mgr.integral');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.basicdatas_mgr.integral_mgr.integral.param = {
			toolbarId : 'integralDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化角色DataGrid
	glacier.basicdatas_mgr.integral_mgr.integral.integralDataGrid = $('#integralDataGrid').datagrid({
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
		url: ctx + '/do/integral/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'integralId',
		columns:[[
			{
				field:'integralId',
				title:'ID',
				checkbox:true
			},{
				field:'integralName',
				title:'会员积分级别名称',
				width:120,
				sortable:true
			},{
				field:'integralBegin',
				title:'会员开始积分',
				width:120,
				sortable:true
			},{
				field:'integralEnd',
				title:'会员结束积分',
				width:120,
				sortable:true
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
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
		toolbar:'#integralDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//在用户勾选一行的时候触发事件
			action_controller(glacier.basicdatas_mgr.integral_mgr.integral.param,this).check();
		},
		onCheckAll:function(rows){//在用户勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.integral_mgr.integral.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//在用户取消勾选一行的时候触发
			action_controller(glacier.basicdatas_mgr.integral_mgr.integral.param,this).unCheck();
		},
		onUncheckAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.integral_mgr.integral.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//在用户选择一行的时候触发
			action_controller(glacier.basicdatas_mgr.integral_mgr.integral.param,this).select();
		},
		onUnselectAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.integral_mgr.integral.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		}
	});
	
/* 	glacier.basicdatas_mgr.integral_mgr.integral.newDialog = function(title,integralId,url,loadType){
		$.easyui.showDialog({
			href : ctx + '/do/integral/intoForm.htm?integralId='+integralId,//从controller请求jsp页面进行渲染
			width : 450,
			height : 300,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			title : title,
			buttons : [ 
			 {
				text : '保存',
				iconCls : 'icon-save',
				handler : function(dia) {
						$('#integral_mgr_integral_form').form('submit', {
							url: ctx + url,
							success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.integral_mgr.integral.integralDataGrid.datagrid('reload');
								    dia.dialog("close"); 
								}
								 
							}
						});
					}
			}]
		});
	};
	
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.integral_mgr.integral.addIntegral = function(){
		glacier.basicdatas_mgr.integral_mgr.integral.newDialog('增加会员信用级别','','/do/integral/add.json','load');
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.integral_mgr.integral.editIntegral = function(){
		var row = glacier.basicdatas_mgr.integral_mgr.integral.integralDataGrid.datagrid("getSelected");
		glacier.basicdatas_mgr.integral_mgr.integral.newDialog('编辑会员信用级别',row.integralId,'/do/integral/edit.json','reload');
	}; */
		/*
		新建/编辑 弹出框
		title:弹出框标题
		submitUrl：提交路径
		id:新增值为空字符串，编辑填写后台要获取的数据ID
	*/
	glacier.basicdatas_mgr.integral_mgr.integral.newDialog = function(title,submitUrl,id){
		var iconCls = 'icon-standard-pencil-add';
		if(id){
			iconCls='icon-standard-pencil-go';
		}
		$.easyui.showDialog({
			href : ctx + '/do/integral/intoForm.htm?integralId='+id,//从controller请求jsp页面进行渲染
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
							glacier.basicdatas_mgr.integral_mgr.integral.integralDataGrid.datagrid('reload');
							return true;
						}
						 
					}
				});
			}
		});
	};
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.integral_mgr.integral.addIntegral = function(){
		glacier.basicdatas_mgr.integral_mgr.integral.newDialog('增加会员信用级别','/do/integral/add.json','');
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.integral_mgr.integral.editIntegral = function(){
		var row = glacier.basicdatas_mgr.integral_mgr.integral.integralDataGrid.datagrid("getSelected");
		glacier.basicdatas_mgr.integral_mgr.integral.newDialog('编辑【'+row.integralName+'】','/do/integral/edit.json',row.integralId);
	};
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.integral_mgr.integral.delIntegral = function(){
		var rows = glacier.basicdatas_mgr.integral_mgr.integral.integralDataGrid.datagrid("getChecked");
		var integralIds = [];//删除的id标识
		var integralNames = [];//日志记录引用名称
		for(var i=0;i<rows.length;i++){
			integralIds.push(rows[i].integralId);
			integralNames.push(rows[i].integralName);
		}
		if(integralIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/integral/del.json',
						   data: {integralIds:integralIds.join(','),integralNames:integralNames.join(',')},
						   dataType:'json',
						   success: function(r){
								 if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
									   $.messager.show({
											title:'提示',
											timeout:3000,
											msg:r.msg
										});
									   glacier.basicdatas_mgr.integral_mgr.integral.integralDataGrid.datagrid('reload');
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

<!-- 所有角色列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="integralGridPanel" data-options="region:'center',border:true" >
		<table id="integralDataGrid">
			<glacierui:toolbar panelEnName="integralList" toolbarId="integralDataGrid_toolbar" menuEnName="integral"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>
