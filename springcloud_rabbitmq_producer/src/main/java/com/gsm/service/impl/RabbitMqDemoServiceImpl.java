package com.gsm.service.impl;

import com.gsm.entity.User;
import com.gsm.service.RabbitMqDemoService;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqDemoServiceImpl implements RabbitMqDemoService {
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private FanoutExchange fanoutExchange;

    @Override
    public void insertRabbitmqDemo(String name) {
        /**
         * 将消息放到消息队列中
         */
        System.out.println("-----基础模式发送准备-----");
        rabbitTemplate.convertAndSend("myQueue",name);
        System.out.println("-----基础模式发送结束-----");
    }

    @Override
    public void insertRabbitmqDemoFanout(User user) {
        System.out.println("-----fanout 发送准备-----");
        String exchange = fanoutExchange.getName();
        fanoutExchange.getName();
        rabbitTemplate.convertAndSend(exchange,"",user);
        System.out.println("-----fanout 发送结束-----");
    }
}
