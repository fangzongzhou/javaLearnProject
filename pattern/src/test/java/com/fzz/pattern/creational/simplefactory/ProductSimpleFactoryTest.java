package com.fzz.pattern.creational.simplefactory;

import com.fzz.pattern.Product;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

public class ProductSimpleFactoryTest {

    Logger logger = LoggerFactory.getLogger(ProductSimpleFactoryTest.class);

    @Test
    public void createProduct() {
        logger.info(ProductSimpleFactory.createProduct(ProductEnum.APPLE).toString());
    }

}