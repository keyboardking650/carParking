package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
 
import javax.persistence.Id;

@Entity
public class Admin {

	@Id	
	@Column(name="lotid")
	private int parkingLotId;
	
	@Column(name="floors")
	private int noOfFloors;
	
	@Column(name="totalspots")
	private int totalSpots;
	
	@Column(name="busyspots")
	private int occupiedSpots;
	
	public int getParkingLotId() {
		return parkingLotId;
	}
	public void setParkingLotId(int parkingLotId) {
		this.parkingLotId = parkingLotId;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public int getTotalSpots() {
		return totalSpots;
	}
	public void setTotalSpots(int totalSpots) {
		this.totalSpots = totalSpots;
	}
	public int getOccupiedSpots() {
		return occupiedSpots;
	}
	public void setOccupiedSpots(int occupiedSpots) {
		this.occupiedSpots = occupiedSpots;
	}
	public Admin(int parkingLotId, int noOfFloors, int totalSpots, int occupiedSpots) {
		super();
		this.parkingLotId = parkingLotId;
		this.noOfFloors = noOfFloors;
		this.totalSpots = totalSpots;
		this.occupiedSpots = occupiedSpots;
	}
	public Admin() {
 	}
	
	
}
