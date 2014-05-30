<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<div method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>罚款名称：</td>
			<td class="forminputtable">
				<input type="hidden"  name="overdueAdvancesId" value="${overdueAdvancesData.overdueAdvancesId}" />
				<input id="overdueAdvances_mgr_overdueAdvances_detail_memberType" name="memberType" value="${overdueAdvancesData.memberType}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
			<td：</td>
			<td>
				<input name="value" value="${overdueAdvancesData.value}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>有效会员等级：</td>
			<td>
				<input name="auditor" class="spinner" style="width:180px" value="${overdueAdvancesData.auditor}" readonly="readonly"></input>
			</td>
			<td>减少VIP会员天数：</td>
			<td>
				<input name="auditDate" value="<fmt:formatDate value="${overdueAdvancesData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>天数设置</td>
			<td>
				<input name="creater" class="spinner" style="width:180px" value="${overdueAdvancesData.creater}" readonly="readonly"></input>
			</td>
			<td>创建时间</td>
			<td>
				<input  name="createTime" value="<fmt:formatDate value="${overdueAdvancesData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
			</td>
		</tr>
		<tr>
		     <td>取费方式</td>
		     <td>
		         <input id="overdueAdvances_mgr_overdueAdvances_detail_auditState" name="auditState" value="${overdueAdvancesData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
		     </td>
		     <td>审核状态</td>
		     <td>
		         <input name="auditRemark" value="${overdueAdvancesData.auditRemark}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
		     </td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px;" readonly="readonly">${overdueAdvancesData.remark}</textarea></td>
			 <td>审核时间：</td>
			<td colspan="3"><textarea class="spinner" style="width:440px;" readonly="readonly">${overdueAdvancesData.remark}</textarea></td>
		</tr>
		<tr>
			<td>罚款金额</td>
		    <td>
		         <input id="overdueAdvances_mgr_overdueAdvances_detail_auditState" name="auditState" value="${overdueAdvancesData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
		     </td>
		    <td>创建人</td>
		    <td>
		         <input name="auditRemark" value="${overdueAdvancesData.auditRemark}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
		    </td>
		</tr>
		<tr>
			<td>创建时间</td>
		    <td>
		         <input id="overdueAdvances_mgr_overdueAdvances_detail_auditState" name="auditState" value="${overdueAdvancesData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
		     </td>
		    <td>最后修改人</td>
		    <td>
		         <input name="auditRemark" value="${overdueAdvancesData.auditRemark}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
		    </td>
		</tr>
			<tr>
			<td>最后修改时间</td>
		    <td>
		         <input id="overdueAdvances_mgr_overdueAdvances_detail_auditState" name="auditState" value="${overdueAdvancesData.auditState}" class="spinner" style="height:18px;width:180px" readonly="readonly"/>
		     </td>
		</tr>
		
	</table>
</div>
<script>
    $('#overdueAdvances_mgr_overdueAdvances_detail_memberType').val(renderGridValue('${overdueAdvancesData.memberType}',fields.memberType));
    $('#overdueAdvances_mgr_overdueAdvances_detail_auditState').val(renderGridValue('${overdueAdvancesData.auditState}',fields.auditState));
</script>
<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>审核充值设置：</td>
			<td>
			    <input type="hidden" id="overdueAdvances_mgr_overdueAdvances_form_overdueAdvancesId" name="overdueAdvancesId" value="${overdueAdvancesData.overdueAdvancesId}" />
				<input id="overdueAdvances_mgr_overdueAdvances_form_auditState" name="auditState" type="radio" value="pass" /><span>审核通过</span>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<input id="overdueAdvances_mgr_overdueAdvances_form_auditState" name="auditState" type="radio" value="failure"  checked="checked"/><span>审核失败</span>
		    </td>
		</tr>
		<tr>
			<td>审核说明：</td>
			<td colspan="3">
				<textarea name="auditRemark" class="spinner" style="height:50px;width:415px">${overdueAdvancesData.auditRemark}</textarea>
			</td>
		</tr>
	</table>
</form>


