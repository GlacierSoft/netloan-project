<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.finance_mgr.bankCard_mgr.bankCard');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.finance_mgr.bankCard_mgr.bankCard.param = {
			toolbarId : 'bankCardDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				audit:{flag:'audit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid = $('#bankCardDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/bankCard/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'bankCardId',
		columns:[[
			{
				field:'bankCardId',
				title:'ID',
				checkbox:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'openingBank',
				title:'开户行',
				width:120,
				sortable:true
			},{
				field:'subbranch',
				title:'支行',
				width:120,
				sortable:true
			},{
				field:'cardName',
				title:'银行卡名称',
				width:120,
				sortable:true
			},{
				field:'cardNumber',
				title:'银行卡号',
				width:120,
				sortable:true
			},{
				field:'status',
				title:'状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.bankCardAuths);
				}
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pbankCardSize : 10,//注意，pbankCardSize必须在pbankCardList存在
		pbankCardList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#bankCardDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.bankCard_mgr.bankCard.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.bankCard_mgr.bankCard.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.bankCard_mgr.bankCard.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.finance_mgr.bankCard_mgr.bankCard.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.finance_mgr.bankCard_mgr.bankCard.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.finance_mgr.bankCard_mgr.bankCard.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.memberRealName+'】会员银行卡详细信息',
				href : ctx + '/do/bankCard/intoDetail.htm?bankCardId='+rowData.bankCardId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 275,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击增加按钮触发方法
	/* glacier.finance_mgr.bankCard_mgr.bankCard.addBankCard = function(){
		glacier.basicAddOrEditDialog({
			title : '增加银行卡',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/bankCard/intoForm.htm',
			submitUrl : ctx + '/do/bankCard/add.json',
			successFun : function (){
				glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.finance_mgr.bankCard_mgr.bankCard.editBankCard = function(){
		var row = glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.cardName+'】',
			width : 700,
			height : 500,
			queryUrl : ctx + '/do/bankCard/intoForm.htm',
			submitUrl : ctx + '/do/bankCard/edit.json',
			queryParams : {
				bankCardId : row.bankCardId
			},
			successFun : function (){
				glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid('reload');
			}
		});
	}; */
	//点击审核按钮触发方法
	glacier.finance_mgr.bankCard_mgr.bankCard.auditBankCard = function(){
		var row = glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '审核【'+row.memberRealName+'】审核额度信息',
			width : 540,
			height : 360,
			queryUrl : ctx + '/do/bankCard/intoAudit.htm',
			submitUrl : ctx + '/do/bankCard/audit.json',
			queryParams : {
				bankCardId : row.bankCardId
			},
			successFun : function (){
				glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.finance_mgr.bankCard_mgr.bankCard.delBankCard = function(){
		var rows = glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid("getChecked");
		var bankCardIds = [];//删除的id标识
		var cardNames = [];//客服主题
		for(var i=0;i<rows.length;i++){
			bankCardIds.push(rows[i].bankCardId);
			cardNames.push(rows[i].cardName);
		}
		if(bankCardIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/bankCard/del.json',
						   data: {bankCardIds:bankCardIds.join(','),cardNames:cardNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid('reload');
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
	//客服资料模糊查询
	glacier.finance_mgr.bankCard_mgr.bankCard.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.finance_mgr.bankCard_mgr.bankCard.bankCardDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="bankCardGridPanel" data-options="region:'center',border:true" >
		<table id="bankCardDataGrid">
			<glacierui:toolbar panelEnName="BankCardList" toolbarId="bankCardDataGrid_toolbar" menuEnName="bankCard"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>