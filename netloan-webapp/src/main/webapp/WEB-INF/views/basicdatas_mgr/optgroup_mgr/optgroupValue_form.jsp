<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<script type="text/javascript">
// 	glacier.ns('glacier.basicdatas_mgr.client_mgr.client_form');//自定义命名空间，相当于一个唯一变量(推荐按照webapp目录结构命名可避免重复)

	// 初始化客户性别下拉框
	$('#optgroup_mgr_optgroupValue_form_status').combobox({  
		valueField : 'optgroupValueCode',
		height:18,
		width:270,
		textField : 'optgroupValueName',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.status
	});
</script>

<form id="optgroup_mgr_optgroupValue_form" method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>下拉项代码：</td>
			<td>
				<input id="optgroup_mgr_optgroupValue_form_optgroupValueId" type="hidden" name="optgroupValueId" value="${optgroupValueData.optgroupValueId}" />
				<input id="optgroup_mgr_optgroupValue_form_optgroupValueCode" name="optgroupValueCode" class="easyui-validatebox spinner" style="width:268px" required="true" value="${optgroupValueData.optgroupValueCode}"/>
			</td>
		</tr>
		<tr>
			<td>下拉项名称：</td>
			<td>
				<input id="optgroup_mgr_optgroupValue_form_optgroupValueName" name="optgroupValueName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${optgroupValueData.optgroupValueName}"/>
			</td>
		</tr>
		<tr>
			<td>所属下拉项：</td>
			<td class="forminputtable">
				<input id="optgroup_mgr_optgroupValue_form_optgroupId" name="optgroupId" value="${optgroupValueData.optgroupId}"/>
			</td>
		</tr>
		<tr>
			<td>下拉项状态：</td>
			<td class="forminputtable">
				<input id="optgroup_mgr_optgroupValue_form_status" name="status" value="${optgroupValueData.status}"/>
			</td>
		</tr>
		<tr>
			<td>排序：</td>
			<td>
				<input id="optgroup_mgr_optgroupValue_form_optgroupValueNum" name="optgroupValueNum" class="easyui-validatebox spinner" style="width:268px" required="true" value="${optgroupValueData.optgroupValueNum}"/>
			</td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><textarea id="optgroup_mgr_optgroupValue_form__remark" name="remark" style="width:268px;" maxlength="255" class="spinner formta">${optgroupData.remark}</textarea></td>
		</tr>
	</table>
</form>

<script type="text/javascript">
	//初始化上级菜单
	$("#optgroup_mgr_optgroupValue_form_optgroupId").combotree({
		data : $.parseJSON('${allOptgroupTreeNodeData}'),
		width:268,
		height:18,
	    missingMessage:'请选择上级下拉项',
	    smooth: true,       //该属性用以启用当前 easyui-tree 控件对平滑数据格式的支持
	    lines : true
	});	
</script>