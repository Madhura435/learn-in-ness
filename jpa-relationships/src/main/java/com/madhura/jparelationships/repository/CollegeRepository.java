package com.madhura.jparelationships.repository;
/*
one-many relationship unidirectional
*/
import org.springframework.data.jpa.repository.JpaRepository;

import com.madhura.jparelationships.one_one_entity.College;

public interface CollegeRepository  extends JpaRepository<College,Long>{

}
