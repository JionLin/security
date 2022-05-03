package com.security.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author johnny
 * @Classname LoginController
 * @Description
 * @Date 2022/5/3 17:49
 */
@Controller
public class LoginController {
    @GetMapping("/userLogin")
    public String login(){
        return "login/login";
    }
}
