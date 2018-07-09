package com.way.architect.common.util;

import java.util.Date;

/**
 * @author majunjie
 * @date 2018/7/9 11:47
 */
public class Print {

    public static void info(Object object) {
        System.out.println(DateUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss.sss") + " [" + Thread.currentThread().getName() + "] " + object);
    }

}
