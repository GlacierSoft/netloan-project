<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.account_mgr.accountLogin_mgr.accountLogin');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.account_mgr.accountLogin_mgr.accountLogin.param={
			toolbarId : 'accountLoginDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
			    exp:{flag:'exp',controlType:'multiple'},
			}
	};
	
	//初始化客服DataGrid
	glacier.account_mgr.accountLogin_mgr.accountLogin.accountLoginDataGrid = $('#accountLoginDataGrid').datagrid({
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
		url: ctx + '/do/accountLogin/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
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
				field:'memberRealName',
				title:'真实姓名',
				width:120,
				sortable:true
			},{
				field:'lastLoginTime',
				title:'最后登录时间',
				sortable:true,
				width:200
			},{
				field:'lastLoginIpAddress',
				title:'最后登录IP',
				sortable:true,
				width:200
			},{
				field:'loginCount',
				title:'登入次数',
				width:120,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
		pmemberList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#accountLoginDataGrid_toolbar',
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.memberName,
				href : ctx + '/do/accountLogin/intoDetail.htm?memberId='+rowData.memberId,//从controller请求jsp页面进行渲染
				width : 645,
				height : 450,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	
	//点击导出按钮触发方法
	glacier.account_mgr.accountLogin_mgr.accountLogin.expAccountLogin = function(){
        location.href=ctx+'/do/accountLogin/exp.json';
	};
	
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="accountLoginGridPanel" data-options="region:'center',border:true" >
		<table id="accountLoginDataGrid">
			<glacierui:toolbar panelEnName="AccountLoginList" toolbarId="accountLoginDataGrid_toolbar" menuEnName="accountLogin"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="memberSearchForm">
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
					     <input  name="loginStartCount" style="width: 80px;" class="easyui-numberbox spinner" />
					      -
					      <input  name="loginEndCount" style="width: 80px;" class="easyui-numberbox spinner" />
					<td>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.account_mgr.accountLogin_mgr.accountLogin.accountLoginDataGrid.datagrid('load',glacier.serializeObject($('#memberSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('#memberSearchForm input').val('');glacier.account_mgr.accountLogin_mgr.accountLogin.accountLoginDataGrid.datagrid('load',{});">重置</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>


