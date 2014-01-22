<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',border:false" style="overflow: hidden;">
		<form id="menu_mgr_menu_form" method="post" style="padding:15px;">
			<table class="formtable">
				<tr>
					<td>上级菜单：</td>
					<td class="forminputtable"><input id="menu_mgr_menu_form_menuId" name="menuId" type="hidden"/><input id="menu_mgr_menu_form_pid" name="pid"/></td>
					<td>图标样式：</td>
					<td><select id="menu_mgr_menu_form_iconCls" name="iconCls" class="easyui-comboicons" data-options="width: 170, height : 18 ,autoShowPanel: true, multiple: false, size: '16'"></select></td>
				</tr>
				<tr>
					<td>菜单名称：</td>
					<td>
						<input id="menu_mgr_menu_form_menuCnName" name="menuCnName" class="easyui-validatebox spinner"  style="width:170px" data-options="required:true"  validType="customReg['^[\u0391-\uFFE5]{4,10}$','<fmt:message key="Menu.menuCnName.illegal"/>']" />
					</td>
					<td>英文名称：</td>
					<td><input id="menu_mgr_menu_form_menuEnName" name="menuEnName" class="spinner"  style="width:170px" data-options="required:true" validType="customReg['^[A-Za-z]{1,30}$','<fmt:message key="Menu.menuEnName.illegal"/>']" /></td>
				</tr>
				<tr>
					<td>URL：</td>
					<td><input id="menu_mgr_menu_form_url" name="url" class="easyui-validatebox spinner" style="width:170px" maxlength="100" validType="customReg['^[^\u4e00-\u9fa5]{0,100}$','<fmt:message key="Menu.url.illegal"/>']"/></td>
					<td>菜单排序：</td>
					<td><input id="menu_mgr_menu_form_orderNum" name="orderNum" class="easyui-numberspinner spinner" data-options="min:0,max:999,editable:false,required:true,missingMessage:'请选择菜单排序'" value="10" style="width: 172px;height:18px;" min="1" max="99"/></td>
				</tr>
				<tr>
					<td>备注：</td>
					<td colspan="3">
						<textarea id="menu_mgr_menu_form_remark" name="remark" style="height:50px;width:418px;resize:none;overflow:auto;white-space:normal;" maxlength="255" class="spinner"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</div>
</div>

<script type="text/javascript">
	//初始化上级菜单
	$("#menu_mgr_menu_form_pid").combotree({
		data : $.parseJSON('${allMenuTreeNodeData}'),
		width:170,
		height:18,
	    missingMessage:'请选择上级菜单',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});
	
</script>