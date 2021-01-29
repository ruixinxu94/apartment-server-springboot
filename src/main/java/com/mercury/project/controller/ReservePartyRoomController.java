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

import com.mercury.project.bean.ReservePartyRoom;
import com.mercury.project.service.ReservePartyRoomService;

@RestController
@RequestMapping("/reservepartyroom")
@CrossOrigin(origins="http://localhost:3001")
public class ReservePartyRoomController {
	@Autowired
	ReservePartyRoomService reservePartyRoomService;
	
	@GetMapping
	public List<ReservePartyRoom> getUsers() {
		return reservePartyRoomService.getAllReservePartyRoom();
	}
	
	@PostMapping("/add")
	public Map<String, String> postPartyRoom(@RequestBody ReservePartyRoom reservePartyRoom) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(reservePartyRoomService.addReservePartyRoom(reservePartyRoom)));
		System.out.println(map);
		return map;
	}
	
}
