package com.carParking.model;

public class security {

	private int securityId;
	private String securityName;
	private String inTime;
	private String outTime;
	private long tokenNo;
	private String username;
	private String password;
	private int managerId;
	private String vehicleNo;
	public int getSecurityId() {
		return securityId;
	}
	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}
	public String getSecurityName() {
		return securityName;
	}
	public void setSecurityName(String securityName) {
		this.securityName = securityName;
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
	public long getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(long tokenNo) {
		this.tokenNo = tokenNo;
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
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public security(int securityId, String securityName, String inTime, String outTime, long tokenNo, String username,
			String password, int managerId, String vehicleNo) {
		super();
		this.securityId = securityId;
		this.securityName = securityName;
		this.inTime = inTime;
		this.outTime = outTime;
		this.tokenNo = tokenNo;
		this.username = username;
		this.password = password;
		this.managerId = managerId;
		this.vehicleNo = vehicleNo;
	}
	
	
	
}
