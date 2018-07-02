package com.fzz.pattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObjectAdapter implements Target {

    private static Logger logger = LoggerFactory.getLogger(ObjectAdapter.class);

    Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee=adaptee;
    }
    @Override
    public void request() {
        logger.info("object adapter start");
        adaptee.SpecificRequest();
    }
}
