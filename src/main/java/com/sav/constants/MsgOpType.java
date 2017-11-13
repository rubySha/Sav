package com.sav.constants;

/**
 * Created by lqa on 2017/5/25.
 */
public enum MsgOpType {
    ADD,DELETE,SAVE,LIST,DETAIL,SYSTEM,UPLOAD,DOWNLOAD,DOTEST,STOPTEST;

    public static String valueOf(MsgOpType messageType){
        String typeName ;
        switch (messageType){
            case ADD: typeName = "common.add";
                break;
            case DELETE: typeName = "common.delete";
                break;
            case SAVE: typeName = "common.save";
                break;
            case LIST: typeName = "common.query.list";
                break;
            case DETAIL: typeName = "common.query.detail";
                break;
            case UPLOAD: typeName = "common.upload";
                break;
            case DOWNLOAD: typeName ="common.download";
                break;
            case DOTEST: typeName = "common.doTest";
                break;
            case STOPTEST: typeName = "common.stopTest";
                break;
            case SYSTEM:default:
                typeName = "common.system.error";
        }
        return typeName;
    }
}
