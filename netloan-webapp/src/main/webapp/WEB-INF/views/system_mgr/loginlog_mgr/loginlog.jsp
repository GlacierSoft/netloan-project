<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.system_mgr.loginlog_mgr.loginlog');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.system_mgr.loginlog_mgr.loginlog.param = {
			toolbarId : 'loginlogDataGrid_toolbar',
			actions : {
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化角色DataGrid
	glacier.system_mgr.loginlog_mgr.loginlog.loginlogDataGrid = $('#loginlogDataGrid').datagrid({
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
		url: ctx + '/do/loginlog/list.json',
		sortName: 'loginTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'id',
		columns:[[
			{
				field:'id',
				title:'ID',
				checkbox:true
			},{
				field:'userId',
				title:'用户ID',
				width:120,
				sortable:true
			},{
				field:'loginUser',
				title:'登录人',
				width:120,
				sortable:true
			},{
				field:'loginIp',
				title:'登录IP',
				width:120
			},{
				field:'browserVersion',
				title:'浏览器版本',
				width:120,
				sortable:true
			},{
				field:'screenSize',
				title:'屏幕分辨率',
				width:120,
				sortable:true
			},{
				field:'loginTime',
				title:'登录时间',
				sortable:true,
				width:120
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#loginlogDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.loginlog_mgr.loginlog.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.loginlog_mgr.loginlog.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.system_mgr.loginlog_mgr.loginlog.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.system_mgr.loginlog_mgr.loginlog.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.system_mgr.loginlog_mgr.loginlog.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.system_mgr.loginlog_mgr.loginlog.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('unselectAll');
			$(this).datagrid('uncheckAll');
		}
	});
	

	//点击删除按钮触发方法
	glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog = function(){
		var row = glacier.system_mgr.loginlog_mgr.loginlog.loginlogDataGrid.datagrid("getChecked");
		var loginlogId = row[0].loginlogId;
		if(loginlogId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/loginlog/del.json',
						   data: {loginlogId:loginlogId},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.system_mgr.loginlog_mgr.loginlog.loginlogDataGrid.datagrid("uncheckAll");
								   glacier.system_mgr.loginlog_mgr.loginlog.loginlogDataGrid.datagrid('reload');
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
	<div id="loginlogGridPanel" data-options="region:'center',border:true" >
		<table id="loginlogDataGrid">
			<glacierui:toolbar panelEnName="LoginlogList" toolbarId="loginlogDataGrid_toolbar" menuEnName="loginlog"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>