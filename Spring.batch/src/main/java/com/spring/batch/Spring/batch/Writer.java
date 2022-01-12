package com.spring.batch.Spring.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;

public class Writer implements ItemWriter<String>{

	@Override
	public void write(List<? extends String> items) throws Exception {
		for(String msg:items)
		{
			System.out.println("Writing the data"+msg);
		}
	}

}
