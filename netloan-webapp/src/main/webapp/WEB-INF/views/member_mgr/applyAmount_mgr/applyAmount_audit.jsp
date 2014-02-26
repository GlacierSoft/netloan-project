<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${applyAmountData.applyAmountId}" />
				<input class="spinner" style="width:168px"  value="${applyAmountData.memberRealName}" readonly="readonly"/>
			</td>
			<td>申请类型：</td>
			<td><input id="applyAmount_mgr_applyAmount_audit_applyType" class="spinner" style="width:168px" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>原来额度：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.originalAmount}" readonly="readonly"/></td>
			<td>申请额度：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.applyMoney}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>申请说明：</td>
			<td><input class="spinner" style="width:168px" value="${applyAmountData.applyExplanation}" readonly="readonly"/></td>
			<td>申请时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${applyAmountData.applyDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</div>
<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核状态：</td>
			<td>
				<input type="hidden" name="applyAmountId" value="${applyAmountData.applyAmountId}" />
				<input id="applyAmount_mgr_applyAmount_audit_auditState" name="auditState" value="${applyAmountData.auditState}" class="easyui-combobox" />
			</td>
		</tr>
	</table>
	<table id="auditTableInfo"  style="display:none;">
		<tr>
			<td>审核金额：</td>
			<td>
				<input name="authorizedAmount" class="easyui-validatebox spinner" style="width:416px" required="true" value="${applyAmountData.authorizedAmount}" />
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>审核说明：</td>
			<td><textarea name="processExplanation" style="width:416px;" maxlength="255" class="spinner formta">${applyAmountData.processExplanation}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
//初始化下拉值状态下拉框
	$('#applyAmount_mgr_applyAmount_audit_auditState').combobox({  
		valueField : 'value',
		height:18,
		width:270,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.auths,
		onSelect:function(record){//选择行事件触发
			var auditState = $('#applyAmount_mgr_applyAmount_audit_auditState').combobox('getValue');
			if(auditState == 'pass'){//如果审核通过，那么显示审核额度，否则隐藏审核额度
				$('#auditTableInfo').show();
			}else{
				$('#auditTableInfo').hide();
			}
		}
	});

	$('#applyAmount_mgr_applyAmount_audit_applyType').val(renderGridValue('${applyAmountData.applyType}',fields.applyType));
</script>