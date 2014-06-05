/**
 * @Title: CommonService.java 
 * @Package com.glacier.netloan.service.common 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-6-4 上午10:12:44 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-6-4
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.service.commonHome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dao.website.WebsiteAdvertisementMapper;

/**
 * @ClassName: CommonService 
 * @Description: TODO(首页显示内容) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-6-4 上午10:12:44
 */
@Service
@Transactional(readOnly = true , propagation = Propagation.REQUIRED)
public class CommonHomePage {

    @Autowired
    private WebsiteAdvertisementMapper advertisementMapper;

    @Autowired
    private UserMapper userMapper;
    
    public String enterHomePageByAdd(){
        String enterWhere = "layout/centerContent/commonHomePage" ;
        return enterWhere ;
    }
}
