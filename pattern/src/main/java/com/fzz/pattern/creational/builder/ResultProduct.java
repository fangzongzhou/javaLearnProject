package com.fzz.pattern.creational.builder;

public class ResultProduct {
    ProductA productA;
    ProductB productB;

    public ProductB getProductB() {
        return productB;
    }

    public void setProductB(ProductB productB) {
        this.productB = productB;
    }

    public ProductA getProductA() {

        return productA;
    }

    public void setProductA(ProductA productA) {
        this.productA = productA;
    }

    @Override
    public String toString() {
        return "ResultProduct{" +
                "productA=" + productA +
                ", productB=" + productB +
                '}';
    }
}
