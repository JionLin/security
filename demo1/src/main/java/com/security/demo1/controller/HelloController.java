package com.security.demo1.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    public String hello() {
        return "hello";
    }

    @GetMapping("index")
    public String index() {
        return " index";
    }

    @GetMapping("logout")
    public String logout() {
        return " logout";
    }

    @GetMapping("has-role")
    public String hasRole() {
        return " has-role";
    }

    @GetMapping("ano-role")
    @Secured("ROLE_sale")// 判断是否有这个角色
    public String anoRole() {
        return "ano-role";
    }

    /**
     * @Author johnny
     * @Description  方法前的权限校验 权限和角色
     * @Date 15:15 2022/5/3
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("/pre-authorize")
    @ResponseBody
//    @PreAuthorize("hasRole('ROLE_sale')")
    @PreAuthorize("hasAnyAuthority('role')")
    public String preAuthorize() {
        System.out.println("preAuthorize");
        return "preAuthorize";
    }

}
