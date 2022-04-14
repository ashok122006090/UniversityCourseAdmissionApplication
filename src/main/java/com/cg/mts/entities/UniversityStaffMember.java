package com.cg.mts.entities;

public class UniversityStaffMember {
	int staffid;
	String pass;
	String role;
	public int getStaffid() {
		return staffid;
	}
	public void setStaffid(int staffid) {
		this.staffid = staffid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public UniversityStaffMember(int staffid, String pass, String role) {
		super();
		this.staffid = staffid;
		this.pass = pass;
		this.role = role;
	}

}
