package com.gsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//  @EnableZuulProxy
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudZuulWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZuulWebApplication.class);
    }
}
