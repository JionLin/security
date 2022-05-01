package com.security.demo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author johnny
 * @Classname SecurityConfig
 * @Description security config2 从数据库中进行查询
 * @Date 2022/5/1 19:11
 */
@Configuration
public class SecurityConfig2 extends WebSecurityConfigurerAdapter {


    /**
     * @Author johnny
     * @Description 进行存储在内存中 把账号和密码
     * @Date 22:58 2022/5/1
     * @Param [auth]
     * @return void
     **/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        auth.inMemoryAuthentication().withUser("tom").
                password(passwordEncoder.encode("123")).roles("roles");

    }

    /**
     * @return org.springframework.security.crypto.password.PasswordEncoder
     * @Author johnny
     * @Description password encoder 比对
     * @Date 19:13 2022/5/1
     * @Param []
     **/
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
