package com.fzz.pattern.structural.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassAdapter extends Adaptee implements Target  {
    Logger logger = LoggerFactory.getLogger(ClassAdapter.class);
    @Override
    public void request() {
        logger.info("class adapter start");
        this.SpecificRequest();
    }
}
