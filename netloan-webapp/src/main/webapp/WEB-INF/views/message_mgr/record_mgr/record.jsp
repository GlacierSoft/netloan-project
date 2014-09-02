<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.message_mgr.record_mgr.record');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.message_mgr.record_mgr.record.param = {
			toolbarId : 'recordDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化广告DataGridglacier.message_mgr.record_mgr.record.recordDataGrid
	glacier.message_mgr.record_mgr.record.recordDataGrid = $('#recordDataGrid').datagrid({
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
		url: ctx + '/do/record/list.json',
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'recordId',
		columns:[[
			{
				field:'recordId',
				title:'ID',
				checkbox:true
			},{
				field:'recordTitle',
				title:'邮件标题',
				width:280,
				sortable:true
			},{
				field:'recordMemberDisplay',
				title:'收件人',
				width:120,
				sortable:true,
			},{
				field:'recordSendDisplay',
				title:'发件人',
				sortable:true,
				width:100
			},{
				field:'createrTime',
				title:'发送时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		precordSize : 10,//注意，precordSize必须在precordList存在
		precordList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#recordDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.message_mgr.record_mgr.record.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.message_mgr.record_mgr.record.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.message_mgr.record_mgr.record.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.message_mgr.record_mgr.record.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.message_mgr.record_mgr.record.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.message_mgr.record_mgr.record.param,this).unSelect();
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
				title: "【"+rowData.recordTitle+"】的邮件记录详细信息",
				href : ctx + '/do/record/intoDetail.htm?recordId='+rowData.recordId,//从controller请求jsp页面进行渲染
				width : 720,
				height : 190,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	
	
	
	
</script>

<!-- 所有广告列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="recordGridPanel" data-options="region:'center',border:true" >
		<table id="recordDataGrid">
			<%-- <glacierui:toolbar panelEnName="EmailList" toolbarId="recordDataGrid_toolbar" menuEnName="record"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 --> --%>
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="messageEmailSearchForm">
			<table>
				<tr>
					<td>收件人：</td>
					<td><input name="recordMemberDisplay" style="width: 60px;" class="spinner"/></td>
					<td>发件人：</td>
					<td>
						<input name="recordSendDisplay" style="width: 80px;" class="spinner"/>
					</td>
					<td>发送时间：</td>
					<td>
						<input name="createStartTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="createEndTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.message_mgr.record_mgr.record.recordDataGrid.datagrid('load',glacier.serializeObject($('#messageEmailSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#messageEmailSearchForm input').val('');glacier.message_mgr.record_mgr.record.recordDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>