package com.fzz.pattern.structural.facade;

import org.junit.Test;

import static org.junit.Assert.*;

public class FacadeTest {



    @Test
    public void operator() {
        Facade facade = new Facade();
        facade.operator();
    }
}