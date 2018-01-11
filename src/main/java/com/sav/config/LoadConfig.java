package com.sav.config;

import com.blade.Blade;
import com.blade.event.BeanProcessor;
import com.blade.ioc.annotation.Bean;
import com.blade.jdbc.Base;

/**
 * Created by Sha on 2017/10/24.
 */
@Bean
public class LoadConfig implements BeanProcessor {

    @Override
    public void processor(Blade blade) {
        Base.open("jdbc:mysql/47.93.252.10:3306/station", "root", "123456");
    }
}
