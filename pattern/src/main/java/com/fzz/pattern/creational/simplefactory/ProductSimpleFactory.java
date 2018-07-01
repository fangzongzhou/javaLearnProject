package com.fzz.pattern.creational.simplefactory;

import com.fzz.pattern.Product;

public class ProductSimpleFactory {

    public static Product createProduct(ProductEnum productEnum) {

        switch (productEnum) {
            case APPLE:
                return new Apple("apple", 45);
            case BANANA:
                return new Banana("banana", 12);
        }
        throw new RuntimeException("input arg is cat be process");

    }
}
