package com.madhura.jparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhura.jparelationships.one_one_entity.Library;

public interface LibraryRepository extends JpaRepository<Library,Long> {

}
