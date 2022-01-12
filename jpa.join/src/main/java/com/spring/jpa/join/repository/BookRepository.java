package com.spring.jpa.join.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jpa.join.model.Book;

/*
 one-one bidirectional
 */
public interface BookRepository extends JpaRepository<Book,Long> {

}
