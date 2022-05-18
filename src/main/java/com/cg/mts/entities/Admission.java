package com.cg.mts.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="adm")
public class Admission {
	@Id
	@GeneratedValue
	int admissionId;
	int courseId;
	//@OneToOne
	//@JoinColumn(name="course_id",referencedColumnName="id")
	//Course course;
	int applicationId;
	LocalDate admissionDate;
	//AdmissionStatus status;
	//@Enumerated(EnumType.STRING)
	public Admission() {
		
	}
	public int getAdmissionId() {
		return admissionId;
	}
	@Override
	public String toString() {
		return "Admission [admissionId=" + admissionId + ", courseId=" + courseId + ", applicationId=" + applicationId
				+ ", admissionDate=" + admissionDate + "]";
	}
	public Admission(int admissionId, int courseId, int applicationId, LocalDate admissionDate) {
		super();
		this.admissionId = admissionId;
		this.courseId = courseId;
		this.applicationId = applicationId;
		this.admissionDate = admissionDate;
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
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	
	//public AdmissionStatus status() {return status;}
	
}
