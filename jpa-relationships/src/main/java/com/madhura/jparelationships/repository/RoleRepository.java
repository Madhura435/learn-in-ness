package com.madhura.jparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhura.jparelationships.one_one_entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

}
