package com.gsm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudRabbitmqConsumer {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRabbitmqConsumer.class);
    }
}
