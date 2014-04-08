<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>会员名称：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${bankCardData.bankCardId}" />
				<input class="spinner" style="width:168px"  value="${bankCardData.memberRealName}" readonly="readonly"/>
			</td>
			<td>银行卡名称：</td>
			<td><input class="spinner" style="width:168px"  value="${bankCardData.cardName}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>开户行：</td>
			<td><input class="spinner" style="width:168px" value="${bankCardData.openingBank}" readonly="readonly"/></td>
			<td>支行：</td>
			<td><input class="spinner" style="width:168px" value="${bankCardData.subbranch}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>卡号：</td>
			<td><input class="spinner" style="width:168px" value="${bankCardData.cardNumber}" readonly="readonly"/></td>
			<td>申请时间：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate value="${bankCardData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</div>
<form method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核状态：</td>
			<td>
				<input type="hidden" name="bankCardId" value="${bankCardData.bankCardId}" />
				<input id="bankCard_mgr_bankCard_audit_status" name="status" value="${bankCardData.status}" class="easyui-combobox" />
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>审核说明：</td>
			<td><textarea name="remark" style="width:412px;" maxlength="255" class="spinner formta">${bankCardData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
//初始化下拉值状态下拉框
	$('#bankCard_mgr_bankCard_audit_status').combobox({  
		valueField : 'value',
		height:18,
		width:417,
		textField : 'label',
		panelHeight : 'auto',
		editable : false,
		required:true,
		data : fields.bankCardAuths,
		/* onSelect:function(record){//选择行事件触发
			var auditState = $('#applyAmount_mgr_applyAmount_audit_auditState').combobox('getValue');
			if(auditState == 'pass'){//如果审核通过，那么显示审核额度，否则隐藏审核额度
				$('#auditTableInfo').show();
			}else{
				$('#auditTableInfo').hide();
			}
		} */
	});

	
</script>