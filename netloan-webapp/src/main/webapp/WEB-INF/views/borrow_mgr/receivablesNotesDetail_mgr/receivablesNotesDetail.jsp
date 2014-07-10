<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.param = {
			toolbarId : 'ReceivablesNotesDetailDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid = $('#ReceivablesNotesDetailDataGrid').datagrid({
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
		url: ctx + '/do/receivablesNotesDetail/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'receNotesDetailId',
		columns:[[
			{
				field:'receNotesDetailId',
				title:'ID',
				checkbox:true
			},{
				field:'loanTitle',
				title:'收款标题',
				width:200,
				sortable:true
			},{
				field:'loanMemberDisplay',
				title:'还款人',
				width:200,
				sortable:true  
			},{
				field:'numberPeriod',
				title:'第几期',
				width:200,
				sortable:true
			},{
				field:'shouldReceDate',
				title:'应收日期',
				width:200,
				sortable:true
			},{
				field:'actualReceDate',
				title:'实收日期',
				width:200,
				sortable:true
			},{
				field:'currentReceMoeny',
				title:'应收本息',
				width:200,
				sortable:true
			},{
				field:'currentRecePrincipal',
				title:'应收本金',
				width:200,
				sortable:true
			},{
				field:'currentReceInterest',
				title:'应收利息',
				width:200,
				sortable:true
			},{
				field:'surplusPrincipal',
				title:'剩余本金',
				width:200,
				sortable:true
			},{
				field:'interestManaFee',
				title:'利息管理费',
				width:200,
				sortable:true
			},{
				field:'isOverdue',
				title:'是否逾期',
				width:200,
				sortable:true,
				formatter: function(value,row,index){//借款状态字段的数据格式化
					return renderGridValue(value,fields.isOverdue);
				}
			},{
				field:'overdueInterest',
				title:'逾期罚息',
				width:200,
				sortable:true
			},{
				field:'overdueDays',
				title:'逾期天数',
				width:200,
				sortable:true
			},{
				field:'income',
				title:'收益',
				width:200,
				sortable:true
			},{
				field:'amount',
				title:'总收款金额',
				width:200,
				sortable:true
			},{
				field:'receState',
				title:'收款状态',
				width:200,
				sortable:true,
				formatter: function(value,row,index){//借款状态字段的数据格式化
					return renderGridValue(value,fields.receDetailState);
				}
			},{
				field:'remark',
				title:'备注',
				width:200,
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
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pReceivablesNotesDetailSize : 10,//注意，pReceivablesNotesDetailSize必须在pReceivablesNotesDetailList存在
		pReceivablesNotesDetailList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#ReceivablesNotesDetailDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.loanTitle+"】收款纪录明细信息",
				href : ctx + '/do/receivablesNotesDetail/intoDetail.htm?receNotesDetailId='+rowData.receNotesDetailId,//从controller请求jsp页面进行渲染
				width : 590,
				height : 420,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击增加按钮触发方法
	glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.addReceivablesNotesDetail = function(){
		glacier.basicAddOrEditDialog({
			title : '增加帮助信息',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/receivablesNotesDetail/intoForm.htm',
			submitUrl : ctx + '/do/receivablesNotesDetail/add.json',
			successFun : function (){
				glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.editReceivablesNotesDetail = function(){
		var row = glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.loanTitle+'】',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/receivablesNotesDetail/intoForm.htm',
			submitUrl : ctx + '/do/receivablesNotesDetail/edit.json',
			queryParams : {
				receNotesDetailId : row.receNotesDetailId
			},
			successFun : function (){
				glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.delReceivablesNotesDetail = function(){
		var rows = glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid.datagrid("getChecked");
		var receNotesDetailIds = [];//删除的id标识
		var loanTitles = [];//客服主题
		for(var i=0;i<rows.length;i++){
			receNotesDetailIds.push(rows[i].receNotesDetailId);
			loanTitles.push(rows[i].loanTitle);
		}
		if(receNotesDetailIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/receivablesNotesDetail/del.json',
						   data: {receNotesDetailIds:receNotesDetailIds.join(','),receivablesNotesDetailTitle:loanTitles.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid.datagrid('reload');
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
	//借款状态下拉项的值
	$('#receivablesNotesDetailSearchForm_receState').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.receDetailState
	});
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="ReceivablesNotesDetailGridPanel" data-options="region:'center',border:true" >
		<table id="ReceivablesNotesDetailDataGrid">
	 </table>
	</div>
		<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="receivablesNotesDetailSearchForm">
			<table>
				<tr>
					<td>还款人：</td>
					<td><input id="receivablesNotesDetailSearchForm_memberDisplay" name="memberDisplay" style="width: 80px;" class="spinner"/></td>
					<td>第几期：</td>
					<td><input id="receivablesNotesDetailSearchForm_numberPeriod" name="numberPeriod" style="width: 80px;" class="spinner"/></td>
					<td>还款状态：</td>
					<td><input id="receivablesNotesDetailSearchForm_receState" name="receState" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid.datagrid('load',glacier.serializeObject($('#receivablesNotesDetailSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#receivablesNotesDetailSearchForm input').val('');glacier.borrow_mgr.receivablesNotesDetail_mgr.receivablesNotesDetail.ReceivablesNotesDetailDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>