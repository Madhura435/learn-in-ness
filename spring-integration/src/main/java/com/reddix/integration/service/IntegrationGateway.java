package com.reddix.integration.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.reddix.integration.model.Student;

@MessagingGateway
public interface IntegrationGateway {
	@Gateway(requestChannel = "router.channel")
	public <T> void process(T object);
}
