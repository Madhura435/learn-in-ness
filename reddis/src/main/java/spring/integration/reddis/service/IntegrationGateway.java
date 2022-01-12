package spring.integration.reddis.service;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import spring.integration.reddis.model.Student;

@MessagingGateway
public interface IntegrationGateway {
	@Gateway(requestChannel = "integration.gateway.channel")
	public String sendMessage(String name);

	@Gateway(requestChannel = "integration.student.gateway.channel")
	public String processStudentDetails(Student student);

}
