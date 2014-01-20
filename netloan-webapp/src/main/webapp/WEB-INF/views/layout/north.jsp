<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<script type="text/javascript" charset="utf-8">
	/**
	 * @author 孙宇
	 * 
	 * @requires jQuery,EasyUI,jQuery cookie plugin
	 * 
	 * 更换EasyUI主题的方法
	 * 
	 * @param themeName
	 *            主题名称
	 */
	function changeThemeFun(themeName) {
		if ($.cookie('easyuiThemeName')) {
			$('#layout_north_pfMenu').menu('setIcon', {
				target : $('#layout_north_pfMenu div[title=' + $.cookie('easyuiThemeName') + ']')[0],
				iconCls : 'emptyIcon'
			});
		}
		$('#layout_north_pfMenu').menu('setIcon', {
			target : $('#layout_north_pfMenu div[title=' + themeName + ']')[0],
			iconCls : 'tick'
		});

		//定义了一个link的id为easyuiTheme，支持主题更换
		var $easyuiTheme = $('#easyuiTheme');
		var url = $easyuiTheme.attr('href');
		var href = url.substring(0, url.indexOf('jquery-easyui-theme')) + 'jquery-easyui-theme/' + themeName + '/easyui.css';
		//动态更换引用主题
		$easyuiTheme.attr('href', href);
		//遍历页面所有的iframe，子页面的主题也进行动态
		var $iframe = $('iframe');
		if ($iframe.length > 0) {
			for ( var i = 0; i < $iframe.length; i++) {
				var ifr = $iframe[i];
				try {
					$(ifr).contents().find('#easyuiTheme').attr('href', href);
				} catch (e) {
					try {
						ifr.contentWindow.document.getElementById('easyuiTheme').href = href;
					} catch (e) {
					}
				}
			}
		}

		$.cookie('easyuiThemeName', themeName, {
			expires : 7
		});

	};
	
	//用户退出系统方法
	function logoutFun(){
		window.location.href = ctx + '/do/login.htm';
	};
	
	function currentUserResource(){
		$.messager.confirm('请确认', '是否要删除所选操作，删除后不可恢复!', function(){
			alert("sserer");
		}); 
	};
	
</script>
<div style="position: absolute; right: 0px; bottom: 0px;">
	<a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_pfMenu',iconCls:'cog'">更换皮肤</a> <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_kzmbMenu',iconCls:'cog'">控制面板</a> <a href="javascript:void(0);" class="easyui-menubutton" data-options="menu:'#layout_north_zxMenu',iconCls:'cog'">注销</a>
</div>
<div id="layout_north_pfMenu" style="width: 120px; display: none;">
	<div onclick="changeThemeFun('default');" title="default">default</div>
	<div onclick="changeThemeFun('gray');" title="gray">gray</div>
	<div onclick="changeThemeFun('metro');" title="metro">metro</div>
	<div onclick="changeThemeFun('bootstrap');" title="bootstrap">bootstrap</div>
	<div onclick="changeThemeFun('black');" title="black">black</div>
	<div class="menu-sep"></div>
	<div onclick="changeThemeFun('cupertino');" title="cupertino">cupertino</div>
	<div onclick="changeThemeFun('dark-hive');" title="dark-hive">dark-hive</div>
	<div onclick="changeThemeFun('pepper-grinder');" title="pepper-grinder">pepper-grinder</div>
	<div onclick="changeThemeFun('sunny');" title="sunny">sunny</div>
	<div class="menu-sep"></div>
	<div onclick="changeThemeFun('metro-blue');" title="metro-blue">metro-blue</div>
	<div onclick="changeThemeFun('metro-gray');" title="metro-gray">metro-gray</div>
	<div onclick="changeThemeFun('metro-green');" title="metro-green">metro-green</div>
	<div onclick="changeThemeFun('metro-orange');" title="metro-orange">metro-orange</div>
	<div onclick="changeThemeFun('metro-red');" title="metro-red">metro-red</div>
</div>
<div id="layout_north_kzmbMenu" style="width: 100px; display: none;">
	<div onclick="editCurrentUserPwd();">修改密码</div>
	<div class="menu-sep"></div>
	<div onclick="currentUserRole();">我的角色</div>
	<div class="menu-sep"></div>
	<div onclick="currentUserResource();">我的权限</div>
</div>
<div id="layout_north_zxMenu" style="width: 100px; display: none;">
	<div onclick="logoutFun();">退出系统</div>
</div>