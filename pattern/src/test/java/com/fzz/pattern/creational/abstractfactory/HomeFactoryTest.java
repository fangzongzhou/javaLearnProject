package com.fzz.pattern.creational.abstractfactory;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class HomeFactoryTest {

    public static Logger logger = LoggerFactory.getLogger(HomeFactoryTest.class);

    public HomeFactory homeFactory;

    @Test
    public void createAppliance() {
        homeFactory=new LianJiaHomeFactory();
        logger.info(homeFactory.createAppliance().tostring());
    }

    @Test
    public void createFurniture() {
        homeFactory=new WoAiHomeFactory();
        logger.info(homeFactory.createFurniture().tostring());
    }
}