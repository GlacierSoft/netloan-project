<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.statistics_mgr.statistics');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.statistics_mgr.statistics.param = {
			toolbarId : 'statisticsDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'},
				exp:{flag:'exp'},
			}
	};
	
	//初始化会员财务统计DataGrid
	glacier.member_mgr.statistics_mgr.statistics.statisticsDataGrid = $('#statisticsDataGrid').datagrid({
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
		url: ctx + '/do/memberStatistics/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'statisticsId',
		columns:[[
			{
				field:'statisticsId',
				title:'ID',
				checkbox:true
			},{
				field:'memberRealName',
				title:'会员名称',
				width:70,
				sortable:true
			},{
				field:'totalBorrowings',
				title:'借款总额',
				width:70,
				sortable:true
			},{
				field:'cumulativeLossProfit',
				title:'累计亏盈',
				width:70,
				sortable:true
			},{
				field:'alreadyTotal',
				title:'已还总额',
				width:70,
				sortable:true
			},{
				field:'waitAlsoTotal',
				title:'待还总额',
				width:70,
				sortable:true
			},{
				field:'borrowSuccess',
				title:'借款成功次数',
				width:90,
				sortable:true
			},{
				field:'normalRepayment',
				title:'正常还款次数',
				width:90,
				sortable:true
			},{
				field:'advanceRepayment',
				title:'提前还款次数',
				width:90,
				sortable:true
			},{
				field:'lateRepayment',
				title:'逾期还款次数',
				sortable:true,
				width:90
			},{
				field:'websiteSubstitute',
				title:'网站代还次数',
				sortable:true,
				width:90
			},{
				field:'successTender',
				title:'投标成功次数',
				sortable:true,
				width:90
			},{
				field:'investmentTotal',
				title:'投资总额',
				sortable:true,
				width:70
			},{
				field:'tenderAwards',
				title:'投标奖励',
				sortable:true,
				width:70
			},{
				field:'alreadyIncomeTotal',
				title:'已收总额',
				sortable:true,
				width:70
			},{
				field:'waitIncomeTotal',
				title:'待收总额',
				sortable:true,
				width:70
			}, 
			  {     /**xinzen**/
				field:'alreadyPrincipal',
				title:'已还本金',
				sortable:true,
				width:70
		 	},{    
				field:'waitAlsoPrincipal',
				title:'待还本金',
				sortable:true,
				width:70
		 	},{    
				field:'alreadyInterest',
				title:'已还利息',
				sortable:true,
				width:70
		 	},{    
				field:'waitAlsoInterest',
				title:'待还利息',
				sortable:true,
				width:70
		 	},{    
				field:'alreadyIncomePrincipal',
				title:'已收本金',
				sortable:true,
				width:70
		 	},{    
				field:'waitIncomePrincipal',
				title:'待收本金',
				sortable:true,
				width:70
		 	},{    
				field:'alreadyIncomeInterest',
				title:'已收本息',
				sortable:true,
				width:70
		 	},{    
				field:'waitIncomeInterest',
				title:'待收本息',
				sortable:true,
				width:70
		 	},  {    
				field:'overdueFineAmount',
				title:'逾期罚款金额',
				sortable:true,
				width:70
		 	}, {    
				field:'overdueInterestAmount',
				title:'逾期利息总额',
				sortable:true,
				width:70
		 	}, {    
				field:'loanManagementAmount',
				title:'借款管理费',
				sortable:true,
				width:70
		 	},
		 	 {    
				field:'loanInterestAmount',
				title:' 借款利息总额',
				sortable:true,
				width:70  //end
		 	}, {
				field:'promotionAwards',
				title:'推广奖励',
				sortable:true,
				width:70
			},{
				field:'uplineDeltaAwards',
				title:'线下冲值奖励',
				sortable:true,
				width:90
			},{
				field:'continueAwards',
				title:'续投奖励',
				sortable:true,
				width:70
			},{
				field:'updateTime',
				title:'统计时间',
				sortable:true,
				width:100
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pstatisticsSize : 10,//注意，pstatisticsSize必须在pstatisticsList存在
		pstatisticsList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#statisticsDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.statistics_mgr.statistics.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.statistics_mgr.statistics.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.statistics_mgr.statistics.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.statistics_mgr.statistics.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.statistics_mgr.statistics.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.statistics_mgr.statistics.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: '【'+rowData.memberRealName+'】会员统计详细信息',
				href : ctx + '/do/memberStatistics/intoDetail.htm?statisticsId='+rowData.statisticsId,//从controller请求jsp页面进行渲染
				width : 600,
				height : 553,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
		
/* 		//客服资料模糊查询
	 	glacier.member_mgr.member_mgr.member.quickquery = function(value, name) {
			var obj = $.parseJSON('{"' + name + '":"' + value + '"}');//将值和对象封装成obj作为参数传递给后台
			glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('load',obj);
		};  */
	});
	
	 
	//点击导出按钮触发方法
	glacier.member_mgr.statistics_mgr.statistics.expStatistics= function(){
		location.href=ctx+"/do/memberStatistics/exp.json";
	};  
	 
	
</script>

<!-- 所有会员财务统计列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="statisticsGridPanel" data-options="region:'center',border:true" >
		<table id="statisticsDataGrid">
		   <glacierui:toolbar panelEnName="StatisticsList" toolbarId="statisticsDataGrid_toolbar" menuEnName="memberStatistics"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
	<div data-options="region:'north',split:true"
		style="height: 40px; padding-left: 10px;">
		<form id="statisticsSearchForm">
			<table>
				<tr>
					<td>会员名称：</td>
					<td><input name="memberRealName" style="width: 80px;"
						class="spinner" /></td>
				    <td>统计时间：</td>
					<td><input name="createStartTime" class="easyui-datetimebox"
						style="width: 100px;" /> - <input name="createEndTime"
						class="easyui-datetimebox" style="width: 100px;" /></td>
					<td><a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-in',plain:true"
						onclick="glacier.member_mgr.statistics_mgr.statistics.statisticsDataGrid.datagrid('load',glacier.serializeObject($('#statisticsSearchForm')));">查询</a>
						<a href="javascript:void(0);" class="easyui-linkbutton"
						data-options="iconCls:'icon-standard-zoom-out',plain:true"
						onclick="$('#statisticsSearchForm input').val('');glacier.member_mgr.statistics_mgr.statistics.statisticsDataGrid.datagrid('load',{});">重置条件</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>