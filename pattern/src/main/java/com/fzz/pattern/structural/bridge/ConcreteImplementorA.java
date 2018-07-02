package com.fzz.pattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteImplementorA implements Implementor {

    Logger logger = LoggerFactory.getLogger(ConcreteImplementorA.class);
    @Override
    public void operator() {
        logger.info("implA start");
    }
}
