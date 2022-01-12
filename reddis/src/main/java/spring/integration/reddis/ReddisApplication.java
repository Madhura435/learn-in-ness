package spring.integration.reddis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReddisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReddisApplication.class, args);
	}

}
/*
 before going to jsontoobject it will go to enricher
 integrationConfog->serviceactuator
 */
