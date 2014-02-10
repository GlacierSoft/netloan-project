/**
 * @Title: ResultType.java 
 * @Package com.glacier.netloan.util 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-2-10 下午2:01:57 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *        	<p>
				第一次修改：
				时间：2014-2-10
				修改人：zhenfei.zhang 
				修改内容简介 ：
			</p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.netloan.util;

/**
 * @ClassName: ResultType
 * @Description: TODO(结果类型)
 * @author zhenfei.zhang
 * @email 289556866@qq.com
 * @date 2014-2-10 下午2:01:57
 */
public enum ResultType {

    成功(true), 失败(false);

    private ResultType() {
    };

    private ResultType(boolean value) {
        this.value = value;
    };

    private boolean value;

    public boolean getValue() {
        return value;
    }
}
