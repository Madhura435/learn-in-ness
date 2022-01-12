package com.reddix.integration1.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;


@MessagingGateway
public interface IntegrationGateway {
	@Gateway(requestChannel = "router.channel")
	public <T> void process(T object);
}
