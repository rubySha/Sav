package com.sav.source;

import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by Sha on 2017/11/13.
 */
public abstract class LocaleContextHolder {

    private static final ThreadLocal<LocaleContext> localeContextHolder = new NamedThreadLocal("Locale context");
    private static final ThreadLocal<LocaleContext> inheritableLocaleContextHolder = new NamedInheritableThreadLocal("Locale context");


    public static Locale getLocale() {
        LocaleContext localeContext = getLocaleContext();
        if(localeContext != null) {
            Locale locale = localeContext.getLocale();
            if(locale != null) {
                return locale;
            }
        }

        return Locale.getDefault();
    }

    public static LocaleContext getLocaleContext() {
        LocaleContext localeContext = (LocaleContext)localeContextHolder.get();
        if(localeContext == null) {
            localeContext = (LocaleContext)inheritableLocaleContextHolder.get();
        }

        return localeContext;
    }
}
