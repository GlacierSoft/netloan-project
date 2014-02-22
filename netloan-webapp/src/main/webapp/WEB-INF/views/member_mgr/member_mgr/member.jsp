<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>

<script type="text/javascript">

	$.util.namespace('glacier.member_mgr.member_mgr.member');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//定义toolbar的操作，对操作进行控制
	glacier.member_mgr.member_mgr.member.param = {
			toolbarId : 'memberDataGrid_toolbar',
			actions : {
				edit:{flag:'edit',controlType:'single'},
				del:{flag:'del',controlType:'multiple'}
			}
	};
	
	//初始化客服DataGrid
	glacier.member_mgr.member_mgr.member.memberDataGrid = $('#memberDataGrid').datagrid({
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
		url: ctx + '/do/member/list.json',
		sortName: 'createTime',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'memberId',
		columns:[[
			{
				field:'memberId',
				title:'ID',
				checkbox:true
			},{
				field:'memberName',
				title:'会员名称',
				width:120,
				sortable:true
			},{
				field:'memberRealName',
				title:'会员真实姓名',
				width:120,
				sortable:true
			},{
				field:'status',
				title:'状态',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.status);
				}
			},{
				field:'type',
				title:'类型',
				width:120,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如man显示是，woman显示女
					return renderGridValue(value,fields.type);
				}
			},{
				field:'creditIntegral',
				title:'信用积分',
				width:120,
				sortable:true
			},{
				field:'integral',
				title:'积分',
				width:120,
				sortable:true
			},{
				field:'mobileNumber',
				title:'手机号码',
				width:120,
				sortable:true,
			},{
				field:'cardId',
				title:'身份证',
				width:120,
				sortable:true
			},{
				field:'createrDisplay',
				title:'录入人',
				sortable:true,
				width:100
			},{
				field:'createTime',
				title:'录入时间',
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
		pmemberSize : 10,//注意，pmemberSize必须在pmemberList存在
		pmemberList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		toolbar:'#memberDataGrid_toolbar',
		onCheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.member_mgr.member.param,this).check();
		},
		onCheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.member_mgr.member.param,this).check();
		},
		onUncheck:function(rowIndex,rowData){//选择行事件触发
			action_controller(glacier.member_mgr.member_mgr.member.param,this).unCheck();
		},
		onUncheckAll:function(rows){//取消勾选行状态触发事件
			action_controller(glacier.member_mgr.member_mgr.member.param,this).unCheck();
		},
		onSelect:function(rowIndex, rowData){//选择行事件触发
			action_controller(glacier.member_mgr.member_mgr.member.param,this).select();
		},
		onUnselectAll:function(rows){
			action_controller(glacier.member_mgr.member_mgr.member.param,this).unSelect();
		},
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.memberName,
				href : ctx + '/do/member/intoDetail.htm?memberId='+rowData.memberId,//从controller请求jsp页面进行渲染
				width : 840,
				height : 450,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});

	//点击增加按钮触发方法
	glacier.member_mgr.member_mgr.member.addMember = function(){
		glacier.basicAddOrEditDialog({
			title : '增加会员信息',
			width : 840,
			height : 450,
			queryUrl : ctx + '/do/member/intoForm.htm',
			submitUrl : ctx + '/do/member/add.json',
			successFun : function (){
				glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('reload');
			}
		});
	};
	
	//点击编辑按钮触发方法
	glacier.member_mgr.member_mgr.member.editMember = function(){
		var row = glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid("getSelected");
		glacier.basicAddOrEditDialog({
			title : '编辑【'+row.memberName+'】',
			width : 840,
			height : 450,
			queryUrl : ctx + '/do/member/intoForm.htm',
			submitUrl : ctx + '/do/member/edit.json',
			queryParams : {
				memberId : row.memberId
			},
			successFun : function (){
				glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('reload');
			}
		});
	};
	//点击删除按钮触发方法
	glacier.member_mgr.member_mgr.member.delMember = function(){
		var rows = glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid("getChecked");
		var memberIds = [];//删除的id标识
		var memberNames = [];//客服主题
		for(var i=0;i<rows.length;i++){
			memberIds.push(rows[i].memberId);
			memberNames.push(rows[i].memberName);
		}
		if(memberIds.length > 0){
			$.messager.confirm('请确认', '是否要删除该记录', function(r){
				if (r){
					$.ajax({
						   type: "POST",
						   url: ctx + '/do/member/del.json',
						   data: {memberIds:memberIds.join(','),memberNames:memberNames.join(',')},
						   dataType:'json',
						   success: function(r){
							   if(r.success){//因为失败成功的方法都一样操作，这里故未做处理
								   $.messager.show({
										title:'提示',
										timeout:3000,
										msg:r.msg
									});
								   glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('reload');
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
	//客服资料模糊查询
	glacier.member_mgr.member_mgr.member.quickquery = function(value,name){
		var obj = $.parseJSON('{"'+name+'":"'+value+'"}');//将值和对象封装成obj作为参数传递给后台
		glacier.member_mgr.member_mgr.member.memberDataGrid.datagrid('load',obj);
	};
	
</script>

<!-- 所有客服列表面板和表格 -->
<div class="easyui-layout" data-options="fit:true">
	<div id="memberGridPanel" data-options="region:'center',border:true" >
		<table id="memberDataGrid">
			<glacierui:toolbar panelEnName="MemberList" toolbarId="memberDataGrid_toolbar" menuEnName="member"/><!-- 自定义标签：自动根据菜单获取当前用户权限，动态注册方法 -->
		</table>
	</div>
</div>