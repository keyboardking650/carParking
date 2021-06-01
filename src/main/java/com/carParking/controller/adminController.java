package com.carParking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carParking.model.admin;
import com.carParking.service.adminService;

@RestController
@RequestMapping("/admin")
public class adminController {
	
	@Autowired
	adminService adservice;
    
	@GetMapping("/addAdmin/{id}")
	public void addAdmin ( @PathVariable("id") int id) {
		adservice.addAdmin(id);
		
	}
	
	@GetMapping("/")
	public ResponseEntity<Object> viewAdmin (@RequestParam("id") int  id ) {
 		return adservice.getAdmin(id);
		
	}
	
	@GetMapping("/allAdmins")
	public List viewAllAdmin () {
		return adservice.allAdmin();
		
	}
	
}
