package com.gsm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//  @EnableTransactionManagement 表示开启注解事务管理
@EnableTransactionManagement
//包扫描，配置该注解，Dao层里可以不加注解
@MapperScan("com.gsm.dao")
//  @EnableEurekaClient 表示该模块是 Eureka 客户端
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudTxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudTxApplication.class);
    }
}
