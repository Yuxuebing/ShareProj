package pers.yxb.share.config;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-03-13
 */
@Component
public class OneByOneSender {
    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "OneByOneSender" + new Date();
        System.out.println("OneSender : " + context);
        this.rabbitTemplate.convertAndSend("OneByOne", context);
    }
}
