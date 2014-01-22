<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.area_mgr.area');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	
	//初始化地区DataGrid
	glacier.basicdatas_mgr.area_mgr.area.areaDataGrid = $('#areaDataGrid').datagrid({
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
		url: ctx + '/do/area/list.json',
		sortName: 'areaName',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'id',
		columns:[[
			{
				field:'id',
				title:'ID',
				checkbox:true
			},{
				field:'areaName',
				title:'会员年龄别名',
				width:120,
				sortable:true
			},{
				field:'areaBegin',
				title:'开始年龄',
				width:120,
				sortable:true
			},{
				field:'areaEnd',
				title:'结束年龄',
				width:120,
				sortable:true
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			},{
				field:'createTime',
				title:'录入时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#areaDataGrid_toolbar'
	});
	
	glacier.basicdatas_mgr.area_mgr.area.newDialog = function(title,areaId,url,loadType){
		$.easyui.showDialog({
			href : ctx + '/do/area/intoForm.htm?areaId='+areaId,//从controller请求jsp页面进行渲染
			width : 450,
			height : 300,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			title : title,
			buttons : [ 
			 {
				text : '保存',
				iconCls : 'icon-save',
				handler : function(dia) {
						$('#area_mgr_area_form').form('submit', {
							url: ctx + url,
							success: function(r){
								$.messarear.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.area_mgr.area.areaDataGrid.datagrid('reload');
								    dia.dialog("close"); 
								}
								 
							}
						});
					}
			}]
		});
	};
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.area_mgr.area.addArea = function(){
		glacier.basicdatas_mgr.area_mgr.area.newDialog('增加地区','','/do/area/add.json','load');
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.area_mgr.area.editArea = function(){
		var row = glacier.basicdatas_mgr.area_mgr.area.areaDataGrid.datagrid("getSelected");
		glacier.basicdatas_mgr.area_mgr.area.newDialog('编辑地区',row.areaId,'/do/area/edit.json','reload');
	};
	
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.area_mgr.area.delArea = function(){
		var row = glacier.basicdatas_mgr.area_mgr.area.areaDataGrid.datagrid("getChecked");
		var areaId = row[0].areaId;
		if(areaId){
			$.messarear.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/area/del.json',
						   data: {areaId:areaId},
						   dataType:'json',
						   success: function(r){
								$.messarear.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.area_mgr.area.areaDataGrid.datagrid('reload');
								}
								 
							}
					});
				}
			});
		}
	};
</script>

<!-- 所有地区列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="areaGridPanel" data-options="region:'center',border:true" >
		<table id="areaDataGrid">
			<glacierui:toolbar panelEnName="AreaList" toolbarId="areaDataGrid_toolbar" menuEnName="area"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>
