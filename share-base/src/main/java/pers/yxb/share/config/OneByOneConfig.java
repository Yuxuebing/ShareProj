package pers.yxb.share.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-03-13
 */
@Configuration
public class OneByOneConfig {
    @Bean
    public Queue oneQueue(){
        return new Queue("OneByOne");
    }
}
