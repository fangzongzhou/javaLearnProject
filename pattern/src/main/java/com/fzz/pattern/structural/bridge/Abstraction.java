package com.fzz.pattern.structural.bridge;

public abstract class Abstraction {
    Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();


}
