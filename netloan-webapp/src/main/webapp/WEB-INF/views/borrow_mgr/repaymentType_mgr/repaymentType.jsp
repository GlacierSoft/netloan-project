<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.borrow_mgr.repaymentType_mgr.repaymentType');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.borrow_mgr.repaymentType_mgr.repaymentType.param = {
			toolbarId : 'repaymentTypeDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化还款方式DataGrid
	glacier.borrow_mgr.repaymentType_mgr.repaymentType.repaymentTypeDataGrid = $('#repaymentTypeDataGrid').datagrid({
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
		url: ctx + '/do/repaymentType/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'repaymentTypeId',
		columns:[[
			{
				field:'repaymentTypeId',
				title:'ID',
				checkbox:true
			},{
				field:'repaymentTypeName',
				title:'还款方式名称',
				width:120,
				sortable:true
			},{
				field:'algorithmInfo',
				title:'算法信息',
				width:160,
				sortable:true
			},{
				field:'state',
				title:'状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如open显示启用，close显示禁用
					return renderGridValue(value,fields.state);
				}
			},{
				field:'remark',
				title:'描述',
				width:130,
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
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		prepaymentTypeSize : 10,//注意，prepaymentTypeSize必须在prepaymentTypeList存在
		prepaymentTypeList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#repaymentTypeDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.repaymentType_mgr.repaymentType.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.repaymentType_mgr.repaymentType.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.repaymentType_mgr.repaymentType.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.borrow_mgr.repaymentType_mgr.repaymentType.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.borrow_mgr.repaymentType_mgr.repaymentType.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.borrow_mgr.repaymentType_mgr.repaymentType.param,this).unSelect();
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
				title: '【'+rowData.repaymentTypeName+'】详细信息',
				href : ctx + '/do/repaymentType/intoDetail.htm?repaymentTypeId='+rowData.repaymentTypeId,//从controller请求jsp页面进行渲染
				width : 530,
				height : 370,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	//点击增加按钮触发方法
	glacier.borrow_mgr.repaymentType_mgr.repaymentType.addRepaymentType = function(){
		glacier.basicAddOrEditDialog({
			title : '增加还款方式',
			width : 430,
			height : 350,
			queryUrl : ctx + '/do/repaymentType/intoForm.htm',
			submitUrl : ctx + '/do/repaymentType/add.json',
			successFun : function (){
				glacier.borrow_mgr.repaymentType_mgr.repaymentType.repaymentTypeDataGrid.datagrid('reload');
			}
		});
	};
	//点击编辑按钮触发方法
	glacier.borrow_mgr.repaymentType_mgr.repaymentType.editRepaymentType = function(){
		var row = glacier.borrow_mgr.repaymentType_mgr.repaymentType.repaymentTypeDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.repaymentTypeName+'】',
			width : 430,
			height : 350,
			queryUrl : ctx + '/do/repaymentType/intoForm.htm',
			submitUrl : ctx + '/do/repaymentType/edit.json',
			queryParams : {
				repaymentTypeId : row.repaymentTypeId
			},
			successFun : function (){
				glacier.borrow_mgr.repaymentType_mgr.repaymentType.repaymentTypeDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.borrow_mgr.repaymentType_mgr.repaymentType.delRepaymentType = function(){
		var rows = glacier.borrow_mgr.repaymentType_mgr.repaymentType.repaymentTypeDataGrid.datagrid("getChecked");
		var repaymentTypeIds = [];//删除的id标识
		var repaymentTypeNames = [];//还款方式主题
		for(var i=0;i<rows.length;i++){
			repaymentTypeIds.push(rows[i].repaymentTypeId);
			repaymentTypeNames.push(rows[i].repaymentTypeName);
		}
		if(repaymentTypeIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/repaymentType/del.json',
						   data: {repaymentTypeIds:repaymentTypeIds.join(','),repaymentTypeNames:repaymentTypeNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.borrow_mgr.repaymentType_mgr.repaymentType.repaymentTypeDataGrid.datagrid('reload');
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
	//还款方式资料模糊查询
	glacier.borrow_mgr.repaymentType_mgr.repaymentType.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.borrow_mgr.repaymentType_mgr.repaymentType.repaymentTypeDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有还款方式列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="repaymentTypeGridPanel" data-options="region:'center',border:true" >
		<table id="repaymentTypeDataGrid">
			<glacierui:toolbar panelEnName="RepaymentTypeList" toolbarId="repaymentTypeDataGrid_toolbar" menuEnName="repaymentType"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>