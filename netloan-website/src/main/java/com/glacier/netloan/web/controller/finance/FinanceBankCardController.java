package com.glacier.netloan.web.controller.finance;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.service.finance.FinanceBankCardService;

@Controller
@RequestMapping(value = "/bankCard")
public class FinanceBankCardController extends AbstractController {

	@Autowired
	private FinanceBankCardService bankCardService;
	
	@RequestMapping(value = "/addBankCard.htm")
	@ResponseBody
	public Object addBankCard(@Valid FinanceBankCard bankCard, BindingResult bindingResult, String memberId){
		if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
		bankCard.setMemberId(memberId);
		//JqReturnJson returnResult = (JqReturnJson) bankCardService.addFinanceBankCardWebsit(bankCard);
		
		return bankCardService.addFinanceBankCardWebsit(bankCard);
	}
	@RequestMapping(value = "del.htm")
	@ResponseBody
	public Object del(String bankCardId){
		
		return bankCardService.delFinanceBankCardWebsit(bankCardId);
	}
}
