package com.huawei.hcs.practice.activemq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class HcsPracticeActivemqApplication {

	public static void main(String[] args) {
		SpringApplication.run(HcsPracticeActivemqApplication.class, args);
	}



}
