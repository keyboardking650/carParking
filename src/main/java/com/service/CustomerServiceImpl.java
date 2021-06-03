package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.AdminDto;
import com.dto.CustomerDto;
import com.model.Customer;
import com.repo.CustomerRepo;

@Service("cservice")
public class CustomerServiceImpl implements CustomerService {


	@Autowired
	CustomerRepo customerrepo;
	
	@Override
	public ResponseEntity<Object> newBooking(CustomerDto customerDtoObj) {
	
		Customer customerdb = new Customer();
		customerdb.setVehicleNo(customerDtoObj.getVehicleNo());
		customerdb.setCustomerPhone(customerDtoObj.getCustomerPhone());
		customerdb.setCustomerName(customerDtoObj.getCustomerName());
		customerdb.setInTime(customerDtoObj.getInTime());
		customerdb.setOutTime(customerDtoObj.getOutTime());
		customerdb.setVehicleType(customerDtoObj.getVehicleType());
		
		customerrepo.save(customerdb);
		
		return new ResponseEntity<Object>(customerdb, HttpStatus.OK);
 		
	}

	@Override
	public ResponseEntity<Object> updateBooking( CustomerDto customerDtoObj, int vehicleNo ) {
		
		Customer customerdb = customerrepo.findById(vehicleNo);
		customerdb.setVehicleNo(customerDtoObj.getVehicleNo());
		customerdb.setCustomerPhone(customerDtoObj.getCustomerPhone());
		customerdb.setCustomerName(customerDtoObj.getCustomerName());
		customerdb.setInTime(customerDtoObj.getInTime());
		customerdb.setOutTime(customerDtoObj.getOutTime());
		customerdb.setVehicleType(customerDtoObj.getVehicleType());
		
		
		customerrepo.save(customerdb);
		
		return new ResponseEntity<Object>( customerdb, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Object> deleteBooking(int vehicleNo) {
 		customerrepo.deleteById(vehicleNo);
		return new ResponseEntity<Object>( HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Object>  history( ) {
		
		List<Customer> customer = (List<Customer>) customerrepo.findAll();
		return new ResponseEntity<Object>(customer, HttpStatus.OK);
 		
	}

	 
}
