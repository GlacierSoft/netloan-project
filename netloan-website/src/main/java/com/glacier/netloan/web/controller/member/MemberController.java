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
import org.springframework.beans.factory.annotation.Autowired;
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
import com.alibaba.fastjson.JSONObject;
import com.glacier.core.controller.AbstractController;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuth;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.service.member.MemberAuthService;
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
	
	// 进入会员个人主页展示页面
    @RequestMapping(value = "/index.htm")
    private Object intoIndexPmember() {
        ModelAndView mav = new ModelAndView("member_mgr/member");
        return mav;
    }
    
    // 进入会员个人详细信息展示页面
    @RequestMapping(value = "/memberDetail.htm")
    private Object intoMemberDetail() {
        ModelAndView mav = new ModelAndView("member_mgr/memberDetail");
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
    public Object intoMemberAuth(HttpServletRequest request,HttpSession session){
    	ModelAndView mav = new ModelAndView("member_mgr/memberAuth");
    	List<ParameterCredit>  parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
    	
    	Member member = (Member)session.getAttribute("currentMember");
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());
    	//session.removeAttribute("parameterCredits");
    	//session.removeAttribute("memberAuthWithBLOBs");
    	//session.setAttribute("parameterCredits", parameterCredits);
    	request.setAttribute("parameterCredits", parameterCredits);
    	//session.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
    	request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
    	//System.out.println("aaaaaaaa  "+session.getServletContext().getAttribute("fields"));
    	return mav;
    }
    
    @RequestMapping(value = "/uploadFile.htm", method = RequestMethod.POST)
    @ResponseBody
    public Object uploadFile(HttpSession session,HttpServletRequest request,HttpServletResponse response,String whichAuth){
    	JSONObject obj = new JSONObject();
    	

    	//文件保存目录路径
        String savePath = session.getServletContext().getRealPath("/") + "/resources/upload/attached/";
        //文件保存目录URL
        String saveUrl  = request.getContextPath() + "/resources/upload/attached/";
        
        System.out.println("savePath is :"+savePath);
        System.out.println("saveUrl is :"+saveUrl);
    	
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
    	System.out.println("dirName is "+dirName);
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
					    System.out.println("tttt  "+fileExt);
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
/*    @RequestMapping(value = "/uploadFile.htm", method = RequestMethod.POST)
    public void uploadFile(HttpSession session,HttpServletRequest request,HttpServletResponse response) throws FileUploadException{
    	
    	JSONObject obj = new JSONObject();
    	Member member = (Member)session.getAttribute("currentMember");
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());

    	//文件保存目录路径
        String savePath = session.getServletContext().getRealPath("/") + "/resources/upload/attached/";
        //文件保存目录URL
        String saveUrl  = request.getContextPath() + "/resources/upload/attached/";
        
        System.out.println("savePath is :"+savePath);
        System.out.println("saveUrl is :"+saveUrl);
    	
     // 定义允许上传的文件扩展名
     		HashMap<String, String> extMap = new HashMap<String, String>();
     		extMap.put("image", "gif,jpg,jpeg,png,bmp");
     		extMap.put("flash", "swf,flv");
     		extMap.put("media", "swf,flv,mp3,wav,wma,wmv,mid,avi,mpg,asf,rm,rmvb");
     		extMap.put("file", "doc,docx,xls,xlsx,ppt,htm,html,xml,sql,txt,zip,rar,gz,bz2,pdf");

     		// 最大文件大小
     		long maxSize = 10000000;

     		response.setContentType("text/html; charset=UTF-8");

     		if (!ServletFileUpload.isMultipartContent(request)) {
     			writeMsg(response, "请选择文件。");
     			return;
     		}
     		// 检查目录
     		File uploadDir = new File(savePath);
     		System.out.println(savePath);
     		if (!uploadDir.isDirectory()) {
     			writeMsg(response, "上传目录不存在。");
     			return;
     		}
     		// 检查目录写权限
     		if (!uploadDir.canWrite()) {
     			writeMsg(response, "上传目录没有写权限。");
     			return;
     		}

     		String dirName = request.getParameter("dir");
     		if (dirName == null) {
     			dirName = "image";
     		}
     		if (!extMap.containsKey(dirName)) {
     			writeMsg(response, "目录名不正确。");
     			return;
     		}
     		// 创建文件夹
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
					    System.out.println("tttt  "+fileExt);
					 if(fileSize > maxSize){
						 writeMsg(response, "上传文件大小超过限制。");
	     					return;
					 }
					 if(!Arrays.<String>asList(extMap.get(dirName).split(",")).contains(fileExt)){
						 writeMsg(response, "上传文件扩展名是不允许的扩展名。\n只允许"
	     							+ extMap.get(dirName) + "格式。");
	     					return;
					 }
					 FileItem item = null;
					 SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
					 String newFileName = df.format(new Date()) + "_" + new Random().nextInt(1000) + "." + fileExt;
					 
					 try{
					  File uploadedFile = new File(savePath, newFileName);
					  file.transferTo(uploadedFile);  
					 }catch(Exception e){
						 writeMsg(response, "上传文件失败。");
	     					return;
					 }
					 memberAuthWithBLOBs.setIdCardAccessory(saveUrl + newFileName);
					 memberAuthService.editMemberAuthReception(memberAuthWithBLOBs);
					 obj.put("error", 1);
					 obj.put("message", "上传文件成功。");
					 obj.put("url", saveUrl + newFileName);
					 obj.put("title", fileName);
					 Map<String, Object> msg = new HashMap<String, Object>();
						msg.put("error", 0);
						msg.put("url", saveUrl + newFileName);
						//WebUtil.writerJson(response, msg);
						writeJson(response, msg);
					}
				}
			} catch (FileUploadException e) {
				e.printStackTrace();
			}

     		
    }*/
    
    /**
	 * 输出信息
	 * @param response
	 * @param message
	 */
	private void writeMsg(HttpServletResponse response, String message)
	{
		Map<String, Object> msg = new HashMap<String, Object>();
		msg.put("error", 1);
		msg.put("message", message);
		
		//WebUtil.writerJson(response, msg);
		writeJson(response, msg);
		
	}
	
	/**
	 *输出json
	 * @param response
	 * @param msg
	 */
	private void writeJson(HttpServletResponse response, Object msg)
	{
		/************以下是解决避免ie下载文件 start*************/
		response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            
			writer.println(JSON.toJSONString(msg));
            
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        /************以下是解决避免ie下载文件 end*************/
	}
    
	/**
	 * 文件管理
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@RequestMapping(value = "file_manager_json.do")
	public void fileManager(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ServletContext application = request.getSession().getServletContext();
		ServletOutputStream out = response.getOutputStream();
		// 根目录路径，可以指定绝对路径，比如 /var/www/attached/
		String rootPath = application.getRealPath("/") + "attached/";
		// 根目录URL，可以指定绝对路径，比如 http://www.yoursite.com/attached/
		String rootUrl = request.getContextPath() + "/attached/";
		// 图片扩展名
		String[] fileTypes = new String[] { "gif", "jpg", "jpeg", "png", "bmp" };

		String dirName = request.getParameter("dir");
		if (dirName != null) {
			if (!Arrays.<String> asList(
					new String[] { "image", "flash", "media", "file" })
					.contains(dirName)) {
				out.println("Invalid Directory name.");
				return;
			}
			rootPath += dirName + "/";
			rootUrl += dirName + "/";
			File saveDirFile = new File(rootPath);
			if (!saveDirFile.exists()) {
				saveDirFile.mkdirs();
			}
		}
		// 根据path参数，设置各路径和URL
		String path = request.getParameter("path") != null ? request
				.getParameter("path") : "";
		String currentPath = rootPath + path;
		String currentUrl = rootUrl + path;
		String currentDirPath = path;
		String moveupDirPath = "";
		if (!"".equals(path)) {
			String str = currentDirPath.substring(0,
					currentDirPath.length() - 1);
			moveupDirPath = str.lastIndexOf("/") >= 0 ? str.substring(0,
					str.lastIndexOf("/") + 1) : "";
		}

		// 排序形式，name or size or type
		String order = request.getParameter("order") != null ? request
				.getParameter("order").toLowerCase() : "name";

		// 不允许使用..移动到上一级目录
		if (path.indexOf("..") >= 0) {
			out.println("Access is not allowed.");
			return;
		}
		// 最后一个字符不是/
		if (!"".equals(path) && !path.endsWith("/")) {
			out.println("Parameter is not valid.");
			return;
		}
		// 目录不存在或不是目录
		File currentPathFile = new File(currentPath);
		if (!currentPathFile.isDirectory()) {
			out.println("Directory does not exist.");
			return;
		}
		// 遍历目录取的文件信息
		List<Hashtable> fileList = new ArrayList<Hashtable>();
		if (currentPathFile.listFiles() != null) {
			for (File file : currentPathFile.listFiles()) {
				Hashtable<String, Object> hash = new Hashtable<String, Object>();
				String fileName = file.getName();
				if (file.isDirectory()) {
					hash.put("is_dir", true);
					hash.put("has_file", (file.listFiles() != null));
					hash.put("filesize", 0L);
					hash.put("is_photo", false);
					hash.put("filetype", "");
				} else if (file.isFile()) {
					String fileExt = fileName.substring(
							fileName.lastIndexOf(".") + 1).toLowerCase();
					hash.put("is_dir", false);
					hash.put("has_file", false);
					hash.put("filesize", file.length());
					hash.put("is_photo", Arrays.<String> asList(fileTypes)
							.contains(fileExt));
					hash.put("filetype", fileExt);
				}
				hash.put("filename", fileName);
				hash.put("datetime",
						new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(file
								.lastModified()));
				fileList.add(hash);
			}
		}

		if ("size".equals(order)) {
			Collections.sort(fileList, new SizeComparator());
		} else if ("type".equals(order)) {
			Collections.sort(fileList, new TypeComparator());
		} else {
			Collections.sort(fileList, new NameComparator());
		}
		Map<String, Object> msg = new HashMap<String, Object>();
		msg.put("moveup_dir_path", moveupDirPath);
		msg.put("current_dir_path", currentDirPath);
		msg.put("current_url", currentUrl);
		msg.put("total_count", fileList.size());
		msg.put("file_list", fileList);
		response.setContentType("application/json; charset=UTF-8");
		String msgStr = "";
			
		msgStr = JSON.toJSONString(msg);
		
		out.println(msgStr);
	}

	@SuppressWarnings("rawtypes")
	class NameComparator implements Comparator {
		public int compare(Object a, Object b) {
			Hashtable hashA = (Hashtable) a;
			Hashtable hashB = (Hashtable) b;
			if (((Boolean) hashA.get("is_dir"))
					&& !((Boolean) hashB.get("is_dir"))) {
				return -1;
			} else if (!((Boolean) hashA.get("is_dir"))
					&& ((Boolean) hashB.get("is_dir"))) {
				return 1;
			} else {
				return ((String) hashA.get("filename"))
						.compareTo((String) hashB.get("filename"));
			}
		}
	}

	@SuppressWarnings("rawtypes")
	class SizeComparator implements Comparator {
		public int compare(Object a, Object b) {
			Hashtable hashA = (Hashtable) a;
			Hashtable hashB = (Hashtable) b;
			if (((Boolean) hashA.get("is_dir"))
					&& !((Boolean) hashB.get("is_dir"))) {
				return -1;
			} else if (!((Boolean) hashA.get("is_dir"))
					&& ((Boolean) hashB.get("is_dir"))) {
				return 1;
			} else {
				if (((Long) hashA.get("filesize")) > ((Long) hashB
						.get("filesize"))) {
					return 1;
				} else if (((Long) hashA.get("filesize")) < ((Long) hashB
						.get("filesize"))) {
					return -1;
				} else {
					return 0;
				}
			}
		}
	}
	
	@SuppressWarnings("rawtypes")
	class TypeComparator implements Comparator {
		public int compare(Object a, Object b) {
			Hashtable hashA = (Hashtable) a;
			Hashtable hashB = (Hashtable) b;
			if (((Boolean) hashA.get("is_dir"))
					&& !((Boolean) hashB.get("is_dir"))) {
				return -1;
			} else if (!((Boolean) hashA.get("is_dir"))
					&& ((Boolean) hashB.get("is_dir"))) {
				return 1;
			} else {
				return ((String) hashA.get("filetype"))
						.compareTo((String) hashB.get("filetype"));
			}
		}
	}
	
	@RequestMapping(value = "/idCardAccessoryForm.htm")
	@ResponseBody
	private Object idCardAccessoryForm(String member_idCardAccessory,HttpServletRequest request,HttpSession session,String whichAuth){
		JqReturnJson jqReturnJson = new JqReturnJson();
		Member member = (Member)session.getAttribute("currentMember");
    	MemberAuthWithBLOBs memberAuthWithBLOBs = (MemberAuthWithBLOBs) memberAuthService.getMemberAuth(member.getMemberId());
    	if(whichAuth.equals("idCardAuth")){
    		memberAuthWithBLOBs.setIdCardAccessory(member_idCardAccessory);
    		memberAuthWithBLOBs.setIdCardAuth("authstr");
		 }else if(whichAuth.equals("creditAuth")){
			 memberAuthWithBLOBs.setCreditAccessory(member_idCardAccessory);
			 memberAuthWithBLOBs.setCreditAuth("authstr");
		 }else if(whichAuth.equals("companyAuth")){
			 memberAuthWithBLOBs.setCompanyAccessory(member_idCardAccessory);
			 memberAuthWithBLOBs.setCompanyAuth("authstr");
		 }
    	
		System.out.println("kakkaka  :"+member_idCardAccessory);
		//jqReturnJson.setMsg("看看成功");
		//jqReturnJson.setSuccess(true);
		request.setAttribute("memberAuthWithBLOBs", memberAuthWithBLOBs);
		return memberAuthService.editMemberAuthReception(memberAuthWithBLOBs);
	}
	
    // 进入会员Form表单页面
    @RequestMapping(value = "/intoForm.htm")
    private Object intoMemberFormPmember(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/member_mgr/member_form");
        if(StringUtils.isNotBlank(memberId)){
            mav.addObject("memberData", memberService.getMember(memberId));
            mav.addObject("memberWorkData", memberService.getMemberWork(memberId));
        }
        return mav;
    }
    
    // 进入会员Detail信息页面
    @RequestMapping(value = "/intoDetail.htm")
    private Object intoMemberDetailPage(String memberId) {
        ModelAndView mav = new ModelAndView("member_mgr/member_mgr/member_detail");
        if(StringUtils.isNotBlank(memberId)){
            mav.addObject("memberData", memberService.getMember(memberId));
            mav.addObject("memberWorkData", memberService.getMemberWork(memberId));
        }
        return mav;
    }
    
    // 获取表格结构的所有菜单数据
    @RequestMapping(value = "/list.json", method = RequestMethod.POST)
    @ResponseBody
    private Object listActionAsGridByMenuId(MemberQueryDTO memberQueryDTO, JqPager pmember) {
        return memberService.listAsGrid(memberQueryDTO,pmember);
    }
    
    // 增加会员
    @RequestMapping(value = "/add.json", method = RequestMethod.POST)
    @ResponseBody
    private Object addMember(@Valid Member member,@Valid MemberWork memberWork, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        return memberService.addMemberandWorkandAuth(member, memberWork);
    }
    
    // 修改会员
    @RequestMapping(value = "/edit.json", method = RequestMethod.POST)
    @ResponseBody
    private Object editMember(@Valid Member member,BindingResult bindingResult,@Valid MemberWork memberWork,BindingResult bindingResultWork) {
        if (bindingResult.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResult);
        }
        if (bindingResultWork.hasErrors()) {// 后台校验的错误信息
            return returnErrorBindingResult(bindingResultWork);
        }
        return memberService.editMemberandWork(member, memberWork);
    }
    // 批量删除会员
    @RequestMapping(value = "/del.json", method = RequestMethod.POST)
    @ResponseBody
    public Object delMember(@RequestParam List<String> memberIds,@RequestParam List<String> memberNames) {
    	return memberService.delMemberandWorkandAuth(memberIds, memberNames);
    }
}
