package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdmissionCommiteeMember {
	@Id
	int adminId;
	String adminName;
	int adminContact;
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
	public int getAdminContact() {
		return adminContact;
	}
	public void setAdminContact(int adminContact) {
		this.adminContact = adminContact;
	}
	public AdmissionCommiteeMember(int adminId, String adminName, int adminContact) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminContact = adminContact;
	}

}
