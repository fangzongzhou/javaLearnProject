package com.fzz.pattern.creational.builder;

import com.fzz.pattern.Product;

public interface Builder {

    Builder buildProductA();

    Builder buildProductB();

    ResultProduct get();
}
