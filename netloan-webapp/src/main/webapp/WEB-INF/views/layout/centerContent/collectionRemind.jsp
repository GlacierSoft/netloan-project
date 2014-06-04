<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<script type="text/javascript">
	glacier.ns('glacier.layout.centerContent.collectionRemind');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	//初始化销售DataGrid
	glacier.layout.centerContent.collectionRemind.saleDataGrid = $("#collectionRemind_saleDataGrid").datagrid({
		fit:true,//控件自动resize占满窗口大小
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:false,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		striped: true,//true就是把行条纹化。（即奇偶行使用不同背景色）
		singleSelect:true,//限制单选
		checkOnSelect:true,//选择复选框的时候选择该行
		selectOnCheck:true,//选择的时候复选框打勾
		url: ctx + '/sale/list.html',//请求的URL
		sortName: 'saleCode',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'id',
		queryParams:{
			type: 'saler'
		},
		frozenColumns:[[//冻结列
               {
				field:'id',
				title:'ID',
				checkbox:true
			},{
				field:'saleCode',
				title:'销售编号',
				width:150,
				sortable:true
			}
		]],
		columns:[[
			{
				field:'payEventName',
				title:'付款事件',
				width:80
			},{
				field:'roomCode',
				title:'房间编号',
				width:150
			},{
				field:'saleStatus',
				title:'销售状态',
				width:80,
				formatter: function(value,row,index){
					return glacier.renderGridValue(value,fields.saleStatus);
				}
			},{
				field:'roomTotalPrice',
				title:'销售房款(元)',
				width:100,
   				formatter: function(value,row,index){//数据格式化
   					return formatNum(value);
   				}
			},{
				field:'discount',
				title:'折扣',
				width:60,
				sortable:true,
				formatter: function(value,row,index){
					if(null == value || 0 == value){
						return '无折扣';
					}else{
						return value;
					}
				}
			},{
				field:'expirePayTime',
				title:'本期收款时间',
				sortable:true,
				width:130
			},{
				field:'needCollect',
				title:'应收金额(元)',
				sortable:true,
				width:130,
   				formatter: function(value,row,index){//数据格式化
   					return formatNum(value);
   				}
			},{
				field:'collected',
				title:'已收金额(元)',
				width:130,
   				formatter: function(value,row,index){//数据格式化
   					return formatNum(value);
   				}
			},{
				field:'leaveCollect',
				title:'未收金额(元)',
				sortable:true,
				width:130,
   				formatter: function(value,row,index){//数据格式化
   					return formatNum(value);
   				}
			},{
				field:'clientId',
				title:'客户Id',
				hidden:true
			},{
				field:'clientName',
				title:'客户名称',
				width:70
			},{
				field:'clientIdCard',
				title:'客户证件号',
				width:150
			},{
				field:'saler',
				title:'销售员Id',
				hidden:true
			},{
				field:'salerName',
				title:'销售员[所属组织]',
				width:150
			},{
				field:'projectName',
				title:'所属项目',
				width:80
			},{
				field:'buildingName',
				title:'所属楼栋',
				width:60
			},{
				field:'creatorName',
				title:'录入者[所属组织]',
				width:150
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 5,//注意，pageSize必须在pageList存在
		pageList : glacier.getPageList(),//从session中获取
		rownumbers:true,//True 就会显示行号的列
		onSelect:function(rowIndex, rowData){//选择行事件触发
		}
	});
</script>
<div id="collectionRemind_saleDataGrid_panel" class="easyui-panel" title="欠款催收提醒"    
        style="width:700px;height:300px;background:#fafafa;"  
        data-options="iconCls:'icon-remind',closable:true,   
                collapsible:true,maximizable:true">  
	<table id="collectionRemind_saleDataGrid"></table>
</div>