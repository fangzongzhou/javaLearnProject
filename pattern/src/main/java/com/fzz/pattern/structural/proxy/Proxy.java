package com.fzz.pattern.structural.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Proxy implements Subject {

    Logger logger = LoggerFactory.getLogger(Proxy.class);


    Subject subject;


    Proxy(Subject subject) {
        this.subject = subject;
    }
    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before() {
        logger.info("proxy before");
    }

    public void after() {
        logger.info("proxy after");

    }
}
