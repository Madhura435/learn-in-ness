package com.madhura.jparelationships.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhura.jparelationships.one_one_entity.Book;
/*
 one-one bidirectional
 */
public interface BookRepository extends JpaRepository<Book,Long> {

}
