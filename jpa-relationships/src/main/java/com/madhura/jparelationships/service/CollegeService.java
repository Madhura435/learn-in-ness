package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.College;
import com.madhura.jparelationships.one_one_entity.User;
import com.madhura.jparelationships.repository.CollegeRepository;

/*
one-many relationship unidirectional
*/
@Service
public class CollegeService {
@Autowired
public CollegeRepository collegeRepository;
public List<College> getColleges()
{
	return collegeRepository.findAll();
}
public College saveCollege(College college)
{
	return collegeRepository.save(college);
}
public Optional<College> getById(long id)
{
	return collegeRepository.findById(id);
}
public College alterCollege(College college)
{
	return collegeRepository.save(college);
}
public void deleteCollege(long id)
{
	collegeRepository.deleteById(id);
}	
}
