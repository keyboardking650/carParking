package com.service;

import org.springframework.http.ResponseEntity;

import com.dto.AdminDto;
import com.model.Admin;

public interface AdminService {
	
	public ResponseEntity<Object> addParkingLots(AdminDto adminDtoObj);
	public ResponseEntity<Object> getParkingLotDetails();
	public ResponseEntity<Object> updateParkingLots( AdminDto adminDtoObj, int id);
	public ResponseEntity<Object> deleteParkingLots(int id);
	 
	

}
