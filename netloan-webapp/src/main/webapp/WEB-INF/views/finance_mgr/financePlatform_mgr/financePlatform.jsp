<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.finance_mgr.financePlatform_mgr.financePlatform');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.finance_mgr.financePlatform_mgr.financePlatform.param = {
			toolbarId : 'financePlatformDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
				audit:{flag:'audit',controlType:'single'}
			}
	};
	
	//初始化会员提现记录DataGrid
	glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid = $('#financePlatformDataGrid').datagrid({
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
		url: ctx + '/do/financePlatform/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'financePlatformId',
		columns:[[
			{
				field:'financePlatformId',
				title:'ID',
				checkbox:true
			},{
				field:'platformCode',
				title:'账号代码',
				width:120,
				sortable:true
			},{
				field:'platformName',
				title:'账号名称',
				width:120,
				sortable:true
			},{
				field:'platformAccount',
				title:'账号',
				width:200,
				sortable:true
			},{
				field:'platformMoney',
				title:'余额',
				width:120,
				sortable:true
			},{
				field:'auditState',
				title:'审核状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如'failure'显示审核失败,'pass'显示审核通过,'authstr'显示审核中
					return renderGridValue(value,fields.auditState);
				}
			},{
				field:'auditorDisplay',
				title:'审核人',
				sortable:true,
				width:100
			},{
				field:'auditDate',
				title:'审核时间',
				sortable:true,
				width:100
			},{
				field:'auditRemark',
				title:'审核说明',
				sortable:true,
				width:100
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
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:200
			},{
				field:'remark',
				title:'备注',
				sortable:true,
				width:100
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pfinancePlatformSize : 10,//注意，pfinancePlatformSize必须在pfinancePlatformList存在
		pfinancePlatformList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#financePlatformDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.financePlatform_mgr.financePlatform.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.financePlatform_mgr.financePlatform.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.financePlatform_mgr.financePlatform.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.financePlatform_mgr.financePlatform.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.financePlatform_mgr.financePlatform.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.finance_mgr.financePlatform_mgr.financePlatform.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.platformName+'】的平台资金详细信息',
				href : ctx + '/do/financePlatform/intoDetail.htm?financePlatformId='+rowData.financePlatformId,//从controller请求jsp页面进行渲染
				width : 560,
				height : 345,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.finance_mgr.financePlatform_mgr.financePlatform.addFinancePlatform = function(){
		glacier.basicAddOrEditDialog({
			title : '【平台资金】- 增加',
			width : 400,
			height : 250,
			queryUrl : ctx + '/do/financePlatform/intoForm.htm',
			submitUrl : ctx + '/do/financePlatform/add.json',
			successFun : function (){
				glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.finance_mgr.financePlatform_mgr.financePlatform.editFinancePlatform = function(){
		var row = glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【平台资金】- 编辑('+row.platformName+')',
			width : 400,
			height : 250,
			queryUrl : ctx + '/do/financePlatform/intoForm.htm',
			submitUrl : ctx + '/do/financePlatform/edit.json',
			queryParams : {
				financePlatformId : row.financePlatformId
			},
			successFun : function (){
				glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid('reload');
			}
		});
	};
	//点击审核按钮触发方法
	glacier.finance_mgr.financePlatform_mgr.financePlatform.auditFinancePlatform = function(){
		var row = glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【平台资金】- 审核('+row.platformName+')',
			width : 560,
			height : 430,
			queryUrl : ctx + '/do/financePlatform/intoAudit.htm',
			submitUrl : ctx + '/do/financePlatform/audit.json',
			queryParams : {
				financePlatformId : row.financePlatformId
			},
			successFun : function (){
				glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.finance_mgr.financePlatform_mgr.financePlatform.delFinancePlatform = function(){
		var rows = glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid("getChecked");
		var financePlatformIds = [];//删除的id标识
		var platformNames = [];//会员年龄别称
		for(var i=0;i<rows.length;i++){
			financePlatformIds.push(rows[i].financePlatformId);
			platformNames.push(rows[i].platformName);
		}
		if(financePlatformIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/financePlatform/del.json',
						   data: {financePlatformIds:financePlatformIds.join(','),platformNames:platformNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid('reload');
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
	//会员提现记录资料模糊查询
	glacier.finance_mgr.financePlatform_mgr.financePlatform.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid('load',obj);
	};
	
	//状态下拉项
	$('#bankCardSearchForm_status').combobox({
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

<!-- 所有会员提现记录列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="financePlatformGridPanel" data-options="region:'center',border:true" >
		<table id="financePlatformDataGrid">
			<glacierui:toolbar panelEnName="FinancePlatformList" toolbarId="financePlatformDataGrid_toolbar" menuEnName="financePlatform"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="financePlatformSearchForm">
			<table>
				<tr>
					<td>账号名称：</td>
					<td><input name="platformName" style="width: 60px;" class="spinner"/></td>
					<td>审核状态：</td>
					<td>
						<input id="bankCardSearchForm_status" name="status" style="width: 80px;" class="spinner"/>
					</td>
					<td>创建时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid('load',glacier.serializeObject($('#financePlatformSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#financePlatformSearchForm input').val('');glacier.finance_mgr.financePlatform_mgr.financePlatform.financePlatformDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>