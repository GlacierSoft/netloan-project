<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% 
response.setContentType("text/html;charset=UTF-8");
request.setCharacterEncoding("utf-8"); 
%>
<%    
String path = request.getContextPath();    
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";    
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link href="<%=basePath %>resources/css/foot/footOne.css" type="text/css" rel="stylesheet" />
<script src="<%=basePath %>resources/js/foot/footOne.js"></script>

</head>
<style>
.foot_div{width:100%;height:300px;border-top: 2px solid #11ACE2;background-color: #373A3F;font-family: "微软雅黑";color: #808080}  

.foot_youqing{width: 1200px;border-bottom: 2px solid #808080;float: left;}

.foot_kefu_left_one_ul ,.foot_kefu_left_one_ul li,.foot_kefu_left_two_ul,.foot_kefu_left_two_ul li{list-style: none;}

.foot_kefu_left_one_ul li{float:left; /* 往左浮动 */padding-right: 20px;line-height:50px; }
.foot_kefu_left_two_ul li{float:left; /* 往左浮动 */padding-right: 20px;line-height:50px; }
.foot_kefu_left_one_ul li a,.foot_kefu_left_two_ul li a{color: #808080;font-family: "微软雅黑";text-decoration: none;}
.foot_kefu_left_one_ul li a:HOVER,.foot_kefu_left_two_ul li a:HOVER {color: #11ACE2}
.ul_first,.ul_kefu_first{font-size: 18px;color:#808080; }

.foot_kefu{border-bottom: 2px solid #808080;width: 1200px; height: 95px;float: left;}
.foot_kefu_left{float: left;height: 95px;width: 796px;border: 0px solid red;float: left;}
.foot_kefu_right{float: left;height: 95px;width: 400px;border: 0px solid red;float: left;}
.foot_kefu_left_one{width: 800px;height:40px;border: 0px solid blue;float: left;}
.foot_kefu_left_two{width: 800px;height:50px;border: 0px solid white;float: left;}

.foot_other{width: 1200px;height:110px;border: 0px solid red;float: left;}
.foot_other_one{width: 900px;margin-left: 200px;height: 30px;border: 0px solid white;line-height: 30px;color:#808080;float: left; }
.foot_other_two{width: 600px;margin-left:300px;height: 30px;border: 0px solid white;line-height: 30px;color: #808080;float: left;}
.foot_other_three{width: 750px;margin-left: 200px;height: 40px;border: 0px solid white;vertical-align: middle;float:left;margin-top: 10px;}

.foot_other_three_ul,.foot_other_three_ul li{list-style: none;}
.foot_other_three_ul li{float:left; /* 往左浮动 */padding-right: 20px;line-height:40px; }

.Div_Test_One a:HOVER {color:#428BC9;}
.Div_Test_One a{color:  #808080;text-decoration: none;}

.foot_youqing_one{font-size: 18px;color:#808080 ;border: 0px solid green;width: 100px;height: 35px;float: left;margin-top: 15px;line-height: 35px;margin-bottom: 5px;}
.Div_Test_One{margin-top: 25px;width: 1100px;border: 0px solid red;float: left;margin-bottom: 20px;}

.foot_div_middle{}

</style> 
<body>
   <!--底部样式  -->
   <div class="foot_div" >
   
       <div class="container marketing">
         <!--友情链接(可循环内容)  -->
           <div class="foot_youqing">   
               <div class="foot_youqing_one">
                                                                      友情链接 : 
               </div>
               <div class="Div_Test_One" >
               </div>
            </div>   
           <!-- 客服服务 --> 
          <div class="foot_kefu">
                <div class="foot_kefu_left">
                     <div class="foot_kefu_left_one">
                        <ul class="foot_kefu_left_one_ul">
                            <li><a href="#">公司介绍</a></li>
                            <li><a href="#">合作伙伴</a></li>
                            <li><a href="#">安全保障</a></li>
                            <li><a href="#">晋商文化</a></li>
                            <li><a href="#">媒体报道</a></li>
                            <li><a href="#">联系报道</a></li>
                        </ul>
                     </div>
                     <div class="foot_kefu_left_two">
                          <ul class="foot_kefu_left_two_ul">
                            <li class="ul_kefu_first">客服服务 : </li>
                            <li><a href="http://weibo.com/jinshangdai" ><img src="<%=basePath %>resources/images/foot/weibohui.png" id="img_one"></a></li>
                            <li class="li_test"><img src="<%=basePath %>resources/images/foot/weixinghui.png" id="img_two"></li>
                            <li><a href="http://e.t.qq.com/jinshangdai2009" ><img src="<%=basePath %>resources/images/foot/fenxianghui.png" id="img_three"></a></li>
                            <li><a href="tencent://message/?Menu=yes&uin=123456789&Site=QQ&Service=200&sigT=2a0e37386280486ada2b5d5e69ee49186ccae1257fd9e1c9598af1f0b9c916067002a57aaaec8c8d" target="_blank" ><img src="<%=basePath %>resources/images/foot/qiehui.png" id="img_four"></a></li>
                        </ul>
                     </div>
                </div>
                <div class="foot_kefu_right"> 
                      <div style="float: right;margin-top: 10px;">
                           <img src="<%=basePath %>resources/images/foot/erweima.png">
                      </div>
                      <div style="float: right;margin-top: 10px;">
                        <div style="flaot：right;text-align: right;padding-right: 5px;color:#808080;">客服电话</div>
                        <div style="flaot：right;font-size: 20px;text-align: right;padding-right: 5px;color:#808080;">400-080-3000</div>
                        <div style="flaot：right;text-align: right;padding-right: 5px;color:#808080;">24小时全天服务</div>
                      </div>
                </div>
          </div>
             
         <!--公司其它  -->
         <div class="foot_other">
             <div class="foot_other_one">地址：珠海市唐家镇哈工大路一号工大集团新经济资源开发港博士楼A301E 客服电话：400-080-3000 备案号：粤ICP备13002521号-1 </div>
             <div class="foot_other_two">珠海冰川-创建于贰零壹肆年 @2014 珠海冰川股份有限公司 版权所有 </div>
             <div class="foot_other_three">
                <ul class="foot_other_three_ul">
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_one.png" id="img_ones"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_two.png" id="img_twos"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_three.png" id="img_threes"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_four.png" id="img_fours"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_five.png" id="img_fives"></a></li>
                     <li><a href=""><img src="<%=basePath %>resources/images/foot/foot_six.png" id="img_sixs"></a></li>
                </ul>
             </div>
         </div>
         
          <!--二维码 -->
       <div class="foot_erweima" style="position:absolute;margin-top: 40px;margin-left: 155px; ">
            <img  id="this_erweima" src="<%=basePath %>resources/images/foot/erweima.png" title="扫一扫有惊喜!!" style="display: none">
       </div>
      </div>
   </div>
       
    <!-- 客服服务begin -->
	<div class="fixedBox">
	  <UL class="fixedBoxList">
	    <LI class="fixeBoxLi Service"> <span class="fixeBoxSpan"></span> <strong>在线客服</strong>
	      <div class="ServiceBox">
	        <div class="bjfff"></div>
	           <!--可循环内容-->
		       <!--  <dl >
		          <dt><img src="<%=basePath %>resources/images/foot/Service1.jpg"></dt>
		          <dd> <strong>在线QQ客服</strong>
		            <P class="p1">9:00-22:00</P>
		            <P class="p2"><a title="点击这里给我发消息"href="http://wpa.qq.com/msgrd?v=3&amp;uin=123456789&amp;site=qq&amp;menu=yes"target="_blank">点击交谈</A></P>
		          </dd>
		        </dl>-->
		        <!--循环内容结束  -->
	      </div>
	    </LI>
	    <LI class="fixeBoxLi Home"> <A href="<%=basePath %>index.htm"> <span class="fixeBoxSpan"></span> <strong>返回首页</strong> </A> </LI>
	    <LI class="fixeBoxLi BackToTop"> <span class="fixeBoxSpan"></span> <strong>返回顶部</strong> </LI>
	  </UL>
	</div>
	<!--客服服务End  -->
    
<script type="text/javascript">
     
       $("#img_one").mouseover(function(){$("#img_one").attr("src","<%=basePath %>resources/images/foot/weibo.png");}).mouseout(function(){$("#img_one").attr("src","<%=basePath %>resources/images/foot/weibohui.png");});
       $("#img_three").mouseover(function(){$("#img_three").attr("src","<%=basePath %>resources/images/foot/fenxiang.png");}).mouseout(function(){$("#img_three").attr("src","<%=basePath %>resources/images/foot/fenxianghui.png");});
       $("#img_four").mouseover(function(){$("#img_four").attr("src","<%=basePath %>resources/images/foot/qie.png");}).mouseout(function(){$("#img_four").attr("src","<%=basePath %>resources/images/foot/qiehui.png");});
       
       $("#img_ones").mouseover(function(){$("#img_ones").attr("src","<%=basePath %>resources/images/foot/foot_one_s.png");}).mouseout(function(){$("#img_ones").attr("src","<%=basePath %>resources/images/foot/foot_one.png");});
       $("#img_twos").mouseover(function(){$("#img_twos").attr("src","<%=basePath %>resources/images/foot/foot_two_s.png");}).mouseout(function(){$("#img_twos").attr("src","<%=basePath %>resources/images/foot/foot_two.png");});
       $("#img_threes").mouseover(function(){$("#img_threes").attr("src","<%=basePath %>resources/images/foot/foot_three_s.png");}).mouseout(function(){$("#img_threes").attr("src","<%=basePath %>resources/images/foot/foot_three.png");});
       $("#img_fours").mouseover(function(){$("#img_fours").attr("src","<%=basePath %>resources/images/foot/foot_four_s.png");}).mouseout(function(){$("#img_fours").attr("src","<%=basePath %>resources/images/foot/foot_four.png");});
       $("#img_fives").mouseover(function(){$("#img_fives").attr("src","<%=basePath %>resources/images/foot/foot_five_s.png");}).mouseout(function(){$("#img_fives").attr("src","<%=basePath %>resources/images/foot/foot_five.png");});
       $("#img_sixs").mouseover(function(){$("#img_sixs").attr("src","<%=basePath %>resources/images/foot/foot_six_s.png");}).mouseout(function(){$("#img_sixs").attr("src","<%=basePath %>resources/images/foot/foot_six.png");});

        //微信二维码
        $(".li_test").bind({mouseenter:function(e){
	     	 $("#this_erweima").attr("style","display:block");
      	     $("#img_two").attr("src","<%=basePath %>resources/images/foot/weixing.png");
         },mouseleave:function(e){
           $("#this_erweima").attr("style","display:none");
           $("#img_two").attr("src","<%=basePath %>resources/images/foot/weixinghui.png");
     	}});
        
        $(function(){
    	   //友情链接数据动态读取
    	    $.ajax({
    	    	type:"post",
    	    	url:"<%=basePath%>link/list.json",
    	    	dataType:"json",
    	    	success:function(data){
    	    		//循环开始 
    	    		$.each(data.rows,function(index,comment){
    	    			    //alert("链接名称:"+comment.webLinkName+" 链接地址:"+comment.webLinkUrl); 
    	    		        $("<span style='padding-top: 20px;padding-right: 15px;color: #808080;'><a href='http://"+comment.webLinkUrl+"' target='_blank'>"+comment.webLinkName+"</a></span>").appendTo(".Div_Test_One");
    	    		  });
    	    	}
    	    }); 
    	   
    	   //客服数据的动态读取
    	   $.ajax({
    		   type:"post",
    		   url:"<%=basePath%>service/list.json",
    		   dataType:"json",
    		   success:function(data){
    		        //循环开始
    		        $.each(data.rows,function(i,v){
    		             //alert("客服姓名:"+v.webServiceName+" 客服QQ:"+v.webServiceQq);     	
    		             $("<dl>"+
    		               "<dt><img src='<%=basePath %>resources/images/foot/Service1.jpg'></dt>"+
    		               "<dd> <strong>客服("+v.webServiceName+")</strong>"+
    		               "<P class='p1'>9:00-22:00</P>"+
    		               "<P class='p2'><a title='点击这里给我发消息' href='tencent://message/?Menu=yes&uin="+v.webServiceQq+"&Site=QQ&Service=200&sigT=2a0e37386280486ada2b5d5e69ee49186ccae1257fd9e1c9598af1f0b9c916067002a57aaaec8c8d' target='_blank'>点击交谈</A></P>"+
    		               "</dd>"+
    		               "</dl>").appendTo(".ServiceBox");     
    		       });
    		   }
    		});
    	   
       });
       </script>
       
</body>
</html>
