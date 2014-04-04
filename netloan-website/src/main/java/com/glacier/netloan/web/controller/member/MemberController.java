package com.glacier.netloan.web.controller.member;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.support.DefaultMultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuth;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberCreditIntegral;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.service.member.MemberApplyAmountService;
import com.glacier.netloan.service.member.MemberAuthService;
import com.glacier.netloan.service.member.MemberCreditIntegralService;
import com.glacier.netloan.service.member.MemberIntegralService;
import com.glacier.netloan.service.member.MemberService;


@Controller
@RequestMapping(value = "member")
public class MemberController extends AbstractController{

	@Autowired
	private MemberService memberService;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	@Autowired
	private MemberAuthService memberAuthService;
	
	@Autowired
	private MemberIntegralService memberIntegralService;
	
	@Autowired
	private MemberCreditIntegralService memberCreditIntegralService;
	
	@Autowired
	private MemberApplyAmountService memberApplyAmountService;
	
	// 进入会员个人主页展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember(HttpServletRequest request,HttpSession session) {
        ModelAndView mav = new ModelAndView("member_mgr/member");
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        
        List<ParameterCredit>  parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
    	//Member member = (Member)session.getAttribute("currentMember");
    	List<MemberCreditIntegral>  memberCreditIntegrals = (List<MemberCreditIntegral>) memberCreditIntegralService.listByMemberId(pricipalMember.getMemberId());
    	Map<String,Object> map = totalIntegralAndPhoto(parameterCredits, memberCreditIntegrals);
        
        int totalIntegral = memberIntegralService.totalIntegral();
        
