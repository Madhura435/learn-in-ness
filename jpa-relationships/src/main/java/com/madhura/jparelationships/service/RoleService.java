package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.College;
import com.madhura.jparelationships.one_one_entity.Role;
import com.madhura.jparelationships.repository.RoleRepository;

/*
many-many relationship unidirectional
*/
@Service
public class RoleService {
@Autowired
public RoleRepository roleRepository;
public List<Role> getRoles()
{
	return roleRepository.findAll();
}
public Role saveRole(Role role)
{
	return roleRepository.save(role);
}
public Optional<Role> getById(long id)
{
	return roleRepository.findById(id);
}
public Role alterRole(Role role)
{
	return roleRepository.save(role);
}
public void deleteRole(long id)
{
	roleRepository.deleteById(id);
}	
}
