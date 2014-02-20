<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.website_mgr.advertisement_mgr.advertisement');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.website_mgr.advertisement_mgr.advertisement.param = {
			toolbarId : 'advertisementDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化广告DataGrid
	glacier.website_mgr.advertisement_mgr.advertisement.advertisementDataGrid = $('#advertisementDataGrid').datagrid({
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
		url: ctx + '/do/advertisement/list.json',
		sortName: 'webAdvTheme',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'webAdvId',
		columns:[[
			{
				field:'webAdvId',
				title:'ID',
				checkbox:true
			},{
				field:'webAdvTheme',
				title:'广告主题',
				width:120,
				sortable:true
			},{
				field:'webAdvContent',
				title:'广告内容',
				width:120,
				sortable:true
			},{
				field:'webAdvStatus',
				title:'广告状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如enable显示启用，disable显示禁用
					return renderGridValue(value,fields.status);
				}
			},{
				field:'clicks',
				title:'点击次数',
				width:120,
				sortable:true
			},{
				field:'accessory',
				title:'附件',
				width:120,
				sortable:true
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			},{
				field:'creater',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			},{
				field:'updater',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		padvertisementSize : 10,//注意，padvertisementSize必须在padvertisementList存在
		padvertisementList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#advertisementDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.advertisement_mgr.advertisement.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.advertisement_mgr.advertisement.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.advertisement_mgr.advertisement.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.advertisement_mgr.advertisement.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.website_mgr.advertisement_mgr.advertisement.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.website_mgr.advertisement_mgr.advertisement.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.webAdvTheme,
				href : ctx + '/do/advertisement/intoDetail.htm?webAdvId='+rowData.webAdvId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 250,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement = function(){
		glacier.basicAddOrEditDialog({
			title : '增加广告',
			width : 400,
			height : 340,
			queryUrl : ctx + '/do/advertisement/intoForm.htm',
			submitUrl : ctx + '/do/advertisement/add.json',
			successFun : function (){
				glacier.website_mgr.advertisement_mgr.advertisement.advertisementDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement = function(){
		var row = glacier.website_mgr.advertisement_mgr.advertisement.advertisementDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.webAdvTheme+'】',
			width : 400,
			height : 340,
			queryUrl : ctx + '/do/advertisement/intoForm.htm',
			submitUrl : ctx + '/do/advertisement/edit.json',
			queryParams : {
				webAdvId : row.webAdvId
			},
			successFun : function (){
				glacier.website_mgr.advertisement_mgr.advertisement.advertisementDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement = function(){
		var rows = glacier.website_mgr.advertisement_mgr.advertisement.advertisementDataGrid.datagrid("getChecked");
		var webAdvIds = [];//删除的id标识
		var webAdvThemes = [];//广告主题
		for(var i=0;i<rows.length;i++){
			webAdvIds.push(rows[i].webAdvId);
			webAdvThemes.push(rows[i].webAdvTheme);
		}
		if(webAdvIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/advertisement/del.json',
						   data: {webAdvIds:webAdvIds.join(','),webAdvThemes:webAdvThemes.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.website_mgr.advertisement_mgr.advertisement.advertisementDataGrid.datagrid('reload');
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
	//广告资料模糊查询
	glacier.website_mgr.advertisement_mgr.advertisement.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.website_mgr.advertisement_mgr.advertisement.advertisementDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有广告列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="advertisementGridPanel" data-options="region:'center',border:true" >
		<table id="advertisementDataGrid">
			<glacierui:toolbar panelEnName="AdvertisementList" toolbarId="advertisementDataGrid_toolbar" menuEnName="advertisement"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>