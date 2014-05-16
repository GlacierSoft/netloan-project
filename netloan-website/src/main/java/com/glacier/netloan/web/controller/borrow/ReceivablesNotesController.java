package com.glacier.netloan.web.controller.borrow;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.service.borrow.ReceivablesNotesService;
import com.glacier.netloan.service.borrow.TenderNotesService;
/**
 * @ClassName: ReceivablesNotesController 
 * @Description: TODO(前台收款记录控制层) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-5-16上午10:26:29
 */
@Controller
@RequestMapping(value = "/receivablesNotes")
public class ReceivablesNotesController extends AbstractController{
	
	@Autowired
	private ReceivablesNotesService receivablesNotesService;// 注入收款记录业务Bean
	
	@Autowired
	private TenderNotesService tenderNotesService;

	// 进入前台我的投标回收中借款和已回收的借款
    @RequestMapping(value = "/memberReceivablesNotes.htm")
    private Object memberReceivablesNotes(JqPager jqPager,int p,String memberId,String loanId,String loanDetailStates,String loanStates, HttpServletRequest request) {
    	List<String> loanStatesList = new ArrayList<String>();
		if(loanStates != null){
			if(loanStates.equals("repaymentingBorrow")){
				loanStatesList.add("repaymenting");
				request.setAttribute("buttonState", "repaymentingBorrow");
			}else if(loanStates.equals("backAccountBorrow")){
				loanStatesList.add("repaymenting");
				request.setAttribute("buttonState", "backAccountBorrow");
			}
		}
		if(loanDetailStates != null){
			if(loanDetailStates.equals("alreadReceivables")){
				request.setAttribute("buttonState", "alreadReceivablesBorrow");
			}
		}
		JqGridReturn returnResultTenderNotes = (JqGridReturn)tenderNotesService.listAsGridWebsite(jqPager, p,loanId,memberId,loanStatesList);//获取我的投标列表
		request.setAttribute("tenderNotesDatas", returnResultTenderNotes);
		JqGridReturn returnResultReceivablesNotes = (JqGridReturn)receivablesNotesService.listAsGridWebsite(jqPager, p,memberId,loanStatesList,loanDetailStates);//获取我的投标中的回收中借款列表
		request.setAttribute("receivablesNotesDatas", returnResultReceivablesNotes);
		return "member_mgr/memberTenderNotes";
    }
    
}
