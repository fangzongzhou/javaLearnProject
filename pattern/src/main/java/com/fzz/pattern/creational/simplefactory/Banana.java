package com.fzz.pattern.creational.simplefactory;

import com.fzz.pattern.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banana implements Product {


    Logger logger = LoggerFactory.getLogger(this.getClass());
    private String name;
    private double price;

    Banana(String name, double price) {
        logger.info("banana {} is init Price is {}", name, price);
        this.setName(name);
        this.setPrice(price);
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String tostring() {
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
