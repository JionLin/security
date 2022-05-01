package com.security.demo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author johnny
 * @Classname SecurityConfig
 * @Description security config
 * @Date 2022/5/1 19:11
 */
@Configuration
public class SecurityConfig {


    /**
     * @Author johnny
     * @Description  password encoder 比对
     * @Date 19:13 2022/5/1
     * @Param []
     * @return org.springframework.security.crypto.password.PasswordEncoder
     **/
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
