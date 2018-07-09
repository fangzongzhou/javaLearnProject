package com.fzz.dubboprovider.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.fzz.dubbo.inter.HelloServer;


@Service(
        version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class HelloServerImpl implements HelloServer {

    @Override
    public void hello(String name) {
        System.out.println("hello "+ name);

    }
}
