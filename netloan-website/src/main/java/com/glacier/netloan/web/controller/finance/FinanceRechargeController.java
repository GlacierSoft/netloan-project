/*
 * @(#)FinanceRechargeController.java
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
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.finance.FinRechargeQueryDTO;
import com.glacier.netloan.entity.finance.FinanceRecharge;
import com.glacier.netloan.service.finance.FinanceRechargeService;

/** 
 * @ClassName: FinanceRechargeController 
 * @Description: TODO(会员充值记录的控制器) 
 * @author xichao.dong
 * @email 406592176@QQ.com
 * @date 2014-1-21 下午2:39:20  
 */
@Controller
@RequestMapping(value = "/recharge")
public class FinanceRechargeController extends AbstractController{

    @Autowired
    private FinanceRechargeService financeRechargeService;// 注入会员充值记录业务Bean 
     
    // 获取表格结构的所有会员充值记录数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listRechargeAsGridByMenuId(FinRechargeQueryDTO rechargeQueryDTO,JqPager pfinanceRecharger) {
        return financeRechargeService.listAsGrid(rechargeQueryDTO,pfinanceRecharger);
    }
    
    // 增加会员充值记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRecharge(@Valid FinanceRecharge financeRecharge, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeRechargeService.addRecharge(financeRecharge);
    }
     
}
