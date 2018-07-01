package com.fzz.pattern.creational.abstractfactory;

public class RedFurniture implements Furniture {
    @Override
    public String getName() {
        return "red furniture";
    }

    @Override
    public String tostring() {
        return this.getName()+this.getPrice();
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
