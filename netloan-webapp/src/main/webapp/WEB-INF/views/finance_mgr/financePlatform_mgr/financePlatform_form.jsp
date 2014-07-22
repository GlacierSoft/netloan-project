<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>账号代码：</td>
			<td>
				<input type="hidden" name="financePlatformId" value="${financePlatformData.financePlatformId}" />
				<input name="platformCode" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformCode}"  validType="customReg['^[0-9]{4,8}','<fmt:message key="FinancePlat.platformCode.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>账号名称：</td>
			<td>
				<input  name="platformName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformName}" validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.platformName.illegal"/>']"/>
			</td>
		</tr>
		<tr>
			<td>账号：</td>
			<td>
				<input  maxlength="19" name="platformAccount" class=" easyui-validatebox spinner"  style="width:268px" required="true"  value="${financePlatformData.platformAccount}"  validType="customReg['[0-9]{19}','<fmt:message key="FinancePlat.platformAccount.illegal"/>']"/>
			</td> 
		</tr>
		
		
         <tr>
			<td>开户银行：</td>
			<td>
				<input  name="openingBank" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.openingBank}" validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.openingBank.illegal"/>']"/>
			</td>
		</tr> 
		 <tr>
			<td>支行：</td>
			<td>
				<input  name="subbranch" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.subbranch}"  validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.subbranch.illegal"/>']"/>
			</td>
		</tr>
		
		 <tr>
			<td>银行卡名称：</td>
			<td>
				<input  name="cardName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.cardName}"  validType="customReg['^[\u0391-\uFFE5]{4,10}','<fmt:message key="FinancePlat.cardName.illegal"/>']"/>
			</td>
		</tr> 
		<tr>
			<td>银行卡号：</td>
			<td>
				<input  maxlength="19" name="cardNumber" class="easyui-validatebox spinner"   style="width:268px" required="true" value="${financePlatformData.cardNumber}"  validType="customReg['^[0-9]{19}','<fmt:message key="FinancePlat.cardNumber.illegal"/>']"/>
			</td>
		</tr>  
		<tr>
			<td>余额：</td>
			<td>
				<input name="platformMoney" class="easyui-validatebox spinner"   style="width:268px" required="true" value="${financePlatformData.platformMoney}" validType="customReg['^[0-9]','余额只能输入整数以及保留小数位']"/> 
			</td>
		</tr>
	</table>
</form>