        //获取信用总分和图标
    	request.setAttribute("totalIntegralCredit", map.get("totalIntegralCredit"));
    	request.setAttribute("totalCreditPhoto", map.get("totalCreditPhoto"));
    	//获取会员积分总数
    	request.setAttribute("totalIntegral", totalIntegral);
        return mav;
    }
  //转到头像上传页面。
  	@RequestMapping(value = "/memberPhotoInto.htm")
  	public Object memberPhotoInto(){
  		return "member_mgr/memberPhoto";
  	}
    
    // 进入会员个人详细信息展示页面
    @RequestMapping(value = "/memberDetail.htm")
    private Object intoMemberDetail(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView("member_mgr/memberDetail");
        Subject pricipalSubject = SecurityUtils.getSubject();
        Member pricipalMember = (Member) pricipalSubject.getPrincipal();
        MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs)memberAuthService.getMemberAuth(pricipalMember.getMemberId());
        
        if((memberAuthWithBLOBs.getInfoAuth().equals("noapply") && memberAuthWithBLOBs.getWorkAuth().equals("noapply"))||
        		(memberAuthWithBLOBs.getInfoAuth().equals("failure") && memberAuthWithBLOBs.getWorkAuth().equals("failure"))){
        	request.setAttribute("infoAndWorAuthstr", "infoAndWorEdit");        	
        }else{
        	request.setAttribute("infoAndWorAuthstr", "infoAndWorRealOnly");
        }
        return mav;
    }
    
    // 进入会员验证邮箱展示页面
    @RequestMapping(value = "/memberEmail.htm")
    private Object intoMemberEmail() {
        ModelAndView mav = new ModelAndView("member_mgr/memberEmail");
        return mav;
    }
    
    //判断修改密码
    @RequestMapping(value = "/updatememberPassword.htm", method = RequestMethod.POST)
    @ResponseBody
    private Object updatememberPassword(Member member,String oldPassword,String memberPassword,HttpSession session){
    	member.setMemberPassword(oldPassword);
    	JqReturnJson updatememberPassword = (JqReturnJson) memberService.isequalsPassword(member,oldPassword,memberPassword);
    	Member loginMember = (Member) memberService.getMember(member.getMemberId());
    	session.removeAttribute("currentMember");
		session.setAttribute("currentMember",loginMember);
    	return updatememberPassword;
    }
    //进行会员平台认证页面
    @RequestMapping(value = "/memberAuth.htm")
    public Object intoMemberAuth(JqPager pager,int p,HttpServletRequest request,HttpSession session){
    	ModelAndView mav = new ModelAndView("member_mgr/memberAuth");
    	Map<String,Object> integralMap = new HashMap<String,Object>();
    	Map<String,Object> applyAmountServiceMap = new HashMap<String,Object>();
    	//获取全部信用积分的范围列表
    	List<ParameterCredit>  parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
    	//通过获取member的Id，来得到改会员的所有信用积分
    	Member member = (Member)session.getAttribute("currentMember");
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());
    	List<MemberCreditIntegral>  memberCreditIntegrals = (List<MemberCreditIntegral>) memberCreditIntegralService.listByMemberId(member.getMemberId());
    	//通过该会员的所有信用积分和基础资料的信用积分得到，该会员的信用总分和图标
    	Map<String,Object> totalIntegralAndPhotoMap = totalIntegralAndPhoto(parameterCredits, memberCreditIntegrals);
    	//通过json来传递该会员的所有信用积分到前台
    	JSONArray jsonMemberCreditIntegrals = new JSONArray();  
    	jsonMemberCreditIntegrals.addAll(memberCreditIntegrals);
    	//通过request传递到前台。
    	request.setAttribute("parameterCredits", parameterCredits);
    	request.setAttribute("json", jsonMemberCreditIntegrals);
    	request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
    	request.setAttribute("memberCreditIntegrals", memberCreditIntegrals);
    	//获取信用总分和图标
    	request.setAttribute("totalIntegralCredit", totalIntegralAndPhotoMap.get("totalIntegralCredit"));
    	request.setAttribute("totalCreditPhoto", totalIntegralAndPhotoMap.get("totalCreditPhoto"));
    	//第一次访问该页面，p默认为0
    	if(p == 0 ){
    		//获取会员积分和申请额度分页列表。
    		integralMap = (Map<String, Object>) memberIntegralService.listAsWebsite(pager, 1);
    		applyAmountServiceMap = (Map<String, Object>) memberApplyAmountService.listAsWebsite(pager, 1);
    		session.setAttribute("memberIntegralDatas", integralMap.get("returnResult"));
    		session.setAttribute("memberApplyAmountDatas", applyAmountServiceMap.get("returnResult"));
    	}else{
    			integralMap = (Map<String, Object>) memberIntegralService.listAsWebsite(pager, p);
    			session.removeAttribute("memberIntegralDatas");
    			session.setAttribute("memberIntegralDatas", integralMap.get("returnResult"));
    			request.setAttribute("memberIntegraldo", "memberIntegraldo");
    	}
    	//获取会员积分总分
		request.setAttribute("totalIntegral", integralMap.get("totalIntegral"));
    	return mav;
    }
    //获取会员信用总分和信用图标
    public Map totalIntegralAndPhoto(List<ParameterCredit> parameterCredits,List<MemberCreditIntegral>  memberCreditIntegrals){
    	int totalIntegralCredit = 0;
    	String totalCreditPhoto = null;
    	Map<String,Object> map = new HashMap<String, Object>();
    	for(MemberCreditIntegral memberCreditIntegral : memberCreditIntegrals){
    		totalIntegralCredit += memberCreditIntegral.getChangeValue();
    	}
    	for(ParameterCredit parameterCredit : parameterCredits){
    		if(totalIntegralCredit >= parameterCredit.getCreditBeginIntegral() && totalIntegralCredit < parameterCredit.getCreditEndIntegral()){
    			totalCreditPhoto = parameterCredit.getCreditPhoto();
    			break;
    		}
    	}
    	map.put("totalIntegralCredit", totalIntegralCredit);
    	map.put("totalCreditPhoto", totalCreditPhoto);
    	return map;
    }
    @RequestMapping(value = "/uploadFile.htm", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadFile(HttpSession session,HttpServletRequest request,HttpServletResponse response,String whichAuth){
    	JSONObject obj = new JSONObject();
    	

    	//文件保存目录路径
        String savePath = session.getServletContext().getRealPath("/") + "/resources/upload/attached/";
        //文件保存目录URL
        String saveUrl  = request.getContextPath() + "/resources/upload/attached/";
        
    	//定义允许上传的文件扩展名
    	HashMap<String, String> extMap = new HashMap<String, String>();
    	extMap.put("image", "gif,jpg,jpeg,png,bmp");
    	extMap.put("flash", "swf,flv");
    	extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
    	extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,txt,zip,rar,gz,bz2");

    	//最大文件大小 100M
    	long maxSize = 102400000;

    	response.setContentType("text/html; charset=UTF-8");

    	if(!ServletFileUpload.isMultipartContent(request)){
    		obj.put("error", 1);
    		obj.put("message", "请选择文件。");
    		return obj.toJSONString();
    	}
    	//检查目录
    	File uploadDir = new File(savePath);
    	if(!uploadDir.isDirectory()){
    	 	obj.put("error", 1);
 			obj.put("message", "上传目录不存在。");
 			return obj.toJSONString();
    	}
    	//检查目录写权限
    	if(!uploadDir.canWrite()){
    	 	obj.put("error", 1);
			obj.put("message", "上传目录没有写权限。");
			return obj.toJSONString();
    	}
    	String dirName = request.getParameter("dir");
    	if (dirName == null) {
    		dirName = "image";
    	}
    	if(!extMap.containsKey(dirName)){
    		obj.put("error", 1);
    		obj.put("message", "目录名不正确。");
    		return obj.toJSONString();
    	}
    	
    	//创建文件夹
    	savePath += dirName + "/";
    	saveUrl += dirName + "/";
    	File saveDirFile = new File(savePath);
    	if (!saveDirFile.exists()) {
    	 saveDirFile.mkdirs();
    	}
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    	String ymd = sdf.format(new Date());
    	savePath += ymd + "/";
    	saveUrl += ymd + "/";
    	File dirFile = new File(savePath);
    	if (!dirFile.exists()) {
    	 dirFile.mkdirs();
    	}
    	
    	//文件上传部分
    	FileItemFactory factory = new DiskFileItemFactory();
    	ServletFileUpload upload = new ServletFileUpload(factory);
    	upload.setHeaderEncoding("UTF-8");
    	List items = null;
			try {
				items = upload.parseRequest(request);
				DefaultMultipartHttpServletRequest mrequest= (DefaultMultipartHttpServletRequest)request;
				Map map=mrequest.getFileMap();
				Collection<MultipartFile> c = map.values();
				Iterator it = c.iterator();
				for (; it.hasNext();) {
					CommonsMultipartFile file=(CommonsMultipartFile) it.next();
					 
					if(!file.isEmpty()){
					 long fileSize = file.getSize();
					 String fileName = file.getOriginalFilename();
					 String contentType=file.getContentType();
					 String fileExt = fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
					 if(fileSize > maxSize){
						 	obj.put("error", 1);
							obj.put("message", "上传文件大小超过限制。");
							return obj.toJSONString();
					 }
					 if(!Arrays.<String>asList(extMap.get(dirName).split(",")).contains(fileExt)){
						 obj.put("error", 1);
							obj.put("message", "上传文件扩展名是不允许的扩展名。\n只允许" + extMap.get(dirName) + "格式。");
							return obj.toJSONString();
					 }
					 FileItem item = null;
					 SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
					 String newFileName = df.format(new Date()) + "_" + new Random().nextInt(1000) + "." + fileExt;
					 
					 try{
					  File uploadedFile = new File(savePath, newFileName);
					  file.transferTo(uploadedFile);  
					 }catch(Exception e){
						obj.put("error", 1);
						obj.put("message", "上传文件失败。");
						return obj.toJSONString();
					 }
					 
					 obj.put("error", 0);
					 obj.put("message", "上传文件成功。");
					 obj.put("url", saveUrl + newFileName);
					 obj.put("title", fileName);
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			}
    	
    	return obj.toJSONString();
    }
	
	@RequestMapping(value = "/memberAccessoryForm.htm")
	@ResponseBody
	private Object memberAccessoryForm(String member_Accessory,HttpServletRequest request,HttpSession session,String whichAuth){
		Member member = (Member)session.getAttribute("currentMember");
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());
    	if(whichAuth.equals("idCardAuth")){
    		memberAuthWithBLOBs.setIdCardAccessory(member_Accessory);
    		if("".equals(member_Accessory)||member_Accessory == null){
    			memberAuthWithBLOBs.setIdCardAuth("noapply");
    		}else{
    			memberAuthWithBLOBs.setIdCardAuth("authstr");
    		}
		 }else if(whichAuth.equals("creditAuth")){
			 memberAuthWithBLOBs.setCreditAccessory(member_Accessory);
			 if("".equals(member_Accessory)||member_Accessory == null){
	    			memberAuthWithBLOBs.setCreditAuth("noapply");
	    		}else{
	    			 memberAuthWithBLOBs.setCreditAuth("authstr");
	    		}
		 }else if(whichAuth.equals("companyAuth")){
			 memberAuthWithBLOBs.setCompanyAccessory(member_Accessory);
			 if("".equals(member_Accessory)||member_Accessory == null){
	    			memberAuthWithBLOBs.setCompanyAuth("noapply");
	    		}else{
	    			memberAuthWithBLOBs.setCompanyAuth("authstr");
	    		}
		 }
		request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
		return memberAuthService.editMemberAuthReception(memberAuthWithBLOBs);
	}
	
}
