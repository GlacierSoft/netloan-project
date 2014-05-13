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
import com.glacier.netloan.dto.query.borrow.RepaymentNotesQueryDTO;
import com.glacier.netloan.entity.borrow.RepaymentNotes;
import com.glacier.netloan.service.borrow.RepaymentNotesService;
/**
 * @ClassName: RepaymentNotesController 
 * @Description: TODO(还款记录控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-7下午3:55:00
 */
@Controller
@RequestMapping(value = "/repaymentNotes")
public class RepaymentNotesController extends AbstractController{
	@Autowired
	private RepaymentNotesService repaymentNotesService;// 注入还款记录业务Bean

	// 进入还款记录列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPreview() {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentNotes_mgr/repaymentNotes");
        return mav;
    }
    
    // 进入还款记录Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoRepaymentNotesFormPreview(String repayNotesId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentNotes_mgr/repaymentNotes_form");
        if(StringUtils.isNotBlank(repayNotesId)){
            mav.addObject("repaymentNotesData", repaymentNotesService.getRepaymentNotes(repayNotesId));
        }
        return mav;
    }
    
    // 进入还款记录Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoRepaymentNotesDetailPage(String repayNotesId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/repaymentNotes_mgr/repaymentNotes_detail");
        if(StringUtils.isNotBlank(repayNotesId)){
            mav.addObject("repaymentNotesData", repaymentNotesService.getRepaymentNotes(repayNotesId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer,RepaymentNotesQueryDTO repaymentNotesQueryDTO) {
        return repaymentNotesService.listAsGrid(pservicer,repaymentNotesQueryDTO);
    }
    
    // 增加还款记录
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addRepaymentNotes(@Valid RepaymentNotes review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return repaymentNotesService.addRepaymentNotes(review);
    }
    
    // 修改还款记录
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editRepaymentNotes(@Valid RepaymentNotes review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return repaymentNotesService.editRepaymentNotes(review);
    }
    
    // 批量删除还款记录
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delRepaymentNotes(@RequestParam List<String> repayNotesIds,@RequestParam List<String> repaymentNotesTitle) {
    	return repaymentNotesService.delRepaymentNotes(repayNotesIds, repaymentNotesTitle);
    }
}
