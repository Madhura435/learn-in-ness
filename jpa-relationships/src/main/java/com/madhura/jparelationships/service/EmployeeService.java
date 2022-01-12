package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.Employee;
import com.madhura.jparelationships.one_one_entity.Role;
import com.madhura.jparelationships.repository.EmployeeRepository;

/*
many-many relationship unidirectional
*/
@Service
public class EmployeeService {
@Autowired
public EmployeeRepository employeeRepository;
public List<Employee> getEmployees()
{
	return employeeRepository.findAll();
}
public Employee saveEmployee(Employee employee)
{
	return employeeRepository.save(employee);
}
public Optional<Employee> getById(long id)
{
	return employeeRepository.findById(id);
}
public Employee alterEmployee(Employee employee)
{
	return employeeRepository.save(employee);
}
public void deleteEmployee(long id)
{
	employeeRepository.deleteById(id);
}	
}
