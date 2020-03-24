package com.gsm.controller;

import com.gsm.entity.User;
import com.gsm.service.RabbitMqDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rabbitmq")
public class RabbitMqDemoController {
    @Autowired
    private RabbitMqDemoService rabbitMqDemoService;

    @PostMapping("/base")
    public String insertRabbitmqDemo(String name){
        rabbitMqDemoService.insertRabbitmqDemo(name);
        return "rabbitmq测试";
    }

    @PostMapping("/fanout")
    public String insertRabbitmqDemoFanout(User user){
        rabbitMqDemoService.insertRabbitmqDemoFanout(user);
        return "rabbitmq测试发布订阅模式";
    }
}
