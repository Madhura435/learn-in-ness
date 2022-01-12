package com.batch.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.batch.emp.models.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Long>{

}
