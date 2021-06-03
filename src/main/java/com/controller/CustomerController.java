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
import com.dto.CustomerDto;
import com.model.Customer;
 import com.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {


	@Autowired
	CustomerService cservice;
	
	@PostMapping("/newbooking")
	public ResponseEntity<Object> newbooking( @RequestBody CustomerDto customerDto){
		return cservice.newBooking(customerDto);
	}
	
	@GetMapping("/history")
	public ResponseEntity<Object> history() {
		return cservice.history();
	
	}
	
	@PutMapping("/updatebooking")
	public ResponseEntity<Object> updateBooking(@RequestBody CustomerDto customerDtoObj, @RequestParam("vehicleNo") int vehicleNo) {
		return cservice.updateBooking(customerDtoObj, vehicleNo);
	}
	
	@DeleteMapping("/deletebooking")
	public ResponseEntity<Object> deleteParkingLots(int vehicleNo) {
		return cservice.deleteBooking(vehicleNo);
	}
}