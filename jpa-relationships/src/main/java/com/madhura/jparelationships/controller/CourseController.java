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

import com.madhura.jparelationships.one_one_entity.Course;
import com.madhura.jparelationships.one_one_entity.Role;
import com.madhura.jparelationships.service.CourseService;
import com.madhura.jparelationships.service.RoleService;

/*
many-many relationship unidirectional
*/
@RestController
@RequestMapping("/api/Course")
public class CourseController {
	@Autowired
	public CourseService courseService;
	@GetMapping("/getCourses")
	public List<Course> getCourses()
	{
		return courseService.getCourseS();
	}
	/*
	 @PostMapping("/saveCourse")
	public Course getCourse(@RequestBody Course course)
	{
		return courseService.saveCourse(course);
	}
	*/
	@GetMapping("/getCourse/{id}")
	public Optional<Course> getCourseById(@PathVariable long id)
	{
		return courseService.getById(id);
	}
/*	@PutMapping("/updateRole/{id}")
	public Course alterCourse(@PathVariable long id,@RequestBody Course course)
	{
		Course courseById=courseService.getById(id).orElseThrow();
		courseById.setName(course.getName());
		courseById.setStudents(course.getStudents());
		return courseService.saveCourse(courseById);
	}
	*/
	@DeleteMapping("/deleteCourse/{id}")
	public void deleteCourse(@PathVariable long id)
	{
		Course courseById=courseService.getById(id).orElseThrow();
		courseService.deleteCourse(id);
	}
}
