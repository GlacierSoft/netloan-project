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
import com.glacier.netloan.dto.query.borrow.AttentionBorrowingQueryDTO;
import com.glacier.netloan.entity.borrow.AttentionBorrowing;
import com.glacier.netloan.service.borrow.AttentionBorrowingService;
/**
 * @ClassName: AttentionBorrowingController 
 * @Description: TODO(关注借款控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-20下午5:44:51
 */
@Controller
@RequestMapping(value = "/attentionBorrowing")
public class AttentionBorrowingController extends AbstractController{
	@Autowired
	private AttentionBorrowingService attentionBorrowingService;// 注入关注借款业务Bean

	// 进入关注借款列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPreview() {
        ModelAndView mav = new ModelAndView("borrow_mgr/attentionBorrowing_mgr/attentionBorrowing");
        return mav;
    }
    
    // 进入关注借款Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoAttentionBorrowingFormPreview(String attentionBorrowingId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/attentionBorrowing_mgr/attentionBorrowing_form");
        if(StringUtils.isNotBlank(attentionBorrowingId)){
            mav.addObject("attentionBorrowingData", attentionBorrowingService.getAttentionBorrowing(attentionBorrowingId));
        }
        return mav;
    }
    
    // 进入关注借款Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoAttentionBorrowingDetailPage(String attentionBorrowingId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/attentionBorrowing_mgr/attentionBorrowing_detail");
        if(StringUtils.isNotBlank(attentionBorrowingId)){
            mav.addObject("attentionBorrowingData", attentionBorrowingService.getAttentionBorrowing(attentionBorrowingId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer,AttentionBorrowingQueryDTO attentionBorrowingQueryDTO) {
        return attentionBorrowingService.listAsGrid(pservicer,attentionBorrowingQueryDTO);
    }
    
    // 增加关注借款
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAttentionBorrowing(@Valid AttentionBorrowing review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return attentionBorrowingService.addAttentionBorrowing(review);
    }
    
    // 修改关注借款
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editAttentionBorrowing(@Valid AttentionBorrowing review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return attentionBorrowingService.editAttentionBorrowing(review);
    }
    
    // 批量删除关注借款
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delAttentionBorrowing(@RequestParam List<String> attentionBorrowingIds,@RequestParam List<String> attentionBorrowingTitle) {
    	//return attentionBorrowingService.delAttentionBorrowing(attentionBorrowingIds, attentionBorrowingTitle);
    	return null;
    }
}
