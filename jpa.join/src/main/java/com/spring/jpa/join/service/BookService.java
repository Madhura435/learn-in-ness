package com.spring.jpa.join.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jpa.join.model.Book;
import com.spring.jpa.join.repository.BookRepository;


/*
one-many relationship bidirectional
*/
@Service
public class BookService {
@Autowired
public BookRepository bookRepository;
public List<Book> getBooks()
{
	return bookRepository.findAll();
}
public Book saveBook(Book book)
{
	return bookRepository.save(book);
}
public Optional<Book> getById(long id)
{
	return bookRepository.findById(id);
}
public Book alterBook(Book book)
{
	return bookRepository.save(book);
}
public void deleteBook(long id)
{
	bookRepository.deleteById(id);
}	
}
