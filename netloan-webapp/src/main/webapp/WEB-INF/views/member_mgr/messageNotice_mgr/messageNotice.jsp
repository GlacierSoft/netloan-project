<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.messageNotice_mgr.messageNotice');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.messageNotice_mgr.messageNotice.param = {
			toolbarId : 'messageNoticeDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.member_mgr.messageNotice_mgr.messageNotice.messageNoticeDataGrid = $('#messageNoticeDataGrid').datagrid({
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
		url: ctx + '/do/messageNotice/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'messageNoticeId',
		columns:[[
			{
				field:'messageNoticeId',
				title:'ID',
				checkbox:true
			},{
				field:'senderDisplay',
				title:'发信人',
				width:120,
				sortable:true
			},{
				field:'addresseeDisplay',
				title:'收信人',
				width:120,
				sortable:true
			},{
				field:'title',
				title:'标题',
				width:120,
				sortable:true
			},{
				field:'letterstatus',
				title:'信件状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.letterstatus);
				}
			},{
				field:'sendtime',
				title:'发送时间',
				width:120,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pmessageNoticeSize : 10,//注意，pmessageNoticeSize必须在pmessageNoticeList存在
		pmessageNoticeList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#messageNoticeDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.messageNotice_mgr.messageNotice.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.messageNotice_mgr.messageNotice.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.messageNotice_mgr.messageNotice.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.messageNotice_mgr.messageNotice.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.messageNotice_mgr.messageNotice.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.messageNotice_mgr.messageNotice.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.title,
				href : ctx + '/do/messageNotice/intoDetail.htm?messageNoticeId='+rowData.messageNoticeId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 320,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击增加按钮触发方法
	glacier.member_mgr.messageNotice_mgr.messageNotice.addMessageNotice = function(){
		glacier.basicAddOrEditDialog({
			title : '增加信息通知',
			width : 400,
			height : 300,
			queryUrl : ctx + '/do/messageNotice/intoForm.htm',
			submitUrl : ctx + '/do/messageNotice/add.json',
			successFun : function (){
				glacier.member_mgr.messageNotice_mgr.messageNotice.messageNoticeDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.member_mgr.messageNotice_mgr.messageNotice.editMessageNotice = function(){
		var row = glacier.member_mgr.messageNotice_mgr.messageNotice.messageNoticeDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.title+'】',
			width : 400,
			height : 300,
			queryUrl : ctx + '/do/messageNotice/intoForm.htm',
			submitUrl : ctx + '/do/messageNotice/edit.json',
			queryParams : {
				messageNoticeId : row.messageNoticeId
			},
			successFun : function (){
				glacier.member_mgr.messageNotice_mgr.messageNotice.messageNoticeDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.member_mgr.messageNotice_mgr.messageNotice.delMessageNotice = function(){
		var rows = glacier.member_mgr.messageNotice_mgr.messageNotice.messageNoticeDataGrid.datagrid("getChecked");
		var messageNoticeIds = [];//删除的id标识
		var titles = [];//客服主题
		for(var i=0;i<rows.length;i++){
			messageNoticeIds.push(rows[i].messageNoticeId);
			titles.push(rows[i].title);
		}
		if(messageNoticeIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/messageNotice/del.json',
						   data: {messageNoticeIds:messageNoticeIds.join(','),titles:titles.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.member_mgr.messageNotice_mgr.messageNotice.messageNoticeDataGrid.datagrid('reload');
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
	//客服资料模糊查询
	glacier.member_mgr.messageNotice_mgr.messageNotice.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.member_mgr.messageNotice_mgr.messageNotice.messageNoticeDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="messageNoticeGridPanel" data-options="region:'center',border:true" >
		<table id="messageNoticeDataGrid">
			<glacierui:toolbar panelEnName="MessageNoticeList" toolbarId="messageNoticeDataGrid_toolbar" menuEnName="messageNotice"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>