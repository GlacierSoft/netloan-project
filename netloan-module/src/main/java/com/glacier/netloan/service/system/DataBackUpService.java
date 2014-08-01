package com.glacier.netloan.service.system;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("DataBackUpService")
@Transactional(readOnly=true,propagation=Propagation.REQUIRED)
public class DataBackUpService {
    
	
	@PostConstruct
	public void handleDataBackUp(){
		 try {     
	            Runtime rt = Runtime.getRuntime();     
	    
	            // 调用 mysql 的 cmd:     
	            Process child = rt .exec("C://Program Files//MySQL//MySQL Server 5.0//bin//mysqldump -h localhost -uroot -proot  netloan");// 设置导出编码为utf8。这里必须是utf8     
	                
	            // 把进程执行中的控制台输出信息写入.sql文件，即生成了备份文件。注：如果不对控制台信息进行读出，则会导致进程堵塞无法运行     
	            InputStream in = child.getInputStream();// 控制台的输出信息作为输入流     
	                            
	            InputStreamReader xx = new InputStreamReader(in, "utf8");// 设置输出流编码为utf8。这里必须是utf8，否则从流中读入的是乱码     
	                
	            String inStr;     
	            StringBuffer sb = new StringBuffer("");     
	            String outStr;     
	            // 组合控制台输出信息字符串     
	            BufferedReader br = new BufferedReader(xx);     
	            while ((inStr = br.readLine()) != null) {     
	                sb.append(inStr + "\r\n");     
	            }     
	            outStr = sb.toString(); 
	            
	            //创建隐藏文件夹存储备份数据
	            File file_netloan=new File("C:\\Program Files\\NetloanSql");
	            if(!file_netloan.exists()||!file_netloan .isDirectory()){
	            	file_netloan .mkdir();   
	                String string=" attrib +H  "+file_netloan.getAbsolutePath(); 
	   		        Process p = Runtime.getRuntime().exec(string); 
	   		        System.out.println("隐藏文件夹创建成功!!!");
	            }else{
	            	System.out.println("文件夹已创建!!!");
	            }
	            
	            file_netloan=new File("C:\\Program Files\\NetloanSql\\ReadMe.txt");
	            if(!file_netloan.exists()){
	            	file_netloan.createNewFile();
	            	FileWriter fw = new FileWriter(file_netloan);
		            PrintWriter pw = new PrintWriter(fw);
		            String glacier_str="该文件夹内存储系统数据库文件，保持系统数据的完整性,请谨慎操作!!   ---珠海冰川科技有限公司";
		            pw.append(glacier_str);
		            pw.flush();
		            pw.close();
	            }
	            
	            SimpleDateFormat sf=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
	            String str="netloan"+sf.format(new Date())+".sql";
	            
	            // 要用来做导入用的sql目标文件：     
	            FileOutputStream fout = new FileOutputStream("C:\\Program Files\\NetloanSql\\"+str+"");     
	            OutputStreamWriter writer = new OutputStreamWriter(fout, "utf8");     
	            writer.write(outStr);     
	            // 这里如果用缓冲方式写入文件的话，会导致中文乱码，用flush()方法则可以避免     
	            writer.flush();     
	    
	            //关闭输入输出流     
	            in.close();     
	            xx.close();     
	            br.close();   
	            writer.close();     
	            fout.close();     
	     
	        } catch (Exception e) {     
	            e.printStackTrace();     
	        }     
		}
	
}
