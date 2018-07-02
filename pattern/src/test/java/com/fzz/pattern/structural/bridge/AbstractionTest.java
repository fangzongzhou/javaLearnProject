package com.fzz.pattern.structural.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractionTest {

    @Test
    public void operation() {
        Implementor implementor = new ConcreteImplementorA();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
}