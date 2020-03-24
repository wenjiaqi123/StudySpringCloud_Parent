package com.gsm.baseconsumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
// 监听队列
@RabbitListener(queues = "myQueue")
public class StringNameConsumerBBB {

    @RabbitHandler
    public void doSomeThing(String msg){
        System.out.println("我是消费者BBB");
        System.out.println(msg);
    }
}
