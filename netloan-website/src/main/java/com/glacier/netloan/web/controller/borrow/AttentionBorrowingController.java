package com.glacier.netloan.web.controller.borrow;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
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
    @RequestMapping(value = "/memberAttentionBorrowing.htm")
    private Object memberAttentionBorrowing(AttentionBorrowingQueryDTO attentionBorrowingQueryDTO,JqPager jqPager,int p,String memberId,HttpServletRequest request) {
        //查询我关注借款的列表
    	JqGridReturn returnResultAttentionBorrowing = (JqGridReturn)attentionBorrowingService.listAsGridWebsite(attentionBorrowingQueryDTO,jqPager, p, memberId);
    	request.setAttribute("returnResultAttentionBorrowing", returnResultAttentionBorrowing);
    	request.setAttribute("attentionBorrowingQueryDTO", attentionBorrowingQueryDTO);
        return "member_mgr/memberAttentionBorrowing";
    }
    
    // 增加关注借款
    @RequestMapping(value = "/addAttentionBorrowing.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addAttentionBorrowing(@Valid AttentionBorrowing review, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return attentionBorrowingService.addAttentionBorrowing(review);
    }
    
    
    // 批量删除关注借款
    @RequestMapping(value = "/delAttentionBorrowing.json")
    public Object delAttentionBorrowing(AttentionBorrowingQueryDTO attentionBorrowingQueryDTO,JqPager jqPager,String memberId,@RequestParam String attentionBorrowingId,String attentionBorrowingTitle,HttpServletRequest request) {
    	//删除我关注的借款
    	attentionBorrowingService.delAttentionBorrowing(attentionBorrowingId, attentionBorrowingTitle);
    	//查询我关注借款的列表
    	JqGridReturn returnResultAttentionBorrowing = (JqGridReturn)attentionBorrowingService.listAsGridWebsite(attentionBorrowingQueryDTO,jqPager, 1, memberId);
    	request.setAttribute("returnResultAttentionBorrowing", returnResultAttentionBorrowing);
    	return "member_mgr/memberAttentionBorrowing";
    }
}
