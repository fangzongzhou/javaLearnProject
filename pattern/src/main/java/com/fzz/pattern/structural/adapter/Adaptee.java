package com.fzz.pattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Adaptee {

    Logger logger = LoggerFactory.getLogger(Adaptee.class);

    public void SpecificRequest() {
        logger.info("adaptee specific request start");
    }
}
