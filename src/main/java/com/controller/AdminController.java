package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

 import com.dto.AdminDto;
import com.model.Admin;
import com.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	@PostMapping("/addparkinglots")
	public ResponseEntity<Object> addParkingLots(Admin adminDtoObj) {
		Admin admin = adminDtoObj;
		return adminservice.addParkingLots(admin);
	}
	
	@GetMapping("/getparkinglotdetails")
	public ResponseEntity<Object> getParkingLotDetails() {
		return adminservice.getParkingLotDetails();
	}
	
	@PutMapping("/updateparkinglotdetails")
	public ResponseEntity<Object> updateParkingLotDetails(@RequestBody AdminDto adminDtoObj, @RequestParam("parkingLotId") int id ) {
		return adminservice.updateParkingLots(adminDtoObj, id);
	}
	
	@DeleteMapping("/deleteparkinglot/")
	public ResponseEntity<Object> deleteParkingLotDetails(@RequestParam ("id") int id) {
		return adminservice.deleteParkingLots(id);
}
}