/*
 * @(#)RandomGUID.java
 *
 * @author zhenfei.zhang 
 *
 * Copyright (c) 2012 Glacier SoftWare Company Limited. All Rights Reserved.
 */
package com.glacier.basic.util;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * 
 * @ClassName: RandomGUID
 * 
 * @Description: TODO(随机GUID生成)
 * 
 * @author zhenfei.zhang
 * 
 * @email zhangzhenfei_email@163.com
 * 
 * @date 2012-7-10 上午11:25:37
 * 
 * 
 */
public class RandomGUID extends Object {
    protected final static org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory.getLog(RandomGUID.class);

    private static SecureRandom mySecureRand;

    private static String s_id;

    private static final int PAD_BELOW = 0x10;

    private static final int TWO_BYTES = 0xFF;

    /*
     * Static block to take care of one time secureRandom seed. It takes a few
     * seconds to initialize SecureRandom. You might want to consider removing
     * this static block or replacing it with a "time since first loaded" seed
     * to reduce this time. This block will run only once per JVM instance.
     */

    static {
        mySecureRand = new SecureRandom();
        try {
            s_id = InetAddress.getLocalHost().toString();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

    }

    /*
     * Method to generate the random GUID
     */
    public static String getRandomGUID() {
        MessageDigest md5 = null;
        StringBuffer sbValueBeforeMD5 = new StringBuffer(128);
        StringBuffer sb = new StringBuffer(32);
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            logger.error("Error: " + e);
        }

        try {
            long time = System.currentTimeMillis();
            long rand = 0;

            rand = mySecureRand.nextLong();

            sbValueBeforeMD5.append(s_id);
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(time));
            sbValueBeforeMD5.append(":");
            sbValueBeforeMD5.append(Long.toString(rand));

            md5.update(sbValueBeforeMD5.toString().getBytes());

            byte[] array = md5.digest();

            for (int j = 0; j < array.length; ++j) {
                int b = array[j] & TWO_BYTES;
                if (b < PAD_BELOW)
                    sb.append('0');
                sb.append(Integer.toHexString(b));
            }

        } catch (Exception e) {
            logger.error("Error:" + e);
        }
        return sb.toString();
    }

    // Demonstraton and self test of class
    public static void main(String args[]) {
        for (int i = 0; i < 100; i++) {
            System.out.println(RandomGUID.getRandomGUID());
        }
    }

}
