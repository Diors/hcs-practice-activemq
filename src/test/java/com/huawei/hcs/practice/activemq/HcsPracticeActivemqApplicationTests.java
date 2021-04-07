package com.huawei.hcs.practice.activemq;

import com.huawei.hcs.practice.activemq.producer.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.Destination;
import javax.jms.Queue;

@RunWith(SpringRunner.class)
@SpringBootTest
class HcsPracticeActivemqApplicationTests {

	@Autowired
	private Producer producer;
	@Test
	void contextLoads() {
		Queue queue =new ActiveMQQueue("mytest.queue");
		for(int i=0; i<5; i++){
			producer.sendMessage(queue, "生产者发送了消息"+i);
		}
	}

}
