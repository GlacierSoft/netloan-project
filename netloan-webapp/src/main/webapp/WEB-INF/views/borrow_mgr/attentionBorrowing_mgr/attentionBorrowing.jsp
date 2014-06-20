<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.param = {
			toolbarId : 'AttentionBorrowingDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid = $('#AttentionBorrowingDataGrid').datagrid({
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
		url: ctx + '/do/attentionBorrowing/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'attentionBorrowingId',
		columns:[[
			{
				field:'attentionBorrowingId',
				title:'ID',
				checkbox:true
			},{
				field:'loanTitle',
				title:'借款标题',
				width:200,
				sortable:true
			},{
				field:'memberDisplay',
				title:'关注人名称',
				width:200,
				sortable:true
			},{
				field:'loanMemberDisplay',
				title:'借款人名称',
				width:200,
				sortable:true
			},{
				field:'loanTenderDisplay',
				title:'标的类型名称',
				width:200,
				sortable:true
			},{
				field:'repaymentTypeDisplay',
				title:'还款方式',
				width:200,
				sortable:true
			},{
				field:'loanTotal',
				title:'借款金额',
				width:200,
				sortable:true
			},{
				field:'loanApr',
				title:'年利率',
				width:200,
				sortable:true
			},{
				field:'loanDeadlinesId',
				title:'借款期限',
				width:200,
				sortable:true
			},{
				field:'loanDate',
				title:'借款时间',
				width:200,
				sortable:true
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
		pAttentionBorrowingSize : 10,//注意，pAttentionBorrowingSize必须在pAttentionBorrowingList存在
		pAttentionBorrowingList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#AttentionBorrowingDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.loanTitle,
				href : ctx + '/do/attentionBorrowing/intoDetail.htm?attentionBorrowingId='+rowData.attentionBorrowingId,//从controller请求jsp页面进行渲染
				width : 560,
				height : 300,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击增加按钮触发方法
	glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.addAttentionBorrowing = function(){
		glacier.basicAddOrEditDialog({
			title : '增加帮助信息',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/attentionBorrowing/intoForm.htm',
			submitUrl : ctx + '/do/attentionBorrowing/add.json',
			successFun : function (){
				glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.editAttentionBorrowing = function(){
		var row = glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.loanTitle+'】',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/attentionBorrowing/intoForm.htm',
			submitUrl : ctx + '/do/attentionBorrowing/edit.json',
			queryParams : {
				attentionBorrowingId : row.attentionBorrowingId
			},
			successFun : function (){
				glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.delAttentionBorrowing = function(){
		var rows = glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid.datagrid("getChecked");
		var attentionBorrowingIds = [];//删除的id标识
		var loanTitles = [];//客服主题
		for(var i=0;i<rows.length;i++){
			attentionBorrowingIds.push(rows[i].attentionBorrowingId);
			loanTitles.push(rows[i].loanTitle);
		}
		if(attentionBorrowingIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/attentionBorrowing/del.json',
						   data: {attentionBorrowingId:attentionBorrowingIds.join(','),attentionBorrowingTitle:loanTitles.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid.datagrid('reload');
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
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="AttentionBorrowingGridPanel" data-options="region:'center',border:true" >
		<table id="AttentionBorrowingDataGrid">
		 </table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="attentionBorrowingSearchForm">
			<table>
				<tr>
					<td>借款标题：</td>
					<td><input id="attentionBorrowingSearchForm_loanTitle" name="loanTitle" style="width: 80px;" class="spinner"/></td>
					<td>关注人：</td>
					<td><input id="attentionBorrowingSearchForm_loanMemberDisplay" name="loanMemberDisplay" style="width: 80px;" class="spinner"/></td>
					<td>借款人：</td>
					<td><input id="attentionBorrowingSearchForm_memberDisplay" name="memberDisplay" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid.datagrid('load',glacier.serializeObject($('#attentionBorrowingSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#attentionBorrowingSearchForm input').val('');glacier.borrow_mgr.attentionBorrowing_mgr.attentionBorrowing.AttentionBorrowingDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>