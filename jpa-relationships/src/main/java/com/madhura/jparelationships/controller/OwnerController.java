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

import com.madhura.jparelationships.one_one_entity.Owner;
import com.madhura.jparelationships.one_one_entity.User;
import com.madhura.jparelationships.service.OwnerService;

/*
one-one relationship
{
"name":"Madhura",
"car":
{
"model":"Audi"
}
}
*/
@RestController
@RequestMapping("/api/Owner")
public class OwnerController {
	@Autowired
	public OwnerService ownerService;
	@GetMapping("/getOwners")
	public List<Owner> getOwners()
	{
		return ownerService.getOwners();
	}
	@PostMapping("/saveOwner")
	public Owner saveOwner(@RequestBody Owner owner)
	{
		return ownerService.saveOwner(owner);
	}
	@GetMapping("/getOwner/{id}")
	public Optional<Owner> getOwnerById(@PathVariable long id)
	{
		return ownerService.getById(id);
	}
	@PutMapping("/updateOwner/{id}")
	public Owner alterOwner(@PathVariable long id,@RequestBody Owner owner)
	{
		Owner ownerById=ownerService.getById(id).orElseThrow();
		ownerById.setName(owner.getName());
		ownerById.setCar(owner.getCar());
		return ownerService.saveOwner(owner);
	}
	@DeleteMapping("/deleteOwner/{id}")
	public void deleteOwner(@PathVariable long id)
	{
		Owner ownerById=ownerService.getById(id).orElseThrow();
		ownerService.deleteOwner(id);
	}
}
