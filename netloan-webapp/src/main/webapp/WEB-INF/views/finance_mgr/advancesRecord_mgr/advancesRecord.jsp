<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>


<script>
   
  $.util.namespace('glacier.finance_mgr.advancesRecord_mgr.advancesRecord');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
   
   //定义toolbar的操作，对操作进行控制 
	glacier.finance_mgr.advancesRecord_mgr.advancesRecord.param = {
			toolbarId : 'advancesRecordDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				audit:{flag:'audit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
  
  
	//初始化客服DataGrid
	glacier.finance_mgr.advancesRecord_mgr.advancesRecord.advancesRecordDataGrid = $('#advancesRecordDataGrid').datagrid({
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
		url: ctx + '/do/advancesRecord/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'advancesRecordId',
		columns:[[
			{
				field:'advancesRecordId',
				title:'ID',
				checkbox:true
			},{
				field:'overdueAdvancesId',
				title:'逾期垫付管理ID',
				width:140,
				sortable:true
			},{
				field:'platformTransactionId',
				title:'平台交易明细ID',
				width:140,
				sortable:true
			},{
				field:'memberId',
				title:'会员ID',
				width:90,
				sortable:true
			},{
				field:'repayNotesDetailId',
				title:'还款记录明细ID',
				width:140,
				sortable:true
			},{
				field:'memberType',
				title:'会员等级',
				width:100,
				sortable:true
			},{
				field:'advancesPercent',
				title:'逾期终付百分比',
				width:140,
				sortable:true,
			},{
				field:'advancesMoney',
				title:'垫付金额',
				sortable:true,
				width:100
			},{
				field:'auditState',
				title:'审核状态',
				sortable:true,
				width:110
			},{
				field:'auditor',
				title:'审核人',
				sortable:true,
				width:90
			},{
				field:'auditDate',
				title:'审核时间',
				sortable:true,
				width:140
			},{
				field:'creater',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'录入时间',
				sortable:true,
				width:140
			},{
				field:'updater',
				title:'最后修改人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'最后修改时间',
				sortable:true,
				width:140
			},{
				field:'remark',
				title:'备注',
				sortable:true,
				width:100
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		padvancesRecordSize : 10,//注意，padvancesRecordSize必须在pbankCardList存在
		padvancesRecordList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#advancesRecordDataGrid_toolbar',
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.advancesRecordId+'】逾期垫付详细信息',
				href : ctx + '/do/advancesRecord/intoDetail.htm?advancesRecordId='+rowData.advancesRecordId,//从controller请求jsp页面进行渲染
				width : 600,
				height : 330,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		  }
		});
  

</script>

<div class="easyui-layout" data-options="fit:true">
	<div id="advancesRecordGridPanel" data-options="region:'center',border:true" >
		<table id="advancesRecordDataGrid">
			<glacierui:toolbar panelEnName="advancesRecord" toolbarId="advancesRecordDataGrid_toolbar" menuEnName="advancesRecord"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>