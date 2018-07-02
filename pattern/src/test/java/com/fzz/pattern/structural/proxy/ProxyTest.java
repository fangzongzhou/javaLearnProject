package com.fzz.pattern.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProxyTest {

    @Test
    public void request() {
        Subject subject = new RealSubject();
        Subject proxySubject = new Proxy(subject);
        proxySubject.request();
    }

    @Test
    public void before() {
    }

    @Test
    public void after() {
    }
}