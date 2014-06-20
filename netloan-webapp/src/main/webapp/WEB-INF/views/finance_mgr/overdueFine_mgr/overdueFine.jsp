<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script>
   
   $.util.namespace('glacier.finance_mgr.overdueFine_mgr.overdueFine');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
  
  
	//初始化客服DataGrid
	glacier.finance_mgr.overdueFine_mgr.overdueFine.overdueFineDataGrid = $('#overdueFineDataGrid').datagrid({
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
		url: ctx + '/do/overdueFine/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'overdueFineId',
		columns:[[
			{
				field:'overdueFineId',
				title:'记录表ID',
				checkbox:true
			},{
				field:'overdueFineSetDisplay',
				title:'罚款名称',
				width:140,
				sortable:true
			},{
				field:'overdueFineSetName',
				title:'罚款名称',
				width:140,
				sortable:true,
				hidden:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:180,
				sortable:true
			},{
				field:'repayNotesDetailIdDisplay',
				title:'还款明细名称',
				width:140,
				sortable:true
			},{
				field:'overdueFineMoney',
				title:'罚款金额',
				width:100,
				sortable:true
			},{
			   field:'shouldPayDate',
			   title:'应还款日期',
			   width:140,
			   sortable:true,
		    },{
				field:'actualPayDate',
				title:'实还款日期',
				width:140,
				sortable:true,
			},{
				field:'auditState',
				title:'审核状态',
				sortable:true,
				width:100
			},{
				field:'auditor',
				title:'审核人',
				sortable:true,
				width:110
			},{
				field:'auditDate',
				title:'审核时间',
				sortable:true,
				width:140
			},{
				field:'creater',
				title:'创建人',
				sortable:true,
				width:140
			},{
				field:'createTime',
				title:'录入时间',
				sortable:true,
				width:140
			},{
				field:'createTime',
				title:'最后修改人',
				sortable:true,
				width:140
			},{
				field:'updateTime',
				title:'最后修改时间',
				sortable:true,
				width:140
			},{
				field:'remark',
				title:'备注',
				sortable:true,
				width:140
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		padvancesRecordSize : 10,//注意，padvancesRecordSize必须在pbankCardList存在
		padvancesRecordList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.overdueFineSetName+'】逾期罚款记录详细信息',
				href : ctx + '/do/overdueFine/intoDetail.htm?overdueFineId='+rowData.overdueFineId,//从controller请求jsp页面进行渲染
				width : 600,
				height : 400,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		  }
		});
	
	//状态下拉项
	$('#overdueFineSearchForm_status').combobox({
		valueField : 'value',
		//height:18,
		width : 80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.auditState
	});
	
  
</script>


<div class="easyui-layout" data-options="fit:true">
	<div id="overdueFineGridPanel" data-options="region:'center',border:true" >
		<table id="overdueFineDataGrid">
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="overdueFineSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberRealName" style="width: 60px;" class="spinner"/></td>
					<td>罚款名称：</td>
					<td><input name="overdueFineSetDisplay" style="width: 60px;" class="spinner"/></td>
					<td>审核状态：</td>
					<td>
						<input id="overdueFineSearchForm_status" name="auditState" style="width: 80px;" class="spinner"/>
					</td>
					<td>创建时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.finance_mgr.overdueFine_mgr.overdueFine.overdueFineDataGrid.datagrid('load',glacier.serializeObject($('#overdueFineSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#overdueFineSearchForm input').val('');glacier.finance_mgr.overdueFine_mgr.overdueFine.overdueFineDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>

