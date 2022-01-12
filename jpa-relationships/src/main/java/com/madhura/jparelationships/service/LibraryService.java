package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.College;
import com.madhura.jparelationships.one_one_entity.Library;
import com.madhura.jparelationships.repository.LibraryRepository;

/*
one-many relationship bidirectional
*/
@Service
public class LibraryService {
@Autowired
public LibraryRepository libraryRepository;
public List<Library> getLibraries()
{
	return libraryRepository.findAll();
}
public Library saveLibrary(Library library)
{
	return libraryRepository.save(library);
}
public Optional<Library> getById(long id)
{
	return libraryRepository.findById(id);
}
public Library alterLibrary(Library library)
{
	return libraryRepository.save(library);
}
public void deleteLibrary(long id)
{
	libraryRepository.deleteById(id);
}	
}
