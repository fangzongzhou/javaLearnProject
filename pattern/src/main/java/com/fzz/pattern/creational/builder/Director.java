package com.fzz.pattern.creational.builder;

public class Director {

    Builder builder;


    public Builder setBuilder(Builder builder) {
        this.builder=builder;
        return this.builder;
    }

    public ResultProduct construct() {
        builder.buildProductA();
        builder.buildProductB();
        return builder.get();
    }
}
