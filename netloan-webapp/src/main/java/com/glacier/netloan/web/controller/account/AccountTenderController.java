package com.glacier.netloan.web.controller.account;

import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.netloan.dto.query.borrow.TenderNotesQueryDTO;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.borrow.TenderNotes;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.account.AccountLoginService;
import com.glacier.netloan.service.account.AccountTenderService;


@Controller
@RequestMapping("/accountTender")
public class AccountTenderController extends AbstractController {
	
    @Autowired
    private AccountTenderService accountTenderService;

      //投标统计信息页
	 @RequestMapping(value="/index.htm")
	 public Object intoAccountTender(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("account_mgr/accountTender_mgr/accountTender");
	    return mode ;	
	}
	 
	  //投标统计详情页
	  @RequestMapping(value = "/intoDetail.htm")
	  private Object intoAccountTenderDetailPage(String tenderNotesId) {
	        ModelAndView mav = new ModelAndView("account_mgr/accountTender_mgr/accountTender_detail");
	        if(StringUtils.isNotBlank(tenderNotesId)){
	            mav.addObject("accountTenderData", accountTenderService.getTenderNotes(tenderNotesId));
	        }
	       return mav;
	    }
	    
	    // 获取表格结构的所有菜单数据
	    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	    @ResponseBody
	    private Object listActionAsGridByMenuId(JqPager jqPager, TenderNotesQueryDTO tenderNotesQueryDTO, String q,HttpSession session) {
	        JqGridReturn returnResult=(JqGridReturn) accountTenderService.listAsGrid(jqPager, tenderNotesQueryDTO, q);
	    	if(returnResult!=null){
	    	    List<TenderNotes> list=(List<TenderNotes>) returnResult.getRows();
	    	    session.setAttribute("List", list);
	    	}
	        return returnResult;
	    }
	    
	    
	    //登录统计信息导出
	    @RequestMapping(value = "/exp.json")
	    private void expAccountTender(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
	    	  List<TenderNotes> list=(List<TenderNotes>)session.getAttribute("List");
	    	  HSSFWorkbook wb=null;
	    	  if(list.size()>0&&list!=null){
	    		  wb = accountTenderService.export(list);	  
	    	  }else{
	    		  List<TenderNotes> list_null=new ArrayList<TenderNotes>();
	    		  TenderNotes tendNotes=new TenderNotes();
	    		   tendNotes.setMemberDisplay("Null");
	    		   tendNotes.setCreditIntegral(new Float(0.00));
	    		   tendNotes.setSubTotal(new Float(0.00));
	    		   tendNotes.setLoanTitle("Null");
	    		   tendNotes.setLoanMemberDisplay("Null");
	    		   tendNotes.setLoanApr(new Float(0.00));
	    		   tendNotes.setLoanDeadlinesId("Null");
	    		   tendNotes.setAlrTenderPro(new Float(0.00));
	    		   tendNotes.setRemark("Null");
	    		   list_null.add(tendNotes);
	    		   wb=accountTenderService.export(list);
	    	  }
	    	  response.setContentType("application/vnd.ms-excel");    
	          SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
	          String filename="AccountTenderInfo_"+sf.format(new Date());
	    	  response.setHeader("Content-disposition", "attachment;filename="+filename+".xls");    
	          OutputStream ouputStream = response.getOutputStream();    
	          wb.write(ouputStream);    
	          ouputStream.flush();    
	          ouputStream.close();    
	     }
}
