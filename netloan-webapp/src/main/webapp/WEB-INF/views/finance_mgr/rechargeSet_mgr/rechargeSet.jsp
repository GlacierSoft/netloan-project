<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.finance_mgr.rechargeSet_mgr.rechargeSet');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.finance_mgr.rechargeSet_mgr.rechargeSet.param = {
			toolbarId : 'rechargeSetDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
				audit:{flag:'audit',controlType:'single'}
			}
	};
	
	//初始化会员充值设置DataGrid
	glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid = $('#rechargeSetDataGrid').datagrid({
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
		url: ctx + '/do/rechargeSet/list.json',
		sortName: 'rechargeSetName',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'financeRechargeSetId',
		columns:[[
			{
				field:'financeRechargeSetId',
				title:'ID',
				checkbox:true
			},{
				field:'rechargeSetName',
				title:'会员充值设置名称',
				width:200,
				sortable:true
			},{
				field:'rechargeType',
				title:'充值类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如offline显示线下充值，onLine显示线上充值
					return renderGridValue(value,fields.rechargeType);
				}
			},{
				field:'rechargeRate',
				title:'费率',
				width:120,
				sortable:true
			},{
				field:'memberType',
				title:'有效会员等级',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如general显示普通会员，vip显示VIP会员，all显示全部会员
					return renderGridValue(value,fields.memberType);
				}
			},{
				field:'value',
				title:'取值',
				width:120,
				sortable:true
			},{
				field:'feeWay',
				title:'取费方式',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如proportion显示比例收费，directcost显示取值收费
					return renderGridValue(value,fields.feeWay);
				}
			},{
				field:'auditState',
				title:'审核状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如auditorSucess显示审核成功，auditorFailure显示审核失败
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
				width:120,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		prechargeSetSize : 10,//注意，prechargeSetSize必须在prechargeSetList存在
		prechargeSetList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#rechargeSetDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.rechargeSet_mgr.rechargeSet.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.rechargeSet_mgr.rechargeSet.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.rechargeSet_mgr.rechargeSet.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.rechargeSet_mgr.rechargeSet.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.rechargeSet_mgr.rechargeSet.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.finance_mgr.rechargeSet_mgr.rechargeSet.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.rechargeSetName,
				href : ctx + '/do/rechargeSet/intoDetail.htm?financeRechargeSetId='+rowData.financeRechargeSetId,//从controller请求jsp页面进行渲染
				width : 550,
				height : 340,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.finance_mgr.rechargeSet_mgr.rechargeSet.addRechargeSet = function(){
		glacier.basicAddOrEditDialog({
			title : '增加会员充值设置',
			width : 450,
			height : 360,
			queryUrl : ctx + '/do/rechargeSet/intoForm.htm',
			submitUrl : ctx + '/do/rechargeSet/add.json',
			successFun : function (){
				glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.finance_mgr.rechargeSet_mgr.rechargeSet.editRechargeSet = function(){
		var row = glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.rechargeSetName+'】',
			width : 450,
			height : 360,
			queryUrl : ctx + '/do/rechargeSet/intoForm.htm',
			submitUrl : ctx + '/do/rechargeSet/edit.json',
			queryParams : {
				financeRechargeSetId : row.financeRechargeSetId
			},
			successFun : function (){
				glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid('reload');
			}
		});
	};
	//点击审核按钮触发方法
	glacier.finance_mgr.rechargeSet_mgr.rechargeSet.auditRechargeSet = function(){
		var row = glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '审核【'+row.rechargeSetName+'】',
			width : 560,
			height : 460,
			queryUrl : ctx + '/do/rechargeSet/intoAudit.htm',
			submitUrl : ctx + '/do/rechargeSet/audit.json',
			queryParams : {
				financeRechargeSetId : row.financeRechargeSetId
			},
			successFun : function (){
				glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.finance_mgr.rechargeSet_mgr.rechargeSet.delRechargeSet = function(){
		var rows = glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid("getChecked");
		var financeRechargeSetIds = [];//删除的id标识
		var rechargeSetNames = [];//公告主题
		for(var i=0;i<rows.length;i++){
			financeRechargeSetIds.push(rows[i].financeRechargeSetId);
			rechargeSetNames.push(rows[i].rechargeSetName);
		}
		if(financeRechargeSetIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/rechargeSet/del.json',
						   data: {financeRechargeSetIds:financeRechargeSetIds.join(','),rechargeSetNames:rechargeSetNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid('reload');
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
	//会员充值设置资料模糊查询
	glacier.finance_mgr.rechargeSet_mgr.rechargeSet.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.finance_mgr.rechargeSet_mgr.rechargeSet.rechargeSetDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有会员充值设置列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="rechargeSetGridPanel" data-options="region:'center',border:true" >
		<table id="rechargeSetDataGrid">
			<glacierui:toolbar panelEnName="RechargeSetList" toolbarId="rechargeSetDataGrid_toolbar" menuEnName="rechargeSet"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>