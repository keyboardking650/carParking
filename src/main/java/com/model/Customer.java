package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@Column(name="vno")
	private int vehicleNo;
	
	@Column(name="intime")
	private String inTime;
	
	@Column(name="outtime")
	private String outTime;
	
	@Column(name="wheelar")
	private char vehicleType;
	
	@Column(name="name")
	private String customerName;
	
	@Column(name="phone")
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
	public Customer(int vehicleNo, String inTime, String outTime, char vehicleType, String customerName,
			long customerPhone) {
		super();
		this.vehicleNo = vehicleNo;
		this.inTime = inTime;
		this.outTime = outTime;
		this.vehicleType = vehicleType;
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
}
