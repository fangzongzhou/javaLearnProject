package com.fzz.dubboconsumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fzz.dubbo.inter.HelloServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @Reference(version = "${demo.service.version}",
            application = "${dubbo.application.id}",
//            url = "dubbo://localhost:12347",
            registry = "${dubbo.registry.id}"
    )
    private HelloServer helloServer;


    @RequestMapping("hello")
    public void hello() {
        helloServer.hello("fzz");
    }
}
