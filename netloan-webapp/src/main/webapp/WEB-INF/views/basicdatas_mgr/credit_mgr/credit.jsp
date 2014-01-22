<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.basicdatas_mgr.credit_mgr.credit');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	
	//初始化角色DataGrid
	glacier.basicdatas_mgr.credit_mgr.credit.creditDataGrid = $('#creditDataGrid').datagrid({
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
		url: ctx + '/do/credit/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'id',
		columns:[[
			{
				field:'id',
				title:'ID',
				checkbox:true
			},{
				field:'creditName',
				title:'会员信用等级名称',
				width:120,
				sortable:true
			},{
				field:'creditBeginIntegral',
				title:'会员开始积分',
				width:120,
				sortable:true
			},{
				field:'creditEndIntegral',
				title:'会员结束积分',
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
		toolbar:'#creditDataGrid_toolbar'
	});
	
	glacier.basicdatas_mgr.credit_mgr.credit.newDialog = function(title,creditId,url,loadType){
		$.easyui.showDialog({
			href : ctx + '/do/credit/intoForm.htm?creditId='+creditId,//从controller请求jsp页面进行渲染
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
						$('#credit_mgr_credit_form').form('submit', {
							url: ctx + url,
							success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.credit_mgr.credit.creditDataGrid.datagrid('reload');
								    dia.dialog("close"); 
								}
								 
							}
						});
					}
			}]
		});
	};
	
	//点击增加按钮触发方法
	glacier.basicdatas_mgr.credit_mgr.credit.addCredit = function(){
		glacier.basicdatas_mgr.credit_mgr.credit.newDialog('增加会员信用级别','','/do/credit/add.json','load');
	};
	//点击编辑按钮触发方法
	glacier.basicdatas_mgr.credit_mgr.credit.editCredit = function(){
		var row = glacier.basicdatas_mgr.credit_mgr.credit.creditDataGrid.datagrid("getSelected");
		glacier.basicdatas_mgr.credit_mgr.credit.newDialog('编辑会员信用级别',row.creditId,'/do/credit/edit.json','reload');
	};
	//点击删除按钮触发方法
	glacier.basicdatas_mgr.credit_mgr.credit.delCredit = function(){
		var row = glacier.basicdatas_mgr.credit_mgr.credit.creditDataGrid.datagrid("getChecked");
		var creditId = row[0].creditId;
		if(creditId){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/credit/del.json',
						   data: {creditId:creditId},
						   dataType:'json',
						   success: function(r){
								$.messager.show(r.msg);
								if(r.success){
									glacier.basicdatas_mgr.credit_mgr.credit.creditDataGrid.datagrid('reload');
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
		<table id="creditDataGrid">
			<glacierui:toolbar panelEnName="creditList" toolbarId="creditDataGrid_toolbar" menuEnName="credit"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>
