<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript">

	$.util.namespace('glacier.website_mgr.nav_mgr.nav');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.website_mgr.nav_mgr.nav.navParam = {
			toolbarId : 'navTreeGridToolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'single'}
			}
	};
		
	//初始化资源菜单navTreeGrid
	glacier.website_mgr.nav_mgr.nav.navTreeGrid = $('#navTreeGrid').treegrid({
		fit:true,//控件自动navize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		url : ctx + '/do/nav/list.json',//请求的URL
		idField : 'webNavId',
		treeField : 'webNavName',//定义树节点字段
		parentField : 'webNavPid',//treegrid父节点
		smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
		enableHeaderClickMenu: false,//启用表头菜单
        enableHeaderContextMenu: true,//启用表头右键菜单
        enableRowContextMenu: false,//启用表行右键菜单
		rowTooltip: false, //表行数据提示
		toolbar : '#navTreeGridToolbar',
		onSelect:function(rowData){//选择行事件触发
			action_controller(glacier.website_mgr.nav_mgr.nav.navParam,this).select();
			if(rowData.url){//选中菜单的同时，根据菜单属性是否包含可用的URL进行对应的操作进行动态变更
				glacier.website_mgr.nav_mgr.nav.actionPropertyGrid.propertygrid('load',{
					webNavId: rowData.webNavId
				});
				glacier.website_mgr.nav_mgr.nav.panelDataGrid.datagrid('load',{
					webNavId: rowData.webNavId
				});
			}
		},
		onUnselectAll:function(rows){//取消选择行状态触发事件
			action_controller(glacier.website_mgr.nav_mgr.nav.navParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$.fn.treegrid.extensions.onLoadSuccess.apply(this, arguments);//这句一定要加上
			$(this).treegrid('unselectAll');
		},
		onDblClickRow: function(row){
			glacier.website_mgr.nav_mgr.nav.navDetails(row);
		},
		frozenColumns : [ [{//冻结列，当表格宽度压缩展示不全时候，该列不会缩小
			field : 'webNavId' , title : 'ID' , hidden:true
		},{
			field : 'webNavName' , title : '导航' , width : 150
		}]],
		columns : [ [{
			field : 'webNavNum' , title : '排序' , width : 150
		},{
			field : 'remark' , title : '备注' , width : 150
		}]]
	});
	
	/*
	新建/编辑 弹出框
	title:弹出框标题
	submitUrl：提交路径
	id:新增值为空字符串，编辑填写后台要获取的数据ID
	*/
	glacier.website_mgr.nav_mgr.nav.newDialog = function(title,submitUrl,id){
		var iconCls = 'icon-standard-pencil-add';
		if(id){
			iconCls='icon-standard-pencil-go';
		}
		$.easyui.showDialog({
			href : ctx + '/do/nav/intoForm.htm?webNavId='+id,//从controller请求jsp页面进行渲染
			width : 400,
			height : 280,
			resizable: false,
			enableApplyButton : false,
			title : title,
			iconCls : iconCls,
			onSave : function(){
				$(this).find('form').form('submit', {
					url: ctx + submitUrl,
					success: function(r){
						$.messager.show(r.msg);
						if(r.success){
							glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid('reload');
							return true;
						}
						 
					}
				});
			}
		});
	};
	//点击增加按钮触发方法
	glacier.website_mgr.nav_mgr.nav.addNav = function(){
		glacier.website_mgr.nav_mgr.nav.newDialog(' 增加会员年龄别称','/do/nav/add.json','');
	};
	//点击编辑按钮触发方法
	glacier.website_mgr.nav_mgr.nav.editNav = function(){
		var row = glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid("getSelected");
		glacier.website_mgr.nav_mgr.nav.newDialog(' 编辑【'+row.webNavName+'】','/do/nav/edit.json',row.webNavId);
	};
	//点击删除按钮触发方法
	glacier.website_mgr.nav_mgr.nav.delNav = function(){
		var row = glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid("getChecked");
		var webNavId = row[0].webNavId;
		if(webNavId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/nav/del.json',
						   data: {webNavId:webNavId},
						   dataType:'json',
						   success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.website_mgr.nav_mgr.nav.navTreeGrid.treegrid('reload');
								}
								 
							}
					});
				}
			});
		}
	};
</script>

<!-- 所有导航列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
   		<div id="navGridPanel" data-options="region:'center',border:true" >
   			<table id="navTreeGrid">
	    		<glacierui:toolbar panelEnName="NavTree" toolbarId="navTreeGridToolbar" menuEnName="nav"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
	    	</table>
   		</div>
</div>
