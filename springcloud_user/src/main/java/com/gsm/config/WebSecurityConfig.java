package com.gsm.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//  @Configuration 表示这是个配置类
@Configuration
//  @EnableWebSecurity 加载 WebSecurity 配置类，配置安全认证策略，加载AuthenticationConfiguration认证信息
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * authorizeRequests 表示   下面要开始说明的权限
         * 需要的权限有两部分：
         *      一：拦截的路径
         *      二：访问该路径需要的权限
         * antMatchers      表示拦截什么路径，这里是全拦截
         * permitAll        表示任何权限都可以访问
         * anyRequest       表示任何请求
         * authenticated    表示认证后才可以访问
         * and().csrf().disable()   固定写法，表示 csrf 拦截失效
         * 【CSRF攻击】跨站请求伪造
         */
        http.authorizeRequests()
                .antMatchers("/**").permitAll()
                .anyRequest().authenticated()
                .and().csrf().disable();
    }
}
