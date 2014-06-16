<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<form method="post" style="padding:15px">
	 <table class="detailtable">
		<tr>
			<td>罚款ID：</td>
			<td class="forminputtable"><!-- 当表格行存在两个要显示的td,使用该forminputtable样式可以进行适当的空间调整  -->
				<input type="hidden" name="roleId" value="${overdueFineSetData.overdueFineSetId}" />
				<input class="spinner" style="width:168px"  value="${fn:substring(overdueFineSetData.overdueFineSetId,0,8)}..." readonly="readonly" title="${overdueFineSetData.overdueFineSetId}"/>
			</td>
			<td>罚款名称：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineSetData.overdueFineSetName}" readonly="readonly"/></td>
			
		</tr>
		<tr>
			<td>有效会员：</td>
			<td>
				<input id="overdueFineSet_mgr_overdueFineSet_detail_memberType" name="memberType" value="${overdueFineSetData.memberType}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
			<td>设定天数：</td>
			<td><input  id="overdueFineSet_mgr_overdueFineSet_dettail_memberPrivilege" name="memberPrivilege" class="spinner" style="width:168px" value="${overdueFineSetData.memberPrivilege}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>天数设定：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueFineSetData.vipDays}" readonly="readonly"/></td>
			<td>取费方式：</td>
			<td>
				<input id="overdueFineSet_mgr_overdueFineSet_detail_feeWay" name="feeWay" value="${overdueFineSetData.feeWay}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input id="overdueFineSet_mgr_overdueFineSet_auditState" name="auditState" value="${overdueFineSetData.auditState}" class="spinner" style="height:18px;width:168px" readonly="readonly"/>
			</td>
			
			<td>审核人：</td>
			<td><input class="spinner" style="width:168px" value="${overdueFineSetData.auditor}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueFineSetData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
			<td>罚款金额：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineSetData.money}" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:168px"  value="${overdueFineSetData.creater}"  readonly="readonly"/></td>
		    <td>录入时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueFineSetData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:168px"   value="${overdueFineSetData.updater}" readonly="readonly"/></td>
		    <td>更新时间：</td>
			<td><input class="spinner" style="width:168px"   value="<fmt:formatDate  value="${overdueFineSetData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注说明：</td>
			<td colspan="3"><textarea class="spinner" style="width:420px" readonly="readonly">${overdueFineSetData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#overdueFineSet_mgr_overdueFineSet_detail_memberType').val(renderGridValue('${overdueFineSetData.memberType}',fields.memberType));
	$('#overdueFineSet_mgr_overdueFineSet_detail_feeWay').val(renderGridValue('${overdueFineSetData.feeWay}',fields.feeWay));
	$('#overdueFineSet_mgr_overdueFineSet_auditState').val(renderGridValue('${overdueFineSetData.auditState}',fields.auditState));
    $('#overdueFineSet_mgr_overdueFineSet_dettail_memberPrivilege').val(renderGridValue('${overdueFineSetData.memberPrivilege}',fields.status));
    
    
</script>


