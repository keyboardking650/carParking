package com.carParking.model;

public class customer {

	private String customerName;
	private int customerId;
	private String username;
	private String password;
	private long phoneNo;
	private int tokenNo;
	private int totalSpots;
	private String vehicleNo;;
	private String liscenceNo;
	private char vehicleType;
	public customer(String customerName, int customerId, String username, String password, long phoneNo, int tokenNo,
			int totalSpots, String vehicleNo, String liscenceNo, char vehicleType) {
		super();
		this.customerName = customerName;
		this.customerId = customerId;
		this.username = username;
		this.password = password;
		this.phoneNo = phoneNo;
		this.tokenNo = tokenNo;
		this.totalSpots = totalSpots;
		this.vehicleNo = vehicleNo;
		this.liscenceNo = liscenceNo;
		this.vehicleType = vehicleType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(int tokenNo) {
		this.tokenNo = tokenNo;
	}
	public int getTotalSpots() {
		return totalSpots;
	}
	public void setTotalSpots(int totalSpots) {
		this.totalSpots = totalSpots;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getLiscenceNo() {
		return liscenceNo;
	}
	public void setLiscenceNo(String liscenceNo) {
		this.liscenceNo = liscenceNo;
	}
	public char getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(char vehicleType) {
		this.vehicleType = vehicleType;
	}
	 
	
	
}
