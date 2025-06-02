package com.payflow.payflow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payflow.payflow.dto.ResponseStructure;
import com.payflow.payflow.entity.User;
import com.payflow.payflow.service.UserService;

@RestController
@RequestMapping("/payflow/User")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseStructure<User>> getUserById(@PathVariable Long id){
		return userService.getUserById(id);
	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<List<User>>> getAllUser(){
		return userService.getAllUser();
	}
	
	@PutMapping
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user){
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<ResponseStructure<User>> deleteUser(@PathVariable Long id){
		return userService.deleteUser(id);
	}
}
