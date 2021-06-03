package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

 
import com.dto.AdminDto;
import com.model.Admin;
import com.repo.AdminRepo;

@Service("adservice")
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepo adminrepo;
	
	@Override
	public ResponseEntity<Object> addParkingLots(AdminDto adminDtoObj) {

		Admin admindb = new Admin();
		admindb.setParkingLotId(adminDtoObj.getParkingLotId());
		admindb.setNoOfFloors(adminDtoObj.getNoOfFloors());
		admindb.setTotalSpots(adminDtoObj.getTotalSpots());
		admindb.setOccupiedSpots(adminDtoObj.getOccupiedSpots());
		
		adminrepo.save(admindb);
		
		
		return new ResponseEntity<Object>(admindb, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> getParkingLotDetails() {
 
		List<Admin> admin= (List<Admin>) adminrepo.findAll();
		return new ResponseEntity<Object>(admin, HttpStatus.OK);
		
	}

	@Override
	public ResponseEntity<Object> updateParkingLots(AdminDto adminDtoObj, int id) {
		
		 Admin admindb = adminrepo.findById(id);
		admindb.setParkingLotId(adminDtoObj.getParkingLotId());
		admindb.setNoOfFloors(adminDtoObj.getNoOfFloors());
		admindb.setTotalSpots(adminDtoObj.getTotalSpots());
		admindb.setOccupiedSpots(adminDtoObj.getOccupiedSpots());
		
		adminrepo.save(admindb);	
	
	return new ResponseEntity<Object>( HttpStatus.OK);
}
			

	@Override
	public ResponseEntity<Object> deleteParkingLots(int id) {
		
		adminrepo.deleteById(id);
		return new ResponseEntity<Object>( HttpStatus.OK);		
	}
 

	 
}
