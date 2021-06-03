package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Manager {

	 
	@Column(name="floor")
	private int parkingFloor;

	@Column(name="spots")
	private int parkingSpots;
	
	@Column(name="adminname")
	private String adminAssigned;

	@Id
	@Column(name="areacode")
	private int parkingAreaCode;

	public int getParkingFloor() {
		return parkingFloor;
	}

	public void setParkingFloor(int parkingFloor) {
		this.parkingFloor = parkingFloor;
	}

	public int getParkingSpots() {
		return parkingSpots;
	}

	public void setParkingSpots(int parkingSpots) {
		this.parkingSpots = parkingSpots;
	}

	public String getAdminAssigned() {
		return adminAssigned;
	}

	public void setAdminAssigned(String adminAssigned) {
		this.adminAssigned = adminAssigned;
	}

	public int getParkingAreaCode() {
		return parkingAreaCode;
	}

	public void setParkingAreaCode(int parkingAreaCode) {
		this.parkingAreaCode = parkingAreaCode;
	}

	public Manager(int parkingFloor, int parkingSpots, String adminAssigned, int parkingAreaCode) {
		super();
		this.parkingFloor = parkingFloor;
		this.parkingSpots = parkingSpots;
		this.adminAssigned = adminAssigned;
		this.parkingAreaCode = parkingAreaCode;
	}

	public Manager() {
		
 	}
	
	
	
	
}
