/*
 * @(#)FinanceWithdrawController.java
 * @author xichao.dong
 * Copyright (c) 2013 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.netloan.web.controller.finance;
 
import javax.validation.Valid; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import org.springframework.web.bind.annotation.ResponseBody; 
import com.glacier.core.controller.AbstractController; 
import com.glacier.netloan.entity.finance.FinanceWithdraw;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.finance.FinanceWithdrawService;

/** 
 * @ClassName: FinanceWithdrawController 
 * @Description: TODO(会员提现记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/withdraw")
public class FinanceWithdrawController extends AbstractController{

    @Autowired
    private FinanceWithdrawService financeWithdrawService;// 注入会员提现记录业务Bean 
    // 增加会员提现记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addWithdraw(@Valid FinanceWithdraw financeWithdraw, Member member, String bankCardId, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeWithdrawService.addWithdraw(financeWithdraw, member, bankCardId);
    }
     
}
