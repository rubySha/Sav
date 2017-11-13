package com.sav.source;

import com.blade.ioc.annotation.Bean;

import java.util.Locale;

/**
 * Created by Sha on 2017/11/13.
 */
@Bean
public interface MessageSource {
    String getMessage(String var1, Object[] var2, String var3, Locale var4);

    String getMessage(String var1, Object[] var2, Locale var3) throws NoSuchMessageException;

    String getMessage(MessageSourceResolvable var1, Locale var2) throws NoSuchMessageException;
}
