package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello,欢迎使用SpringBoot，你已经完成SpringBoot第一个测试案例了!";
    }
}
