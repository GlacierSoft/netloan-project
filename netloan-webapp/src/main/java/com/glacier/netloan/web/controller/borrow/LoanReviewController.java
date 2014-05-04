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
import com.glacier.netloan.entity.borrow.LoanReview;
import com.glacier.netloan.service.borrow.LoanReviewService;

@Controller
@RequestMapping(value = "/LoanReview")
public class LoanReviewController extends AbstractController{
	@Autowired
	private LoanReviewService loanReviewService;// 注入借款留言业务Bean

	// 进入借款留言列表展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPreview() {
        ModelAndView mav = new ModelAndView("borrow_mgr/LoanReview_mgr/LoanReview");
        return mav;
    }
    
    // 进入借款留言Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoLoanReviewFormPreview(String loanReviewId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/LoanReview_mgr/LoanReview_form");
        if(StringUtils.isNotBlank(loanReviewId)){
            mav.addObject("reviewData", loanReviewService.getLoanReview(loanReviewId));
        }
        return mav;
    }
    
    // 进入借款留言Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoLoanReviewDetailPage(String loanReviewId) {
        ModelAndView mav = new ModelAndView("borrow_mgr/LoanReview_mgr/LoanReview_detail");
        if(StringUtils.isNotBlank(loanReviewId)){
            mav.addObject("reviewData", loanReviewService.getLoanReview(loanReviewId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(JqPager pservicer) {
        return loanReviewService.listAsGrid(pservicer);
    }
    
    // 增加借款留言
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addLoanReview(@Valid LoanReview review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return loanReviewService.addLoanReview(review);
    }
    
    // 修改借款留言
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editLoanReview(@Valid LoanReview review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return loanReviewService.editLoanReview(review);
    }
    
    // 批量删除借款留言
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delLoanReview(@RequestParam List<String> loanReviewIds,@RequestParam List<String> loanReviewTitle) {
    	return loanReviewService.delLoanReview(loanReviewIds, loanReviewTitle);
    }
}
