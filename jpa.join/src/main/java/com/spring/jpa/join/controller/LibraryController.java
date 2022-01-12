package com.spring.jpa.join.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.join.model.Library;
import com.spring.jpa.join.repository.LibraryRepository;
import com.spring.jpa.join.service.LibraryService;

/*
one-many relationship bidirectional
*/
@RestController
@RequestMapping("/api/library")
public class LibraryController {
	@Autowired
	public LibraryService libraryService;
	
	@Autowired
	public LibraryRepository libraryRepository;
	
	 @GetMapping("/getInfo")
	    public List<Library> getJoinInformation(@PathParam("bname") String bname,
	    		@PathParam("lname") String lname){
	       return libraryRepository.getJoinInformation(bname,lname);
	       // http://localhost:8080/api/library/getInfo/?bname="apjBiograpy"
	    }
	
	
	 @PostMapping("/saveLibrary")
	public Library save(@RequestBody Library library)
	{
    	if( library.getBooks().size() > 0 )
        {
            library.getBooks().stream().forEach( bookStream -> {
            	bookStream.setLibrary( library );
            } );
        }
		return libraryService.saveLibrary(library);
	}
	
	
	@GetMapping("/getLibraries")
	public List<Library> getLibraries()
	{
		return libraryService.getLibraries();
	}
	
	
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
