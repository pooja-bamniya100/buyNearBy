package com.bnb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bnb.model.Users;
import com.bnb.service.UserService;

@RestController
@RequestMapping("/buynearby/user/v1")
public class UserController {

	@Autowired
	UserService userService;
	
	/**
	 * create user  
	 *
	 * @param id the employee id
	 * @return the message
	 * @throws ResourceNotFoundException 
	 * @throws ExceptResourceNotFoundExceptionion the exception
	 */
	@PostMapping("/users")
	public ResponseEntity  createUser(@RequestBody Users user)
	{
		
		return new ResponseEntity(userService.createUser(user),HttpStatus.OK);
		
	}


}
