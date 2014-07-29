<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.estate_mgr.estate');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.estate_mgr.estate.param = {
			toolbarId : 'estateDataGrid_toolbar',
			actions : {
				audit:{flag:'audit',controlType:'single'}
			}
	};
	
	//初始化会员房产信息DataGrid
	glacier.member_mgr.estate_mgr.estate.estateDataGrid = $('#estateDataGrid').datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
// 		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/estate/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'estateId',
		columns:[[
			{
				field:'estateId',
				title:'ID',
				checkbox:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'address',
				title:'房产地址',
				width:120,
				sortable:true
			},{
				field:'area',
				title:'建筑面积',
				width:120,
				sortable:true
			},{
				field:'yearBuilt',
				title:'建筑年份',
				width:120,
				sortable:true
			},{
				field:'ageExpenses',
				title:'供款状况',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如('mortgage'抵押贷款,'finished'购买完成)
					return renderGridValue(value,fields.ageExpenses);
				}
			},{
				field:'firstOwner',
				title:'所有权人一',
				width:120,
				sortable:true
			},{
				field:'secondOwner',
				title:'所有权人二',
				width:120,
				sortable:true
			},{
				field:'loanPeriod',
				title:'贷款年限',
				width:120,
				sortable:true
			},{
				field:'monthContributions',
				title:'每月供款(元)',
				width:120,
				sortable:true
			},{
				field:'outstandBalances',
				title:'尚欠贷款余额(元)',
				width:120,
				sortable:true
			},{
				field:'mortgageBank',
				title:'按揭银行',
				width:120,
				sortable:true
			},{
				field:'auditState',
				title:'审核状态',
				sortable:true,
				width:100,
				formatter: function(value,row,index){//数据格式化
					return renderGridValue(value,fields.auditState);
				}
			},{
				field:'auditorDisplay',
				title:'审核人',
				sortable:true,
				width:100
			},{
				field:'auditDate',
				title:'审核时间',
				sortable:true,
				width:150
			},{
				field:'auditRemark',
				title:'审核说明',
				sortable:true,
				width:150
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:150
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:150
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pestateSize : 10,//注意，pestateSize必须在pestateList存在
		pestateList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#estateDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.estate_mgr.estate.param,this).unSelect();
		},
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
				title: '【'+rowData.memberRealName+'】房产详细信息',
				href : ctx + '/do/estate/intoDetail.htm?estateId='+rowData.estateId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 380,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	/* 模糊查找 */
	$('#memberEstateSearchForm_ageExpenses').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.ageExpenses
	});
	//点击审核按钮触发方法
	glacier.member_mgr.estate_mgr.estate.auditHiring = function(){
		var row = glacier.member_mgr.estate_mgr.estate.estateDataGrid.datagrid("getSelected");
		var auditState = row.auditState;
		if ("authstr" == auditState) {
			glacier.basicAddOrEditDialog({
				title : '审核【'+row.memberRealName+'】房产信息',
				width : 530,
				height : 500,
				queryUrl : ctx + '/do/estate/intoAudit.htm',
				submitUrl : ctx + '/do/estate/audit.json',
				queryParams : {
					estateId : row.estateId
				},
				successFun : function (){
					glacier.member_mgr.estate_mgr.estate.estateDataGrid.datagrid('reload');
				}
			});
		} else {
			alert("该记录已经进行了审核，不需要重复操作。");
		}
	};
</script>

<!-- 所有会员房产信息列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="estateGridPanel" data-options="region:'center',border:true" >
		<table id="estateDataGrid">
			<glacierui:toolbar panelEnName="EstateList" toolbarId="estateDataGrid_toolbar" menuEnName="estate"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="memberEstateSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberRealName" style="width: 80px;" class="spinner"/></td>
					<td>房产地址：</td>
					<td><input name="address" style="width: 80px;" class="spinner"/></td>
					<td>供款状况：</td>
					<td><input id="memberEstateSearchForm_ageExpenses" name="ageExpenses" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.member_mgr.estate_mgr.estate.estateDataGrid.datagrid('load',glacier.serializeObject($('#memberEstateSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#memberEstateSearchForm input').val('');glacier.member_mgr.estate_mgr.estate.estateDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>