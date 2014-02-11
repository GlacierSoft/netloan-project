<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.optgroup_mgr.optgroup');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupParam = {
			toolbarId : 'optgroupTreeGridToolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'single'}
			}
	};
		
	//初始化资源菜单optgroupTreeGrid
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid = $('#optgroupTreeGrid').treegrid({
		fit:true,//控件自动optgroupize占满窗口大小
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		url : ctx + '/do/optgroup/list.json',//请求的URL
		idField : 'optgroupId',
		treeField : 'optgroupName',//定义树节点字段
		parentField : 'optgroupPid',//treegrid父节点
		smooth: true,//该属性用以启用当前 easyui-treegrid 控件对平滑数据格式的支持,默认使用字段pid,可自定义
		enableHeaderClickMenu: false,//启用表头菜单
        enableHeaderContextMenu: true,//启用表头右键菜单
        enableRowContextMenu: false,//启用表行右键菜单
		rowTooltip: false, //表行数据提示
		toolbar : '#optgroupTreeGridToolbar',
		onSelect:function(rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupParam,this).select();
			if(rowData.optgroupId){//选中菜单的同时，根据菜单属性是否包含可用的URL进行对应的操作进行动态变更
				glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValuePropertyGrid.propertygrid('load',{
					optgroupId: rowData.optgroupId
				});
			}
		},
		onUnselectAll:function(rows){//取消选择行状态触发事件
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$.fn.treegrid.extensions.onLoadSuccess.apply(this, arguments);//这句一定要加上
			$(this).treegrid('unselectAll');
		},
		onDblClickRow: function(row){
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupDetails(row);
		},
		frozenColumns : [ [{//冻结列，当表格宽度压缩展示不全时候，该列不会缩小
			field : 'optgroupId' , title : 'ID' , hidden:true
		},{
			field : 'optgroupName' , title : '下拉项' , width : 150
		}]],
		columns : [ [{
			field : 'optgroupNum' , title : '排序' , width : 150
		},{
			field : 'remark' , title : '备注' , width : 150
		}]]
	});
	

	//定义下拉项值的toolbar的操作，对下拉项值操作进行控制
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueParam = {
			toolbarId : 'optgroupValueDataGridToolbar',
			optgroupValues : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	
	//初始化操作propertygrid
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValuePropertyGrid = $('#optgroupValueDataGrid').propertygrid({
		fit:true,//控件自动optgroupize占满窗口大小
		showGroup: true,
		scrollbarSize: 0,
		iconCls:'icon-save',//图标样式
		border:false,//是否存在边框
		fitColumns:true,//自动填充行
		nowrap: true,//禁止单元格中的文字自动换行
		autoRowHeight: false,//禁止设置自动行高以适应内容
		singleSelect:true,//限制单选
		checkOnSelect:false,//选择复选框的时候选择该行
		selectOnCheck:false,//选择的时候复选框打勾
		url: ctx + '/do/optgroupValue/optgroupValue/list.json',
		queryParams: {optgroupId: ''},//初始化的时候默认传递menuId为空的参数
		sortName: 'optgroupValueNum',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'optgroupValueId',
		toolbar : '#optgroupValueDataGridToolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueParam,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueParam,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueParam,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueParam,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueParam,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueParam,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).propertygrid('clearSelections');//清空选择行与勾选行
			$(this).propertygrid('clearChecked');
		},
		columns:[[
			{
				field:'optgroupValueId' , title:'ID' , checkbox:true
			},{
				field:'optgroupValueCode' , title:'下拉代码' , width:80
			},{
				field:'optgroupValueName' , title:'下拉名称' , width:80
			},{
				field : 'optgroupValueNum' , title : '排序' , width : 25
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 50,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true
	});
	
	/*
	新建/编辑 弹出框
	title:弹出框标题
	submitUrl：提交路径
	id:新增值为空字符串，编辑填写后台要获取的数据ID
	*/
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.newDialog = function(title,submitUrl,id){
		var iconCls = 'icon-standard-pencil-add';
		if(id){
			iconCls='icon-standard-pencil-go';
		}
		$.easyui.showDialog({
			href : ctx + '/do/optgroup/intoForm.htm?optgroupId='+id,//从controller请求jsp页面进行渲染
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
							glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid('reload');
							return true;
						}
						 
					}
				});
			}
		});
	};
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup = function(){
		glacier.basicdatas_mgr.optgroup_mgr.optgroup.newDialog(' 增加下拉项','/do/optgroup/add.json','');
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup = function(){
		var row = glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid("getSelected");
		glacier.basicdatas_mgr.optgroup_mgr.optgroup.newDialog(' 编辑【'+row.optgroupName+'】','/do/optgroup/edit.json',row.optgroupId);
	};
	
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup = function(){
		var row = glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid("getChecked");
		var optgroupId = row[0].optgroupId;
		if(optgroupId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/optgroup/del.json',
						   data: {optgroupId:optgroupId},
						   dataType:'json',
						   success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid('reload');
								}
								 
							}
					});
				}
			});
		}
	};
	
	/*
	新建/编辑 弹出框
	title:弹出框标题
	submitUrl：提交路径
	id:新增值为空字符串，编辑填写后台要获取的数据ID
	*/
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.newValueDialog = function(title,submitUrl,id){
		var iconCls = 'icon-standard-pencil-add';
		if(id){
			iconCls='icon-standard-pencil-go';
		}
		$.easyui.showDialog({
			href : ctx + '/do/optgroupValue/intoForm.htm?optgroupValueId='+id,//从controller请求jsp页面进行渲染
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
							glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid('reload');
							return true;
						}
						 
					}
				});
			}
		});
	};
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue = function(){
		glacier.basicdatas_mgr.optgroup_mgr.optgroup.newValueDialog(' 增加下拉项','/do/optgroup/add.json','');
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue = function(){
		var row = glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid("getSelected");
		glacier.basicdatas_mgr.optgroup_mgr.optgroup.newValueDialog(' 编辑','/do/optgroupValue/edit.json',row.optgroupValueId);
	};
</script>

<!-- 所有下拉项列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div data-options="region:'center',title:'下拉值管理',border:true">
    	<table id="optgroupValueDataGrid">
    		<glacierui:toolbar panelEnName="OptgroupValueList" toolbarId="optgroupValueDataGridToolbar" menuEnName="optgroup"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
    	</table>
    </div>
    <div data-options="region:'west',border:false,split:true" style="width:400px;">
    	<div class="easyui-layout" data-options="fit:true,border:false">
    		<div data-options="region:'center',title:'菜单管理',border:true">
    			<table id="optgroupTreeGrid">
		    		<glacierui:toolbar panelEnName="OptgroupTree" toolbarId="optgroupTreeGridToolbar" menuEnName="optgroup"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		    	</table>
    		</div>
    	</div>
    </div>		
</div>
