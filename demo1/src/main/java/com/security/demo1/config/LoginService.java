package com.security.demo1.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Service;

/**
 * @author johnny
 * @Classname LoginService
 * @Description
 * @Date 2022/5/1 19:14
 */
@Service
public class LoginService extends WebSecurityConfigurerAdapter {

    /**
     * @Author johnny
     * @Description  进行加载用户名
     * @Date 19:15 2022/5/1
     * @Param [s]
     * @return org.springframework.security.core.userdetails.UserDetails
     **/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

    }
}
