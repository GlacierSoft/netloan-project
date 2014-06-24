<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.loanTender_mgr.loanTender');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.loanTender_mgr.loanTender.param = {
			toolbarId : 'loanTenderDataGrid_toolbar',
			actions : {
				assign:{flag:'assign',controlType:'single'},
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化标种类型DataGrid
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
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'loanTenderId',
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
				width:200,
				sortable:true
			},{
				field:'state',
				title:'状态',
				width:60,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如open显示启用，close显示禁用
					return renderGridValue(value,fields.state);
				}
			},{
				field:'lowestLoanAmount',
				title:'最小标种类型额度',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化
					return formatNum(value);
				}
			},{
				field:'largestLoanAmount',
				title:'最大标种类型额度',
				width:120,
				sortable:true
			},{
				field:'loanMoneyMultiple',
				title:'标种类型金额倍数',
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
				title:'标种类型期限(月标)',
				width:120,
				sortable:true
			},{
				field:'loanDeadlinesDay',
				title:'标种类型期限(天标)',
				width:120,
				sortable:true
			},{
				field:'waitBidDeadlines',
				title:'筹标期限',
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
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isBidPwd',
				title:'是否设置投标密码',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
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
				title:'标种类型管理费(月)',
				width:120,
				sortable:true
			},{
				field:'loanManaFeeDay',
				title:'标种类型管理费（天）',
				width:120,
				sortable:true
			},{
				field:'limitedPeriods',
				title:'限定期数',
				width:120,
				sortable:true
			},{
				field:'overLimitedFee',
				title:'超出限定期数每月的标种类型费',
				width:120,
				sortable:true
			},{
				field:'subscriptionState',
				title:'是否开启认购模式',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如open显示启用，close显示禁用
					return renderGridValue(value,fields.state);
				}
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
				title: '【'+rowData.loanrTenderName+'】详细描述',
				href : ctx + '/do/loanTender/intoDetail.htm?loanTenderId='+rowData.loanTenderId,//从controller请求jsp页面进行渲染
				width : 780,
				height :600,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.borrow_mgr.loanTender_mgr.loanTender.addLoanTender = function(){
		glacier.basicAddOrEditDialog({
			title : '增加标种类型',
			width : 780,
			height : 600,
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
			title : '编辑【'+row.loanrTenderName+'】',
			width : 780,
			height : 600,
			queryUrl : ctx + '/do/loanTender/intoForm.htm',
			submitUrl : ctx + '/do/loanTender/edit.json',
			queryParams : {
				loanTenderId : row.loanTenderId
			},
			successFun : function (){
				glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.loanTender_mgr.loanTender.delLoanTender = function(){
		var rows = glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid("getChecked");
		var loanTenderIds = [];//删除的id标识
		var loanrTenderNames = [];//标种类型主题
		for(var i=0;i<rows.length;i++){
			loanTenderIds.push(rows[i].loanTenderId);
			loanrTenderNames.push(rows[i].loanrTenderName);
		}
		if(loanTenderIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/loanTender/del.json',
						   data: {loanTenderIds:loanTenderIds.join(','),loanrTenderNames:loanrTenderNames.join(',')},
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
	
	//显示为标种类型分配还款方式窗口
	glacier.borrow_mgr.loanTender_mgr.loanTender.assignRepayment = function(){
		var loanTenderId = glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid("getSelected").loanTenderId;
		glacier.borrow_mgr.loanTender_mgr.loanTender.tenderRepaymentTreeGrid = $('#tenderRepaymentTreeGrid').treegrid({
			url:ctx +'/do/loanTender/getTenderAndRepayment.json',//请求的URL
			idField : 'repaymentTypeId',//定义了关键字段来标识一个树节点
			singleSelect:false,//限制单选
			checkOnSelect:true,
			selectOnCheck:false,
			queryParams:{loanTenderId:loanTenderId},//当请求远程数据时，发送的额外参数
			fit : true,//控件自动resize占满窗口大小
			fitColumns : true,//自动填充行
			border : false,//是否存在边框
			columns:[[
				{
					field:'repaymentTypeId',
					title:'ID',
					checkbox:true
				},{
					field:'repaymentTypeName',
					title:'还款方式名称',
					width:120
				},{
					field:'state',
					title:'状态',
					width:50,
					formatter: function(value,row,index){//数据格式化，例如open显示启用，close显示禁用,不过后台设置了只显示启动的还款方式
						return renderGridValue(value,fields.state);
					}
				},{
					field:'remark',
					title:'备注',
					width:200
				}
			]]
		});
		//显示分配还款方式窗口
		glacier.borrow_mgr.loanTender_mgr.loanTender.tenderRepaymentWin = $('#tenderRepaymentWin').dialog({ 
			title:'分配还款方式',
		    width:650,  
		    height:200,
		    resizable:true,
		    modal:true,
		    minimizable:false,
		    maximizable:true,
		    buttons:[{
				text:'保存',
				iconCls:"icon-save",
				handler:function(){
					glacier.borrow_mgr.loanTender_mgr.loanTender.saveTenderAndRepayment(loanTenderId);
				}
			},{
				text:'关闭',
				iconCls:"icon-undo",
				handler:function(){
					glacier.borrow_mgr.loanTender_mgr.loanTender.tenderRepaymentWin.dialog('close');
				}
			}]
		});
	};
	
	//保存标种类型和还款方式关系
	glacier.borrow_mgr.loanTender_mgr.loanTender.saveTenderAndRepayment = function(loanTenderId){
		var repaymentTypeIds = [];
		var repaymentTypeInputs = glacier.borrow_mgr.loanTender_mgr.loanTender.tenderRepaymentWin.find("input[name='repaymentTypeId']:checked");
		for(var i=0;i<repaymentTypeInputs.length;i++){
			repaymentTypeIds.push(repaymentTypeInputs[i].value);
		}
		//发送远程请求保存当前标种类型和还款方式关系设置
		$.ajax({
			   type: "POST",
			   url: ctx + "/do/loanTender/saveTenderAndRepayment.json",
			   data: {loanTenderId:loanTenderId,repaymentTypeIds:repaymentTypeIds.join(',')},
			   dataType:'json',
			   success: function(r){
				   	glacier.show({msg:r.msg,result:r.success});
				   	glacier.borrow_mgr.loanTender_mgr.loanTender.tenderRepaymentWin.dialog('close');
			   }
		});
	};
	
	//标种类型资料模糊查询
	glacier.borrow_mgr.loanTender_mgr.loanTender.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.borrow_mgr.loanTender_mgr.loanTender.loanTenderDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有标种类型列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="loanTenderGridPanel" data-options="region:'center',border:true" >
		<table id="loanTenderDataGrid">
			<glacierui:toolbar panelEnName="LoanTenderList" toolbarId="loanTenderDataGrid_toolbar" menuEnName="loanTender"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>

<!-- 自定义分配角色窗口 -->
<div id="tenderRepaymentWin">
	<table id="tenderRepaymentTreeGrid"></table>
</div>