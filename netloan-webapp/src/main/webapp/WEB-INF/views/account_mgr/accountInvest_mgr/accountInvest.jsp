<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.account_mgr.accountInvest_mgr.accountInvest');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.account_mgr.accountInvest_mgr.accountInvest.param = {
			toolbarId : 'accountInvestDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
			    exp:{flag:'exp',controlType:'multiple'},
			}
	};
	
	//初始化客服DataGrid
	glacier.account_mgr.accountInvest_mgr.accountInvest.accountInvestDataGrid = $('#accountInvestDataGrid').datagrid({
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
		url: ctx + '/do/accountInvest/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'investId',
		columns:[[
			{
				field:'investId',
				title:'ID',
				checkbox:true
			},{
				field:'sumUncollected',
				title:'投资成功待收金额',
				width:350,
				sortable:true
			},{
				field:'sumReward',
				title:'投资奖励金额',
				width:300,
				sort:true
			},{
				field:'sumFine',
				title:'借款人逾期罚金金额',
				width:400,
				sortable:true
			},{
				field:'sumBorrow',
				title:'借款成功金额',
				width:300,
				sortable:true
				
			},{
				field:'sumAdvfee',
				title:'借款管理费总额',
				width:300,
				sortable:true
			},{
				field:'sumInterest',
				title:'借款利息总额',
				width:300,
				sortable:true
				
			},{
				field:'sumInterestfee',
				title:'借款逾期罚金总额',
				width:400,
				sortable:true
			},{
				field:'creater',
				title:'创建人',
				sortable:true,
				width:150
			},{
				field:'createTime',
				title:'创建时间',
				width:200,
				sortable:true
			},{
				field:'updater',
				title:'更新人',
				width:150,
				sortable:true
			},{
				field:'updateTime',
				title:'更新时间',
				width:200,
			    sortable:true
			}]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
		pmemberList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#accountInvestDataGrid_toolbar',
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title:"投标详情",
				href : ctx + '/do/accountInvest/intoDetail.htm?investId='+rowData.investId,//从controller请求jsp页面进行渲染
				width : 600,
				height : 300,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击导出按钮触发方法
	glacier.account_mgr.accountInvest_mgr.accountInvest.expAccountInvest= function(){
		location.href=ctx+"/do/accountInvest/exp.json";
	};
	
	
	//时间测试
	$("#invest_today").change(function(){
		  alert($("#invest_today").val());
	});
	
 </script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="accountInvestGridPanel" data-options="region:'center',border:true" >
		<table id="accountInvestDataGrid">
			<glacierui:toolbar panelEnName="AccountInvestList" toolbarId="accountInvestDataGrid_toolbar" menuEnName="accountInvest"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true" style="height:40px;padding-left:10px;">
		<form id="accountInvestSearchForm" >
			<table>
				<tr>
					<td><input type="radio" id="invest_today" name="invest_search" Class="spinner" value="investToday"/></td>
					<td>当日</td>
					<td><input type="radio" id="invest_month" name="invest_search" class="spinner" value="investMonth"/></td>
					<td>当月</td>
					<td><input type="radio" id="invest_year" name="invest_search"  class="spinner" value="investYear"/></td>
					<td>当年</td>
					<td><input type="radio" id="invest_other" name="invest_search"  class="spinner" value="investOther"/></td>
					<td>其它时间段：</td>
					<td>
						<input id="investStartTime" name="invest_Start" class="easyui-datetimebox" style="width: 100px;"  disabled="true" />
						-
						<input id="investEndTime" name="invest_End" class="easyui-datetimebox" style="width: 100px;"  disabled="true"/>
					</td>
					<td>
					    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="glacier.account_mgr.accountInvest_mgr.accountInvest.accountInvestDataGrid.datagrid('load',glacier.serializeObject($('#accountInvestSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('input:radio[name=invest_search]').attr('checked',false);glacier.account_mgr.accountInvest_mgr.accountInvest.accountInvestDataGrid.datagrid('load',{});">重置</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>

