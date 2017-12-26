package com.sav.hooks;

import com.blade.mvc.hook.Signature;
import com.blade.mvc.hook.WebHook;
import com.blade.mvc.http.Request;

/**
 * Created by Sha on 2017/11/6.
 */
public class hook implements WebHook {

    @Override
    public boolean before(Signature signature) {
        return true;
    }
}
