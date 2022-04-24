package com.cg.mts.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admissiontable")
public class Admission {
	@Id
	int admissionId;
	int courseId;
	int applicationId;
	String admissionDate;
	
	
	Admission(){
		
	}
	public Admission(int admissionId, int courseId, int applicationId, String admissionDate) {
		super();
		this.admissionId = admissionId;
		this.courseId = courseId;
		this.applicationId = applicationId;
		this.admissionDate = admissionDate;
	}
	public int getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	@Override
	public String toString() {
		return "Admission [admissionId=" + admissionId + ", courseId=" + courseId + ", applicationId=" + applicationId
				+ ", admissionDate=" + admissionDate + "]";
	}
	
	
	
	
	
	
}