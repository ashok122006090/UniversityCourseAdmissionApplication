package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UniversityStaffMember {
	@Id
	int staffid;
	String password;
	String role;
	
	public UniversityStaffMember() {
		super();
	}
	public UniversityStaffMember(int staffid, String password, String role) {
		super();
		this.staffid = staffid;
		this.password = password;
		this.role = role;
	}
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UniversityStaffMember [staffid=" + staffid + ", password=" + password + ", role=" + role + "]";
	}
	
	
}