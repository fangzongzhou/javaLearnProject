package com.fzz.logging;

/**
 * @author fangzongzhou
 */
public class Info implements LogInfo {

    private String originStr;


    private Info() {

    }

    static Info of(String info) {
        Info logInfo = new Info();
        logInfo.originStr = info;
        return logInfo;
    }

    @Override
    public byte[] getByteArr() {
        return (originStr+"\n").getBytes();
    }

}
