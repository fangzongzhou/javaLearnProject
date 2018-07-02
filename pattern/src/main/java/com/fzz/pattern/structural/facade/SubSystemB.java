package com.fzz.pattern.structural.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SubSystemB {
    Logger logger = LoggerFactory.getLogger(SubSystemB.class);

    public void operatorB() {
        logger.info("SubSystemB run");

    }
}
