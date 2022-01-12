package com.reddis.Integration4.all;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;


@MessagingGateway
public interface IntegrationGateway {
	@Gateway(requestChannel = "inputChannel")
	public <T> void sendMessage(T object);
}
