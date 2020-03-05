package com.gsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//包扫描，配置该注解，Dao层里可以不加注解
@MapperScan("com.gsm.dao")
//  @SpringBootApplication  SpringBoot启动注解
@SpringBootApplication
public class SpringCloudArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudArticleApplication.class, args);
    }
}

