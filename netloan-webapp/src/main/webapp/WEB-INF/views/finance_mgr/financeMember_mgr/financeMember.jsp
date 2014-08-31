<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.finance_mgr.financeMember_mgr.financeMember');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	
	//初始化会员提现记录DataGrid
	glacier.finance_mgr.financeMember_mgr.financeMember.financeMemberDataGrid = $('#financeMemberDataGrid').datagrid({
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
		url: ctx + '/do/financeMember/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'financeMemberId',
		columns:[[
			{
				field:'financeMemberId',
				title:'ID',
				checkbox:true
			},{
				field:'memberDisplay',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'usableMoney',
				title:'可用余额(元)',
				width:120,
				sortable:true
			},{
				field:'frozenMoney',
				title:'冻结金额(元)',
				width:120,
				sortable:true
			},{
				field:'collectingMoney',
				title:'待收金额(元)',
				width:120,
				sortable:true
			},{
				field:'refundMoney',
				title:'待还金额(元)',
				width:120,
				sortable:true
			},{
				field:'amount',
				title:'总金额(元)',
				width:120,
				sortable:true
			},{
				field:'rechargeMonthTimes',
				title:'本月充值次数',
				width:120,
				sortable:true
			},{
				field:'rechargeTimes',
				title:'充值总次数',
				width:120,
				sortable:true
			},{
				field:'rechargeMoney',
				title:'充值总金额(元)',
				width:120,
				sortable:true
			},{
				field:'withdrawMonthTimes',
				title:'本月提现次数',
				width:120,
				sortable:true
			},{
				field:'withdrawTimes',
				title:'提现总次数',
				width:120,
				sortable:true
			},{
				field:'withdrawMoney',
				title:'提现总金额(元)',
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
				sortable:true,
				width:100
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pfinanceMemberSize : 10,//注意，pfinanceMemberSize必须在pfinanceMemberList存在
		pfinanceMemberList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列 
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
				title: '【'+rowData.memberDisplay+'】会员资金详细信息',
				href : ctx + '/do/financeMember/intoDetail.htm?financeMemberId='+rowData.financeMemberId,//从controller请求jsp页面进行渲染
				width : 620,
				height : 405,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	}); 
	//会员提现记录资料模糊查询
	glacier.finance_mgr.financeMember_mgr.financeMember.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.finance_mgr.financeMember_mgr.financeMember.financeMemberDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有会员提现记录列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="financeMemberGridPanel" data-options="region:'center',border:true" >
		<table id="financeMemberDataGrid">
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="financeMemberSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberDisplay" style="width: 60px;" class="spinner"/></td>
					<td>银行卡名称：</td>
					<td>
						<input name="bankCardDisplay" style="width: 80px;" class="spinner"/>
					</td>
					<td>创建时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.finance_mgr.financeMember_mgr.financeMember.financeMemberDataGrid.datagrid('load',glacier.serializeObject($('#financeMemberSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#financeMemberSearchForm input').val('');glacier.finance_mgr.financeMember_mgr.financeMember.financeMemberDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>