package com.fzz.pattern.structural.adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectAdapterTest {

    @Test
    public void request() {
        Target target = new ObjectAdapter(new Adaptee());
        target.request();
    }
}