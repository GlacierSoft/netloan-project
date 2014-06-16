<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.finance_mgr.recharge_mgr.recharge');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.finance_mgr.recharge_mgr.recharge.param = {
			toolbarId : 'rechargeDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
				audit:{flag:'audit',controlType:'single'}
			}
	};
	
	//初始化会员充值记录DataGrid
	glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid = $('#rechargeDataGrid').datagrid({
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
		url: ctx + '/do/recharge/list.json',
		sortName: 'rechargeCode',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'financeRechargeId',
		columns:[[
			{
				field:'financeRechargeId',
				title:'ID',
				checkbox:true
			},{
				field:'rechargeCode',
				title:'充值流水号',
				width:150,
				sortable:true
			},{
				field:'memberDisplay',
				title:'会员名称',
				width:100,
				sortable:true
			},{
				field:'rechargeSetName',
				title:'充值类型',
				width:120,
				sortable:true
			},{
				field:'rechargeReceipt',
				title:'充值回执',
				width:150,
				sortable:true
			},{
				field:'rechargeAmount',
				title:'充值总金额',
				width:120,
				sortable:true
			},{
				field:'handlingCharge',
				title:'手续费',
				width:120,
				sortable:true
			},{
				field:'rechargeRate',
				title:'费率/取值',
				width:120,
				sortable:true
			},{
				field:'arriveMoney',
				title:'到帐金额',
				width:120,
				sortable:true
			},{
				field:'auditState',
				title:'充值状态',
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
				width:120,
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
		prechargeSize : 10,//注意，prechargeSize必须在prechargeList存在
		prechargeList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#rechargeDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.recharge_mgr.recharge.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.recharge_mgr.recharge.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.recharge_mgr.recharge.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.recharge_mgr.recharge.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.recharge_mgr.recharge.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.finance_mgr.recharge_mgr.recharge.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.rechargeCode,
				href : ctx + '/do/recharge/intoDetail.htm?financeRechargeId='+rowData.financeRechargeId,//从controller请求jsp页面进行渲染
				width : 565,
				height : 370,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.finance_mgr.recharge_mgr.recharge.addRecharge = function(){
		glacier.basicAddOrEditDialog({
			title : '增加会员充值记录',
			width : 450,
			height : 330,
			queryUrl : ctx + '/do/recharge/intoForm.htm',
			submitUrl : ctx + '/do/recharge/add.json',
			successFun : function (){
				glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.finance_mgr.recharge_mgr.recharge.editRecharge = function(){
		var row = glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.rechargeName+'】',
			width : 450,
			height : 330,
			queryUrl : ctx + '/do/recharge/intoForm.htm',
			submitUrl : ctx + '/do/recharge/edit.json',
			queryParams : {
				financeRechargeId : row.financeRechargeId
			},
			successFun : function (){
				glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid('reload');
			}
		});
	};
	//点击审核按钮触发方法
	glacier.finance_mgr.recharge_mgr.recharge.auditRecharge = function(){
		var row = glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("authstr" == auditState) {
			glacier.basicAddOrEditDialog({
				title : '审核【'+row.rechargeCode+'】',
				width : 570,
				height : 500,
				queryUrl : ctx + '/do/recharge/intoAudit.htm',
				submitUrl : ctx + '/do/recharge/audit.json',
				queryParams : {
					financeRechargeId : row.financeRechargeId
				},
				successFun : function (){
					glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid('reload');
				}
			});
		} else {
			alert("该记录已经进行了审核，不需要重复操作。");
		}
	};
	//点击删除按钮触发方法
	glacier.finance_mgr.recharge_mgr.recharge.delRecharge = function(){
		var rows = glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid("getChecked");
		var financeRechargeIds = [];//删除的id标识
		var rechargeNames = [];//公告主题
		for(var i=0;i<rows.length;i++){
			financeRechargeIds.push(rows[i].financeRechargeId);
			rechargeNames.push(rows[i].rechargeName);
		}
		if(financeRechargeIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/recharge/del.json',
						   data: {financeRechargeIds:financeRechargeIds.join(','),rechargeNames:rechargeNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid('reload');
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
	//会员充值记录资料模糊查询
	glacier.finance_mgr.recharge_mgr.recharge.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.finance_mgr.recharge_mgr.recharge.rechargeDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有会员充值记录列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="rechargeGridPanel" data-options="region:'center',border:true" >
		<table id="rechargeDataGrid">
			<glacierui:toolbar panelEnName="RechargeList" toolbarId="rechargeDataGrid_toolbar" menuEnName="recharge"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>