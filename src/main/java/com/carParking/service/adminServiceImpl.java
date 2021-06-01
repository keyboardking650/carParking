package com.carParking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.carParking.model.admin;
import com.carParking.repo.adminRepo;

@Service("adservice")
public class adminServiceImpl implements adminService{

	 
	@Autowired
	adminRepo adrpo;
	 
	@Override
	public void addAdmin(int id) {
 		
	}

	@Override
	public ResponseEntity<Object> getAdmin(int id) {
// 		Optional<admin> admin = adrpo.findById(id);
		Optional<admin> admin = adrpo.
		return new ResponseEntity<Object>(admin, HttpStatus.OK);
	}

	@Override
	public void updateAdmin(int id) {
 		
	}

	@Override
	public void removeAdmin(int id) {
 		
	}

	@Override
	public List  allAdmin() {
	
 		return null;
	}

}
