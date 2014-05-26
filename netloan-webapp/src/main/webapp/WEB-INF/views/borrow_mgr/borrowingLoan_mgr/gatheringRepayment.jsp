<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.param = {
			toolbarId : 'borrowingLoanDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化借款DataGrid
	glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid = $('#borrowingLoanDataGrid').datagrid({
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
		url: ctx + '/do/borrowingLoan/list.json',
		queryParams: {loanState: 'repaymenting'},
		sortName: 'loanCode',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'loanId',
		columns:[[
			{
				field:'loanId',
				title:'ID',
				checkbox:true
			},{
				field:'loanCode',
				title:'借款编号',
				width:120,
				sortable:true
			},{
				field:'memberDisplay',
				title:'借款人',
				width:120,
				sortable:true
			},{
				field:'loanTitle',
				title:'借款标题',
				sortable:true,
				width:120
			},{
				field:'loanState',
				title:'借款状态',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//借款状态字段的数据格式化
					return renderGridValue(value,fields.loanState);
				}
			},{
				field:'loanPicture',
				title:'借款图片',
				sortable:true,
				width:120
			},{
				field:'loanTenderDisplay',
				title:'借款标的',
				sortable:true,
				width:120
			},{
				field:'loanPurposeId',
				title:'借款目的',
				sortable:true,
				width:120
			},{
				field:'loanDeadlinesId',
				title:'借款期限',
				width:120,
				sortable:true
			},{
				field:'failedReason',
				title:'流标原因',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isDayMarked',
				title:'置为天标',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isBidReward',
				title:'是否有投标奖励',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'bidProReward',
				title:'按投标金额比例奖励',
				sortable:true,
				width:120
			},{
				field:'fixedAppReward',
				title:'按固定金额分摊奖励',
				sortable:true,
				width:120
			},{
				field:'isBidMarked',
				title:'是否有投标待收限制',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'readyRecMoney',
				title:'待收金额设置',
				width:120,
				sortable:true
			},{
				field:'isBidPwd',
				title:'是否设置投标密码',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'bidPwd',
				title:'投标密码',
				sortable:true,
				width:120
			},{
				field:'loanManagementFees',
				title:'借款管理费',
				sortable:true,
				width:120
			},{
				field:'repaymentTypeDisplay',
				title:'还款方式',
				sortable:true,
				width:120
			},{
				field:'loanTotal',
				title:'借款总额',
				width:120,
				sortable:true
			},{
				field:'loanApr',
				title:'年利率',
				width:120,
				sortable:true
			},{
				field:'lowestBidMoney',
				title:'最低投标金额',
				sortable:true,
				width:120
			},{
				field:'largestBidMoney',
				title:'最高投标金额',
				sortable:true,
				width:120
			},{
				field:'lowestSub',
				title:'最小认购单位(元)',
				sortable:true,
				width:120
			},{
				field:'subTotal',
				title:'认购总份数',
				sortable:true,
				width:120
			},{
				field:'alrSubSum',
				title:'已认购份数',
				sortable:true,
				width:120
			},{
				field:'alrTenderPro',
				title:'已完成投标比例',
				sortable:true,
				width:120
			},{
				field:'tenderSum',
				title:'投标数量',
				sortable:true,
				width:120
			},{
				field:'waitBidDeadlines',
				title:'筹标期限',
				sortable:true,
				width:120
			},{
				field:'loanDetail',
				title:'借款详情',
				sortable:true,
				width:120
			},{
				field:'isAccountFunds',
				title:'是否公开帐户资金',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isLoanFunds',
				title:'是否公开借款资金',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isCreditAmount',
				title:'是否公开信用额度',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isBidFunds',
				title:'是否公开投标资金',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isAutomaticBid',
				title:'是否允许自动投标',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'isRecommend',
				title:'是否设为推荐',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.yesOrNo);
				}
			},{
				field:'loanDate',
				title:'借款日期',
				sortable:true,
				width:120
			},{
				field:'firstAuditState',
				title:'初审审核状态',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.firstAuditState);
				}
			},{
				field:'firstAuditorDisplay',
				title:'初审审核人',
				sortable:true,
				width:120
			},{
				field:'firstAdvice',
				title:'初审处理意见',
				sortable:true,
				width:120
			},{
				field:'firstMesNotice',
				title:'初审站内信通知',
				sortable:true,
				width:120
			},{
				field:'firstAuditDate',
				title:'初审审核时间',
				sortable:true,
				width:120
			},{
				field:'secondAuditState',
				title:'复审审核状态',
				sortable:true,
				width:120,
				formatter: function(value,row,index){//数据格式化，例如yes显示是，no显示否
					return renderGridValue(value,fields.secondAuditState);
				}
			},{
				field:'secondAuditorDisplay',
				title:'复审审核人',
				sortable:true,
				width:120
			},{
				field:'secondAdvice',
				title:'复审处理意见',
				sortable:true,
				width:120
			},{
				field:'secondMesNotice',
				title:'复审站内信通知',
				sortable:true,
				width:120
			},{
				field:'secondAuditDate',
				title:'复审审核时间',
				sortable:true,
				width:120
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
		pborrowingLoanSize : 10,//注意，pborrowingLoanSize必须在pborrowingLoanList存在
		pborrowingLoanList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#borrowingLoanDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.loanCode,
				href : ctx + '/do/borrowingLoan/intoDetail.htm?loanId='+rowData.loanId,//从controller请求jsp页面进行渲染
				width : 750,
				height : 540,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.addAdvertisement = function(){
		glacier.basicAddOrEditDialog({
			title : '增加借款',
			width : 720,
			height : 500,
			queryUrl : ctx + '/do/borrowingLoan/intoForm.htm',
			submitUrl : ctx + '/do/borrowingLoan/add.json',
			successFun : function (){
				glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.editAdvertisement = function(){
		var row = glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.loanCode+'】',
			width : 720,
			height : 500,
			queryUrl : ctx + '/do/borrowingLoan/intoForm.htm',
			submitUrl : ctx + '/do/borrowingLoan/edit.json',
			queryParams : {
				loanId : row.loanId
			},
			successFun : function (){
				glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.delAdvertisement = function(){
		var rows = glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid("getChecked");
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
						   url: ctx + '/do/borrowingLoan/del.json',
						   data: {loanIds:loanIds.join(','),loanCodes:loanCodes.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid('reload');
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
	glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid('load',obj);
	};
	
	//借款状态下拉项的值
	$('#borrowingLoanSearchForm_loanState').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.loanState
	});
	
</script>

<!-- 所有借款列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="borrowingLoanGridPanel" data-options="region:'center',border:true" >
		<table id="borrowingLoanDataGrid">
			<glacierui:toolbar panelEnName="BorrowingLoanList" toolbarId="borrowingLoanDataGrid_toolbar" menuEnName="borrowingLoan"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="borrowingLoanSearchForm">
			<table>
				<tr>
					<td>借款编号：</td>
					<td><input id="borrowingLoanSearchForm_loanCode" name="loanCode" style="width: 60px;" class="spinner"/></td>
					<td>借款人：</td>
					<td><input id="borrowingLoanSearchForm_memberDisplay" name="memberDisplay" style="width: 60px;" class="spinner"/></td>
					<td>借款标题：</td>
					<td><input id="borrowingLoanSearchForm_loanTitle" name="loanTitle" style="width: 60px;" class="spinner"/></td>
					<td>借款状态：</td>
					<td><input id="borrowingLoanSearchForm_loanState" name="loanState" style="width: 60px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 120px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 120px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid('load',glacier.serializeObject($('#borrowingLoanSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#borrowingLoanSearchForm input').val('');glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.borrowingLoanDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>