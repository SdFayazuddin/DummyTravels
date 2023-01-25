package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dto.UserAccountDTO;
import com.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/create-user")
	public String createUser(@RequestBody UserAccountDTO user) {
		userService.storeUser(user);
		return "Successfull";
	}
	
	@PutMapping("/update-user")
	public String updateUser(@RequestBody UserAccountDTO user) {
		userService.storeUser(user);
		return "Successfull";
	}
	
	@GetMapping("/get-user/{email}")
	public UserAccountDTO getUser(@PathVariable String email) {
		return userService.getUser(email);
	}
	
	@DeleteMapping("/delete-user/{email}")
	public String deleteUser(@PathVariable String email) {
		userService.deleteUser(email);
		return "successful";
	}
}
