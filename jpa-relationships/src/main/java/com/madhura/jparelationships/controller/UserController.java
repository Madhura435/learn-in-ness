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

import com.madhura.jparelationships.one_one_entity.User;
import com.madhura.jparelationships.service.UserService;
/*
 one-one relationship unidirectional
 */
@RestController
@RequestMapping("/api/User")
public class UserController {
@Autowired
private UserService userService;
@GetMapping("/getUsers")
public List<User> getUsers()
{
	return userService.getUsers();
}
@PostMapping("/saveUser")
public User getUserUsers(@RequestBody User user)
{
	return userService.saveUser(user);
}
@GetMapping("/getUser/{id}")
public Optional<User> getUserById(@PathVariable long id)
{
	return userService.getById(id);
}
@PutMapping("/updateUser/{id}")
public User alterUser(@PathVariable long id,@RequestBody User user)
{
	User userById=userService.getById(id).orElseThrow();
	userById.setName(user.getName());
	userById.setMobile(user.getMobile());
	userById.setAddress(user.getAddress());
	return userService.saveUser(userById);
}
@DeleteMapping("/deleteUser/{id}")
public void deleteUser(@PathVariable long id)
{
	User userById=userService.getById(id).orElseThrow();
	userService.deleteUser(id);
}
}

/*
{
"id":1,
"name":"madhura",
"mobile":7882882,
"address":
{
"id":1,
"HouseNo":"1-27",
"city":"pileru"
}
}
*/


