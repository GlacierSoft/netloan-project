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
		sortOrder: 'desc',//升序还是降序
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
				sortable:true
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
				width:350,
				sortable:true
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:300
			},{
				field:'createTime',
				title:'创建时间',
				width:350,
				sortable:true
			},{
				field:'updaterDisplay',
				title:'更新人',
				width:300,
				sortable:true
			},{
				field:'updateTime',
				title:'更新时间',
				width:350,
			    sortable:true
			}]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
		pmemberList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#accountInvestDataGrid_toolbar',
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
				title:"投资统计详细信息",
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
	
	//点击生成按钮触发方法
	glacier.account_mgr.accountInvest_mgr.accountInvest.outExpAccountInvest= function(){
		//location.href=ctx+"/do/accountInvest/data.json";
		$.ajax({
  		   type:"post",
  		   url:ctx+"/do/accountInvest/data.json",
  		   dataType:"json",
  		   success:function(data){
  		    //数据打印
  		    console.info(data);
  		    //柱状图 
  		    $('#container').highcharts({
  		        chart: {
  		            type: 'column'
  		        },
  		        title: {
  		            text: '投资统计柱状图'
  		        },
  		        subtitle: {
  		            text: '投资统计报表'
  		        },
  		        xAxis: {
  		            categories: [
  		                '投资成功待收金额',
  		                '投资奖励金额',
  		                '逾期罚金金额',
  		                '成功金额',
  		                '借款管理费总额',
  		                '借款利息总额',
  		                '借款逾期罚金金额'
  		            ]
  		        },
  		        yAxis: {
  		            min: 0,
  		            title: {
  		                text: 'Rainfall (百万)'
  		            }
  		        },
  		       credits:{
  		        enabled:false // 禁用版权信息
  		       },
  		      tooltip: {
  	            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
  	            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
  	                '<td style="padding:0"><b>{point.y:.1f} 百万</b></td></tr>',
  	            footerFormat: '</table>',
  	            shared: true,
  	            useHTML: true
  	           },
  	           plotOptions: {
  		            column: {
  		                pointPadding: 0.2,
  		                borderWidth: 0
  		            }
  		        },
  		        series:data
  		    });
  		        
  		  $("#investOutExpDailogTest").dialog(
  				{
  					title : "会员投资统计信息报表生成",
  					width : 740,
  					height : 500,
  					modal : true,
  					closed : false
  				});	      
  		      
  		   }
  		});
 	};
	
	
	
	function doCheckQuery(){
		   
		//alert("用户自定义开始时间:"+$("#investStartTime").datetimebox('getValue')+"   用户自定义结束时间:"+$("#investEndTime").datetimebox('getValue'));
		var investStart=$("#investStartTime").datetimebox('getValue');
		var investEnd=$("#investEndTime").datetimebox('getValue');
		var investText=$('input:radio:checked').val();
	    var investTitle="【未知】投资统计信息查询";
	    
	    
	    if("investToday"==investText)
			  investTitle="【当日】投资统计信息查询";
		if("investMonth"==investText)
			  investTitle="【当月】投资统计信息查询";
		if("investYear"==investText)
			  investTitle="【当年】投资统计信息查询";
		if("investOther"==investText){
		    if(investStart&&investEnd){
		    	 investTitle="【"+investStart+"-"+investEnd+"】之间投资统计信息查询";
		    	 //alert("没问题那(开始至结束) !!!");
		    }if(investStart&&!investEnd){
		    	investTitle="【"+investStart+"】之后投资统计信息查询";
		    	//alert("没问题那(之后投资)");
		    }if(investEnd&&!investStart){
		    	investTitle="【"+investEnd+"】之前投资统计信息查询";
		    	//alert("没问题那(之前投资)");
		    }
		 }
		
		$("#investDailogTest").dialog({
			  title:investTitle,
			  width: 650,    
			  height: 230,
			  href : ctx + '/do/accountInvest/intoCheckQuery.htm?investStr='+$('input:radio:checked').val()+"&StartTime="+$("#investStartTime").datetimebox('getValue')+"&EndTime="+$("#investEndTime").datetimebox('getValue'),//从controller请求jsp页面进行渲染
			  modal: true,
		      closed: false   
		});
		
	}
	
	
	//地图查看
	glacier.account_mgr.accountInvest_mgr.accountInvest.MapAccountInvest= function(){
        //创建地图实列
		var map = new BMap.Map("allmap");
		map.centerAndZoom(new BMap.Point(113.606216,22.375557), 14);
		var marker1 = new BMap.Marker(new BMap.Point(113.606216,22.375557));  // 创建标注
		map.addOverlay(marker1);// 将标注添加到地图中
		//创建信息窗口
		var infoWindow1 = new BMap.InfoWindow("珠海冰川有限公司!!");
		marker1.addEventListener("click", function(){this.openInfoWindow(infoWindow1);});
		//对话框窗口
		$("#investMapDailogTest").dialog({
			  title:"查看地图",
			  width: 650,    
			  height: 450,
			  modal: true,
		      closed: false   
		});
	}
	
	//Radio验证
	$(document).ready(function(){    
		$("#invest_other").click(function(){
		    $("#investStartTime").datebox({ disabled: false});
		    $("#investEndTime").datebox({disabled:false});
		});
	   $("#invest_today").click(function(){
		   $("#investStartTime").datebox({ disabled: true});
		   $("#investEndTime").datebox({disabled:true});
		   $("#investStartTime").datebox('clear');
		   $("#investEndTime").datebox('clear');
		   
		});
	   $("#invest_month").click(function(){
		    $("#investStartTime").datebox({ disabled: true});
			$("#investEndTime").datebox({disabled:true});
			$("#investStartTime").datebox('clear');
			$("#investEndTime").datebox('clear');
		});
	    $("#invest_year").click(function(){
			$("#investStartTime").datebox({ disabled: true});
			$("#investEndTime").datebox({disabled:true});
			$("#investStartTime").datebox('clear');
			$("#investEndTime").datebox('clear');
	   });
	
	});
	
    //保存至EXCEL
	function doSaveInvestTest(){
		location.href=ctx+'/do/accountInvest/expCheck.json';	
	};
	
	
	
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
					<td><input type="radio" id="invest_other" name="invest_search"  class="spinner" value="investOther"  /></td>
					<td>其它时间段：</td>
					<td>
						<input id="investStartTime" name="invest_Start"  class="easyui-datetimebox" style="width: 100px;" disabled="true"  />
						-
						<input id="investEndTime" name="invest_End" class="easyui-datetimebox" style="width: 100px;" disabled="true"/>
					</td>
					<td>
					    <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-in',plain:true" onclick="doCheckQuery();">查询</a>
			            <a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'icon-standard-zoom-out',plain:true" onclick="$('input:radio[name=invest_search]').attr('checked',false);$('#investStartTime').datebox('clear'); $('#investEndTime').datebox('clear');$('#investStartTime').datebox({ disabled: true});$('#investEndTime').datebox({disabled:true});glacier.account_mgr.accountInvest_mgr.accountInvest.accountInvestDataGrid.datagrid('load',{});">重置</a>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>
