package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dto.CustomerDto;
import com.dto.ManagerDto;
import com.model.Manager;
import com.repo.ManagerRepo;
@Service("mservice")
public class ManagerServiceImpl implements ManagerService{

	@Autowired
	ManagerRepo managerrepo;
	
	
	@Override
	public ResponseEntity<Object> addParkingSpace(ManagerDto managerDto) {
		
		Manager managerdb = new Manager();
		managerdb.setAdminAssigned(managerDto.getAdminAssigned());
		managerdb.setParkingAreaCode(managerDto.getParkingAreaCode());
		managerdb.setParkingFloor(managerDto.getParkingFloor());
		managerdb.setParkingSpots(managerDto.getParkingSpots());
		
		managerrepo.save(managerdb);
		
		return new ResponseEntity<Object>(managerdb, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> checkParkingAvailbility( int parkingAreaCode) {
		
 		Manager managerdb =  managerrepo.findById(parkingAreaCode);
 		return new ResponseEntity<Object>(managerdb, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> allocateParkingByAdmin( ManagerDto managerDtoObj, int parkingAreaCode) {
		
		Manager managerdb = managerrepo.findById(parkingAreaCode);
		managerdb.setAdminAssigned(managerDtoObj.getAdminAssigned());
		managerdb.setParkingFloor(managerDtoObj.getParkingFloor());
		managerdb.setParkingSpots(managerDtoObj.getParkingSpots());
		
		managerrepo.save(managerdb);
		
		return new ResponseEntity<Object>(managerdb, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> allParkingSpaces() {
		
		List<Manager> manager = (List<Manager>) managerrepo.findAll();
		return new ResponseEntity<Object>(manager, HttpStatus.OK);
	}

}
