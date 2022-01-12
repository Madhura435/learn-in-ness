package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.Owner;
import com.madhura.jparelationships.one_one_entity.User;
import com.madhura.jparelationships.repository.OwnerRepository;

/*
one-one relationship
*/
@Service
public class OwnerService {
@Autowired
public OwnerRepository ownerRepository;
public List<Owner> getOwners()
{
	return ownerRepository.findAll();
}
public Owner saveOwner(Owner owner)
{
	return ownerRepository.save(owner);
}
public Optional<Owner> getById(long id)
{
	return ownerRepository.findById(id);
}
public Owner alterOwner(Owner owner)
{
	return ownerRepository.save(owner);
}
public void deleteOwner(long id)
{
	ownerRepository.deleteById(id);
}	
}
