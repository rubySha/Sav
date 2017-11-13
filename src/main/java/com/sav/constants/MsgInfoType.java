package com.sav.constants;

/**
 * Created by lqa on 2017/5/25.
 */
public enum MsgInfoType {
    GROUP,PEER,USER,DRILL,TOOL,ADMINDRILL,ALARM,BIZ,PHONE,MONITOR,FILE;

    public static String valueOf(MsgInfoType infoType){
        String name ;
        switch (infoType){
            case GROUP:name ="group";
                break;
            case PEER:name= "peer";
                break;
            case USER:name= "user";
                break;
            case DRILL:name= "drill";
                break;
            case TOOL:name= "tool";
                break;
            case ADMINDRILL:name= "adminDrill";
                break;
            case ALARM:name= "alarm";
                break;
            case BIZ:name="biz";
                break;
            case PHONE:name="phone";
                break;
            case MONITOR:name="monitor";
                break;
            case FILE:name="file";
                break;
            default:
                return name = "";
        }
        return name;
    }
}
