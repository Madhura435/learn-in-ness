package com.madhura.valiframe.second;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rpa")
public class UserController {
@Autowired
public UserService userService;
@PostMapping("/create")
public ResponseEntity<User>  createUser(@Valid @RequestBody User user)
{
	return new ResponseEntity<User>(userService.createUser(user),HttpStatus.CREATED);
}
@GetMapping("/ma")
public String testing() {
    return "aamaam";
}

}
