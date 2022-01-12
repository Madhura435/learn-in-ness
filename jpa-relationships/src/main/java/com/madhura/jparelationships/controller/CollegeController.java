package com.madhura.jparelationships.controller;
/*
one-many relationship unidirectional
*/

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

import com.madhura.jparelationships.one_one_entity.College;
import com.madhura.jparelationships.one_one_entity.User;
import com.madhura.jparelationships.service.CollegeService;
@RestController
@RequestMapping("/api/College")
public class CollegeController {
@Autowired
public CollegeService collegeService;
@GetMapping("/getColleges")
public List<College> getColleges()
{
	return collegeService.getColleges();
}
@PostMapping("/saveCollege")
public College getColleges(@RequestBody College college)
{
	return collegeService.saveCollege(college);
}
@GetMapping("/getCollege/{id}")
public Optional<College> getCollegeById(@PathVariable long id)
{
	return collegeService.getById(id);
}
@PutMapping("/updateCollege/{id}")
public College alterCollege(@PathVariable long id,@RequestBody College college)
{
	College collegeById=collegeService.getById(id).orElseThrow();
	collegeById.setName(college.getName());
	collegeById.setStudents(college.getStudents());
	return collegeService.saveCollege(collegeById);
}
@DeleteMapping("/deleteCollege/{id}")
public void deleteCollege(@PathVariable long id)
{
	College collegeById=collegeService.getById(id).orElseThrow();
	collegeService.deleteCollege(id);
}
}
