<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.loanTender_mgr.loanTender');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.loanTender_mgr.loanTender.param = {
			toolbarId : 'loanTenderDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化借款DataGrid
	glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid = $('#loanTenderDataGrid').datagrid({
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
		url: ctx + '/do/loanTender/list.json',
		sortName: 'loanrTenderName',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'loanId',
		columns:[[
			{
				field:'loanTenderId',
				title:'ID',
				checkbox:true
			},{
				field:'loanrTenderName',
				title:'标种类型名称',
				width:120,
				sortable:true
			},{
				field:'description',
				title:'描述',
				width:120,
				sortable:true
			},{
				field:'state',
				title:'状态',
				width:120,
				sortable:true
			},{
				field:'lowestLoanAmount',
				title:'最小借款额度',
				width:120,
				sortable:true
			},{
				field:'largestLoanAmount',
				title:'最大借款额度',
				width:120,
				sortable:true
			},{
				field:'loanMoneyMultiple',
				title:'借款金额倍数',
				width:120,
				sortable:true
			},{
				field:'lowestApr',
				title:'最小年利率',
				width:120,
				sortable:true
			},{
				field:'largestApr',
				title:'最大年利率',
				width:120,
				sortable:true
			},{
				field:'loanDeadlinesMon',
				title:'借款期限(月标)',
				width:120,
				sortable:true
			},{
				field:'loanDeadlinesDay',
				title:'借款期限(天标)',
				width:120,
				sortable:true
			},{
				field:'waitBidDeadlines',
				title:'有效期',
				width:120,
				sortable:true
			},{
				field:'lowestBidMoney',
				title:'最低投标金额',
				width:120,
				sortable:true
			},{
				field:'largestBidMoney',
				title:'最高投标金额',
				width:120,
				sortable:true
			},{
				field:'isBidReward',
				title:'是否有投标奖励',
				width:120,
				sortable:true
			},{
				field:'isBidPwd',
				title:'是否设置投标密码',
				width:120,
				sortable:true
			},{
				field:'lowestRewardPro',
				title:'最低奖励比例',
				width:120,
				sortable:true
			},{
				field:'largestRewardPro',
				title:'最高奖励比例',
				width:120,
				sortable:true
			},{
				field:'lowestRewardMoney',
				title:'最低奖励金额',
				width:120,
				sortable:true
			},{
				field:'largestRewardMoney',
				title:'最高奖励金额',
				width:120,
				sortable:true
			},{
				field:'vipFreezeBail',
				title:'Vip冻结保证金',
				width:120,
				sortable:true
			},{
				field:'generalFreezeBail',
				title:'普通会员冻结保证金',
				width:120,
				sortable:true
			},{
				field:'advOverMonth',
				title:'垫付逾期天数（月标）',
				width:120,
				sortable:true
			},{
				field:'advOverDay',
				title:'垫付逾期天数（天标）',
				width:120,
				sortable:true
			},{
				field:'loanManaFeeMonth',
				title:'借款管理费(月)',
				width:120,
				sortable:true
			},{
				field:'loanManaFeeDay',
				title:'借款管理费（天）',
				width:120,
				sortable:true
			},{
				field:'limitedPeriods',
				title:'限定期数',
				width:120,
				sortable:true
			},{
				field:'overLimitedFee',
				title:'超出限定期数每月的借款费',
				width:120,
				sortable:true
			},{
				field:'subscriptionState',
				title:'是否开启认购模式',
				width:120,
				sortable:true
			},{
				field:'guaranteeAgencyId',
				title:'担保机构id',
				width:120,
				sortable:true
			},{
				field:'antiGuaranteeId',
				title:'反担保方式id',
				width:120,
				sortable:true
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			},{
				field:'creater',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			},{
				field:'updater',
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
		ploanTenderSize : 10,//注意，ploanTenderSize必须在ploanTenderList存在
		ploanTenderList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#loanTenderDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.loanTender_mgr.loanTender.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.loanTender_mgr.loanTender.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.loanTender_mgr.loanTender.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.loanTender_mgr.loanTender.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.loanTender_mgr.loanTender.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.borrow_mgr.loanTender_mgr.loanTender.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.loanCode,
				href : ctx + '/do/loanTender/intoDetail.htm?loanId='+rowData.loanId,//从controller请求jsp页面进行渲染
				width : 720,
				height : 520,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.borrow_mgr.loanTender_mgr.loanTender.addLoanTender = function(){
		glacier.basicAddOrEditDialog({
			title : '增加借款',
			width : 780,
			height : 500,
			queryUrl : ctx + '/do/loanTender/intoForm.htm',
			submitUrl : ctx + '/do/loanTender/add.json',
			successFun : function (){
				glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.borrow_mgr.loanTender_mgr.loanTender.editLoanTender = function(){
		var row = glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.loanCode+'】',
			width : 720,
			height : 500,
			queryUrl : ctx + '/do/loanTender/intoForm.htm',
			submitUrl : ctx + '/do/loanTender/edit.json',
			queryParams : {
				loanId : row.loanId
			},
			successFun : function (){
				glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.loanTender_mgr.loanTender.delLoanTender = function(){
		var rows = glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid("getChecked");
		var loanIds = [];//删除的id标识
		var loanCodes = [];//借款主题
		for(var i=0;i<rows.length;i++){
			loanIds.push(rows[i].loanId);
			loanCodes.push(rows[i].loanCode);
		}
		if(loanIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/loanTender/del.json',
						   data: {loanIds:loanIds.join(','),loanCodes:loanCodes.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid('reload');
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
	//借款资料模糊查询
	glacier.borrow_mgr.loanTender_mgr.loanTender.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有借款列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="loanTenderGridPanel" data-options="region:'center',border:true" >
		<table id="loanTenderDataGrid">
			<glacierui:toolbar panelEnName="LoanTenderList" toolbarId="loanTenderDataGrid_toolbar" menuEnName="loanTender"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>