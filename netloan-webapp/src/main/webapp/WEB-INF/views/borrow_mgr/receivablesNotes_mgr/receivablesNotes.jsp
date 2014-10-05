<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.param = {
			toolbarId : 'ReceivablesNotesDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid = $('#ReceivablesNotesDataGrid').datagrid({
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
		url: ctx + '/do/receivablesNotes/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序收是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'receNotesId',
		columns:[[
			{
				field:'receNotesId',
				title:'ID',
				checkbox:true
			},{
				field:'memberDisplay',
				title:'收款人',
				width:200,
				sortable:true
			},{
				field:'loanTitle',
				title:'借款标题',
				width:200,
				sortable:true
			},{
				field:'loanMemberDisplay',
				title:'还款人',
				width:200,
				sortable:true
			},{
				field:'receivablesTotal',
				title:'收款总金额',
				width:200,
				sortable:true
			},
			//新增字段
			{   field:'shouldRecePrincipal',
				title:'应收本金',
				width:200,
				sortable:true
			},
			{   field:'alrRecePrincipal',
				title:'已收本金',
				width:200,
				sortable:true
			},{   
				field:'notRecePrincipal',
				title:'未收本金',
				width:200,
				sortable:true
			},{   
				field:'shouldReceInterest',
				title:'应收利息',
				width:200,
				sortable:true
			},{   
				field:'alrReceInterest',
				title:'已收利息',
				width:200,
				sortable:true
			},{   
				field:'notReceInterest',
				title:'未收利息',
				width:200,
				sortable:true
			}, {
				field:'shouldReceMoney',
				title:'应收本息',
				width:200,
				sortable:true
			},{
				field:'alrReceMoney',
				title:'已收本息',
				width:200,
				sortable:true
			},{
				field:'notReceMoney',
				title:'未收本息',
				width:200,
				sortable:true
			},
			{
				field:'alrOverdueInterest',
				title:'已收逾期罚息',
				width:200,
				sortable:true
			},{
				field:'receState',
				title:'收款状态',
				width:200,
				sortable:true,
				formatter: function(value,row,index){//借款状态字段的数据格式化
					return renderGridValue(value,fields.receState);
				}
			},{
				field:'interestManaFee',
				title:'已收利息管理费',
				width:200,
				sortable:true
			},{
				field:'income',
				title:'已收收益',
				width:200,
				sortable:true
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
		pReceivablesNotesSize : 10,//注意，pReceivablesNotesSize必须在pReceivablesNotesList存在
		pReceivablesNotesList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#ReceivablesNotesDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.loanTitle+'】收款详细信息',
				href : ctx + '/do/receivablesNotes/intoDetail.htm?receNotesId='+rowData.receNotesId,//从controller请求jsp页面进行渲染
				width : 620,
				height : 410,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击增加按钮触发方法
	glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.addReceivablesNotes = function(){
		glacier.basicAddOrEditDialog({
			title : '增加帮助信息',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/receivablesNotes/intoForm.htm',
			submitUrl : ctx + '/do/receivablesNotes/add.json',
			successFun : function (){
				glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.editReceivablesNotes = function(){
		var row = glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.loanTitle+'】',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/receivablesNotes/intoForm.htm',
			submitUrl : ctx + '/do/receivablesNotes/edit.json',
			queryParams : {
				receNotesId : row.receNotesId
			},
			successFun : function (){
				glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.delReceivablesNotes = function(){
		var rows = glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid.datagrid("getChecked");
		var receNotesIds = [];//删除的id标识
		var loanTitles = [];//客服主题
		for(var i=0;i<rows.length;i++){
			receNotesIds.push(rows[i].receNotesId);
			loanTitles.push(rows[i].loanTitle);
		}
		if(receNotesIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/receivablesNotes/del.json',
						   data: {receNotesIds:receNotesIds.join(','),receivablesNotesTitle:loanTitles.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid.datagrid('reload');
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
	$('#receivablesNotesSearchForm_receState').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		data : fields.receState
	});
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="ReceivablesNotesGridPanel" data-options="region:'center',border:true" >
		<table id="ReceivablesNotesDataGrid">
		 </table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="receivablesNotesSearchForm">
			<table>
				<tr>
					<td>收款人：</td>
					<td><input id="receivablesNotesSearchForm_memberDisplay" name="memberDisplay" style="width: 80px;" class="spinner"/></td>
					<td>收款状态：</td>
					<td><input id="receivablesNotesSearchForm_receState" name="receState" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid.datagrid('load',glacier.serializeObject($('#receivablesNotesSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#receivablesNotesSearchForm input').val('');glacier.borrow_mgr.receivablesNotes_mgr.receivablesNotes.ReceivablesNotesDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>