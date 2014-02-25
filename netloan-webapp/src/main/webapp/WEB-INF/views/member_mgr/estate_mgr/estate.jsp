<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.estate_mgr.estate');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.estate_mgr.estate.param = {
			toolbarId : 'estateDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化会员房产信息DataGrid
	glacier.member_mgr.estate_mgr.estate.estateDataGrid = $('#estateDataGrid').datagrid({
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
		url: ctx + '/do/estate/list.json',
		sortName: 'address',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'estateId',
		columns:[[
			{
				field:'estateId',
				title:'ID',
				checkbox:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'address',
				title:'房产地址',
				width:120,
				sortable:true
			},{
				field:'area',
				title:'建筑面积',
				width:120,
				sortable:true
			},{
				field:'yearBuilt',
				title:'建筑年份',
				width:120,
				sortable:true
			},{
				field:'ageExpenses',
				title:'供款状况',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('mortgage'抵押贷款,'finished'购买完成)
					return renderGridValue(value,fields.ageExpenses);
				}
			},{
				field:'firstOwner',
				title:'所有权人一',
				width:120,
				sortable:true
			},{
				field:'secondOwner',
				title:'所有权人二',
				width:120,
				sortable:true
			},{
				field:'loanPeriod',
				title:'贷款年限',
				width:120,
				sortable:true
			},{
				field:'monthContributions',
				title:'每月供款',
				width:120,
				sortable:true
			},{
				field:'outstandBalances',
				title:'尚欠贷款余额',
				width:120,
				sortable:true
			},{
				field:'mortgageBank',
				title:'按揭银行',
				width:120,
				sortable:true
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pestateSize : 10,//注意，pestateSize必须在pestateList存在
		pestateList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#estateDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.memberRealName+'】房产详细信息',
				href : ctx + '/do/estate/intoDetail.htm?estateId='+rowData.estateId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 330,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
</script>

<!-- 所有会员房产信息列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="estateGridPanel" data-options="region:'center',border:true" >
		<table id="estateDataGrid">
			<glacierui:toolbar panelEnName="EstateList" toolbarId="estateDataGrid_toolbar" menuEnName="estate"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>