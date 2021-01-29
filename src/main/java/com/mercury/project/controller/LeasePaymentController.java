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

import com.mercury.project.bean.LeasePayment;
import com.mercury.project.service.LeasePaymentService;

@RestController
@RequestMapping("/lease")
@CrossOrigin(origins="http://localhost:3001")
public class LeasePaymentController {

	@Autowired
	LeasePaymentService leasePaymentService;

	@GetMapping
	public List<LeasePayment> getAllLease(@RequestParam(value="username", required=false) String username) {
		if (username == null) {
			return leasePaymentService.getAllLeasePayment();
		}
		return leasePaymentService.findByUsername(username);
	}
	

	@PostMapping("/add")
	public Map<String, String> postLease(@RequestBody LeasePayment leasePayment) {
		System.out.println(leasePayment);
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(leasePaymentService.addLeasePayment(leasePayment)));
		System.out.println(map);
		return map;
	}
	
	@PutMapping("/edit")
	public Map<String, String> editLease(@RequestBody LeasePayment leasePayment) {
		Map<String, String> map = new HashMap<>();
		map.put("success", String.valueOf(leasePaymentService.editLeasePayment(leasePayment)));
		System.out.println(map);
		return map;
	}
	
}
