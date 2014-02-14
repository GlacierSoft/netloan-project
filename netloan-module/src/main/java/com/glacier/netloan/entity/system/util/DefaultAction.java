/**
 * @Title: ActionDefault.java 
 * @Package com.glacier.permission.entity.util 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2013-12-12 下午3:54:03 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2013-12-12
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.entity.system.util;

/**
 * @ClassName: ActionDefault 
 * @Description: TODO(是否默认操作) 
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2013-12-12 下午3:54:03
 */
public enum DefaultAction {

    Default(true),NonDefault(false);
    
    private DefaultAction(){};
    
    private DefaultAction(boolean value){
        this.value = value;
    };
    
    private boolean value;

    public boolean getValue() {
        return value;
    }
}
