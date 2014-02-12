<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.website_mgr.news_mgr.news');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.website_mgr.news_mgr.news.param = {
			toolbarId : 'newsDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化新闻DataGrid
	glacier.website_mgr.news_mgr.news.newsDataGrid = $('#newsDataGrid').datagrid({
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
		url: ctx + '/do/news/list.json',
		sortName: 'webNewsTheme',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'id',
		columns:[[
			{
				field:'id',
				title:'ID',
				checkbox:true
			},{
				field:'webNewsTheme',
				title:'新闻主题',
				width:120,
				sortable:true
			},{
				field:'webNewsContent',
				title:'新闻内容',
				width:120,
				sortable:true
			},{
				field:'webNewsStatus',
				title:'新闻状态',
				width:120,
				sortable:true
			},{
				field:'webNewsNum',
				title:'排序号',
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
				title:'录入人',
				sortable:true,
				width:200
			},{
				field:'createTime',
				title:'录入时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pnewsSize : 10,//注意，pnewsSize必须在pnewsList存在
		pnewsList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#newsDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.news_mgr.news.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.news_mgr.news.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.website_mgr.news_mgr.news.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.website_mgr.news_mgr.news.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.website_mgr.news_mgr.news.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.website_mgr.news_mgr.news.param,this).unSelect();
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
	glacier.website_mgr.news_mgr.news.newDialog = function(title,submitUrl,id){
		var iconCls = 'icon-standard-pencil-add';
		if(id){
			iconCls='icon-standard-pencil-go';
		}
		$.easyui.showDialog({
			href : ctx + '/do/news/intoForm.htm?webNewsId='+id,//从controller请求jsp页面进行渲染
			width : 400,
			height : 350,
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
							glacier.website_mgr.news_mgr.news.newsDataGrid.datagrid('reload');
							return true;
						}
						 
					}
				});
			}
		});
	};
	//点击增加按钮触发方法
	glacier.website_mgr.news_mgr.news.addNews = function(){
		glacier.website_mgr.news_mgr.news.newDialog(' 增加新闻','/do/news/add.json','');
	};
	//点击编辑按钮触发方法
	glacier.website_mgr.news_mgr.news.editNews = function(){
		var row = glacier.website_mgr.news_mgr.news.newsDataGrid.datagrid("getSelected");
		glacier.website_mgr.news_mgr.news.newDialog(' 编辑【'+row.newsName+'】','/do/news/edit.json',row.webNewsId);
	};
	//点击删除按钮触发方法
	glacier.website_mgr.news_mgr.news.delNews = function(){
		var row = glacier.website_mgr.news_mgr.news.newsDataGrid.datagrid("getChecked");
		var webNewsId = row[0].webNewsId;
		if(webNewsId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/news/del.json',
						   data: {webNewsId:webNewsId},
						   dataType:'json',
						   success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.website_mgr.news_mgr.news.newsDataGrid.datagrid('reload');
								}
								 
							}
					});
				}
			});
		}
	};
	//新闻资料模糊查询
	glacier.website_mgr.news_mgr.news.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.website_mgr.news_mgr.news.newsDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有新闻列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="newsGridPanel" data-options="region:'center',border:true" >
		<table id="newsDataGrid">
			<glacierui:toolbar panelEnName="NewsList" toolbarId="newsDataGrid_toolbar" menuEnName="news"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>