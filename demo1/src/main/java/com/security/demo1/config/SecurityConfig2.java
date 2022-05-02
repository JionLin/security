package com.security.demo1.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
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

    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * @return void
     * @Author johnny
     * @Description 进行存储在内存中 把账号和密码
     * @Date 22:58 2022/5/1
     * @Param [auth]
     **/
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
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

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // 退出
        http.logout().logoutUrl("/logout").logoutSuccessUrl("/test/logout").permitAll();

        http.exceptionHandling().accessDeniedPage("/unauth.html");
        http.formLogin()
                // 登录页面设置
                .loginPage("/login.html")
                //登录访问路径
                .loginProcessingUrl("/user/login")
                //默认跳转页面
                .defaultSuccessUrl("/success.html").permitAll()
                .failureUrl("/unauth.html")
                .and().authorizeRequests()
                //设置可以直接访问，不需要认证
                .antMatchers("/", "/test/hello", "/user/login").permitAll()
                .anyRequest().authenticated()
//                // 关闭csrf防护
                .and().csrf().disable();


    }
}
