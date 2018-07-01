package com.fzz.pattern.creational.builder;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class DirectorTest {

    Logger logger = LoggerFactory.getLogger(DirectorTest.class);

    Director director;

    @Test
    public void setBuilder() {
        director=new Director();
        director.setBuilder(new ResultProductBuilder());
        logger.info(director.construct().toString());
    }

    @Test
    public void construct() {
    }
}