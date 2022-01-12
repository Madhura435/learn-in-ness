package com.madhura.jparelationships.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.madhura.jparelationships.one_one_entity.Library;
import com.madhura.jparelationships.service.LibraryService;

/*
one-many relationship bidirectional
*/
@RestController
@RequestMapping("/api/library")
public class LibraryController {
	@Autowired
	public LibraryService libraryService;
	
	@GetMapping("/getLibraries")
	public List<Library> getLibraries()
	{
		return libraryService.getLibraries();
	}
	/*	
	 NOT working properly. Forien key values of library not stored book in column library_id
	@PostMapping("/saveLibrary")
	public Library getLibrary(@RequestBody Library library)
	{
		return libraryService.saveLibrary(library);
	}
	*/
	@GetMapping("/getLibrary/{id}")
	public Optional<Library> getLibraryById(@PathVariable long id)
	{
		return libraryService.getById(id);
	}
/*	
 NOT working properly. Forien key values of library not stored book in column library_id
  @PutMapping("/updateLibrary/{id}")
	public Library alterLibrary(@PathVariable long id,@RequestBody Library library)
	{
		Library libraryById=libraryService.getById(id).orElseThrow();
		libraryById.setName(library.getName());
		libraryById.setBooks(library.getBooks());
		return libraryService.saveLibrary(libraryById);
	}
	*/
	@DeleteMapping("/deleteLibrary/{id}")
	public void deleteLibrary(@PathVariable long id)
	{
		Library libraryById=libraryService.getById(id).orElseThrow();
		libraryService.deleteLibrary(id);
	}
}
