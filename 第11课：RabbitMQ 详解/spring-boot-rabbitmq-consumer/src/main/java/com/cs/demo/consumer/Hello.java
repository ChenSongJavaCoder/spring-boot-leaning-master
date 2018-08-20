package com.cs.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: ChenSong
 * @Date: 2018/8/20 17:02
 * @Description:
 */
@Component
@RabbitListener(queues = "hello")
public class Hello {

    /**
     * 可根据此处取到的消息进行功能扩展
     *
     *
     * @param hello
     */
    @RabbitHandler
    public void process(String hello){
        System.out.println("Hello receiver: " + hello);
    }
}
