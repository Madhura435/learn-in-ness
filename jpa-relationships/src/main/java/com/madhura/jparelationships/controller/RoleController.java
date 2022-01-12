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

import com.madhura.jparelationships.one_one_entity.Book;
import com.madhura.jparelationships.one_one_entity.Role;
import com.madhura.jparelationships.service.BookService;
import com.madhura.jparelationships.service.RoleService;

/*
many-many relationship unidirectional
{
"id":1,
"name":"geetha"
*/
@RestController
@RequestMapping("/api/Role")
public class RoleController {
	@Autowired
	public RoleService roleService;
	@GetMapping("/getRoles")
	public List<Role> getRoles()
	{
		return roleService.getRoles();
	}
	@PostMapping("/saveRole")
	public Role getRole(@RequestBody Role role)
	{
		return roleService.saveRole(role);
	}
	@GetMapping("/getRole/{id}")
	public Optional<Role> getRoleById(@PathVariable long id)
	{
		return roleService.getById(id);
	}
	@PutMapping("/updateRole/{id}")
	public Role alterRole(@PathVariable long id,@RequestBody Role role)
	{
		Role roleById=roleService.getById(id).orElseThrow();
		roleById.setName(role.getName());
		return roleService.saveRole(roleById);
	}
	@DeleteMapping("/deleteBook/{id}")
	public void deleteRole(@PathVariable long id)
	{
		Role roleById=roleService.getById(id).orElseThrow();
		roleService.deleteRole(id);
	}
}
