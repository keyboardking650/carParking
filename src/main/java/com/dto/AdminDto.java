package com.dto;

public class AdminDto {
	
	private int parkingLotId;
	private int noOfFloors;
	private int totalSpots;
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
	
	
}
