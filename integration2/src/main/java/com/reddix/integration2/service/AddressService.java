package com.reddix.integration2.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;


@Component
public class AddressService {
	
	@ServiceActivator(inputChannel="address.channel")
	public  void receiveMessage(Message<?> message)
	{
		System.out.println("##address.channel##");
		System.out.println(message);
		System.out.println("#########################");
		System.out.println(message.getPayload());
		
		
	}
}
