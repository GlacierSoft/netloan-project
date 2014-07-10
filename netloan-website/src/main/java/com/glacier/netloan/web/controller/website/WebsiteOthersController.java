package com.glacier.netloan.web.controller.website;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;






@Controller
@RequestMapping(value="others")
public class WebsiteOthersController {
     
	//转到其他业务页面
	@RequestMapping(value = "/others.htm")
	public Object others(String str){//IPNumber TellNumber
		ModelAndView mav = new ModelAndView("about_mgr/others");
		if("IPNumber".equals(str)||str==null)
			   mav.addObject("str","IPNumber");
		else if("TellNumber".equals(str))
			  mav.addObject("str","TellNumber");
		else if("BorrowAgree".equals(str))
			  mav.addObject("str","BorrowAgree");
		else if("ManageMoney".equals(str))
			   mav.addObject("str","ManageMoney");
		return mav;
	}
	
	
	
	
	 //Ip地址查询
	 @RequestMapping(value="FindIPAddress")
	 public Object GetAddressByIp(String IP){
		    ModelAndView mav=new ModelAndView("about_mgr/others");
		    mav.addObject("str","IPNumber");
			String resout = "";
			try {
				String str = getJsonContent("http://ip.taobao.com/service/getIpInfo.php?ip="+ IP);
                System.out.println(str);
                JSONObject obj = JSONObject.fromObject(str);
                JSONObject obj2 = (JSONObject) obj.get("data");
                Integer code =  (Integer) obj.get("code");   
                if(code.equals(0)){  
                    resout = obj2.get("country") + "--" + obj2.get("region") + "--"+ obj2.get("city") + "--"+ obj2.get("isp");
                 } else {
                     resout = "IP地址有误";
                  }
               } catch (Exception e) {
                 e.printStackTrace();
                 resout = "获取IP地址异常";
              }
			
			    System.out.println("最终显示的地址为:"+resout);
			    mav.addObject("Resout",resout);
			    mav.addObject("ResoutIP",IP);
                return mav;
           }
		 
		 public static String getJsonContent(String urlStr)
		    {
		 
	         try{// 获取HttpURLConnection连接对象
	             URL url = new URL(urlStr);
	             HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
	             // 设置连接属性
	             httpConn.setConnectTimeout(3000);
	             httpConn.setDoInput(true);
	             httpConn.setRequestMethod("GET");
	             // 获取相应码
		         int respCode = httpConn.getResponseCode();
		         if (respCode == 200)
		             {
		                return ConvertStream2Json(httpConn.getInputStream());
		             }
		         }
		         catch (MalformedURLException e){
		             e.printStackTrace();
		         }
		         catch (IOException e){
		            e.printStackTrace();
		          }
		        return "";
		 
		     }
		  
		  
		   private static String ConvertStream2Json(InputStream inputStream)
		    {
		         String jsonStr = "";
		         // ByteArrayOutputStream相当于内存输出流
		         ByteArrayOutputStream out = new ByteArrayOutputStream();
		         byte[] buffer = new byte[1024];
		         int len = 0;
		         // 将输入流转移到内存输出流中
		         try{
		              while ((len = inputStream.read(buffer, 0, buffer.length)) != -1)
		             {
		                 out.write(buffer, 0, len);
		              }
		 
		             // 将内存流转换为字符串
		             jsonStr = new String(out.toByteArray());
		           }
		        catch (IOException e)
		         {
		             // TODO Auto-generated catch block
		             e.printStackTrace();
		          }
		             return jsonStr;
		       }
		   
		   
		    @RequestMapping(value="FindTellAddress")
		    public  Object calcMobileCity(String mobileNumber) throws MalformedURLException{
		    	ModelAndView mav=new ModelAndView("about_mgr/others");
				mav.addObject("str","TellNumber");
		    	mav.addObject("mobileNumber",mobileNumber);
				String jsonString = null;
		        JSONArray array = null;
		        JSONObject jsonObject = null;
		        String urlString = "http://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=" + mobileNumber;
		        StringBuffer sb = new StringBuffer();
		        BufferedReader buffer;
		        String PhoneNumberAddress=null;
		        URL url = new URL(urlString);
		        
		        try{
		            InputStream in = url.openStream();
                    // 解决乱码问题
		            buffer = new BufferedReader(new InputStreamReader(in,"gb2312"));
		            String line = null;
		            while((line = buffer.readLine()) != null){
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
		            jsonObject = array.getJSONObject(0);        
		            PhoneNumberAddress=jsonObject.getString("province")+"--"+jsonObject.getString("catName");
		            
		            mav.addObject("PhoneNumberAddress",PhoneNumberAddress);
		        
		        }catch(Exception e){
		            e.printStackTrace();
		        }
		        return mav;
		    }
		   
		    
		   
		   
}