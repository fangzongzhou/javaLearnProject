package com.fzz.pattern.creational.simplefactory;

import com.fzz.pattern.Product;

public class Book implements Product {
    @Override
    public String getName() {
        return "book";
    }

    @Override
    public String tostring() {
        return this.getName()+this.getPrice();
    }

    @Override
    public double getPrice() {
        return 34;
    }
}
