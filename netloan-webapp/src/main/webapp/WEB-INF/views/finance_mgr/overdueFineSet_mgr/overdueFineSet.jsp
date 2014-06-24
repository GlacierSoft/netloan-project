<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script>
   
   $.util.namespace('glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
   
   //定义toolbar的操作，对操作进行控制 
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param = {
			toolbarId : 'overdueFineSetDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				audit:{flag:'audit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
  
  
	//初始化客服DataGrid
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid = $('#overdueFineSetDataGrid').datagrid({
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
		url: ctx + '/do/overdueFineSet/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'overdueFineSetId',
		columns:[[
			{
				field:'overdueFineSetId',
				title:'ID',
				checkbox:true
			},{
				field:'overdueFineSetName',
				title:'罚款名称',
				width:140,
				sortable:true
			},{
				field:'memberType',
				title:'有效会员等级',
				width:140,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如general显示普通会员，vip显示VIP会员，all显示全部会员
					return renderGridValue(value,fields.memberType);
				}
			},{
				field:'memberPrivilege',
				title:'是否减少VIP会员设定天数',
				width:190,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如general显示普通会员，vip显示VIP会员，all显示全部会员
					return renderGridValue(value,fields.status);
				}
			},{
				field:'vipDays',
				title:'Vip天数设定',
				width:190,
				sortable:true
			},{
				field:'feeWay',
				title:'取费方式',
				width:100,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如proportion显示比例收费，directcost显示取值收费
					return renderGridValue(value,fields.feeWay);
				}
			},{
				field:'auditState',
				title:'审核状态',
				width:140,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如auditorSucess显示审核成功，auditorFailure显示审核失败
					return renderGridValue(value,fields.auditState);}
			},{
				field:'auditorDisplay',
				title:'审核人',
				sortable:true,
				width:100
			},{
				field:'auditDate',
				title:'审核时间',
				sortable:true,
				width:170,
             },{
				field:'money',
				title:'罚款金额',
				sortable:true,
				width:140
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:140
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:170
			},{
				field:'updaterDisplay',
				title:'最后修改人',
				sortable:true,
				width:140
			},{
				field:'updateTime',
				title:'最后修改时间',
				sortable:true,
				width:170
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
		toolbar:'#overdueFineSetDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: "【"+rowData.overdueFineSetName+"】的逾期垫付设置详细信息",
				href : ctx + '/do/overdueFineSet/intoDetail.htm?overdueFineSetId='+rowData.overdueFineSetId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 375,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		  }
		});
	
  
	//点击增加按钮触发方法
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.addOverdueFineSet = function(){
		glacier.basicAddOrEditDialog({
			title : '【逾期垫付设置】- 增加',
			width : 430,
			height : 320,
			queryUrl : ctx + '/do/overdueFineSet/intoForm.htm',
			submitUrl : ctx + '/do/overdueFineSet/add.json',
			successFun : function (){
				glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid.datagrid('reload');
			}
		});
	};
	
	
	//点击审核按钮触发方法
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.auditOverdueFineSet = function(){
		var row = glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【逾期垫付设置】- 审核('+row.overdueFineSetName+')',
			width : 580,
			height : 450,
			queryUrl : ctx + '/do/overdueFineSet/intoAudit.htm',
			submitUrl : ctx + '/do/overdueFineSet/audit.json',
			queryParams : {
				overdueFineSetId : row.overdueFineSetId
			},
			successFun : function (){
				glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid.datagrid('reload');
			}
		});
	};
	
	
	
	//点击编辑按钮触发方法
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.editOverdueFineSet = function(){
		var row = glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【逾期垫付设置】- 编辑('+row.overdueFineSetName+')',
			width : 430,
			height : 320,
			queryUrl : ctx + '/do/overdueFineSet/intoForm.htm',
			submitUrl : ctx + '/do/overdueFineSet/edit.json',
			queryParams : {
				overdueFineSetId : row.overdueFineSetId
			},
			successFun : function (){
				glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid.datagrid('reload');
			}
		});
	};
	
	
	
	//点击删除按钮触发方法
	glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.delOverdueFineSet = function(){
		var rows = glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid.datagrid("getChecked");
		var overdueFineSetIds = [];//删除的id标识
		for(var i=0;i<rows.length;i++){
			overdueFineSetIds.push(rows[i].overdueFineSetId);
		 }
		if(overdueFineSetIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/overdueFineSet/del.json',
						   data: {overdueFineSetIds:overdueFineSetIds.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.overdueFineSetDataGrid.datagrid('reload');
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


<div class="easyui-layout" data-options="fit:true">
	<div id="overdueFineSetGridPanel" data-options="region:'center',border:true" >
		<table id="overdueFineSetDataGrid">
			<glacierui:toolbar panelEnName="OverdueFineSetList" toolbarId="overdueFineSetDataGrid_toolbar" menuEnName="overdueFineSet"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>

