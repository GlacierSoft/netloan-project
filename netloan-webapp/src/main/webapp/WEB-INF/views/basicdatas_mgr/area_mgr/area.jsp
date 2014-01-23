<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.area_mgr.area');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//菜单选中
	glacier.basicdatas_mgr.area_mgr.area.areaAlwaySelect = function(){
		$('#area_btn_AreaTree_edit').linkbutton('enable');//菜单编辑按钮
		$('#area_btn_AreaTree_del').linkbutton('enable');//菜单删除按钮
	};
	
	//菜单未选中
	glacier.basicdatas_mgr.area_mgr.area.areaAlwayUnSelect = function(){
		$('#area_btn_AreaTree_edit').linkbutton('disable');//菜单编辑按钮
		$('#area_btn_AreaTree_del').linkbutton('disable');//菜单删除按钮
	};
	
	//初始化资源菜单areaTreeGrid
	glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid = $('#areaTreeGrid').treegrid({
		fit:true,//控件自动areaize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		url : ctx + '/do/area/list.json',//请求的URL
		idField : 'areaId',
		treeField : 'areaName',//定义树节点字段
		parentField : 'areaPid',//treegrid父节点
		smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
		enableHeaderClickMenu: false,//启用表头菜单
        enableHeaderContextMenu: true,//启用表头右键菜单
        enableRowContextMenu: false,//启用表行右键菜单
		rowTooltip: false, //表行数据提示
		toolbar : '#areaTreeGridToolbar',
		onSelect:function(rowData){//选择行事件触发
			glacier.basicdatas_mgr.area_mgr.area.areaAlwaySelect();
		},
		onUnselectAll:function(rows){//取消选择行状态触发事件
			glacier.basicdatas_mgr.area_mgr.area.areaAlwayUnSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$.fn.treegrid.extensions.onLoadSuccess.apply(this, arguments);//这句一定要加上
			$(this).treegrid('unselectAll');
		},
		onDblClickRow: function(row){
			glacier.basicdatas_mgr.area_mgr.area.areaDetails(row);
		},
		frozenColumns : [ [{//冻结列，当表格宽度压缩展示不全时候，该列不会缩小
			field : 'areaId' , title : 'ID' , hidden:true
		},{
			field : 'areaName' , title : '地区' , width : 150
		}]],
		columns : [ [{
			field : 'areaNum' , title : '排序' , width : 150
		},{
			field : 'remark' , title : '备注' , width : 150
		}]]
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
								$.messager.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid('reload');
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
		var row = glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid("getSelected");
		glacier.basicdatas_mgr.area_mgr.area.newDialog('编辑地区',row.areaId,'/do/area/edit.json','reload');
	};
	
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.area_mgr.area.delArea = function(){
		var row = glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid("getChecked");
		var areaId = row[0].areaId;
		if(areaId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/area/del.json',
						   data: {areaId:areaId},
						   dataType:'json',
						   success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.area_mgr.area.areaTreeGrid.treegrid('reload');
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
   			<table id="areaTreeGrid">
	    		<glacierui:toolbar panelEnName="AreaTree" toolbarId="areaTreeGridToolbar" menuEnName="area"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
	    	</table>
   		</div>
</div>
