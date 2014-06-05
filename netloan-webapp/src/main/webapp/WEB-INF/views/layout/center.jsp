<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入自定义权限标签 -->
<%@ taglib prefix="glacierui" uri="http://com.glacier.permissions.com.cn/tag/easyui"%>
<script type="text/javascript">

	$.util.namespace('glacier.website_mgr.announcement_mgr.announcement');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//初始化公告DataGrid
	glacier.website_mgr.announcement_mgr.announcement.announcementDataGrid = $('#announcementDataGrid').datagrid({
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
		url: ctx + '/do/announcement/list.json',
		sortName: 'webAnnNum',//排序字段名称
		sortOrder: 'DESC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'webAnnId',
		columns:[[
			{
				field:'webAnnId',
				title:'ID',
				checkbox:true
			},{
				field:'webAnnTheme',
				title:'公告主题',
				width:350,
				sortable:true
			},{
				field:'webAnnStatus',
				title:'公告状态',
				width:80,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如enable显示启用，disable显示禁用
					return renderGridValue(value,fields.status);
				}
			},{
				field:'webAnnNum',
				title:'排序号',
				width:80,
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
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pannouncementSize : 10,//注意，pannouncementSize必须在pannouncementList存在
		pannouncementList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.webAnnTheme,
				href : ctx + '/do/announcement/intoDetail.htm?webAnnId='+rowData.webAnnId,//从controller请求jsp页面进行渲染
				width : 720,
				height : 520,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
	
	$.util.namespace('glacier.website_mgr.news_mgr.news');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)
	
	//初始化新闻DataGrid
	glacier.website_mgr.news_mgr.news.newsDataGrid = $('#newsDataGrid').datagrid({
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
		url: ctx + '/do/news/list.json',
		sortName: 'webNewsNum',//排序字段名称
		sortOrder: 'ASC',//升序还是降序
		remoteSort: true,//开启远程排序，默认为false
		idField:'webNewsId',
		columns:[[
			{
				field:'webNewsId',
				title:'ID',
				checkbox:true
			},{
				field:'webNewsTheme',
				title:'新闻主题',
				width:350,
				sortable:true
			},{
				field:'webNewsStatus',
				title:'新闻状态',
				width:80,
				sortable:true,
				formatter: function(value,row,index){//数据格式化，例如enable显示启用，disable显示禁用
					return renderGridValue(value,fields.status);
				}
			},{
				field:'webNewsNum',
				title:'排序号',
				width:80,
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
			}
		]],
		pagination : true,//True 就会在 datagrid 的底部显示分页栏
		pnewsSize : 10,//注意，pnewsSize必须在pnewsList存在
		pnewsList : [2,10,50,100],//从session中获取
		rownumbers:true,//True 就会显示行号的列
		onLoadSuccess:function(index, record){//加载数据成功触发事件
			$(this).datagrid('clearSelections');
			$(this).datagrid('clearChecked');
		},
		onDblClickRow:function(rowIndex, rowData){
			$.easyui.showDialog({
				title: rowData.webNewsTheme,
				href : ctx + '/do/news/intoDetail.htm?webNewsId='+rowData.webNewsId,//从controller请求jsp页面进行渲染
				width : 720,
				height : 520,
				resizable: false,
				enableApplyButton : false,
				enableSaveButton : false
			});
		}
	});
</script>
<div style="margin:0px 10px 15px 0px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="审核管理"    
	        style="width:700px;height:300px;background:#fafafa;"> 
<!-- 借款管理 -->
<div style="float:left;margin:20px 10px 15px 20px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="借款管理"    
	        style="width:200px;height:150px;background:#fafafa;">  
		<table>
		<tr>
			<td>借款等待资料审核： </td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>借款初审审核：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>借款满标审核：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>申请债权转让：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>债权转让中：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
	</table>
	</div>
</div>
<!-- 认证管理 -->
<div style="float:left;margin:20px 10px 15px 0px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="认证管理"    
	        style="width:220px;height:150px;background:#fafafa;">  
		<table>
		<tr>
			<td>用户基本信息审核(待审核)： </td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>用户基本资料审核(待审核)：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>手机变更申请(审核中)：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>额度申请(审核中)：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>可选资料认证：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
	</table>
	</div>
</div>
<!-- 资金管理 -->
<div style="margin:20px 10px 15px 0px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="资金管理"    
	        style="width:220px;height:150px;background:#fafafa;">  
		<table>
		<tr>
			<td>等待审核的提现(审核中)： </td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>转账中的提现(转账中)：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
		<tr>
			<td>银行卡变更申请(审核中)：</td>
			<td>( <span style="color:red;">2</span> ) 条</td>
		</tr>
	</table>
	</div>
</div>
</div>
<!-- 公告展示 -->
<div style="float:left;margin:10px 10px 15px 0px;">
	<div id="announcementDataGridPanel" class="easyui-panel" title="公告展示"    
	        style="width:700px;height:340px;background:#fafafa;"  
	        data-options="iconCls:'icon-remind',closable:true,   
	                collapsible:true,maximizable:true">  
		<table id="announcementDataGrid"></table>
	</div>
</div>
<!-- 新闻展示 -->
<div style="margin:10px 10px 15px 0px;">
	<div id="newsDataGridPanel" class="easyui-panel" title="新闻展示"    
	        style="width:700px;height:340px;background:#fafafa;"  
	        data-options="iconCls:'icon-remind',closable:true,   
	                collapsible:true,maximizable:true">  
		<table id="newsDataGrid"></table>
	</div>
</div>
