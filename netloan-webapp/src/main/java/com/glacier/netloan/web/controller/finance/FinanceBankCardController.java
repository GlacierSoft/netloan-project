package com.glacier.netloan.web.controller.finance;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.entity.finance.FinanceBankCard;
import com.glacier.netloan.service.finance.FinanceBankCardService;

/**
 * @ClassName: FinanceBankCardController 
 * @Description: TODO(会员银行卡controller) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-4-4下午3:47:32
 */
@Controller
@RequestMapping(value = "/bankCard")
public class FinanceBankCardController extends AbstractController {
	
	@Autowired
	FinanceBankCardService bankCardService;//注入会员银行卡service类
	
	// 进入会员银行卡列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPbankCard() {
        ModelAndView mav = new ModelAndView("finance_mgr/bankCard_mgr/bankCard");
        return mav;
    }
    
    // 进入会员银行卡Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoFinanceBankCardFormPbankCard(String bankCardId) {
        ModelAndView mav = new ModelAndView("finance_mgr/bankCard_mgr/bankCard_form");
        if(StringUtils.isNotBlank(bankCardId)){
            mav.addObject("bankCardData", bankCardService.getFinanceBankCard(bankCardId));
        }
        return mav;
    }
    
    // 进入会员银行卡Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoFinanceBankCardDetailPage(String bankCardId) {
        ModelAndView mav = new ModelAndView("finance_mgr/bankCard_mgr/bankCard_detail");
        if(StringUtils.isNotBlank(bankCardId)){
            mav.addObject("bankCardData", bankCardService.getFinanceBankCard(bankCardId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return bankCardService.listAsGrid(pservicer);
    }
    
    // 增加会员银行卡
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addFinanceBankCard(@Valid FinanceBankCard bankCard, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return bankCardService.addFinanceBankCard(bankCard);
    }
    
    // 修改会员银行卡
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editFinanceBankCard(@Valid FinanceBankCard bankCard, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return bankCardService.editFinanceBankCard(bankCard);
    }
    
    // 批量删除会员银行卡
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delFinanceBankCard(@RequestParam List<String> bankCardIds,@RequestParam List<String> cardNames) {
    	return bankCardService.delFinanceBankCard(bankCardIds, cardNames);
    }
	
}
