package com.fzz.pattern.creational.abstractfactory;

public class LianJiaHomeFactory implements HomeFactory{
    @Override
    public Appliance createAppliance() {
        return new XiaoMiAppliance();
    }

    @Override
    public Furniture createFurniture() {
        return new BlackFurniture();
    }
}
