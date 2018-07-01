package com.fzz.pattern.creational.builder;

public class ResultProductBuilder implements Builder {

    ResultProduct resultProduct = new ResultProduct();
    @Override
    public Builder buildProductA() {
        resultProduct.setProductA(new ProductA());
        return this;
    }

    @Override
    public Builder buildProductB() {
        resultProduct.setProductB(new ProductB());
        return this;
    }

    @Override
    public ResultProduct get() {
        return resultProduct;
    }


}
