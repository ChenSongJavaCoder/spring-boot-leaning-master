package com.neo.rabbit.fanout;

import com.neo.common.BaseAbstractClass;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@RabbitListener(queues = "fanout.C")
public class FanoutReceiverC extends BaseAbstractClass {

    @RabbitHandler
    public void process(String message) {
        System.out.println("fanout Receiver C: " + message + "接收时间：" + sdf.format(new Date()));
    }

}
