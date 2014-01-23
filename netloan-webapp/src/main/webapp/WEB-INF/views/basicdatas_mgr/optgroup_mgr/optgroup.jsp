<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.optgroup_mgr.optgroup');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//菜单选中
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupAlwaySelect = function(){
		$('#optgroup_btn_OptgroupTree_edit').linkbutton('enable');//菜单编辑按钮
		$('#optgroup_btn_OptgroupTree_del').linkbutton('enable');//菜单删除按钮
	};
	
	//菜单未选中
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupAlwayUnSelect = function(){
		$('#optgroup_btn_OptgroupTree_edit').linkbutton('disable');//菜单编辑按钮
		$('#optgroup_btn_OptgroupTree_del').linkbutton('disable');//菜单删除按钮
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
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupAlwaySelect();
			if(rowData.url){//选中菜单的同时，根据菜单属性是否包含可用的URL进行对应的操作进行动态变更
				glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValuePropertyGrid.propertygrid('load',{
					optgroupId: rowData.optgroupId
				});
			}
		},
		onUnselectAll:function(rows){//取消选择行状态触发事件
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupAlwayUnSelect();
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
	

	//选中的时候默认调用的方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwaySelect = function(){
		$('#optgroup_btn_ActionList_edit').linkbutton('enable');//编辑
	};
	
	//没选中的时候默认调用的方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayUnSelect = function(){
		$('#optgroup_btn_ActionList_edit').linkbutton('disable');//编辑
	};
	
	//勾选的时候默认调用的方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayCheck = function(){
		var rows = glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValuePropertyGrid.propertygrid("getChecked");
		if(rows.length > 0){//如果勾选的列大于0，则激活删除按钮
			$('#optgroup_btn_ActionList_del').linkbutton('enable');//删除
		}
	};
	
	//取消勾选的时候默认调用的方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayUnCheck = function(){
		var rows = glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValuePropertyGrid.propertygrid("getChecked");
		if(rows.length > 0){//如果勾选的列大于0，则激活删除按钮
			$('#optgroup_btn_ActionList_del').linkbutton('enable');//删除
		}else{
			$('#optgroup_btn_ActionList_del').linkbutton('disable');//删除
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
		queryParams: {menuId: ''},//初始化的时候默认传递menuId为空的参数
		sortName: 'optgroupValueNum',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'optgroupValueId',
		toolbar : '#optgroupValueDataGridToolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayCheck();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayCheck();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayUnCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayUnCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwaySelect();
		},
		onUnselectAll:function(rows){
			glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupValueAlwayUnSelect();
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
	
	//增加和修改下拉管理菜单
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.newDialog = function(title,optgroupId,url,loadType){
		$.easyui.showDialog({
			href : ctx + '/do/optgroup/intoForm.htm?optgroupId='+optgroupId,//从controller请求jsp页面进行渲染
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
						$('#optgroup_mgr_optgroup_form').form('submit', {
							url: ctx + url,
							success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid('reload');
								    dia.dialog("close"); 
								}
								 
							}
						});
					}
			}]
		});
	};
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup = function(){
		glacier.basicdatas_mgr.optgroup_mgr.optgroup.newDialog('增加下拉项','','/do/optgroup/add.json','load');
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup = function(){
		var row = glacier.basicdatas_mgr.optgroup_mgr.optgroup.optgroupTreeGrid.treegrid("getSelected");
		glacier.basicdatas_mgr.optgroup_mgr.optgroup.newDialog('编辑下拉项',row.optgroupId,'/do/optgroup/edit.json','reload');
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
