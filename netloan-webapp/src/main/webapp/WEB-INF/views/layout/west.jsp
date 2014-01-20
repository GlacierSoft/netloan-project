<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<script type="text/javascript" charset="utf-8">
	$(function() {
		$('#layout_west_tree').tree({
			url : ctx +'/do/res/menu/getPrincipalUserMenu.json',
			smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
			lines : true,
			onClick : function(node) {
				var url;
				if (node.attributes.url) {//获取树节点中自定义属性的url属性
					url = ctx + node.attributes.url;
					layout_center_addTabFun({//调用glacier.util.js中的动态增加tab方法
						title : node.text,
						closable : true,
						iconCls : node.iconCls,
						href : url
					});
				}
			}
		});
	});
</script>
<div class="easyui-accordion" data-options="fit:true,border:false">
	<div title="导航" data-options="iconCls:'anchor',tools : [{
				iconCls : 'database_refresh',
				handler : function() {
					$('#layout_west_tree').tree('reload');
				}
			}, {
				iconCls : 'resultset_next',
				handler : function() {
					var node = $('#layout_west_tree').tree('getSelected');
					if (node) {
						$('#layout_west_tree').tree('expandAll', node.target);
					} else {
						$('#layout_west_tree').tree('expandAll');
					}
				}
			}, {
				iconCls : 'resultset_previous',
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