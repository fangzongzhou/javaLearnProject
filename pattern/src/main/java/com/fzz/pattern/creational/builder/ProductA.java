package com.fzz.pattern.creational.builder;

import com.fzz.pattern.Product;

public class ProductA implements Product {
    @Override
    public String getName() {
        return "product A";
    }

    @Override
    public String tostring() {
        return this.getName()+this.getPrice();
    }

    @Override
    public double getPrice() {
        return 3;
    }
}
