<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.message_mgr.note_mgr.note');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.message_mgr.note_mgr.note.param = {
			toolbarId : 'noteDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化广告DataGridglacier.message_mgr.note_mgr.note.emailDataGrid
	glacier.message_mgr.note_mgr.note.noteDataGrid = $('#noteDataGrid').datagrid({
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
		url: ctx + '/do/note/list.json',
		sortName: 'createrTime',//排序字段名称
		sortOrder: 'desc',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'noteId',
		columns:[[
			{
				field:'noteId',
				title:'ID',
				checkbox:true
			},{
				field:'noteTitle',
				title:'短信标题',
				width:280,
				sortable:true
			},{
				field:'noteType',
				title:'短信类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如enable显示启用，disable显示禁用
					return renderGridValue(value,fields.email);
				}
			},{
				field:'createrDisplay',
				title:'发送人',
				sortable:true,
				width:100
			},{
				field:'createrTime',
				title:'发送时间',
				sortable:true,
				width:200
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pemailSize : 10,//注意，pemailSize必须在pemailList存在
		pemailList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#noteDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.message_mgr.note_mgr.note.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.message_mgr.note_mgr.note.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.message_mgr.note_mgr.note.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.message_mgr.note_mgr.note.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.message_mgr.note_mgr.note.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.message_mgr.note_mgr.note.param,this).unSelect();
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
				title: "【"+rowData.noteTitle+"】的短信详情息",
				href : ctx + '/do/note/intoDetail.htm?noteId='+rowData.noteId,//从controller请求jsp页面进行渲染
				width : 720,
				height : 490,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	//点击增加按钮触发方法
	glacier.message_mgr.note_mgr.note.addNote = function(){
		glacier.message_mgr.note_mgr.note.newEmailDialog('短信发送',false,'/do/note/send.json');
	};
	
	glacier.message_mgr.note_mgr.note.newEmailDialog = function(title,editModel,url){
		$.easyui.showDialog({
			href : ctx + '/do/note/intoForm.htm',//从controller请求jsp页面进行渲染
			width : 830,
			height : 500,
			resizable: false,
			enableSaveButton : false,
			enableApplyButton : false,
			title : title,
			buttons : [{
				text : '发送',
				iconCls : 'icon-save',
				handler : function(dia) {
					var html=document.getElementById('editor_id').value;
					if(option == "candidate"&&arr.length > 0){//选择为部分群发并且arr数组大于0
						if(html == ""&&html.length == 0){
							alert("短信内容不能为空！");
						}else{
							$.messager.progress({
								title : "短信提示",
								text : "短信正在发送中..."
							}); 
							$('#note_mgr_note_form').form('submit', {
								url: ctx + url + "?arrys="+arr+"&textare="+html,
								success: function(r){
									glacier.show({msg:r.msg,result:r.success});
									glacier.message_mgr.note_mgr.note.noteDataGrid.datagrid('reload');
								    dia.dialog("close");
								    $.messager.progress('close');
								}
							});
						}
					}else if(option != "candidate"){//不选择部分群发时
						if(html == ""&&html.length == 0){
							alert("短信内容不能为空！");
						}else{
							$.messager.progress({
								title : "短信提示",
								text : "短信正在发送中..."
							}); 
							$('#note_mgr_note_form').form('submit', {
								url: ctx + url + "?arrys="+arr+"&textare="+html,
								success: function(r){
									glacier.show({msg:r.msg,result:r.success});
									glacier.message_mgr.note_mgr.note.noteDataGrid.datagrid('reload');
								    dia.dialog("close"); 
								    $.messager.progress('close');
								}
							});
						}
					}else if(option == "candidate"&&arr.length == 0){//选择为部分群发并且arr数组小于等于0
						alert("部分群发必须至少有一个联系会员!");
					}
				}
			}]
		});
	};
	
</script>

<!-- 所有广告列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="noteGridPanel" data-options="region:'center',border:true" >
		<table id="noteDataGrid">
			<glacierui:toolbar panelEnName="NoteList" toolbarId="noteDataGrid_toolbar" menuEnName="note"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>