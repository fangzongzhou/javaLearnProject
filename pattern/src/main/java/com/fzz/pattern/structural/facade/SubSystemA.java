package com.fzz.pattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubSystemA {

    Logger logger = LoggerFactory.getLogger(SubSystemA.class);
    public void operatorA() {
        logger.info("SubSystemA run");
    }
}
