package com.fzz.pattern.creational.simplefactory;

import com.fzz.pattern.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banana extends Product {


    Logger logger = LoggerFactory.getLogger(this.getClass());

    Banana(String name, double price) {
        logger.info("banana {} is init Price is {}",name,price);
        this.setName(name);
        this.setPrice(price);
    }


}
