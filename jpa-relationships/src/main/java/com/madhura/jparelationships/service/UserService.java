package com.madhura.jparelationships.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhura.jparelationships.one_one_entity.User;
import com.madhura.jparelationships.repository.UserRepository;
/*
one-one relationship unidirectional
*/
@Service
public class UserService{
@Autowired	
private UserRepository userRepository;
public List<User> getUsers()
{
	return userRepository.findAll();
}
public User saveUser(User user)
{
	return userRepository.save(user);
}
public Optional<User> getById(long id)
{
	return userRepository.findById(id);
}
public User alterUser(User user)
{
	return userRepository.save(user);
}
public void deleteUser(long id)
{
	userRepository.deleteById(id);
}
}



