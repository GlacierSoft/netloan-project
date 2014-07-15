<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制 
	glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.param = {
			toolbarId : 'parameterBasicDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化角色DataGrid
	glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.parameterBasicDataGrid = $('#parameterBasicDataGrid').datagrid({
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
		url: ctx + '/do/parameterBasic/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'basicId',
		columns:[[
			{
				field:'basicId',
				title:'ID',
				checkbox:true
			},{
				field:'basicTitle',
				title:'基础参数名称',
				width:120,
				sortable:true
			},{
				field:'basicValue',
				title:'基础参数值',
				width:120,
				sortable:true
			},{
				field:'createrDisplay',
				title:'创建人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'创建时间',
				sortable:true,
				width:200
			},{
				field:'updaterDisplay',
				title:'更新人',
				sortable:true,
				width:100
			},{
				field:'updateTime',
				title:'更新时间',
				sortable:true,
				width:200
			},{
				field:'remark',
				title:'备注',
				width:120,
				sortable:true
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pageSize : 10,//注意，pageSize必须在pageList存在
		pageList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#parameterBasicDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//在用户勾选一行的时候触发事件
			action_controller(glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.param,this).check();
		},
		onCheckAll:function(rows){//在用户勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//在用户取消勾选一行的时候触发
			action_controller(glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.param,this).unCheck();
		},
		onUncheckAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//在用户选择一行的时候触发
			action_controller(glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.param,this).select();
		},
		onUnselectAll:function(rows){//在用户取消勾选所有行的时候触发
			action_controller(glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.param,this).unSelect();
		},
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
				title: "【"+rowData.basicTitle+"】的基础参数详细信息",
				href : ctx + '/do/parameterBasic/intoDetail.htm?basicId='+rowData.basicId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 260,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.addParameterBasic = function(){
		glacier.basicAddOrEditDialog({
			title : '【基础参数】- 增加',
			width : 430,
			height : 290,
			queryUrl : ctx + '/do/parameterBasic/intoForm.htm',
			submitUrl : ctx + '/do/parameterBasic/add.json',
			successFun : function (){
				glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.parameterBasicDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.editParameterBasic = function(){
		var row = glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.parameterBasicDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '【基础参数】- 编辑('+row.basicTitle+')',
			width : 430,
			height : 290,
			queryUrl : ctx + '/do/parameterBasic/intoForm.htm',
			submitUrl : ctx + '/do/parameterBasic/edit.json',
			queryParams : {
				basicId : row.basicId
			},
			successFun : function (){
				glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.parameterBasicDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.delParameterBasic = function(){
		var rows = glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.parameterBasicDataGrid.datagrid("getChecked");
		var basicIds = [];//删除的id标识
		var basicTitles = [];//日志记录引用名称
		for(var i =0;i<rows.length;i++){
			basicIds.push(rows[i].basicId);
			basicTitles.push(rows[i].basicTitle);
		}
		if(basicIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/parameterBasic/del.json',
						   data: {basicIds:basicIds.join(','),basicTitles:basicTitles.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.parameterBasicDataGrid.datagrid('reload');
							   }else{
									$.messager.show({//后台验证弹出错误提示信息框
										title:'错误提示',
										width:380,
										height:120,
										msg: '<span style="color:red">'+r.msg+'<span>',
										timeout:4500
									});
								}
						   }
					});
				}
			});
		}
	};
</script>

<!-- 所有角色列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="creditGridPanel" data-options="region:'center',border:true" >
		<table id="parameterBasicDataGrid">
			<glacierui:toolbar panelEnName="ParameterBasicList" toolbarId="parameterBasicDataGrid_toolbar" menuEnName="parameterBasic"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>
