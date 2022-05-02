package com.security.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author johnny
 * @Classname HelloController
 * @Description
 * @Date 2022/4/30 22:45
 */
@RequestMapping("/test")
@RestController
public class HelloController {


    @GetMapping("hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("index")
    public String index(){
        return " index";
    }

    @GetMapping("logout")
    public String logout(){
        return " logout";
    }
}
