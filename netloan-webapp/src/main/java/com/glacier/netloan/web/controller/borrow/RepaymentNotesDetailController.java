package com.glacier.netloan.web.controller.borrow;

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
import com.glacier.netloan.entity.borrow.RepaymentNotesDetail;
import com.glacier.netloan.service.borrow.RepaymentNotesDetailService;
/**
 * @ClassName: RepaymentNotesDetailDetailController 
 * @Description: TODO(还款记录明细控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-7下午4:27:16
 */
@Controller
@RequestMapping(value = "/repaymentNotesDetail")
public class RepaymentNotesDetailController extends AbstractController{
	@Autowired
	private RepaymentNotesDetailService repaymentNotesDetailService;// 注入还款记录明细业务Bean

	// 进入还款记录明细列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPreview() {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentNotesDetail_mgr/repaymentNotesDetail");
        return mav;
    }
    
    // 进入还款记录明细Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoRepaymentNotesDetailFormPreview(String repayNotesDetailId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentNotesDetail_mgr/repaymentNotesDeatail_form");
        if(StringUtils.isNotBlank(repayNotesDetailId)){
            mav.addObject("repaymentNotesDetailData", repaymentNotesDetailService.getRepaymentNotesDetail(repayNotesDetailId));
        }
        return mav;
    }
    
    // 进入还款记录明细Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRepaymentNotesDetailDetailPage(String repayNotesDetailId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentNotesDetail_mgr/repaymentNotesDeatail_detail");
        if(StringUtils.isNotBlank(repayNotesDetailId)){
            mav.addObject("repaymentNotesDetailData", repaymentNotesDetailService.getRepaymentNotesDetail(repayNotesDetailId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return repaymentNotesDetailService.listAsGrid(pservicer);
    }
    
    // 增加还款记录明细
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRepaymentNotesDetail(@Valid RepaymentNotesDetail review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        //return repaymentNotesDetailService.addRepaymentNotesDetail(review);
        return null;
    }
    
    // 修改还款记录明细
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRepaymentNotesDetail(@Valid RepaymentNotesDetail review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return repaymentNotesDetailService.editRepaymentNotesDetail(review);
    }
    
    // 批量删除还款记录明细
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delRepaymentNotesDetail(@RequestParam List<String> repayNotesDetailIds,@RequestParam List<String> repaymentNotesDetailTitle) {
    	return repaymentNotesDetailService.delRepaymentNotesDetail(repayNotesDetailIds, repaymentNotesDetailTitle);
    }
}
