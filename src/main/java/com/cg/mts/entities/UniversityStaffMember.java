package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class UniversityStaffMember {
    @Id
	int staffid;
	@Pattern(regexp="[6-9]{1}[0-9]{9}",message="password must have 10 characters")
	String password;
	@NotBlank(message = "role should not be blank")
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
