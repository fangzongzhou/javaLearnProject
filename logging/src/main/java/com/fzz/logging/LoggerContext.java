package com.fzz.logging;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



/**
 * @author fangzongzhou
 */
public class LoggerContext {

    private Map<String, Logger> loggerMap = new HashMap<>();


    public Logger get(String key) throws IOException {

        if (!loggerMap.containsKey(key)) {
            Logger logger =  new FileLogger();
            loggerMap.put(key, logger);
        }



        return loggerMap.get(key);


    }
}
