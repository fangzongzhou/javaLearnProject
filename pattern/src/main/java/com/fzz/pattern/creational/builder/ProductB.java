package com.fzz.pattern.creational.builder;

import com.fzz.pattern.Product;

public class ProductB implements Product {
    @Override
    public String getName() {
        return "product B";
    }

    @Override
    public String tostring() {
        return this.getName()+this.getPrice();
    }

    @Override
    public double getPrice() {
        return 4;
    }
}
