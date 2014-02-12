<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>冰川基本系统</title>
		<!-- 引入公用的js和样式库 -->
		<jsp:include page="inc.jsp"/>
		<script type="text/javascript" charset="utf-8">
			$(function(){
				
				var userInfoDetailStr = '<table class="formtable" style="font-weight: bold;">'+
											'<tr><td>上次登录时间：</td><td><span class="label label-warning">${currentUser.lastLoginFormatTime}</span></td></tr>'+
											'<tr><td>上次登录IP：</td><td><span class="label label-warning">${currentUser.lastLoginIpAddress}<span></td></tr>'+
											'<tr><td>登录次数：</td><td><span class="label label-success">${currentUser.loginCount}</span></td></tr>'+
										'</table>';
				//用户登录信息显示
				$('.user').tooltip({
				    content: userInfoDetailStr,
				    showDelay:50
				});
				
				//初始化导航
				$('#layout_west_tree').tree({
					url : ctx +'/do/auth/getPrincipalUserMenu.json',
					smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
					lines : true,
					onClick : function(node) {
						var url = node.attributes.url;
						if (url && url!='') {//获取树节点中自定义属性的url属性
							$("#layout_center_panel").panel("setTitle",node.text);
							$('#layout_center_panel').panel('refresh',ctx + url);
						}
					}
				});
				
				//全屏切换
				$("#btnFullScreen").click(function (){
		            if ($.util.supportsFullScreen) {
		                if ($.util.isFullScreen()) {
		                    $.util.cancelFullScreen();
		                } else {
		                    $.util.requestFullScreen();
		                }
		            } else {
		                $.easyui.messager.show("当前浏览器不支持全屏 API，请更换至最新的 Chrome/Firefox/Safari 浏览器或通过 F11 快捷键进行操作。");
		            }
		        });
				
				//用户注销
				$("#logout").click(function (){
					$.messager.confirm('请确认', '安全退出系统？', function(r){
						if (r){
							window.location.href = ctx + '/do/login.htm';
						}
					});
				});
				
				//主页
				$("#home").click(function (){
					$("#layout_center_panel").panel("setTitle",'主页');
					//$('#layout_center_panel').panel('refresh',url);
				});
				
				editCurrentUserPwd = function(){
					alert("修改密码");
				};
				
				checkAuth = function(){
					alert("查看权限");
				};
				
			});
			
		</script>
	</head>
	<body>
		<div id="index_layout" class="easyui-layout" data-options="fit:true,border:false">
			<div data-options="region:'north',border:false" class="logo">
				<div id="sessionInfoDiv" style="position: absolute; right: 0px; top: 0px;" class="login_name">
					<span class="icon-dortmund-user" style="vertical-align: top;display:inline-block;width:16px;height:16px;"></span>
					<a href="javascript:void(0);" class="user" rel="shareit">
						${currentUser.userCnName}
					</a>
					<span class="label label-info">2013年12月28日 星期六</span>
				</div>
				<div style="position: absolute; right: 0px; bottom: 0px;">
					<a id="home" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-dortmund-home'">主页</a> 
					<a id="btnFullScreen" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-dortmund-limited-edition'">全屏切换</a> 
					<a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_pfMenu',iconCls:'icon-dortmund-delicious'">更换皮肤</a> 
					<a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_kzmbMenu',iconCls:'icon-dortmund-settings'">控制面板</a> 
					<a id="logout" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'icon-dortmund-logout'">注销</a>
				</div>
				<div id="layout_north_pfMenu" style="width:120px; display: none;">
					<div onclick="changeThemeFun('metro-gray');" title="metro-gray" data-options="iconCls:'icon_custom_gray'">metro-gray</div>
					<div onclick="changeThemeFun('metro-blue');" title="metro-blue" data-options="iconCls:'icon_custom_acquiesce'">metro-blue</div>
					<div onclick="changeThemeFun('metro-green');" title="metro-green" data-options="iconCls:'icon_custom_green'">metro-green</div>
					<div onclick="changeThemeFun('metro-orange');" title="metro-orange" data-options="iconCls:'icon_custom_buff'">metro-orange</div>
					<div onclick="changeThemeFun('metro-red');" title="metro-red" data-options="iconCls:'icon_custom_pink'">metro-red</div>
				</div>
				<div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
					<div onclick="editCurrentUserPwd();" data-options="iconCls:'icon-dortmund-drawings'">修改密码</div>
					<div class="menu-sep"></div>	
					<div onclick="checkAuth();" data-options="iconCls:'icon-dortmund-customers'">查看权限</div>
				</div>
			</div>
			<div data-options="region:'west',split:true" style="width:160px;overflow:hidden;">
				<div class="easyui-panel" title="导航" data-options="fit:true,border:false,iconCls:'icon-dortmund-world',tools : [{
								iconCls : 'icon-dortmund-communication',
								handler : function() {
									$('#layout_west_tree').tree('reload');
								}
							}, {
								iconCls : 'icon-dortmund-upcoming-work',
								handler : function() {
									var node = $('#layout_west_tree').tree('getSelected');
									if (node) {
										$('#layout_west_tree').tree('expandAll', node.target);
									} else {
										$('#layout_west_tree').tree('expandAll');
									}
								}
							}, {
								iconCls : 'icon-dortmund-sign-up',
								handler : function() {
									var node = $('#layout_west_tree').tree('getSelected');
									if (node) {
										$('#layout_west_tree').tree('collapseAll', node.target);
									} else {
										$('#layout_west_tree').tree('collapseAll');
									}
								}
							}]">
					<ul id="layout_west_tree"></ul>
				</div>
			</div>
			<div data-options="region:'center'">
				<div id="layout_center_panel" class="easyui-panel" title="主页" data-options="fit:true,border:false" style="padding:5px;overflow: hidden;"></div>
			</div>
		</div>
	</body>
</html>