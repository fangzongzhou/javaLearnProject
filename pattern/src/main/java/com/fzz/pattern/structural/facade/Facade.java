package com.fzz.pattern.structural.facade;

public class Facade {


    private SubSystemA subSystemA ;
    private SubSystemB subSystemB ;

    public Facade() {
        this.subSystemA = new SubSystemA();
        this.subSystemB = new SubSystemB();
    }

    public void operator() {
        subSystemA.operatorA();
        subSystemB.operatorB();
    }
}
