package com.security.demo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author johnny
 * @Classname CSRFController
 * @Description
 * @Date 2022/5/3 17:50
 */
@Controller
public class CSRFController {

    @GetMapping("/toupdate")
    public String test(Model model){
        return "csrf/csrfTest";
    }

    @PostMapping("/update_token")
    public String getToken() {
        System.out.println("update_token");
        return "csrf/csrf_token";
    }
}
