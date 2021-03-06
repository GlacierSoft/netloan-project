package com.glacier.netloan.web.controller.website;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.glacier.netloan.service.member.MemberService;


/**
 *  IP地址查询 
 *  电话号码归属地查询
 * **/


@Controller
@RequestMapping(value="others")
public class WebsiteOthersController {
     
	 @Autowired
	 private MemberService memberService;
	
	
	// 转到其他业务页面
	@RequestMapping(value = "/others.htm")
	public Object others(String str) {// IPNumber TellNumber
		ModelAndView mav = new ModelAndView("about_mgr/others");
		if ("IPNumber".equals(str) || str == null)
			mav.addObject("str", "IPNumber");
		else if ("TellNumber".equals(str))
			mav.addObject("str", "TellNumber");
		else if ("BorrowAgree".equals(str))
			mav.addObject("str", "BorrowAgree");
		else if ("ManageMoney".equals(str))
			mav.addObject("str", "ManageMoney");
		return mav;
	}
	
	//公司地址
	@RequestMapping(value="/otherAddress.htm")
	public Object OtherAddress(){
	 ModelAndView mav=new ModelAndView("about_mgr/aboutAddress");
	 return mav;
	}
	
	// Ip地址查询
	@RequestMapping(value = "FindIPAddress")
	public Object GetAddressByIp(String IP) {
		ModelAndView mav = new ModelAndView("about_mgr/others");
		mav.addObject("str", "IPNumber");
		String resout = "";
		try {
			String str = getJsonContent("http://ip.taobao.com/service/getIpInfo.php?ip="
					+ IP);
			System.out.println(str);
			try {
				JSONObject obj = JSONObject.fromObject(str);
				JSONObject obj2 = (JSONObject) obj.get("data");
				Integer code = (Integer) obj.get("code");
				if (code.equals(0)) {
					resout = obj2.get("country") + "--" + obj2.get("region")
							+ "--" + obj2.get("city") + "--" + obj2.get("isp");
				} else {
					resout = "IP地址有误";
				}
			} catch (ClassCastException e) {
				resout = "IP地址格式错误!";
			}
		} catch (Exception e) {
			e.printStackTrace();
			resout = "获取IP地址异常";
		}

		System.out.println("最终显示的地址为:" + resout);
		mav.addObject("Resout", resout);
		mav.addObject("ResoutIP", IP);
		return mav;
	}
		 
