package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class AdmissionCommiteeMember {
	@Id
	@GeneratedValue
	int adminId;
	@NotBlank(message="Name is mandatory")
	String adminName;
	@Pattern(regexp="[6-9]{1}[0-9]{9}",message ="contact number must have 10 digits")
	String adminContact;
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}
	public AdmissionCommiteeMember() {
		// TODO Auto-generated constructor stub
	}
	public AdmissionCommiteeMember(int adminId, String adminName, String adminContact) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
	}
	
	

}
