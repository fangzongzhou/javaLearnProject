package com.fzz.pattern.creational.abstractfactory;

public class WoAiHomeFactory implements HomeFactory {
    @Override
    public Appliance createAppliance() {
        return new HaiErAppliance();
    }

    @Override
    public Furniture createFurniture() {
        return new RedFurniture();
    }
}
