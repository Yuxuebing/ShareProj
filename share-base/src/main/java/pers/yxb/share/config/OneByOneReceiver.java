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
@RabbitListener(queues = "OneByOne")
public class OneByOneReceiver {

    @RabbitHandler
    public void receiver(String context){
        System.out.println("OneByOne-Receiver::::"+context);
    }
}
