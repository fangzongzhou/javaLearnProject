package com.fzz.pattern.structural.adapter;

import org.junit.Test;

public class TargetTest {



    @Test
    public void request() {
        Target target = new ClassAdapter();
        target.request();
    }
}