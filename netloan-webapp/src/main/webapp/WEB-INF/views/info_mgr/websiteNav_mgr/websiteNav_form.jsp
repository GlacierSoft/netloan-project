<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form id="websiteNav_mgr_websiteNav_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>导航：</td>
			<td>
				<input id="websiteNav_mgr_websiteNav_form_webNavId" type="hidden" name="webNavId" value="${websiteNavData.webNavId}" />
				<input id="websiteNav_mgr_websiteNav_form_webNavName" name="webNavName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${websiteNavData.webNavName}"/>
			</td>
		</tr>
		<tr>
			<td>父级导航：</td>
			<td class="forminputtable">
				<input id="websiteNav_mgr_websiteNav_form_webNavPid" name="webNavPid" value="${websiteNavData.webNavPid}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td>
				<input id="websiteNav_mgr_websiteNav_form_webNavNum" name="webNavNum" class="easyui-validatebox spinner" style="width:268px" required="true" value="${websiteNavData.webNavNum}"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="websiteNav_mgr_websiteNav_form_remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${websiteNavData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化上级菜单
	$("#websiteNav_mgr_websiteNav_form_webNavPid").combotree({
		data : $.parseJSON('${allWebsiteNavTreeNodeData}'),
		width:268,
		height:18,
	    missingMessage:'请选择上级导航',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});	
</script>