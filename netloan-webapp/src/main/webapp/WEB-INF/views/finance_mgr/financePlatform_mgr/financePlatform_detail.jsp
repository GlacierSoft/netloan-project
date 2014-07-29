<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form method="post" style="padding:15px">
	<table class="detailtable">
		<tr>
			<td>账号代码：</td> 
			<td class="forminputtable">
				<input type="hidden"  name="financePlatformId" value="${financePlatformData.financePlatformId}" />
				<input name="platformCode" class="spinner" style="width:180px" value="${financePlatformData.platformCode}" readonly="readonly"></input>
			</td>	
			<td>账号名称：</td>
			<td>
				<input name="platformName" class="spinner" style="width:180px" value="${financePlatformData.platformName}" readonly="readonly"/>
			</td>
		</tr>
		<tr>
			<td>账号：</td>
			<td>
				<input name="platformAccount" value="${financePlatformData.platformAccount}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>余额：</td>
			<td>
				<input name="platformMoney" value="<fmt:formatNumber value='${financePlatformData.platformMoney}' pattern="#,#00.00元"/>" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
			<tr>
			<td>开户银行：</td>
			<td>
				<input name="openingBank" value="${financePlatformData.openingBank}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td style="width:80px">银行卡名称：</td>
			<td>
				<input name="cardName" value="${financePlatformData.cardName}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		
		<tr>
			<td style="width:100px">平台资金类型：</td>
			<td>
				<input name="platformType" id="financePlatform_mgr_financePlatform_detail_platformType" value="${financePlatformData.platformType}" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>银行卡号：</td>
			<td>
				<input name="cardNumber" value="${financePlatformData.cardNumber}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>审核状态：</td>
			<td>
				<input name="auditState" id="financePlatform_mgr_financePlatform_detail_auditState" class="spinner" style="width:180px" readonly="readonly"/>
			</td>
			<td>审核说明：</td>
			<td>
				<input name="auditRemark" value="${financePlatformData.auditRemark}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
		</tr>
		<tr>
			<td>审核人：</td>
			<td>
				<input name="auditor" value="${financePlatformData.auditorDisplay}" class="spinner" style="width:180px" readonly="readonly"></input>
			</td>
			<td>审核时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.auditDate}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>创建人：</td>
			<td><input class="spinner" style="width:180px" value="${financePlatformData.createrDisplay}" readonly="readonly"/></td>
			<td>创建时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>更新人：</td>
			<td><input class="spinner" style="width:180px" value="${financePlatformData.updaterDisplay}" readonly="readonly"/></td>
			<td>更新时间：</td>
			<td><input class="spinner" style="width:180px" value="<fmt:formatDate value="${financePlatformData.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>" readonly="readonly"/></td>
		</tr>
		<tr>
			<td>备注：</td>
			<td colspan="3"><textarea class="spinner" style="width:445px" readonly="readonly">${financePlatformData.remark}</textarea></td>
		</tr>
	</table>
</form>
<script type="text/javascript">
	$('#financePlatform_mgr_financePlatform_detail_auditState').val(renderGridValue('${financePlatformData.auditState}',fields.auditState));
	$('#financePlatform_mgr_financePlatform_detail_platformType').val(renderGridValue('${financePlatformData.platformType}',fields.platformType));
	
</script>