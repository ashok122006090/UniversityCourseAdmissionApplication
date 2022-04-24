package com.cg.mts.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Applicant
{
	@Id
	@GeneratedValue
	int applicantId;
	@NotBlank(message = "Name is mandatory")
	String applicantName;
	@Pattern(regexp="[6-9]{1}[0-9]{9}",message="mobile number must have 10 characters")
	String mobileNumber;
	String applicantDegree;
	int applicantGraduationPercent;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "admissionId",name="admissionId")
	Admission admission;
	@Column(name="status", nullable=false)
	
	AdmissionStatus status;
	@Enumerated(EnumType.STRING)
	public AdmissionStatus status() {return status;}
	public Applicant(int applicantId, String applicantName, String mobileNumber, String applicantDegree,
			int applicantGraduationPercent, Admission admission, AdmissionStatus status) {
		super();
		this.applicantId = applicantId;
		this.applicantName = applicantName;
		this.mobileNumber = mobileNumber;
		this.applicantDegree = applicantDegree;
		this.applicantGraduationPercent = applicantGraduationPercent;
		this.admission = admission;
		this.status = status;
	}
	public Applicant() {
		super();
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	public String getApplicantName() {
		return applicantName;
	}
	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getApplicantDegree() {
		return applicantDegree;
	}
	public void setApplicantDegree(String applicantDegree) {
		this.applicantDegree = applicantDegree;
	}
	public int getApplicantGraduationPercent() {
		return applicantGraduationPercent;
	}
	public void setApplicantGraduationPercent(int applicantGraduationPercent) {
		this.applicantGraduationPercent = applicantGraduationPercent;
	}
	public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	public AdmissionStatus getStatus() {
		return status;
	}
	public void setStatus(AdmissionStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", applicantName=" + applicantName + ", mobileNumber="
				+ mobileNumber + ", applicantDegree=" + applicantDegree + ", applicantGraduationPercent="
				+ applicantGraduationPercent + ", admission=" + admission + ", status=" + status + "]";
	}
	

	
}

	

	
	
	

