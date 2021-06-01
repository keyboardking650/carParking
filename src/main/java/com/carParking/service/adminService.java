package com.carParking.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface adminService {

	public void addAdmin( int id); // c
	public ResponseEntity<Object> getAdmin( int id); // r
	public void updateAdmin( int id);  //u
	public void removeAdmin( int id);  // d 
	public List allAdmin();
	
}
