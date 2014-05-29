<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>逾期罚款设置表ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${overdueFineSetData.overdueFineSetId}" />
				<input class="spinner" style="width:168px"  value="${overdueFineSetData.overdueFineSetId}" readonly="readonly"/>
			</td>
			<td>罚款名称：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineSetData.overdueFineSetName}" readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>有效会员等级：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineSetData.memberType}" readonly="readonly"/></td>
			<td>是否减少VIP设定天数：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineSetData.memberPrivilege}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>取值：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueFineSetData.value}" readonly="readonly"/></td>
			<td>取费方式：</td>
			<td><input class="spinner" style="width:168px" value="<fmt:formatDate  value="${overdueFineSetData.feeWay}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td><input value="${overdueFineSetData.auditState}" class="spinner" style="width:168px" readonly="readonly"/></td>
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineSetData.auditor}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueFineSetData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>金额：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineSetData.money}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatDate  value="${overdueFineSetData.remark}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px"  value="<fmt:formatDate  value="${overdueFineSetData.creater}" pattern="yyyy-MM-dd HH:mm:ss"/>"  readonly="readonly"/></td>
		</tr>
		<tr>
			<td>录入时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueFineSetData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>最或修改人：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineSetData.updater}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>最后修改时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueFineSetData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#bankCard_mgr_bankCard_audit_status').val(renderGridValue('${bankCardData.status}',fields.bankCardAuths));
</script>
