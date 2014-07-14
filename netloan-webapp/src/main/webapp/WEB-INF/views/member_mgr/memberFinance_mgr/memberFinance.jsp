<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.memberFinance_mgr.memberFinance');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.memberFinance_mgr.memberFinance.param = {
			toolbarId : 'memberFinanceDataGrid_toolbar',
			actions : {
			}
	};
	
	//初始化会员积分记录DataGrid
	glacier.member_mgr.memberFinance_mgr.memberFinance.memberFinanceDataGrid = $('#memberFinanceDataGrid').datagrid({
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
		url: ctx + '/do/memberFinance/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'memberId',
		columns:[[
			{
				field:'memberId',
				title:'ID',
				checkbox:true
			},{
				field:'memberName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'aveIncome',
				title:'月均收入',
				width:120,
				sortable:true
			},{
				field:'aveExpenses',
				title:'月均支出',
				width:120,
				sortable:true
			},{
				field:'buyEstate',
				title:'是否购房',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('borrow'借款,'invest'投资)
					return renderGridValue(value,fields.buyEstate);
				}
			},{
				field:'buyCar',
				title:'是否购车',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('increase'增加,'reduction'减少)
					return renderGridValue(value,fields.buyCar);
				}
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
		pmemberFinanceSize : 10,//注意，pmemberFinanceSize必须在pmemberFinanceList存在
		pmemberFinanceList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#memberFinanceDataGrid_toolbar',
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
				title: "【"+rowData.memberName+"】财务信息",
				href : ctx + '/do/memberFinance/intoDetail.htm?memberId='+rowData.memberId,//从controller请求jsp页面进行渲染
				width : 620,
				height : 547,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//下拉项的值
	$('#memberFinanceSearchForm_buyEstate').combobox({  
		valueField : 'value',
		//height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.buyEstate
	});
	$('#memberFinanceSearchForm_buyCar').combobox({  
		valueField : 'value',
		//height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.buyCar
	});
</script>

<!-- 所有会员积分记录列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="memberFinanceGridPanel" data-options="region:'center',border:true" >
		<table id="memberFinanceDataGrid">
			<!-- <glacierui:toolbar panelEnName="MemberFinanceList" toolbarId="memberFinanceDataGrid_toolbar" menuEnName="memberFinance"/>自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="memberFinanceSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberName" style="width: 80px;" class="spinner"/></td>
					<!-- <td>月均收入：</td>
					<td><input name="aveIncome" style="width: 80px;" class="spinner"/></td> -->
					<td>是否购房：</td>
					<td><input id="memberFinanceSearchForm_buyEstate" name="buyEstate" style="width: 80px;" class="spinner"/></td>
					<td>是否购车：</td>
					<td><input id="memberFinanceSearchForm_buyCar" name="buyCar" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.member_mgr.memberFinance_mgr.memberFinance.memberFinanceDataGrid.datagrid('load',glacier.serializeObject($('#memberFinanceSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#memberFinanceSearchForm input').val('');glacier.member_mgr.memberFinance_mgr.memberFinance.memberFinanceDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>