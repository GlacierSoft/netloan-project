<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!-- 引入国际化标签 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<form  method="post" style="padding:15px">
	<table class="formtable">
		<tr>
			<td>账号代码：</td>
			<td>
				<input type="hidden" name="financePlatformId" value="${financePlatformData.financePlatformId}" />
				<input name="platformCode" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformCode}"/>
			</td>
		</tr>
		<tr>
			<td>账号名称：</td>
			<td>
				<input  name="platformName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformName}"/>
			</td>
		</tr>
		<tr>
			<td>账号：</td>
			<td>
				<input name="platformAccount" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformAccount}"/>
			</td> 
		</tr>
		
		
         <tr>
			<td>开户银行：</td>
			<td>
				<input  name="openingBank" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.openingBank}"/>
			</td>
		</tr> 
		 <tr>
			<td>支行：</td>
			<td>
				<input  name="subbranch" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.subbranch}"/>
			</td>
		</tr>
		
		 <tr>
			<td>银行卡名称：</td>
			<td>
				<input  name="cardName" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.cardName}"/>
			</td>
		</tr> 
		<tr>
			<td>银行卡号：</td>
			<td>
				<input  name="cardNumber" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.cardNumber}"/>
			</td>
		</tr>  
		<tr>
			<td>余额：</td>
			<td>
				<input name="platformMoney" class="easyui-validatebox spinner" style="width:268px" required="true" value="${financePlatformData.platformMoney}"/>
			</td>
		</tr>
	</table>
</form>
