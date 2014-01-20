package com.glacier.basic.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GlacierUitls {

    public static String camelTounderline(String param) {
        if (null == param || param.equals("")) {
            return "";
        }
        Pattern p = Pattern.compile("[A-Z]");

        StringBuilder builder = new StringBuilder(param);
        Matcher mc = p.matcher(param);
        int i = 0;
        while (mc.find()) {
            builder.replace(mc.start() + i, mc.end() + i, "_" + mc.group().toLowerCase());
            i++;
        }
        if ('_' == builder.charAt(0)) {
            builder.deleteCharAt(0);
        }
        return builder.toString();
    }

}
