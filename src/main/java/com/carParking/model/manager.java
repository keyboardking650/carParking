package com.carParking.model;

public class manager {

	
	private String managerName;
	private int managerId;
	private String username;
	private String password;
	private int portNo;
	private int totalSpots;
	private int securityId;
	public manager(String managerName, int managerId, String username, String password, int portNo, int totalSpots,
			int securityId) {
		super();
		this.managerName = managerName;
		this.managerId = managerId;
		this.username = username;
		this.password = password;
		this.portNo = portNo;
		this.totalSpots = totalSpots;
		this.securityId = securityId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
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
	public int getPortNo() {
		return portNo;
	}
	public void setPortNo(int portNo) {
		this.portNo = portNo;
	}
	public int getTotalSpots() {
		return totalSpots;
	}
	public void setTotalSpots(int totalSpots) {
		this.totalSpots = totalSpots;
	}
	public int getSecurityId() {
		return securityId;
	}
	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}
	
	
}
