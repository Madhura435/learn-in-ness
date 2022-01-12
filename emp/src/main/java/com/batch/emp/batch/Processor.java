package com.batch.emp.batch;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.batch.emp.models.Employee;

@Component
public class Processor implements ItemProcessor<Employee, Employee> {
	private static final Map<String, String> deptNames=new HashMap<>();
	
	public Processor()
	{
		deptNames.put("50", "develop");
		deptNames.put("100", "QA");
		deptNames.put("30", "DA");
	}
	
	@Override
	public Employee process(Employee employee) throws Exception {
		String deptCode=employee.getDept();
		String deptName=deptNames.get(deptCode);
		employee.setDept(deptName);
		employee.setTime(new Date());
		return employee;
	}

}
