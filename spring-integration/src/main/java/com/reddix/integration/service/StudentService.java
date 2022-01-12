package com.reddix.integration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


@Component
public class StudentService {
	@ServiceActivator(inputChannel = "student channel")
	public void receiveMessage(Message<?> message) {
		
		System.out.println("#########################");
		System.out.println(message);
		System.out.println("#########################");
		System.out.println(message.getPayload());
	

	}

}
