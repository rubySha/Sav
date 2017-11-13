package com.sav.common;

import com.sav.source.LocaleContextHolder;
import com.sav.source.MessageSource;

/**
 * Created by Sha on 2017/11/13.
 */
public class BaseMessage {
    private Boolean result;
    private Integer code;//追溯使用
    private String msg;//国际化消息key值，key需加入国际化messages_zh_CN.properties文件
    private String extraInfo; //附加信息，备用
    private Object metaData;//存放数据

    private MessageSource messageSource;


    public BaseMessage() {
        this.msg = "";
        this.extraInfo = "";
    }

    public BaseMessage success(){
        this.result = true;
        return this;
    }

    public BaseMessage error(){
        this.result = false;
        return this;
    }

    public BaseMessage msg(String msg,String ... args){
        this.msg += messageSource.getMessage(msg,args, LocaleContextHolder.getLocale());
        return this;
    }

    public BaseMessage data(Object data){
        this.metaData = data;
        return this;
    }

    public BaseMessage code(Integer code){
        this.code = code;
        return this;
    }

    public BaseMessage extraInfo(String extraInfo){
        this.extraInfo += extraInfo;
        return this;
    }

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
    }

    public Object getMetaData() {
        return metaData;
    }

    public void setMetaData(Object metaData) {
        this.metaData = metaData;
    }
}
