package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dto.CustomerDto;
import com.dto.ManagerDto;
import com.model.Manager;
import com.service.ManagerService;

@RestController
@RequestMapping("/manager")
public class ManagerController {

	@Autowired
	ManagerService mservice;
	
	@GetMapping("/allparkingspaces")
	public ResponseEntity<Object> allParkingSpaces() {
		return mservice.allParkingSpaces(); 
	}
	@PostMapping("/addparkingspace")
	public ResponseEntity<Object> addParkingSpace(@RequestBody ManagerDto managerDtoObj) {
		return mservice.addParkingSpace(managerDtoObj);
	}
	@PutMapping("/allocateparkingbyadmin")
	public ResponseEntity<Object> allocateParkingByAdmin(@RequestBody ManagerDto managerDtoObj, @RequestParam("parkingAreaCode") int parkingAreaCode) {
		return mservice.allocateParkingByAdmin(managerDtoObj, parkingAreaCode);
	}

	@GetMapping("/checkavailbility")
	public ResponseEntity<Object> checkParkingAvailbility(@RequestParam("parkingAreaCode") int parkingAreaCode) {
		return mservice.checkParkingAvailbility( parkingAreaCode);
	}

	
}
