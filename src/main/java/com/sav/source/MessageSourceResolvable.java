package com.sav.source;

/**
 * Created by Sha on 2017/11/13.
 */
public interface MessageSourceResolvable {
    String[] getCodes();

    Object[] getArguments();

    String getDefaultMessage();
}
