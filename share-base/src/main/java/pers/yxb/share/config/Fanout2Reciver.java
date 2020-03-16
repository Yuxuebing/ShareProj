package pers.yxb.share.config;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-03-13
 */
@Component
@RabbitListener(queues = "fanout.b")
public class Fanout2Reciver {

    @RabbitHandler
    public void receiver(String message){
        System.out.println("FanoutReceiver---fanout.b:"+message);
    }
}
