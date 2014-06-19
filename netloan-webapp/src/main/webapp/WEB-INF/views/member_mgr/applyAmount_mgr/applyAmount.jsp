<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.applyAmount_mgr.applyAmount');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.applyAmount_mgr.applyAmount.param = {
			toolbarId : 'applyAmountDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'audit',controlType:'single'}
			}
	};
	
	//初始化会员申请额度DataGrid
	glacier.member_mgr.applyAmount_mgr.applyAmount.applyAmountDataGrid = $('#applyAmountDataGrid').datagrid({
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
		url: ctx + '/do/applyAmount/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'applyAmountId',
		columns:[[
			{
				field:'applyAmountId',
				title:'ID',
				checkbox:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'applyType',
				title:'申请类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如'phone'电话,'internet'互联网,'scene'现场)
					return renderGridValue(value,fields.applyType);
				}
			},{
				field:'originalAmount',
				title:'原来额度',
				width:120,
				sortable:true
			},{
				field:'applyMoney',
				title:'申请金额',
				width:120,
				sortable:true
			},{
				field:'auditState',
				title:'审核状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如authstr显示'待审核',pass显示'通过',failure显示'失败'
					return renderGridValue(value,fields.auths);
				}
			},{
				field:'authorizedAmount',
				title:'审核额度',
				width:120,
				sortable:true
			},{
				field:'auditorDisplay',
				title:'审核人',
				width:120,
				sortable:true
			},{
				field:'auditDate',
				title:'审核时间',
				width:200,
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
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		papplyAmountSize : 10,//注意，papplyAmountSize必须在papplyAmountList存在
		papplyAmountList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#applyAmountDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.applyAmount_mgr.applyAmount.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.applyAmount_mgr.applyAmount.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.applyAmount_mgr.applyAmount.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.applyAmount_mgr.applyAmount.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.applyAmount_mgr.applyAmount.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.applyAmount_mgr.applyAmount.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.memberRealName+'】申请额度详细信息',
				href : ctx + '/do/applyAmount/intoDetail.htm?applyAmountId='+rowData.applyAmountId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 370,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.member_mgr.applyAmount_mgr.applyAmount.addApplyAmount = function(){
		glacier.basicAddOrEditDialog({
			title : '增加申请额度',
			width : 540,
			height : 360,
			queryUrl : ctx + '/do/applyAmount/intoAudit.htm',
			submitUrl : ctx + '/do/applyAmount/add.json',
			successFun : function (){
				glacier.member_mgr.applyAmount_mgr.applyAmount.applyAmountDataGrid.datagrid('reload');
			}
		});
	};
	//点击修改按钮触发方法glacier.member_mgr.applyAmount_mgr.applyAmount.editApplyAmount();
/* 	glacier.member_mgr.applyAmount_mgr.applyAmount.editApplyAmount = function(){
		glacier.basicAddOrEditDialog({
			title : '修改申请额度',
			width : 540,
			height : 360,
			queryUrl : ctx + '/do/applyAmount/intoAudit.htm',
			submitUrl : ctx + '/do/applyAmount/list.json',
			successFun : function (){
				glacier.member_mgr.applyAmount_mgr.applyAmount.applyAmountDataGrid.datagrid('reload');
			}
		});
	}; */
	//点击审核按钮触发方法
	glacier.member_mgr.applyAmount_mgr.applyAmount.auditApplyAmount = function(){
		var row = glacier.member_mgr.applyAmount_mgr.applyAmount.applyAmountDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '审核【'+row.memberRealName+'】申请额度信息',
			width : 540,
			height : 360,
            queryUrl : ctx + '/do/applyAmount/intoAudit.htm',
			submitUrl : ctx + '/do/applyAmount/audit.json',
			queryParams : {
				applyAmountId : row.applyAmountId
			},
			successFun : function (){
				glacier.member_mgr.applyAmount_mgr.applyAmount.applyAmountDataGrid.datagrid('reload');
			}
		});
	};
	
	//下拉项的值
	$('#memberApplyAmountSearchForm_applyType').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.applyType
	});
	$('#memberApplyAmountSearchForm_auditState').combobox({  
		valueField : 'value',
		height:18,
		width:80,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		//required:true,
		data : fields.auths
	});
</script>

<!-- 所有会员申请额度列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="applyAmountGridPanel" data-options="region:'center',border:true" >
		<table id="applyAmountDataGrid">
			<glacierui:toolbar panelEnName="ApplyAmountList" toolbarId="applyAmountDataGrid_toolbar" menuEnName="applyAmount"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="memberApplyAmountSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input id="memberApplyAmountSearchForm_memberRealName" name="memberRealName" style="width: 80px;" class="spinner"/></td>
					<td>申请类型：</td>
					<td><input id="memberApplyAmountSearchForm_applyType" name="applyType" style="width: 80px;" class="spinner"/></td>
					<td>审核状态：</td>
					<td><input id="memberApplyAmountSearchForm_auditState" name="auditState" style="width: 80px;" class="spinner"/></td>
					<td>录入时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 150px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 150px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.member_mgr.applyAmount_mgr.applyAmount.applyAmountDataGrid.datagrid('load',glacier.serializeObject($('#memberApplyAmountSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#memberApplyAmountSearchForm input').val('');glacier.member_mgr.applyAmount_mgr.applyAmount.applyAmountDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>