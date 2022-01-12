package com.springIntegration.file;

import java.io.File;
import java.io.FileWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.Pollers;
import org.springframework.integration.file.FileReadingMessageSource;
import org.springframework.integration.file.FileWritingMessageHandler;

@Configuration
public class IntegrationConfig {
	@Autowired
	private Transformer transformer;
@Bean
public IntegrationFlow integrationFlow()
{
	return IntegrationFlows.from(fileReader(),
			spec->spec.poller(Pollers.fixedDelay(500)))
			.transform(transformer,"transform")
			.handle(FileWriter()).get();
}
@Bean
public FileWritingMessageHandler FileWriter() {
	FileWritingMessageHandler handler=new FileWritingMessageHandler
			(new File("destination"));
	handler.setExpectReply(false);
	return handler;
}
@Bean
public FileReadingMessageSource fileReader() {
	FileReadingMessageSource source=new FileReadingMessageSource();
	source.setDirectory(new File("source"));
	return source;
}
}
