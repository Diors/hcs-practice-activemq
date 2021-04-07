package com.huawei.hcs.practice.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;

@Configuration
public class ActiveMQConf {

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("demon.queue");
    }
}
