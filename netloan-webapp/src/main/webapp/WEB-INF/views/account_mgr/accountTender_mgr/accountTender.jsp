<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.account_mgr.accountTender_mgr.accountTender');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.account_mgr.accountTender_mgr.accountTender.param = {
			toolbarId : 'accountTenderDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
			    exp:{flag:'exp',controlType:'multiple'},
			}
	};
	
	//初始化客服DataGrid
	glacier.account_mgr.accountTender_mgr.accountTender.accountTenderDataGrid = $('#accountTenderDataGrid').datagrid({
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
		url: ctx + '/do/accountTender/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'tenderNotesId',
		columns:[[
			{
				field:'tenderNotesId',
				title:'ID',
				checkbox:true
			},{
				field:'memberDisplay',
				title:'投标用户',
				width:120,
				sortable:true
			},{
				field:'creditIntegral',
				title:'用户积分',
				width:120,
				sort:true
			},{
				field:'tenderMoney',
				title:'投标金额',
				width:120,
				sortable:true
			},{
				field:'subTotal',
				title:'认购份数',
				width:120,
				sortable:true
				
			},{
				field:'loanTitle',
				title:'借款标题',
				width:200,
				sortable:true
			},{
				field:'loanTenderDisplay',
				title:'借款类型',
				width:150,
				sortable:true
				
			},{
				field:'loanMemberDisplay',
				title:'借款用户',
				width:180,
				sortable:true
			},{
				field:'loanState',
				title:'借款状态',
				sortable:true,
				width:150,
				formatter: function(value,row,index){//借款状态字段的数据格式化
					return renderGridValue(value,fields.loanState);
				}
			},{
				field:'createrDisplay',
				title:'创建人',
				width:200,
				sortable:true
			},{
				field:'createTime',
				title:'入录时间',
				width:320,
				sortable:true
			},{
				field:'updaterDisplay',
				title:'更新人',
				width:150,
			    sortable:true
			},{
				field:'updateTime',
				title:'更新时间',
				width:300,
			    sortable:true
			},{
				field:'remark',
				title:'备注',
				width:120,
			    sortable:true
			}]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
		pmemberList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#accountTenderDataGrid_toolbar',
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title:"投标详情",
				href : ctx + '/do/accountTender/intoDetail.htm?tenderNotesId='+rowData.tenderNotesId,//从controller请求jsp页面进行渲染
				width : 600,
				height : 450,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击导出按钮触发方法
	glacier.account_mgr.accountTender_mgr.accountTender.expAccountTender= function(){
		location.href=ctx+"/do/accountTender/exp.json";
	};
	
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="accountTenderGridPanel" data-options="region:'center',border:true" >
		<table id="accountTenderDataGrid">
			<glacierui:toolbar panelEnName="AccountTenderList" toolbarId="accountTenderDataGrid_toolbar" menuEnName="accountTender"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="tenderSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberName" style="width: 80px;" class="spinner"/></td>
					<td>会员真实姓名：</td>
					<td><input name="memberRealName" style="width: 80px;" class="spinner"/></td>
					<td>最后登入时间段：</td>
					<td>
						<input name="lastStartLoginTime" class="easyui-datetimebox" style="width: 100px;" />
						-
						<input name="lastEndLoginTime" class="easyui-datetimebox" style="width: 100px;" />
					</td>
					<td>登入次数：</td>
					<td>
					     <input  name="loginStartCount" style="width: 80px;" class="spinner" />
					      -
					      <input  name="loginEndCount" style="width: 80px;" class="spinner"/>
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.account_mgr.accountTender_mgr.accountTender.accountTenderDataGrid.datagrid('load',glacier.serializeObject($('#tenderSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#tenderSearchForm input').val('');glacier.account_mgr.accountTender_mgr.accountTender.accountTenderDataGrid.datagrid('load',{});">重置</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>


