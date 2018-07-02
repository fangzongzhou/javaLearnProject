package com.fzz.pattern.structural.decorator;

public abstract class Decorator implements Component  {


    Component component;

    Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void opetator() {
        doComponet();
        doOther();
    }



    public void doComponet() {
        component.opetator();

    }

    public abstract void doOther();


}