<!--自定义对话款  -->
<div id="investDailogTest" class="easyui-dialog"  buttons="#dlg-buttons-invest" closed="true"></div>

<div id="dlg-buttons-invest">   
    <table cellpadding="0" cellspacing="0" style="width:100%">   
        <tr>   
            <td style="text-align:right">   
                <a href="#" class="easyui-linkbutton" iconCls="icon-save" onclick="doSaveInvestTest();">导出</a>   
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#investDailogTest').dialog('close');">关闭</a>   
            </td>   
        </tr>   
    </table>   
</div> 

<!--自定义对话款  -->
<div id="investOutExpDailogTest" class="easyui-dialog"  buttons="#dlg-buttons-invest-outExp" closed="true">
   <div id="container" style="min-width:700px;height:400px"></div>       
</div>

<div id="dlg-buttons-invest-outExp">   
    <table cellpadding="0" cellspacing="0" style="width:100%">   
        <tr>   
            <td style="text-align:right">   
                <a href="#" class="easyui-linkbutton" iconCls="icon-save" onclick="javascript:$('#investOutExpDailogTest').dialog('close');">确认</a>   
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#investOutExpDailogTest').dialog('close');">关闭</a>   
            </td>   
        </tr>   
    </table>   
</div> 

<!--百度地图  -->

<!--自定义对话款  -->
<div id="investMapDailogTest" class="easyui-dialog"  buttons="#Map-buttons-invest-map" closed="true">
   <div id="allmap" style="width: 600px;height: 350px;margin-top: 10px;margin-left: 15px;"></div>
</div>
<div id="Map-buttons-invest-map">   
    <table cellpadding="0" cellspacing="0" style="width:100%">   
        <tr>   
            <td style="text-align:right">   
                <a href="#" class="easyui-linkbutton" iconCls="icon-save" onclick="javascript:$('#investMapDailogTest').dialog('close');">确认</a>   
                <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#investMapDailogTest').dialog('close');">关闭</a>   
            </td>   
        </tr>   
    </table>   
</div> 



   


