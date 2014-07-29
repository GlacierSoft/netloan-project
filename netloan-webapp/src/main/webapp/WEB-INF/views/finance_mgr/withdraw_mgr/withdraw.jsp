<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.finance_mgr.withdraw_mgr.withdraw');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.finance_mgr.withdraw_mgr.withdraw.param = {
			toolbarId : 'withdrawDataGrid_toolbar',
			actions : {
				audit:{flag:'audit',controlType:'single'}
			}
	};
	
	//初始化会员提现记录DataGrid
	glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid = $('#withdrawDataGrid').datagrid({
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
		url: ctx + '/do/withdraw/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'financeWithdrawId',
		columns:[[
			{
				field:'financeWithdrawId',
				title:'ID',
				checkbox:true
			},{
				field:'withdrawCode',
				title:'提现流水号',
				width:150,
				sortable:true
			},{
				field:'memberDisplay',
				title:'会员名称',
				width:150,
				sortable:true
			},{
				field:'openingBank',
				title:'提现银行',
				width:120,
				sortable:true
			},{
				field:'subbranch',
				title:'提现支行',
				width:120,
				sortable:true
			},{
				field:'cardName',
				title:'提现银行卡姓名',
				width:120,
				sortable:true
			},{
				field:'cardNumber',
				title:'提现银行卡号',
				width:120,
				sortable:true
			},{
				field:'withdrawAmount',
				title:'提现总金额(元)',
				width:120,
				sortable:true
			},{
				field:'handlingCharge',
				title:'手续费(元)',
				width:120,
				sortable:true
			},{
				field:'withdrawRate',
				title:'提现利率',
				width:120,
				sortable:true
			},{
				field:'arriveMoney',
				title:'到帐金额(元)',
				width:120,
				sortable:true
			},{
				field:'auditState',
				title:'提现状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如'failure'显示审核失败,'pass'显示审核通过,'authstr'显示审核中
					return renderGridValue(value,fields.auditState);
				}
			},{
				field:'auditorDisplay',
				title:'审核人',
				width:120,
				sortable:true
			},{
				field:'auditDate',
				title:'审核时间',
				width:150,
				sortable:true
			},{
				field:'auditRemark',
				title:'审核说明',
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
		pwithdrawSize : 10,//注意，pwithdrawSize必须在pwithdrawList存在
		pwithdrawList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#withdrawDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.withdraw_mgr.withdraw.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.withdraw_mgr.withdraw.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.withdraw_mgr.withdraw.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.withdraw_mgr.withdraw.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.withdraw_mgr.withdraw.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.finance_mgr.withdraw_mgr.withdraw.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}ss
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: "【"+rowData.withdrawCode+"】的提现记录详细信息",
				href : ctx + '/do/withdraw/intoDetail.htm?financeWithdrawId='+rowData.financeWithdrawId,//从controller请求jsp页面进行渲染
				width : 580,
				height : 425,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.finance_mgr.withdraw_mgr.withdraw.addWithdraw = function(){
		glacier.basicAddOrEditDialog({
			title : '【提现记录】- 增加',
			width : 450,
			height : 330,
			queryUrl : ctx + '/do/withdraw/intoForm.htm',
			submitUrl : ctx + '/do/withdraw/add.json',
			successFun : function (){
				glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.finance_mgr.withdraw_mgr.withdraw.editWithdraw = function(){
		var row = glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【提现记录】- 编辑('+row.withdrawName+')',
			width : 450,
			height : 330,
			queryUrl : ctx + '/do/withdraw/intoForm.htm',
			submitUrl : ctx + '/do/withdraw/edit.json',
			queryParams : {
				financeWithdrawId : row.financeWithdrawId
			},
			successFun : function (){
				glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid('reload');
			}
		});
	};
	//点击审核按钮触发方法
	glacier.finance_mgr.withdraw_mgr.withdraw.auditWithdraw = function(){
		var row = glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("authstr" == auditState) {
			glacier.basicAddOrEditDialog({
				title : '【提现记录】- 审核('+row.withdrawCode+')',
				width : 580,
				height : 500,
				queryUrl : ctx + '/do/withdraw/intoAudit.htm',
				submitUrl : ctx + '/do/withdraw/audit.json',
				queryParams : {
					financeWithdrawId : row.financeWithdrawId
				},
				successFun : function (){
					glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid('reload');
				}
			});
		} else {
			alert("该记录已经进行了审核，不需要重复操作。");
		}
	};
	//点击删除按钮触发方法
	glacier.finance_mgr.withdraw_mgr.withdraw.delWithdraw = function(){
		var rows = glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid("getChecked");
		var financeWithdrawIds = [];//删除的id标识
		var withdrawNames = [];//公告主题
		for(var i=0;i<rows.length;i++){
			financeWithdrawIds.push(rows[i].financeWithdrawId);
			withdrawNames.push(rows[i].withdrawName);
		}
		if(financeWithdrawIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/withdraw/del.json',
						   data: {financeWithdrawIds:financeWithdrawIds.join(','),withdrawNames:withdrawNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid('reload');
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
	glacier.finance_mgr.withdraw_mgr.withdraw.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid('load',obj);
	};
	
	//状态下拉项
	$('#withdrawSearchForm_status').combobox({
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
	<div id="withdrawGridPanel" data-options="region:'center',border:true" >
		<table id="withdrawDataGrid">
			<glacierui:toolbar panelEnName="WithdrawList" toolbarId="withdrawDataGrid_toolbar" menuEnName="withdraw"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="withdrawSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberDisplay" style="width: 60px;" class="spinner"/></td>
					<td>提现银行：</td>
					<td><input name="openingBank" style="width: 60px;" class="spinner"/></td>
					<td>提现支行：</td>
					<td><input name="subbranch" style="width: 60px;" class="spinner"/></td>
					<td>审核状态：</td>
					<td>
						<input id="withdrawSearchForm_status" name="auditState" style="width: 80px;" class="spinner"/>
					</td>
					<td>创建时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid('load',glacier.serializeObject($('#withdrawSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#withdrawSearchForm input').val('');glacier.finance_mgr.withdraw_mgr.withdraw.withdrawDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>