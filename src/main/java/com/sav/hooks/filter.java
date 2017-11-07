package com.sav.hooks;

import com.blade.ioc.annotation.Bean;
import com.blade.mvc.hook.Signature;
import com.blade.mvc.hook.WebHook;
import com.blade.mvc.http.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Sha on 2017/11/6.
 */
@Bean
public class filter implements WebHook {

    private static final Logger log = LoggerFactory.getLogger(filter.class);
    @Override
    public boolean before(Signature signature) {
        Request request = signature.request();
        String uri = request.uri();
        log.info("{}\t{}", request.method(), uri);
        return true;
    }
}