	public static String getJsonContent(String urlStr) {

		try {// 获取HttpURLConnection连接对象
			URL url = new URL(urlStr);
			HttpURLConnection httpConn = (HttpURLConnection) url
					.openConnection();
			// 设置连接属性
			httpConn.setConnectTimeout(3000);
			httpConn.setDoInput(true);
			httpConn.setRequestMethod("GET");
			// 获取相应码
			int respCode = httpConn.getResponseCode();
			if (respCode == 200) {
				return ConvertStream2Json(httpConn.getInputStream());
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";

	}
		  
		  
	private static String ConvertStream2Json(InputStream inputStream) {
		String jsonStr = "";
		// ByteArrayOutputStream相当于内存输出流
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] buffer = new byte[1024];
		int len = 0;
		// 将输入流转移到内存输出流中
		try {
			while ((len = inputStream.read(buffer, 0, buffer.length)) != -1) {
				out.write(buffer, 0, len);
			}

			// 将内存流转换为字符串
			jsonStr = new String(out.toByteArray());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsonStr;
	}
		   
		   
	@RequestMapping(value = "FindTellAddress_two")
	public Object calcMobileCity(String mobileNumber)
			throws MalformedURLException {
		ModelAndView mav = new ModelAndView("about_mgr/others");
		mav.addObject("str", "TellNumber");
		mav.addObject("mobileNumber", mobileNumber);
		String jsonString = null;
		JSONArray array = null;
		JSONObject jsonObject = null;
		String urlString = "http://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel="
				+ mobileNumber;
		StringBuffer sb = new StringBuffer();
		BufferedReader buffer;
		String PhoneNumberAddress = null;
		URL url = new URL(urlString);

		try {
			InputStream in = url.openStream();
			// 解决乱码问题
			buffer = new BufferedReader(new InputStreamReader(in, "gb2312"));
			String line = null;
			while ((line = buffer.readLine()) != null) {
				sb.append(line);
			}
			in.close();
			buffer.close();
			// System.out.println(sb.toString());
			jsonString = sb.toString();
			// 替换掉“__GetZoneResult_ = ”，让它能转换为JSONArray对象
			jsonString = jsonString.replaceAll("^[__]\\w{14}+[_ = ]+", "[");
			// System.out.println(jsonString+"]");
			String jsonString2 = jsonString + "]";
			// 把STRING转化为json对象
			array = JSONArray.fromObject(jsonString2);

			// 获取JSONArray的JSONObject对象，便于读取array里的键值对
			try {
				jsonObject = array.getJSONObject(0);
				PhoneNumberAddress = jsonObject.getString("province") + "--"
						+ jsonObject.getString("catName");
				mav.addObject("PhoneNumberAddress", PhoneNumberAddress);
			} catch (JSONException e) {
				PhoneNumberAddress = "电话号码格式输入错误!!";
				mav.addObject("PhoneNumberAddress", PhoneNumberAddress);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
		   
	@RequestMapping(value = "FindTellAddress")
	public Object FindPhoneTestTwo(String mobileNumber) throws Exception {
		ModelAndView mav = new ModelAndView("about_mgr/others");
		mav.addObject("str", "TellNumber");
		mav.addObject("mobileNumber", mobileNumber);
		String urlString = "http://www.096.me/api.php?mode=txt&phone="
				+ mobileNumber;
		URL url = new URL(urlString);
		try {
			InputStream in = url.openStream();
			StringBuffer sb = new StringBuffer();
			// 解决乱码问题
			BufferedReader buffer = new BufferedReader(new InputStreamReader(
					in, "gb2312"));
			String line = null;
			while ((line = buffer.readLine()) != null) {
				sb.append(line);
			}
			in.close();
			buffer.close();
			String jsonString_two = sb.toString();
			System.out.println(jsonString_two);
			int numb_one = jsonString_two.indexOf("||");
			int numb_two = jsonString_two.indexOf("||", numb_one + 2);
			String jsonString = jsonString_two
					.substring(numb_one + 2, numb_two);
			System.out.println("numb_one=" + numb_one + "  numb_two="
					+ numb_two + " words=" + jsonString);
			mav.addObject("PhoneNumberAddress", jsonString);
		} catch (StringIndexOutOfBoundsException e) {
			String jsonString = "手机号码格式输入错误!!!";
			mav.addObject("PhoneNumberAddress", jsonString);
		}
		return mav;
	}
		    
		    
	@RequestMapping(value = "FindTellAddress_three")
	public Object findPhonenNumber(String mobileNumber) throws Exception {
		String str = getJsonContent("http://api.k780.com:88/?app=phone.get&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json&phone="
				+ mobileNumber);
		ModelAndView mav = new ModelAndView("about_mgr/others");
		mav.addObject("str", "TellNumber");
		mav.addObject("mobileNumber", mobileNumber);
		//System.out.println(str);
		try {
			JSONObject obj = JSONObject.fromObject(str);
			JSONObject obj2 = (JSONObject) obj.get("result");
			String code = (String) obj.get("success");
			if (code.equals("1")) {
				String resout = obj2.get("style_simcall") + ","+ obj2.get("operators");
				mav.addObject("PhoneNumberAddress", resout);
			} else {
				String resout = (String) obj2.get("msg");
				mav.addObject("PhoneNumberAddress", resout);
			}
		} catch (NullPointerException e) {
			mav.addObject("PhoneNumberAddress", "手机号码输入格式错误!!!");
		}
		return mav;
	}
		    
	@RequestMapping(value="FindNote.json")
	@ResponseBody
	public Object findNote(int mobile_code,HttpSession session){
		Map<String,Object> map=new HashMap<String, Object>();
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		if(((Integer) session.getAttribute("mobile_code"))==mobile_code){
			map.put("info", true);
		}else{
			map.put("info", false);
		}
		list.add(map);
		return list;
	} 
	
	@RequestMapping(value="UpdatePhone.json")
	@ResponseBody
	public Object UpdatePhone(String memberId,String mobileNumber,int mobile_code,String changeReason,HttpSession session){
		Map<String,Object> map=new HashMap<String, Object>();
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		if(((Integer) session.getAttribute("mobile_code"))==mobile_code){
			boolean info=memberService.updatePhone(memberId, mobileNumber, changeReason);
			if(info){
				map.put("info", true);
			}else{
				map.put("info", false);
			}
		}else{
			map.put("info", false);
		}
		list.add(map);
		return list;
	} 
	
	@RequestMapping(value="FuckPhone.json")
	@ResponseBody
	public Object FindMobile(String memberId){
		Map<String,Object> map=new HashMap<String, Object>();
		List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
		String mobile_info=memberService.FindMobile(memberId);
		if(mobile_info!=null){
			map.put("info",mobile_info);
		}else{
			map.put("info","暂无绑定手机!!!");
		}
		list.add(map);
		return list;
	}
}
