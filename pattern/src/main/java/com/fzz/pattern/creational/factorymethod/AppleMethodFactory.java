package com.fzz.pattern.creational.factorymethod;

import com.fzz.pattern.Product;
import com.fzz.pattern.creational.simplefactory.Apple;

public class AppleMethodFactory implements MethodFactory {
    @Override
    public Product create() {
        return new Apple("apple1",4);
    }
}
