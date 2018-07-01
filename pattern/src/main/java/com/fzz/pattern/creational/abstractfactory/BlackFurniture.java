package com.fzz.pattern.creational.abstractfactory;

public class BlackFurniture implements Furniture {
    @Override
    public String getName() {
        return "black furniture";
    }

    @Override
    public String tostring() {
        return this.getName()+this.getPrice();
    }

    @Override
    public double getPrice() {
        return 6;
    }
}
