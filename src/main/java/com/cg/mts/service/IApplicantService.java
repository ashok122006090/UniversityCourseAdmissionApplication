package com.cg.mts.service;

<<<<<<< HEAD

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
=======
import com.cg.mts.entities.Applicant;

public interface IApplicantService{
	Applicant addApplicant(Applicant add);
	//Applicant updateApplicant();
	//Applicant deleteApplicant();
	//Applicant viewApplicant();
	//Applicant viewAllApplicant();
	

}
>>>>>>> branch 'main' of https://github.com/ashok122006090/UniversityCourseAdmissionApplication.git
