package com.fzz.pattern.structural.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteImplementorB implements Implementor {

    Logger logger = LoggerFactory.getLogger(ConcreteImplementorB.class);
    @Override
    public void operator() {
        logger.info("impl b start");
    }
}
