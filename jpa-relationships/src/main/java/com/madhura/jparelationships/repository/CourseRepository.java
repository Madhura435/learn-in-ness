package com.madhura.jparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.madhura.jparelationships.one_one_entity.Course;
import com.madhura.jparelationships.one_one_entity.User;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {

}
