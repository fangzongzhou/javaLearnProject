package com.fzz.pattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealSubject implements Subject {

    Logger logger = LoggerFactory.getLogger(RealSubject.class);
    @Override
    public void request() {
        logger.info("realsubject run ");
    }
}
