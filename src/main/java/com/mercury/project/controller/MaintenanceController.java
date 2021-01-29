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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mercury.project.bean.Maintenance;
import com.mercury.project.service.MaintenanceService;

@RestController
@RequestMapping("/maintenance")
@CrossOrigin(origins="http://localhost:3001")
public class MaintenanceController {
	@Autowired
	MaintenanceService maintenanceService;
	
	@GetMapping
	public List<Maintenance> getMaintenances(@RequestParam(value="roomnumber", required=false) Integer roomnumber) {
		if (roomnumber == null) {
			return maintenanceService.getAllMaintenances();
		}
		return maintenanceService.findByRoomnumber(roomnumber);
	}
	
	@PostMapping("/post")
	public Map<String, String> postMaintenance(@RequestBody Maintenance maintenance) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(maintenanceService.addMaintenance(maintenance)));
		System.out.println(map);
		return map;
	}
	@PutMapping("/edit")
	public Map<String, String> editMaintenance(@RequestBody Maintenance maintenance) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(maintenanceService.editMaintenance(maintenance)));
		System.out.println(map);
		return map;
	}
}
	
