package com.gsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//  @EnableConfigServer 开启配置服务
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigApplication.class);
    }
}
