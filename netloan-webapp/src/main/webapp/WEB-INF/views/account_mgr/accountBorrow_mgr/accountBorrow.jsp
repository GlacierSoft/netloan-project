<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.account_mgr.accountBorrow_mgr.accountBorrow');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.account_mgr.accountBorrow_mgr.accountBorrow.param = {
			toolbarId : 'accountBorrowDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
				exp:{flag:'exp',controlType:'multiple'}
			}
	};
	
	//初始化借款DataGrid
	glacier.account_mgr.accountBorrow_mgr.accountBorrow.accountBorrowDataGrid = $('#accountBorrowDataGrid').datagrid({
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
		url: ctx + '/do/accountBorrow/list.json',
		sortName: 'loanDate',//排序字段名称
		sortOrder: 'desc',//升序还是降序
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
				width:140,
				sortable:true
			},{
				field:'memberDisplay',
				title:'借款用户名',
				width:120,
				sortable:true
			},{
				field:'loanTitle',
				title:'借款标题',
				sortable:true,
				width:120
			},{
				field:'loanTotal',
				title:'借款金额(元)',
				sortable:true,
				width:120
			 },{
				field:'loanTenderDisplay',
				title:'借款标的',
				sortable:true,
				width:120
		     },{
				field:'loanDate',
				title:'借款时间',
				sortable:true,
				width:150
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
				field:'loanManagementFees',
				title:'借款管理费(元)',
				sortable:true,
				width:120
			},{
				field:'secondAuditDate',
				title:'复审成功时间',
				sortable:true,
				width:120
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		paccountBorrowSize : 10,//注意，paccountBorrowSize必须在paccountBorrowList存在
		paccountBorrowList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#accountBorrowDataGrid_toolbar',
		onLoadSuccess:function(index, record){//加载数据成功触发事件 
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');  
			var rows=$(this).datagrid("getRows");
			if(rows.length==0){   
				var body = $(this).data().datagrid.dc.body2;
				body.find('table tbody').append('<tr><td width="' + body.width() + '" style="height: 25px; text-align: center;color:red">暂时没有记录</td></tr>');
			}
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.loanTitle+'】借款统计详细信息',
				href : ctx + '/do/accountBorrow/intoDetail.htm?loanId='+rowData.loanId,//从controller请求jsp页面进行渲染
				width : 755,
				height : 540,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
 
	//点击导出按钮触发方法
	glacier.account_mgr.accountBorrow_mgr.accountBorrow.expAccountBorrow = function(){
		location.href=ctx+"/do/accountBorrow/exp.json";
	};
	
	
	//用于combogrid的标的信息绑定
	$('#accountBorrowSearchForm_loanTenderDisplay').combogrid({
		panelWidth:450,
		fit:true,//控件自动resize占满窗口大小
		//iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
	    idField:'loanTenderId',    
	    textField:'loanrTenderName',    
	    url: ctx + '/do/loanTender/list.json',
	    sortName: 'loanrTenderName',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
	    columns : [ [ 
   		{
   			field:'loanTenderId',
   			title:'ID',
   			checkbox:true
   		},{
   			field : 'loanrTenderName',
   			title : '标的类型',
   			width : 80,
   			sortable:true
   		},{
			field:'description',
			title:'描述',
			width:120,
			sortable:true
		 }]],
   		pagination : true,//True 就会在 datagrid 的底部显示分页栏
   		pageSize : 10,//注意，pageSize必须在pageList存在
   		pageList : [2,10,50,100],//从session中获取
   		rownumbers : true,//True 就会显示行号的列
		loadMsg : '数据加载中....',
		mode : 'remote',
		delay : 200
	});
	
</script>

<!-- 所有借款列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="accountBorrowGridPanel" data-options="region:'center',border:true" >
		<table id="accountBorrowDataGrid">
			<glacierui:toolbar panelEnName="AccountBorrowList" toolbarId="accountBorrowDataGrid_toolbar" menuEnName="accountBorrow"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="accountBorrowSearchForm">
			<table>
				<tr>
				    <td>借款人：</td>
					<td><input id="accountBorrowSearchForm_memberDisplay" name="memberDisplay" style="width: 60px;" class="spinner"/></td>
					<td>借款标题：</td>
					<td><input id="accountBorrowSearchForm_loanTitle" name="loanTitle" style="width: 60px;" class="spinner"/></td>
					<td>借款类型：</td>
					<td><input id="accountBorrowSearchForm_loanTenderDisplay" name="borrowTypes" style="width: 60px;" class="spinner"/></td>
					<td>借款时间：</td>
					<td>
						<input name="loanStartDate" class="easyui-datetimebox" style="width: 120px;" />
						-
						<input name="loanEndTime" class="easyui-datetimebox" style="width: 120px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.account_mgr.accountBorrow_mgr.accountBorrow.accountBorrowDataGrid.datagrid('load',glacier.serializeObject($('#accountBorrowSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#accountBorrowSearchForm input').val('');glacier.account_mgr.accountBorrow_mgr.accountBorrow.accountBorrowDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>