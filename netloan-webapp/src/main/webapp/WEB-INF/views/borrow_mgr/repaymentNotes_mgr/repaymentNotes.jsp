<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.param = {
			toolbarId : 'RepaymentNotesDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid = $('#RepaymentNotesDataGrid').datagrid({
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
		url: ctx + '/do/repaymentNotes/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'repayNotesId',
		columns:[[
			{
				field:'repayNotesId',
				title:'ID',
				checkbox:true
			},{
				field:'loanTitle',
				title:'借款标题',
				width:200,
				sortable:true
			},{
				field:'memberDisplay',
				title:'还款人',
				width:200,
				sortable:true
			},{
				field:'repaymentTotal',
				title:'还款总金额',
				width:200,
				sortable:true
			},{
				field:'shouldPayMoney',
				title:'应还本息',
				width:200,
				sortable:true
			},{
				field:'alrPayMoney',
				title:'已还本息',
				width:200,
				sortable:true
			},{
				field:'notPayMoney',
				title:'未还本息',
				width:200,
				sortable:true
			},{
				field:'alrOverdueInterest',
				title:'已还逾期罚息',
				width:200,
				sortable:true
			},{
				field:'alrOverdueUrge',
				title:'已还逾期催收费',
				width:200,
				sortable:true
			},{
				field:'alrOverdueMana',
				title:'已还逾期管理费',
				width:200,
				sortable:true
			},{
				field:'repayState',
				title:'还款状态',
				width:200,
				sortable:true,
				formatter: function(value,row,index){//借款状态字段的数据格式化
					return renderGridValue(value,fields.repayState);
				}
			},{
				field:'remark',
				title:'备注',
				sortable:true,
				width:120
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
		pRepaymentNotesSize : 10,//注意，pRepaymentNotesSize必须在pRepaymentNotesList存在
		pRepaymentNotesList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#RepaymentNotesDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.loanTitle,
				href : ctx + '/do/repaymentNotes/intoDetail.htm?repayNotesId='+rowData.repayNotesId,//从controller请求jsp页面进行渲染
				width : 720,
				height : 300,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击增加按钮触发方法
	glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.addRepaymentNotes = function(){
		glacier.basicAddOrEditDialog({
			title : '增加帮助信息',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/repaymentNotes/intoForm.htm',
			submitUrl : ctx + '/do/repaymentNotes/add.json',
			successFun : function (){
				glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.editRepaymentNotes = function(){
		var row = glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.loanTitle+'】',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/repaymentNotes/intoForm.htm',
			submitUrl : ctx + '/do/repaymentNotes/edit.json',
			queryParams : {
				repayNotesId : row.repayNotesId
			},
			successFun : function (){
				glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.delRepaymentNotes = function(){
		var rows = glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid.datagrid("getChecked");
		var repayNotesIds = [];//删除的id标识
		var loanTitles = [];//客服主题
		for(var i=0;i<rows.length;i++){
			repayNotesIds.push(rows[i].repayNotesId);
			loanTitles.push(rows[i].loanTitle);
		}
		if(repayNotesIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/repaymentNotes/del.json',
						   data: {repayNotesIds:repayNotesIds.join(','),repaymentNotesTitle:loanTitles.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid.datagrid('reload');
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
	$('#repaymentNotesSearchForm_repayState').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.repayState
	});
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="RepaymentNotesGridPanel" data-options="region:'center',border:true" >
		<table id="RepaymentNotesDataGrid">
			<glacierui:toolbar panelEnName="RepaymentNotesList" toolbarId="RepaymentNotesDataGrid_toolbar" menuEnName="RepaymentNotes"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="repaymentNotesSearchForm">
			<table>
				<tr>
					<td>还款人：</td>
					<td><input id="repaymentNotesSearchForm_memberDisplay" name="memberDisplay" style="width: 80px;" class="spinner"/></td>
					<td>还款状态：</td>
					<td><input id="repaymentNotesSearchForm_repayState" name="repayState" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid.datagrid('load',glacier.serializeObject($('#repaymentNotesSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#repaymentNotesSearchForm input').val('');glacier.borrow_mgr.repaymentNotes_mgr.repaymentNotes.RepaymentNotesDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>