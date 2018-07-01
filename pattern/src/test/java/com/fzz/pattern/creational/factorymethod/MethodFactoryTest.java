package com.fzz.pattern.creational.factorymethod;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodFactoryTest {


    Logger logger = LoggerFactory.getLogger(MethodFactoryTest.class);
    @Test
    public void create() {
        MethodFactory methodFactory = new BookMethodFactory();
        logger.info(methodFactory.create().toString());
    }
}