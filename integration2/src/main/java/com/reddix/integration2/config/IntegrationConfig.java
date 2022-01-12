package com.reddix.integration2.config;


import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.annotation.Transformer;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.router.HeaderValueRouter;
import org.springframework.integration.router.PayloadTypeRouter;
import org.springframework.integration.transformer.HeaderEnricher;
import org.springframework.integration.transformer.support.HeaderValueMessageProcessor;
import org.springframework.integration.transformer.support.StaticHeaderValueMessageProcessor;
import org.springframework.messaging.MessageChannel;

import com.reddix.integration2.model.Address;
import com.reddix.integration2.model.Student;



@Configuration
@EnableIntegration
@IntegrationComponentScan
public class IntegrationConfig {
@Bean
public MessageChannel recieverChannel()
{
	return new DirectChannel();
}
@Bean
public MessageChannel replyChannel()
{
	return new DirectChannel();
}

@ServiceActivator(inputChannel="router.channel")
@Bean
public PayloadTypeRouter payloadRouter()
{
	PayloadTypeRouter router=new PayloadTypeRouter();
	router.setChannelMapping(Student.class.getName(), "student.enrich.header.channel");
	router.setChannelMapping(Address.class.getName(), "address.enrich.header.channel");
	return router;
}
@Bean
@Transformer(inputChannel="student.enrich.header.channel",outputChannel="header.payload.router.channel")
public HeaderEnricher enrichHeaderForStudent()
{
	Map<String, HeaderValueMessageProcessor<String>> headersToadd=new HashMap<>();
	headersToadd.put("testheader",new StaticHeaderValueMessageProcessor<String>("student"));
	HeaderEnricher enricher=new HeaderEnricher(headersToadd);
	return enricher;
}
@Bean
@Transformer(inputChannel="address.enrich.header.channel",outputChannel="header.payload.router.channel")
public HeaderEnricher enrichHeaderForAddress()
{
	Map<String, HeaderValueMessageProcessor<String>> headersToadd=new HashMap<>();
	headersToadd.put("testheader",new StaticHeaderValueMessageProcessor<String>("address"));
	HeaderEnricher enricher=new HeaderEnricher(headersToadd);
	return enricher;
}

@ServiceActivator(inputChannel="header.payload.router.channel")
@Bean
public HeaderValueRouter headerRouter()
{
	HeaderValueRouter router=new HeaderValueRouter("testheader");
	router.setChannelMapping("student","student.channel");
	router.setChannelMapping("address","address.channel");
	return router;
}


}





