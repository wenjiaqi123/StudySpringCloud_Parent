package com.gsm;

import com.gsm.utils.IdUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

//  @EnableDiscoveryClient  发现服务
//  @EnableFeignClients  采用 Feign方式发现服务
@EnableDiscoveryClient
@EnableFeignClients
//  @EnableEurekaClient 表示该模块是 Eureka 客户端
@EnableEurekaClient
//  @MapperScan包扫描，配置该注解，Dao层里可以不加注解
@MapperScan("com.gsm.dao")
//  @SpringBootApplication  SpringBoot启动注解
@SpringBootApplication
public class SpringCloudArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudArticleApplication.class, args);
    }

    /**
     * 使用时将 IdUtils 引入
     * @Autowired
     * private IdUtils idUtils;
     */
    @Bean
    public IdUtils getId(){
        return new IdUtils(1,1);
    }
}

