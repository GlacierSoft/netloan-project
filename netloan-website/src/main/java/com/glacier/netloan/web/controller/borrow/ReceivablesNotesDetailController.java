package com.glacier.netloan.web.controller.borrow;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.borrow.ReceivablesNotesDetailService;
/**
 * @ClassName: ReceivablesNotesDetailController 
 * @Description: TODO(收款记录明细控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-9下午4:51:48
 */
@Controller
@RequestMapping(value = "/receivablesNotesDetail")
public class ReceivablesNotesDetailController extends AbstractController{
	@Autowired
	private ReceivablesNotesDetailService receivablesNotesDetailService;// 注入收款记录明细业务Bean

	// 进入收款记录明细列表展示页面
	@ResponseBody
    @RequestMapping(value = "/receivablesNotesDetailList.json")
    private Object receivablesNotesDetailList(JqPager jqPager,int p,String memberId,String receNotesId, HttpServletRequest request) {
        
		JqGridReturn receivablesNotesDetails = (JqGridReturn)receivablesNotesDetailService.listAsGridWebsite(jqPager, p, receNotesId, memberId);
		request.setAttribute("receivablesNotesDetailsDatas", receivablesNotesDetails);
		return receivablesNotesDetails;
    }
    
   
}
