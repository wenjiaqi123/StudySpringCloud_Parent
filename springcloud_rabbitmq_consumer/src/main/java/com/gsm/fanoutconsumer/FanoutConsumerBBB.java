package com.gsm.fanoutconsumer;

import com.gsm.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "fanoutQueueOne")
public class FanoutConsumerBBB {

    @RabbitHandler
    public void fanoutQueueZero(User user){
        System.out.println("我是消费者\t发布订阅模式\tOne");
        System.out.println(user.toString());
    }
}
