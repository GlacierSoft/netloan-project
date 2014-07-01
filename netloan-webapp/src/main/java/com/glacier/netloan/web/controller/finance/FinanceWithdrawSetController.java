/**
 * 
 */
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
import com.glacier.netloan.entity.finance.FinanceWithdrawSet;
import com.glacier.netloan.service.finance.FinanceWithdrawSetService;

/**
 * @ClassName:  FinanceWithdrawSetController
 * @Description: TODO(会员提现设置控制器)
 * @author songjundong
 * @email 985776597@QQ.com
 * @date 2014-6-30  下午4:42:42
 */
@Controller
@RequestMapping(value = "/withdrawSet")
public class FinanceWithdrawSetController extends AbstractController{

    @Autowired
    private FinanceWithdrawSetService financeWithdrawSetService;// 注入会员提现设置业务Bean
    
    // 进入会员提现设置列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPfinanceWithdrawSet() {
        ModelAndView mav = new ModelAndView("finance_mgr/withdrawSet_mgr/withdrawSet");
        return mav;
    }
    
    // 进入会员提现设置Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoWithdrawSetFormPfinanceWithdrawSet(String financeWithdrawSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/withdrawSet_mgr/withdrawSet_form");
        if(StringUtils.isNotBlank(financeWithdrawSetId)){
            mav.addObject("withdrawSetData", financeWithdrawSetService.getWithdrawSet(financeWithdrawSetId));
        }
        return mav;
    }
    
    // 进入会员提现设置audit表单页面
    @RequestMapping(value = "/intoAudit.htm")
    private Object intoAuditWithdrawSet(String financeWithdrawSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/withdrawSet_mgr/withdrawSet_audit");
        if(StringUtils.isNotBlank(financeWithdrawSetId)){
            mav.addObject("withdrawSetData", financeWithdrawSetService.getWithdrawSet(financeWithdrawSetId));
        }
        return mav;
    }
    
    // 进入会员提现设置Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoWithdrawSetDetailPage(String financeWithdrawSetId) {
        ModelAndView mav = new ModelAndView("finance_mgr/withdrawSet_mgr/withdrawSet_detail");
        if(StringUtils.isNotBlank(financeWithdrawSetId)){
            mav.addObject("withdrawSetData", financeWithdrawSetService.getWithdrawSet(financeWithdrawSetId));
        }
        return mav;
    }
    
    // 获取表格结构的所有会员提现设置数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listWithdrawSetAsGridByMenuId(JqPager pfinanceWithdrawSetr) {
        return financeWithdrawSetService.listAsGrid(pfinanceWithdrawSetr);
    }
    
    // 增加会员提现设置
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addWithdrawSet(@Valid FinanceWithdrawSet financeWithdrawSet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeWithdrawSetService.addWithdrawSet(financeWithdrawSet);
    }
    
    // 修改会员提现设置
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editWithdrawSet(@Valid FinanceWithdrawSet financeWithdrawSet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeWithdrawSetService.editWithdrawSet(financeWithdrawSet);
    }
    
    // 审核会员提现设置
    @RequestMapping(value = "/audit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object auditWithdrawSet(@Valid FinanceWithdrawSet financeWithdrawSet, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return financeWithdrawSetService.auditWithdrawSet(financeWithdrawSet);
    }
    
    // 批量删除会员提现设置
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delWithdrawSet(@RequestParam List<String> financeWithdrawSetIds) {
    	return financeWithdrawSetService.delWithdrawSet(financeWithdrawSetIds);
    }
}
