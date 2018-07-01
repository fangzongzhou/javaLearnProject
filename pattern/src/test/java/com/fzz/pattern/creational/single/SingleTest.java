package com.fzz.pattern.creational.single;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleTest {

    @Test
    public void getInstance() {

        Single.getInstance();
        Single.getInstance();
    }
}