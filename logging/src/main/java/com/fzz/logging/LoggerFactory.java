package com.fzz.logging;

import java.io.IOException;

/**
 * @author fangzongzhou
 */
public class LoggerFactory {

    private static LoggerContext loggerContext=new LoggerContext();






    public LoggerFactory() {
    }

    public static Logger getLogger(Class clazz) throws IOException {
        return loggerContext.get(clazz.getName());
    }
 }
