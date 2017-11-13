package com.sav.source;

/**
 * Created by Sha on 2017/11/13.
 */
public abstract class Assert {
    public static void hasText(String text, String message) {
        if(!StringUtils.hasText(text)) {
            throw new IllegalArgumentException(message);
        }
    }
}
