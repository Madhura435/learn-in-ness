package com.spring.batch.Spring.batch;

import org.springframework.batch.item.ItemProcessor;

public class Processor implements ItemProcessor<String,String> {

	@Override
	public String process(String item) throws Exception {
		
		return item.toUpperCase();
	}

}
