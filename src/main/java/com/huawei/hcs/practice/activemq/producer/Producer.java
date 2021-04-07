package com.huawei.hcs.practice.activemq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Queue;

@Service("producer")
public class Producer {
    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Resource
    private Queue queue;

    public void sendMessage(String message){
        this.jmsMessagingTemplate.convertAndSend(this.queue, message);
    }

    public void sendMessage(Queue queue, String message){
        this.jmsMessagingTemplate.convertAndSend(queue, message);
    }
}
