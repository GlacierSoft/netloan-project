<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.integral_mgr.integral');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.integral_mgr.integral.param = {
			toolbarId : 'integralDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化会员积分记录DataGrid
	glacier.member_mgr.integral_mgr.integral.integralDataGrid = $('#integralDataGrid').datagrid({
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
		url: ctx + '/do/memberIntegral/list.json',
		sortName: 'type',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'memberIntegralId',
		columns:[[
			{
				field:'memberIntegralId',
				title:'ID',
				checkbox:true
			},{
				field:'type',
				title:'会员积分记录类型',
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
		pintegralSize : 10,//注意，pintegralSize必须在pintegralList存在
		pintegralList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#integralDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.integral_mgr.integral.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.integral_mgr.integral.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.integral_mgr.integral.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.integral_mgr.integral.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.integral_mgr.integral.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.integral_mgr.integral.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.type,
				href : ctx + '/do/integral/intoDetail.htm?memberIntegralId='+rowData.memberIntegralId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 350,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
</script>

<!-- 所有会员积分记录列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="integralGridPanel" data-options="region:'center',border:true" >
		<table id="integralDataGrid">
			<glacierui:toolbar panelEnName="IntegralList" toolbarId="integralDataGrid_toolbar" menuEnName="integral"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>