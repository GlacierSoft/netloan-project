/**
 * @Title: CommonController.java 
 * @Package com.glacier.netloan.web.controller.common 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-13 下午3:29:07 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-13
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.web.controller.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: CommonController 
 * @Description: TODO(公用控制器) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-13 下午3:29:07
 */
@Controller
public class CommonController {
    
    /**
     * 
     * @Title: index 
     * @Description: TODO(默认访问控制器跳转至index.jsp) 
     * @param  @return
     * @throws 
     * 备注<p>已检查测试:Green<p>
     */
    @RequestMapping(value = "/")
    private Object index(){
        ModelAndView mav = new ModelAndView("index");
        //进入首页初始化导航信息
        return mav;
    }

}
