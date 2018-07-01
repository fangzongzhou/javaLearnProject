package com.fzz.pattern.creational.factorymethod;

import com.fzz.pattern.Product;
import com.fzz.pattern.creational.simplefactory.Book;

public class BookMethodFactory implements MethodFactory {
    @Override
    public Product create() {
        return new Book();
    }
}
