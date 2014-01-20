/**
 * @Title: EncryptPropertyPlaceholderConfigurer.java 
 * @Package com.glacier.basic.config 
 * @author zhenfei.zhang   
 * @email 289556866@qq.com
 * @date 2014-1-16 上午10:50:38 
 * @company (开发公司)    珠海市冰川软件有限公司
 * @copyright (版权)    本文件归属珠海市冰川软件有限公司所有
 * @version V1.0
 * @modify (修改) 
 *          <p>
                第一次修改：
                时间：2014-1-16
                修改人：zhenfei.zhang 
                修改内容简介 ：
            </p>              
 * @Review (审核人) ：zhenfei.zhang
 * 
 */
package com.glacier.basic.config;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

import com.glacier.basic.util.DESUtils;

/**
 * @ClassName: EncryptPropertyPlaceholderConfigurer
 * @Description: TODO(Bean启动读取资源文件解密配置类)
 * @author zhenfei.zhang
 * @email zhangzhenfei_email@163.com
 * @date 2012-12-3 下午3:29:26
 */
public class EncryptPropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    // 要进行解密的属性请放在数组里
    private String[] encryptPropNames = { "connection.username", "connection.password", "mail.password" };

    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if (isEncryptProp(propertyName)) {
            String decryptValue = DESUtils.getDecryptString(propertyValue);
            return decryptValue;
        } else {
            return propertyValue;
        }
    }

    /**
     * 判断是否是加密的属性
     * 
     * @param propertyName
     * @return
     */
    private boolean isEncryptProp(String propertyName) {
        for (String encryptPropName : encryptPropNames) {
            if (encryptPropName.equals(propertyName)) {
                return true;
            }
        }
        return false;
    }
}