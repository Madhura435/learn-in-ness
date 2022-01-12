package com.reddix.integration.service;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;



@Component
public class AddressService {
	
	@ServiceActivator(inputChannel="address channel")
	public  void receiveMessage(Message<?> message)
	{
		//MessageChannel replyChannel=(MessageChannel)message.getHeaders().getReplyChannel();
		//MessageBuilder.fromMessage(message);
		System.out.println("#########################");
		System.out.println(message);
		System.out.println("#########################");
		System.out.println(message.getPayload());
		//Address address=(Address)message.getPayload();
		//Message<?> newMessage=MessageBuilder.withPayload(address.toString()).build();
		//replyChannel.send(newMessage);
		
	}
}
