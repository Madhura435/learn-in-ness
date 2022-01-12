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

import com.madhura.jparelationships.one_one_entity.CollegeStudent;
import com.madhura.jparelationships.one_one_entity.Role;
import com.madhura.jparelationships.service.CollegeStudentService;
import com.madhura.jparelationships.service.RoleService;

/*
many-many relationship bidirectional
{
"id":1,
"name":"geetha"
*/
@RestController
@RequestMapping("/api/Student")
public class CollegeStudentController {
	@Autowired
	public CollegeStudentService studentService;
	@GetMapping("/getStudents")
	public List<CollegeStudent> getStudents()
	{
		return studentService.getStudents();
	}
	@PostMapping("/saveStudent")
	public CollegeStudent getStudent(@RequestBody CollegeStudent student)
	{
		return studentService.saveStudent(student);
	}
	@GetMapping("/getStudent/{id}")
	public Optional<CollegeStudent> getStudentById(@PathVariable long id)
	{
		return studentService.getById(id);
	}
	@PutMapping("/updateStudent/{id}")
	public CollegeStudent alterStudent(@PathVariable long id,@RequestBody CollegeStudent student)
	{
		CollegeStudent studentById=studentService.getById(id).orElseThrow();
		studentById.setName(student.getName());
		studentById.setCourses(student.getCourses());
		return studentService.saveStudent(studentById);
	}
	@DeleteMapping("/deleteStudent/{id}")
	public void deleteLibrary(@PathVariable long id)
	{
		CollegeStudent studentById=studentService.getById(id).orElseThrow();
		studentService.deletestudent(id);
	}
}
