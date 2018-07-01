package com.fzz.pattern.creational.builder;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class BuilderTest {

    Logger logger = LoggerFactory.getLogger(BuilderTest.class);


    Builder builder;
    @Test
    public void buildProductA() {
        builder=new ResultProductBuilder();
        logger.info(builder.buildProductA().get().toString());
    }

    @Test
    public void buildProductB() {
        builder = new ResultProductBuilder();
        logger.info(builder.buildProductB().get().toString());
    }

    @Test
    public void get() {

    }
}