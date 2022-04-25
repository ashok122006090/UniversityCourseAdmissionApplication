package com.cg.mts.service;


import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;
import com.cg.mts.exception.ApplicantNotFoundException;

public interface IApplicantService{
	Applicant addApplicant(Applicant a);
	Applicant updateApplicant(int id,Applicant ap);
	void deleteApplicant(int id);
	ResponseEntity<Applicant> viewApplicant(int id) throws ApplicantNotFoundException;
	List<Applicant> viewAllApplicant();
	
	public List<Applicant> viewAllApplicantsByStatus(AdmissionStatus status);

}


