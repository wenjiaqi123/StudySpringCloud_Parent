package com.gsm.fanoutconsumer;

import com.gsm.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanoutQueueZero")
public class FanoutConsumerAAA {


    @RabbitHandler
    public void fanoutQueueZero(User user){
        System.out.println("我是消费者\t发布订阅模式\tZero\tAAA");
        System.out.println(user.toString());
    }

}
