package com.batch.emp.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.batch.emp.models.Employee;
import com.batch.emp.repository.EmpRepository;

@Component
public class DBWriter implements ItemWriter<Employee>{
	@Autowired
	public EmpRepository empRepository;

	@Override
	public void write(List<? extends Employee> empployees) throws Exception {
		empRepository.saveAll(empployees);
		
	}

}
