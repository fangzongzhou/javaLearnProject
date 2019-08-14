package com.fzz.cloud.registryserver.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {


    @RequestMapping(value = "test",method = RequestMethod.POST)
    public String test(@RequestBody User user) {
        System.out.println(user);
        System.out.println("test");
        return "test";
    }

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://www.baidu.com", String.class);

    }
}
