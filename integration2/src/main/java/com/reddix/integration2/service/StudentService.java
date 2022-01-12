package com.reddix.integration2.service;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class StudentService {
	@ServiceActivator(inputChannel = "student.channel")
	public void receiveMessage(Message<?> message) {
		
		System.out.println("####student.channel###");
		System.out.println(message);
		System.out.println(message.getPayload());
		

	}

}
