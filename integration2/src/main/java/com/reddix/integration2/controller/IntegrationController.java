package com.reddix.integration2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reddix.integration2.model.Address;
import com.reddix.integration2.model.Student;
import com.reddix.integration2.service.IntegrationGateway;

@RestController
@RequestMapping("/integrate")
public class IntegrationController {
	@Autowired
	private IntegrationGateway integrationGateway;
	
	@PostMapping("/student")
	public void processStudentDetails(@RequestBody Student student)
	{
		integrationGateway.process(student);
	}
	
	@PostMapping("/address")
	public void processAddressDetails(@RequestBody Address address)
	{
		integrationGateway.process(address);
	}
	
}
