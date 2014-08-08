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
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.service.account.AccountLoginService;

/**
 * @ClassName: AccountLogintController 
 * @Description: TODO(登录统计控制层) 
 * @author junjie.zheng
 * @email 1203807137@QQ.com
 * @date 2014-8-5上午8:57:51
 */

@Controller
@RequestMapping("/accountLogin")
public class AccountLoginController extends AbstractController {
      
	@Autowired
	private AccountLoginService accountLoginService;
	  
	 //会员登入统计信息页
	 @RequestMapping(value="/index.htm")
	 public Object intoAccountLogin(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mode=new ModelAndView("account_mgr/accountLogin_mgr/accountLogin");
	    return mode ;	
	 }
	 
     //会员登入统计详情页
	 @RequestMapping(value = "/intoDetail.htm")
	 private Object intoAccountLoginDetailPage(String memberId) {
        ModelAndView mav = new ModelAndView("account_mgr/accountLogin_mgr/accountLogin_detail");
        if(StringUtils.isNotBlank(memberId)){
            mav.addObject("memberData", accountLoginService.getMember(memberId));
            mav.addObject("memberWorkData", accountLoginService.getMemberWork(memberId));
        }
        return mav;
	  }
	    
	  //获取表格结构的所有菜单数据
	  @RequestMapping(value = "/list.json", method = RequestMethod.POST)
	  @ResponseBody
	  private Object listActionAsGridByMenuId(JqPager jqPager, MemberQueryDTO memberQueryDTO, String q,HttpSession session) {
        JqGridReturn returnResult=(JqGridReturn)accountLoginService.listAsGrid(jqPager, memberQueryDTO, q);
        if(returnResult!=null){
        	List<Member> list=(List<Member>)returnResult.getRows();
        	session.setAttribute("List", list);
        }
    	return returnResult;
	  }
	    
	  //登录统计信息导出
	  @RequestMapping(value = "/exp.json")
	  private void expAccountLogin(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException{
    	  List<Member> list=(List<Member>)session.getAttribute("List");
    	  HSSFWorkbook wb=null;
    	  if(list.size()>0&&list!=null){
    		  wb = accountLoginService.export(list);  
    	  }else{
    		  List<Member> list_null=new ArrayList<Member>(); 
    		  Member member=new Member();
    		  member.setMemberName("Null");
    		  member.setMemberRealName("Null");
    		  member.setCardId("Null");
    		  member.setLiveAddress("Null");
    		  member.setMobileNumber("Null");
    		  member.setEmail("Null");
    		  member.setType("Null");
    		  member.setCreditIntegral(new Float(0.00));
    		  member.setLastLoginIpAddress("Null");
    		  member.setLoginCount(0);
    		  list_null.add(member);
    		  wb = accountLoginService.export(list_null); 
    	  }
		  response.setContentType("application/vnd.ms-excel");    
          SimpleDateFormat sf=new SimpleDateFormat("yyyyMMddHHmmss");
          String filename="AccountMemberInfo_"+sf.format(new Date());
          response.setHeader("Content-disposition", "attachment;filename="+filename+".xls");    
          OutputStream ouputStream = response.getOutputStream();    
          wb.write(ouputStream);    
          ouputStream.flush();    
          ouputStream.close();   
	   }
}	    
	    

	    
	    
	    
