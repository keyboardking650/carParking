package com.service;

import org.springframework.http.ResponseEntity;

import com.dto.ManagerDto;

 	public interface ManagerService {
	public ResponseEntity<Object> addParkingSpace(ManagerDto managerDto);
	public ResponseEntity<Object> checkParkingAvailbility(int parkingAreaCode);
	public ResponseEntity<Object> allocateParkingByAdmin( ManagerDto managerDtoObj, int parkingAreaCode);
	public ResponseEntity<Object> allParkingSpaces();

 }

