package com.madhura.jparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhura.jparelationships.one_one_entity.CollegeStudent;
import com.madhura.jparelationships.one_one_entity.Course;

@Repository
public interface CollegeStudentRepository extends JpaRepository<CollegeStudent,Long> {

}
