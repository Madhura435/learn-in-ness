package com.madhura.jparelationships.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.madhura.jparelationships.one_one_entity.Book;
import com.madhura.jparelationships.one_one_entity.Employee;
import com.madhura.jparelationships.service.BookService;
import com.madhura.jparelationships.service.EmployeeService;

/*
many-many relationship unidirectional
{
"id":1,
"name":"geetha",
"roles":
[
{
"id":1,
"nmae":"testing"
},
{
"id":1,
"name":"devlop"
}
]
}
*/
@RestController
@RequestMapping("/api/Employee")
public class EmployeeController {
	@Autowired
	public EmployeeService employeeService;
	@GetMapping("/getEmployees")
	public List<Employee> getEmployees()
	{
		return employeeService.getEmployees();
	}
	@PostMapping("/saveEmployee")
	public Employee getEmployee(@RequestBody Employee employee)
	{
		return employeeService.saveEmployee(employee);
	}
	@GetMapping("/getEmployee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable long id)
	{
		return employeeService.getById(id);
	}
	@PutMapping("/updateEmployee/{id}")
	public Employee alterEmployee(@PathVariable long id,@RequestBody Employee employee)
	{
		Employee employeeById=employeeService.getById(id).orElseThrow();
		employeeById.setName(employee.getName());
		employeeById.setRoles(employee.getRoles());
		return employeeService.saveEmployee(employeeById);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable long id)
	{
		Employee employeeById=employeeService.getById(id).orElseThrow();
		employeeService.deleteEmployee(id);
	}
}
