package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.CollegeStudent;
import com.madhura.jparelationships.one_one_entity.Role;
import com.madhura.jparelationships.repository.CollegeStudentRepository;
import com.madhura.jparelationships.repository.RoleRepository;

/*
many-many relationship unidirectional
*/
@Service
public class CollegeStudentService {
	@Autowired
	public CollegeStudentRepository collegeStudentRepository;
	public List<CollegeStudent> getStudents()
	{
		return collegeStudentRepository.findAll();
	}
	public CollegeStudent saveStudent(CollegeStudent student)
	{
		return collegeStudentRepository.save(student);
	}
	public Optional<CollegeStudent> getById(long id)
	{
		return collegeStudentRepository.findById(id);
	}
	public CollegeStudent alterstudent(CollegeStudent student)
	{
		return collegeStudentRepository.save(student);
	}
	public void deletestudent(long id)
	{
		collegeStudentRepository.deleteById(id);
	}	
}
