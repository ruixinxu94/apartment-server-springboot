package com.mercury.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.project.bean.Room;
import com.mercury.project.service.RoomService;

@RestController
@RequestMapping("/rooms")
@CrossOrigin(origins = "http://localhost:3001")
public class RoomController {
	
	@Autowired
	RoomService roomService;

	@GetMapping
	public List<Room> getRooms() {
		return roomService.getAllRooms();
	}

	@PostMapping("/add")
	public Map<String, String> postRoom(@RequestBody Room room) {
		System.out.println(room);
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(roomService.addRoom(room)));
		System.out.println(map);
		return map;
	}

	@PutMapping("/edit")
	public Map<String, String> editUser(@RequestBody Room room) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(roomService.editRoom(room)));
		System.out.println(map);
		return map;
	}

}
