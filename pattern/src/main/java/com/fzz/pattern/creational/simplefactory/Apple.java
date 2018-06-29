package com.fzz.pattern.creational.simplefactory;

import com.fzz.pattern.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Apple extends Product {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    Apple(String name, double price) {
        logger.info("apple {} is init , price is {}",name,price);
        this.setName(name);
        this.setPrice(price);
    }
}
