package com.sav.component.i18n;

import com.blade.ioc.annotation.Bean;
import com.sav.common.BaseMessage;
import com.sav.constants.MsgInfoType;
import com.sav.constants.MsgOpType;
import com.sav.source.MessageSource;
import com.sav.source.StringUtils;

/**
 * Created by Sha on 2017/11/13.
 */
@Bean
public class BaseMessageUtil {

    private MessageSource messageSource;

    private boolean result;
    private MsgOpType msgOpType;

    private static final String SUCCESS = ".success";
    private static final String ERROR = ".error";
    private static final String NAME = ".name";


    public BaseMessage init(){
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.setMessageSource(messageSource);
        return baseMessage;
    }

    public BaseMessage success(MsgInfoType infoType, String name, MsgOpType opType){
        return build(infoType,name,opType,SUCCESS).success().code(200);
    }

    public BaseMessage success(Object data,String code,String... args){
        return init().success().msg(code,args).data(data);
    }

    public BaseMessage error(MsgInfoType infoType, String name, MsgOpType opType){
        return build(infoType,name,opType,ERROR).error();
    }

    private BaseMessage build(MsgInfoType infoType, String name, MsgOpType opType, String result){
        BaseMessage baseMessage = new BaseMessage();
        baseMessage.setMessageSource(messageSource);
        String realName = name;
        if(StringUtils.isNotEmpty(name)){
            realName = "[" + name + "]";
        }
        return baseMessage
                .msg(MsgInfoType.valueOf(infoType) + NAME,realName)
                .msg(MsgOpType.valueOf(opType) + result);
    }

    public BaseMessage error(String code,String... args){
        return init().error().msg(code,args);
    }
}
