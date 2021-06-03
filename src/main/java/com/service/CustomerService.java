package com.service;

import org.springframework.http.ResponseEntity;

import com.dto.CustomerDto;
import com.model.Customer;

public interface CustomerService {

	public ResponseEntity<Object> newBooking(CustomerDto customerDto);
	public ResponseEntity<Object> updateBooking(CustomerDto customerDtoObj, int vehicleNo);
	public ResponseEntity<Object> deleteBooking(int vehicleNo);
	public ResponseEntity<Object> history();
	
	
}
