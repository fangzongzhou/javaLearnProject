package com.fzz.pattern.creational.abstractfactory;

public class XiaoMiAppliance implements Appliance {
    @Override
    public String getName() {
        return "hai er applicance";
    }

    @Override
    public String tostring() {
        return this.getName()+this.getPrice();
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
