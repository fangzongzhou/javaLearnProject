package com.fzz.pattern.creational.single;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Single {

    Logger logger = LoggerFactory.getLogger(Single.class);

    static Single instance =null;

    private Single() {
        logger.info("start init");
    }

    public static Single getInstance() {
        if (Single.instance == null) {
            instance = new Single();
        }

        return instance;
    }
}
