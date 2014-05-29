<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script>
   
  $.util.namespace('glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
   
   //定义toolbar的操作，对操作进行控制
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param = {
			toolbarId : 'overdueFineSetDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				audit:{flag:'audit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
  
  
	//初始化客服DataGrid
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid = $('#overdueFineSetDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		//fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/overdueFineSet/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'overdueFineSetId',
		columns:[[
			{
				field:'overdueFineSetId',
				title:'ID',
				checkbox:true
			},{
				field:'overdueFineSetName',
				title:'罚款名称',
				width:140,
				sortable:true
			},{
				field:'memberType',
				title:'有效会员等级',
				width:140,
				sortable:true
			},{
				field:'memberPrivilege',
				title:'VIP会员设定天数',
				width:180,
				sortable:true
			},{
				field:'value',
				title:'取值',
				width:140,
				sortable:true
			},{
				field:'feeWay',
				title:'取费方式',
				width:100,
				sortable:true
			},{
			   field:'auditRemark',
			   title:'审核状态',
			   width:140,
			   sortable:true,
		    },{
				field:'auditState',
				title:'审核状态',
				width:140,
				sortable:true,
			},{
				field:'auditor',
				title:'审核人',
				sortable:true,
				width:100
			},{
				field:'auditDate',
				title:'审核时间',
				sortable:true,
				width:110
			},{
				field:'money',
				title:'金额',
				sortable:true,
				width:140
			},{
				field:'remark',
				title:'备注',
				sortable:true,
				width:140
			},{
				field:'creater',
				title:'创建人',
				sortable:true,
				width:140
			},{
				field:'createTime',
				title:'登入时间',
				sortable:true,
				width:140
			},{
				field:'createTime',
				title:'updater',
				sortable:true,
				width:140
			},{
				field:'updateTime',
				title:'最后修改时间',
				sortable:true,
				width:140
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		padvancesRecordSize : 10,//注意，padvancesRecordSize必须在pbankCardList存在
		padvancesRecordList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#overdueFineSetDataGrid_toolbar',
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.overdueFineSetId+'】逾期管理详细信息',
				href : ctx + '/do/overdueFineSet/intoDetail.htm?overdueFineSetId='+rowData.overdueFineSetId,//从controller请求jsp页面进行渲染
				width : 600,
				height : 280,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		  }
		});
  
</script>


<div class="easyui-layout" data-options="fit:true">
	<div id="overdueFineSetGridPanel" data-options="region:'center',border:true" >
		<table id="overdueFineSetDataGrid">
			<glacierui:toolbar panelEnName="overdueFineSet" toolbarId="overdueFineSetDataGrid_toolbar" menuEnName="overdueFineSet"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>

