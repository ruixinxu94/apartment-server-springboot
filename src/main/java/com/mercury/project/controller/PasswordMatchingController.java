package com.mercury.project.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.project.bean.PasswordMatching;
import com.mercury.project.service.PasswordMatchingService;

@RestController
@RequestMapping("/resetpassword")
@CrossOrigin(origins="http://localhost:3001")
public class PasswordMatchingController {
	
	@Autowired
	PasswordMatchingService passwordMatchingService;
	
	@PutMapping("/reset")
	public Map<String, String> resetPassword(@RequestBody PasswordMatching passwordMatching) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(passwordMatchingService.resetPassword(passwordMatching)));
		System.out.println(map);
		return map;
	}
}
	