package com.mercury.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.project.bean.User;
import com.mercury.project.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="http://localhost:3001")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping
	public List<User> getUsers() {
		return userService.getAllUsers();
	}
	
	
	@PostMapping("/register")
	public Map<String, String> postUser(@RequestBody User user) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(userService.addUser(user)));
		System.out.println(map);
		return map;
	}
	
	@PutMapping("/admin-edit")
	public Map<String, String> editUser(@RequestBody User user) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(userService.editUser(user)));
		System.out.println(map);
		return map;
	}
	@DeleteMapping("{username}")
	public Map<String, String>  deleteUser(@PathVariable("username") String username) {
		
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(userService.deleteUser(username)));
		System.out.println("delete  :"+map);
		return map;
	}
	
	
	
	
}
