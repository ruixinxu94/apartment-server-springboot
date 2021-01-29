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

import com.mercury.project.bean.Reminder;
import com.mercury.project.service.ReminderService;

@RestController
@RequestMapping("/reminder")
@CrossOrigin(origins="http://localhost:3001")
public class ReminderController {
	@Autowired
	ReminderService reminderService;
	
	@GetMapping
	public List<Reminder> getReminders() {
		return reminderService.getAllReminders();
	}
	
	@PutMapping("/edit")
	public Map<String, String> editReminder(@RequestBody Reminder reminder) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(reminderService.editReminder(reminder)));
		System.out.println(map);
		return map;
	}
	@DeleteMapping("{id}")
	public Map<String, String>  deleteReminder(@PathVariable("id") Long id) {
		
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(reminderService.deleteReminder(id)));
		System.out.println("delete  :"+map);
		return map;
	}
	
	@PostMapping("/post")
	public Map<String, String> postReminder(@RequestBody Reminder reminder) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(reminderService.addReminder(reminder)));
		System.out.println(map);
		return map;
	}
	
}
	
