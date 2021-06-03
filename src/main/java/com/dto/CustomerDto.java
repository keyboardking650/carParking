package com.dto;

public class CustomerDto {

 
	private int vehicleNo; 
	private String inTime; 
	private String outTime; 
	private char vehicleType; 
	private String customerName; 
	private long customerPhone;
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getOutTime() {
		return outTime;
	}
	public void setOutTime(String outTime) {
		this.outTime = outTime;
	}
	public char getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(char vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	
	
	
}
