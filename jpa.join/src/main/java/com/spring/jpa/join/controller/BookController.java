package com.spring.jpa.join.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.join.model.Book;
import com.spring.jpa.join.service.BookService;


/*
one-many relationship bidirectional
{
"id":1,
"name":"geetha",
"library":
{
"id":1,
"nmae":"sreerama"
}
}
*/
@RestController
@RequestMapping("/api/book")
public class BookController {
	@Autowired
	public BookService bookService;
	
	
	
	@GetMapping("/getBooks")
	public List<Book> getBookss()
	{
		return bookService.getBooks();
	}
	@PostMapping("/saveBook")
	public Book getBook(@RequestBody Book book)
	{
		return bookService.saveBook(book);
	}
	@GetMapping("/getBook/{id}")
	public Optional<Book> getBookById(@PathVariable long id)
	{
		return bookService.getById(id);
	}
	@PutMapping("/updateBook/{id}")
	public Book alterLibrary(@PathVariable long id,@RequestBody Book book)
	{
		Book bookById=bookService.getById(id).orElseThrow();
		bookById.setName(book.getName());
		bookById.setLibrary(book.getLibrary());
		return bookService.saveBook(bookById);
	}
	@DeleteMapping("/deleteBook/{id}")
	public void deleteLibrary(@PathVariable long id)
	{
		Book bookById=bookService.getById(id).orElseThrow();
		bookService.deleteBook(id);
	}
}
