package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.Course;
import com.madhura.jparelationships.one_one_entity.Role;
import com.madhura.jparelationships.repository.CourseRepository;
import com.madhura.jparelationships.repository.RoleRepository;

/*
many-many relationship unidirectional
*/
@Service
public class CourseService {
	@Autowired
	public CourseRepository courseRepository;
	public List<Course> getCourseS()
	{
		return courseRepository.findAll();
	}
	public Course saveCourse(Course course)
	{
		return courseRepository.save(course);
	}
	public Optional<Course> getById(long id)
	{
		return courseRepository.findById(id);
	}
	public Course alterCourse(Course course)
	{
		return courseRepository.save(course);
	}
	public void deleteCourse(long id)
	{
		courseRepository.deleteById(id);
	}	
}
